package androidx.versionedparcelable;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public final class a extends ObjectInputStream {
    @Override
    public final Class resolveClass(ObjectStreamClass objectStreamClass0) {
        Class class0 = Class.forName(objectStreamClass0.getName(), false, a.class.getClassLoader());
        return class0 == null ? super.resolveClass(objectStreamClass0) : class0;
    }
}

