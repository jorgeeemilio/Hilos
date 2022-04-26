package es.studium.MiPila;

public class Pila
{
	final int TAM = 10;
	int indice = 0;
	char[] datos = new char[TAM];
	
	public Pila()
	{
		
	}
	
	public void push(char c)
	{
		datos[indice] = c;
		indice++;
	}
	
	public char pop()
	{
		indice--;
		return datos[indice];
	}
}
