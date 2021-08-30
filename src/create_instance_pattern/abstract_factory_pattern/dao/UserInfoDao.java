package create_instance_pattern.abstract_factory_pattern.dao;

import create_instance_pattern.abstract_factory_pattern.entity.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
