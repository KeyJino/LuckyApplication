public class SomethingHappy extends Combination{

    SomethingHappy(String title) {
        super(title);
    }

    @Override
    public boolean isWin(Number[] numbers){
        if((numbers[0].getValue() + numbers[1].getValue())  == (numbers[2].getValue() + numbers[3].getValue()) &&
                (numbers[2].getValue() + numbers[3].getValue())  == (numbers[4].getValue() + numbers[5].getValue())                ){
            return true;
        } else {
            return false;
        }
    }

    private int sumNumbers(Number[] numbers){
        int sumNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNumbers += numbers[i].getValue();
        }

        return sumNumbers;
    }
}
