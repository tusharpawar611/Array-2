public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 43, 5, 7, 8, 9, 0, 4, 89, 346 };
        int[] out = maxMin(arr);

        for (int i : out)
            System.out.println(i);
    }

    private static int[] maxMin(int arr[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i = i + 2) {
            int tempMax, tempMin;
            // update locally
            if (arr[i] >= arr[i - 1]) {
                tempMin = arr[i - 1];
                tempMax = arr[i];
            } else {
                tempMin = arr[i];
                tempMax = arr[i - 1];
            }
            // update globally
            max = Math.max(tempMax, max);
            min = Math.min(tempMin, min);
        }

        if (arr.length % 2 != 0) {
            max = Math.max(max, arr[arr.length - 1]);
            min = Math.min(min, arr[arr.length - 1]);

        }
        return new int[] { max, min };
    }
}