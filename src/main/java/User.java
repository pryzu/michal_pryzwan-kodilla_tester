public class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User julia = new User("Julia", 7);
        User piotr = new User("Piotr", 5);
        User maria = new User("Maria", 32);
        User michal = new User("Michal", 32);
        User beata = new User("Beata", 60);
        User ryszard = new User("Ryszard", 62);


        User[] users = {julia, piotr, maria, michal, beata, ryszard,};

        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }

        double average = sum / users.length;

        System.out.println("Średnia wieku to:" + average);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < average) {
                System.out.println("Użytkownik z wiekiem poniżej średniej:" + users[i].name);
            }

        }

    }



    }
