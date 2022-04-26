package es.studiumPilaSincronizada;

import java.util.Random;

public class Productor extends Thread
{
	private Pila pila;
	private int num;
	private Random aleatorio = new Random();
	private static int contador = 1;
	
	public Productor(Pila p)
	{
		pila = p;
		num = contador++;
	}
	
	public void run()
	{
		String c;
		for(int i = 0; i < 10; i++)
		{
			c = ((char)(aleatorio.nextInt(26)+'A')+"");
			pila.push(c);
			System.out.println("Productor "+num+" generó la letra "+c);
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
