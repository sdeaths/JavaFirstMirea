package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeueGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> firstPlayer = new ArrayDeque<>();
        Deque<Integer> secondPlayer = new ArrayDeque<>();
        System.out.println("Введите карты первого игрока: ");
        int input;
        for(int i=0;i<5;i++){
            input = in.nextInt();
            firstPlayer.offer(input);
        }
        System.out.println("Введите карты второго игрока: ");
        for(int i=0;i<5;i++){
            input = in.nextInt();
            secondPlayer.offer(input);
        }
        int cnt =0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if(firstPlayer.peek()==0){
                firstPlayer.offer(secondPlayer.poll());
                firstPlayer.offer(firstPlayer.poll());
            }
            else if(secondPlayer.peek()==0){
                secondPlayer.offer(secondPlayer.poll());
                secondPlayer.offer(firstPlayer.poll());
            }
            else if (firstPlayer.peek()>secondPlayer.peek()){
                firstPlayer.offer(secondPlayer.poll());
                firstPlayer.offer(firstPlayer.poll());
            }
            else {
                secondPlayer.offer(secondPlayer.poll());
                secondPlayer.offer(firstPlayer.poll());
            }
            cnt++;
            if(cnt>=106) break;
        }
        if(cnt>=106) System.out.println("botva");
        else if(secondPlayer.isEmpty()) System.out.println("first " + cnt);
        else System.out.println("second " + cnt);
    }
}
