package kg.geektech.homework4.fragments

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import kg.geektech.homework4.databinding.FragmentFirstBinding
import kg.geektech.homework4.base.BaseFragment
import kg.geektech.homework4.view_model.MainViewModel

class FirstFragment : BaseFragment<FragmentFirstBinding>() {
   //Инициализация вьюмодела, ручной вариант
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    //биндинг
    override fun inflateVB(inflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(inflater)
    }

    //Инициализация вьюшек
    override fun initView() {
        //Обсервер, наблюдатель. Он наблюдает за данными объекта
        //viewLifecycleOwner жизненный цикл
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }
    }

    override fun initListener() {
        binding.btnCounterPlus.setOnClickListener {
            viewModel.onIncrementClick()
        }
        binding.btnCounterMinus.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }
}