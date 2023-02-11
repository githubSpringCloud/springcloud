package cn.jt.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SysResult {
	private Integer status;
	private String msg;
	private Object data;

	public static SysResult sucess() {
		return new SysResult(200, "服务器调用成功!!", null);
	}

	public static SysResult sucess(Object data) {
		return new SysResult(200, "服务器调用成功!!", data);
	}

	public static SysResult sucess(String msg, Object data) {
		return new SysResult(200, msg, data);
	}

	public static SysResult fail() {
		return new SysResult(201, "服务器调用失败", null);
	}

	public static SysResult fail(String msg) {
		return new SysResult(201, msg, null);
	}

}
