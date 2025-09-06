package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class DayViewDecorator implements Parcelable {
    @Nullable
    public ColorStateList getBackgroundColor(@NonNull Context context0, int v, int v1, int v2, boolean z, boolean z1) [...] // Inlined contents

    @Nullable
    public Drawable getCompoundDrawableBottom(@NonNull Context context0, int v, int v1, int v2, boolean z, boolean z1) [...] // Inlined contents

    @Nullable
    public Drawable getCompoundDrawableLeft(@NonNull Context context0, int v, int v1, int v2, boolean z, boolean z1) [...] // Inlined contents

    @Nullable
    public Drawable getCompoundDrawableRight(@NonNull Context context0, int v, int v1, int v2, boolean z, boolean z1) [...] // Inlined contents

    @Nullable
    public Drawable getCompoundDrawableTop(@NonNull Context context0, int v, int v1, int v2, boolean z, boolean z1) [...] // Inlined contents

    @Nullable
    public CharSequence getContentDescription(@NonNull Context context0, int v, int v1, int v2, boolean z, boolean z1, @Nullable CharSequence charSequence0) [...] // Inlined contents

    @Nullable
    public ColorStateList getTextColor(@NonNull Context context0, int v, int v1, int v2, boolean z, boolean z1) [...] // Inlined contents

    public void initialize(@NonNull Context context0) {
    }
}

