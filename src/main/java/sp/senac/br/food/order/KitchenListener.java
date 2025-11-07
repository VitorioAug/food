package sp.senac.br.food.order;

import com.vaadin.flow.data.provider.ArrayUpdater.Update;

import sp.senac.br.food.views.HomeView;

public class KitchenListener implements OrderStatusObserver {

    private final HomeView homeView;

    public KitchenListener(HomeView homeView) {
        this.homeView = homeView;
    }

    @Override
    public void update(Order order) {
        if (order.getStatus() == OrderStatus.PREPARING) {     
            homeView.addToKitchen(order);
            homeView.addLog("Pedido #" + order.getId() + " enviado para a cozinha.");
        }
    }

    @Override
    public Update orderStatusUpdated(Order order) {
        throw new UnsupportedOperationException("Unimplemented method 'orderStatusUpdated'");
    }
}
