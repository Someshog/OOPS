import java.util.Scanner;
public class arrays{
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5};   // 1D ARRAY
        // int arr2[][]= new int[3][3];  //2D ARRAY
        int arr2[][]= new int[3][3];
        Scanner input = new Scanner(System.in);
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                arr2[i][j] = input.nextInt();
            }
        }
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.printf("%d\t",arr2[i][j]);
            }
            System.out.println("");
        }
        


    }
}
