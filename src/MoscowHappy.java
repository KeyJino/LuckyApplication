public class MoscowHappy extends Combination{
    MoscowHappy(String title) {
        super(title);
    }

    @Override
    public boolean isWin(Number[] numbers){
        if (numbers[0].getValue() + numbers[1].getValue() + numbers[2].getValue() ==
                numbers[3].getValue() + numbers[4].getValue() + numbers[5].getValue()) {
            return true;
        } else {
            return false;
        }

    }
}
