class Main {
    public static void main(String[] args) {
        sumDig(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

    }
    public static void sumDig(int arr[][]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        if(arr.length%2==1){
            sum-=arr[arr.length/2][arr.length/2];
        }
        System.out.print(sum);
    }
}

class Main {
    public static void main(String[] args) {
        sumDig(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

    }
    public static void sumDig(int arr[][]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            sum+=arr[arr.length-1-i][i];
        }
        if(arr.length%2==1){
            sum-=arr[arr.length/2][arr.length/2];
        }
        System.out.print(sum);
    }
}
