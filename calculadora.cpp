#include <iostream>
#include <stdlib.h>
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
        cout<<"El resultado es: "<<res<<"\n";
        return res;
}

int resta(){
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var1;
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var2;
    res = var1 - var2;
    cout<<"El resultado es: "<<res<<"\n";
    return res;
}

int multip(){
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var1;
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var2;
    res = var1 * var2;
    cout<<"El resultado es: "<<res<<"\n";
    return res;
}

int division(){
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var1;
    cout<<"Ingresar un numero entero"<<"\n";
    cin>>var2;
    res = var1 / var2;
    cout<<"El resultado es: "<<res<<"\n";
    return res;
}
void calcular(){
        bool seguir= true;
        string respuesta; 
        while(seguir==true){
        cout<<"Ingresar signo de la operacion a realizar"<<"\n"<<"-- suma ( + ) | resta ( - ) | múltiplicación ( * ) | división ( / ) --"<<"\n";
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
            cout<<"--ERROR--"<<"\n";
        }
        cout<<"Si desea terminar ingrese f"<<endl;
        cout<<"Si desea continuar ingrese cualquier otro caracter"<<endl;
        cin>>respuesta;
        if(respuesta == "f"){
            seguir =false;
        }
        else{
            system("clear");
        }
        }

    }
int  main(){
    calcular();
}
