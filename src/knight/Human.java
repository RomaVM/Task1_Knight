package knight;

public abstract class Human {

    /** Свойство - имя человека */
    private String name;

    /** Свойство - возвраст человека */
    private int age;

    /** Создает обьект с заданными значениями
     * @param name - имя рыцаря
     * @param age - возвраст рыцаря
     */
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /** Метод для вывода информации о человеке
     * @return Возвращает полную информацию о человеке
     */
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
