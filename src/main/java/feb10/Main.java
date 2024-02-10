package feb10;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
        ArrayList list = new ArrayList();
        try {
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

        } catch (EmptyElementException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(list.size());
        System.out.println(list.pop());
        list.delete(2);



        LinkedList s = new LinkedList();
        s.add(1);
        s.add(2);

        System.out.println(s.pop());
        System.out.println(s.get(0));


    }


}
