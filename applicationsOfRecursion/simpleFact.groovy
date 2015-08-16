def fact(int n) {
	def accum = 1
	for (def i=n; i>0; i--) {
		accum*=i
	}
	println(accum)
}

fact(7)