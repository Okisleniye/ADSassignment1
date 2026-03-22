# Assignment 1 - Recursion

## Student Information
* **Name:** Fariddin Dautov
* **Group:** [IT-2504]

### Task 1. Print Digits of a Number
* **Description:** Takes an integer as input and prints every digit of the given number on a separate line.
* **Explanation:** The base case stops if the number is less than 10. The recursive step uses integer division to drop the last digit, processes the rest first, and then prints the remainder.
* **Output Screenshot:**
![Task 1 Output](images/task1.png)

### Task 2. Average of Elements
* **Description:** Write a recursive function to calculate the sum of the elements, then compute the average using the result.
* **Explanation:** The base case is when the index of the array reaches zero. It adds elements one by one as the call stack unwinds, and the final sum is divided by the length of the array.
* **Output Screenshot:**
![Task 2 Output](images/task2.png)

### Task 3. Prime Number Check
* **Description:** Checks whether a number n is prime.
* **Explanation:** The function recursively checks remainders with an incremented divisor until it passes the square root of the number.
* **Output Screenshot:**
![Task 3 Output](images/task3.png)

### Task 4. Factorial
* **Description:** Calculates the factorial of a number n.
* **Explanation:** Checks for the base case of 0 or 1. The step multiplies the current number by the factorial of n - 1.
* **Output Screenshot:**
![Task 4 Output](images/task4.png)


### Task 5. Fibonacci Number
* **Description:** Finds the n-th Fibonacci number.
* **Explanation:** Uses base cases F_0 = 0 and F_1 = 1 to stop the recursion tree, and sums the previous two numbers.
* **Output Screenshot:**
![Task 5 Output](images/task5.png)

### Task 6. Power Function
* **Description:** Returns the value of a raised to the power of n.
* **Explanation:** The base case checks if n is zero (returning 1). The recursive step multiplies the base a by the function of n - 1.
* **Output Screenshot:**
![Task 6 Output](images/task6.png)

### Task 7. Reverse Output
* **Description:** Reads and prints n numbers in reverse order without using loops or another array.
* **Explanation:** Leverages the execution call stack by reading a value, recurring for the next values, and printing it on the way back down.
* **Output Screenshot:**
![Task 7 Output](images/task7.png)

### Task 8. Check Digits in String
* **Description:** Checks if a string contains only digits.
* **Explanation:** Compares characters one by one by passing substring slices. It returns false immediately if it encounters a non-digit character.
* **Output Screenshot:**
![Task 8 Output](images/task8.png)

### Task 9. Count Characters in a String
* **Description:** Counts the number of characters in a given string.
* **Explanation:** The base case is an empty string, and the recursive step adds 1 for the current character and calls the function with the rest of the string.
* **Output Screenshot:**
![Task 9 Output](images/task9.png)

### Task 10. GCD (Euclidean Algorithm)
* **Description:** Finds the GCD of two numbers using the Euclidean Algorithm.
* **Explanation:** The modulo operation is passed as a parameter to the next call until the second number reaches zero.
* **Output Screenshot:**
![Task 10 Output](images/task10.png)

---

## Summary of Work Process
* All tasks were implemented using recursion only.
* Loops (for, while, do-while) were not used.
* Practiced utilizing the execution call stack to manage data order and state tracking without extra memory structures.
