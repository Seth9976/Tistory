package com.google.firebase.components;

import androidx.compose.ui.text.n0;
import java.util.List;

public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP;

    static {
        ComponentRegistrarProcessor.NOOP = new n0(14);
    }

    List processRegistrar(ComponentRegistrar arg1);
}

