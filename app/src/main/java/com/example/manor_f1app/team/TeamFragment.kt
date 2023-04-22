package com.example.manor_f1app.team

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

private lateinit var viewModel : TeamViewModel
private lateinit var teamRecyclerView: RecyclerView
lateinit var adapter: TeamAdapter
/**
 * A simple [Fragment] subclass.
 * Use the [TeamFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TeamFragment : Fragment(), TeamAdapter.MyClickListener {
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
        return inflater.inflate(R.layout.fragment_team, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TeamFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TeamFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        teamRecyclerView = view.findViewById(R.id.recyclerview)
        teamRecyclerView.layoutManager = LinearLayoutManager(context)
        teamRecyclerView.setHasFixedSize(true)
        adapter = TeamAdapter(this@TeamFragment)
        teamRecyclerView.adapter = adapter
        
        viewModel = ViewModelProvider(this).get(TeamViewModel::class.java)
        
        viewModel.allTeams.observe(viewLifecycleOwner, Observer { 
            
            adapter.updateteamList(it)
            
        })

    }

    override fun onClick(rank: Int?, name: String?, chief: String?, driver1: String?, driver2: String?, championships: Int?) {

        val rankInput = rank.toString()
        val nameInput = name.toString()
        val chiefInput = chief.toString()
        val driver1Input = driver1.toString()
        val driver2Input = driver2.toString()
        val championshipsInput = championships.toString()

        Intent(activity, TeamDetailActivity::class.java).also {
            it.putExtra("rank", rankInput)
            it.putExtra("name", nameInput)
            it.putExtra("chief", chiefInput)
            it.putExtra("driver1", driver1Input)
            it.putExtra("driver2", driver2Input)
            it.putExtra("championships", championshipsInput)
            startActivity(it)
        }
    }
}