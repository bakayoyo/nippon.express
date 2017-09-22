class Reken
{
	static float rondAf (float invoer, short decimalen) {
	return (float) (Math.round((invoer * Math.pow(10,decimalen))) / Math.pow(10,decimalen));
	}
	
	public static void main (String args[]) {
		System.out.println(rondAf(4.5678F , (short)3));
	}
}