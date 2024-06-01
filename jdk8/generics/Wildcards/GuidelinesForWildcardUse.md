# One of the more confusing aspects when learning to program with generics is determining when to use an upper bounded wildcard and when to use a lower bounded wildcard

# Wildcard Guidelines:
## - An "in" variable is defined with an upper bounded wildcard, using the extends keyword.
## - An "out" variable is defined with a lower bounded wildcard, using the super keyword.
## - In the case where the "in" variable can be accessed using methods defined in the Object class, use an unbounded wildcard.
## - In the case where the code needs to access the variable as both an "in" and an "out" variable, do not use a wildcard.