package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    public final AbstractWindowedCursor a;

    @KeepForSdk
    public CursorWrapper(@NonNull Cursor cursor0) {
        super(cursor0);
        for(int v = 0; v < 10 && cursor0 instanceof android.database.CursorWrapper; ++v) {
            cursor0 = ((android.database.CursorWrapper)cursor0).getWrappedCursor();
        }
        if(!(cursor0 instanceof AbstractWindowedCursor)) {
            throw new IllegalArgumentException("Unknown type: " + cursor0.getClass().getName());
        }
        this.a = (AbstractWindowedCursor)cursor0;
    }

    @Override  // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int v, @NonNull CursorWindow cursorWindow0) {
        this.a.fillWindow(v, cursorWindow0);
    }

    @Override  // android.database.CrossProcessCursor
    @Nullable
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.a.getWindow();
    }

    @Override  // android.database.CursorWrapper
    @NonNull
    public final Cursor getWrappedCursor() {
        return this.a;
    }

    @Override  // android.database.CrossProcessCursor
    public final boolean onMove(int v, int v1) {
        return this.a.onMove(v, v1);
    }

    @KeepForSdk
    public void setWindow(@Nullable CursorWindow cursorWindow0) {
        this.a.setWindow(cursorWindow0);
    }
}

