
class Solution {
    static void bitManipulation(int num, int i) {
        int bit=(int)Math.pow(2,i-1);
        int first=((num&bit)==0)?0:1;
        int second=(num|bit);
        int third=num&bit;
        System.out.println(first+" "+second+" "+third);
    }
}
