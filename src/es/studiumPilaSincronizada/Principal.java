package es.studiumPilaSincronizada;

public class Principal
{
	public static void main(String[] args)
	{
		Pila pila = new Pila();
		Productor productor1 = new Productor(pila);
		Productor productor2 = new Productor(pila);
		Consumidor consumidor1 = new Consumidor(pila);
		Consumidor consumidor2 = new Consumidor(pila);
		productor1.start();
		productor2.start();
		consumidor1.start();
		consumidor2.start();
	}

}
