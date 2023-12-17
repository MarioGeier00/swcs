package swcs.gof.creational.prototype.shallow.person;

class Client {

    public static void main(String[] args) {

        Person original = new Person("Original name", new Address("Original city", "Original street"));
        print("Original", original);

        // Clone as a shallow copy
        Person clone = original.clone();
        print("Clone", clone);

        clone.name("Modified name");
        clone.address().city("Modified city");

        print("Clone after modification", clone);
        print("Original after clone modification", original);
    }

    private static void print(String object, Person person) {
        System.out.printf("%s: %s, %s%n",
                object,
                person.name(),
                person.address().city());
    }
}
