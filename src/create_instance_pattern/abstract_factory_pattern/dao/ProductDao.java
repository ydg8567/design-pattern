package create_instance_pattern.abstract_factory_pattern.dao;

import create_instance_pattern.abstract_factory_pattern.entity.Product;

public interface ProductDao {
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
