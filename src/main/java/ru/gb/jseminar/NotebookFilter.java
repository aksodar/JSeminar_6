package ru.gb.jseminar;

public class NotebookFilter {
    String enternm1;
    String entersyst1;
    Integer entermem1;
    String enterclr1;
    Float entersizescr1;
    Integer enterpr1;
    NotebookFilter(String enternm, String entersyst, Integer entermem, String enterclr, Float entersizescr, Integer enterpr){
       enternm1 = enternm;
       entersyst1 = entersyst;
       entermem1= entermem;
       enterclr1 = enterclr;
       entersizescr1 = entersizescr;
       enterpr1 = enterpr;
    }

    @Override
    public String toString() {
        String str;
        str = "###############################\n" + enternm1 + "\n" + entersyst1 + "\n" + entermem1 + "\n" + enterclr1 + "\n" + entersizescr1.toString() + "\n" + enterpr1 + "\n";
        return str;
    }
}


