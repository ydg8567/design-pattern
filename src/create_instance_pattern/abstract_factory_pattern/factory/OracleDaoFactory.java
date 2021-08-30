package create_instance_pattern.abstract_factory_pattern.factory;

import create_instance_pattern.abstract_factory_pattern.dao.ProductDao;
import create_instance_pattern.abstract_factory_pattern.dao.UserInfoDao;
import create_instance_pattern.abstract_factory_pattern.database.oracle.ProductOracleDao;
import create_instance_pattern.abstract_factory_pattern.database.oracle.UserInfoOracleDao;

public class OracleDaoFactory implements DaoFactory{

    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
