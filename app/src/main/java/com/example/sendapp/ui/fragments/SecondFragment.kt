package com.example.sendapp.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sendapp.ui.dataclass.DataClass
import com.example.sendapp.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val user = arguments?.getParcelable<DataClass>("user_data")
        if (user != null) {
            binding.tvName.text = "Name: ${user.name}"
            binding.tvEmail.text = "Email: ${user.email}"
            binding.tvPassword.text = "Password: ${user.password}"
        } else {
            binding.tvName.text = "No data"
        }
    }

}
