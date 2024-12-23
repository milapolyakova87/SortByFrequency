# Sort By Frequency

Эта программа сортирует символы строки по частоте их вхождения. Если частоты одинаковы, символы сортируются по лексикографическому порядку.

## Описание задачи

Дана строка, содержащая символы. Необходимо отсортировать символы следующим образом:
1. По убыванию частоты вхождения символов.
2. Если частоты одинаковы, по возрастанию лексикографического порядка.

## Пример

### Ввод:

tree

### Вывод:

eert


### Объяснение:
- Символ `e` встречается 2 раза.
- Символы `t` и `r` встречаются по 1 разу.
- Результат: `eert`.

## Как работает программа

### Подсчет частоты символов:

Используется HashMap<Character, Integer> для подсчета частоты каждого символа в строке.

Сортировка символов:

Создается список символов, который сортируется с использованием компаратора:

Сначала по убыванию частоты вхождения.

Если частоты одинаковы, по возрастанию лексикографического порядка.

### Формирование результата:

Используется StringBuilder для сборки строки из отсортированных символов.

Каждый символ добавляется в строку столько раз, сколько он встречается.

### Преимущества программы

Использует коллекции (HashMap, ArrayList) для эффективного подсчета и сортировки.

Сортировка выполняется с использованием компаратора, что делает код читаемым и гибким.

Поддерживает строки с любыми символами (включая буквы, цифры и специальные символы).

## Требования

Java Development Kit (JDK) 8 или выше.

## Контакты
Если у вас есть вопросы или предложения, свяжитесь со мной в телеграм @M1laPolyakova
