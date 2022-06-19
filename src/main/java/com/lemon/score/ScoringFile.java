package com.lemon.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
        public static void main(String[] args){
            try {
                FileReader fileReader = new FileReader ("scores.txt");
                int data = fileReader.read();
                while(data != -1){
                    System.out.println((char)data);
                    data = fileReader.read();
                }
            } catch(FileNotFoundException ex) {
                System.out.println("讀取檔案失敗");
            }catch (IOException e ){
                System.out.println("資料讀取失敗");
        }
            System.out.println("Continuing");
    }
}
