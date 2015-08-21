def fact(int n) {
	def accum = 1
	for (def i=n; i>0; i--) {
		accum*=i
	}
	println(accum)
}

def fact2(int n) {
	def accum = 1

	for(def i=1; i<=n;i++){
		accum*=i
	}

	println(accum)
}


fact(7)

fact2(7)
