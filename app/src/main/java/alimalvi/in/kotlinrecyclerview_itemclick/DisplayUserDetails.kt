package alimalvi.`in`.kotlinrecyclerview_itemclick

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_display_user_details.*

class DisplayUserDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_user_details)

        display_username_textView.text=intent.getStringExtra("username")
        display_jobtitle_textView.text=intent.getStringExtra("jobtitle")
    }
}
