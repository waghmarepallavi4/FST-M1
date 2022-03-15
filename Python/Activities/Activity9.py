l1 = [1, 2, 3, 4, 5]
l2 = [20, 13, 29, 12]

print("first list",l1)
print("second list",l2)
l3=[]

for num in l1:
    if(num %2 !=0):
        l3.append(num)

for num in l2:
    if(num %2 == 0):
        l3.append(num)

print("third list",l3)
