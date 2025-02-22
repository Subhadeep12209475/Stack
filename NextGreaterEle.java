import java.util.*;
public class NextGraterEle{
    public static void main(String args[]){
        int arr[]={ 2,1,3,4,2};
        int temp[]=new int[arr.length];
        int k=0;
        // for(int i=0;i<arr.length;i++){
        //     int curr=arr[i];
        // boolean flag=false;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>curr){
        //             flag=true;
        //             temp[k]=arr[j];
        //             k++;
        //             break;
        //         }
        //     }

        //     if(flag==false){
        //         temp[k]=-1;
        //         k++;
        //     }
        // }

        // for(int i=0;i<temp.length;i++){
        //     System.out.println(temp[i]);
        // }

        // for(int i=0 ;i<arr.length;i++){
        //     int curr=arr[i];
        //     boolean flag= false;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<curr){
        //             flag=true;
        //             temp[k]=arr[j];
        //             k++;
        //             break;
        //         }
        //     }
        //     if(flag==false){
        //         temp[k]=-1;
        //         k++;
        //     }
        // }
        // for(int i=0;i<temp.length;i++){
        //      System.out.println(temp[i]);
        // }
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            boolean flag= false;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<curr){
                    flag=true;
                    temp[k]=arr[j];
                    k++;
                    break;
                }
            }
            if(flag==false){
                temp[k]=-1;
                k++;
            }
        }
        for(int i=temp.length-1;i>=0;i--){
             System.out.println(temp[i]);
        }
    }
}



