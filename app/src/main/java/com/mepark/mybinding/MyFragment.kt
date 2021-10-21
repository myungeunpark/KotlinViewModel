package com.mepark.mybinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mepark.mybinding.databinding.FragmentMyBinding
import kotlinx.android.synthetic.main.fragment_my.*

/**
 * A simple [Fragment] subclass.
 */
class MyFragment : Fragment() {

    private lateinit var binding : FragmentMyBinding
    private val viewModel: DataViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_my, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //var  viewModel = ViewModelProvider(this).get(DataViewModel::class.java)
        binding.vm = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        /*
        viewModel.name.observe(viewLifecycleOwner,
            Observer { t ->
                name.text = t
                Toast.makeText(context,"onChanges", Toast.LENGTH_LONG).show()
            }
        )
*/
       // binding.lifecycleOwner = this
    }

}
