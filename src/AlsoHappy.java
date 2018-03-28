public class AlsoHappy extends Combination {
    AlsoHappy(String title) {
        super(title);
    }

    public boolean isWin(Number[] numbers){
        if(Math.sqrt(sumNumbers(numbers)) % 1 == 0){
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
