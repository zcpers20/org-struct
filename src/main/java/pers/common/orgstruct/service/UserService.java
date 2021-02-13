package pers.common.orgstruct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.common.orgstruct.dto.UserDTO;
import pers.common.orgstruct.entity.User;
import pers.common.orgstruct.enumeration.RegisterType;

/**
 * @Author Qingyu
 * @Date 2021/2/8 18:48
 * @Version 1.0
 */
public interface UserService extends IService<User> {

	/**
	 * 用户注册
	 * @param account
	 * @param password
	 * @param passwordRepeat
	 * @param registerType      注册方式
	 */
	void userRegister(String account, String password, String passwordRepeat, RegisterType registerType);

	/**
	 * 保存用户信息
	 */
	void saveUser(UserDTO userDTO);
}
