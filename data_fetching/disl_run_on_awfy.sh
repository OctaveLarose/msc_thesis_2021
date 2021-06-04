#!/bin/bash

BENCHMARKS_DIR="$HOME/msc_thesis_shenanigans/github_repos/are-we-fast-yet/benchmarks/Java/src"

BENCHMARK_NAMES=(`pushd $BENCHMARKS_DIR > /dev/null ; ls *.java | sed 's/\.java$\|^Harness\|^Run\|^Benchmark\|Havlak//g' ; popd > /dev/null`)

NBR_ITER=1

for NAME in "${BENCHMARK_NAMES[@]}"
do
  echo $NAME
  ./bin/disl.py -d output -cse  -- ../../disl_metrics_fetcher/src-inst/build/libs/src-inst.jar -Xverify:none -classpath ../../github_repos/are-we-fast-yet/benchmarks/Java/benchmarks.jar Harness $NAME $NBR_ITER
  mv calltrace.txt calltrace_$NAME.txt
done
