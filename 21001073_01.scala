object Area extends App{
	val Pi = 3.14
	
	def area(r:Double):Double = Pi*r*r
	
	printf("Area of a disk with radius %d is %f\n", 5, area(5.0))
}


