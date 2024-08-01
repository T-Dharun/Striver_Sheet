class Solution {
    static String oddEven(int n) {
        int bit=n&1;
        //System.out.println(bit);
        return (bit==1)?"odd":"even";
    }
}