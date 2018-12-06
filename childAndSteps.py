#A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.

def step(stepNo, n):
	if(stepNo + 1 == n ):
		return 1
	elif (stepNo + 2 == n):
		return 2
	elif (stepNo +3 == n ):
		return 4

	return step(stepNo+1, n) + step(stepNo+2, n) + step(stepNo+3, n)

print(step(0,5))
