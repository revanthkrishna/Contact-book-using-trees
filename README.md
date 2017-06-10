# Contact-book-using-trees
----------------------------------------------------------------------------------------------
This is a contact application. It follows these rules.

The application must perform two types of operations:
1. "add name", where "name" is a string denoting a contact name. This must store name as a new contact in the application.
2. "find partial", where "partial" is a string denoting a partial name to search the application for. It must count the number of contacts starting with "partial" and print the count on a new line.

Given 'n' sequential add and find operations, perform each operation in order.
----------------------------------------------------------------------------------------------
Input Format

The first line contains a single integer, n, denoting the number of operations to perform. 
Each line i of the n subsequent lines contains an operation in one of the two forms defined above.

It is guaranteed that 'name' and 'partial' contain lowercase English letters only.
The input doesn't have any duplicate 'name' for the 'add' operation.
----------------------------------------------------------------------------------------------
Output Format

For each 'find partial' operation, print the number of contact names starting with 'partial' on a new line.
----------------------------------------------------------------------------------------------
Sample Input

4
add hack
add hackerrank
find hac
find hak
----------------------------------------------------------------------------------------------
Sample Output

2
0
----------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------
Solution:

This program uses trees. Each node in the tree is associated with a number,a char and can have 26 children(one for each alphabet).
The number associated with a node tells the number of contacts that contain that char. 
The char of root node is '*' and num is 0.

ADD operation
This op constructs the tree. The tree is constructed according to the chars of the contact.

FIND op
This op traverses the tree until the last char of 'partial'; the num associated with this node is the required result.
If we encounter a null during traversal, then the result is 0.
