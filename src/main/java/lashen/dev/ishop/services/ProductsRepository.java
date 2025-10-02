package lashen.dev.ishop.services;

import lashen.dev.ishop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
