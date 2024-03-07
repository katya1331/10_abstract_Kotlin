abstract class Operator(): Infom {
    abstract var S:Int
    abstract  var name: String
    abstract var plata: Boolean
    abstract var minpla: Double
    abstract fun Q():Double
    abstract fun Qp():Double
    override fun Info(){
        println("operator:$name, Minuta: $minpla, S pokr: $S, q=${String.format("%.2f",Q())}")
    }
}