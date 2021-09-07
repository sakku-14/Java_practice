public class prime_num {
	public static void main(String args[]) {
		int i = 0;
		int tmp;

		while (i <= 100)
		{
			tmp = i - 1;
			while (tmp > 1)
			{
				if (i % tmp == 0)
					break;
				tmp--;
			}
			if (tmp == 1)
				System.out.print(i + " ");
			i++;
		}
	}
}
