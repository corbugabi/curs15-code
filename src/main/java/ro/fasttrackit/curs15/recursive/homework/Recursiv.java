package ro.fasttrackit.curs15.recursive.homework;

import java.util.ArrayList;
import java.util.List;

public class Recursiv {
    public int sum(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return sum(n - 1) + n;
        }
    }

    public String rev(String word){
        if (word ==null || "".equals(word)){
            return "";
        }else {
            return word.charAt(word.length() - 1) + rev(word.substring(0, word.length() - 1));
        }
    }
}

