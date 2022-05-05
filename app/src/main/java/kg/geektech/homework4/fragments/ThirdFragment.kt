package kg.geektech.homework4.fragments

import android.view.LayoutInflater
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import kg.geektech.homework4.adapter.AdapterForThirdFragment
import kg.geektech.homework4.base.BaseFragment
import kg.geektech.homework4.databinding.FragmentThirdBinding
import kg.geektech.homework4.view_model.MainViewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding>() {
    private val adapter = AdapterForThirdFragment()
    private val viewModel: MainViewModel by activityViewModels()

    override fun inflateVB(inflater: LayoutInflater): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(inflater)
    }

    override fun initView() {
        //Наблюдаем за историей операций. Ресайклер
        initAdapter()
        viewModel.historyList.observe(viewLifecycleOwner) {
            adapter.addHistory(it)
        }
    }

    private fun initAdapter() {
        //Инициализации адаптера
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
    }

    override fun initListener() {
    }
}