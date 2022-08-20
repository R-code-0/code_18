public class Person {
    private AbstractDom abstractDom;

    public AbstractDom living(){
        return abstractDom;
    }
    public Person(AbstractDom abstractDom) {
        this.abstractDom = abstractDom;
    }

    public AbstractDom getDom() {
        return abstractDom;
    }

    public void setDom(AbstractDom abstractDom) {
        this.abstractDom = abstractDom;
    }

    public String pay() {
        return getDom().pay();
    }
}
