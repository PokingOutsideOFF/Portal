clc;
deff('[y]=f(x)','y=x^4-32');
deff('[y]=fd(x)','y=4*x^3');
x=3;x1=0;i=0;
error=0.000001;
disp("x=")
disp(x)
disp("x1=")
disp(x1)
disp("By Newton Rhapson Method")
disp("Roots")
while(abs(x-x1)>=error)
    y=x-(f(x)/fd(x))
    disp(y)
    x1=x
    x=y
    i=i+1
end
disp("No. of iterations")
disp(i)
