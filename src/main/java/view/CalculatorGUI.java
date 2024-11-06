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
        
        // Esthétisme des boutons
        B0.setPrefWidth(180); // Largeur de 180 pixels
        B0.setPrefHeight(100); // Hauteur de 100 pixels
        B1.setPrefWidth(180); 
        B1.setPrefHeight(100); 
        B2.setPrefWidth(180); 
        B2.setPrefHeight(100);
        B3.setPrefWidth(180); 
        B3.setPrefHeight(100);
        B4.setPrefWidth(180); 
        B4.setPrefHeight(100); 
        B5.setPrefWidth(180);
        B5.setPrefHeight(100);
        B6.setPrefWidth(180);
        B6.setPrefHeight(100); 
        B7.setPrefWidth(180); 
        B7.setPrefHeight(100); 
        B8.setPrefWidth(180);
        B8.setPrefHeight(100); 
        B9.setPrefWidth(180); 
        B9.setPrefHeight(100); 
        Bpoint.setPrefWidth(180); 
        Bpoint.setPrefHeight(100); 
        Bentrée.setPrefWidth(180); 
        Bentrée.setPrefHeight(100); 
        Baddition.setPrefWidth(180); 
        Baddition.setPrefHeight(100);
        Bsoustraction.setPrefWidth(180); 
        Bsoustraction.setPrefHeight(100); 
        Bmultiplication.setPrefWidth(180); 
        Bmultiplication.setPrefHeight(100); 
        Bdivision.setPrefWidth(180);
        Bdivision.setPrefHeight(100); 
        Bopposite.setPrefWidth(180); 
        Bopposite.setPrefHeight(100);
        Bclear.setPrefWidth(180); 
        Bclear.setPrefHeight(100); 
        Bdrop.setPrefWidth(180); 
        Bdrop.setPrefHeight(100); 
        Bswap.setPrefWidth(180); 
        Bswap.setPrefHeight(100);

    CalculatorModel model = new CalculatorModel();       
    CalculatorControler controler = new CalculatorControler(this, model);

        B0.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B1.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B2.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B3.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B4.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B5.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B6.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B7.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B8.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        B9.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bpoint.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bentrée.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Baddition.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bsoustraction.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bmultiplication.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bdivision.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bopposite.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bclear.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bswap.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bdrop.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e));
        Bpop.addEventHandler(ActionEvent.ACTION, e -> controler.handle(e)); 

        
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
    
  