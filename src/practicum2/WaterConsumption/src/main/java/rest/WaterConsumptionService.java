package rest;

import service.Consumer;
import service.ServiceProvider;
import service.WaterConsumptionServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;

@Path("/water-consumption")
public class WaterConsumptionService {
    private WaterConsumptionServiceImpl service;
    public WaterConsumptionService() {
        super();
        this.service = ServiceProvider.getWaterConsumptionService();
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String, Integer> getConsumption() {
        return this.service.getConsumption();
    }

    @GET
    @Path("/consumers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Consumer> getConsumers() {
        return this.service.getConsumers();
    }

    @GET
    @Path("/add-consumer/{consumed}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Consumer> addConsumer(@PathParam("consumed") int consumed) {
        this.service.addConsumer(consumed);
        return this.getConsumers();
    }

    @PUT
    @Path("/set-reduction")
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String, Integer> setReduction(int reduction) {
        this.service.setReduction(reduction);
        return this.getConsumption();
    }

    @DELETE
    @Path("/reset")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Consumer> reset() {
        this.service.reset();
        return this.getConsumers();
    }

}