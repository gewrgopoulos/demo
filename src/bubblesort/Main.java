package bubblesort;

public class Main {
	public static void main (String args[]) {
        int board[]= {4,5,7,22,41,52,456,69,420,14,555,2310,210,2333,999999};
        System.out.print("original array: ");
        //getting access to original array.
        for(int i=0; i<board.length; i++) {
            System.out.print(board[i]+" ");
        }
        int len=board.length;
        //checking if one number is greater than the other.
        for (int i=0; i<len-1; i++) {
            for (int j=0; j<len-1 -1; j++) {
                if(board[j]>board[j+1]) {
                    int temp=board[j];
                    //if the number is greater than the other the swap happens here.
                    board[j]=board[j+1];
                    board[j+1]=temp;        
                }
            }
        }
        System.out.print("\nordered array: ");
        for(int i=0; i<board.length; i++) {
            System.out.print(board[i]+" ");
        }
    }
    
}

