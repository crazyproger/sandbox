import java.JavaInterface

open class A {
    open fun f() {
        print("A")
    }
    fun a() {
        print("a")
    }
}

abstract class KotlinAbstract {
    abstract fun abstract()
}

trait B {
    public open fun f() {
        print("B")
    }
    open fun b() {
        print("b")
    }
}

class C(): A(), B, Runnable{

}

class FromJava(): JavaInterface {

}

class FromCompiled(): Runnable{

}

class FromAnotherKotlin(): Klass() {

}

class MyBaseStringList: java.util.AbstractList<String>() {

}