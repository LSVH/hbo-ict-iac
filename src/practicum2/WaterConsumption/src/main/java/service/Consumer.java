package service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Consumer {
    private int consumed;

    public Consumer(int consumed) {
        super();
        this.consumed = consumed;
    }

    public int getConsumed() {
        return consumed;
    }
}
