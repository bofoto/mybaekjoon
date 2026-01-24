Max = 0
index = 0

for i in range(9):
    a = int(input())
    if(Max < a):
        Max = a
        index = i+1

print(Max)
print(index)
