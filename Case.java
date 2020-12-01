package animalrescuediderot;

public class Case {
    private int value;
    private HelloImage image;
    public Case(int v){
        this.value = v;

    }

    public Case(Grid grid){
        this.value = Rand.getRandInt(1,4);
        initImages(grid);
    }

    private void initImages(Grid grid) {
        switch(this.value) {
            case 1 -> this.image = new HelloImage(grid,"src/animalrescuediderot/assets/magenta.png");
            case 2 -> this.image = new HelloImage(grid,"src/animalrescuediderot/assets/vert.png");
            case 3 -> this.image = new HelloImage(grid,"src/animalrescuediderot/assets/bleu.png");
            case 4 -> this.image = new HelloImage(grid,"src/animalrescuediderot/assets/violet.png");
        }
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
