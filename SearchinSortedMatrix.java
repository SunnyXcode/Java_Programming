package matrix;

public class SearchinSortedMatrix {

    public void Search(int[][] arr,int n,int key){
        int i=0;
        int j=n-1;

        while(i<n && j>=0){
            if(arr[i][j]==key){
                System.out.println("Key Found at index "+"{"+i+" "+j+"}");
                return;
            }
            if(arr[i][j]>key){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Key Not found");
    }

    public void printMatrix(int arr[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

    SearchinSortedMatrix matrix=new SearchinSortedMatrix();

    int arr[][]=new int[3][3];
    arr[0][0]=1;
    arr[0][1]=2;
    arr[0][2]=3;
    arr[1][0]=8;
    arr[1][1]=9;
    arr[1][2]=11;
    arr[2][0]=12;
    arr[2][1]=56;
    arr[2][2]=63;

    matrix.printMatrix(arr, 3);

    matrix.Search(arr, 3, 63);


    }
    
}
