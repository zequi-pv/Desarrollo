#include <iostream>
using namespace std;

int var1;
int var2;
char signo;
int res;

int suma(){
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var1;
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var2;
        res = var1 + var2;
        cout<<res<<"\n";
}

int resta(){
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var1;
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var2;
    res = var1 - var2;
    cout<<res<<"\n";
}

int multip(){
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var1;
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var2;
    res = var1 * var2;
    cout<<res<<"\n";
}

int division(){
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var1;
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var2;
    res = var1 / var2;
    cout<<"El resultado es: "<<res<<"\n";
}
void calcular(){
        cout<<"Ingresar signo de la operacion a realizar"<<"\n";
        cin>>signo;
        if(signo == '+'){
            suma();
        }
        else if(signo == '-'){
            resta();
        }
        else if(signo == '*'){
            multip();
        }
        else if(signo == '/'){
            division();
        }
        else{
            cout<<"ERROR"<<"\n";
        }

    }
int  main(){
    calcular();
}