package es.studium.MiPilaMejorada;

public class Pila
{
	final int TAM = 10;
	private int indice = 0;
	private char[] datos = new char[TAM];

	public Pila() {}

	public void push(char c)
	{
		synchronized(this)
		{
			datos[indice] = c;
			indice++;
		}
	}

	public char pop()
	{
		synchronized(this)
		{
			indice--;
			return datos[indice];
		}
	}

	public int elementosPila()
	{
		return indice;
	}
}
