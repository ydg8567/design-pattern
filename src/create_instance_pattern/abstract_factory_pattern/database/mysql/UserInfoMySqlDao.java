package create_instance_pattern.abstract_factory_pattern.database.mysql;

import create_instance_pattern.abstract_factory_pattern.dao.UserInfoDao;
import create_instance_pattern.abstract_factory_pattern.entity.UserInfo;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MySql DB productId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MySql DB productId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into MySql DB productId = " + userInfo.getUserId());
    }
}
