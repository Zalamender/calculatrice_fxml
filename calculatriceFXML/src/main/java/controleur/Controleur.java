package controleur;

import javafx.stage.Stage;
import modele.CalculatriceDynamiqueDuFutur;
import vues.Calculatrice;
import vues.Principal;

public class Controleur {

    private Principal principal;
    private Calculatrice calculatrice;
    private CalculatriceDynamiqueDuFutur facade;


    public Controleur(Stage primaryStage,
                      CalculatriceDynamiqueDuFutur calculatriceDynamiqueDuFutur) {
        facade = calculatriceDynamiqueDuFutur;
        principal = Principal.creerInstance(this, primaryStage);
        principal.show();
    }

    public void goToCalculatrice() {
        calculatrice = Calculatrice.creerInstance(this,new Stage());
        calculatrice.show();
    }
}
