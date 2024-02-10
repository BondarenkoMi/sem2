package feb10;

public class ArrayList implements List {
    private Integer[] list = new Integer[0];

    @Override
    public void add(Integer e) throws EmptyElementException {
        if (e == null) throw new EmptyElementException();
        if (this.size() == 0) {
            Integer[] newList = new Integer[1];
            newList[0] = e;
            list = newList;
        } else {
            Integer[] newList = new Integer[size() + 1];
            System.arraycopy(list,0,newList,0,size());
            newList[size()] = e;
            list = newList;
        }
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= size()) throw new IndexOutOfBoundsException();
        else {
            Integer[] newList = new Integer[size() - 1];
            Integer[] temp = new Integer[size()];
            for (int i = 0; i < index; i++) {
                newList[i] = list[i];
            }
            for (int i = index + 1; i < size(); i++) {
                newList[i - 1] = list[i];
            }
            list = newList;
        }
    }

    @Override
    public Integer pop() {
        Integer s = list[size() - 1];
        Integer[] newList = new Integer[size() - 1];
        System.arraycopy(list,0,newList,0,size() - 1);
        list = newList;
        return s;
    }

    @Override
    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index >= size()) throw new IndexOutOfBoundsException();
        return list[index];
    }

    @Override
    public int size() {
        int count = 0;
        for (Integer e : list) {
            if (e != null) {
                count++;
            }
        }
        return count;
    }
    public void print() {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
