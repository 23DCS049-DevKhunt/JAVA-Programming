public class p14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,
            6, 7, 8, 9, 10};
            int n = arr.length;
            int k = 3;
            int[] ans = new int[n];
            int j = 0;
            for (int i = 0; i < n; i += k) {
                ans[j++] = arr[i];
                }
                for (int i = 1; i < k; i++) {
                    ans[j++] = arr[i - 1 + n / k];
                    }
                    for (int i = 0; i < n; i += k) {
                        ans[j++] = arr[i + k - 1];
                        }
                        for (int i = 0; i < n; i++) {
                            System.out.print(ans[i] + " ");
                            }
                            }   
}
