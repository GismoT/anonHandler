package edu.telematik.web.userhandling;

import edu.telematik.web.userhandling.Hashes.Hash;

public interface IAnon {
    public Hash getHash();
    public String getDisplayName();
}
