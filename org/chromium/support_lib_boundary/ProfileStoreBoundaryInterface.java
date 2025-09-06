package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;

public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(String arg1);

    List getAllProfileNames();

    InvocationHandler getOrCreateProfile(String arg1);

    InvocationHandler getProfile(String arg1);
}

