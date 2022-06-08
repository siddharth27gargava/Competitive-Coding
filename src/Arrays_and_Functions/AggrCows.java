package Arrays_and_Functions;

import java.util.Arrays;
import java.util.Scanner;

public class AggrCows {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int c = sc.nextInt();
        int a[] = new int[N];
        for(int i =0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println(cowDist(N,c,a));

    }

    public static int cowDist(int n, int c, int[] a) {
        int s=0; int e=a[n-1];
        int ans =0;
        while(s<=e) {
            int mid=(s+e)/2;
            if(isValid(a,n,c,mid)) {//you were passing ans as the fourth argument in isValid function
                ans = mid;
                s=mid+1;

            }else {
                e=mid-1;
            }

        }
        return ans;

    }

    public static boolean isValid(int[] a, int n, int c, int ans)  {
        int pos=a[0];
        int cow=1;
        for(int i =1;i<n;i++) {
            if(a[i]-pos>=ans) {
                pos=a[i];
                cow++;
                if(cow==c) {
                    return true;
                }
            }
        }
        return false;//if we reach here then it means that we are not able to place c no of cows
    }

}
