#include <stdio.h>

double calcular( int x, int expoente)
{
    printf(" Teste");
    double resultado = x;
       if (expoente ==0)
       {
        resultado=1;
       }
       else if(x==0)
       {
        resultado=0;
        }else{
       for (int i = 2; i <= expoente; i++)
       {
        printf("i %d", i);
        resultado *=x;
       }
    }

return resultado;
}

++
int main ()
{
    int x, expoente;
    scanf("%d %d", &x, &expoente);

    double resultado;
    resultado = calcular(x,expoente);
    // resulta=9
    printf(" %lf", resultado);

return 0;
}