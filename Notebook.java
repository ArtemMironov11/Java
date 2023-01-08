package FinHW;

import java.util.*;

public class Notebook {
    int Memory;
    String Firm;
    int HardDrive;
    String OS;
    String Color;

    public Notebook(int Memory, String Firm, int HardDrive, String OS, String Color) {
        this.Memory = Memory;
        this.Firm = Firm;
        this.HardDrive = HardDrive;
        this.OS = OS;
        this.Color = Color;
    }

    public int memory() {
        return this.Memory;
    }

    public String getName() {
        return this.Firm;
    }

    public int getHardDrive() {
        return this.HardDrive;
    }

    public String getOs() {
        return this.OS;
    }

    public String getColor() {
        return this.Color;
    }

    public String toString() {
        return "// Notebook name:" + this.Firm + ", hard drive:" + this.HardDrive + ", memory:" + this.Memory
                + ", color:" + this.Color + ", oper system:" + this.OS;
    }
}
