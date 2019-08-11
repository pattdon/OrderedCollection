/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patta
 */
public class Comparables {
    private int[] arr;
    public void MadeArray(int size){
        arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
    }
    public void MadeEmpty(){
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
    }
    public boolean isEmpty(){
        boolean key = true;
        if(arr.length <= 0){
            key = true;
        } 
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                key = false;   
            }
        }
        System.out.println(key);
        return key;
    }
    public void insert(int index,int value){
        for(int i = arr.length-1;i >= index;i--){
           
           arr[i] = arr[i-1];
        }
        arr[index] = value;
    }
    public void insert(int value){
        for(int u = 0;u < arr.length;u++){
            if(arr[u] == 0 ){
                arr[u] = value;
                break;
            }
        }
    }
    public int findMax(){
        int max = arr[0];
        for(int i =0;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max:"+max);
        return max;
    }
        public int findMin(){
        int min = arr[0];
        for(int i =0;i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("min:"+min);
        return min;
    }
        public void remove(int index){
           arr[index] = 0;
           for(int i = index;i < arr.length - index-1;i++){
               arr[i] = arr[i+1];
           }
           arr[arr.length - 1] = 0;
        }
        public void output(){
            for(int i = 0;i < arr.length; i++){
                System.out.println(arr[i]);
            }
        }
}





















