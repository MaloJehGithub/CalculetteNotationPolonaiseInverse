package view;

import java.util.List;

import controler.CalculatorControler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import model.CalculatorModel;

public class CalculatorGUI extends Application implements CalculatorGUIInterface
{
    public TextField ecran = new TextField();
    public Label memoire = new Label();
    
    public Button B0 = new Button("0");
    public Button B1 = new Button("1");
    public Button B2 = new Button("2");
    public Button B3 = new Button("3");
    public Button B4 = new Button("4");
    public Button B5 = new Button("5");
    public Button B6 = new Button("6");
    public Button B7 = new Button("7");
    public Button B8 = new Button("8");
    public Button B9 = new Button("9");
    public Button Baddition = new Button("+");
    public Button Bsoustraction = new Button("-");
    public Button Bmultiplication = new Button("x");
    public Button Bdivision = new Button("/");
    public Button Bentrée = new Button("push");
    public Button Bpoint = new Button(".");
    public Button Bopposite = new Button("-x");
    public Button Bclear = new Button("C");
    public Button Bswap = new Button("swap");
    public Button Bdrop = new Button("drop");
    public Button Bpop = new Button("pop");
    
    @Override
    public void start(Stage stage)
    {
        // Nom de la fenêtre
        stage.setTitle("Calculette");
            
        //Disposition des éléments sous forme d'une grille
        GridPane gp = new GridPane();
        
        // Réglage esthétique
        gp.setHgap(10);
        gp.setVgap(10);
        
        
        // Place prise par l'écran de la calculatrice
        GridPane.setColumnSpan(ecran, 2); // S'étend sur 2 colonnes
        
        // Règlage esthétique
        ecran.setPrefWidth(180); // Largeur de 180 pixels
        ecran.setPrefHeight(100); // Hauteur de 100 pixels
        
        // Ajout et positionnement de l'écran
        gp.add(ecran,1,1);
        
        
        // Place prise par la mémoire de la calculatrice
        GridPane.setColumnSpan(memoire, 2); // S'étend sur 2 colonnes
        
        // Ajout et positionnement de la mémoire
        gp.add(memoire, 3, 1);
 
        // Ajout et positionnement des bouttons sur ma calculatrice
        gp.add(B0,1,2);
        gp.add(B1,2,2);
        gp.add(B2,3,2);
        gp.add(B3,4,2);
        gp.add(B4,1,3);
        gp.add(B5,2,3);
        gp.add(B6,3,3);
        gp.add(B7,4,3);
        gp.add(B8,1,4);
        gp.add(B9,2,4);
        gp.add(Baddition,1,5);
        gp.add(Bsoustraction,2,5);
        gp.add(Bmultiplication,3,5);
        gp.add(Bdivision,4,5);
        gp.add(Bentrée,3,4);
        gp.add(Bpoint,4,4);
        gp.add(Bopposite,1,6);
        gp.add(Bclear,2,6);
        gp.add(Bdrop,3,6);
        gp.add(Bswap,4,6);
        
        CalculatorModel model = new CalculatorModel();       
        CalculatorControler controler = new CalculatorControler(this, model);
        
        //Gestion de la réaction aux clics et de l'ésthétisme des boutons.
        List<Button> buttons = List.of(B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, Bpoint, Bentrée, Baddition, Bsoustraction, Bmultiplication, Bdivision, Bopposite, Bclear, Bswap, Bdrop, Bpop);
        for (Button button : buttons) {
            button.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
            button.setPrefWidth(180); // Largeur de 180 pixels
            button.setPrefHeight(100); // Hauteur de 100 pixels
        }
        
        
        // Création la scène comprenant la grille
        Scene sc = new Scene(gp, 770, 570);

      
        // Ajout de la scène à la fenêtre
        stage.setScene(sc);
        
        
        // Affichage
        stage.show(); 

    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }

	/**
	 * @return 
	 */
	public String LireEcran() {
		return this.ecran.getText();
	}


	/**
	 * @param ecran the ecran to set
	 */
	public void setEcran(String string) {
		this.ecran.setText(string);
	}

	/**
	 * @return the memoire
	 */
	public Label getMemoire() {
		return memoire;
	}
        
	/**
	 * @param memoire the memoire to set
	 */
	public void setMemoire(List<Double> stackData) {
		this.memoire.setText(String.valueOf(stackData));

	}
}
    
  