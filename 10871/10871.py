N = list(map(int,input().split()))
arr = list(map(int, input().split()))
X = N[1]
result = [num for num in arr if num < X]
print(*result)