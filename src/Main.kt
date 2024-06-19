fun main() {
    /**
     * 1 Задание. Дан список строк произвольного размера. Вывести в консоль список, внутри которого располагаются
     * данные элементы, но каждый элемент представлен в реверсивном виде. Входной список: {"one", "two", "three"}.
     * Выходные данные: [eno, owt, eerht].
     */
    println("\n***1 ЗАДАНИЕ***\n")
    val firstList = listOf("one", "two", "three", "four", "five")
    println(firstList)
    //1 способ
    val firstResultReverseList = firstList.map { it.reversed() }
    println(firstResultReverseList)
    //2 способ
    val secondResultReverseList = mutableListOf<String>()
    for (element in firstList) {
        secondResultReverseList.add(element.reversed())
    }

    println(secondResultReverseList)
    /**
     * 2 Задание. Создать список целых чисел. В новый список сохранить квадрат элементов старого списка с условием,
     * что исходный элемент меньше или равен 3. Входной список: {1, 2, 3, 4, 5}. Выходные данные: [1, 4, 9]
     */
    //Задание перескочило на следующие задание!


    println("\n***2 ЗАДАНИЕ***\n")
    val integerList = listOf(1, 2, 3, 4, 5)
    println(integerList)
    val squareIntegerList = integerList.map { it * it }
    val resultIntegerList = squareIntegerList.filterIndexed { index, _ ->
        integerList[index] <= 3
    }
    println(resultIntegerList)
    /**
     * 3 Задание. Написать два списка. Один содержит значения цвета на английском языке, второй – значение цвета на
     * русском. Объединить списки и вывести информацию, содержащую значение и его перевод. Выходные данные:
     * {"red", "blue", "white"}, {"красный", "синий", "белый"}. Выходные данные:
     * [Значение: red, перевод: красный, Значение: blue, перевод: синий, Значение: white, перевод: белый]
     */
    //в тексте все данные написаны "ВЫХОДНЫЕ", "входных" нет
    println("\n***3 ЗАДАНИЕ***\n")
    val engColorsList = listOf("red", "blue", "white")
    val rusColorsList = listOf("красный", "синий", "белый")
    println(rusColorsList.zip(engColorsList) {rus, eng ->
        "Значение: $eng, перевод: $rus"
    })
    /**
     * 4 Задание. Дан массив строк, содержащий название месяцев. Посчитать общее количество символов, содержащееся
     * во всех строковых элементах. Выходные данные: {"Jan", "Feb", "Mar", "Apr", "May}. Выходные данные: 15.
     */
    //тут тоже в задание все "выходные" и в кавычку у May забыли
    println("\n***4 ЗАДАНИЕ***\n")
    val listOfMonths = listOf("Jan", "Feb", "Mar", "Apr", "May")
    val countsOfMonths = (listOfMonths.map { it.length }).sum()
    println(countsOfMonths)

}