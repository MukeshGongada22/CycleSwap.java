package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length==0){
            return ;
        }
        else {
            int temp = array[1];
            int temp1 = 0;
            array[1] = array[0];
            array[0] = temp;
            for (int i = 2; i < array.length; i++) {
                temp1 = array[i];
                array[i] = array[0];
                array[0] = temp1;
            }
            return;
        }

    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length==shift || array.length==0){
            return ;
        }


        else{
            int j;
            for(int i=0;i<shift;i++){
                int temp=array[array.length-1];
                for(j=array.length-1;j>0;j--){
                    array[j]=array[j-1];
                }
                array[j]=temp;
            }
        }

    }
}
