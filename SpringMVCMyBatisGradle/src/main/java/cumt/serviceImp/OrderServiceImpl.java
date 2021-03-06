package cumt.serviceImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cumt.domain.Order;
import cumt.mapper.OrderMapper;
import cumt.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public void insertOrder(Order order) {
		orderMapper.insertOrder(order);
	}

	@Override
	public List<Order> selectAllOrder() {
		List<Order> list = orderMapper.selectAllOrder();
		return list;
	}

	@Override
	public void deleteOrderById(int id) {
		orderMapper.deleteOrderById(id);
	}

	


	@Override
	public Order selectOrderById(int id) {
		Order order = orderMapper.selectOrderById(id);
		return order;
	}

	@Override
	public void updateOrder(int count, double price, int id) {
		orderMapper.updateOrder(count, price, id);
	}

	

	

}
