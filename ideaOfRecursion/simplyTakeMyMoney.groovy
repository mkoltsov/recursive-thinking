def simplyTake() {
	for (def i=0;i<10;i++) {
		println("took you money")
	}
}

simplyTake()

def tookRecursively(int amount) {
	if (amount == 1) {
		println("took your last money")
	} else {
		println("recursively took 1, ${amount} left")
		tookRecursively(amount-1)
	}
}

tookRecursively(10)
