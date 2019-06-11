//package com.example.adapterapp
//
//import android.os.Bundle
//import android.support.v4.app.Fragment
//import android.support.v7.widget.LinearLayoutManager
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import kotlinx.android.synthetic.main.fragment_main.*
//
//class MainFragment : Fragment() {
//
//    private val mListOfActors = listOf(
//
//        SimpleDataClass("John","Snow",1234),
//        SimpleDataClass("Matheo","Mithic",1787)
//    )
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        retainInstance = true
//    }
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
//        inflater.inflate(R.layout.fragment_main, container, false)
//
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        recycler_view.apply {
//            layoutManager = LinearLayoutManager(activity)
//            adapter = SimpleAdapter(mListOfActors)
//        }
//    }
//
//    companion object {
//        fun newInstance(): MainFragment = MainFragment()
//    }
//
//}