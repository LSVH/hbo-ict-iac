package service;

import rest.WaterConsumptionService;

public class ServiceProvider {
    private static WaterConsumptionServiceImpl waterConsumptionService = new WaterConsumptionServiceImpl();
    public static WaterConsumptionServiceImpl getWaterConsumptionService() {
        return waterConsumptionService;
    }
}