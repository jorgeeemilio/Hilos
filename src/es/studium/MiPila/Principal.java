package es.studium.MiPila;

public class Principal
{
	public static void main(String[] args)
	{
		Pila pila = new Pila();
		HiloPila hilo1 = new HiloPila(pila, 'a');
		HiloPila hilo2 = new HiloPila(pila, 'z');
		hilo1.start();
		hilo2.start();
	}
}