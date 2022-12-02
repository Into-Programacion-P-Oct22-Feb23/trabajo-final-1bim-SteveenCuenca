numero = 0
suma = 0
contador = 0
bandera = True
salir = 0
media = 0
informe = "La media es igual a "

while bandera:
    numero = int(input("Ingrese un número: "))
    suma = suma + numero
    contador = contador + 1
    salir = int(input("Ingrese 1 para salir: "))
    if salir == 1:
        bandera = False

media = suma/contador
informe = informe + str(media)
print(informe)
