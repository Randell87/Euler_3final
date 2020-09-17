public class euler3 {
    public static void main(String[] args) {
        System.out.println("Hi Euler 3");
        long c;
        c = 600851475143L;
        long max = 0L;

        for (long i = 2L; i < (c / 2); i++)
            if (c % i == 0) { //находим делитель без остатка
                for (long j = 1; j <= (i / j); j++) {//проверяем простое ли число
                    int count = 0;
                    if (i % j == 0) {
                        count++;
                    } else {
                        //System.out.println(i);
                    }
                    if (count == 1) {
                        System.out.println(i);
                        count = 0;
                    }
                    else count = 0;

                }
                //System.out.println(max);
            }
    }}