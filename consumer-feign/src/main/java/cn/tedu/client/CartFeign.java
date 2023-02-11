package cn.tedu.client;

import cn.jt.common.vo.SysResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 这个接口相当于把原来的服务提供者项目当成一个Service类
@FeignClient(value="provider-cart",fallback = CartFeignFallback.class)
public interface CartFeign {

	/*
	 * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
	 */
	@RequestMapping(value="/query/{userId}",method=RequestMethod.GET)
	public SysResult mycart(@PathVariable("userId") String userId);
}
