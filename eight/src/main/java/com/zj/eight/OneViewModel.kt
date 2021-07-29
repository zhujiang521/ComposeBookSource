package com.zj.eight

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

class OneViewModel(defaultCount: Int) : ViewModel() {

    private val _count = MutableLiveData(defaultCount)

    val count: LiveData<Int>
        get() = _count

    fun onCountChanged(count: Int) {
        _count.postValue(count)
    }

}

@HiltAndroidApp
class TwoViewModel @Inject constructor(defaultCount: Int) : ViewModel() {

    private val _count = MutableLiveData(defaultCount)

    val count: LiveData<Int>
        get() = _count

    fun onCountChanged(count: Int) {
        _count.postValue(count)
    }

}

class OneViewModelFactory(private val defaultCount: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return OneViewModel(defaultCount) as T
    }

}