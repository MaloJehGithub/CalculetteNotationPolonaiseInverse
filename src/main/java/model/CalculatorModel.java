/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	
	public String accu = "";
	public Stack<Double> pile= new Stack<>(); 
	
	@Override
	public void add() {
		if (pile.size()>1) // Une opération se fait à 2 elts
		{ 
			Double e1 = pile.pop();
			Double e2 = pile.pop();
			pile.add(e2+e1);
		}
		else 
		{
			accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
		}
	}
	@Override	
	public void substract() {
		if (pile.size()>1) // Une opération se fait à 2 elts
		{ 
		    Double e1 = pile.pop();
		    Double e2 = pile.pop();
		    pile.add(e2-e1);
		}
		else 
		{
			accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
		}
	}
	@Override
	public void multiply() {
		if(pile.size()>1) // Une opération se fait à 2 elts
		{
			Double e1 = pile.pop();
			Double e2 = pile.pop();
			pile.add(e1*e2);
		}
		else
		{
			accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
		}
	}
	
	@Override
	public void divide() 
	{
		if (pile.size()>1) // Une opération se fait à 2 elts
		{
		   Double e1 = pile.pop();
		   Double e2 = pile.pop();
		   if (e1 != 0) 
		   {
		      pile.add(e2/e1);
		   }
		   else
	       {
			   accu = "Division par zéro impossible";
		   }
		}
		else
		{
			accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
		}
	}

	@Override
	public void opposite() 
	{
		if (pile.size()>0)
		{
		   Double e1 = pile.pop();
		   pile.add(-e1);
		}
		else 
		{
			accu="Veuillez sélectionner un nombre pour en obtenir l'opposé";
		}	
	}

	@Override
	public void push(double nombre) 
	{
		pile.add(nombre);
                accu="";
	}

	@Override
	public void pop() 
        {
            if (pile.size()>0)
            {
		pile.pop();
            }
            else
            {
                accu="La pile est vide";
            }
            
		
	}

	@Override
	public void drop() 
        {
            if (pile.size()>0)
            {
		accu = "";
	        pile.pop();	
		
            }
            else
            {
                accu="La pile est vide";
            }	
		
	}

	@Override
	public void swap() {
		if (pile.size()>1) { // Une opération se fait à 2 elts
			Double e1 = pile.pop();
			Double e2 = pile.pop();
			
            Stack<Double> tempStack = new Stack<>(); // Utiliser une deuxième pile temporaire pour stocker les deux derniers éléments
            
	        tempStack.push(e1);  // Échanger l'ordre des éléments dans la pile temporaire
	        tempStack.push(e2);
 
	        while (!tempStack.isEmpty()) { // Réinsérer les éléments dans la pile d'origine
	        	pile.push(tempStack.pop());
	        	}
			}
		}
   

	@Override
	public void clear() {
		accu = "";
        while (!pile.isEmpty()) { // Vider la pile en entier
            pile.pop();
            }
        }
		
		
	
		
	}


