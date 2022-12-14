package ru.mirea.task21;

import java.util.ArrayList;

public class Metro {
    ArrayList<String> lines = new ArrayList<String>();
    Metro() {
        lines.add("Schelkovskaya");
        lines.add("Pervomayskaya");
        lines.add("Izmaylovskaya");
        lines.add("Partizanskaya");
        lines.add("Semenovskaya");
        lines.add("Elektrozavodskaya");
        lines.add("Baumanskaya");
        lines.add("Kurskaya");
        lines.add("Ploschad Revolutsii");
        lines.add("Arbatskaya");
        lines.add("Smolenskaya");
        lines.add("Kyevskaya");
        lines.add("Park Pobedu");
        lines.add("Mitino");
        lines.add("Strogino");
        lines.add("Krylatskoe");
    }
    public void PrintList(boolean state){
        for(int i = 0; i < lines.size(); i++){
            if(state){
                if(i % 2 == 0)
                    System.out.println("Station => " + lines.get(i));
            }
            else if(i % 2 == 1)
                System.out.println("Station => " + lines.get(i));
        }
    }
}
