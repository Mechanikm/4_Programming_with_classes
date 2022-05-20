// Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.

public class Test2 {

    int variableOne;
    int variableTwo;

    public Test2(int variableOne, int variableTwo) {
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }

    public Test2() {
        variableOne = 1;
        variableTwo = 2;
    }

    public int getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(int variableOne) {
        this.variableOne = variableOne;
    }

    public int getVariableTwo() {
        return variableTwo;
    }

    public void setVariableTwo(int variableTwo) {
        this.variableTwo = variableTwo;
    }

}