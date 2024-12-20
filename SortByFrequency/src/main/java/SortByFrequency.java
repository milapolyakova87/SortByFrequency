import java.util.*;

public class SortByFrequency {

    // Метод для сортировки символов строки по частоте их вхождения
    public static String sortByFrequency(String input) {
        // Создаем карту для подсчета частоты символов
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Подсчитываем частоту каждого символа
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Создаем список символов для сортировки
        List<Character> characters = new ArrayList<>(frequencyMap.keySet());

        // Сортируем список символов по частоте и лексикографическому порядку
        characters.sort((a, b) -> {
            int frequencyComparison = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            if (frequencyComparison != 0) {
                return frequencyComparison; // Сначала по частоте (убывание)
            } else {
                return a.compareTo(b); // Затем по лексикографическому порядку (возрастание)
            }
        });

        // Собираем результат в строку
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            result.append(String.valueOf(c).repeat(frequencyMap.get(c)));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи строку:");
        String input = scanner.nextLine();

        // Сортируем строку по частоте и выводим результат
        String sortedString = sortByFrequency(input);
        System.out.println("Отсортированная строка: " + sortedString);

        scanner.close();
    }
}