contador = 1
mensaje = ""
suma = 0
while contador < 101:
    mensaje = mensaje + "+1/" + str(contador)
    suma = suma + 1/contador
    contador = contador + 1
print(mensaje)
print("La suma es: ", suma)
