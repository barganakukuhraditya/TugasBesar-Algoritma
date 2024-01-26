import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    String key;
    String sound;
    String upImage;
    String downImage;
    boolean isPressed;
    public Key(String keyName, String soundFile, String upImage, String downImage)
    {
        setImage(upImage); //agar blackKeys tampil terus
        key = keyName;
        sound = soundFile;
        this.upImage = upImage;
        this.downImage = downImage;
    }
    public void act()
    {
        keyPressed();
    }
    public void keyPressed()
    {
        if(Greenfoot.isKeyDown(key) && !isPressed)
        {
            setImage(downImage);
            playSound();
            isPressed = true;
        }
        if(!Greenfoot.isKeyDown(key) && isPressed)
        {
            setImage(upImage);
            isPressed = false;
        }
    }
    public void playSound()
    {
        Greenfoot.playSound(sound);
    }
}