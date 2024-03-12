ver exercício 9, não está bem


for (int i = 0, k = 0; i < numbers.length; i++) {
if (numbers[i] % 2 == 0) {
countEven++;
int[] evenArray = new int[countEven];
evenArray[k] = numbers[i];
System.out.print(evenArray[k] + "| ");
k++;
}
}