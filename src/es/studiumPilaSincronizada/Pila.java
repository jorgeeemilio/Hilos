package es.studiumPilaSincronizada;

import java.util.ArrayList;

public class Pila
{
	private ArrayList<String> buffer = new ArrayList<String>();
	
	public synchronized String pop()
	{
		String c = "";
		while(buffer.size()==0)
		{
			try
			{
				this.wait();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		c = buffer.remove(buffer.size()-1);
		return c;
	}
	
	public synchronized void push(String c)
	{
		this.notify();
		buffer.add(c);
	}
}
