package edu.telematik.web.userhandling;

import edu.telematik.web.userhandling.Hashes.Hash;

public interface IAnonDatabase {
    public boolean doesHashAlreadyExist(Hash hash);
    public boolean doesDisplayNameAlreadyExist(String name);
}
