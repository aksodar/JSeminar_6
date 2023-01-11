package ru.gb.jseminar.data;

public class Notebook {
    Integer id;
    public Integer ram;
    public Integer ssd;
    public String os;
    public String clr;

    public Notebook(){
        id = null;
        ram = null;
        ssd = null;
        os = null;
        clr = null;
    }

    public Notebook(Integer newid, Integer newram, Integer newssd, String newos, String newclr){
        id = newid;
        ram = newram;
        ssd = newssd;
        os = newos;
        clr = newclr;
    }
    public String toString(){
        String str;
        System.out.println("=================================================================================================================");
        str = "№" + id +" " + "оперативная память(RAM) - " + ram + ", " + "жесткий диск(SSD) - " + ssd + ", " + "операционная система(OS) - " + os + ", " + "цвет(clr) - " + clr;
        return str;
    }
}



