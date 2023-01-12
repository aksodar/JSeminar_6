package ru.gb.jseminar.data;

public class DiskCapacityFilter implements Filter{
    public int diskCapacity;

    public DiskCapacityFilter(int diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    @Override
    public boolean Check(Notebook notebook) {
        return notebook.diskCapacity >= this.diskCapacity;
    }
}
