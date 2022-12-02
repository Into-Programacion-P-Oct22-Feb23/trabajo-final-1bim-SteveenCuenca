x = int(input("Ingrese el valor de X: "))
y = int(input("Ingrese el valor de Y: "))
if x > 0 and y > 0:
    print("El punto (" + str(x) + ", " + str(y) + ") se encuentra en el primer cuadrante.")
elif x < 0 and y > 0:
    print("El punto (" + str(x) + ", " + str(y) + ") se encuentra en el segundo cuadrante.")
elif x < 0 and y < 0:
    print("El punto (" + str(x) + ", " + str(y) + ") se encuentra en el tercer cuadrante.")
elif x > 0 and y < 0:
    print("El punto (" + str(x) + ", " + str(y) + ") se encuentra en el cuarto cuadrante.")
elif x == 0 and y == 0:
    print("El punto (" + str(x) + ", " + str(y) + ") se encuentra en el origen.")
elif x == 0 and y != 0:
    print("El punto (" + str(x) + ", " + str(y) + ") se encuentra sobre el eje Y.")
elif x != 0 and y == 0:
    print("El punto (" + str(x) + ", " + str(y) + ") se encuentra sobre el eje X.")