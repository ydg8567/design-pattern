package create_instance_pattern.abstract_factory_pattern.factory;

import create_instance_pattern.abstract_factory_pattern.dao.ProductDao;
import create_instance_pattern.abstract_factory_pattern.dao.UserInfoDao;

public interface DaoFactory {
    public UserInfoDao createUserInfoDao();
    public ProductDao createProductDao();
}
