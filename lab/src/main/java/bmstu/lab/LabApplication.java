package bmstu.lab;

import bmstu.lab.Controllers.GrammarController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
public class LabApplication {

    public static void main(String[] args) {
        GrammarController.process("C:/CC/CC-lab2/lab/src/main/resources/test.json");
    }

}
