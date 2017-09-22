class FaculteitApp{  
 public static void main(String args[]){  
  int faculteit=1;  
  int nummer=Integer.parseInt(args[0]);   
  for(int i=1;i<=nummer;i++){    
      faculteit=faculteit*i;    
  }    
  System.out.println("De faculteit van "+nummer+" is: "+faculteit);    
 }  
}  