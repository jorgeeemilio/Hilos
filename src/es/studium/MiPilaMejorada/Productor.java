package es.studium.MiPilaMejorada;

import java.util.Random;

public class Productor extends Thread
{
	Pila pila;
	char caracter;
	Random aleatorio = new Random();
	char[] abecedario;

	public Productor(Pila p)
	{
		pila = p;
		abecedario = createArray();
	}

	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			caracter = abecedario[aleatorio.nextInt(26)];
			System.out.println(i+":Metiendo datos en la pila..."+caracter);
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
	}

	public char[] createArray()
	{
		char[] s;
		s=new char[26];
		for ( int i=0; i<26; i++) 
		{
			s[i] = (char) ('A' + i );
		}
		return s;
	}
}