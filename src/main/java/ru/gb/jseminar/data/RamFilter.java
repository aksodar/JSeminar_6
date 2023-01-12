package ru.gb.jseminar.data;

public class RamFilter implements Filter {
    public int ram;

    public RamFilter(int ram) {
        this.ram = ram;
    }

    @Override
    public boolean Check(Notebook notebook) {
        return notebook.ram >= this.ram;
    }
}
