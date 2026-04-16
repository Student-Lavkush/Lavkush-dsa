import java.util.*;

public class BankersAlgorithm {

    static int P = 5; // processes
    static int R = 3; // resources

    public static void main(String[] args) {

        int[][] allocation = {
            {0,1,0},
            {2,0,0},
            {3,0,2},
            {2,1,1},
            {0,0,2}
        };

        int[][] max = {
            {7,5,3},
            {3,2,2},
            {9,0,2},
            {2,2,2},
            {4,3,3}
        };

        int[] available = {3,3,2};

        int[][] need = new int[P][R];

        // calculate need
        for(int i = 0; i < P; i++){
            for(int j = 0; j < R; j++){
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }

        boolean[] finished = new boolean[P];
        int[] safeSeq = new int[P];
        int count = 0;

        while(count < P){
            boolean found = false;

            for(int i = 0; i < P; i++){
                if(!finished[i]){
                    int j;
                    for(j = 0; j < R; j++){
                        if(need[i][j] > available[j]){
                            break;
                        }
                    }

                    if(j == R){
                        for(int k = 0; k < R; k++){
                            available[k] += allocation[i][k];
                        }

                        safeSeq[count++] = i;
                        finished[i] = true;
                        found = true;
                    }
                }
            }

            if(!found){
                System.out.println("System is NOT in safe state");
                return;
            }
        }

        System.out.println("System is in SAFE state");
        System.out.print("Safe Sequence: ");

        for(int i = 0; i < P; i++){
            System.out.print("P" + safeSeq[i] + " ");
        }
    }
}