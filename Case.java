package animalrescuediderot;

public class Case {
    private int value;

    public Case(int v){
        this.value = v;
    }

    public Case(){
        this.value = Rand.getRandInt(1,100);
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
