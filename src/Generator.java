import java.util.List;
import java.util.Random;

public class Generator {

    private Number[] numbers = new Number[6];
    private Combination[] combinations = {new MoscowHappy("Московское счастье"),
                                            new PeterHappy("Питерское счастье"),
                                                new SomethingHappy("Какое-то да счастье"),
                                                        new AlsoHappy("Тоже счастье")};
    private Combination tempCombination;

    public void settingRandomNumbers(){

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i] = new Number();
                numbers[i].setValue(0 + new Random().nextInt(9 - 0 + 1));
                numbers[i].setPosition(i);
            }
        }
    }

    public void getWinCombination(){

        List<Combination> list = new Checker().getWinCombination(numbers, combinations);

        for (Combination item :
                list) {
            tempCombination = item;
        }
    }

    public Number[] getNumbers() {
        return numbers;
    }

    public Combination getCombinationItem(){
        return tempCombination;
    }





}
