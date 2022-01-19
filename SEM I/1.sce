clc;
deff('[y]=f(x)','y=x^3-5*x+3');
deff('[y]=fd(x)','y=3*x^2-5');
x0=input("Enter value of x0=");
x1=input("Enter value of x1=");
i=0;
error=input("error=");
disp("By Newton Raphson Method")
disp("Roots")
while(abs(x0-x1)>=error)
    y=x0-(f(x0)/fd(x0));
    disp(y);
    x1=x0;
    x0=y;
    i=i+1;
end
disp("No of iterations")
disp(i);    
    

