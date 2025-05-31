package ch25_3.data;

import ch25_3.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
            extends CrudRepository<TacoOrder, String> {

}