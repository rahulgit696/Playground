#include<stdio.h>
int main()
{
  int n = 365, quo, rem;
  quo = 365 / 4;
  rem = 365 % 4;
  printf("Quotient: %d\nRemainder: %d", quo, rem);
  return 0;
}