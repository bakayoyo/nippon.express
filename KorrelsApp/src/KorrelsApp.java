import java.util.Arrays;

public class KorrelsApp {

  public static void main(String strings[])
  {
	double[][] chessBoard = new double [8][8];

	double counter = 1;
	String row = "";
	for (int y=0; y<8; y++)
{
	row = "|";
  	for (int x=0; x<8; x++)
{
	chessBoard [x][y] = counter;
	row = row + Double.toString(counter) + "|";
	counter = 2 * counter;
}
    System.out.println(row);
}
  }
}