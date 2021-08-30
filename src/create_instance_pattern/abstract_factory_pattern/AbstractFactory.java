package create_instance_pattern.abstract_factory_pattern;

import create_instance_pattern.abstract_factory_pattern.dao.ProductDao;
import create_instance_pattern.abstract_factory_pattern.dao.UserInfoDao;
import create_instance_pattern.abstract_factory_pattern.entity.Product;
import create_instance_pattern.abstract_factory_pattern.entity.UserInfo;
import create_instance_pattern.abstract_factory_pattern.factory.DaoFactory;
import create_instance_pattern.abstract_factory_pattern.factory.MySqlDaoFactory;
import create_instance_pattern.abstract_factory_pattern.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AbstractFactory {
    public static void main(String[] args) throws IOException {
        String propertyFilePath = "src/create_instance_pattern/abstract_factory_pattern/db.properties";
        FileInputStream fis = new FileInputStream(propertyFilePath);

        Properties properties = new Properties();
        properties.load(fis);

        String dbType = properties.getProperty("DBTYPE");
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("이순신");

        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("TV");

        DaoFactory daoFactory = null;

        if (dbType.equals("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        } else if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        } else {
            System.out.println("error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

        ProductDao productDao = daoFactory.createProductDao();
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);
    }
}
