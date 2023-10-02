package classwork.homework1.bracechecker;

public class Stack {
    int stck[] = new int[10];
    int index = -1;

    Stack() {
        index = -1;

    }

  public   void push(int item) {
        if (index == 9)
            System.out.println("Stack is full.");
        else
            stck[++index] = item;
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack underflow.");
            return 0;

        } else
            return stck[index--];
    }
   public int getIndex(){
        return index;
   }
}