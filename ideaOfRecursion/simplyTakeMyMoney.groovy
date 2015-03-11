@Grapes( 
@Grab(group='com.google.guava', module='guava', version='19.0-rc1') 
)

def simplyTake() {
	for (def i=0;i<10;i++) {
		println("took your money")
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

//will implement later after complete understanding of the concept
def tookViaDivideAndConquer(def amount) {
	if (amount == 1) {
		amount--
		println("took 1")
	} else {
		println("recursively took 1, ${amount} left")
		int ten = 10
		tookViaDivideAndConquer(amount/ten)
	}
}

tookViaDivideAndConquer(100)

def list = ["chef", "chef1","chef2","chef3","chef4","chef5","chef6","chef7","chef8"]

def applyFunctionOnCollection(def coll, def func) {
	if (coll.size() ==1) {
		func(coll)
	} else {
		func(coll[coll.size()-1])
		coll.remove(coll.size()-1)
		applyFunctionOnCollection(coll, func)
	}
}

def clos = {_ -> println(_)}

applyFunctionOnCollection(list, clos)
