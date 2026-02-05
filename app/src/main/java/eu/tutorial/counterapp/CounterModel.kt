package eu.tutorial.counterapp

data class CounterModel(var count: Int)

class CounterRepository {
    private val _counter = CounterModel(0)

    fun getCounter(): CounterModel {
        return _counter
    }

    fun incrementCounter() {
        _counter.count++
    }

    fun decrementCounter() {
        _counter.count--
    }
}