package java_5_featues_Practice;

public class GenericClassWithMultipleParameters<T, U> {

    private T t;
    private U u;

    public GenericClassWithMultipleParameters(T t, U u) {
        super();
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }



}
