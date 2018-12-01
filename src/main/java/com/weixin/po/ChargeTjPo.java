package com.weixin.po;

public class ChargeTjPo extends BasePo
{
  private static final long serialVersionUID = 1L;
  private String rq;
  private String chargeCnt;
  private String chargeIncome;
  private String chargeCost;
  private String chargeProfit;

  public String getRq()
  {
    return this.rq;
  }

  public void setRq(String rq) {
    this.rq = rq;
  }

  public String getChargeCnt() {
    return this.chargeCnt;
  }

  public void setChargeCnt(String chargeCnt) {
    this.chargeCnt = chargeCnt;
  }

  public String getChargeIncome() {
    return this.chargeIncome;
  }

  public void setChargeIncome(String chargeIncome) {
    this.chargeIncome = chargeIncome;
  }

  public String getChargeCost() {
    return this.chargeCost;
  }

  public void setChargeCost(String chargeCost) {
    this.chargeCost = chargeCost;
  }

  public String getChargeProfit() {
    return this.chargeProfit;
  }

  public void setChargeProfit(String chargeProfit) {
    this.chargeProfit = chargeProfit;
  }
}