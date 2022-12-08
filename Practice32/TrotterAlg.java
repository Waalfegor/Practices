package Practice32;

import java.util.Arrays;

public class TrotterAlg {
    public static void swap(int[] numbers, int[] directions, int ind, int jnd) {
        int numbersTemplate = numbers[ind];
        int directionsTemplate = directions[ind];

        numbers[ind] = numbers[jnd];
        numbers[jnd] = numbersTemplate;

        directions[ind] = directions[jnd];
        directions[jnd] = directionsTemplate;
    }

    public static void combinations(int size) {
        int[] numbers = new int[size];
        int[] directions = new int[size];

        for (int ind = 0; ind < numbers.length; ++ind) {
            numbers[ind] = ind + 1;
            directions[ind] = -1;
        }

        System.out.println("All combinations of sequence: " + Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));

        int indexOfMobile = findLargeMobile(numbers, directions);

        while (indexOfMobile != -1) {
            int mobile = numbers[indexOfMobile];
            int nextIndex = indexOfMobile + directions[indexOfMobile];

            swap(numbers, directions, indexOfMobile, nextIndex);
            changeDirections(numbers, directions, mobile);

            System.out.println(Arrays.toString(numbers));
            indexOfMobile = findLargeMobile(numbers, directions);
        }
    }

    public static void changeDirections(int[] numbers, int[] directions, int mobile) {

        for (int ind = 0; ind < numbers.length; ++ind) {
            if (numbers[ind] > mobile) {
                directions[ind] = directions[ind] * (-1);
            }
        }
    }

    public static int findLargeMobile(int[] numbers, int[] directions) {
        int index = -1;

        for (int ind = 0; ind < numbers.length; ++ind) {

            int nextIndex = ind + directions[ind];

            if (nextIndex >= 0 && nextIndex < numbers.length) {
                if (numbers[ind] > numbers[nextIndex]) {
                    if (index == -1) {
                        index = ind;
                    } else if (numbers[ind] > numbers[index]) {
                        index = ind;
                    }
                }
            }
        }
        return index;
    }
}
