package activities;

public class Activity2 {
    public static void main(String args[]){
        int[] arr = {10,77,10,54,-11,10};
        int searchNum = 10;
        int fixedSum = 30;
        System.out.println("The final output is:" + Validate(arr, searchNum, fixedSum));
    }

    public static boolean Validate(int[] numbers, int sNum, int fSum){
        int tsum = 0;
        for (int num : numbers){
            if(num == sNum){
                tsum += sNum;
            }
            if (tsum >fSum){
                break;
            }
        }
        return tsum == fSum;
    }
}
