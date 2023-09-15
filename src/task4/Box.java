package task4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fructs;

    public Box(ArrayList<T> fructs) {
        this.fructs = fructs;
    }

    public float getWeightBox(){
        if (fructs.size() == 0) return 0;
        else return fructs.size() * fructs.get(0).getWeight();
    }

    public boolean compare(Box box){
        return this.getWeightBox() == box.getWeightBox();
    }

    public void moveFruit(Box<T> toBox){
        toBox.fructs.addAll(this.fructs);
        this.fructs.clear();
    }

    public void addFruitsBox(T newFruit){
        fructs.add(newFruit);
    }
}
