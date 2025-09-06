package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface MaterialCheckable extends Checkable {
    public interface OnCheckedChangeListener {
        void onCheckedChanged(Object arg1, boolean arg2);
    }

    @IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable OnCheckedChangeListener arg1);
}

