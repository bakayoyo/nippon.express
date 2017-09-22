class KubusBerekeningMethod
{
  public static void main (String args[])
  {
    int lengte = 10, breedte = 20, hoogte = 30;
	int inhoud = berekenKubus(lengte, breedte, hoogte);
	System.out.println("De inhoud van de kubus is " + inhoud + " vierkante cm.");
  }
    static int berekenKubus(int lengte, int breedte, int hoogte) {
	return(lengte * breedte * hoogte);
	}
}