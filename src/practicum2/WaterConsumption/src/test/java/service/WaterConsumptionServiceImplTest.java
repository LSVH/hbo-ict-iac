package service;

import java.util.List;

import static junit.framework.Assert.assertTrue;

public class WaterConsumptionServiceImplTest {
    private WaterConsumptionServiceImpl service;
    public WaterConsumptionServiceImplTest() {
        this.service = new WaterConsumptionServiceImpl();
    }
    public void addConsumer(int consumed) {
        List<Consumer> before = this.service.getConsumers();
        this.service.addConsumer(consumed);
        List<Consumer> after = this.service.getConsumers();
        assertTrue(before.size() < after.size());
    }

}
