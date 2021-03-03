package main.app;
import com.squareup.javapoet.*;
import javax.lang.model.element.Modifier;

public class CodeGenerator {
    public static void main(String[] args) {
        ClassBuilder classBuilder = new ClassBuilder("testClass", 20);
        TypeSpec testClass = classBuilder.build();

        ClassExporter classExporter = new ClassExporter("com.test.testClass", testClass);
        classExporter.exportToStdout();
        classExporter.exportToFile();
    }
}