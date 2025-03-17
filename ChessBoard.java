package S1BM23AI176;

public class chessBoard {
    public chessBoard() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 8; ++i) {
            for(int j = 0; j < 8; ++j) {
                if ((i + j) % 2 == 0) {
                    System.out.print("**");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("\n");
        }

    }
}
