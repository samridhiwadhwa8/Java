class myStack {
    int top;
    int[] arr;
    int n;
    public myStack(int n) {
        this.n=n;
        arr=new int[n];
        top=-1;
    }

    public boolean isEmpty() {
       return top==-1;
    }

    public boolean isFull() {
      return top==n-1;
    }

    public void push(int x) {
        if(top==n-1)return ;
        arr[++top]=x;
    }

    public void pop() {
       if(top==-1)return ;
       top--;
    }

    public int peek() {
        if(top==-1)return -1;
        return arr[top];
    }
}
