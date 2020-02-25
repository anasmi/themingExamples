package org.vaadin.anastasia.random;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassGenerator {


    public static void generateClass(String routeName, String className){

        Path file= Paths.get("src/main/java/org/vaadin/anastasia/views",className + ".java");
        List<String> lines=new ArrayList<>();
        lines.add("package org.vaadin.anastasia.views;");
        lines.add("import com.vaadin.flow.component.orderedlayout.VerticalLayout;\n" + "import com.vaadin.flow.router.Route;");
        lines.add(String.format("@Route(\"%s\")",routeName));
        lines.add(String.format("public class %s extends VerticalLayout{",className));
        lines.add(String.format("    public %s (){",className));
        lines.add("\n" + "    }\n" + "}");

        System.out.println("Absolute root: "  + file.getRoot());

        try {
            Files.write(file,lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
