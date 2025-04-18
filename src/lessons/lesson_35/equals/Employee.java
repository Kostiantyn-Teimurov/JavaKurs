package lessons.lesson_35.equals;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFateOfBirth() {
        return dateOfBirth;
    }

    public void setFateOfBirth(String fateOfBirth) {
        this.dateOfBirth = fateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }


    // Логика сравнения ЭТОГО (this) объекта с другим объектом любого типа данных
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // Переменные ссылаются на один и тот же объект
//
//        if (!(obj instanceof Employee)) return false; // Проверка на возможность привести к Employee
//        Employee employee = (Employee) obj;
//
//        // Сравниваю значение полей, которые должны быть равными, для признания объектов равными
//
//            return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) &&
//                    dateOfBirth.equals(employee.dateOfBirth);
//
//        // firstName.equals(employee.firstName) - При таком сравнении возможно появление NPE
//        // null.equals(employee.firstName) -> аварийное завершение программы
//        // Objects.equals(null, employee.firstName) -> просто вернет false
//
//
//        // Безопасное сравнение объектов с учетом возможности появления null-значений
//        return Objects.equals(firstName, employee.firstName) &&
//                Objects.equals(lastName, employee.lastName) &&
//                Objects.equals(dateOfBirth, employee.dateOfBirth);
//    }
    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(dateOfBirth);
        return result;
    }
}
