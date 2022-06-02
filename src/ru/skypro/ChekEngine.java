package ru.skypro;


public interface ChekEngine {
    default void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

}
