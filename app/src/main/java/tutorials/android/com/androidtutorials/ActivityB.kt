package tutorials.android.com.androidtutorials

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Toast

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        Log.d("Activity B", "inside")
    }

    fun LaunchClicked(view: View) {
        var intent: Intent
//        var chooser :ChooserTarget

        if (view.id == R.id.buttonB) {
            intent = Intent(android.content.Intent.ACTION_VIEW)
            intent.data = Uri.parse("geo:100.24, 90.18")
//            chooser = intent.createChooser(intent, "Launch Map")
//            startActivity(chooser)
            startActivity(intent)

            val toast = Toast.makeText(this, "Google map launching", Toast.LENGTH_LONG) // LENGTH_SHORT
            toast.setGravity(Gravity.CENTER, 100, 200) // Gravity.LEFT Gravity.RIGHT
            toast.show()
        }
    }
}
