class DynamicArray {
    private int length;
    private int []arr;
    private int capacity;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.length = 0;
    

    }

    public int get(int i) {
       return arr[i];


    }

    public void set(int i, int n) {
        arr[i]=n;

    }

    public void pushback(int n) {
        if(length==capacity) //arr full then resize
        resize();

        arr[length]=n;
        length++;

    }

    public int popback() {
        int last = arr[length - 1];
        length--;
        return last;

    }

    private void resize() {
        capacity= 2* capacity;
        int[] newArr = new int[capacity];

        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;

    }

    public int getSize() {
        return length;


    }

    public int getCapacity() {
        return capacity;

    }
}
