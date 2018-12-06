def anagramGroups(strs):
	c = []
	dict = {}
	rtype = []

	for i in range(0, len(strs)):
		val = ''.join(sorted(strs[i]))
		if(val in dict.keys()):
			dict[val].append(strs[i])
		else:
			dict[val] = [strs[i]]

	rtype = dict.values()
	return rtype

print(anagramGroups(["hi", "what", "thaw"]))