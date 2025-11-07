package sp.senac.br.food.order;

import com.vaadin.flow.data.provider.ArrayUpdater.Update;
import sp.senac.br.food.views.HomeView;


public class DeliveryListener implements OrderStatusObserver {

    private final HomeView homeView;

    public DeliveryListener(HomeView homeView) {
        this.homeView = homeView;
    }

    @Override
    public  void update(Order order) {
        if (order.getStatus() == OrderStatus.IN_TRANSIT) {
            homeView.addToDeliveryPane(order);
            homeView.addLog("Pedido #" + order.getId() + " saiu para entrega.");
        }
    }

    @Override
    public Update orderStatusUpdated(Order order) {
        throw new UnsupportedOperationException("Unimplemented method 'orderStatusUpdated'");
    }
    

}
