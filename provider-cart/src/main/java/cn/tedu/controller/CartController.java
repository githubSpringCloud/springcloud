package cn.tedu.controller;

import cn.jt.common.vo.SysResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	@GetMapping("/query/{userId}")
	public SysResult hello(@PathVariable String userId) {
		int x=1/0;
		return SysResult.sucess("userId",userId);
	}
}
