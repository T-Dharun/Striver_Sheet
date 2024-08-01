class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        int bit=1<<k;
        return (n&bit)!=0;
    }
}