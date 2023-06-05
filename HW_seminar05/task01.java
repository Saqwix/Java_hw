import java.util.HashMap;

public class task01 {
    public static void main(String[] args) {

        // Создать множество, ключ и значение строки. Добавить шесть элементов. Вывести в консоль значения.
        HashMap<Integer, String> heroes = new HashMap<>();
        heroes.put(4, "1111");
        heroes.put(8, "2222");
        heroes.put(16, "3333");
        heroes.put(32, "4444");
        heroes.put(64, "5555");
        heroes.put(128, "6666");
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(heroes);

        // Добавить ко всем значениям символ "!".
        heroes.computeIfPresent(4, (k, v) -> v + '!');
        heroes.computeIfPresent(8, (k, v) -> v + '!');
        heroes.computeIfPresent(16, (k, v) -> v + '!');
        heroes.computeIfPresent(32, (k, v) -> v + '!');
        heroes.computeIfPresent(64, (k, v) -> v + '!');
        heroes.computeIfPresent(128, (k, v) -> v + '!');
        System.out.println(heroes);
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(heroes);

        // Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключами первого.
        HashMap<Integer, String> heroesSec = new HashMap<>();
        heroesSec.put(2, "1212");
        heroesSec.put(1, "1313");
        heroesSec.put(16, "1414");
        heroesSec.put(8, "1515");
        heroesSec.put(4, "1616");
        heroesSec.put(6, "1717");
        System.out.println(heroesSec);

        // Объединить значения во втором множестве и первом, если ключи совпадают. Вывести результат в консоль.
        for (Integer item : heroes.keySet()) {
            heroes.merge(item, heroesSec.getOrDefault(item, ""), (newVal, tempVal) -> newVal + tempVal);
        }
        System.out.println(heroes);
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
    }
}