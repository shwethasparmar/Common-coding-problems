# Given a 32-bit signed integer, reverse digits of an integer.


def reverseInt(num):
	reversednum = 0
	flag = False

	if num < 0:
		flag = True

	num = abs(num)
	
	while(num != 0):
		remainder = num % 10 
		num = num/10
		reversednum = ( reversednum * 10 ) + remainder

	if flag: 
		return reversednum * -1

	return reversednum

print(reverseInt(-321))
