package io.github.thisdk.bootstrap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zackratos.ultimatebarx.library.UltimateBarX

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        UltimateBarX.with(this)
            .fitWindow(true)
            .colorRes(R.color.gray_blue_500)
            .light(false)
            .applyStatusBar()
    }

}