package kg.geektech.homework4.fragments

import android.view.LayoutInflater
import androidx.fragment.app.activityViewModels
import kg.geektech.homework4.base.BaseFragment
import kg.geektech.homework4.databinding.FragmentSecondBinding
import kg.geektech.homework4.view_model.MainViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    //Инициализация вьюмодела, автоматический вариант
    private val viewModel: MainViewModel by activityViewModels()

    override fun inflateVB(inflater: LayoutInflater): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater)
    }

    override fun initView() {
        //Наблюдаем за информацией
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounterSecond.text = it.toString()
        }
    }

    override fun initListener() {
    }
}