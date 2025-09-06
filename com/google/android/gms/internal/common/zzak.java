package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.DoNotCall;
import java.util.ListIterator;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class zzak extends zzaj implements ListIterator {
    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(Object object0) {
        throw new UnsupportedOperationException();
    }
}

