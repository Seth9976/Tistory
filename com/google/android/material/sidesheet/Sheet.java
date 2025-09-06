package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.motion.MaterialBackHandler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

interface Sheet extends MaterialBackHandler {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SheetEdge {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SheetState {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StableSheetState {
    }

    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    void addCallback(SheetCallback arg1);

    int getState();

    void removeCallback(SheetCallback arg1);

    void setState(int arg1);
}

