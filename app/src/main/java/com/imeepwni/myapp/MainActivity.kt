package com.imeepwni.myapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.transaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        var fragment = supportFragmentManager.findFragmentByTag(FRAGMENT_TAG_SINGLE_TEXT)
        if (fragment == null) {
            fragment = SingleTextFragment.newInstance("Hello World")
            supportFragmentManager.transaction {
                add(R.id.fl_container, fragment, FRAGMENT_TAG_SINGLE_TEXT)
            }
        } else {
            Toast.makeText(this, fragment.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        private const val FRAGMENT_TAG_SINGLE_TEXT = "tag_single_text"
    }
}
