package create_instance_pattern.abstract_factory_pattern.database.oracle;

import create_instance_pattern.abstract_factory_pattern.dao.UserInfoDao;
import create_instance_pattern.abstract_factory_pattern.entity.UserInfo;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into Oracle DB productId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Oracle DB productId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into Oracle DB productId = " + userInfo.getUserId());
    }
}
