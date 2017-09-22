class GooiDobbelsteen
{
  public static void main (String args[])
  {
	int worp = gooiDobbelsteen();
	System.out.println("De dobbelsteen werpt een " + worp + ".");
  }
    static int gooiDobbelsteen() {
	return(int)(Math.random()*6+1);
	}
}