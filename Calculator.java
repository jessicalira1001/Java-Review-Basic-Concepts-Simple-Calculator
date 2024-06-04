public class Calculator {

    public float sum( int number1, int number2){
        return number1 + number2;
    }

    public float subtract( int number1, int number2){
        return number1 - number2;
    }

    public float multiply( int number1, int number2){
        return number1 * number2;
    }

    public String divide( float number1, float number2){
        if(number2 == 0){
            return "There isn't division by zero";
        }else {
            return String.valueOf(number1 / number2);
        }
    }



}
