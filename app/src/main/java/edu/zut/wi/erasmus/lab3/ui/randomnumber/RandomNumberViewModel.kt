package edu.zut.wi.erasmus.lab3.ui.randomnumber

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class RandomNumberViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Click Button to Randomize number"
    }
    var text: LiveData<String> = _text

    fun generateRandom() {
        _text.postValue(Random.nextInt(0,100).toString());
    }

    }

