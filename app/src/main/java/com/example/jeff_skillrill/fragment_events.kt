package com.example.jeff_skillrill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.fragment_events.recyclerView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class fragment_events : Fragment() {

//    private lateinit var eventRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Events>
    lateinit var ImageId: Array<Int>
    lateinit var about: Array<String>

//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }

//        ImageId = arrayOf(
//            R.drawable.topic_demo,
//            R.drawable.topic_demo,
//            R.drawable.topic_demo,
//            R.drawable.topic_demo,
//            R.drawable.topic_demo,
//            R.drawable.topic_demo,
//            R.drawable.topic_demo,
//            R.drawable.topic_demo,
//            R.drawable.topic_demo
//        )
//
//        about = arrayOf(
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//            "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
//
//
//        )
//
//        recyclerView.layoutManager = LinearLayoutManager(activity)
//        recyclerView.setHasFixedSize(true)
//
//        newArrayList = arrayListOf<Events>()
//        getUserData()



    }

//    private fun getUserData() {
//        for (i in ImageId.indices)
//        {
//            val events = Events(ImageId[i],about[i])
//            newArrayList.add(events)
//        }
//        recyclerView.adapter = MyAdapter(newArrayList)
//    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_events, container, false)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment_events.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment_events().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


}

