package water.android.io.iterator.example1;

public class ConcreteAggregate extends Aggregate {
    private Object[] objArrays = null;

    public ConcreteAggregate(Object[] objArrays) {
        this.objArrays = objArrays;
    }

    public Object getElement(int index) {
        if (index < objArrays.length) {
            return objArrays[index];
        }

        return null;
    }


    public int size() {
        return objArrays.length;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
