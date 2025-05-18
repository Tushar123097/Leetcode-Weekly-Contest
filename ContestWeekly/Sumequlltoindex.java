//package .vscode.ContestWeekly;

public class Sumequlltoindex {
    public static int findsumindexsmallest(int nums[]){
      //lets find the sum of digit of smallest index 
    int smallest = -1;
      for(int i = 0; i < nums.length; i++)
      {
          int num = nums[i];
          int sum = 0;
          while(num != 0)
          {
                sum = sum + num % 10;
                num = num / 10;
          }
          if(sum == i)
          {
              if(smallest == -1 || i < smallest)
              {
                    smallest = i;
              }
          }
      }
      return smallest;
    }
    public static void main(String args[]){
        int nums[] = {0, 10, 2, 45, 56};

        System.out.println("I am the samllest sum of digit : "+findsumindexsmallest(nums));

    }
    
}
