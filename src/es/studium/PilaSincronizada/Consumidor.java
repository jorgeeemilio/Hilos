package es.studium.PilaSincronizada;

import java.util.Random;

public class Consumidor extends Thread
{
	private Pila pila;
	private int num;
	private Random aleatorio = new Random();
	private static int contador = 1;
	
	public Consumidor(Pila p)
	{
		pila = p;
		num = contador++;
	}
	
	public void run()
	{
		String c;
		for(int i = 0; i < 10; i++)
		{
			c = pila.pop();
			System.out.println("Consumidor "+ num + " ha sacado la letra " + c);
			try
			{
				Thread.sleep(aleatorio.nextInt(300));
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}