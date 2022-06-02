
package ru.skypro;



public class ServiceStation {
    public void check(Technique technique) {
        System.out.println("Обслуживаем " + technique.getModelName());
        technique.check(technique);

    }
}
