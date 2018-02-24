package java_5_featues_Practice;

public class MyGenericClass<T> {

    private T object;

    public MyGenericClass(T object) {

        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }



}
