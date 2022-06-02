
package ru.skypro;

public class Bicycle extends Technique {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}


