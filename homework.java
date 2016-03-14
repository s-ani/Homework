package proj;

public class homework {


		public static void main(String[] args) {
			bitCounter(999);
		}
		
		private static int bitCounterImpl(int positiveNumber, int bits)
		{
			if(positiveNumber > 1)
		    {
				positiveNumber /= 2;
			    return bitCounterImpl(positiveNumber, ++bits);
			}
			else
			{
				return bits;
			}
		}

		public static void bitCounter(int positiveNumber) 
		{
			if (positiveNumber <= 0) 
			{
				System.out.println("Sorry, this method counts bits only for positive numbers.");
			} 
			else
			{
				int bits = 1;
				bits = bitCounterImpl(positiveNumber, bits);
				System.out.println("The smallest amount of bits required to hold the number is: " + bits);
			}
		}
	}
