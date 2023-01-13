package comp;

class Notebook {
    Integer id;
    Integer ram;
    Integer hdd;
    String os;
    String clr;

    Notebook(){
        id = null;
        ram = null;
        hdd = null;
        os = null;
        clr = null;
    }
    Notebook(Integer newid, Integer newram, Integer newhdd, String newos, String newclr){
        id = newid;
        ram = newram;
        hdd = newhdd;
        os = newos;
        clr = newclr;
    }

    @Override
    public String toString(){
        String str;
        System.out.println("===================================================================================================");
        str = "№ п/п" + id +" " + "оперативная память - " + ram + ", " + "жесткий диск - " + hdd + ", " 
        + "операционная система - " + os + ", " + "цвет - " + clr;
        return str;
    }
}

