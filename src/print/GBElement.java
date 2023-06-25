package print;

public class GBElement<T> {
    T element;

    public GBElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void printElement(){
        System.out.println(getElement());
    }
}
