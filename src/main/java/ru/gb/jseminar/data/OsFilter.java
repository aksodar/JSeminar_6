package ru.gb.jseminar.data;

public class OsFilter implements Filter{
    public String os;

    public OsFilter(String os) {
        this.os = os;
    }

    @Override
    public boolean Check(Notebook notebook) {
        return notebook.os.equals(this.os);
    }
}