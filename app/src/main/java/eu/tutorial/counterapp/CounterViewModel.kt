package eu.tutorial.counterapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    private var _count by mutableStateOf(0)
    fun count(): Int {
        return _count
    }

    fun increment() {
        _count += 1
    }

    fun decrement() {
        _count -= 1
    }

}