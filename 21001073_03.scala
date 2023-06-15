object volume_of_a_sphere extends App{
	
	val Pi = 3.14
	
	def volume(r:Double):Double = (4.0/3.0)*Pi*r*r*r
	
	printf("The volume of a sphere with radius 5 is %f\n", volume(5))
}


