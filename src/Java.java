public class Java {
    public static void main(String[] args) {
        int size = 8;
        String board = "";
        for (int i = 0;i< size;i++) {
            for (int j = 0; j < size; j++) {
                if((i+j)%2==0) board+="*";
                else board+="#";
            }
            board+="\n";
        }
        System.out.println(board);
    }
}
