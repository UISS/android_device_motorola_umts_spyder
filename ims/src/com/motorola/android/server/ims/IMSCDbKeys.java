package com.motorola.android.server.ims;

public enum IMSCDbKeys
{
  static
  {
    IMS_SESSION_DB_ANSER_IN_180_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_ANSER_IN_180_KEY_STR", 1);
    IMS_SESSION_DB_AUTO_TEST_TCP_PORT_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_AUTO_TEST_TCP_PORT_KEY_STR", 2);
    IMS_SESSION_DB_CONF_FACTORY_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_CONF_FACTORY_KEY_STR", 3);
    IMS_SESSION_DB_DECODE_BEFORE_CONNECT = new IMSCDbKeys("IMS_SESSION_DB_DECODE_BEFORE_CONNECT", 4);
    IMS_SESSION_DB_IMS_CLIENT_AVAILABLE = new IMSCDbKeys("IMS_SESSION_DB_IMS_CLIENT_AVAILABLE", 5);
    IMS_SESSION_DB_DHCP_CLIENT_ID_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DHCP_CLIENT_ID_KEY_STR", 6);
    IMS_SESSION_DB_DHCP_CLIENT_PORT_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DHCP_CLIENT_PORT_KEY_STR", 7);
    IMS_SESSION_DB_DHCP_ENABLED_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DHCP_ENABLED_KEY_STR", 8);
    IMS_SESSION_DB_DHCP_RETRIES_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DHCP_RETRIES_KEY_STR", 9);
    IMS_SESSION_DB_DHCP_RETRY_TIMER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DHCP_RETRY_TIMER_KEY_STR", 10);
    IMS_SESSION_DB_DHCP_SERVER_ADDRESS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DHCP_SERVER_ADDRESS_KEY_STR", 11);
    IMS_SESSION_DB_DHCP_SERVER_PORT_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DHCP_SERVER_PORT_KEY_STR", 12);
    IMS_SESSION_DB_DTMF_MIN_DURATION_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DTMF_MIN_DURATION_KEY_STR", 13);
    IMS_SESSION_DB_DTMF_MIN_PAUSE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DTMF_MIN_PAUSE_KEY_STR", 14);
    IMS_SESSION_DB_DTMF_MIN_VOLUME_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DTMF_MIN_VOLUME_KEY_STR", 15);
    IMS_SESSION_DB_USE_REG_FQDN_AS_PHN_CONTEXT = new IMSCDbKeys("IMS_SESSION_DB_USE_REG_FQDN_AS_PHN_CONTEXT", 16);
    IMS_SESSION_DB_EVRC1_FIXED_RATE = new IMSCDbKeys("IMS_SESSION_DB_EVRC1_FIXED_RATE", 17);
    IMS_SESSION_DB_BUNDLE_RATE = new IMSCDbKeys("IMS_SESSION_DB_BUNDLE_RATE", 18);
    IMS_SESSION_DB_EVRC_DTXMAX = new IMSCDbKeys("IMS_SESSION_DB_EVRC_DTXMAX", 19);
    IMS_SESSION_DB_EVRC_DTXMIN = new IMSCDbKeys("IMS_SESSION_DB_EVRC_DTXMIN", 20);
    IMS_SESSION_DB_EVRC_HANGOVER = new IMSCDbKeys("IMS_SESSION_DB_EVRC_HANGOVER", 21);
    IMS_SESSION_DB_EVRC_USE_DTX = new IMSCDbKeys("IMS_SESSION_DB_EVRC_USE_DTX", 22);
    IMS_SESSION_DB_GEN_LINGER_TIMER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_GEN_LINGER_TIMER_KEY_STR", 23);
    IMS_SESSION_DB_INIT_DELAY_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_INIT_DELAY_KEY_STR", 24);
    IMS_SESSION_DB_INV_LINGER_TIMER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_INV_LINGER_TIMER_KEY_STR", 25);
    IMS_SESSION_DB_MAX_CALLS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MAX_CALLS_KEY_STR", 26);
    IMS_SESSION_DB_MAX_CLIENTS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MAX_CLIENTS_KEY_STR", 27);
    IMS_SESSION_DB_MAX_ELEMS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MAX_ELEMS_KEY_STR", 28);
    IMS_SESSION_DB_MAX_MSGS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MAX_MSGS_KEY_STR", 29);
    IMS_SESSION_DB_MAX_SUBS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MAX_SUBS_KEY_STR", 30);
    IMS_SESSION_DB_MAX_TRANS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MAX_TRANS_KEY_STR", 31);
    IMS_SESSION_DB_ENCODE_ON_ANSWER = new IMSCDbKeys("IMS_SESSION_DB_ENCODE_ON_ANSWER", 32);
    IMS_SESSION_DB_MAX_NUM_REFER_CLIENTS = new IMSCDbKeys("IMS_SESSION_DB_MAX_NUM_REFER_CLIENTS", 33);
    IMS_SESSION_DB_MWI_PASSWORD_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MWI_PASSWORD_KEY_STR", 34);
    IMS_SESSION_DB_MWI_PORT_NUM_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MWI_PORT_NUM_KEY_STR", 35);
    IMS_SESSION_DB_MWI_PUBLIC_ID_URI_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MWI_PUBLIC_ID_URI_KEY_STR", 36);
    IMS_SESSION_DB_MWI_PRIVATE_USER_ID_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MWI_PRIVATE_USER_ID_KEY_STR", 37);
    IMS_SESSION_DB_MWI_REALM_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MWI_REALM_KEY_STR", 38);
    IMS_SESSION_DB_MWI_SERVER_ADDR_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MWI_SERVER_ADDR_KEY_STR", 39);
    IMS_SESSION_DB_MAX_NUM_NOTIFIER = new IMSCDbKeys("IMS_SESSION_DB_MAX_NUM_NOTIFIER", 40);
    IMS_SESSION_DB_PCSCF_AKA_OP_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_AKA_OP_KEY_STR", 41);
    IMS_SESSION_DB_PCSCF_AKA_SECRET_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_AKA_SECRET_KEY_STR", 42);
    IMS_SESSION_DB_PCSCF_AUTH_INITIAL_RES_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_AUTH_INITIAL_RES_STR", 43);
    IMS_SESSION_DB_CTRL_REG_CALL_ID = new IMSCDbKeys("IMS_SESSION_DB_CTRL_REG_CALL_ID", 44);
    IMS_SESSION_DB_PCSCF_CONTACT_USER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_CONTACT_USER_KEY_STR", 45);
    IMS_SESSION_DB_PCSCF_DIALED_PREFIX_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_DIALED_PREFIX_KEY_STR", 46);
    IMS_SESSION_DB_PCSCF_PASSWORD_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_PASSWORD_KEY_STR", 47);
    IMS_SESSION_DB_PCSCF_PORT_NUM_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_PORT_NUM_KEY_STR", 48);
    IMS_SESSION_DB_PCSCF_PUBLIC_ID_URI_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_PUBLIC_ID_URI_KEY_STR", 49);
    IMS_SESSION_DB_PCSCF_PRIVATE_USER_ID_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_PRIVATE_USER_ID_KEY_STR", 50);
    IMS_SESSION_DB_PCSCF_REALM_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_REALM_KEY_STR", 51);
    IMS_SESSION_DB_PCSCF_SEC_AGREE_SUPPORT_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_SEC_AGREE_SUPPORT_KEY_STR", 52);
    IMS_SESSION_DB_PCSCF_SERVER_ADDR_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_SERVER_ADDR_KEY_STR", 53);
    IMS_SESSION_DB_PING_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PING_KEY_STR", 54);
    IMS_SESSION_DB_PRECONDITION_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PRECONDITION_KEY_STR", 55);
    IMS_SESSION_DB_PRECOND_LEVEL_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PRECOND_LEVEL_KEY_STR", 56);
    IMS_SESSION_DB_PREFERRED_VOCODER_TYPE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PREFERRED_VOCODER_TYPE_KEY_STR", 57);
    IMS_SESSION_DB_PROVISIONAL_TIMER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_PROVISIONAL_TIMER_KEY_STR", 58);
    IMS_SESSION_DB_RTP_DEFAULT_PORT_RANGE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_RTP_DEFAULT_PORT_RANGE_KEY_STR", 59);
    IMS_SESSION_DB_EVRC_PORT_RANGE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_EVRC_PORT_RANGE_KEY_STR", 60);
    IMS_SESSION_DB_EVRC_TOS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_EVRC_TOS_KEY_STR", 61);
    IMS_SESSION_DB_G711_PORT_RANGE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_G711_PORT_RANGE_KEY_STR", 62);
    IMS_SESSION_DB_G711_TOS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_G711_TOS_KEY_STR", 63);
    IMS_SESSION_DB_WIN_SIZE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_WIN_SIZE_KEY_STR", 64);
    IMS_SESSION_DB_VOCODER_FORMAT_TO_USE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_VOCODER_FORMAT_TO_USE_KEY_STR", 65);
    IMS_SESSION_DB_VOICE_EVRC_QOS_PROFILE_ID_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_VOICE_EVRC_QOS_PROFILE_ID_KEY_STR", 66);
    IMS_SESSION_DB_VOICE_G711_QOS_PROFILE_ID_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_VOICE_G711_QOS_PROFILE_ID_KEY_STR", 67);
    IMS_SESSION_DB_QOS_WITH_PLAIN_SIP_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_QOS_WITH_PLAIN_SIP_KEY_STR", 68);
    IMS_SESSION_DB_REG_RETRY_AFTER_TIMER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_REG_RETRY_AFTER_TIMER_KEY_STR", 69);
    IMS_SESSION_DB_REQUEST_TIMEOUT_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_REQUEST_TIMEOUT_KEY_STR", 70);
    IMS_SESSION_DB_REQUEST_TCP_QOS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_REQUEST_TCP_QOS_KEY_STR", 71);
    IMS_SESSION_DB_RETRANS_T1_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_RETRANS_T1_KEY_STR", 72);
    IMS_SESSION_DB_RETRANS_T2_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_RETRANS_T2_KEY_STR", 73);
    IMS_SESSION_DB_RETRANS_T4_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_RETRANS_T4_KEY_STR", 74);
    IMS_SESSION_DB_ROHC_PORT_RANGE = new IMSCDbKeys("IMS_SESSION_DB_ROHC_PORT_RANGE", 75);
    IMS_SESSION_DB_RTCP_AUDIO_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_RTCP_AUDIO_KEY_STR", 76);
    IMS_SESSION_DB_RTCP_VIDEO_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_RTCP_VIDEO_KEY_STR", 77);
    IMS_SESSION_DB_SCSCF_SERVER_NAME_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SCSCF_SERVER_NAME_KEY_STR", 78);
    IMS_SESSION_DB_SDP_TEST_DYNAMIC_PAYLOAD_BASE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SDP_TEST_DYNAMIC_PAYLOAD_BASE_KEY_STR", 79);
    IMS_SESSION_DB_SDP_TEST_HOLD_STYLE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SDP_TEST_HOLD_STYLE_KEY_STR", 80);
    IMS_SESSION_DB_SDP_TEST_MULT_CODECS_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SDP_TEST_MULT_CODECS_KEY_STR", 81);
    IMS_SESSION_DB_DISABLE_RFC2833_DTMF_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_DISABLE_RFC2833_DTMF_KEY_STR", 82);
    IMS_SESSION_DB_SDP_TEST_REJ_MODIFY_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SDP_TEST_REJ_MODIFY_KEY_STR", 83);
    IMS_SESSION_DB_SDP_TEST_DTMF_PAYLOAD_TYPE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SDP_TEST_DTMF_PAYLOAD_TYPE_KEY_STR", 84);
    IMS_SESSION_DB_SESSION_TIMER_SESSION_MIN_SE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SESSION_TIMER_SESSION_MIN_SE_KEY_STR", 85);
    IMS_SESSION_DB_SESSION_TIMER_SESSION_EXPIRES_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SESSION_TIMER_SESSION_EXPIRES_KEY_STR", 86);
    IMS_SESSION_DB_SESSION_TIMER = new IMSCDbKeys("IMS_SESSION_DB_SESSION_TIMER", 87);
    IMS_SESSION_DB_SIGCOMP = new IMSCDbKeys("IMS_SESSION_DB_SIGCOMP", 88);
    IMS_SESSION_DB_SIGNALING_QOS_PROFILE_ID_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SIGNALING_QOS_PROFILE_ID_KEY_STR", 89);
    IMS_SESSION_DB_SIP_PORT_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SIP_PORT_KEY_STR", 90);
    IMS_SESSION_DB_SMS_OVER_IMS_PROTOCOL_TYPE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SMS_OVER_IMS_PROTOCOL_TYPE_KEY_STR", 91);
    IMS_SESSION_DB_STUN_DISCOVER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_STUN_DISCOVER_KEY_STR", 92);
    IMS_SESSION_DB_STUN_ENABLED_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_STUN_ENABLED_KEY_STR", 93);
    IMS_SESSION_DB_STUN_RETRIES_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_STUN_RETRIES_KEY_STR", 94);
    IMS_SESSION_DB_STUN_RETRY_TIMER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_STUN_RETRY_TIMER_KEY_STR", 95);
    IMS_SESSION_DB_STUN_SECURE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_STUN_SECURE_KEY_STR", 96);
    IMS_SESSION_DB_STUN_SERVER_NAME_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_STUN_SERVER_NAME_KEY_STR", 97);
    IMS_SESSION_DB_STUN_SERVER_PORT_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_STUN_SERVER_PORT_KEY_STR", 98);
    IMS_SESSION_DB_STUN_UPDATE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_STUN_UPDATE_KEY_STR", 99);
    IMS_SESSION_DB_SUBS_NO_NOTIFY_TIMER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SUBS_NO_NOTIFY_TIMER_KEY_STR", 100);
    IMS_SESSION_DB_SUBS_REG_EV_CONF_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SUBS_REG_EV_CONF_KEY_STR", 101);
    IMS_SESSION_DB_SYMMETRIC_RTP_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SYMMETRIC_RTP_KEY_STR", 102);
    IMS_SESSION_DB_PACC_NWINFO_HDR_SUPPORTED = new IMSCDbKeys("IMS_SESSION_DB_PACC_NWINFO_HDR_SUPPORTED", 103);
    IMS_SESSION_DB_PROXYAUTH_ACROSS_REQUESTS = new IMSCDbKeys("IMS_SESSION_DB_PROXYAUTH_ACROSS_REQUESTS", 104);
    IMS_SESSION_DB_SIGNALING_QOS_PORT_RANGE = new IMSCDbKeys("IMS_SESSION_DB_SIGNALING_QOS_PORT_RANGE", 105);
    IMS_SESSION_DB_SIGNALING_TOS = new IMSCDbKeys("IMS_SESSION_DB_SIGNALING_TOS", 106);
    IMS_SESSION_DB_AD_HOC_CONFSERVER_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_AD_HOC_CONFSERVER_KEY_STR", 107);
    IMS_SESSION_DB_DEFER_UI_NOTIFY = new IMSCDbKeys("IMS_SESSION_DB_DEFER_UI_NOTIFY", 108);
    IMS_SESSION_DB_EVRC_MAX_RATE = new IMSCDbKeys("IMS_SESSION_DB_EVRC_MAX_RATE", 109);
    IMS_SESSION_DB_IMS_DEBUG_MODE = new IMSCDbKeys("IMS_SESSION_DB_IMS_DEBUG_MODE", 110);
    IMS_SESSION_DB_IMS_DEBUG_MODE_PORT = new IMSCDbKeys("IMS_SESSION_DB_IMS_DEBUG_MODE_PORT", 111);
    IMS_SESSION_DB_IMS_UNREGISTER_TIMER_DURATION = new IMSCDbKeys("IMS_SESSION_DB_IMS_UNREGISTER_TIMER_DURATION", 112);
    IMS_SESSION_DB_BEARER_QOS_BEFORE_REG = new IMSCDbKeys("IMS_SESSION_DB_BEARER_QOS_BEFORE_REG", 113);
    IMS_SESSION_DB_INGORE_QOS_ALLOC_FAILURE = new IMSCDbKeys("IMS_SESSION_DB_INGORE_QOS_ALLOC_FAILURE", 114);
    IMS_SESSION_DB_SIGCOMP_ALGORITHM = new IMSCDbKeys("IMS_SESSION_DB_SIGCOMP_ALGORITHM", 115);
    IMS_SESSION_DB_SIPCOMPARTMENT_PER_REGCYCLE = new IMSCDbKeys("IMS_SESSION_DB_SIPCOMPARTMENT_PER_REGCYCLE", 116);
    IMS_SESSION_DB_REG_EXPIRES_VAL = new IMSCDbKeys("IMS_SESSION_DB_REG_EXPIRES_VAL", 117);
    IMS_SESSION_DB_PHONE_CONTEXT = new IMSCDbKeys("IMS_SESSION_DB_PHONE_CONTEXT", 118);
    IMS_SESSION_DB_IMS_NWAY_CONF_USE_CONTACT = new IMSCDbKeys("IMS_SESSION_DB_IMS_NWAY_CONF_USE_CONTACT", 119);
    IMS_SESSION_DB_MAX_NUM_TAPI_SESSIONS = new IMSCDbKeys("IMS_SESSION_DB_MAX_NUM_TAPI_SESSIONS", 120);
    IMS_SESSION_DB_MAX_NUM_TAPI_CALLS = new IMSCDbKeys("IMS_SESSION_DB_MAX_NUM_TAPI_CALLS", 121);
    IMS_SESSION_DB_MAX_NUM_MWI_SESSIONS = new IMSCDbKeys("IMS_SESSION_DB_MAX_NUM_MWI_SESSIONS", 122);
    IMS_SESSION_DB_PCSCF_LIST_SUPPORT = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_LIST_SUPPORT", 123);
    IMS_SESSION_DB_IMS_VOIP_METRICS_HEADER = new IMSCDbKeys("IMS_SESSION_DB_IMS_VOIP_METRICS_HEADER", 124);
    IMS_SESSION_DB_SDP_HOLD_CONN_MODE_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_SDP_HOLD_CONN_MODE_KEY_STR", 125);
    IMS_SESSION_DB_HOOK_FLASH_TYPE = new IMSCDbKeys("IMS_SESSION_DB_HOOK_FLASH_TYPE", 126);
    IMS_SESSION_DB_PCSCF_IP_PROTECT_FROM_HN = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_IP_PROTECT_FROM_HN", 127);
    IMS_SESSION_DB_PCSCF_MUL_IP_SUPPORT_DNS_RESP = new IMSCDbKeys("IMS_SESSION_DB_PCSCF_MUL_IP_SUPPORT_DNS_RESP", 128);
    IMS_SESSION_DB_LEARN_RTP_SRC_PORT = new IMSCDbKeys("IMS_SESSION_DB_LEARN_RTP_SRC_PORT", 129);
    IMS_SESSION_DB_MIN_DELAY_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MIN_DELAY_KEY_STR", 130);
    IMS_SESSION_DB_MAX_DELAY_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_MAX_DELAY_KEY_STR", 131);
    IMS_SESSION_DB_EARLY_WINDOW_STR = new IMSCDbKeys("IMS_SESSION_DB_EARLY_WINDOW_STR", 132);
    IMS_SESSION_DB_LATE_WINDOW_STR = new IMSCDbKeys("IMS_SESSION_DB_LATE_WINDOW_STR", 133);
    IMS_SESSION_DB_ADAPTATION_INTERVAL_KEY_STR = new IMSCDbKeys("IMS_SESSION_DB_ADAPTATION_INTERVAL_KEY_STR", 134);
    IMS_SESSION_DB_ENABLE_REFER_METHOD = new IMSCDbKeys("IMS_SESSION_DB_ENABLE_REFER_METHOD", 135);
    IMS_SESSION_DB_DNS_SERVER_IPADDR = new IMSCDbKeys("IMS_SESSION_DB_DNS_SERVER_IPADDR", 136);
    IMS_SESSION_DB_MAX_NUM_REG_NONFATAL_ERROR = new IMSCDbKeys("IMS_SESSION_DB_MAX_NUM_REG_NONFATAL_ERROR", 137);
    IMS_SESSION_DB_SUB_EXPIRES_VAL = new IMSCDbKeys("IMS_SESSION_DB_SUB_EXPIRES_VAL", 138);
    IMS_SESSION_DB_USE_REG_EXPIRES_FOR_SUB = new IMSCDbKeys("IMS_SESSION_DB_USE_REG_EXPIRES_FOR_SUB", 139);
    IMS_SESSION_DB_CALLER_ID_IGNORE_FROM_HEADER = new IMSCDbKeys("IMS_SESSION_DB_CALLER_ID_IGNORE_FROM_HEADER", 140);
    IMS_SESSION_DB_FORK_DIRECTIVE_ENABLED = new IMSCDbKeys("IMS_SESSION_DB_FORK_DIRECTIVE_ENABLED", 141);
    IMS_SESSION_DB_FORK_PREFERRED = new IMSCDbKeys("IMS_SESSION_DB_FORK_PREFERRED", 142);
    IMS_SESSION_DB_PARALLEL_DIRECTIVE_ENABLED = new IMSCDbKeys("IMS_SESSION_DB_PARALLEL_DIRECTIVE_ENABLED", 143);
    IMS_SESSION_DB_PARALLEL_FORK_PREFERRED = new IMSCDbKeys("IMS_SESSION_DB_PARALLEL_FORK_PREFERRED", 144);
    IMS_SESSION_DB_HANDLE_FORKED_RESPONSE_TO_INVITE = new IMSCDbKeys("IMS_SESSION_DB_HANDLE_FORKED_RESPONSE_TO_INVITE", 145);
    IMS_SESSION_DB_IS_QOS_ON = new IMSCDbKeys("IMS_SESSION_DB_IS_QOS_ON", 146);
    IMS_SESSION_DB_ENABLE_ALWAYS_ADD_PCSCF_TO_SRVC_ROUTE = new IMSCDbKeys("IMS_SESSION_DB_ENABLE_ALWAYS_ADD_PCSCF_TO_SRVC_ROUTE", 147);
    IMS_SESSION_DB_REQUEST_IPV6_FROM_DSM = new IMSCDbKeys("IMS_SESSION_DB_REQUEST_IPV6_FROM_DSM", 148);
    IMS_SESSION_DB_MT_SMS_TO_HDR_VALIDATION = new IMSCDbKeys("IMS_SESSION_DB_MT_SMS_TO_HDR_VALIDATION", 149);
    IMS_SESSION_DB_LOCAL_IP_ADDR = new IMSCDbKeys("IMS_SESSION_DB_LOCAL_IP_ADDR", 150);
    IMS_SESSION_DB_PLATFORM_VER_STR = new IMSCDbKeys("IMS_SESSION_DB_PLATFORM_VER_STR", 151);
    IMS_SESSION_DB_MAXIMUM_INDEX = new IMSCDbKeys("IMS_SESSION_DB_MAXIMUM_INDEX", 152);
    IMSCDbKeys[] arrayOfIMSCDbKeys = new IMSCDbKeys[''];
    arrayOfIMSCDbKeys[0] = IMS_SESSION_DB_MINIMUM_INDEX;
    arrayOfIMSCDbKeys[1] = IMS_SESSION_DB_ANSER_IN_180_KEY_STR;
    arrayOfIMSCDbKeys[2] = IMS_SESSION_DB_AUTO_TEST_TCP_PORT_KEY_STR;
    arrayOfIMSCDbKeys[3] = IMS_SESSION_DB_CONF_FACTORY_KEY_STR;
    arrayOfIMSCDbKeys[4] = IMS_SESSION_DB_DECODE_BEFORE_CONNECT;
    arrayOfIMSCDbKeys[5] = IMS_SESSION_DB_IMS_CLIENT_AVAILABLE;
    arrayOfIMSCDbKeys[6] = IMS_SESSION_DB_DHCP_CLIENT_ID_KEY_STR;
    arrayOfIMSCDbKeys[7] = IMS_SESSION_DB_DHCP_CLIENT_PORT_KEY_STR;
    arrayOfIMSCDbKeys[8] = IMS_SESSION_DB_DHCP_ENABLED_KEY_STR;
    arrayOfIMSCDbKeys[9] = IMS_SESSION_DB_DHCP_RETRIES_KEY_STR;
    arrayOfIMSCDbKeys[10] = IMS_SESSION_DB_DHCP_RETRY_TIMER_KEY_STR;
    arrayOfIMSCDbKeys[11] = IMS_SESSION_DB_DHCP_SERVER_ADDRESS_KEY_STR;
    arrayOfIMSCDbKeys[12] = IMS_SESSION_DB_DHCP_SERVER_PORT_KEY_STR;
    arrayOfIMSCDbKeys[13] = IMS_SESSION_DB_DTMF_MIN_DURATION_KEY_STR;
    arrayOfIMSCDbKeys[14] = IMS_SESSION_DB_DTMF_MIN_PAUSE_KEY_STR;
    arrayOfIMSCDbKeys[15] = IMS_SESSION_DB_DTMF_MIN_VOLUME_KEY_STR;
    arrayOfIMSCDbKeys[16] = IMS_SESSION_DB_USE_REG_FQDN_AS_PHN_CONTEXT;
    arrayOfIMSCDbKeys[17] = IMS_SESSION_DB_EVRC1_FIXED_RATE;
    arrayOfIMSCDbKeys[18] = IMS_SESSION_DB_BUNDLE_RATE;
    arrayOfIMSCDbKeys[19] = IMS_SESSION_DB_EVRC_DTXMAX;
    arrayOfIMSCDbKeys[20] = IMS_SESSION_DB_EVRC_DTXMIN;
    arrayOfIMSCDbKeys[21] = IMS_SESSION_DB_EVRC_HANGOVER;
    arrayOfIMSCDbKeys[22] = IMS_SESSION_DB_EVRC_USE_DTX;
    arrayOfIMSCDbKeys[23] = IMS_SESSION_DB_GEN_LINGER_TIMER_KEY_STR;
    arrayOfIMSCDbKeys[24] = IMS_SESSION_DB_INIT_DELAY_KEY_STR;
    arrayOfIMSCDbKeys[25] = IMS_SESSION_DB_INV_LINGER_TIMER_KEY_STR;
    arrayOfIMSCDbKeys[26] = IMS_SESSION_DB_MAX_CALLS_KEY_STR;
    arrayOfIMSCDbKeys[27] = IMS_SESSION_DB_MAX_CLIENTS_KEY_STR;
    arrayOfIMSCDbKeys[28] = IMS_SESSION_DB_MAX_ELEMS_KEY_STR;
    arrayOfIMSCDbKeys[29] = IMS_SESSION_DB_MAX_MSGS_KEY_STR;
    arrayOfIMSCDbKeys[30] = IMS_SESSION_DB_MAX_SUBS_KEY_STR;
    arrayOfIMSCDbKeys[31] = IMS_SESSION_DB_MAX_TRANS_KEY_STR;
    arrayOfIMSCDbKeys[32] = IMS_SESSION_DB_ENCODE_ON_ANSWER;
    arrayOfIMSCDbKeys[33] = IMS_SESSION_DB_MAX_NUM_REFER_CLIENTS;
    arrayOfIMSCDbKeys[34] = IMS_SESSION_DB_MWI_PASSWORD_KEY_STR;
    arrayOfIMSCDbKeys[35] = IMS_SESSION_DB_MWI_PORT_NUM_KEY_STR;
    arrayOfIMSCDbKeys[36] = IMS_SESSION_DB_MWI_PUBLIC_ID_URI_KEY_STR;
    arrayOfIMSCDbKeys[37] = IMS_SESSION_DB_MWI_PRIVATE_USER_ID_KEY_STR;
    arrayOfIMSCDbKeys[38] = IMS_SESSION_DB_MWI_REALM_KEY_STR;
    arrayOfIMSCDbKeys[39] = IMS_SESSION_DB_MWI_SERVER_ADDR_KEY_STR;
    arrayOfIMSCDbKeys[40] = IMS_SESSION_DB_MAX_NUM_NOTIFIER;
    arrayOfIMSCDbKeys[41] = IMS_SESSION_DB_PCSCF_AKA_OP_KEY_STR;
    arrayOfIMSCDbKeys[42] = IMS_SESSION_DB_PCSCF_AKA_SECRET_KEY_STR;
    arrayOfIMSCDbKeys[43] = IMS_SESSION_DB_PCSCF_AUTH_INITIAL_RES_STR;
    arrayOfIMSCDbKeys[44] = IMS_SESSION_DB_CTRL_REG_CALL_ID;
    arrayOfIMSCDbKeys[45] = IMS_SESSION_DB_PCSCF_CONTACT_USER_KEY_STR;
    arrayOfIMSCDbKeys[46] = IMS_SESSION_DB_PCSCF_DIALED_PREFIX_KEY_STR;
    arrayOfIMSCDbKeys[47] = IMS_SESSION_DB_PCSCF_PASSWORD_KEY_STR;
    arrayOfIMSCDbKeys[48] = IMS_SESSION_DB_PCSCF_PORT_NUM_KEY_STR;
    arrayOfIMSCDbKeys[49] = IMS_SESSION_DB_PCSCF_PUBLIC_ID_URI_KEY_STR;
    arrayOfIMSCDbKeys[50] = IMS_SESSION_DB_PCSCF_PRIVATE_USER_ID_KEY_STR;
    arrayOfIMSCDbKeys[51] = IMS_SESSION_DB_PCSCF_REALM_KEY_STR;
    arrayOfIMSCDbKeys[52] = IMS_SESSION_DB_PCSCF_SEC_AGREE_SUPPORT_KEY_STR;
    arrayOfIMSCDbKeys[53] = IMS_SESSION_DB_PCSCF_SERVER_ADDR_KEY_STR;
    arrayOfIMSCDbKeys[54] = IMS_SESSION_DB_PING_KEY_STR;
    arrayOfIMSCDbKeys[55] = IMS_SESSION_DB_PRECONDITION_KEY_STR;
    arrayOfIMSCDbKeys[56] = IMS_SESSION_DB_PRECOND_LEVEL_KEY_STR;
    arrayOfIMSCDbKeys[57] = IMS_SESSION_DB_PREFERRED_VOCODER_TYPE_KEY_STR;
    arrayOfIMSCDbKeys[58] = IMS_SESSION_DB_PROVISIONAL_TIMER_KEY_STR;
    arrayOfIMSCDbKeys[59] = IMS_SESSION_DB_RTP_DEFAULT_PORT_RANGE_KEY_STR;
    arrayOfIMSCDbKeys[60] = IMS_SESSION_DB_EVRC_PORT_RANGE_KEY_STR;
    arrayOfIMSCDbKeys[61] = IMS_SESSION_DB_EVRC_TOS_KEY_STR;
    arrayOfIMSCDbKeys[62] = IMS_SESSION_DB_G711_PORT_RANGE_KEY_STR;
    arrayOfIMSCDbKeys[63] = IMS_SESSION_DB_G711_TOS_KEY_STR;
    arrayOfIMSCDbKeys[64] = IMS_SESSION_DB_WIN_SIZE_KEY_STR;
    arrayOfIMSCDbKeys[65] = IMS_SESSION_DB_VOCODER_FORMAT_TO_USE_KEY_STR;
    arrayOfIMSCDbKeys[66] = IMS_SESSION_DB_VOICE_EVRC_QOS_PROFILE_ID_KEY_STR;
    arrayOfIMSCDbKeys[67] = IMS_SESSION_DB_VOICE_G711_QOS_PROFILE_ID_KEY_STR;
    arrayOfIMSCDbKeys[68] = IMS_SESSION_DB_QOS_WITH_PLAIN_SIP_KEY_STR;
    arrayOfIMSCDbKeys[69] = IMS_SESSION_DB_REG_RETRY_AFTER_TIMER_KEY_STR;
    arrayOfIMSCDbKeys[70] = IMS_SESSION_DB_REQUEST_TIMEOUT_KEY_STR;
    arrayOfIMSCDbKeys[71] = IMS_SESSION_DB_REQUEST_TCP_QOS_KEY_STR;
    arrayOfIMSCDbKeys[72] = IMS_SESSION_DB_RETRANS_T1_KEY_STR;
    arrayOfIMSCDbKeys[73] = IMS_SESSION_DB_RETRANS_T2_KEY_STR;
    arrayOfIMSCDbKeys[74] = IMS_SESSION_DB_RETRANS_T4_KEY_STR;
    arrayOfIMSCDbKeys[75] = IMS_SESSION_DB_ROHC_PORT_RANGE;
    arrayOfIMSCDbKeys[76] = IMS_SESSION_DB_RTCP_AUDIO_KEY_STR;
    arrayOfIMSCDbKeys[77] = IMS_SESSION_DB_RTCP_VIDEO_KEY_STR;
    arrayOfIMSCDbKeys[78] = IMS_SESSION_DB_SCSCF_SERVER_NAME_KEY_STR;
    arrayOfIMSCDbKeys[79] = IMS_SESSION_DB_SDP_TEST_DYNAMIC_PAYLOAD_BASE_KEY_STR;
    arrayOfIMSCDbKeys[80] = IMS_SESSION_DB_SDP_TEST_HOLD_STYLE_KEY_STR;
    arrayOfIMSCDbKeys[81] = IMS_SESSION_DB_SDP_TEST_MULT_CODECS_KEY_STR;
    arrayOfIMSCDbKeys[82] = IMS_SESSION_DB_DISABLE_RFC2833_DTMF_KEY_STR;
    arrayOfIMSCDbKeys[83] = IMS_SESSION_DB_SDP_TEST_REJ_MODIFY_KEY_STR;
    arrayOfIMSCDbKeys[84] = IMS_SESSION_DB_SDP_TEST_DTMF_PAYLOAD_TYPE_KEY_STR;
    arrayOfIMSCDbKeys[85] = IMS_SESSION_DB_SESSION_TIMER_SESSION_MIN_SE_KEY_STR;
    arrayOfIMSCDbKeys[86] = IMS_SESSION_DB_SESSION_TIMER_SESSION_EXPIRES_KEY_STR;
    arrayOfIMSCDbKeys[87] = IMS_SESSION_DB_SESSION_TIMER;
    arrayOfIMSCDbKeys[88] = IMS_SESSION_DB_SIGCOMP;
    arrayOfIMSCDbKeys[89] = IMS_SESSION_DB_SIGNALING_QOS_PROFILE_ID_KEY_STR;
    arrayOfIMSCDbKeys[90] = IMS_SESSION_DB_SIP_PORT_KEY_STR;
    arrayOfIMSCDbKeys[91] = IMS_SESSION_DB_SMS_OVER_IMS_PROTOCOL_TYPE_KEY_STR;
    arrayOfIMSCDbKeys[92] = IMS_SESSION_DB_STUN_DISCOVER_KEY_STR;
    arrayOfIMSCDbKeys[93] = IMS_SESSION_DB_STUN_ENABLED_KEY_STR;
    arrayOfIMSCDbKeys[94] = IMS_SESSION_DB_STUN_RETRIES_KEY_STR;
    arrayOfIMSCDbKeys[95] = IMS_SESSION_DB_STUN_RETRY_TIMER_KEY_STR;
    arrayOfIMSCDbKeys[96] = IMS_SESSION_DB_STUN_SECURE_KEY_STR;
    arrayOfIMSCDbKeys[97] = IMS_SESSION_DB_STUN_SERVER_NAME_KEY_STR;
    arrayOfIMSCDbKeys[98] = IMS_SESSION_DB_STUN_SERVER_PORT_KEY_STR;
    arrayOfIMSCDbKeys[99] = IMS_SESSION_DB_STUN_UPDATE_KEY_STR;
    arrayOfIMSCDbKeys[100] = IMS_SESSION_DB_SUBS_NO_NOTIFY_TIMER_KEY_STR;
    arrayOfIMSCDbKeys[101] = IMS_SESSION_DB_SUBS_REG_EV_CONF_KEY_STR;
    arrayOfIMSCDbKeys[102] = IMS_SESSION_DB_SYMMETRIC_RTP_KEY_STR;
    arrayOfIMSCDbKeys[103] = IMS_SESSION_DB_PACC_NWINFO_HDR_SUPPORTED;
    arrayOfIMSCDbKeys[104] = IMS_SESSION_DB_PROXYAUTH_ACROSS_REQUESTS;
    arrayOfIMSCDbKeys[105] = IMS_SESSION_DB_SIGNALING_QOS_PORT_RANGE;
    arrayOfIMSCDbKeys[106] = IMS_SESSION_DB_SIGNALING_TOS;
    arrayOfIMSCDbKeys[107] = IMS_SESSION_DB_AD_HOC_CONFSERVER_KEY_STR;
    arrayOfIMSCDbKeys[108] = IMS_SESSION_DB_DEFER_UI_NOTIFY;
    arrayOfIMSCDbKeys[109] = IMS_SESSION_DB_EVRC_MAX_RATE;
    arrayOfIMSCDbKeys[110] = IMS_SESSION_DB_IMS_DEBUG_MODE;
    arrayOfIMSCDbKeys[111] = IMS_SESSION_DB_IMS_DEBUG_MODE_PORT;
    arrayOfIMSCDbKeys[112] = IMS_SESSION_DB_IMS_UNREGISTER_TIMER_DURATION;
    arrayOfIMSCDbKeys[113] = IMS_SESSION_DB_BEARER_QOS_BEFORE_REG;
    arrayOfIMSCDbKeys[114] = IMS_SESSION_DB_INGORE_QOS_ALLOC_FAILURE;
    arrayOfIMSCDbKeys[115] = IMS_SESSION_DB_SIGCOMP_ALGORITHM;
    arrayOfIMSCDbKeys[116] = IMS_SESSION_DB_SIPCOMPARTMENT_PER_REGCYCLE;
    arrayOfIMSCDbKeys[117] = IMS_SESSION_DB_REG_EXPIRES_VAL;
    arrayOfIMSCDbKeys[118] = IMS_SESSION_DB_PHONE_CONTEXT;
    arrayOfIMSCDbKeys[119] = IMS_SESSION_DB_IMS_NWAY_CONF_USE_CONTACT;
    arrayOfIMSCDbKeys[120] = IMS_SESSION_DB_MAX_NUM_TAPI_SESSIONS;
    arrayOfIMSCDbKeys[121] = IMS_SESSION_DB_MAX_NUM_TAPI_CALLS;
    arrayOfIMSCDbKeys[122] = IMS_SESSION_DB_MAX_NUM_MWI_SESSIONS;
    arrayOfIMSCDbKeys[123] = IMS_SESSION_DB_PCSCF_LIST_SUPPORT;
    arrayOfIMSCDbKeys[124] = IMS_SESSION_DB_IMS_VOIP_METRICS_HEADER;
    arrayOfIMSCDbKeys[125] = IMS_SESSION_DB_SDP_HOLD_CONN_MODE_KEY_STR;
    arrayOfIMSCDbKeys[126] = IMS_SESSION_DB_HOOK_FLASH_TYPE;
    arrayOfIMSCDbKeys[127] = IMS_SESSION_DB_PCSCF_IP_PROTECT_FROM_HN;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_PCSCF_MUL_IP_SUPPORT_DNS_RESP;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_LEARN_RTP_SRC_PORT;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_MIN_DELAY_KEY_STR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_MAX_DELAY_KEY_STR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_EARLY_WINDOW_STR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_LATE_WINDOW_STR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_ADAPTATION_INTERVAL_KEY_STR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_ENABLE_REFER_METHOD;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_DNS_SERVER_IPADDR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_MAX_NUM_REG_NONFATAL_ERROR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_SUB_EXPIRES_VAL;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_USE_REG_EXPIRES_FOR_SUB;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_CALLER_ID_IGNORE_FROM_HEADER;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_FORK_DIRECTIVE_ENABLED;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_FORK_PREFERRED;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_PARALLEL_DIRECTIVE_ENABLED;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_PARALLEL_FORK_PREFERRED;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_HANDLE_FORKED_RESPONSE_TO_INVITE;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_IS_QOS_ON;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_ENABLE_ALWAYS_ADD_PCSCF_TO_SRVC_ROUTE;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_REQUEST_IPV6_FROM_DSM;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_MT_SMS_TO_HDR_VALIDATION;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_LOCAL_IP_ADDR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_PLATFORM_VER_STR;
    arrayOfIMSCDbKeys[''] = IMS_SESSION_DB_MAXIMUM_INDEX;
    $VALUES = arrayOfIMSCDbKeys;
  }
}

/* Location:           /home/dhacker29/jd/classes_dex2jar.jar
 * Qualified Name:     com.motorola.android.server.ims.IMSCDbKeys
 * JD-Core Version:    0.6.0
 */