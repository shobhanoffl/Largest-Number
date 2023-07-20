import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{5,1,22,3,20};
        String[] s_num = new String[num.length];
        for(int i = 0; i < num.length; i++)
            s_num[i] = String.valueOf(num[i]);

        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);
            }
        };

        Arrays.sort(s_num, comp);

        if(s_num[0].charAt(0) == '0')
            System.out.println("0");

        StringBuilder sb = new StringBuilder();
        for(String s: s_num)
            sb.append(s);

        System.out.println(sb.toString());
    }
}