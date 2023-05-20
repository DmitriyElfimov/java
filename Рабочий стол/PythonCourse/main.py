n = 5

print('a', 'b', 'c', sep=' - ', end=' ')
print(1, 2, 3, sep='+')

name = input('Enter your name ')
print(f'Hello, {name}')

n = int(input())

if n < 0:
    print('меньше нуля')
elif n % 2 == 0:
    print('четное')
else:
    print('нечетное')


a=[1,2,3,4]

for i, element in enumerate(a):
    if element > 2:
        print(f'{i}-th element > 2')

n=10
while n > 1:
    print(n)
    n -= 1



n = int(input())
m = int(input())

semi_res = m/n
print(semi_res + (1-(semi_res%1)))