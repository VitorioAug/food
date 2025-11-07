package sp.senac.br.food.order;

import com.vaadin.flow.data.provider.ArrayUpdater.Update;

public interface OrderStatusObserver {
    public Update orderStatusUpdated(Order order);

    void update(Order order); 
}