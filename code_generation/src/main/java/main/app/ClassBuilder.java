package main.app;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.util.Random;

public class ClassBuilder {
    TypeSpec.Builder outputClass;

    ClassBuilder(String name, int methodsNbr) {
        this.outputClass = TypeSpec.classBuilder(name)
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL);

        for (int i = 0; i < methodsNbr; i++)
            outputClass.addMethod(this.generateMethod(generateRandomName(i + 5)));
    }

    public TypeSpec build() {
        return outputClass.build();
    }

    private String generateRandomName(int nbrCharacters) {
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(nbrCharacters);
        for (int i = 0; i < nbrCharacters; i++) {
            int randomLimitedInt = 'a' + (int) (random.nextFloat() * ('z' - 'a' + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }

    private MethodSpec generateMethod(String name) {
        MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder(name)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(void.class)
                .addParameter(String[].class, "args")
                .addStatement("$T.out.println($S)", System.class, "Hello world!");

        return methodBuilder.build();
    }
}
