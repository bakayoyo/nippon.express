class VormenApp 
{ 
 public static void main(String args[]) 
{ 
  Rechthoek r = new Rechthoek(); 
  r.breedte=10; 
  r.hoogte=20; 
  System.out.println(r); 
} 
}

class Rechthoek {
 int breedte;
 int hoogte;

  public String toString(){ 
  return "Rechthoek breedte: "+breedte+", hoogte: "+hoogte+"."; 
} 
 
}