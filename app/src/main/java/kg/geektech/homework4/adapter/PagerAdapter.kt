package kg.geektech.homework4.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.geektech.homework4.fragments.FirstFragment
import kg.geektech.homework4.fragments.SecondFragment
import kg.geektech.homework4.fragments.ThirdFragment

//ViewPager2
class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    //Соответствие количеству экранов
    override fun getItemCount() = 3

    //Количество возможных экранов
    override fun createFragment(position: Int): Fragment {
        //Возвращяемый цикл
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }
    }
}