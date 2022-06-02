package ru.skypro;

public class Technique{

    protected String modelName;
    protected int wheelsCount;

    public Technique(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void check(Technique technique){
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
