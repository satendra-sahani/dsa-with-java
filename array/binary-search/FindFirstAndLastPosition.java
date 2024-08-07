/**
 * FindFirstAndLastPosition
 */
public class FindFirstAndLastPosition {
    public static int[] findIndex(int[] numbers, int target) {
        int[] result = { -1, -1 };
        result[0] = getLeftPosition(numbers, target);
        result[1] = getRightPosition(numbers, target);
        return result;
    }

    private static int getLeftPosition(int[] numbers, int target) {
        int result = -1;
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == target) {
                result = mid;
                break;
            }
            if (numbers[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    private static int getRightPosition(int[] numbers, int target) {
        int result = -1;
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == target) {
                result = mid;
                break;
            }
            if (numbers[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arrays[] = { 3, 5, 6, 7, 10, 10, 12, 13, 45, 78, 89, 100 };
        // find start and end position of given number
        int key = 10;
        int[] result = findIndex(arrays, key);
        System.out.println("left = " + result[0]);
        System.out.println("right = " + result[1]);

    }
}