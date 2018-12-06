# Given an array of integers, return indices of the two numbers such that they add up to a specific target.

# You may assume that each input would have exactly one solution, and you may not use the same element twice.


import math
class Solution(object):
    def twoSum(self, nums, target):
        rtype = []
        for i in range(len(nums)):
            delta = abs(nums[i] - target)
            if(delta in nums and (nums.index(delta) != i)):
                rtype.append(i)
                rtype.append(nums.index(delta))
                return rtype
        return rtype

nums = [3, 2, 4]
target = 6
sol = Solution()
rtype = sol.twoSum(nums, target)
print rtype