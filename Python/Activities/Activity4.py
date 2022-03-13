user1 = input("Player 1's name : ")
user2 = input("Player 2's name : ")

while True:
    x = input(user1 + ", do you want to choose rock, paper or scissors? ")
    y = input(user2 + ", do you want to choose rock, paper or scissors? ")
    if x==y:
        print("Draw")
    elif x == 'scissors':
        if y == 'paper':
            print("Scissor is winner")
        else:
            print("ROck is winner")
    elif x == 'rock':
        if y == 'Scissor':
            print("Rock is winner")
        else:
            print("Paper is winner")
    elif x== 'paper':
        if y== 'rock':
            print("Paper is winner")
        else:
            print("Scissor is winner")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat = input("Do you want to play another round? Yes/No: ").lower()
    if(repeat == "yes"):
            pass
    elif(repeat == "no"):
            raise SystemExit
    else:
            print("You entered an invalid option. Exiting now.")
            raise SystemExit