/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cl.transbank.pos.utils;

public enum TbkReturn {
  TBK_OK(0),
  TBK_NOK(-1);

  public final int swigValue() {
    return swigValue;
  }

  public static TbkReturn swigToEnum(int swigValue) {
    TbkReturn[] swigValues = TbkReturn.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TbkReturn swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TbkReturn.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TbkReturn() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TbkReturn(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TbkReturn(TbkReturn swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

