```
Foo(A, B):
	for i = 1 to 2n        1
		C[i] = A[i] + B[i] 4
	return C               1
```

Assuming `2n` wasn't a typo:
`T(8n + 2)`

If it wasn't on purpose:
`T(4n + 2)`

and in both of these cases the function is linear. 
Shouldn't `1 to 2n` be out of bounds considering the arrays are of size `n`