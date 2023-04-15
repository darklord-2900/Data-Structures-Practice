import java.util.Scanner;

public class sudokugamebacktracking {
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("enter the number of inputs to be made");
            int n=ab.nextInt();
            int[][] sudo=new int[9][9];
            for (int i = 0; i < n; i++) {
                System.out.println("enter the position number x & y :-");
                int x=ab.nextInt();
                int y=ab.nextInt();
                System.out.println("insert the number at "+x+" & "+y+" :-");
                sudo[x][y]=ab.nextInt();
            }
            for (int i = 0; i <9 ; i++)
            {
                for (int j = 0; j <9 ; j++) {
                System.out.print(sudo[i][j]+" ");
            }
            System.out.println();
        }
    }
}
}