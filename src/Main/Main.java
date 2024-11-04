/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import controler.CalculatorControler;
import model.CalculatorModel;
import view.CalculatorGUI;

/**
 *
 * @author ludo
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CalculatorGUI gui = new CalculatorGUI();
        CalculatorModel model = new CalculatorModel();
        CalculatorControler controler = new CalculatorControler(gui,model);
        
    }
    
}