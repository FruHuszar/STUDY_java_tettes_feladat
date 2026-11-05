package view;

import model.SuspectModel;
import java.util.Scanner;

/**
 *
 * @author huszar.fruzsina
 */
public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public void write(String message) {
        System.out.println(message);
    }

    public SuspectModel.Names guessing() {
        write("Jelöld meg a bűnözőt (ANNA, BÉLA, CSABA, DÁVID): ");
        while (true) {
            String answer = scanner.nextLine().trim().toUpperCase();
            try {
                return SuspectModel.Names.valueOf(answer);
            } catch (IllegalArgumentException e) {
                write("Hibás input! Kérlek az alábbiak közül válassz: ANNA, BÉLA, CSABA, DÁVID");
            }
        }
    }
}