package com.example.manor_f1app.driver

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.manor_f1app.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private lateinit var viewModel : DriverViewModel
private lateinit var driverRecyclerView: RecyclerView
lateinit var adapter: DriverAdapter

class DriverFragment : Fragment(), DriverAdapter.MyClickListener {


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
        return inflater.inflate(R.layout.fragment_driver, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DriverFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        driverRecyclerView = view.findViewById(R.id.recyclerview)
        driverRecyclerView.layoutManager = LinearLayoutManager(context)
        driverRecyclerView.setHasFixedSize(true)
        adapter = DriverAdapter(this@DriverFragment)
        driverRecyclerView.adapter = adapter

        viewModel = ViewModelProvider(this).get(DriverViewModel::class.java)

        viewModel.allDrivers.observe(viewLifecycleOwner, Observer {

            adapter.updateDriverList(it)

        })

    }

    override fun onClick(rank: Int?, firstname: String?, lastname: String?, teamname: String?, number: Int?, championships: Int?) {

        val rankInput = rank.toString()
        val firstnameInput = firstname.toString()
        val lastnameInput = lastname.toString()
        val teamnameInput = teamname.toString()
        val numberInput = number.toString()
        val championshipsInput = championships.toString()

        Intent(activity, DriverDetailActivity::class.java).also {
            it.putExtra("rank", rankInput)
            it.putExtra("firstname", firstnameInput)
            it.putExtra("lastname", lastnameInput)
            it.putExtra("teamname", teamnameInput)
            it.putExtra("number", numberInput)
            it.putExtra("championships", championshipsInput)
            startActivity(it)
        }
    }
}