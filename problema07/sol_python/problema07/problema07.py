numero = ""
numero = int(input("Ingrese el número que desea sumar"))
contador = 2
resultado = 0
cadena = ""
if numero %2 <= 0:
    while contador <= 2:
        cadena = print(F" {numero} ", end= "")
        resultado = numero + contador
        contador = contador + 2
else:
    print("Error el número es menor a 2")

print(f"La suma es: {resultado}")