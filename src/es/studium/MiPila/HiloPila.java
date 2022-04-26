package es.studium.MiPila;

import java.util.Random;

public class HiloPila extends Thread
{
	Pila pila;
	char caracter;
	Random aleatorio = new Random();
	
	public HiloPila(Pila p, char c)
	{
		pila = p;
		caracter = c;
	}
	
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Metiendo datos en la pila..."+caracter);
			pila.push(caracter);
			try
			{
				sleep(aleatorio.nextInt(10)*1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Despertando prematuramente...");
			}
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Sacando datos en la pila...");
			System.out.println(pila.pop());
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
