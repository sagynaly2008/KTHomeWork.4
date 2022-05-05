package kg.geektech.homework4.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


open class MainViewModel : ViewModel() {
    private var mHistory = ""
    private var mCounter = 0
    val counter = MutableLiveData<Int>()
    val historyList = MutableLiveData<String>()

    //метод плюс
    fun onIncrementClick() {
        //Операция цифры
        mCounter++
        counter.value = mCounter
        //История
        mHistory = "+"
        historyList.postValue(mHistory)
    }

    //метод минус
    fun onDecrementClick() {
        //Операция цифры
        mCounter--
        counter.value = mCounter
        //История
        mHistory = "-"
        historyList.postValue(mHistory)
    }
}