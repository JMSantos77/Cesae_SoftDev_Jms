package Ficha_01;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double worKDays, dailySalary = 40, foodAllowance = 5, irsRet = 0.1,
                socialSecurityWorkerRate = 0.11, socialSecurityCompanyRate = 0.2375, workerId,
                grossSalary, totalFoodAllowance, totalIrsRetention,
                socialSecurityWorker, socialSecurityCompany, netSalary;

        System.out.println("insira o seu código numérico de funcionário:");
        workerId = input.nextDouble();

        System.out.println("Insira quantos dias trabalhou:");
        worKDays = input.nextDouble();

        grossSalary = worKDays * dailySalary;
        totalFoodAllowance = worKDays * foodAllowance;
        totalIrsRetention = grossSalary * irsRet;
        socialSecurityWorker = grossSalary * socialSecurityWorkerRate;
        socialSecurityCompany = grossSalary * socialSecurityCompanyRate;
        netSalary = grossSalary - totalIrsRetention - socialSecurityWorker - socialSecurityCompany;

        System.out.println("O valor Ilíquido a receber é: " + grossSalary);
        System.out.println("O valor do subsídio de alimentação é: " + totalFoodAllowance);
        System.out.println("O valor da retenção de irs é: " + totalIrsRetention);
        System.out.println("O valor dos encargos à SS do funcionário é " + socialSecurityWorker + " e o da empresa é: " + socialSecurityCompany);
        System.out.println("O valor líquido a receber é: " + netSalary);







    }
}
