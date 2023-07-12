
package ua.hillel.rest.entities;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ua.hillel.rest.entities.OrderHW;

import java.io.IOException;

public class StoreController {
    private static final String BASE_URL = "https://petstore.swagger.io/v2/store/order";

    public void placeOrder(OrderHW order) throws IOException {
        Gson gson = new Gson();
        RequestBody requestBody = RequestBody.create(gson.toJson(order).getBytes());

        Request request = new Request.Builder()
                .url(BASE_URL)
                .post(requestBody)
                .header("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        OrderHW newOrder = gson.fromJson(response.body().string(), OrderHW.class);
        System.out.println("Placed order: " + newOrder);
    }

    public OrderHW getOrderById(Long id) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "/" + id)
                .get()
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        Gson gson = new Gson();
        OrderHW order = gson.fromJson(response.body().string(), OrderHW.class);
        System.out.println("Retrieved order: " + order);
        return order;
    }

    public void deleteOrder(Long id) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "/" + id)
                .delete()
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println("Delete order response: " + response.code());
    }
}