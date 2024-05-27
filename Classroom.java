public class Classroom {
    public static void main(String[] args) {
        Wilder Emma = new Wilder("Emma", true);
        Wilder Claire = new Wilder("Claire", false);
        Wilder Jo = new Wilder("Jonathan", true);

        System.out.println(Emma.whoAmI());
        System.out.println(Claire.whoAmI());
        System.out.println(Jo.whoAmI());
    }
}
