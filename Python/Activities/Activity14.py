def f(num):
    if num <=1:
        return num
    else:
        return (f(num -1)+f(num-2))

number = int(input("Please enter a number : "))

if number <=0:
    print("Please enter positive number")
else:
    for i in range(number):
        print(f(i))
