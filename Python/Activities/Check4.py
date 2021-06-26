example_dict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
def my_func(name,age):
    print("name is "+name+ " and age is "+str(age))
my_func("priya",28)
def a_func(*names):
    print("name of 3rd member is "+names[2])
a_func("enter"," 5 ","names", "saperated" "by , :")
'''
for x in example_dict:
  print(x)
	
for x in example_dict:
  print(example_dict[x])
	
for x in example_dict.values():
  print(x)
for x, y in example_dict.items():
  print(x, y)
print(len(example_dict))
print(example_dict)
example_dict["color"]="Pink"
print(example_dict)
example_dict.popitem()
print(example_dict)
example_dict.pop("model")
print(example_dict)'''