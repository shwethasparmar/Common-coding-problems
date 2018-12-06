# You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
# You may assume the two numbers do not contain any leading zero, except the number 0 itself.

class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None



class createLinkedList():
	def create(self, number):
		head = None
		a = str(number)
	   	previous = None
	   	current = None
	   	for i in range(len(a)-1, -1, -1):
	   		current = ListNode(int(a[i]))
	   		if (not head):
	   			head = current
	   		if (previous):
	   			previous.next = current
	   		previous = current
	   	return head


class addLinkedList():
	def add(self, l1, l2):
		head = None
		previous = None
		carryOver = 0

		while(l1 or l2 or carryOver):
			val = 0
			if(l1):
				val = val + l1.val
				l1 = l1.next
			if(l2):
				val = val + l2.val
				l2 = l2.next
			if(carryOver):
				val = val + carryOver
				carryOver = 0
			if(val > 9):
				val = val - 10
				carryOver = 1
			newNode = ListNode(val)

			if not head:
				head = newNode
				previous = newNode

			previous.next = newNode
			previous = newNode

		return head

def printList(listHead):
	while(listHead):
		print listHead.val
		listHead = listHead.next

cc = createLinkedList()
ll1 = cc.create(9)
ll2 = cc.create(99)
newList = addLinkedList().add(ll1, ll2)
printList(newList)

