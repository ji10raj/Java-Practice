public class _08_Loop_through_2D_Array {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<3; i++ ) {
            for(int j=0; j<3; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
