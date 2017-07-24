package cumt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cumt.domain.Order;



public interface OrderMapper {
	//添加订单
	@Insert("insert into tb_order(good_id,goodsname,count,total,price) values(#{good_id},#{goodsname},#{count},#{total},#{price})")
	void insertOrder(Order order);
	
	//查找订单
	@Select("select * from tb_order ")
	List<Order> selectAllOrder();
	
	//通过ID查找订单
	@Select("select * from tb_order where id=#{id}")
	Order selectOrderById(@Param("id") int id);
	
	//更新订单
	@Update("update tb_order set count=#{count} ,total=#{price}*#{count} where id =#{id}")
	void updateOrder(@Param("count") int count ,@Param("price") double price, @Param("id") int id);
	
	
	//删除订单
	@Delete("delete from tb_order where id=#{id}")
	void deleteOrderById(@Param("id") int id);
}
