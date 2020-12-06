valid(X,Y,Z) :- num(X), num(Y), num(Z), X+Y+Z = 2020, X<Y, Y<Z. 
good(N) :- valid(X,Y,Z), N = X * Y * Z. 
#show good/1.
#show valid/3.
