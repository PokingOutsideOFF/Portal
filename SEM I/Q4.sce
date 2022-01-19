clc;
deff('y=f(x)','y=x^4+x^3-7*x^2-x+5')
deff('[y]=fd(x)','y=4*x^3+3*x^2-14*x-1')
a=2
disp('a=')
disp(a)
disp('b=')
b=3
disp(b)
n=10
disp('No.of iteration:')
disp(n)
disp("By Regula Falsi Method")
for i=1:n
    c=(a*f(b)-b*f(a))/(f(b)-f(a))
    disp([i,c])
if f(a)*f(c)<0 then
    b=c
end
if f(b)*f(c)<0 then
    a=c
end
c1=(a*f(b)-b*f(a))/(f(b)-f(a))
if abs(c1-c)<0.00001 then
    disp("These are the roots")
    break;
    end
end
disp('These are the roots')   
