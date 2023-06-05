package com.company;

import java.util.ArrayList;

public class A2Pascal {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> out=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ArrayList<Long> temp=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    temp.add(((long)1));
                }
                else{
                    temp.add(out.get(i-2).get(j)+out.get(i-2).get(j-1));
                }
            }
            out.add(temp);
        }
        return out;
    }
}
