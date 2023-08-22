import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        /*BigInteger class is used for the mathematical operation which involves very big integer calculations that are outside the limit of all available primitive data types. */
        BigInteger aInt = new BigInteger(a, 2);
        BigInteger bInt = new BigInteger(b, 2);
        BigInteger addb = aInt.add(bInt);
        String returnResult = addb.toString(2);
        return returnResult;
    }
}