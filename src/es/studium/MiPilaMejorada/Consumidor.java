package es.studium.MiPilaMejorada;

import java.util.Random;

public class Consumidor extends Thread
{
	Pila pila;
	char caracter;
	Random aleatorio = new Random();

	public Consumidor(Pila p)
	{
		pila = p;
	}

	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			if(pila.elementosPila()!=0)
			{
				System.out.println(i+":Sacando datos de la pila...."+pila.pop());
			}
			else
			{
				try
				{
					sleep(10000);
				}
				catch(InterruptedException ie)
				{
					System.out.println("Despertando prematuramente...");
				}
				i--;
			}
			try
			{
				sleep(aleatorio.nextInt(10)*1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Despertando prematuramente...");
			}

		}
	}
}