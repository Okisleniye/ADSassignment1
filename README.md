# Assignment 1 - Recursion

## Student Information
 **Name:** Fariddin Dautov
 **Group:** [IT-2504]

### Task 1. Print Digits of a Number
 **Description:** Takes an integer as input and prints every digit of the given number on a separate line.
  
  **Explanation:** The base case stops if the number is less than 10. The recursive step uses integer division to drop the last digit, processes the rest first, and then prints the remainder.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 205351" src="https://github.com/user-attachments/assets/b239f5d5-494c-4e6c-af1e-1ac82c59ad02" />


### Task 2. Average of Elements
 **Description:** Write a recursive function to calculate the sum of the elements, then compute the average using the result.
 
 **Explanation:** The base case is when the index of the array reaches zero. It adds elements one by one as the call stack unwinds, and the final sum is divided by the length of the array.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 205606" src="https://github.com/user-attachments/assets/6e6f8b85-0cdd-4c0c-ba03-2c67df43720c" />


### Task 3. Prime Number Check
 **Description:** Checks whether a number n is prime.
 
 **Explanation:** The function recursively checks remainders with an incremented divisor until it passes the square root of the number.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 205732" src="https://github.com/user-attachments/assets/ffdd1fdb-0e03-44f0-b8f9-723e804747cf" />
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 205753" src="https://github.com/user-attachments/assets/9ae7a484-cc47-4ade-b41c-11c45fcbe237" />


### Task 4. Factorial
 **Description:** Calculates the factorial of a number n.
  
 **Explanation:** Checks for the base case of 0 or 1. The step multiplies the current number by the factorial of n - 1.

<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 205842" src="https://github.com/user-attachments/assets/3572ceba-7da3-4a78-9378-ccde78ef8bf7" />


### Task 5. Fibonacci Number
**Description:** Finds the n-th Fibonacci number.
  
**Explanation:** Uses base cases F_0 = 0 and F_1 = 1 to stop the recursion tree, and sums the previous two numbers.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 205937" src="https://github.com/user-attachments/assets/17685154-561e-4b3d-8ff3-3fe7dedb521d" />
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 205959" src="https://github.com/user-attachments/assets/38ec6e64-ab0b-47f5-bb67-fdf6078657b8" />


### Task 6. Power Function
**Description:** Returns the value of a raised to the power of n.

**Explanation:** The base case checks if n is zero (returning 1). The recursive step multiplies the base a by the function of n - 1.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 210044" src="https://github.com/user-attachments/assets/416f9103-83e7-4555-a077-4fc0dcdc28a2" />


### Task 7. Reverse Output
**Description:** Reads and prints n numbers in reverse order without using loops or another array.

**Explanation:** Leverages the execution call stack by reading a value, recurring for the next values, and printing it on the way back down.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 210515" src="https://github.com/user-attachments/assets/46bf6cdd-1c91-4e39-92da-b79aafa660a5" />


### Task 8. Check Digits in String
**Description:** Checks if a string contains only digits.

**Explanation:** Compares characters one by one by passing substring slices. It returns false immediately if it encounters a non-digit character.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 210600" src="https://github.com/user-attachments/assets/e8910394-c49c-488d-92c8-cc194f483ea2" />
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 210621" src="https://github.com/user-attachments/assets/58acbf16-5410-4a97-9a52-bb7ac502e22f" />

### Task 9. Count Characters in a String
**Description:** Counts the number of characters in a given string.

**Explanation:** The base case is an empty string, and the recursive step adds 1 for the current character and calls the function with the rest of the string.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 210708" src="https://github.com/user-attachments/assets/6c13f031-f9dd-434c-b635-379b24c4837f" />
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 210727" src="https://github.com/user-attachments/assets/b87cbf8a-7e25-463a-b932-d57604f4f4d1" />


### Task 10. GCD (Euclidean Algorithm)
**Description:** Finds the GCD of two numbers using the Euclidean Algorithm.

**Explanation:** The modulo operation is passed as a parameter to the next call until the second number reaches zero.
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 210816" src="https://github.com/user-attachments/assets/d34ef08a-db61-433f-ac3a-ebe25a663f98" />
<img width="1920" height="1140" alt="Снимок экрана 2026-03-22 210833" src="https://github.com/user-attachments/assets/441df61c-eeb1-4e1c-8c26-72edbca09091" />

