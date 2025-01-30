package com.queue;

import java.util.Scanner;

//Circular Tour Problem
//Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
//Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.
public class CircularTourProblem {
    static int solution(int[] pet, int[] dis, int n){
        int start=0,current=0,total=0;
        for (int i =0 ;i<pet.length;i++){
            current+=pet[i]-dis[i];
            total+=pet[i]-dis[i];
            if(current<0){
                current=0;
                start=i+1;
            }
        }
        return total<0? -1:start;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dis[] = new int[n];
        int pet[] = new int[n];
        for(int i=0; i<n ;i++){
            dis[i]=scn.nextInt();
        }
        for(int i=0; i<n ;i++){
            pet[i]=scn.nextInt();
        }
        int ans = solution(pet,dis,n);
        System.out.println(ans);
        scn.close();
    }
}
