class Artikel2
{
 String naam;
 float prijs;
 public Artikel2 (String n, float p) {
	 naam = n;
	 prijs = p;
 }

 public boolean equals(Object obj) {
  if(obj!= null && obj instanceof Artikel){
     Artikel a = (Artikel)obj;
     if(naam==a.naam && prijs==a.prijs){
       return true;
     }
  }
  return false;
}
public static void main(String args[]) {
	Artikel2 a1 = new Artikel2 ("tv",1000F);
	Artikel2 a2 = new Artikel2 ("tv",1000F);
	if (a1.equals(a2)) {
    System.out.println("Ze zijn hetzelfde.");
	} else {
	System.out.println("Ze zijn verschillend.");
	}
}
}