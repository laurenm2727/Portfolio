# Import the math module to access mathematical functions
import math

# Function to check if the entered password is correct

def checkpassword():
    # Ask the user for the password
    password = int(input("Please enter the password: "))
    # Keep asking for the password until it matches the correct one
    while password != 1234:
        password = int(input("Please enter the correct password: "))
         # Once the correct password is entered, proceed to the welcome message
    showhiwords()

# Function to display the welcome message and instructions

def showhiwords():
    print()
    print('***************************************')
    print('****Welcome to the maths calculator****')
    print('***************************************')
    print()
    print('********Please enter your name**********')

# Function to calculate the power of one number raised to another  

def power(num1, num2):
    return int(math.pow(num1, num2))

# Function to find and return the maximum of two numbers

def maxx(num1, num2):
    return max(num1, num2)

# Function to find and return the minimum of two numbers  
  
def minn(num1, num2):
    return min(num1, num2)

# Function to output the results of the mathematical operations

def output(name, num1, num2, power_result, greater_result, lesser_result):
    print()
    # Display the results of the power calculation
    print(f"{num1} to the power of {num2} is {power_result}")
    print()
    # Display which number is greater
    print(f"The larger from the two numbers entered is {greater_result}")
    print()
    # Display which number is smaller
    print(f"The smaller of the two numbers entered is {lesser_result}")
    print()
    # Thank the user for using the program
    print(f"Thank you {name} for using my Math calculation program.")
    print()

# Main program flow starts here

# Check if the entered password is correct
checkpassword()
# Ask for the user's name
name = input('')
# Ask for two numbers to perform operations on
num1 = int(input('Enter first number: '))
num2 = int(input('Enter second number: '))

# Calculate the power, maximum, and minimum of the two numbers
power_result = power(num1, num2)
greater_result = maxx(num1, num2)
lesser_result = minn(num1, num2)

# Output the results of the operations
output(name, num1, num2, power_result, greater_result, lesser_result)