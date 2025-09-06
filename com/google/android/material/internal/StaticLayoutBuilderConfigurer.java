package com.google.android.material.internal;

import android.text.StaticLayout.Builder;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface StaticLayoutBuilderConfigurer {
    void configure(@NonNull StaticLayout.Builder arg1);
}

