# 2413. Smallest Even Multiple

## Problem Description
Given a positive integer `n`, the task is to find and return the smallest positive integer that is a multiple of both `2` and `n`.

**Difficulty:** Easy

## Performance
* **Runtime:** 0 ms (Beats 100.00%)
* **Memory:** 41.54 MB (Beats 98.48%)

## Intuition & Approach
Instead of using conditional `if-else` statements to check if `n` is even or odd, we can use a clever mathematical formula to solve this in a single line without branching logic.

The formula relies on the modulo operator (`%`):
* `n % 2` will always return `0` if `n` is even, and `1` if `n` is odd.
* By adding `1` to this result `(n % 2 + 1)`, we create a dynamic multiplier:
  * If `n` is **even**: `(0 + 1) = 1`. We multiply `n * 1`, returning `n`.
  * If `n` is **odd**: `(1 + 1) = 2`. We multiply `n * 2`, returning `2n`.

This approach eliminates the need for conditional branches at the CPU level, making it extremely fast and memory-efficient.

## Solution

```java
class Solution {
    public int smallestEvenMultiple(int n) {
        return n * (n % 2 + 1);
    }
}