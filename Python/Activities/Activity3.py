user1=input("Who is first user")
user2=input("who is second user")
input1=input(user1+" Enter your choice among Rock, Paper, Scissors").lower()
input2=input(user2+" Enter your choice among Rock, Paper, Scissors").lower()
if input1==input2:
    print("its a tie")
elif input1=="rock": 
    if input2=="paper":
        print("paper beats rock!!!")
    else:
        print("Rock beats scissors")
elif input1=="scissors":
    if input2=="rock":
        print("rock beats scissors")
    else:
        print("Scissors beat paper")
elif input1=="paper":
    if input2=="rock":
        print("paper beats rock!")
    else:
        print("scissors beat paper")
else:
    print(user1+ "has chosen wrong word. Try again...")


