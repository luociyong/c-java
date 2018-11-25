public class HisTime {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			double x = Math.sqrt(i + 100);
			double y = Math.sqrt(i + 268);
			if (x == (int) x && y == (int) y) {
				System.out.println("这个数是:" + i);
				continue;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime - startTime));
	}
}
