public class thefirst {

    static int bad = 4;


    public static boolean isBadVersion(int version) {
        return version >= bad;
    }

    public static void main(String[] args) {
        int n = 10;

        thefirst fbv = new thefirst();
        int result = fbv.firstBadVersion(n);

        System.out.println("First bad version is: " + result);
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}


