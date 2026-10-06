public class Sequences {

    // Read REQ 02
    public int sumOfFirst(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++){
            total += i;
        }
        return total;
    }

    // Read REQ 03
    public String countUp(int start, int limit) {
        String result = "";
        for (int i = start; i <= limit; i++){
            if (i > start) {
                result += " ";
            }
            result += i;
        }
        return result;
    }

    // Read REQ 04
    public String countByThrees(int start, int limit) {
        String result = "";
        boolean first = true;
        for (int i = start; i <= limit; i+=3){
            if(!first){
                result += " ";
            }
            result += i;
            first = false;
        }
        return result;
    }

    // Read REQ 05
    public int productOfFirst(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    // Read REQ 06
    public int countMultiples(int n, int factor) {
        int count = 0;
        if (factor == 0 || n <= 0){
            return 0;
        } else {
            for (int i = 1; i <= n; i++){
                if (i % factor == 0){
                    count += 1;
                }
            }
        }
        return count;
    }

    // Read REQ 07
    public String repeat(String s, int times) {
        String result = "";
        for (int i = 1; i <= times; i++){
            result += s;
        }
        return result;
    }

    // Read REQ 08
    public int power(int base, int exponent) {
        int result = 1;
        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        return result;
    }

    public int sumOfSquares(int n){
        int total = 0;
        for (int i = 1; i <= n; i++){
            total += i*i;
        }
        return total;
    }

    public int alternatingSum(int n){
        int sum = 0;
        if (n <= 0){
            return 0;
        }
        for (int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }

public String powersOfTwo(int count) {
    String all = "";
    for (int i = 0; i < count; i++) {
        all += (int) Math.pow(2, i);
        if (i < count - 1) {
            all += " ";
        }
    }
    return all;
}

    public String countBy(int start, int limit, int step){
        String result = "";
        boolean first = true;
        for (int i = start; i <= limit; i+=step){
            if(!first){
                result += " ";
            }
            result += i;
            first = false;
        }
        return result;
    }



}   


