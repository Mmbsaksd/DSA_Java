class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},   
            {5, 6, 7, 8},   
            {9, 10, 11, 12} 
        };
        spiral(matrix);
    }
    public static void spiral(int arr[][]){
        int sc = 0;
        int sr = 0;
        int ec = arr[0].length-1;
        int er = arr.length-1;
        while(sc<=ec&& sr<=er){
            for(int j=sc;j<=ec;j++){
                System.out.print(arr[sr][j]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                System.out.print(arr[i][ec]+" ");
            }
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.print(arr[er][j]+" ");
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(arr[i][sc]+" ");
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
    }
}
