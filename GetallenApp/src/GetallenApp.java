import java.util.Arrays;

public class GetallenApp {

  public static void main(String strings[])
  {
	int[] array = Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
    Arrays.sort(array);
    for(int nummer: array)
    {
      System.out.println(nummer);
    }
  }
}