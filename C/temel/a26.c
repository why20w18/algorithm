// newton ralphson ile karekok alma
#include <stdio.h>

double nrSquare(double n2) {

  double predict = n2 / 2; // ilk tahmin yarisi
  double epsilon = 0.00000001;
  double newPredict = 0.0;
  double diff = 0.0;
  int iter = 0;

  while (1) {
    newPredict = (predict + (n2 / predict)) / 2;
    diff = predict - newPredict;

    printf("iter       : %4d\n", iter);
    printf("OLDpredict : %4lf\n", predict);
    printf("NEWpredict : %4lf\n", newPredict);
    printf("diff       : %4lf\n\n", diff);

    // yakinsama kontrolu
    if (diff < epsilon && diff > -epsilon)
      break;

    predict = newPredict;

    iter++;
  }

  return predict;
}

int main() {
  double n2;
  printf("n2 >>> ");
  scanf("%lf", &n2);

  double n = nrSquare(n2);
  printf("\nRESULT : %lf\n", n);

  return 0x0;
}
