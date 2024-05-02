

public class LoopStats{

  
	private int start, stop;

	public void setNums(int beg, int end)
	{

        start = beg;
        stop = end;

	}

	public int getEvenCount()
	{
		int evenCount=0;
        for (int i = start; i<=stop; i++){
            if (i%2==0){
                evenCount++;
            }
        }


		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
        for (int i = start; i<=stop; i++){
            if (i%2!=0){
                oddCount++;
            }
        }   

		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
        for (int i = start; i<=stop; i++){
            total +=i;
        }


		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}

	public void execAll()
	{
		System.out.println("There are " + getEvenCount() + " even numbers");
		System.out.println("There are " + getOddCount() + " odd numbers");
		System.out.println("There is total is " + getTotal());
	}
}
