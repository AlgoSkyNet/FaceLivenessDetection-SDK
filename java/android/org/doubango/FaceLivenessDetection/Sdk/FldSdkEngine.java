/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.FaceLivenessDetection.Sdk;

public class FldSdkEngine {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FldSdkEngine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FldSdkEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FaceLivenessDetectionSDKJNI.delete_FldSdkEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static FldSdkResult init(String jsonConfig, FldSdkParallelDeliveryCallback parallelDeliveryCallback) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_init__SWIG_0(jsonConfig, FldSdkParallelDeliveryCallback.getCPtr(parallelDeliveryCallback), parallelDeliveryCallback), true);
  }

  public static FldSdkResult init(String jsonConfig) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_init__SWIG_1(jsonConfig), true);
  }

  public static FldSdkResult init() {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_init__SWIG_2(), true);
  }

  public static FldSdkResult deInit() {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_deInit(), true);
  }

  public static FldSdkResult process(FLD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples, long imageStrideInSamples, int imageExifOrientation) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_process__SWIG_0(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples, imageStrideInSamples, imageExifOrientation), true);
  }

  public static FldSdkResult process(FLD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples, long imageStrideInSamples) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_process__SWIG_1(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples, imageStrideInSamples), true);
  }

  public static FldSdkResult process(FLD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_process__SWIG_2(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples), true);
  }

  public static FldSdkResult process(FLD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes, long uvPixelStrideInBytes, int exifOrientation) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_process__SWIG_3(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes, uvPixelStrideInBytes, exifOrientation), true);
  }

  public static FldSdkResult process(FLD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes, long uvPixelStrideInBytes) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_process__SWIG_4(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes, uvPixelStrideInBytes), true);
  }

  public static FldSdkResult process(FLD_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_process__SWIG_5(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes), true);
  }

  public static int exifOrientation(java.nio.ByteBuffer jpegMetaDataPtr, long jpegMetaDataSize) {
    return FaceLivenessDetectionSDKJNI.FldSdkEngine_exifOrientation(jpegMetaDataPtr, jpegMetaDataSize);
  }

  public static FldSdkResult requestRuntimeLicenseKey(boolean rawInsteadOfJSON) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_requestRuntimeLicenseKey__SWIG_0(rawInsteadOfJSON), true);
  }

  public static FldSdkResult requestRuntimeLicenseKey() {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_requestRuntimeLicenseKey__SWIG_1(), true);
  }

  public static FldSdkResult warmUp(FLD_SDK_IMAGE_TYPE imageType) {
    return new FldSdkResult(FaceLivenessDetectionSDKJNI.FldSdkEngine_warmUp(imageType.swigValue()), true);
  }

}
