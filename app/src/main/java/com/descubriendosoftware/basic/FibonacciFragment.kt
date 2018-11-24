package com.descubriendosoftware.basic

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fibonacci_fragment.*
import java.math.BigInteger

class FibonacciFragment : Fragment() {

    companion object {
        fun newInstance(): FibonacciFragment {
            return FibonacciFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fibonacci_fragment, container, false)
        var result =getFibonacciNumber(4, BigInteger("1"), BigInteger("0"))
        fibonacci_textView.setText("is$result")
        return view
    }

    tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

        if (n == 0)
            return b
        else
            return getFibonacciNumber(n - 1, a + b, a)
    }
}
