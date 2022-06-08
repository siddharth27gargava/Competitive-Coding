package Recursion;

public class CB_TowerOfHanoi {
    public static void main(String[] args) {
        towerofHanoi(2,"T1","T2","T3");
        System.out.println(countTowerOfHanoi(2,"t1","t2","t3"));
    }

    public static void towerofHanoi(int n, String from_rod, String to_rod, String help_rod){

        if (n == 0){
            return;
        }

        towerofHanoi(n-1,from_rod,help_rod,to_rod);
        System.out.println("Move "+ n +"th disc from "+ from_rod + " to "+ to_rod);
        towerofHanoi(n-1,help_rod,to_rod,from_rod);
    }

    public static int countTowerOfHanoi(int n,String from_rod, String to_rod, String help_rod){

        int count = 1;

        if (n==0){
            return 0;
        }

        count=count+ countTowerOfHanoi(n-1,from_rod,help_rod,to_rod);

        count=count+ countTowerOfHanoi(n-1,help_rod,to_rod,from_rod);

        return count;
    }
}
