package com.netvirta.camerainforgetter

import android.hardware.camera2.CameraCharacteristics
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var camera2Controller: Camera2Controller
    lateinit var frontCameraInfo: CameraInfo
    lateinit var backCameraInfo: CameraInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        camera2Controller = Camera2Controller(this)
        getCameraInfo()
    }

    fun getCameraInfo() {
        val frontCamera = camera2Controller.getCameraInfo(CameraCharacteristics.LENS_FACING_FRONT)
        val backCamera = camera2Controller.getCameraInfo(CameraCharacteristics.LENS_FACING_BACK)
        if (frontCamera != null) {
            frontCameraInfo = camera2Controller.getFocalLength(
                CameraCharacteristics.LENS_FACING_FRONT,
                frontCamera!!
            )
            println(frontCameraInfo)
        }
        if (backCamera != null) {
            backCameraInfo = camera2Controller.getFocalLength(
                CameraCharacteristics.LENS_FACING_BACK,
                backCamera!!
            )
            println(backCameraInfo)
        }
    }
}
