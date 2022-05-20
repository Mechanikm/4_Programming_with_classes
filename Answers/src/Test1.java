// Создайте класс Test1 с двумя переменными.
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных,
// и метод, который находит наибольшее значение из этих двух переменных.

public class Test1 {

    int variableOne;
    int variableTwo;

    public void changeVariableOne(int variableOne) {
        this.variableOne = variableOne;
    }

    public void changeVariableTwo(int variableTwo) {
        this.variableTwo = variableTwo;
    }

    public int summVariables() {
        return (variableOne + variableTwo);
    }

    public int maxVariable() {
        return (Math.max(variableOne, variableTwo));
    }
}