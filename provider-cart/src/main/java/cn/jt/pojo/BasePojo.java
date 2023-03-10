package cn.jt.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

//pojo基类，完成2个任务，2个日期，实现序列化
@Data
@Accessors(chain = true)
public class BasePojo implements Serializable {

	private static final long serialVersionUID = -3121669440061630976L;
	private Date created;
	private Date updated;

}
