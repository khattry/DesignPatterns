package ObserverPattern;

public interface IBeobachtbar
{
	public void anmelden(IBeobachter beobachter);

	public void abmelden(IBeobachter beobachter);

	public String gibZustand();
}
