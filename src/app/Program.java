package app;

import controller.ConsoleController;
import model.SuspectModel;
import view.ConsoleView;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class Program {

    public static void main(String[] args) {
        /*
        
        Anna: Béla volt.
        Béla: Csaba volt.
        Csaba: Nem Béla volt.
        Dávid: Nem csaba volt.
        
        Ki a tettes? 3 állítás igaz, egy hazugság.
        
        */
        
        SuspectModel model = new SuspectModel();
        ConsoleView view = new ConsoleView();
        new ConsoleController(model, view);
    }
}
