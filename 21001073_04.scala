object bookstores extends App{
	
	def price(amount:Int) = amount*24.95
	
	def discount(price:Double):Double = price*0.4
	
	def shipping_cost(amount:Int):Double = if(amount > 50){
		(50*3 + (amount-50)*0.75)
		}else{
		amount*3}
	
	printf("wholesale cost for 60 copies is %f\n", price(60) - discount(price(60)) + shipping_cost(60))
}


