//1
def normalpay(hours:Int):Int=hours*150

def otpay(hours:Int):Int=hours*75

def fullpay(h1:Int,h2:Int):Int=normalpay(h1)+otpay(h2)

def tax(fullpay:Int):Double=fullpay*0.1

def takehome(h1:Int,h2:Int):Double=fullpay(h1,h2)-tax(fullpay(h1,h2))

//2
def attendees(price:Int):Int=120+((15-price)/5)*20

def revenue(price:Int):Int=attendees(price)*price

def cost(price:Int):Int=attendees(price)*3+500

def profit(price:Int):Int=revenue(price)-cost(price)
