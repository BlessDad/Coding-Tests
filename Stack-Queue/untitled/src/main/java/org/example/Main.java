package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int size = 1;

        int[] progresses = new int[3];
        progresses[0] = 93;
        progresses[1] = 30;
        progresses[2] = 55;


        int[] speeds = new int[3];
        speeds[0] = 1;
        speeds[1] = 30;
        speeds[2] = 5;

        // 7, 3, 9

        // 5, 10, 1, 1, 20, 1

        int[] work = new int[3];
        for (int i=0; i<3; i++){
            if ((100 - progresses[i]) % speeds[i] != 0) {
                work[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
            else work[i] = (100 - progresses[i]) / speeds[i];
        }


        Stack<Integer> stack = new Stack<Integer>();

        for (int i=0; i<work.length -1; i++){
            // 0, 1, 2
            if (work[i] < work[i+1]) stack.push(size);
            else if (work[i] > work[i+1]){
                int p = work[i];
                while(p > work[i+1]){
                    size++;
                    i++;
                }
                stack.push(size);
                size=1;
            }
            else if (i == work.length-1) stack.push(size);
        }

        System.out.println(stack.pop());
        System.out.println(stack.pop());




    }
}