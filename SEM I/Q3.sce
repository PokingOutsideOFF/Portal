clc;
A=[12 -1 2; 1 3 3; 1 2 5]
B=[3; -1; 1]
disp('[A B]=')
disp([A B])
n=5
disp("No. of iterations")
disp(n)
x0=0.3
y0=-0.8
z0=0.3
for i=0:n
    x(i+1)=(B(1)-A(1,2)*y0-A(1,3)*z0)/A(1,1)
    y(i+1)=(B(2)-A(2,1)*x(i+1)-A(2,3)*z0)/A(2,2) 
    z(i+1)=(B(3)-A(3,1)*x(i+1)-A(3,2)*y(i+1))/A(3,3)
    x0=x(i+1)
    y0=y(i+1)
    z0=z(i+1)
end
disp('x=')
disp(x)
disp('y=')
disp(y)
disp('z=')
disp(z)

