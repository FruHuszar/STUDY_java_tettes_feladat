package controller;

import model.SuspectModel;
import view.ConsoleView;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class ConsoleController {
    private SuspectModel suspect;
    private ConsoleView view;

    public ConsoleController(SuspectModel suspect, ConsoleView view) {
        this.suspect = suspect;
        this.view = view;
        start();
    }

    private void start() {
        if(!suspect.checkSumTrue()){
            return;
        }
        
        view.write("Valaki ellopott egy értékes festményt a múzeumból.");
        view.write("4 gyanúsított van. Az egyikük hazudik, a másik három igazat mond.\n");
        view.write("- Anna: Béla volt!");
        view.write("- Béla: Csaba volt!");
        view.write("- Csaba: Nem Béla volt!");
        view.write("- Dávid: Nem Csaba volt!");
        view.write("Csak egy választásod van. Ki volt a tettes?\n");

        SuspectModel.Names guess = view.guessing();

        if (suspect.Check(guess)) {
            view.write("Gratulálok, elkaptad a tolvajt! " + suspect.getThief() + " második keresztneve Béla, Anna őrá gondolt.");
        } else {
            view.write("Elmenekült a tettes: " + suspect.getThief() + " most gazdag, a múzeum pedig üres.");
        }
    }
}