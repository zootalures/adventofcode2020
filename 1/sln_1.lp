valid(X,Y):- num(X), num(Y),X!=Y, X+Y= 2020.
good(Z) :- valid(X,Y),num(X), num(Y), Z = X*Y. 

#show good/1.
#show valid/2.
