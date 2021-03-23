#include<iostream>

int getLargest(int arr[] , int n){
        
        for(int i=0 ;i<n; i++) {
            
            bool flag = true;

            for (int j = 0; i < n; j++)
            {
               if( arr[j] > arr[i]){

                    flag = false;
                    break;
               }
            }
            if(flag == true)
            return i ;
            
        }

        return 0;
}


int main(){
    int arr[] = {5,8,20,10};
    std::cout <<getLargest(arr,4);
    return 0;
}