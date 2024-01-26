import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Piano extends World
{
    // tombol untuk whiteKeys
    String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "]"};
    // suara yg dikeluarkan saat whiteKeys ditekan
    String[] whiteKeySounds = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"};
    // tombol untuk blackKeys
    String[] blackKeys = {"w", "e", "r", "t", "y", "u", "i", "o", "p", "", "["};
    // suara yg dikeluarkan saat blackKeys ditekan
    String[] blackKeySounds = {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#"};

    public Piano() 
    {
        super(800, 340, 1);
        prepare();
    }
    private void prepare()
    {
                for(int i = 0; i < whiteKeys.length; i++)
        {
            // untuk menentukan tombol & sound secara berurutan
            Key key = new Key(whiteKeys[i], whiteKeySounds[i] + ".wav", "white-key.png", "white-key-down.png");
            addObject(key, 54 + i * 63, 130); // menentukan posisi objek
        }
        for(int i = 0; i < blackKeys.length; i++)
        {
            if (blackKeySounds[i] != "") // agar jika tombol dipencet tidak keluar suara
            {
                Key bkey = new Key(blackKeys[i], blackKeySounds[i] + ".wav", "black-key.png", "black-key-down.png");
                addObject(bkey, 86 + i * 63, 86); // menentukan posisi objek
            }
        }
    }
}