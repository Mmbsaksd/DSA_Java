class Main {
    public static void main(String[] args) {
        int[][] metrics = {
            {3,  8,  14, 19, 25},
            {6, 10, 17, 23, 30},
            {9, 13, 21, 28, 35},
            {12,16, 24, 32, 40},
            {15,20, 27, 36, 45}
        };
        int key = 41;
        staircaseSearch(metrics,key);

    }
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = matrix.length-1, col=0;
        while(row>=0 && col<=matrix.length-1){
            if(key==matrix[row][col]){
                System.out.print("("+row+","+col+")");
                return true;
            }else if(key>matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.print("Not found");
        return false;
    }
}
