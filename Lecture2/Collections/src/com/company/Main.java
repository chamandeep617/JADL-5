package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1,2,3,5)));
        arr.add(new ArrayList<>(Arrays.asList(7,12,13,23)));
        arr.add(new ArrayList<>(Arrays.asList(19,8,10,25)));
        arr.add(new ArrayList<>(Arrays.asList(20,15,21,24)));
        arr.add(new ArrayList<>(Arrays.asList(9,4,22,26)));

        for(int i = 0 ; i < arr.size() ; i++){
            for(int j = 0 ; j < arr.get(0).size() ; j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

        Collections.sort(arr, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if(o1.get(1)>o2.get(1)){
                    return 1;
                }else if(o1.get(1)<o2.get(1)){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        for(ArrayList<Integer> i : arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/


//        ============================================================================================>

//        HASHMAP

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"chaman");
        map.put(2,"chamanV2");

        System.out.println(map.entrySet());

        map.remove(1);
        System.out.println(map);


// =================================================================>
//        LinkedList
        Stack<Integer> st = new Stack<>();
        st.


    }
}
