public class Java {
    public static void main(String[] args) {
      /*  int size = 8;
        String board = "";
        for (int i = 0;i< size;i++) {
            for (int j = 0; j < size; j++) {
                if((i+j)%2==0) board+="*";
                else board+="#";
            }
            board+="\n";
        }
        System.out.println(board);*/
        Integer i = new Integer(5);
        Integer j = new Integer("5");
        if(i.equals(j)) System.out.println(i+j);
//      if(i==j) System.out.println(i+j);    { equals() vs == } лучше использовать equals()
    }
}
