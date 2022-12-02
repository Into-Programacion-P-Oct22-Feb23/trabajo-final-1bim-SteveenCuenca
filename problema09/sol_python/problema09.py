numero_grupo=1
parejas=1
s1="s1="
while numero_grupo <= 4:
    while parejas <= 2:
        if parejas %2==0:
            s1=s1+str(numero_grupo*11)
            s1=s1+"+"
        else:
            s1=s1+str(numero_grupo*12)
            s1=s1+"-"
        parejas=parejas+1
    parejas=1
    numero_grupo=numero_grupo+1
print(s1)
once=int(input(0))
doce=int(input(0))                 #S1 = 12-11+24-22+36-33+48-44
mensaje="S1 = 12"
contador=int(input(1))

while contador <= 7:
    if contador !=0:
        once =once + 11
        mensaje = mensaje + "-" + once
    else:
        doce =doce + 12
        men = mensaje + "+" + doce

    contador = contador + 1

print(mensaje)