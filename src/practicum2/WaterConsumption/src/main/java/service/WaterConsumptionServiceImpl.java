package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WaterConsumptionServiceImpl {
    private int reduction = 5;
    private List<Consumer> consumers = new ArrayList<Consumer>();

    public HashMap<String, Integer> getConsumption() {
        HashMap<String, Integer> consumption = new HashMap<String, Integer>();
        consumption.put("total_consumption", this.getTotalConsumption());
        consumption.put("reduced_consumption", this.getReducedConsumption());
        consumption.put("reduction_percentile", this.reduction);
        return consumption;
    }

    private int getTotalConsumption() {
        int total = 0;
        for (Consumer consumer: this.consumers) {
            total += consumer.getConsumed();
        }
        return total;
    }

    private int getReducedConsumption() {
        int total = this.getTotalConsumption();
        return  total - (total * (this.reduction/100));
    }

    public List<Consumer> getConsumers() {
        return consumers;
    }

    public void addConsumer(int consumed) {
        this.consumers.add(new Consumer(consumed));
    }

    public void setReduction(int reduction) {
        this.reduction = reduction;
    }

    public void reset() {
        this.consumers = new ArrayList<Consumer>();
    }
}
