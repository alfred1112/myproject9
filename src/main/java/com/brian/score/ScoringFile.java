package com.brian.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class ScoringFile {
    public static void main(String[] args) {
        try{
            FileReader fileReader =new FileReader("scores.txt");//throws
        }catch(FileNotFoundException e){
            System.out.println("檔案讀取失敗");
        }
        System.out.println("Testing");
    }
}
