package company;

public class ToBinaryClass {
    static String toBinaryString(int numbers) {
        //0000 0000 0000 0000 0000 0000 0001 0101
        String binaryNumbers = Integer.toBinaryString(numbers);

        return binaryNumbers;
    }
}