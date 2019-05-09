package com.vmx.h2manage.payload;

import java.io.Serializable;

public class LabelValueResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  private String label;
  private String value;
  private String value2;

  public LabelValueResponse(String sLabel, String sValue) {
      label  = sLabel;
      value  = sValue;
      value2 = null;
  }
  public LabelValueResponse(String sLabel, String sValue, String sValue2) {
      label = sLabel;
      value = sValue;
      value2= sValue2;
  }

  public String getLabel() {
    return label;
  }
  public void setLabel(String sLabel) {
    this.label = sLabel;
  }
  public String getValue() {
    return value;
  }

  public String getValue2() {
    return value2;
  }

  public void setValue(String sValue) {
    this.value = sValue;
  }

  public void setValue2(String value2) {
    this.value2 = value2;
  }

}
