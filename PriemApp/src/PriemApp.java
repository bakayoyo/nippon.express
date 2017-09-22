class PriemApp
{
   public static void main (String[] args)
   {		
     String priemGetallen = "";
	 
     for (int i = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]); i++)  	   
      {  
	 if (isPriem(i)) priemGetallen = priemGetallen + i + " ";
	  }		
      System.out.println("Priemgetallen van:" + args[0] + " tot " + args[1] + " zijn :");
      System.out.println(priemGetallen);
   }
   
   static boolean isPriem(int getal) 
    {
		//System.out.println(" is prime " + getal);
	   if (getal == 1) {;
		   return false;}
	   if (getal == 2 ) {
		   return true;}
		    if (getal > 2 && getal %2 ==0) {;
		   return false;}
	   if (getal > 2) { 		 		  
         for(int i = 3; i<= Math.sqrt(getal); i+=2) {
	         if(getal%i==0) return false;
	         }	   
   }
   return true;
	}
}