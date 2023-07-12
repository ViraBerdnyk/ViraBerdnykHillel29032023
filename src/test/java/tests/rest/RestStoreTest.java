package tests.rest;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.rest.entities.OrderHW;
import ua.hillel.rest.entities.StoreController;

import java.io.IOException;

public class RestStoreTest {
    @Test
    public void createAndGetAndDeleteOrderTest() throws IOException {
        StoreController storeController = new StoreController();

        OrderHW order = new OrderHW();
        order.setId(1L);
        order.setPetId(1L);
        order.setQuantity(1);
        order.setShipDate("2023-07-15T11:36:00.000+0000");
        order.setStatus("placed");
        order.setComplete(true);

     
        storeController.placeOrder(order);

        OrderHW retrievedOrder = storeController.getOrderById(1L);
        Assert.assertEquals(order, retrievedOrder, "The order is not retrieved correctly");


        storeController.deleteOrder(1L);
    }
}

