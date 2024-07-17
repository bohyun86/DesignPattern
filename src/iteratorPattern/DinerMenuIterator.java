package iteratorPattern;


import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException
                ("메뉴 항목은 지우면 안 됩니다.");
    }
}
