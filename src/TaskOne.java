import java.util.HashSet;
import java.util.Random;

public class TaskOne {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] array1 = new int[100];
        HashSet<Integer> setList = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            array1[i] = rd.nextInt(100 - 1) + 1;
            if (array1[i] % 2 == 0 && array1[i] % 5 == 0) {
                setList.add(array1[i]);
            }

            //так как хэш удаляет схожие данные то в начале
            //загрузит те что делятся на 5
            //затем опять зальет все, но только то что осталось)
            //и делится на 2
        }
        for (int i = 0; i < 100; i++){
            if(array1[i] % 2 == 0){
                setList.add(array1[i]);
            }
        }
    }
}