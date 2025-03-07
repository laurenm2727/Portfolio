count = 0

while count < 5:  
    fName = (input("Enter First Name: "))
    lName = (input("Enter Last Name: ")) 

    grade1 = float(input("Enter Grade: "))
    if grade1 < 0 or grade1 > 100:  
        print("Invaild Grade. Enter vaild grade 0 - 100")
        grade1 = float(input("Enter Grade: "))

    grade2 = float(input("Enter Grade: "))
    if grade2 < 0 or grade2 > 100:
        print("Invaild Grade. Enter vaild grade 0 - 100")
        grade2 = float(input("Enter Grade: "))

    grade3 = float(input("Enter Grade: "))
    if grade3 < 0 or grade3 > 100:
        print("Invaild Grade. Enter vaild grade 0 - 100")
        grade3 = float(input("Enter Grade: "))

    total = (grade1 + grade2 + grade3)
    avg = total/3 

    print("\nYour Initials are: "+ fName[0] + ", " + lName[0])
    print("\nYour Average Grade is: ", round(avg, 2),"%")
    print("\n")
    count += 1 



