package com.hackbulgaria.corejava;

public class FaultyProblem2 {

    public int getNearestPowerOf2(int x) {
        int i = 1;
        do {
            x /= 2;
            i++;
        } while (x != 1);

        return (int) Math.pow(2, i - 1);
    }
    
    
    

}
