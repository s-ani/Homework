package proj;

public class bits {
	static int clz( int x )
	{
	  if (x == 0)
	    return 32;
	 
	  int n;
	  for (n = 0; ((x & 0x80000000) == 0); ++n, x = x<<1)
	  {}
	 
	  return n;
	}
	 
	// returns the first 1
	static int ffs( int x )
	{
	    return 8 * 4 - clz(x);
	}
	 
	public static void main()
	{
		int a = ffs(100);
		System.out.print( "the first set is: " + a);
	}

}
