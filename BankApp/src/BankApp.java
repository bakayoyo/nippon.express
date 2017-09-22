class BankApp
{ 
 public static void main(String args[]) 
{ 
  BankRekening b1 = new BankRekening(); 
  b1.stort(150);
  b1.stort(-80);
  b1.stort(-100);
  System.out.println("Bankrekening : " + b1.getRekeningnummer());
  System.out.println("Saldo : " + b1.getSaldo());
} 
}

class BankRekening
{
  final String rekeningnummer;
  double saldo;
  
  BankRekening () {
	  rekeningnummer = "ING123";
	  saldo = 0;
  }
  
  public String getRekeningnummer () {
	  return rekeningnummer;
  }
  
  public double getSaldo () {
	  return saldo;
  }
  
  public void stort (double storting) {
	  saldo = saldo + storting;
  }
  
}
