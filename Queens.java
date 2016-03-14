package proj;

public class Queens {
	int[] x;

    public Queens(int N) 
    {
        x = new int[N];
    }

    public boolean isPlacedQueen(int r, int c) 
    {
        for (int i = 0; i < r; i++) 
        {
            if (x[i] == c || (i - r) == (x[i] - c) ||(i - r) == (c - x[i])) 
            {
                return false;
            }
        }
        return true;
    }

    public void printQueens(int[] x) 
    {
        int N = x.length;
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < N; j++) 
            {
                if (x[i] == j) 
                {
                    System.out.print(i + 1);
                } 
                else 
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void placeQueens(int r, int n) 
    {
        for (int c = 0; c < n; c++) 
        {
            if (isPlacedQueen(r, c)) 
            {
                x[r] = c;
                if (r == n - 1) 
                {
                    printQueens(x);
                }
                else 
                {
                    placeQueens(r + 1, n);
                }
            }
        }
    }

    public void callplaceQueens() 
    {
        placeQueens(0, x.length);
    }

    public static void main(String args[]) 
    {
        Queens Q = new Queens(8);
        Q.callplaceQueens();
     
    }
}
