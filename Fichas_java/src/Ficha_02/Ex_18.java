package Ficha_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double worKDays, dailySalaryE = 40, dailySalaryC = 60, dailySalaryA = 80,
                foodAllowance = 5, foodAllowanceAC = 7.5,
                irsRet,
                sSecurityWorkerRate = 0.11, sSecurityCompanyRate = 0.2375, workerId,
                sSecurityAdminRate = 0.09, sSecurityCompanyRateAdmin = 0.21,
                grossSalary = 0, totalFoodAllowance = 0, totalIrsRetention = 0,
                socialSecurityWorker = 0, socialSecurityCompany = 0, netSalary = 0;

        String roundedNetSalary, position;

        System.out.println("Insira o seu código numérico de funcionário:");
        workerId = input.nextDouble();

        System.out.println("Insira o seu cargo > Empregado(e), Chefe(c) ou Administrador(a):");
        position = input.next();

        System.out.println("Insira quantos dias trabalhou:");
        worKDays = input.nextDouble();

        switch (position) {
            case "e":
                grossSalary = worKDays * dailySalaryE;
                if (grossSalary < 1000) {
                    irsRet = 0.1;
                } else {
                    irsRet = 0.2;
                }
                totalFoodAllowance = worKDays * foodAllowance;
                totalIrsRetention = grossSalary * irsRet;
                socialSecurityWorker = grossSalary * sSecurityWorkerRate;
                socialSecurityCompany = grossSalary * sSecurityCompanyRate;
                netSalary = grossSalary - totalIrsRetention - socialSecurityWorker - socialSecurityCompany;
                break;
            case "c":
                grossSalary = worKDays * dailySalaryC;
                if (grossSalary < 1000) {
                    irsRet = 0.1;
                } else {
                    irsRet = 0.2;
                }
                totalFoodAllowance = worKDays * foodAllowanceAC;
                totalIrsRetention = grossSalary * irsRet;
                socialSecurityWorker = grossSalary * sSecurityWorkerRate;
                socialSecurityCompany = grossSalary * sSecurityCompanyRate;
                netSalary = grossSalary - totalIrsRetention - socialSecurityWorker - socialSecurityCompany;
                break;
            case "a":
                grossSalary = worKDays * dailySalaryA;
                if (grossSalary < 1000) {
                    irsRet = 0.1;
                } else {
                    irsRet = 0.2;
                }
                totalFoodAllowance = worKDays * foodAllowanceAC;
                totalIrsRetention = grossSalary * irsRet;
                socialSecurityWorker = grossSalary * sSecurityAdminRate;
                socialSecurityCompany = grossSalary * sSecurityCompanyRateAdmin;
                netSalary = grossSalary - totalIrsRetention - socialSecurityWorker - socialSecurityCompany;
                break;
            default:
                System.out.println("Erro! Insira um cargo válido.");
        }

        DecimalFormat df = new DecimalFormat("#.##");
        df.setMaximumFractionDigits(2);

        roundedNetSalary = df.format(netSalary);

        System.out.println("O valor Ilíquido a receber é: " + grossSalary);
        System.out.println("O valor do subsídio de alimentação é: " + totalFoodAllowance);
        System.out.println("O valor da retenção de irs é: " + totalIrsRetention);
        System.out.println("O valor dos encargos à SS do funcionário é " + socialSecurityWorker + " e o da empresa é: " + socialSecurityCompany);
        System.out.println("O valor líquido a receber é: " + roundedNetSalary);
    }
}
