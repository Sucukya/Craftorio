package me.sucukya.craftorio.Util;

public class messageSender {
    public String version;
    public String info;

    public void sendStartUp(){
        System.out.println(info + " *-------------------------------------*");
        System.out.println(info + " Currently Running: " + version);
        System.out.println(info + " Thank you for using my Plugin :P !");
        System.out.println(info + " Check out other Projects on my Github:");
        System.out.println(info + " https://github.com/sucukya");
        System.out.println(info + " Have fun!");
        System.out.println(info + " *-------------------------------------*");
    }

    public void sendShutdown(){
        System.out.println(info + " *-------------------------------------*");
        System.out.println(info + " Currently Running: " + version);
        System.out.println(info + " Thank you for using my Plugin :P !");
        System.out.println(info + " If you encountered any bugs,");
        System.out.println(info + " please report them here:");
        System.out.println(info + " https://discord.gg/taG8V6RjFk");
        System.out.println(info + " *-------------------------------------*");
    }
}
