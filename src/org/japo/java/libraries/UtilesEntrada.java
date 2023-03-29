/*
 * Copyright 2022 alumnoT.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alumnoT
 */
public class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final int leerEntero(String msg) {
        int num = 0;
        boolean introOK = false;
        do {
            try {
                System.out.print(msg);
                num = SCN.nextInt();
                introOK = true;
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("ERROR: Entrada incorrecta");
            } finally {
                System.out.println("---");
                SCN.nextLine();
            }

        } while (!introOK);
        return num;
    }

    public static final int leerEnteroRango(String msg, int min, int max) {
        int num;
        boolean rangoOK;
        do {
            num = leerEntero(msg);
            rangoOK = num >= min && num <= max;
            if (!rangoOK) {
                System.out.println("ERROR: Número fuera de rango");
                System.out.println("---");
            }
        } while (!rangoOK);
        return num;
    }

    public static final char leerCaracter(String msg) {
        char car = 0;
        boolean introOK = false;
        do {
            try {
                System.out.print(msg);
                car = SCN.nextLine().charAt(0);
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("ERROR: Entrada incorrecta");
            }

        } while (introOK);
        return car;
    }

    public static final char leerCaracterRango(String msg, char min, char max) {
        char car;
        boolean rangoOK = false;
        do {
            car = leerCaracter(msg);
            rangoOK = car >= min && car <= max;
            if (!rangoOK) {
                System.out.println("ERROR: Carácter fuera de rango");
                System.out.println("---");
            }
        } while (!rangoOK);
        return car;
    }
    
        public static final String leerString(String msg) {
        String texto = null;
        boolean introOK = false;
        do {
            try {
                System.out.print(msg);
                texto = SCN.nextLine();
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("ERROR: Entrada incorrecta");
            }

        } while (introOK);
        return texto;
    }

   
}
