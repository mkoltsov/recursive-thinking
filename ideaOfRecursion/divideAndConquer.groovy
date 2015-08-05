def list = (100..2000).collect {_ -> _ as char}

println(list)

def recursiveBoom(def list) {
	if (list.size() <= 2) {
		println(list)
	} else {
		//if (list.size() % 2 ==0) {
			def left = list.drop(list.size()/2 as int)
			//println(left.size())
			recursiveBoom(left)
			def start = list.minus(left)
			//println(start.size())
			recursiveBoom(start)
		//}
	}
}

//recursiveBoom(list)