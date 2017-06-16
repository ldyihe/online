package com.huilan.aikf.phone.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class PhoneApp  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String APPID;// 应用编号
	private String APPNAME;// 应用名称
	private int APPTYPE;// 类型
	private int INDUSTRY;// 所属行业
	private String CALLBACKURL;// 回调地址
	private String CALLBACKDESC;// 应用回调地址功能配置
	private int ISIVR;// 是否启用IVR
	private String IVRURL;// IVR通知地址
	private int ISAGENT;// 是否启用座席
	private int ISTTS;// 是否开启TTS
	private int ISDISPLAY;// 是否显号
	private String CUSTNUMBER;// 租户400号码
	private String RYNUMBER;// 绑定的接入号
	private String DISPLAYNUMBER;// 外呼显示的号码
	private int STATE;// 应用状态 -1:已删除 0：禁用，1：未发布，2：上线，3：审核中，4：暂停
	private String DEPARTMENT;// 租户编号
	private BigDecimal BALANCE;// 可用余额
	private BigDecimal INVOICE;// 可开票余额
	private int ISCHECK;// 是否通过审核
	private String FILENAME;// 文件名称
	private int SERVICECHECK;// 是否开启服务时间
	private String WEEKLY;// 星期
	private String BEGINTIME;// 起始时间
	private String ENDTIME;// 结束时间
	private String SERVICEID;// VoIP接入号
	private String CREATE_TIME;// 创建时间
	private String UPDATE_TIME;// 更新时间
	private int notenoughmoney;// 0 正常 1 标示因为帐户余额不足导致的app停用
	private int notsingrent;// 0 正常 1 标示因为帐户因为到期导致的app停用
	private int isService;// 是否开启语音电话功能(0不启用，1启用)
	private int maxWaitTime = 10;// 最大队列等待时间（秒）
	private int keyPressTimeout = 10;// 按键超时时间（秒）
	private int isSatisfyEval;// 是否启用满意度评价(0不启用，1启用)
	private int postProcessTime = 10;// 后处理时间（秒）

	public String getAPPID() {
		return APPID;
	}

	public void setAPPID(String aPPID) {
		APPID = aPPID;
	}

	public String getAPPNAME() {
		return APPNAME;
	}

	public void setAPPNAME(String aPPNAME) {
		APPNAME = aPPNAME;
	}

	public int getAPPTYPE() {
		return APPTYPE;
	}

	public void setAPPTYPE(int aPPTYPE) {
		APPTYPE = aPPTYPE;
	}

	public int getINDUSTRY() {
		return INDUSTRY;
	}

	public void setINDUSTRY(int iNDUSTRY) {
		INDUSTRY = iNDUSTRY;
	}

	public String getCALLBACKURL() {
		return CALLBACKURL;
	}

	public void setCALLBACKURL(String cALLBACKURL) {
		CALLBACKURL = cALLBACKURL;
	}

	public String getCALLBACKDESC() {
		return CALLBACKDESC;
	}

	public void setCALLBACKDESC(String cALLBACKDESC) {
		CALLBACKDESC = cALLBACKDESC;
	}

	public int getISIVR() {
		return ISIVR;
	}

	public void setISIVR(int iSIVR) {
		ISIVR = iSIVR;
	}

	public String getIVRURL() {
		return IVRURL;
	}

	public void setIVRURL(String iVRURL) {
		IVRURL = iVRURL;
	}

	public int getISAGENT() {
		return ISAGENT;
	}

	public void setISAGENT(int iSAGENT) {
		ISAGENT = iSAGENT;
	}

	public int getISTTS() {
		return ISTTS;
	}

	public void setISTTS(int iSTTS) {
		ISTTS = iSTTS;
	}

	public int getISDISPLAY() {
		return ISDISPLAY;
	}

	public void setISDISPLAY(int iSDISPLAY) {
		ISDISPLAY = iSDISPLAY;
	}

	public String getCUSTNUMBER() {
		return CUSTNUMBER;
	}

	public void setCUSTNUMBER(String cUSTNUMBER) {
		CUSTNUMBER = cUSTNUMBER;
	}

	public String getRYNUMBER() {
		return RYNUMBER;
	}

	public void setRYNUMBER(String rYNUMBER) {
		RYNUMBER = rYNUMBER;
	}

	public String getDISPLAYNUMBER() {
		return DISPLAYNUMBER;
	}

	public void setDISPLAYNUMBER(String dISPLAYNUMBER) {
		DISPLAYNUMBER = dISPLAYNUMBER;
	}

	public int getSTATE() {
		return STATE;
	}

	public void setSTATE(int sTATE) {
		STATE = sTATE;
	}

	public String getDEPARTMENT() {
		return DEPARTMENT;
	}

	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}

	public BigDecimal getBALANCE() {
		return BALANCE;
	}

	public void setBALANCE(BigDecimal bALANCE) {
		BALANCE = bALANCE;
	}

	public BigDecimal getINVOICE() {
		return INVOICE;
	}

	public void setINVOICE(BigDecimal iNVOICE) {
		INVOICE = iNVOICE;
	}

	public int getISCHECK() {
		return ISCHECK;
	}

	public void setISCHECK(int iSCHECK) {
		ISCHECK = iSCHECK;
	}

	public String getFILENAME() {
		return FILENAME;
	}

	public void setFILENAME(String fILENAME) {
		FILENAME = fILENAME;
	}

	public int getSERVICECHECK() {
		return SERVICECHECK;
	}

	public void setSERVICECHECK(int sERVICECHECK) {
		SERVICECHECK = sERVICECHECK;
	}

	public String getWEEKLY() {
		return WEEKLY;
	}

	public void setWEEKLY(String wEEKLY) {
		WEEKLY = wEEKLY;
	}

	public String getBEGINTIME() {
		return BEGINTIME;
	}

	public void setBEGINTIME(String bEGINTIME) {
		BEGINTIME = bEGINTIME;
	}

	public String getENDTIME() {
		return ENDTIME;
	}

	public void setENDTIME(String eNDTIME) {
		ENDTIME = eNDTIME;
	}

	public String getSERVICEID() {
		return SERVICEID;
	}

	public void setSERVICEID(String sERVICEID) {
		SERVICEID = sERVICEID;
	}

	public String getCREATE_TIME() {
		return CREATE_TIME;
	}

	public void setCREATE_TIME(String cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}

	public String getUPDATE_TIME() {
		return UPDATE_TIME;
	}

	public void setUPDATE_TIME(String uPDATE_TIME) {
		UPDATE_TIME = uPDATE_TIME;
	}

	public int getNotenoughmoney() {
		return notenoughmoney;
	}

	public void setNotenoughmoney(int notenoughmoney) {
		this.notenoughmoney = notenoughmoney;
	}

	public int getNotsingrent() {
		return notsingrent;
	}

	public void setNotsingrent(int notsingrent) {
		this.notsingrent = notsingrent;
	}

	public int getIsService() {
		return isService;
	}

	public void setIsService(int isService) {
		this.isService = isService;
	}

	public int getMaxWaitTime() {
		return maxWaitTime;
	}

	public void setMaxWaitTime(int maxWaitTime) {
		this.maxWaitTime = maxWaitTime;
	}

	public int getKeyPressTimeout() {
		return keyPressTimeout;
	}

	public void setKeyPressTimeout(int keyPressTimeout) {
		this.keyPressTimeout = keyPressTimeout;
	}

	public int getIsSatisfyEval() {
		return isSatisfyEval;
	}

	public void setIsSatisfyEval(int isSatisfyEval) {
		this.isSatisfyEval = isSatisfyEval;
	}

	public int getPostProcessTime() {
		return postProcessTime;
	}

	public void setPostProcessTime(int postProcessTime) {
		this.postProcessTime = postProcessTime;
	}

}
