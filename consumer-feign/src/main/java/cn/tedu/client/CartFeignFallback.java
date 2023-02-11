package cn.tedu.client;

import cn.jt.common.vo.SysResult;
import org.springframework.stereotype.Component;

@Component
public class CartFeignFallback implements CartFeign{

    @Override
    public SysResult mycart(String userId) {
        return SysResult.build(400, "mycart error");
    }
}
