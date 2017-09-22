class AdresApp {
	public static void main(String args[]) {
	Adres2 Obj = new Adres2("Straat",99,"1919AA","Utrecht");
	System.out.println(Obj.toString());
}
	}


class Adres2 {

private String straatnaam;
private int huisnummer;
private String postcode;
private String plaats;

public Adres2 () {
}

Adres2 (String s, int h, String po, String pl) {
	this.straatnaam = s;
	this.huisnummer = h;
	this.postcode = po;
	this.plaats = pl;
}	

private Adres2 (String s, int h, String pl) {
	this (s, h , "", pl);
}	

private Adres2 (String po, int h) {
	this ("", h , po, "");
}	

public void setStraat (String s) {
	this.straatnaam = s;
}	

public void setNummer (int h) {
	this.huisnummer = h;
}

public void setPostcode (String po) {
	this.postcode = po;
}

public void setPlaats (String pl) {
	this.plaats = pl;
}

public String toString (String pl) {
	return 	(straatnaam  + huisnummer + postcode + plaats);
}

}
