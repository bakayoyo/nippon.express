public class ArtikelApp {
		
	public static void main(String args[]) {
	Artikel a1 = new Artikel (args[0], Float.parseFloat(args[1]));
	Artikel a2 = new Artikel (args[2], Float.parseFloat(args[3]));
	if (a1.equals(a2)) {
    System.out.println("Ze zijn hetzelfde.");
	} else {
	System.out.println("Ze zijn verschillend.");
	}
}
}


class Artikel
{
 public String naam;
 public float prijs;

  public Artikel (String n, float p) {
	 naam = n;
	 prijs = p;
 }

 public boolean equals(Object obj) {
  if(obj!= null && obj instanceof Artikel){
     Artikel a = (Artikel)obj;
     if(naam.equals(a.naam) && prijs==a.prijs){
       return true;
     }
  }
  return false;
}
}