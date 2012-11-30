class AA { // implicit label @A
    class B { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val a = this@AA // A's this
            val b = this@B // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int
        }
    }
}