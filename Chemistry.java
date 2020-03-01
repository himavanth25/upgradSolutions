package com.upgrad;

import java.util.Scanner;

public class Chemistry {
    public static void main(String args[]) {
        String[] elements = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
                "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
                "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
                "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W",
                "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np",
                "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg",
                "Cn", "Uut", "Uuq", "Uup", "Uuh", "Uus", "Uuo"};

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = myScanner.next();
        String chemWord = spellWord(inputWord, elements);

        System.out.println(chemWord);

        myScanner.close();

    }

    public static String spellWord(String word, String[] elements) {
        String fullWord = "";
        String wordSubString = "";
        int length = word.length();
        // write your code here to spell word with element abbreviations
        for (int i = 0; i < word.length(); i++) {

            if (i+3<=length && findElement(word.substring(i, i + 3),elements)!=null) {
                fullWord += findElement(word.substring(i, i + 3),elements);
                i = i+2;
            }
            else if (i+2 <=length && findElement(word.substring(i, i + 2),elements)!=null){
                fullWord += findElement(word.substring(i, i + 2),elements);
                i = i+1;
            }
            else if (i+1<=length && findElement(word.substring(i, i + 1),elements)!=null){
                fullWord += findElement(word.substring(i, i + 1),elements);
                }
            else{
                fullWord = null;
                break;
            }
        }
        if(fullWord == null)
            return "cannot spell word";
        else return fullWord.toString();
    }

    // feel free to write additional helper functions below
    public static String findElement(String key, String[] word) {
        for (String s : word) {
            if (s.equalsIgnoreCase(key)) return s;
        }
            return null;
        }
    }