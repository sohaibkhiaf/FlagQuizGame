package com.example.flagquizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


private const val ARG_COUNTRIES = "countries"

class DiscoverFragment : Fragment() {

    private lateinit var rv : RecyclerView

    private var countries: ArrayList<Country> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            countries = it.getParcelableArrayList<Country>(ARG_COUNTRIES)!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discover, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv = view.findViewById(R.id.discoverFragment_rv_countries)

        rv.layoutManager = LinearLayoutManager(requireContext())
        rv.adapter = CountriesRVAdapter(countries)

    }
}