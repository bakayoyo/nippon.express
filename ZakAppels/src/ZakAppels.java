class ZakAppels
{
  static final float EUROKOERS = 2.20371F;

  public static void main (String args[])
  {
    System.out.println("De zak appels kost: " + Math.round((2.25F / EUROKOERS) * 100.0)/100.0 + " Gulden");
  }

}