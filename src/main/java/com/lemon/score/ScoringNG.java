package com.lemon.score;

public class ScoringNG {
    public static void main(String[] args) {
        //5 students each english and math
        int[]english = {70,80,88,45,23};
        int[]math= {80,90,100,99,48};
        String[]name ={"Larry","Cindy","Jason","Lemon","Flower"};
        for (int i = 0; i < 5; i++) {
            if(i!=1){
                System.out.println(name[i]+"\t"+english[i]+"\t"+math[i]+"\t"+(english[i]+math[i])/2);
            }
        }
    }
}
