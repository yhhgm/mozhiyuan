package org.mzy.bean;

public class UserAddress {

    private Integer id;

    private String userAddress;

    private String userId;

    private String consignee;

    private String phoneNum;

    private String isDefault;


    public UserAddress() {
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置
     * @param userAddress
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 获取
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * @return consignee
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置
     * @param consignee
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 获取
     * @return phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取
     * @return isDefault
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 设置
     * @param isDefault
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String toString() {
        return "UserAddress{id = " + id + ", userAddress = " + userAddress + ", userId = " + userId + ", consignee = " + consignee + ", phoneNum = " + phoneNum + ", isDefault = " + isDefault + "}";
    }
}
