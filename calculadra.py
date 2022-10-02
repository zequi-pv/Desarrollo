
from os import system


def operacion(n1,n2,operador):
    if operador == "+":
        return n1 + n2
    elif operador == "-":
        return n1 - n2
    elif operador == "*" or operador == "x" or operador == ".":
        return n1 * n2
    elif operador == "/":
        if(n2 == 0):
            return "NO se puede dividir por 0"
        return n1 / n2 
    else:
        return "Operador no valido"             
salir = False
while salir == False:
    n1 = int(input("Nro 1: ") )
    n2 = int(input("Nro 2: ") )
    operador = str(input("Operador: "))

    resultado  = operacion(n1,n2,operador)
    print(resultado)
    salida= str(input("Quiere hacer otro calculo? Escriba si o no: "))
    if salida == "no":
        print("Hasta la proxima")
        