package fundamental;

import java.util.Scanner;

public class averageMarks {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        sc.close();

        //Average Marks
        int avg = (m1+m2+m3)/3;

        //Output
        System.out.println(avg);
    }
}
