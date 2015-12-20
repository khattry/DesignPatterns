package ObserverPattern;

/**
 * Die Klasse Abonnent stellt eine Implementierung des Interface IBeobachter dar:
 */

public class Abonnent implements IBeobachter
{
	private String name;

	public Abonnent(String name)
	{
		this.name = name;
	}

	public void aktualisieren(IBeobachtbar beobachtbar)
	{
		System.out.println("Neue Nachricht fuer " + name +" : "+beobachtbar.gibZustand());
	}
	public String getName()
	{
		return this.name;
	}
}