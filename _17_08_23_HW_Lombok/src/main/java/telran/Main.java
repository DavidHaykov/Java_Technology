package telran;




public class Main {
    public static void main(String[] args) {
        Person person1 =  Person.builder()
                .id(123123)
                .name("Dudu")
                .lastName("Cohen")
                .address("Haifa, Natan Elbaz St. 1")
                .build();
        Person person2 = new Person();
        System.out.println(person1.getId());
        System.out.println(person1.toString());
        System.out.println(person2);

    }
}