package com.example.manor_f1app.schedule

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.manor_f1app.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private lateinit var viewModel : ScheduleViewModel
private lateinit var scheduleRecyclerView: RecyclerView
lateinit var adapter: ScheduleAdapter

class ScheduleFragment : Fragment(), ScheduleAdapter.MyClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ScheduleFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ScheduleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        scheduleRecyclerView = view.findViewById(R.id.recyclerview)
        scheduleRecyclerView.layoutManager = LinearLayoutManager(context)
        scheduleRecyclerView.setHasFixedSize(true)
        adapter = ScheduleAdapter(this@ScheduleFragment)
        scheduleRecyclerView.adapter = adapter

        viewModel = ViewModelProvider(this).get(ScheduleViewModel::class.java)

        viewModel.allSchedules.observe(viewLifecycleOwner, Observer {

            adapter.updateScheduleList(it)

        })

    }

    override fun onClick(round: Int?, name: String?, country: String?, track: String?, turns: Int?, first: Int?) {

        val roundInput = round.toString()
        val nameInput = name.toString()
        val countryInput = country.toString()
        val trackInput = track.toString()
        val turnsInput = turns.toString()
        val firstInput = first.toString()

        Intent(activity, ScheduleDetailActivity::class.java).also {
            it.putExtra("round", roundInput)
            it.putExtra("name", nameInput)
            it.putExtra("country", countryInput)
            it.putExtra("track", trackInput)
            it.putExtra("turns", turnsInput)
            it.putExtra("first", firstInput)
            startActivity(it)
        }
    }
}