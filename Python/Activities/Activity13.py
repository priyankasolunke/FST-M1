
def functionsum(givennumbers):
    sum=0
    for number in givennumbers:
        sum=sum+number
    return sum
'''print("provide numbers"+number)'''
givennumbers={10,37,87,0,9}
result = functionsum(givennumbers)
print("sum of given numbers is "+str(result))
