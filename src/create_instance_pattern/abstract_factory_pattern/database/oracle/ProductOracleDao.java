package create_instance_pattern.abstract_factory_pattern.database.oracle;

import create_instance_pattern.abstract_factory_pattern.dao.ProductDao;
import create_instance_pattern.abstract_factory_pattern.entity.Product;

public class ProductOracleDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into Oracle DB productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into Oracle DB productId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into Oracle DB productId = " + product.getProductId());
    }
}
