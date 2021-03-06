package com.gsccs.eb.api.domain.trade;

import java.util.Date;

import com.gsccs.eb.api.domain.base.Domain;

/**
 * 退款超时
 * @author x.d zhang
 *
 */
public class RefundRemindTimeout extends Domain {

	private static final long serialVersionUID = 4765835537341541713L;

	/**
	 * 是否存在超时。可选值:true(是),false(否)
	 */
	private Boolean existTimeout;

	/**
	 * 提醒的类型（退款详情中提示信息的类型）
	 */
	private Long remindType;

	/**
	 * 超时时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	private Date timeout;
}
