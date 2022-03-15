shop = {
    "mango" : 40,
    "peach" : 100,
    "kiwi" : 75
}

j = input("What fruit you want?")

if(j in shop):
    print("Fruit is available")
else:
    print("Fruit is not available")