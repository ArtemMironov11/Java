package FinHW;

import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class Task1_FinHW {
    public static void main(String[] args) {
        Set<Notebook> Notebooks = new HashSet<>();
        Notebooks.add(new Notebook(8, "Asus", 256, "Windows", "Black"));
        Notebooks.add(new Notebook(16, "Lenovo", 256, "Windows", "Yellow"));
        Notebooks.add(new Notebook(32, "Notebook", 512, "Linux", "Black"));
        Notebooks.add(new Notebook(64, "MacBook Pro", 1024, "iOS", "Grey"));
        Notebooks.add(new Notebook(16, "Huawey", 512, "Linux", "White"));

        int Selection;
        System.out.println("Enter search criterion");
        System.out.println("1 - RAM");
        System.out.println("2 - HDD");
        System.out.println("3 - OS");
        System.out.println("4 - Color");

        Scanner Scanner = new Scanner(System.in);
        Selection = Scanner.nextInt();
        System.out.println(Selection);
        Scanner.close();

        SelectionResult(Selection, Notebooks);
    }

    public static void SelectionResult(int Selections, Set Notebooks) {
        switch (Selections) {
            case 1:
                System.out.println("Enter min digits of RAM");
                System.out.println("Entered is 16");
                Scanner ScannerRam = new Scanner(System.in);
                int MinRam = 16;
                MinRam = ScannerRam.nextInt();
                ShowMinRam(MinRam, Notebooks);
                break;

            case 2:
                System.out.println("Enter min digits of HDD");
                System.out.println("Entered is 256");
                Scanner ScannerHdd = new Scanner(System.in);
                int MinHdd = 16;
                MinHdd = ScannerHdd.nextInt();
                ShowMinRam(MinHdd, Notebooks);
                break;
            case 3:
                System.out.println("Enter OS");
                System.out.println("Entered Windows");
                String SelectedOS = "Windows";
                ShowOS(SelectedOS, Notebooks);
                break;

            case 4:
                System.out.println("Enter the Color of Notebook");
                System.out.println("Entered Black");
                String SelectedColor = "Black";
                ShowColor(SelectedColor, Notebooks);
                break;
        }
    }

    public static void ShowMinRam(int MinRam, Set Notebooks) {
        Set<Notebook> NotebooksForFilter = Notebooks;
        Set<Notebook> FilteredSet = new HashSet<>();
        for (Notebook s : NotebooksForFilter) {
            if (s.Memory >= MinRam) {
                FilteredSet.add(s);
            }
        }
        System.out.println(FilteredSet);
    }

    public static void ShowMinHdd(int MinHdd, Set Notebooks) {
        Set<Notebook> NotebooksForFilter = Notebooks;
        Set<Notebook> FilteredSet = new HashSet<>();
        for (Notebook s : NotebooksForFilter) {
            if (s.HardDrive >= MinHdd) {
                FilteredSet.add(s);
            }
        }
        System.out.println(FilteredSet);
    }

    public static void ShowOS(String SelectedOS, Set Notebooks) {
        Set<Notebook> NotebooksForFilter = Notebooks;
        Set<Notebook> FilteredSet = new HashSet<>();
        for (Notebook s : NotebooksForFilter) {
            if (s.OS == SelectedOS) {
                FilteredSet.add(s);
            }
        }
        System.out.println(FilteredSet);
    }

    public static void ShowColor(String SelectedColor, Set Notebooks) {
        Set<Notebook> NotebooksForFilter = Notebooks;
        Set<Notebook> FilteredSet = new HashSet<>();
        for (Notebook s : NotebooksForFilter) {
            if (s.Color == SelectedColor) {
                FilteredSet.add(s);
            }
        }
        System.out.println(FilteredSet);
    }
}