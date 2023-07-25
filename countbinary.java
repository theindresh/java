public class countbinary {

    public static void main(String[] args) {
        System.out.println();
    }
    public static int countb(int num, String binarySeq){
        String binaryNum = Integer.toBinaryString(num);
        int count = 0;
        int seqLen = binarySeq.length();
        for(int i = 0; i <= binaryNum.length()-seqLen; i++){
            String currSeq = binaryNum.substring(i,i+seqLen);
            if(currSeq.equals(binarySeq)){
                count++;
                i += seqLen-1;
            }
        }
        return 0;
    }
}
