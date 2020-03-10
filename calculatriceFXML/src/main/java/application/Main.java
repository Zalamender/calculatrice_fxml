package application;

import controleur.Controleur;
import javafx.application.Application;
import javafx.stage.Stage;
import modele.CalculatriceDynamiqueDuFutur;
import modele.CalculatriceDynamiqueDuFuturImpl;


public class Main extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception{
            CalculatriceDynamiqueDuFutur calculatriceDynamiqueDuFutur = new CalculatriceDynamiqueDuFuturImpl();
            Controleur monControleur = new Controleur(primaryStage,calculatriceDynamiqueDuFutur);
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

