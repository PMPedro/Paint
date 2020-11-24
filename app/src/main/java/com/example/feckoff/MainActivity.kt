package com.example.feckoff

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val CanvasView = CanvasView(this)

        CanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN

        CanvasView.contentDescription = getString(R.string.canvasContentDescription)

        setContentView(CanvasView)
    }
}