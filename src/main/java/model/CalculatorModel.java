package model;

import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface {
	
	public String accu = "";
	public Stack<Double> pile= new Stack<>(); 
	
	@Override
	public void add() {
		if (pile.size()>1)// Il faut 2 élements pour une opération
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
		if (pile.size()>1)// Il faut 2 élements pour une opération
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
		if(pile.size()>1)// Il faut 2 élements pour une opération
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
		if (pile.size()>1) // Il faut 2 élements pour une opération
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
		if (!pile.empty())
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
	public void drop() 
        {
            if (!pile.empty())
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
		if (pile.size()>1) { // Il faut 2 élements pour une opération
                    Double e1 = pile.pop();
                    Double e2 = pile.pop();
			
                    pile.add(e1);
                    pile.add(e2);
		}
                else
		{
                    accu = "Veuillez choisir les deux opérandes avant de choisir l'opération";
		}
		}
   

	@Override
	public void clear() {
		accu = "";
        while (!pile.isEmpty()) { // Vide la pile en entier
            pile.pop();
            }
        }
		
	}


