package sample;

import java.util.ArrayList;
import java.util.List;

public class MyInitiater {
    private List<MyListener> listeners = new ArrayList<MyListener>();

    public void addListener(MyListener toAdd) {
        listeners.add(toAdd);
    }

    public void sayHello() {
        System.out.println("Hello!");

        // Notify everybody that may be interested.
        for (MyListener hl : listeners)
            hl.print1();
    }
}
