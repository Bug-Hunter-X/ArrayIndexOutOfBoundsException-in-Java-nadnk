public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; 
        }
        //To avoid exception, print elements within the valid range, for example:
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}