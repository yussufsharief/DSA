package com.inteveivew;

public class PrintSquareStart {
    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        int number = 18;
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // Iterate over each row
        for (int row = 1; row <= number; row++) {
            // Iterate over each column
            for (int column = 1; column <= number; column++) {
                // if either row or column equals 1, assign true to isFirstRowOrColumn.
                boolean isFirstRowOrColumn = row == 1 || column == 1;
                // if either row or column equals number, assign true to isLastRowOrColumn.
                boolean isLastRowOrColumn = row == number || column == number;
                // if either row equals column, or column equals number minus row plus 1, assign true to isFirstRowOrColumn.
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}
