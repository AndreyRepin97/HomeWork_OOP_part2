package ru.skypro;

abstract class Technique{

    private String modelName;
    private int wheelsCount;



    public Technique(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    abstract void check();

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
