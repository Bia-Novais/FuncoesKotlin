import kotlin.math.sqrt
import kotlin.time.times

class Operacoes{
    fun areaRetangulo(b: Int, h: Int): Int{
        return b * h
    }

    fun areaEquilatero(l: Int): Double {
        return (l*l)*sqrt(3.0)/4
    }

    fun areaIsoceles(b:Int, h: Int): Int{
        return (b*h)/2
    }

    fun areaEscaleno(b: Int, h: Int): Int {
        return b*h*1/2
    }

    fun areaCircunferencia(r: Int): Double {
        return 3.14*(r*r)
    }

    fun areaLosango(D: Int, d: Int): Int {
        return (D*d)/2
    }

    fun areaTrapezio(B: Int, b: Int, h: Int): Int {
        return (B + b)*h/2
    }
}


fun calcR(b: Int, h: Int, funcao: (Int, Int)->Int): Int{
    return funcao(b, h)
}

fun calcE(l: Int, funcao: (Int)->Double): Double{
    return funcao(l)
}

fun calcC(r: Int, funcao: (Int)->Double): Double{
    return funcao(r)
}

fun calcL(D: Int, d: Int, funcao: (Int, Int)->Int): Int{
    return funcao(D,d)
}

fun calcT(B: Int, b: Int, h: Int, funcao: (Int, Int, Int)->Int): Int{
    return funcao(B, b, h)
}

fun main(args: Array<String>){
    println("Calculo Área do Retângulo")
    println(calcR(5, 5, Operacoes()::areaRetangulo))
    println("Calculo Área do Triângulo Equilátero")
    println(calcE(12,  Operacoes()::areaEquilatero))
    println("Calculo Área do Triângulo Isóceles")
    println(calcR(12, 8, Operacoes()::areaIsoceles))
    println("Calculo Área do Triângulo Escaleno")
    println(calcR(10, 8, Operacoes()::areaEscaleno))
    println("Calculo Área da Circuferência")
    println(calcC(15, Operacoes()::areaCircunferencia))
    println("Calculo Área do Losango")
    println(calcL(6, 8, Operacoes()::areaLosango))
    println("Calculo Área do Trapézio")
    println(calcT(22, 15, 12, Operacoes()::areaTrapezio))
}