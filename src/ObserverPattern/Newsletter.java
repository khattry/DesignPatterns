package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Newsletter stellt eine Implementierung des Interface IBeobachtbar
 */

public class Newsletter implements IBeobachtbar
{
	private String nachricht;
	private List<IBeobachter> abonnenten;

	public Newsletter()
	{
		abonnenten = new ArrayList<IBeobachter>();
	}

	public void anmelden(IBeobachter beobachter)
	{
		abonnenten.add(beobachter);
	}
	public void abmelden(IBeobachter beobachter)
	{
		abonnenten.remove(beobachter);
	}
	/**
	 * 
	 * @param neueNachricht
	 */
	public void aendereNachricht(String neueNachricht)
	{
		this.nachricht = neueNachricht;
		benachrichtigen();
	}
	private void benachrichtigen()
	{
		for (IBeobachter beobachter : abonnenten)
		{
			beobachter.aktualisieren(this);
		}
	}

	public String gibZustand()
	{
		// TODO Auto-generated method stub
		return this.nachricht;
	}
}