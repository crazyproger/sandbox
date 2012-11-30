import java.Example

open class A {
    open fun f() {
        print("A")
    }
    open fun a() {
        print("a")
    }
}

trait B {
    open fun f() {
        print("B")
    }
    open fun b() {
        print("b")
    }
    open fun c() {
        print("c")
    }
}

class C(): A(), B {

}

class Test: Example{

}

//class D(){
//    var a:String=""
//    var b:String=""
//
//    fun me(<#<params>#>): <#<returnType>#> {
//        this.a
//    }
//
//}

fun main(arg: String) {

}