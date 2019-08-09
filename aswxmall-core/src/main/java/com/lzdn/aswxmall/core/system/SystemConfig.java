package com.lzdn.aswxmall.core.system;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统设置
 */
public class SystemConfig {
    // 小程序相关配置
    public final static String ASWXMALL_WX_INDEX_NEW = "aswxmall_wx_index_new";
    public final static String ASWXMALL_WX_INDEX_HOT = "aswxmall_wx_index_hot";
    public final static String ASWXMALL_WX_INDEX_BRAND = "aswxmall_wx_index_brand";
    public final static String ASWXMALL_WX_INDEX_TOPIC = "aswxmall_wx_index_topic";
    public final static String ASWXMALL_WX_INDEX_CATLOG_LIST = "aswxmall_wx_catlog_list";
    public final static String ASWXMALL_WX_INDEX_CATLOG_GOODS = "aswxmall_wx_catlog_goods";
    public final static String ASWXMALL_WX_SHARE = "aswxmall_wx_share";
    // 运费相关配置
    public final static String ASWXMALL_EXPRESS_FREIGHT_VALUE = "aswxmall_express_freight_value";
    public final static String ASWXMALL_EXPRESS_FREIGHT_MIN = "aswxmall_express_freight_min";
    // 订单相关配置
    public final static String ASWXMALL_ORDER_UNPAID = "aswxmall_order_unpaid";
    public final static String ASWXMALL_ORDER_UNCONFIRM = "aswxmall_order_unconfirm";
    public final static String ASWXMALL_ORDER_COMMENT = "aswxmall_order_comment";
    // 商场相关配置
    public final static String ASWXMALL_MALL_NAME = "aswxmall_mall_name";
    public final static String ASWXMALL_MALL_ADDRESS = "aswxmall_mall_address";
    public final static String ASWXMALL_MALL_PHONE = "aswxmall_mall_phone";
    public final static String ASWXMALL_MALL_QQ = "aswxmall_mall_qq";

    //所有的配置均保存在该 HashMap 中
    private static Map<String, String> SYSTEM_CONFIGS = new HashMap<>();

    private static String getConfig(String keyName) {
        return SYSTEM_CONFIGS.get(keyName);
    }

    private static Integer getConfigInt(String keyName) {
        return Integer.parseInt(SYSTEM_CONFIGS.get(keyName));
    }

    private static Boolean getConfigBoolean(String keyName) {
        return Boolean.valueOf(SYSTEM_CONFIGS.get(keyName));
    }

    private static BigDecimal getConfigBigDec(String keyName) {
        return new BigDecimal(SYSTEM_CONFIGS.get(keyName));
    }

    public static Integer getNewLimit() {
        return getConfigInt(ASWXMALL_WX_INDEX_NEW);
    }

    public static Integer getHotLimit() {
        return getConfigInt(ASWXMALL_WX_INDEX_HOT);
    }

    public static Integer getBrandLimit() {
        return getConfigInt(ASWXMALL_WX_INDEX_BRAND);
    }

    public static Integer getTopicLimit() {
        return getConfigInt(ASWXMALL_WX_INDEX_TOPIC);
    }

    public static Integer getCatlogListLimit() {
        return getConfigInt(ASWXMALL_WX_INDEX_CATLOG_LIST);
    }

    public static Integer getCatlogMoreLimit() {
        return getConfigInt(ASWXMALL_WX_INDEX_CATLOG_GOODS);
    }

    public static boolean isAutoCreateShareImage() {
        return getConfigBoolean(ASWXMALL_WX_SHARE);
    }

    public static BigDecimal getFreight() {
        return getConfigBigDec(ASWXMALL_EXPRESS_FREIGHT_VALUE);
    }

    public static BigDecimal getFreightLimit() {
        return getConfigBigDec(ASWXMALL_EXPRESS_FREIGHT_MIN);
    }

    public static Integer getOrderUnpaid() {
        return getConfigInt(ASWXMALL_ORDER_UNPAID);
    }

    public static Integer getOrderUnconfirm() {
        return getConfigInt(ASWXMALL_ORDER_UNCONFIRM);
    }

    public static Integer getOrderComment() {
        return getConfigInt(ASWXMALL_ORDER_COMMENT);
    }

    public static String getMallName() {
        return getConfig(ASWXMALL_MALL_NAME);
    }

    public static String getMallAddress() {
        return getConfig(ASWXMALL_MALL_ADDRESS);
    }

    public static String getMallPhone() {
        return getConfig(ASWXMALL_MALL_PHONE);
    }

    public static String getMallQQ() {
        return getConfig(ASWXMALL_MALL_QQ);
    }

    public static void setConfigs(Map<String, String> configs) {
        SYSTEM_CONFIGS = configs;
    }

    public static void updateConfigs(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            SYSTEM_CONFIGS.put(entry.getKey(), entry.getValue());
        }
    }
}