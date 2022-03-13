name1 = input("Player Name 1 : ")
name2 = input ("Player Name 2 : ")
x= input("Player1 please provide the sign : ")
y = input("Player2 please provide the sign : ")

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
