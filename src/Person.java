public class Person {
/* вместо того, чтоб прописывать ошибки в гетерах или сетерах,
легче указать в конструкторе, потому что так меньше надо будет писать,
 но ниже написаны оба варианта записи*/
    String firstName;
    String lastName;
    int age;

    public void setFirstName(String firstName) throws InvalidNameException {
        if (firstName == null || firstName.equals("")) {
            throw new InvalidNameException("Numele este null!");
        }
            this.firstName = firstName;
    }

    public void setLastName(String lastName) throws InvalidNameException{
        if (lastName == null || lastName.equals("")) {
            throw new InvalidNameException("Prenumele este null!");
        }
            this.lastName = lastName;
        }

    public void setAge(int age) throws InvalidAgeException{
        //в случае примитивных данных пишется символ "==",
        // в любом другом случае используем equals
        if (age == 0 || age > 150) {
            throw new InvalidAgeException("Virsta nu poate fi 0 sau mai mare de 150!");
        }
            this.age = age;
    }

    //вариант записи с помощью конструктора

//    public Person(String firstName, String lastName, int age) throws InvalidNameException, InvalidAgeException {
//    // знак || означает "или", нужно не забывать применять его
//        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
//        throw new InvalidNameException("Numele sau prenumele nu trebuie sa fie nul sau gol");
//        }
//        if (age < 0 || age > 150) {
//        throw new InvalidAgeException("Virsta mai mica de 0 sau mai mare de 150!!!");
//        }
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
}
