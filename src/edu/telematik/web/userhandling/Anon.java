package edu.telematik.web.userhandling;


import edu.telematik.web.userhandling.Hashes.Hash;

public class Anon implements IAnon{

    private Hash hash = null;
    private String displayname = null;

    public Anon(Hash hash, String displayName)
    {
        this.hash = hash;
        this.displayname = displayName;
    }
    @Override
    public Hash getHash() {
        return this.hash;
    }

    @Override
    public String getDisplayName() {
        return displayname;
    }
}
