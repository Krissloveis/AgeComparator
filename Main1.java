public class Main1 {
    public static void main(String[] args) {
        // Возраст трёх человек
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        // Переменные для минимального, среднего и максимального возраста
        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        // Определение минимального, среднего и максимального возраста
        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (katyaAge <= mishaAge) {
                middle = katyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = katyaAge;
            }
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
            if (vasyaAge <= mishaAge) {
                middle = vasyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = vasyaAge;
            }
        } else {
            min = mishaAge;
            if (vasyaAge <= katyaAge) {
                middle = vasyaAge;
                max = katyaAge;
            } else {
                middle = katyaAge;
                max = vasyaAge;
            }
        }

        // Вывод результатов
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}