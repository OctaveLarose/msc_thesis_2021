import os
from time import sleep
from typing import Dict

from graphviz import Digraph

from data_interpretation.calltraces.constants import OUTPUT_TREES_DIR


def export_tree(project_name: str, input_lines: [Dict], only_render=False):
    dot = Digraph(comment='Callgraph for ' + project_name, format='png', strict=True)

    node_names = set()
    for i in input_lines:
        method_name = i["class"] + "-" + i["method"]
        if method_name not in node_names:
            node_names.add(method_name)
            dot.node(method_name)

    prev_arg = input_lines[0]
    for line in input_lines[1:]:
        method_name = line["class"] + "-" + line["method"]
        prev_method_name = prev_arg["class"] + "-" + prev_arg["method"]
        if line["method_access"] == "entry":
            dot.edge(prev_method_name, method_name, constraint='false')
        elif line["method_access"] == "exit":
            dot.edge(method_name, prev_method_name, constraint='false')
        prev_arg = line

    if not only_render:
        dot.render(os.path.join(OUTPUT_TREES_DIR, project_name), cleanup=True)
    else:
        dot.render('/tmp/tmp_graph', view=True, cleanup=True)
