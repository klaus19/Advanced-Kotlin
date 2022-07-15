package function

class Time(val hours:Int,val mins:Int){
    operator fun plus(time: Time):Time{
        val minutes = this.mins + time.mins
        val hourInMinutes = minutes/60
        val remainingHours = minutes%60
        val hours = this.hours + time.hours + hourInMinutes

        return Time(hours,remainingHours)
    }
}

fun main(){

    val newTime = Time(10,40) + Time(3,40)



}