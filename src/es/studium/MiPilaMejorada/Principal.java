package es.studium.MiPilaMejorada;

public class Principal
{
	public static void main(String[] args)
	{
		Pila pila = new Pila();
		Productor productor = new Productor(pila);
		Consumidor consumidor = new Consumidor(pila);
		productor.start();
		consumidor.start();
	}
}