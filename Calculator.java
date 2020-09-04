package SSPKUOJ;
import  java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int[] num = new int[20];
        char[] operator = new char[20];
        Map<Character, Integer> map = new HashMap<>();
        //数值大小表示优先级，数值越大 优先级越高
        map.put('*', 2);
        map.put('/', 2);
        map.put('+', 1);
        map.put('-', 1);
        int num_top = 0, opera_top = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int tmp = 0;
                int j = i;
                while (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                    tmp = tmp * 10 + s.charAt(j) - '0';
                    j++;
                }
                i = j;
                num[num_top++] = tmp;
            } else {
                //左括号直接进栈
                if (s.charAt(i) == '(') {
                    operator[opera_top++] = s.charAt(i);
                }
                //右括号
                else if (s.charAt(i) == ')') {
                    while (operator[opera_top - 1] != '(') {
                        num[num_top++] = operator[opera_top - 1];
                        opera_top--;
                    }
                }
                //其他运算符 加减乘除
                else {
                    //空栈直接入栈
                    if (opera_top == 0) {
                        operator[opera_top++] = s.charAt(i);
                    }
                    //一直找到能够压得住的
                    else {
                        while (opera_top>0 && map.get(s.charAt(i)) <= map.get(operator[opera_top - 1])) {
                            //System.out.println("num_top: "+num_top);
                            //System.out.println("operator[opera_top - 1]:"+operator[opera_top - 1]);
                            num[num_top++] = operator[opera_top - 1];
                            opera_top--;
                        }
                        operator[opera_top++] = s.charAt(i);
                    }
                }
                i++;
            }
        }

    }
}