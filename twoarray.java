public class twoarray {
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{2,4,5}};
        for( int[] row : matrix){
            for(int ele:row){
                System.out.print(ele+" ");
            }
        }
    }
}
