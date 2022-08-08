package CoreAndFuction;

public class Sum {

    static void find_all_triplets(int arr[], int n, int sum)
   {
     for (int i = 0; i < n-2; i++)
     {
     for (int j = i + 1; j < n-1; j++)
    {
    for (int k = j + 1; k < n; k++)
     {
     if (arr[i] + arr[j] + arr[k] == sum)
   {
    System.out.println(arr[i]+" " + arr[j] + " " + arr[k]);
  }
  }
  }
  }
  }

     public static void main (String[] args)
     {
     int arr[] = {1,2,3,4,5,6,7,3,0,-3};
     int n = arr.length;
     find_all_triplets(arr, n, -2);
  }
}


