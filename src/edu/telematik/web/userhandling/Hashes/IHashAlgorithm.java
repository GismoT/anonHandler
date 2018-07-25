package edu.telematik.web.userhandling.Hashes;


public interface IHashAlgorithm {
    public Hash createHash(Object[] objects);
    public Hash createSaltedHash(Object[] objects, String salt);
}
