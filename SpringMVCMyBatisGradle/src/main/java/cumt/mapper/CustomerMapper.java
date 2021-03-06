package cumt.mapper;

import org.apache.ibatis.annotations.Insert;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cumt.domain.Customer;



public interface CustomerMapper {
	@Select("select * from tb_customer where name=#{name} and password=#{password}")
	Customer find(@Param("name") String name, @Param("password") String password);
	
	@Insert("insert into tb_customer(name,password,qq,email) values(#{name},#{password},#{qq},#{email})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	void insertCustomer(Customer customer);
	
	//邮箱找回密码
	@Select("select * from tb_customer where name=#{name} and email=#{email}")
	Customer findPassword(@Param("name") String name, @Param("email") String email);
}
