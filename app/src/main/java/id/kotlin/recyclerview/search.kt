package id.kotlin.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        supportActionBar?.hide()
    }
}