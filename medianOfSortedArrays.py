# There are two sorted arrays nums1 and nums2 of size m and n respectively.

# Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

# You may assume nums1 and nums2 cannot be both empty.


def findMedian(a, b):
	i = 0
	j = 0
	c =[]
	while(i<len(a) and j<len(b)):
		if(a[i] < b[j]):
			c.append(a[i])
			i = i+1
		else:
			c.append(b[j])
			j = j+1

	while(i<len(a)):
		c.append(a[i])
		i = i+1

	while(j<len(b)):
		c.append(b[j])
		j = j+1

	if(len(c) % 2 == 0):
		medR = len(c)/2
		medL = medR-1
		median = float(c[medL] + c[medR])/2
		return median
	else:
		medIndex = len(c)/2
		median = c[medIndex]
		return median

a = [1, 2, 3]
b = [4, 5, 6, 7]
findMedian(a, b)