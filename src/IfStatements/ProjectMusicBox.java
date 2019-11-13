package IfStatements;

import java.util.Scanner;

public class ProjectMusicBox {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Available music types are:  Classical,Pop and Country.");
        System.out.println("Please enter the music type:");
        String musicType = input.nextLine();
//Classical Music
        if (musicType.equalsIgnoreCase("Classical")) {
            System.out.println("These are the available musics: FourSeasons, FurElise, Finlandia, Vocalise, ThePlanets");
            System.out.println("Which one would you like to listen?: ");
            String classicM = input.nextLine();

            if (classicM.equalsIgnoreCase("FourSeason")) {
                System.out.println("Any Classical music Costs $2. Please enter $2. ");
                double classMPrice = input.nextDouble();

                if (classMPrice == 2) {
                    System.out.println(classicM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 2) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 2) {
                    double extraM = classMPrice - 2;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + classicM + " Enjoy with the music :)");
                }
            }
            if (classicM.equalsIgnoreCase("FurElise")) {
                System.out.println("Any Classical music Costs $2. Please enter $2. ");
                double classMPrice = input.nextDouble();

                if (classMPrice == 2) {
                    System.out.println(classicM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 2) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 2) {
                    double extraM = classMPrice - 2;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + classicM + " is playing. Enjoy with the music :)");
                }
            }
            if (classicM.equalsIgnoreCase("Finlandia")) {
                System.out.println("Any Classical music Costs $2. Please enter $2. ");
                double classMPrice = input.nextDouble();

                if (classMPrice == 2) {
                    System.out.println(classicM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 2) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 2) {
                    double extraM = classMPrice - 2;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + classicM + " is playing. Enjoy with the music :)");
                }
            }

            if (classicM.equalsIgnoreCase("Vocalise")) {
                System.out.println("Any Classical music Costs $2. Please enter $2. ");
                double classMPrice = input.nextDouble();

                if (classMPrice == 2) {
                    System.out.println(classicM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 2) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 2) {
                    double extraM = classMPrice - 2;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + classicM + " is playing. Enjoy with the music :)");
                }
            }

            if (classicM.equalsIgnoreCase("ThePlanets")) {
                System.out.println("Any Classical music Costs $2. Please enter $2. ");
                double classMPrice = input.nextDouble();

                if (classMPrice == 2) {
                    System.out.println(classicM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 2) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 2) {
                    double extraM = classMPrice - 2;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + classicM + " is playing. Enjoy with the music :)");
                }

                //valid mUsic option
            } else {
                System.out.println(classicM + " is not on the list. Please enter valid music and try again: ");
                String validM = input.nextLine();

            if (validM.equalsIgnoreCase("ThePlanets") || validM.equalsIgnoreCase("Finlandia") || validM.equalsIgnoreCase("Vocalise")
                        || validM.equalsIgnoreCase("FurElise") || validM.equalsIgnoreCase("Fourseason")) {
                    System.out.println("Any Classical music Costs $2. Please enter $2. ");
                    double classMPrice = input.nextDouble();

                    if (classMPrice == 2) {
                        System.out.println(validM + " is palying. Please enjoy the music :)");

                    } else if (classMPrice < 2) {
                        System.out.println("The entered Price is not enough. Please try again.");

                    } else if (classMPrice > 2) {
                        double extraM = classMPrice - 2;
                        System.out.println("You entered extra $" + extraM + ". Please wait for change...  " + validM + " is playing. Enjoy with the music :)");
                    }
                } else {
                    System.out.println(validM + " is not on the list. The session ended! Good Bye! ");


                }
            }

//Pop Music
        } else if (musicType.equalsIgnoreCase("Pop")) {
            System.out.println("These are the available musics: Badguy, Talk, PleaseMe, 7Ring, WithoutMe ");
            System.out.println("Which one would you like to listen?: ");
            String popM = input.nextLine();

            if (popM.equalsIgnoreCase("Badguy")) {
                System.out.println("Any Pop music Costs $4. Please enter $4. ");
                int popMPrice = input.nextInt();

                if (popMPrice == 4) {
                    System.out.println(popM + " is palying. Please enjoy the music :)");

                } else if (popMPrice < 4) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (popMPrice > 4) {
                    int extraM = popMPrice - 4;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + popM + " Enjoy with the music :)");
                }
            }
            if (popM.equalsIgnoreCase("Talk")) {
                System.out.println("Any Pop music Costs $4. Please enter $4. ");
                int classMPrice = input.nextInt();

                if (classMPrice == 4) {
                    System.out.println(popM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 4) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 4) {
                    int extraM = classMPrice - 4;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + popM + " is playing. Enjoy with the music :)");
                }
            }
            if (popM.equalsIgnoreCase("PleaseMe")) {
                System.out.println("Any Pop music Costs $4. Please enter $4. ");
                int classMPrice = input.nextInt();

                if (classMPrice == 4) {
                    System.out.println(popM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 4) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 4) {
                    int extraM = classMPrice - 4;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + popM + " is playing. Enjoy with the music :)");
                }
            }

            if (popM.equalsIgnoreCase("7Ring")) {
                System.out.println("Any Pop music Costs $4. Please enter $4. ");
                int classMPrice = input.nextInt();

                if (classMPrice == 4) {
                    System.out.println(popM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 4) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 4) {
                    int extraM = classMPrice - 4;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + popM + " is playing. Enjoy with the music :)");
                }
            }

            if (popM.equalsIgnoreCase("WithoutMe")) {
                System.out.println("Any Pop music Costs $4. Please enter $4. ");
                int classMPrice = input.nextInt();

                if (classMPrice == 4) {
                    System.out.println(popM + " is palying. Please enjoy the music :)");

                } else if (classMPrice < 4) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (classMPrice > 4) {
                    int extraM = classMPrice - 4;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + popM + " is playing. Enjoy with the music :)");
                }
            }
            //Country Music
        } else if (musicType.equalsIgnoreCase("Country")) {
            System.out.println("These are the available musics: MeanttoBe, Heaven, Simple, OneNumberAway, GetAlong ");
            System.out.println("Which one would you like to listen?: ");
            String countryM = input.nextLine();

            if (countryM.equalsIgnoreCase("Meanttobe")) {
                System.out.println("Any Country music Costs $3. Please enter $3. ");
                int countryMPrice = input.nextInt();

                if (countryMPrice == 3) {
                    System.out.println(countryM + " is palying. Please enjoy the music :)");

                } else if (countryMPrice < 3) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (countryMPrice > 3) {
                    int extraM = countryMPrice - 3;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + countryM + " Enjoy with the music :)");
                }
            }
            if (countryM.equalsIgnoreCase("Heaven")) {
                System.out.println("Any Country music Costs $3. Please enter $3. ");
                int countryMPrice = input.nextInt();

                if (countryMPrice == 3) {
                    System.out.println(countryM + " is palying. Please enjoy the music :)");

                } else if (countryMPrice < 3) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (countryMPrice > 3) {
                    int extraM = countryMPrice - 3;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + countryM + " is playing. Enjoy with the music :)");
                }
            }
            if (countryM.equalsIgnoreCase("Simple")) {
                System.out.println("Any Country music Costs $3. Please enter $3. ");
                int countryMPrice = input.nextInt();

                if (countryMPrice == 3) {
                    System.out.println(countryM + " is palying. Please enjoy the music :)");

                } else if (countryMPrice < 3) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (countryMPrice > 3) {
                    int extraM = countryMPrice - 3;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + countryM + " is playing. Enjoy with the music :)");
                }
            }

            if (countryM.equalsIgnoreCase("OneNumberAway")) {
                System.out.println("Any Country music Costs $3. Please enter $3. ");
                int countryMPrice = input.nextInt();

                if (countryMPrice == 3) {
                    System.out.println(countryM + " is palying. Please enjoy the music :)");

                } else if (countryMPrice < 3) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (countryMPrice > 3) {
                    int extraM = countryMPrice - 3;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + countryM + " is playing. Enjoy with the music :)");
                }
            }

            if (countryM.equalsIgnoreCase("GetAlong")) {
                System.out.println("Any Country music Costs $3. Please enter $3. ");
                int countryMPrice = input.nextInt();

                if (countryMPrice == 3) {
                    System.out.println(countryM + " is palying. Please enjoy the music :)");

                } else if (countryMPrice < 3) {
                    System.out.println("The entered Price is not enough. Please try again.");

                } else if (countryMPrice > 3) {
                    int extraM = countryMPrice - 3;
                    System.out.println("You entered extra $" + extraM + ". Please wait for change. " + countryM + " is playing. Enjoy with the music :)");
                }
            } else {
                System.out.println(countryM + " is not available.");
            }
        } else {
            System.out.println(musicType + " Music category is not available.");

        }
    }
}