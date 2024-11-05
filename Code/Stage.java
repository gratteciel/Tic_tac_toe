package Code;

import java.lang.reflect.Array;

public class Stage {
    public void start() {
        int[] currentrow = new int[3];
        int[] row1 = {1, 2, 3};
        int[] row2 = {4, 5, 6};
        int[] row3 = {7, 8, 9};
        System.out.println("Starting the stage!");
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                currentrow= row1;
            } else if (i == 1) {
                currentrow = row2;
            } else {
                currentrow = row3;
            }
            System.out.println("-------------------------");
            System.out.println("|       |       |       |");
            //building rows
            System.out.println("|   " + currentrow[0] + "   |   " + currentrow[1] + "   |   " + currentrow[2] + "   |");
            System.out.println("|       |       |       |");

        }
        System.out.println("-------------------------");
    }
}
