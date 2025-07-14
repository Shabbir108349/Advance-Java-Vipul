public class Box2<T extends Number & printable>{
    private T val;

    public T getVal() {
        return val;
    }

    public void display(){
        val.print();
    }

    public void setVal(T val) {
        this.val = val;
    }
}
