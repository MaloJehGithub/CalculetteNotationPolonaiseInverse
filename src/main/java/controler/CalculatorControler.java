package controler;

import javafx.event.EventHandler;
import model.CalculatorModel;
import view.CalculatorGUI;
import java.util.EventListener;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorControler implements EventHandler<ActionEvent>, CalculatorControlerInterface
{
    public CalculatorGUI gui;
    public CalculatorModel model;
    
    public CalculatorControler(CalculatorGUI gui, CalculatorModel model)
    {
        this.gui=gui;
        this.model=model;
    }
    @Override
    public void handle(ActionEvent event) 
    {
        Object boutton = event.getSource();
        Button b = (Button) boutton;
        String texte = b.getText();
        String lu = gui.LireEcran();
    
        if(texte.equals("push"))
        {
            if (!lu.isEmpty()) 
            {
                model.push(Double.valueOf(lu));
        	actualiseMemoire();
                actualiseEcran();
            }
            else
            {
                gui.setEcran("Veuillez sélectionner un nombre avant de push");
            }
               
        }
        else if(texte.equals("+"))
        {
        	model.add();
        	actualiseMemoire();
                actualiseEcran();
        }
        else if(texte.equals("-"))
        {
            model.substract();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("x"))
        {
            model.multiply();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("/"))
        {
            model.divide();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("swap"))
        {
            model.swap();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("C"))
        {
            model.clear();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("-x"))
        {
            model.opposite();
            actualiseMemoire();
            actualiseEcran();
        }
        else if(texte.equals("drop"))
        {
            model.drop();
            actualiseMemoire();
            actualiseEcran();
        }

        
        // Si l'utilisateur vient de faire une erreur 
        else if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            gui.setEcran(texte); 
            actualiseAccu();
        }
         else if("Veuillez sélectionner un nombre avant de push".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            gui.setEcran(texte); 
            actualiseAccu();
        }
         else if("La pile est vide".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            gui.setEcran(texte); 
            actualiseAccu();
        }
          else if("Veuillez sélectionner un nombre pour en obtenir l'opposé".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            gui.setEcran(texte); 
            actualiseAccu();
        }
          else if("Division par zéro impossible".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            gui.setEcran(texte); 
            actualiseAccu();
        }
        else
        {
            // Ajout du chiffre a l'écran
            gui.setEcran(lu+texte);
            actualiseAccu();
            actualiseEcran();

        }
        
    }
    
    @Override
    public void actualiseEcran()
    {
        gui.setEcran(model.accu);
    }
    
    @Override
    public void actualiseAccu()
    {
    	model.accu = gui.LireEcran();
    }
    
    @Override
     public void actualiseMemoire()
    {
        gui.setMemoire(model.pile);
    }
  


}