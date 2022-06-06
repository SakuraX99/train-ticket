package delivery.repository;

import delivery.entity.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, String> {

    Delivery findById(UUID id);

    Delivery findByOrderId(UUID orderId);

    @Override
    List<Delivery> findAll();

    void deleteById(UUID id);

    void deleteFoodOrderByOrderId(UUID id);

}
