package InheritanceLab.StackOfStrings_04;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data;

    public Stack() {
        data = new ArrayList<>();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        int lastIndex = data.size() - 1;
        String topItem = data.get(lastIndex);
        data.remove(lastIndex);
        return topItem;
    }

    public String peek() {
        return data.get(data.size() - 1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

}
