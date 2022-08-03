# Oleg

# n = int(input())
# k = int(input())
# t = []
# sum = 0
# sum2 = 0
# for i in range(n):
#     a = int(input())
#     for j in range(k):
#             t.append(a)
# for p in range(len(t)):
#     if a < t[p]:
#         t[p] = a
# for i in range(k):
#     sum += t[i]
#     sum2 += 9
# print(sum)
# print(sum2 - sum)


# Andrey

# n = int(input())
# k = int(input())
# a = []
# for i in range(k):
#     a.append(int(input()))
# for i in range(k, n):
#     c = int(input())
#     for j in range(len(a)):
#         if c < a[j]:
#             a[j] = c
#             break
# b = 0
# for i in range(len(a)):
#     b += a[i]
#
# print(9 * k - b)


# Mine

# sum = 0
# n, k = [int(a) for a in input().split()]
#
# digits = []
# for i in range(10):
#     digits.append(0)
#
# nums = [int(a) for a in input().split()]
# for i in nums:
#     digits[i] += 1
#
# print(digits)
# digitNumber = 0
# for i in range(len(digits)):
#     if digitNumber + digits[i] < k:
#         sum += digits[i] * i
#         digitNumber += digits[i]
#     else:
#         coefficient = k - digitNumber
#         sum += coefficient * i
#         digitNumber += coefficient
#
# print(9 * digitNumber - sum)


# 10
# 5
# 2
# 3
# 8
# 6
# 1
# 2
# 4
# 9
# 5
# 9

# 10 5
# 2 3 8 6 1 2 4 9 5 9