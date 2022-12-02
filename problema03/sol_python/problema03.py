nombre_empleado = input("Ingrese el nombre del empleado: ")
tipo_empleado = int(input("Ingrese el tipo de empleado: "))
horas_trabajadas = int(input("Ingrese el número de horas trabajadas: "))
sueldo_pagar = 0
if tipo_empleado == 1:
    sueldo_pagar = horas_trabajadas * 1.5
elif tipo_empleado == 2:
    sueldo_pagar = horas_trabajadas * 2
elif tipo_empleado == 3:
    sueldo_pagar = horas_trabajadas * 2.5
elif tipo_empleado == 4:
    sueldo_pagar = horas_trabajadas * 3
else:
    print("Tipo de empleado no válido")
print("El sueldo a pagar es: ", sueldo_pagar)
