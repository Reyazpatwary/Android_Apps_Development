class lamp {
    private var isOn = false

    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun display(){
        println(isOn)
    }
}