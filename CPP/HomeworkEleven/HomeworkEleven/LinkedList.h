#pragma once
#include <iostream>

using namespace std;

class LinkedList
{
protected:
	struct ListNode
	{
		double value;
		ListNode *next;
		ListNode(double value1, ListNode *next1 = NULL)
		{
			value = value1;
			next = next1;
		}
	};
	ListNode *head;

public:
	LinkedList()
	{
		head = NULL;
	}

	void add(double x)
	{
		if (head == NULL)
		{
			head = new ListNode(x);
		}
		else
		{
			ListNode *nodePtr = head;		
			head = new ListNode(x, nodePtr);
			
		}
	}

	bool isMember(double x)
	{
		ListNode *nodePtr, *prevNodePtr;

		if (!head == NULL)
		{
			return false;
		}

		if (head->value == x)
		{
			return true;
		}
		else
		{
			nodePtr = head;
			while (nodePtr != NULL && nodePtr->value != x)
			{
				prevNodePtr = nodePtr;
				nodePtr = nodePtr->next;
			}
			if (nodePtr->value == x)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

	}

	void operator=(LinkedList &right)
	{
		ListNode *nodePtr = right.head;
		ListNode *copyPtr;
		ListNode *copyPtr2;
		head = NULL;
		//double temp;

		head = new ListNode(nodePtr->value);
		nodePtr = nodePtr->next;
		copyPtr2 = head;

		//copyPtr2 = 
		
		while (nodePtr != NULL)
		{
			copyPtr = new ListNode(nodePtr->value);
			copyPtr->next = NULL;

			copyPtr2->next = copyPtr;
			copyPtr2 = copyPtr;
			nodePtr = nodePtr->next;			
		} 

	}
	
	void print() const
	{
		ListNode *nodePtr = head;
		while (nodePtr)
		{
			cout << nodePtr->value << " ";
			nodePtr = nodePtr->next;
		}
	}

	void remove(double x)
	{
		ListNode *nodePtr, *prevNodePtr;

		if (!head)
		{
			return;
		}

		if (head->value == x)
		{
			nodePtr = head;
			head = head->next;
			delete nodePtr;
		}
		else
		{
			nodePtr = head;
			while (nodePtr != NULL && nodePtr->value != x)
			{
				prevNodePtr = nodePtr;
				nodePtr = nodePtr->next;
			}
			if (nodePtr)
			{
				prevNodePtr->next = nodePtr->next;
				delete nodePtr;
			}
			
		}
	}

	~LinkedList()
	{
		ListNode *nodePtr = head;
		while(nodePtr != NULL)
		{
			ListNode *garbage = nodePtr;
			nodePtr = nodePtr->next;
			delete garbage;
		}
	}
};