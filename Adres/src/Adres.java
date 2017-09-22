class Adres {

private String straatnaam;
private int huisnummer;
private String postcode;
private String plaats;

private Adres () {
}

private Adres (String s, int h, String po, String pl) {
	this.straatnaam = s;
	this.huisnummer = h;
	this.postcode = po;
	this.plaats = pl;
}	

private Adres (String s, int h, String pl) {
	this (s, h , "", pl);
}	

private Adres (String po, int h) {
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

public String toString () {
	return 	("<" + straatnaam + "> <"  + huisnummer + "> \n<" + postcode + "> <" + plaats + "> .");
}

	public static void main(String args[]) {
	Adres Obj = new Adres("1919AA", 99);
	System.out.println(Obj.toString());
	Obj.setStraat("Steenstraat");
	System.out.println(Obj.toString());
}

}