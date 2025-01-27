class Demo023 {
    public int isPalindrome(int x) {
        if (x <= 0) {
            return -1;
        }
        
        int original = x;
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        if (original == reversed) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Demo023 checker = new Demo023();
        
        System.out.println(checker.isPalindrome(232)); 
        System.out.println(checker.isPalindrome(345)); 
        System.out.println(checker.isPalindrome(-232)); 
        System.out.println(checker.isPalindrome(0)); 
    }
}
