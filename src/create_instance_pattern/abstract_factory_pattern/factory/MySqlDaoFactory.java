package create_instance_pattern.abstract_factory_pattern.factory;

import create_instance_pattern.abstract_factory_pattern.dao.ProductDao;
import create_instance_pattern.abstract_factory_pattern.dao.UserInfoDao;
import create_instance_pattern.abstract_factory_pattern.database.mysql.ProductMySqlDao;
import create_instance_pattern.abstract_factory_pattern.database.mysql.UserInfoMySqlDao;

public class MySqlDaoFactory implements DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
