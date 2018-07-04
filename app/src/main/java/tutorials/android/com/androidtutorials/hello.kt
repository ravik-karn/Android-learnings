package tutorials.android.com.androidtutorials

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View

class hello : AppCompatActivity() {
    var counter = 0
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
        counter++
        Log.d("onResume", "counter = " + counter)
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


        val intent = Intent(this,ActivityB::class.java)
        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState!!.putInt("counter", counter)
        Log.d("onSaveInstanceState", "counter $counter saved")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt("counter")
        }
        Log.d("onRestoreInstanceState", "counter $counter restored")
    }
}
