package com.leo

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {

	build()
	    .args(*args)
		.packages("com.leo")
		.start()
}

