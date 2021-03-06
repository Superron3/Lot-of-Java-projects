package fr.KFill.Launcher;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import fr.theshark34.openauth.AuthenticationException;
import fr.theshark34.openlauncherlib.LaunchException;
import fr.theshark34.openlauncherlib.util.Saver;
import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.animation.Animator;
import fr.theshark34.swinger.colored.SColoredBar;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;

@SuppressWarnings("serial")
public class LauncherPanel extends JPanel implements SwingerEventListener
{
    private Saver saver = new Saver(new File(Launcher.LC_DIR, "launcher.properties"));
    private JTextField nameField = new JTextField(saver.get("familyName")), familyNameField = new JTextField(saver.get("name"));
    String playingName = "", familyName = Launcher.LC_INFOS.getGameDir() + "" + File.separatorChar + "name.txt", name = Launcher.LC_INFOS.getGameDir() + "" + File.separatorChar + "familyName.txt", lign = "";
    private STexturedButton playButton = new STexturedButton(Swinger.getResource("play.png")), quitButton = new STexturedButton(Swinger.getResource("quit.png")), hideButton = new STexturedButton(Swinger.getResource("hide.png"));
    private SColoredBar progressBar = new SColoredBar(new Color(0, 255, 0, 70), new Color(255, 0, 0, 70));
    private JLabel infoLabel = new JLabel("Click on Play !", SwingConstants.CENTER);

    public LauncherPanel() throws Exception
    {
        setLayout(null);
        File name1 = new File(familyName), name2 = new File(name);
        if(name1.exists())
        {
            Scanner sc = new Scanner(name1);
            while(sc.hasNextLine())
                familyNameField.setText(sc.nextLine());
            sc.close();
        }
        else
            try
            {
                FileWriter fw = new FileWriter(name1);
                fw.write("");
                fw.close();
            }
            catch(Exception e)
            {}
        if(name2.exists())
        {
            Scanner sc = new Scanner(new File(name));
            while(sc.hasNextLine())
                nameField.setText(sc.nextLine());
            sc.close();
        }
        else
            try
            {
                FileWriter fw = new FileWriter(name1);
                fw.write("");
                fw.close();
            }
            catch(Exception e)
            {}

        nameField.setForeground(Color.WHITE);
        nameField.setCaretColor(Color.WHITE);
        nameField.setFont(nameField.getFont().deriveFont(25F));
        nameField.setOpaque(false);
        nameField.setBorder(null);
        nameField.setBounds(640, 90, 300, 42);
        add(nameField);

        familyNameField.setForeground(Color.WHITE);
        familyNameField.setCaretColor(Color.WHITE);
        familyNameField.setFont(familyNameField.getFont().deriveFont(25F));
        familyNameField.setOpaque(false);
        familyNameField.setBorder(null);
        familyNameField.setBounds(640, 200, 300, 42);
        add(familyNameField);

        playButton.setBounds(640, 250, 300, 42);
        playButton.addEventListener(this);
        add(playButton);

        quitButton.setBounds(920, 2, 25, 25);
        quitButton.addEventListener(this);
        add(quitButton);

        hideButton.setBounds(900, 2, 25, 25);
        hideButton.addEventListener(this);
        add(hideButton);

        progressBar.setBounds(11, 592, 953, 20);
        add(progressBar);

        infoLabel.setForeground(Color.blue);
        infoLabel.setBounds(11, 592, 953, 20);
        add(infoLabel);
    }

    public void onEvent(SwingerEvent e)
    {
        if(e.getSource() == playButton)
        {
            setFieldsEnabled(false);
            if(nameField.getText().startsWith("-") || nameField.getText().endsWith("-"))
            {
                JOptionPane.showMessageDialog(this, "Error, no '-' at the beginning or the end of the name.", "Error", JOptionPane.ERROR_MESSAGE);
                setFieldsEnabled(true);
                return;
            }
            nameField.setText(nameField.getText().replace(" ", ""));
            nameField.setText(nameField.getText().replace("1", ""));
            nameField.setText(nameField.getText().replace("2", ""));
            nameField.setText(nameField.getText().replace("3", ""));
            nameField.setText(nameField.getText().replace("4", ""));
            nameField.setText(nameField.getText().replace("5", ""));
            nameField.setText(nameField.getText().replace("6", ""));
            nameField.setText(nameField.getText().replace("7", ""));
            nameField.setText(nameField.getText().replace("8", ""));
            nameField.setText(nameField.getText().replace("9", ""));
            nameField.setText(nameField.getText().replace("0", ""));
            nameField.setText(nameField.getText().replace(".", ""));
            nameField.setText(nameField.getText().replace("_", ""));
            nameField.setText(nameField.getText().replace(",", ""));
            nameField.setText(nameField.getText().replace("@", ""));
            nameField.setText(nameField.getText().replace("??", "a"));
            nameField.setText(nameField.getText().replace("??", "a"));
            nameField.setText(nameField.getText().replace("??", "a"));
            nameField.setText(nameField.getText().replace("??", "c"));
            nameField.setText(nameField.getText().replace("??", "e"));
            nameField.setText(nameField.getText().replace("??", "e"));
            nameField.setText(nameField.getText().replace("??", "e"));
            nameField.setText(nameField.getText().replace("??", "e"));
            nameField.setText(nameField.getText().replace("??", "o"));
            nameField.setText(nameField.getText().replace("??", "o"));
            nameField.setText(nameField.getText().replace("??", "u"));
            nameField.setText(nameField.getText().replace("??", "u"));
            nameField.setText(nameField.getText().replace("??", "i"));
            nameField.setText(nameField.getText().replace("??", "i"));
            nameField.setText(nameField.getText().replace("<", ""));
            nameField.setText(nameField.getText().replace(">", ""));
            nameField.setText(nameField.getText().replace("!", ""));
            nameField.setText(nameField.getText().replace("?", ""));
            nameField.setText(nameField.getText().replace("*", ""));
            nameField.setText(nameField.getText().replace("???", ""));
            nameField.setText(nameField.getText().replace("$", ""));
            nameField.setText(nameField.getText().replace("??", ""));
            nameField.setText(nameField.getText().replace(":", ""));
            nameField.setText(nameField.getText().replace("/", ""));
            nameField.setText(nameField.getText().replace("\\\\", ""));
            nameField.setText(nameField.getText().replace("^", ""));
            nameField.setText(nameField.getText().replace("%", ""));
            nameField.setText(nameField.getText().replace("[", ""));
            nameField.setText(nameField.getText().replace("]", ""));
            nameField.setText(nameField.getText().replace("{", ""));
            nameField.setText(nameField.getText().replace("}", ""));
            nameField.setText(nameField.getText().replace("(", ""));
            nameField.setText(nameField.getText().replace(")", ""));
            nameField.setText(nameField.getText().replace("??", ""));
            nameField.setText(nameField.getText().replace("-", ""));
            nameField.setText(nameField.getText().replace("'", ""));
            nameField.setText(nameField.getText().replace("=", ""));
            nameField.setText(nameField.getText().replace("+", ""));
            nameField.setText(nameField.getText().replace("???", ""));
            nameField.setText(nameField.getText().replace("??", ""));
            nameField.setText(nameField.getText().replace("??", ""));
            nameField.setText(nameField.getText().replace("~", ""));
            nameField.setText(nameField.getText().replace("#", ""));
            nameField.setText(nameField.getText().toLowerCase());
            nameField.setText(nameField.getText().replaceFirst(".", (nameField.getText().charAt(0) + "").toUpperCase()));
            if(familyNameField.getText().startsWith("-") || familyNameField.getText().endsWith("-"))
            {
                JOptionPane.showMessageDialog(this, "Error, no '-' at the beginning or the end of the family name.", "Error", JOptionPane.ERROR_MESSAGE);
                setFieldsEnabled(true);
                return;
            }
            familyNameField.setText(familyNameField.getText().replace(" ", ""));
            familyNameField.setText(familyNameField.getText().replace("1", ""));
            familyNameField.setText(familyNameField.getText().replace("2", ""));
            familyNameField.setText(familyNameField.getText().replace("3", ""));
            familyNameField.setText(familyNameField.getText().replace("4", ""));
            familyNameField.setText(familyNameField.getText().replace("5", ""));
            familyNameField.setText(familyNameField.getText().replace("6", ""));
            familyNameField.setText(familyNameField.getText().replace("7", ""));
            familyNameField.setText(familyNameField.getText().replace("8", ""));
            familyNameField.setText(familyNameField.getText().replace("9", ""));
            familyNameField.setText(familyNameField.getText().replace("0", ""));
            familyNameField.setText(familyNameField.getText().replace(".", ""));
            familyNameField.setText(familyNameField.getText().replace("_", ""));
            familyNameField.setText(familyNameField.getText().replace(",", ""));
            familyNameField.setText(familyNameField.getText().replace("@", ""));
            familyNameField.setText(familyNameField.getText().replace("??", "a"));
            familyNameField.setText(familyNameField.getText().replace("??", "a"));
            familyNameField.setText(familyNameField.getText().replace("??", "a"));
            familyNameField.setText(familyNameField.getText().replace("??", "c"));
            familyNameField.setText(familyNameField.getText().replace("??", "e"));
            familyNameField.setText(familyNameField.getText().replace("??", "e"));
            familyNameField.setText(familyNameField.getText().replace("??", "e"));
            familyNameField.setText(familyNameField.getText().replace("??", "e"));
            familyNameField.setText(familyNameField.getText().replace("??", "o"));
            familyNameField.setText(familyNameField.getText().replace("??", "o"));
            familyNameField.setText(familyNameField.getText().replace("??", "u"));
            familyNameField.setText(familyNameField.getText().replace("??", "u"));
            familyNameField.setText(familyNameField.getText().replace("??", "i"));
            familyNameField.setText(familyNameField.getText().replace("??", "i"));
            familyNameField.setText(familyNameField.getText().replace("<", ""));
            familyNameField.setText(familyNameField.getText().replace(">", ""));
            familyNameField.setText(familyNameField.getText().replace("!", ""));
            familyNameField.setText(familyNameField.getText().replace("?", ""));
            familyNameField.setText(familyNameField.getText().replace("*", ""));
            familyNameField.setText(familyNameField.getText().replace("???", ""));
            familyNameField.setText(familyNameField.getText().replace("$", ""));
            familyNameField.setText(familyNameField.getText().replace("??", ""));
            familyNameField.setText(familyNameField.getText().replace(":", ""));
            familyNameField.setText(familyNameField.getText().replace("/", ""));
            familyNameField.setText(familyNameField.getText().replace("\\\\", ""));
            familyNameField.setText(familyNameField.getText().replace("??", ""));
            familyNameField.setText(familyNameField.getText().replace("%", ""));
            familyNameField.setText(familyNameField.getText().replace("[", ""));
            familyNameField.setText(familyNameField.getText().replace("]", ""));
            familyNameField.setText(familyNameField.getText().replace("{", ""));
            familyNameField.setText(familyNameField.getText().replace("}", ""));
            familyNameField.setText(familyNameField.getText().replace("(", ""));
            familyNameField.setText(familyNameField.getText().replace(")", ""));
            familyNameField.setText(familyNameField.getText().replace("??", ""));
            familyNameField.setText(familyNameField.getText().replace("-", ""));
            familyNameField.setText(familyNameField.getText().replace("'", ""));
            familyNameField.setText(familyNameField.getText().replace("=", ""));
            familyNameField.setText(familyNameField.getText().replace("+", ""));
            familyNameField.setText(familyNameField.getText().replace("???", ""));
            familyNameField.setText(familyNameField.getText().replace("??", ""));
            familyNameField.setText(familyNameField.getText().replace("??", ""));
            familyNameField.setText(familyNameField.getText().replace("~", ""));
            familyNameField.setText(familyNameField.getText().replace("#", ""));
            familyNameField.setText(familyNameField.getText().toLowerCase());
            familyNameField.setText(familyNameField.getText().replaceFirst(".", (familyNameField.getText().charAt(0) + "").toUpperCase()));

            playingName = nameField.getText() + "_" + familyNameField.getText();

            if(nameField.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this, "Error, enter a name.", "Error", JOptionPane.ERROR_MESSAGE);
                setFieldsEnabled(true);
                return;
            }
            if(nameField.getText().length() == 1)
            {
                JOptionPane.showMessageDialog(this, "Error, enter a name with more than 1 character.", "Error", JOptionPane.ERROR_MESSAGE);
                setFieldsEnabled(true);
                return;
            }
            if(familyNameField.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this, "Error, enter a family name.", "Error", JOptionPane.ERROR_MESSAGE);
                setFieldsEnabled(true);
                return;
            }
            if(familyNameField.getText().length() == 1)
            {
                JOptionPane.showMessageDialog(this, "Error, enter a family name with more than 1 character.", "Error", JOptionPane.ERROR_MESSAGE);
                setFieldsEnabled(true);
                return;
            }
            if(playingName.length() > 16)
            {
                JOptionPane.showMessageDialog(this, "Error, enter a name and a family name inferior or equals at 16 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                setFieldsEnabled(true);
                return;
            }
            Thread t = new Thread()
            {
                @Override
                public void run()
                {
                    try
                    {
                        Launcher.auth(playingName, playingName);
                    }
                    catch(AuthenticationException e)
                    {
                        JOptionPane.showMessageDialog(LauncherPanel.this, "Error, unable to connect : " + e.getErrorModel().getErrorMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        setFieldsEnabled(true);
                        return;
                    }
                    try
                    {
                        FileWriter fw = new FileWriter(new File(familyName));
                        fw.write(familyNameField.getText());
                        fw.close();
                    }
                    catch(Exception e)
                    {}
                    try
                    {
                        FileWriter fw = new FileWriter(new File(name));
                        fw.write(nameField.getText());
                        fw.close();
                    }
                    catch(Exception e)
                    {}
                    try
                    {
                        Launcher.update();
                    }
                    catch(Exception e)
                    {
                        Launcher.interruptThread();
                        LauncherFrame.getCrashReporter().catchError(e, "Error, unable to up to date Minecraft !");
                        setFieldsEnabled(true);
                        return;
                    }
                    try
                    {
                        Launcher.launch();
                    }
                    catch(LaunchException e)
                    {
                        LauncherFrame.getCrashReporter().catchError(e, "Error, unable to launch Minecraft !");
                        setFieldsEnabled(true);
                    }
                    catch(Exception e)
                    {}
                }
            };
            t.start();
        }
        else if(e.getSource() == quitButton)
            Animator.fadeOutFrame(LauncherFrame.getInstance(), 3, new Runnable()
            {
                public void run()
                {
                    System.exit(0);
                }
            });
        else if(e.getSource() == hideButton)
            LauncherFrame.getInstance().setState(JFrame.ICONIFIED);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(Swinger.getResource("background.png"), 0, 0, getWidth(), getHeight(), this);
    }

    private void setFieldsEnabled(boolean enabled)
    {
        nameField.setEnabled(enabled);
        familyNameField.setEnabled(enabled);
        playButton.setEnabled(enabled);
    }

    public SColoredBar getProgressBar()
    {
        return progressBar;
    }

    public void setInfoText(String text)
    {
        infoLabel.setText(text);
    }
}