package BMICalc;

import java.util.Scanner;

public class BMICalc {

    static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("""
                Enter 1 if you prefer assessment using basic BMI categories.
                Enter 2 if you prefer assessment using Hong Kong BMI categories.
                Enter 3 if you prefer assessment using Japan BMI categories.
                Enter 4 if you prefer assessment using Singapore BMI categories.
                """);

        var basicChoice = scanner.nextInt();

        System.out.println("Enter your weight in kg, please use format 00.00");

        var weightInput = scanner.nextFloat();

        System.out.println("Enter your height in meters, please use format 00.00");

        var heightInput = scanner.nextFloat();

        var sqHeight = Math.pow(heightInput, 2);
        var BMI = weightInput / sqHeight;

// багато зайвого коду // багато зайвого коду // багато зайвого коду // багато зайвого коду // багато зайвого коду

//common categories, obese1-3 also for Japan
        String underweightSevere = "underweight (you are suffering from severe thinness). Please, apply for medical expertise at your local hospital";
        String underweightModerate = "underweight (moderate thinness)";
        String underweightMild = "underweight (mild thinness)";
        String normalCommonWC = "in normal range";
        String overweightCommonWC = "overweight (pre-obese)";
        String obese1 = "obese (Class 1 obesity)";
        String obese2 = "obese (Class 2 obesity)";
        String obese3 = "obese (Class 3 obesity)";
//Hong Kong categories
        String underweightUnhealthyHKWC = "underweight. You are unhealthy. Please, apply for medical expertise at your local hospital";
        String normalHealthyHKWC = "in normal range. You are healthy";
        String overweight1HKWC = "overweight. 1 category of obesity. You are at risk";
        String overweight2HKWC = "overweight. 2 category of obesity - Moderately obese. You are at risk";
        String overweight3HKWC = "overweight. 3 category of obesity - Severely obese. You are at risk";
//Japan categories
        String underweightThinJWC = "underweight. Thin. Please, apply for medical expertise at your local hospital";
        String normalJWC = "of normal weight. You are healthy";
        String obese4 = "obese (Class 4 obesity)";
//Singapore categories
        String underweightSWC = "underweight. Possible nutritional deficiency and osteoporosis. Please, apply for medical expertise at your local hospital";
        String normalSWC = "of normal weight. Low risk (healthy range)";
        String mildToModerateOverweightSWC = "of mild to moderate overweight. Moderate risk of developing heart disease, high blood pressure, stroke, diabetes mellitus";
        String veryOverweightToObeseSWC = "very overweight to obese. High risk of developing heart disease, high blood pressure, stroke, diabetes mellitus. Metabolic syndrome";


        String finalResult = "Your BMI is %.1f. You are %s.";

//common categories final result printed

        if (basicChoice == 1 & BMI < 16) {
            System.out.printf(finalResult, BMI, underweightSevere);
        } else if (basicChoice == 1 & BMI >= 16 & BMI < 17) {
            System.out.printf(finalResult, BMI, underweightModerate);
        } else if (basicChoice == 1 & BMI >= 17 & BMI < 18.5) {
            System.out.printf(finalResult, BMI, underweightMild);
        } else if (basicChoice == 1 & BMI >= 18.5 & BMI < 25) {
            System.out.printf(finalResult, BMI, normalCommonWC);
        } else if (basicChoice == 1 & BMI >= 25 & BMI < 30) {
            System.out.printf(finalResult, BMI, overweightCommonWC);
        } else if (basicChoice == 1 & BMI >= 30 & BMI < 35) {
            System.out.printf(finalResult, BMI, obese1);
        } else if (basicChoice == 1 & BMI >= 35 & BMI < 40) {
            System.out.printf(finalResult, BMI, obese2);
        } else if (basicChoice == 1 & BMI >= 40) {
            System.out.printf(finalResult, BMI, obese3);
        }

//Hong Kong categories final result printed
        if (basicChoice == 2 & BMI < 18.5) {
            System.out.printf(finalResult, BMI, underweightUnhealthyHKWC);
        } else if (basicChoice == 2 & BMI >= 18.5 & BMI <= 22.9) {
            System.out.printf(finalResult, BMI, normalHealthyHKWC);
        } else if (basicChoice == 2 & BMI >= 23 & BMI <= 24.9) {
            System.out.printf(finalResult, BMI, overweight1HKWC);
        } else if (basicChoice == 2 & BMI >= 25 & BMI <= 29.9) {
            System.out.printf(finalResult, BMI, overweight2HKWC);
        } else if (basicChoice == 2 & BMI >= 30) {
            System.out.printf(finalResult, BMI, overweight3HKWC);
        }
//Japan categories final result printed
        if (basicChoice == 3 & BMI < 18.5) {
            System.out.printf(finalResult, BMI, underweightThinJWC);
        } else if (basicChoice == 3 & BMI >= 18.5 & BMI <= 24.9) {
            System.out.printf(finalResult, BMI, normalJWC);
        } else if (basicChoice == 3 & BMI >= 25 & BMI <= 29.9) {
            System.out.printf(finalResult, BMI, obese1);
        } else if (basicChoice == 3 & BMI >= 30 & BMI <= 34.9) {
            System.out.printf(finalResult, BMI, obese2);
        } else if (basicChoice == 3 & BMI >= 35 & BMI <= 39.9) {
            System.out.printf(finalResult, BMI, obese3);
        } else if (basicChoice == 3 & BMI >= 40) {
            System.out.printf(finalResult, BMI, obese4);
        }
//Singapore categories final result printed
        if (basicChoice == 4 & BMI < 18.5) {
            System.out.printf(finalResult, BMI, underweightSWC);
        } else if (basicChoice == 4 & BMI >= 18.5 & BMI <= 22.9) {
            System.out.printf(finalResult, BMI, normalSWC);
        } else if (basicChoice == 4 & BMI >= 23 & BMI <= 27.4) {
            System.out.printf(finalResult, BMI, mildToModerateOverweightSWC);
        } else if (basicChoice == 4 & BMI >= 27.5) {
            System.out.printf(finalResult, BMI, veryOverweightToObeseSWC);
        }



// зменшуємо кількість коду // зменшуємо кількість коду // зменшуємо кількість коду // зменшуємо кількість коду

        //common categories final result printed

        String weightCategory;
        if (basicChoice == 1 & BMI < 16) {
            weightCategory = underweightSevere;
        } else if (basicChoice == 1 & BMI < 17) {
            weightCategory = underweightModerate;
        } else if (basicChoice == 1 & BMI < 18.5) {
            weightCategory = underweightMild;
        } else if (basicChoice == 1 & BMI < 25) {
            weightCategory = normalCommonWC;
        } else if (basicChoice == 1 & BMI < 30) {
            weightCategory = overweightCommonWC;
        } else if (basicChoice == 1 & BMI < 35) {
            weightCategory = obese1;
        } else if (basicChoice == 1 & BMI < 40) {
            weightCategory = obese2;
        } else {
            weightCategory = obese3;
        }
        System.out.printf(finalResult, BMI, weightCategory);


//Hong Kong categories final result printed
        if (basicChoice == 2 & BMI < 18.5) {
            weightCategory = underweightUnhealthyHKWC;
        } else if (basicChoice == 2 & BMI <= 22.9) {
            weightCategory = normalHealthyHKWC;
        } else if (basicChoice == 2 & BMI <= 24.9) {
            weightCategory = overweight1HKWC;
        } else if (basicChoice == 2 & BMI <= 29.9) {
            weightCategory = overweight2HKWC;
        } else {
            weightCategory = overweight3HKWC;
        }
        System.out.printf(finalResult, BMI, weightCategory);

//Japan categories final result printed
        if (basicChoice == 3 & BMI < 18.5) {
            weightCategory = underweightThinJWC;
        } else if (basicChoice == 3 & BMI <= 24.9) {
            weightCategory = normalJWC;
        } else if (basicChoice == 3 & BMI <= 29.9) {
            weightCategory = obese1;
        } else if (basicChoice == 3 & BMI <= 34.9) {
            weightCategory = obese2;
        } else if (basicChoice == 3 & BMI <= 39.9) {
            weightCategory = obese3;
        } else {
            weightCategory = obese4;
        }
        System.out.printf(finalResult, BMI, weightCategory);

//Singapore categories final result printed
        if (basicChoice == 4 & BMI < 18.5) {
            weightCategory = underweightSWC;
        } else if (basicChoice == 4 & BMI <= 22.9) {
            weightCategory = normalSWC;
        } else if (basicChoice == 4 & BMI <= 27.4) {
            weightCategory = mildToModerateOverweightSWC;
        } else {
            weightCategory = veryOverweightToObeseSWC;
        }
        System.out.printf(finalResult, BMI, weightCategory);


    }
}


//nested template
//    if (condition1) {
//        // Outer 'if' block
//        if (condition2) {
//        // Inner 'if' block
//        // Executes if both condition1 and condition2 are true
//        } else if {
//        // Inner 'else' block
//        // Executes if condition1 is true, but condition2 is false
//        }
//        else{
//
//        }
//        } else if {
//        // Outer 'else if' block
//        // Executes if condition1 is false
//        }