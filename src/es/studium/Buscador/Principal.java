package es.studium.Buscador;

public class Principal
{
	public static void main(String[] args)
	{
		BuscarPalabra buscador1 = new BuscarPalabra("rojo");
		BuscarPalabra buscador2 = new BuscarPalabra("verde");
		buscador1.start();
		buscador2.start();
	}
}