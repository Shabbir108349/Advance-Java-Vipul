
interface printable{
    void print();
}

class MyNumber extends Number implements printable{

    private final int value;
    public MyNumber(int value){
        this.value = value;
    }
    @Override
    public void print() {
        System.out.println("MyNumber: "+value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
public class Test {
    public static void main(String[] args) {
        MyNumber n = new MyNumber(12);
        Box2<MyNumber> b = new Box2<>();
        b.setVal(n);
        b.display();
    }
}
