#cerner_2^5_2019
i = 0
count = input("Enter noof elements you want")
numbers = list()
while i < int(count):
  n = input();
  numbers.append(int(n))
  i += 1
numbers.sort()
print('Sorted list:', numbers)