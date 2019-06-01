public class Main {
    public static void main(String[] args) {

        Collections<String> c = new Collections<String>();
        c.add("apo");
        c.add("hovig");
        c.add("apo");
        c.add("vazken");
        c.add("vazken");
        c.add(0, "haig");
        c.add(0, "lolo");
        System.out.println(c.toString());
        System.out.println(c.get(2));
        System.out.println(c.contains("apo"));
        System.out.println(c.contains("talin"));
        c.remove(1);
        c.remove("apo");
        System.out.println(c.toString());
        while (c.hasNext()) {
            System.out.println(c.next());
        }


        Collections<Integer> c1 = new Collections<Integer>();
        c1.add(1);
        c1.add(3);
        c1.add(2);
        c1.add(1);
        c1.add(5);
        c1.add(0, 0);
        c1.add(0, -1);
        System.out.println(c1.toString());
        System.out.println(c1.get(2));
        System.out.println(c1.contains(5));
        System.out.println(c1.contains(6));
        c1.remove(1);
        c1.remove(3);
        System.out.println(c1.toString());
        while (c1.hasNext()) {
            System.out.println(c1.next());
        }
    }
}
