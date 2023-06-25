package print;

import java.util.Arrays;

public class GBArray<T> {
    private final Object[] arr;
    public final int len;

    public GBArray(int len) {
        arr = new Object[len];
        this.len = len;
    }

    public T getArr(int i) {
        final T t = (T) arr[i];
        return t;
    }

    public void setArr(int i, T t) {
        arr[i] = t;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
