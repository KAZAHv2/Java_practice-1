package com.company;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Calc {

    /** Ім'я файлу використовується при серреалізації */
    private static final String FNAME = "Item.bin";

    /** Зберігає результат обрахунків. Об'єкт класу {@linkplain Item} */
    private Item result;

    /** Ініціалізує {@linkplain Calc#result} */
    public Calc(){
        result = new Item();
    }

    /**Встановлює значення {@linkplain Calc#result}
     * @param result - нове значення посилання на об'єкт {@linkplain Item}
     */
    public void setResult(Item result){
        this.result = result;
    }

    /** Отримати значення {@linkplain Calc#result}
     * @return поточне значення посилання на об'єкт {@linkplain Item}
     */
    public Item getResult(){
        return result;
    }

    /** Стала коефіцієнту вільного падіння */


    /** Вираховує значення формули
     * @param Speed - швидкість польоту
     * @param Angle - кут польоту
     * */
    private double calc(double Speed, double Angle){

        return Speed * Speed * Math.sin(2 * Angle)/G;

    }


}
