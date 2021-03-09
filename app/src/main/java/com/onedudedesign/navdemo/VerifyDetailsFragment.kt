package com.onedudedesign.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import org.w3c.dom.Text


class VerifyDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)

        val args : VerifyDetailsFragmentArgs by navArgs()
        val name = args.name
        val mobile = args.mobile

        val tv_name = rootView.findViewById<TextView>(R.id.tv_name)
        val tv_mobile_Number = rootView.findViewById<TextView>(R.id.tv_mobile_number)

        tv_name.text = name
        tv_mobile_Number.text = mobile.toString()

        // Inflate the layout for this fragment
        return rootView
    }
}

