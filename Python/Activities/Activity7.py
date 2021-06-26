from typing import ItemsView


newlist= list(input("Enter the numbers use comma saperater").split(','))
sum=0
for item in newlist:
    sum+=int(item)
print("sum is "+str(sum))