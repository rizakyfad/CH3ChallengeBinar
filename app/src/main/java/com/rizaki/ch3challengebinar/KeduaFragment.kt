package com.rizaki.ch3challengebinar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.rizaki.ch3challengebinar.databinding.FragmentKeduaBinding

class KeduaFragment : Fragment() {
    private var _binding: FragmentKeduaBinding? = null
    private val binding get() = _binding as FragmentKeduaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentKeduaBinding.inflate(layoutInflater, container, false)
        setHasOptionsMenu(true)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mData = KeduaFragmentArgs.fromBundle(arguments as Bundle).name

        binding.Kata.apply {
            adapter = KataAdapter(mData)
            layoutManager = LinearLayoutManager(activity)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item, requireView().findNavController()
        )
                || super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}


