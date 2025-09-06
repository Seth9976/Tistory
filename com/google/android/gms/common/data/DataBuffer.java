package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;

public interface DataBuffer extends Releasable, Closeable, Iterable {
    @Override
    void close();

    Object get(int arg1);

    int getCount();

    @Nullable
    @KeepForSdk
    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @Override
    @NonNull
    Iterator iterator();

    @Override  // com.google.android.gms.common.api.Releasable
    void release();

    @NonNull
    Iterator singleRefIterator();
}

