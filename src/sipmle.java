public class sipmle {
    public static void main(String[] args) {
        long num = 600851475143L;
        long count = 2L;

        while (true) {
        if ((num % count) == 0)
        num /= count;
        if (num == 1)
        {System.out.println(count);
        break;}
                count += 1;
    }
    }
    }
