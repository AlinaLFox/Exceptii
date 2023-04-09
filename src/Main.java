public class Main {
    public static void main(String[] args) {

        /* первый вариант ошибок Person без конструктора */
//        try {
//            Person person = new Person();
//            person.setFirstName("");
//            person.setLastName("");
//            person.setAge(153);
//            //ниже используем встроенную ошибку NullpounterException
//        } catch (NullPointerException | InvalidNameException | InvalidAgeException error) {
//            System.out.println(error.getMessage());
//        }

        /* второй вариант ошибок Person с конструктора */

//        try {
//            Person p = new Person("Basil", "Kalenik", 26);
//            Person p2 = new Person("Alina", "", 25);
//            Person p3 = new Person("", "Borta", 30);
//            Person p4 = new Person("Olga", "Kravcenko", -26);
//            Person p5 = new Person("", "Kalenik", 326);
//        } catch (InvalidNameException | InvalidAgeException e) {
//            e.printStackTrace();
//        }

        /* чтобы сэкономить место,прописываем обьекты прямо в классе Numbers в методе call
        и вызываем его через main */

//        Numbers num = new Numbers();
//        num.call();

        try {
            Numbers numbers = new Numbers();
            numbers.countDivisibleBy7Numbers(7, 36);
            Numbers n = new Numbers();
            n.countDivisibleBy7Numbers(36, 7);
        } catch (InvalidRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
