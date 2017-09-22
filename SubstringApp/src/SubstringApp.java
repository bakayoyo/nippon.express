class SubstringApp 
{ 
  public static void main(String args[]) 
  { 
	System.out.println(args[0].substring(Integer.parseInt(args[1]) - 1, (Integer.parseInt(args[1]) + Integer.parseInt(args[2]) - 1)));
  } 
}