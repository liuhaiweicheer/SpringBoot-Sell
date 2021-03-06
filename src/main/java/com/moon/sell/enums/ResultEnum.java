package com.moon.sell.enums;

import lombok.Getter;
import org.aspectj.apache.bcel.classfile.Code;

/**
 * @author lhw
 * @date 2020/8/14
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1,"参数不正确"),

    PRODUCT_NOT_EXIST(10,"商品不存在"),

    PRODUCT_STOCK_ERROR(11,"商品库存不足"),

    ORDER_NOT_EXIST(12,"订单不存在"),

    ORDERDETAIL_NOT_EXIST(13,"商品详情不存在"),

    ORDER_STATUS_ERROR(14, "订单状态不正确"),

    ORDER_UPDATE_FAIL(15, "订单等新失败"),

    ORDER_DETAIL_EMPTY(16,"订单详情为空"),

    ORDER_PAY_STATUS_ERROR(17,"支付状态不正确"),

    CART_EMPTY(18,"购物车为空"),

    ORDER_OWNER_ERROR(19,"不是本人订单"),

    WECHAT_MP_ERROR(20,"微信公总账号方面错误"),

    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(21,"银行支付信息错误"),

    ORDER_CANCEL_SUCCESS(22,"取消订单成功"),

    ORDER_FINISH_SUCCESS(23,"订单完成"),

    PRODUCT_STATUS_ERROR(24,"商品状态不正确"),

    LOGIN_ERROR(25, "openid 匹配失败， 登录信息不真确"),

    LOGOUT_SUCCESS(26,"登出成功")





    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }



}
