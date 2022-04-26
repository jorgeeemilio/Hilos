package es.studium.Buscador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuscarPalabra extends Thread
{
	private String palabra;
	private int cant;

	public BuscarPalabra(String p) 
	{
		palabra = p;
	}

	public void run() 
	{
		File ruta = new File(".");
		String[] directorio = ruta.list();
		for (String archivo : directorio) 
		{
			if (contiene(archivo))
			{
				cant++;
			}
		}
		System.out.println("La palabra " + palabra + " se encuentra contenida en " + 
				cant + " archivos");
	}

	private boolean contiene(String archivo) 
	{
		boolean existe = false;
		String linea;
		synchronized(this)
		{
			try 
			{
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				while ((linea = br.readLine())!= null) 
				{
					if (linea.indexOf(palabra) != -1)
					{
						existe = true;
					}
				}
				br.close();
				fr.close();
			} 
			catch (IOException e) 
			{
				//System.out.println(e.toString());
			}
			return existe;
		}
	}
}
