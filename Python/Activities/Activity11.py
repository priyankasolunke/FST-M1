fruits = {"banana":20, "orange" :60, "apple" : 180,
"custardapple" : 100, "Chiku" : 80, "pineapple": 120,
"grapes": 90, "watermelon": 110, "coconut": 40, }
while(True):
    chosefr=input("enter which fruit you want: ").lower()
    sum=0
    for fruit in fruits:
        if chosefr == fruit:
            sum+=1
            print("Nice.. It is available at our store at price "+str(fruits[fruit]))
            break
    if sum ==0:
        print("sorry.."+chosefr+" is not available")
    more=input("Do you want to get some more fruits Y/N : ").lower()
    if more=="n":
        print("Goodbye then!!")
        break
    