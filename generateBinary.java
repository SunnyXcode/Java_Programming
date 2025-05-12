package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class generateBinary {

    public String[] generateBinaryNum(int num) {
        String[] result = new String[num];// for storing the binary number (if num=4,array of 4 size to be created)
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for (int i = 0; i < num; i++) {
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;

    }

    public void print(String arr[]) {
        for(String str:arr ){
            System.out.print(str+",");
        }

    }

    public static void main(String[] args) {

        generateBinary q = new generateBinary();
        String output[] = q.generateBinaryNum(5);
        q.print(output);
    }

}
