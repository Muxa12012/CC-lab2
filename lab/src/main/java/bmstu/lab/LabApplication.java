package bmstu.lab;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import bmstu.lab.Controllers.GrammarController;


@SpringBootApplication
public class LabApplication {

    public static void main(String[] args) {
        GrammarController.process("C:/Users/mseme/OneDrive/Документы/GitHub/CC-lab2/lab/src/main/resources/test.json");
    }

}
