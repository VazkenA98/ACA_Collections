public class MainTest {
    static Collections<String> c = new Collections<String>();
    public static void main(String[]args){
    testAddingItem();
    testAddingItemAndPosittion();
    testRemoveByPossition();
    testRemoveItem();



    }
    private static void testAddingItem() {
        c.add("haig1");
        c.add("haig2");
        c.add("haig3");
        assert c.get(0).equals("haig1") : true;
        assert c.get(1).equals("haig2") : true;
        assert c.get(2).equals("haig3") : true;


    }
    private static void testAddingItemAndPosittion() {
        c.add(0,"hagop");
        assert c.get(0).equals("hagop") : true;

    }
    private static void testRemoveItem() {
        c.remove("haig2");
        boolean flag = false;
        while (c.hasNext()){
            if(c.next()=="haig2"){
                flag = true;
            }
        }
        assert flag == false : true;

    }
    private static void testRemoveByPossition() {
        c.remove(0);
        boolean flag = false;
        while (c.hasNext()){
            if(c.next()==c.get(0)){
                flag = true;
            }
        }
        assert flag == false : true;

    }

}
