package com.rizaki.ch3challengebinar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.rizaki.ch3challengebinar.databinding.FragmentUtamaBinding

class UtamaFragment : Fragment() {
    private var _binding : FragmentUtamaBinding? = null
    private val binding get() = _binding as FragmentUtamaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUtamaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rcvAlphabet.apply {
            layoutManager = LinearLayoutManager(activity)

            val mAdapter= AbjadAdapter(list)
            adapter = mAdapter
            mAdapter.setOnClickCallback(object :OnItemClickCallback{
                override fun onItemClicked(list: Array<String>){
                    val action = UtamaFragmentDirections.actionUtamaFragmentToKeduaFragment(list)
                    view.findNavController().navigate(action)

                }
            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
