package fr.KFill.Launcher;

import java.io.File;
import java.util.Arrays;

import fr.theshark34.openauth.AuthenticationException;
import fr.theshark34.openlauncherlib.external.ExternalLaunchProfile;
import fr.theshark34.openlauncherlib.external.ExternalLauncher;
import fr.theshark34.openlauncherlib.minecraft.AuthInfos;
import fr.theshark34.openlauncherlib.minecraft.GameFolder;
import fr.theshark34.openlauncherlib.minecraft.GameInfos;
import fr.theshark34.openlauncherlib.minecraft.GameTweak;
import fr.theshark34.openlauncherlib.minecraft.GameType;
import fr.theshark34.openlauncherlib.minecraft.GameVersion;
import fr.theshark34.openlauncherlib.minecraft.MinecraftLauncher;
import fr.theshark34.openlauncherlib.util.ProcessLogManager;
import fr.theshark34.supdate.BarAPI;
import fr.theshark34.supdate.SUpdate;
import fr.theshark34.supdate.application.integrated.FileDeleter;
import fr.theshark34.swinger.Swinger;

public class Launcher
{
    public static final GameVersion LC_VERSION = new GameVersion("1.7.10", GameType.V1_7_10);
    public static final GameInfos LC_INFOS = new GameInfos("UnionMinecraft", LC_VERSION, new GameTweak[] {GameTweak.FORGE});
    public static final File LC_DIR = LC_INFOS.getGameDir(), LC_CRASHES_DIR = new File(LC_DIR, "crashes");
    private static AuthInfos authInfos;
    private static Thread updateThread;

    public static void auth(String username, String password) throws AuthenticationException
    {
        authInfos = new AuthInfos(username, "sry", "nope");
    }

    public static void update() throws Exception
    {
        SUpdate su = new SUpdate("http://altiscraft.fr/BEN/UnionMinecraft/Supdate/", LC_DIR);
        su.addApplication(new FileDeleter());
        updateThread = new Thread()
        {
            @Override
            public void run()
            {
                while(!isInterrupted())
                {
                    if(BarAPI.getNumberOfFileToDownload() == 0)
                    {
                        LauncherFrame.getInstance().getLauncherPanel().setInfoText("V??rification des fichiers");
                        continue;
                    }
                    int val = (int)(BarAPI.getNumberOfTotalDownloadedBytes() / 1000), max = (int)(BarAPI.getNumberOfTotalBytesToDownload() / 1000);
                    LauncherFrame.getInstance().getLauncherPanel().getProgressBar().setMaximum(max);
                    LauncherFrame.getInstance().getLauncherPanel().getProgressBar().setValue(val);
                    LauncherFrame.getInstance().getLauncherPanel().setInfoText("T??l??chargement des fichiers " + BarAPI.getNumberOfDownloadedFiles() + "/" + BarAPI.getNumberOfFileToDownload() + " " + Swinger.percentage(val, max) + "%");
                }
            }
        };
        updateThread.start();
        su.start();
        updateThread.interrupt();
    }

    public static void launch() throws Exception
    {
        String[] test = {"-Xms512M", "-Xmx1024M", "-Dfml.ignoreInvalidMinecraftCertificates=true", "-Dfml.ignorePatchDiscrepancies=true"};
        ExternalLaunchProfile profile = MinecraftLauncher.createExternalProfile(LC_INFOS, GameFolder.BASIC, authInfos);
        profile.getVmArgs().addAll(Arrays.asList(test[0], test[1], test[2], test[3]));
        new ProcessLogManager(new ExternalLauncher(profile).launch().getInputStream(), new File(LC_DIR, "logs.txt")).start();
        try
        {
            Thread.sleep(3000);
            LauncherFrame.getInstance().setVisible(false);
        }
        catch(Exception e)
        {}
    }

    public static void interruptThread()
    {
        updateThread.interrupt();
    }
}