package com.akaiyukiusagi.databindingsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    val text: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    init{
        text.value = "初期値"
    }
}

