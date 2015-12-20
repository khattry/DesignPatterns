package ObserverPattern;

/**
 * Die Klasse TestBeobachter zeigt die Funktionalität eines Newsletter:
 * 
 * @author khattry
 * 
 */
public class TestBeobachter
{
	public static void main(String[] args)
	{
		Newsletter newsletter = new Newsletter();
		
		Abonnent abo1 = new Abonnent("Andreas");
		Abonnent abo2 = new Abonnent("Birgit");
		
		newsletter.anmelden(abo1);
		newsletter.anmelden(abo2);
		System.out.println(abo1.getName()+" ist angemeldet");
		System.out.println(abo2.getName()+" ist angemeldet");
		newsletter.aendereNachricht("Neuigkeit 1");
		
		newsletter.abmelden(abo1);
		System.out.println(abo1.getName()+" ist abgemeldet");
		newsletter.aendereNachricht("Neuigkeit 2");
//
		newsletter.abmelden(abo2);
		System.out.println(abo2.getName()+" ist abgemeldet");
		newsletter.aendereNachricht("Neuigkeit 3");
	}
}