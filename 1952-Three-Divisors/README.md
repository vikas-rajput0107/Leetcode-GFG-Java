# 1952. Three Divisors

**Difficulty:** Easy

## Problem Statement
Given an integer `n`, return `true` if `n` has **exactly three positive divisors**. Otherwise, return `false`.

An integer `m` is a divisor of `n` if there exists an integer `k` such that `n = k * m`.

## Approach
To determine if the number `n` has exactly three divisors, we can iterate through all integers from `1` up to `n`. We maintain a `count` variable, incrementing it every time we find a number `i` that divides `n` evenly (`n % i == 0`). After the loop, we check if the count is exactly 3.

## Complexity
- **Time Complexity:** $O(n)$ because the loop runs `n` times.
- **Space Complexity:** $O(1)$ since we are only using a single integer variable to store the count.

## Performance
- **Runtime:** 1 ms, Beats 71.77%
- **Memory:** 41.44 MB, Beats 99.64%