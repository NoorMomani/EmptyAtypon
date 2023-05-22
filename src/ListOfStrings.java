import java.util.NoSuchElementException;

public class ListOfStrings {

    private String[] items;
    private int N;

    public ListOfStrings(){
        items = new String[1];
        N = 0;
    }

    private void resize(int capacity){
        String[] temp = new String[capacity];
        for (int i = 0; i < N; i++)
            temp[i] = items[i];
        items = temp;
    }

    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return N == 0;
    }

    public void add (String item){
        if(item==null)
            throw new IllegalArgumentException();
        if(N == items.length)
            resize(2 * items.length);
        items[N++] = item;
    }

    public String remove (){
        if(N == 0)
            throw new NoSuchElementException();
        String v = items[N-1];
        items[N-1] = null;
        N--;
        if (N > 0 && N == items.length/4)
            resize(items.length/2);
        return v;
    }

    public String get (int position){
        if(position < 0 || position >= N)
            throw new NoSuchElementException();
        return items[position];
    }

    public int position (String item){
        if(item==null)
            throw new IllegalArgumentException();
        for(int i=0; i<N; i++)
            if(items[i].equals(item))
                return i;
        return -1;
    }

// complete the implementation of the following APIs

    public void add(String item, int position){
        if (item == null)
            throw new IllegalArgumentException();

        if (position < 0 || position > N)
            throw new NoSuchElementException();

        if (N == items.length)
            resize(2 * items.length);

        for (int i = N; i > position; i--) {
            items[i] = items[i - 1];
        }

        items[position] = item;
        N++;
    }
    // {A, B, Z, C, D, E}
    // add (W, 0)

    public String remove(int position){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(position < 0 || position >= N){
            throw new NoSuchElementException();
        }

        String s = get(position);

        for (int i = position; i < N - 1; i++) {
            items[i] = items[i + 1];
        }

        items[N-1] = null;
        N--;

        return s;
    }
    // {A, Z, C, D, E}
    // remove(1)

}


