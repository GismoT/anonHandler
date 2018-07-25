package edu.telematik.web.userhandling.Hashes;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha512 implements  IHashAlgorithm {

    private MessageDigest digest = null;
    private static int ITERATION_COUNT = 3;
    private String collectObjects(Object[] obs)
    {
        StringBuilder obSB = new StringBuilder();
        for(Object tmp : obs)
        {
            obSB.append(tmp.toString());
        }
        return obSB.toString();
    }
    private Hash doHash(String source)
    {
        //github pcperini/gist:2889493
        this.digest.reset();

        byte[] byteBuffer = digest.digest((source).getBytes("UTF-8"));
        for (int i = 0; i < ITERATION_COUNT; i++)
        {
            digest.reset();
            byteBuffer = digest.digest(byteBuffer);
        }

        BASE64Encoder coder = new BASE64Encoder();
        Hash retr = new Hash();
        retr.Hash = coder.encode(byteBuffer);
        return retr;
    }
    public Sha512() throws NoSuchAlgorithmException
    {
            this.digest = MessageDigest.getInstance("SHA-256");
    }
    @Override
    public Hash createHash(Object[] objects) {

        String source = this.collectObjects(objects);
        Hash retr = this.doHash(source);
        retr.Salt = null;
        return retr;
    }

    @Override
    public Hash createSaltedHash(Object[] objects, String salt) {
        String source = this.collectObjects(objects);
        source += salt;
        Hash retr = this.doHash(source);
        retr.Salt = salt;
        return retr;
    }
}
