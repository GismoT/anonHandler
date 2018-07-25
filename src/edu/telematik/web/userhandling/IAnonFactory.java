package edu.telematik.web.userhandling;

import edu.telematik.web.userhandling.Hashes.IHashAlgorithm;

public interface IAnonFactory {
    public IAnon createUser(Object[] elements, IHashAlgorithm hashF, IDisplayNameCreator displayChunks);
}
