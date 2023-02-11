package cn.tedu.controller;

import cn.jt.common.vo.SysResult;
import cn.tedu.client.CartFeign;
import cn.tedu.client.EurekaServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	@Autowired
	private CartFeign cartFeign;
	
	@GetMapping("/query/{userId}")
	@ResponseBody
	public SysResult hello(@PathVariable String userId){
		return cartFeign.mycart(userId);
	}
}
