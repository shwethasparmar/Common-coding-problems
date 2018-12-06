
def removeDuplicates(a):
	noDuplicates = []
	for i in range(0, len(a)-1):
		currentNum = a[i]
		nextNum = a[i+1]
		if currentNum != nextNum:
			noDuplicates.append(currentNum)
			currentNum = nextNum
		else: 
			currentNum = nextNum
	noDuplicates.append(currentNum)
	return noDuplicates

print (removeDuplicates([7, 7, 8, 9, 10, 11, 12, 12, 12]))