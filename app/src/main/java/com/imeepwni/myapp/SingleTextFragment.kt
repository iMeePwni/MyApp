package com.imeepwni.myapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_single_text.*

/**
 * 单一文本Fragment
 */
class SingleTextFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_single_text, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        et_text.setText(arguments?.getString(KEY_TEXT) ?: "")
    }

    companion object {
        private const val KEY_TEXT = "key_text"

        fun newInstance(text: String): SingleTextFragment {
            val fragment = SingleTextFragment()
            fragment.arguments = Bundle().apply {
                putString(KEY_TEXT, text)
            }
            return fragment
        }
    }
}