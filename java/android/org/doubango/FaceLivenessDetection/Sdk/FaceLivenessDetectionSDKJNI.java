/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.FaceLivenessDetection.Sdk;

public class FaceLivenessDetectionSDKJNI {

  static {
    System.loadLibrary("FaceLivenessDetectionSDK");
  }

  public final static native long new_FldSdkResult__SWIG_0();
  public final static native long new_FldSdkResult__SWIG_1(int jarg1, String jarg2, String jarg3, long jarg4);
  public final static native long new_FldSdkResult__SWIG_2(int jarg1, String jarg2, String jarg3);
  public final static native long new_FldSdkResult__SWIG_3(long jarg1, FldSdkResult jarg1_);
  public final static native void delete_FldSdkResult(long jarg1);
  public final static native int FldSdkResult_code(long jarg1, FldSdkResult jarg1_);
  public final static native String FldSdkResult_phrase(long jarg1, FldSdkResult jarg1_);
  public final static native String FldSdkResult_json(long jarg1, FldSdkResult jarg1_);
  public final static native long FldSdkResult_numFaces(long jarg1, FldSdkResult jarg1_);
  public final static native boolean FldSdkResult_isOK(long jarg1, FldSdkResult jarg1_);
  public final static native void delete_FldSdkParallelDeliveryCallback(long jarg1);
  public final static native void FldSdkParallelDeliveryCallback_onNewResult(long jarg1, FldSdkParallelDeliveryCallback jarg1_, long jarg2, FldSdkResult jarg2_);
  public final static native long FldSdkEngine_init__SWIG_0(String jarg1, long jarg2, FldSdkParallelDeliveryCallback jarg2_);
  public final static native long FldSdkEngine_init__SWIG_1(String jarg1);
  public final static native long FldSdkEngine_init__SWIG_2();
  public final static native long FldSdkEngine_deInit();
  public final static native long FldSdkEngine_process__SWIG_0(int jarg1, java.nio.ByteBuffer jarg2, long jarg3, long jarg4, long jarg5, int jarg6);
  public final static native long FldSdkEngine_process__SWIG_1(int jarg1, java.nio.ByteBuffer jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long FldSdkEngine_process__SWIG_2(int jarg1, java.nio.ByteBuffer jarg2, long jarg3, long jarg4);
  public final static native long FldSdkEngine_process__SWIG_3(int jarg1, java.nio.ByteBuffer jarg2, java.nio.ByteBuffer jarg3, java.nio.ByteBuffer jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9, long jarg10, int jarg11);
  public final static native long FldSdkEngine_process__SWIG_4(int jarg1, java.nio.ByteBuffer jarg2, java.nio.ByteBuffer jarg3, java.nio.ByteBuffer jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9, long jarg10);
  public final static native long FldSdkEngine_process__SWIG_5(int jarg1, java.nio.ByteBuffer jarg2, java.nio.ByteBuffer jarg3, java.nio.ByteBuffer jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9);
  public final static native int FldSdkEngine_exifOrientation(java.nio.ByteBuffer jarg1, long jarg2);
  public final static native long FldSdkEngine_requestRuntimeLicenseKey__SWIG_0(boolean jarg1);
  public final static native long FldSdkEngine_requestRuntimeLicenseKey__SWIG_1();
  public final static native long FldSdkEngine_warmUp(int jarg1);
  public final static native void delete_FldSdkEngine(long jarg1);
}
