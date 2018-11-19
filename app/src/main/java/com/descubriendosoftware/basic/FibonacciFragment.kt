package com.descubriendosoftware.basic

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FibonacciFragment : Fragment() {

    companion object {
        fun newInstance(): FibonacciFragment {
            return FibonacciFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fibonacc_fragment, container, false)
    }
}
