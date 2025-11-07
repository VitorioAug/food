package sp.senac.br.food.order;

import org.hibernate.sql.Update;

public interface OrderStatusObserver {
    public Update onOrderStatusChanged(Order order);

    
}