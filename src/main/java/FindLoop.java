import java.util.Objects;

public class FindLoop {
    public static void main(String[] args) {

        Node root = new Node();
        root.setData(1);
        root.next = new Node();
        root.addNewNode(root,4);
        root.addNewNode(root,9);
        root.addNewNode(root,4);
        root.addNewNode(root,8);

//        while(Objects.nonNull(root.next)){
//            System.out.println(root.getData());
//            root = root.next;
//        }
        System.out.println("this is root :" +root.getData());
        System.out.println(isItHaveLoop(root));

    }

    public static boolean isItHaveLoop(Node root){
        int[] bool = new int[10];
        while(Objects.nonNull(root.next)){
            if(bool[root.getData()]==0){
                bool[root.getData()]=1;
                root = root.next;
            }else {
                System.out.println("it has loop");
                return true;
            }
        }
        System.out.println("No loop");
        return false;
    }
}
