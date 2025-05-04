public class ArrayResizer {
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int i = 0; i<array2D[r].length; i++) {
            if (array2D[r][i]==0) return false;
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int count = 0;
        for (int i=0; i<array2D.length;i++) {
            if (isNonZeroRow(array2D, i)) count++;
        }
        return count;
    }

    public static int[][] resize(int[][] array2D) {
        int index = 0;
        int[][] arr = new int[numNonZeroRows(array2D)][array2D[0].length];
        for (int r = 0; r<array2D.length;r++) {
            if (isNonZeroRow(array2D, r)) {
                for (int c = 0; c<array2D[r].length;c++) {
                    arr[index][c] = array2D[r][c];
                }
                index++;
            }
        }
        return arr;
    }
}