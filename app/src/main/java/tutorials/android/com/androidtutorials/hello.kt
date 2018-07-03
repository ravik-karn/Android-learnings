package tutorials.android.com.androidtutorials

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.nio.file.attribute.AclFileAttributeView

class hello : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        Log.d("onCreate", "called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart", "called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume", "called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause", "called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop", "called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy", "called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart", "called")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.d("onConfigChanged", newConfig.toString())
    }

    fun buttonClicked(view: View) {
        Log.d("onClick", view.toString())
        Log.d("onClick", view.id.toString())
    }
}
