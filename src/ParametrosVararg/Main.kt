package ParametrosVararg

import com.sun.org.apache.xml.internal.serializer.utils.Utils.messages
import jdk.internal.joptsimple.internal.Messages.message


fun main() {

        fun printAll(vararg messages: String) {
            for (m in messages) println(m)

        }
        printAll("Hello", "Hallo", "Salut", "Hola", "oi")

        fun printAllWithPrefix(vararg messages: String, prefix: String) {
            for (m in messages) println(prefix + m)
        }

        printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "oi",
                            prefix = "Rádio:  "
        )

    fun log(vararg entries: String) {
        printAll(*entries)
    }


}





