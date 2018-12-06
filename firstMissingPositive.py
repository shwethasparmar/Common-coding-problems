#Given an unsorted integer array, find the smallest missing positive integer.


def firstMissingPositive(nums):
	fmp = 1
	for i in range(0, len(nums)):
		if fmp in nums:
			fmp = fmp + 1
		else:
			return fmp

fmp = firstMissingPositive([2])
print fmp
