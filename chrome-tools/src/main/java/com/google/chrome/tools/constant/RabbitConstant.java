package com.google.chrome.tools.constant;

public class RabbitConstant {

    public static final String DEAD_LETTER_EXCHANGE = "TDL_EXCHANGE";
    public static final String DEAD_LETTER_TEST_ROUTING_KEY = "TDL_KEY";
    public static final String DEAD_LETTER_REDIRECT_ROUTING_KEY = "TKEY_R";
    public static final String DEAD_LETTER_QUEUE = "TDL_QUEUE";
    public static final String REDIRECT_QUEUE = "TREDIRECT_QUEUE";


    public static  final String QUEUE_NAME = "5800R";
    public static final String EXCHANGE_NAME = "AMD";
    public static final String ROUTING_KEY = "intel";

    public static final String ORDER_SENDING = "0"; //发送中

    public static final String ORDER_SEND_SUCCESS = "1"; //成功

    public static final String ORDER_SEND_FAILURE = "2"; //失败

    public static final int ORDER_TIMEOUT = 1; //分钟超时单位：min

}
