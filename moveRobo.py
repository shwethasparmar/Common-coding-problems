# Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can
# only move in two directions: right and down. How many possible paths are there for
# the robot?

# FOLLOW UP
# Imagine certain squares are off limits, such that the robot can not step on them.
# Design an algorithm to get all possible paths for the robot.
from array import *;

def moveRobo(r, c , numRows, numCols):
	global totalPaths
	print "Called moveRobo with (%s, %s)" % (str(r), str(c))
	if(r==numRows and c==numCols):
		totalPaths = totalPaths + 1
		return

	if (c+1 <= numCols):
		if(a[r][c+1] != 0):
			print "Taking right"
			moveRobo(r, c+1, numRows, numCols)

	if (r+1 <= numRows):
		if(a[r+1][c] !=0):
			print "Going down"
			moveRobo(r+1, c, numRows, numCols)


totalPaths = 0
n = 3
a = [[1] * n for i in range(n)]

a[0][2] = 0
a[2][1] = 0

res = moveRobo(0, 0, 2, 2)
print "The total number of paths found were -> " +str(totalPaths)

for row in a:
    print(' '.join([str(elem) for elem in row]))