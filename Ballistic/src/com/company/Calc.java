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

    /** Вираховує значення формули
     * @param Speed - швидкість польоту
     * @param Angle - кут польоту
     * @param G - константа(коефіцієнт вільного польоту)
     * */
    private double calc(double Speed, double Angle, double G){
        return Speed * Speed * Math.sin(2 * Angle)/G;
    }

    /**Вираховує значення формули
     * та зберігає рехультат в об'єкт {@linkplain Calc#result}
     * @param Speed - швидкість польоту
     * @param Angle - кут польоту
     * @param G - константа(коефіцієнт вільного польоту)
     * */
    //TODO result and return
    public double init(double Speed, double Angle, double G){
        result.setSpeed(Speed);
        result.setAngle(Angle);
        result.setG(G);
        return
    }

    /**Виведення результату обчислення */
    public void show(){
        System.out.print(result);
    }

    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }
    /** Восстанавливает {@linkplain Calc#result} из файла {@linkplain Calc#FNAME}
     * @throws Exception
     */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item)is.readObject();
        is.close();
    }

}
