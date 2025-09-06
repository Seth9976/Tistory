package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.geometry.Rect;

public final class z1 {
    public final MutableState a;
    public final MutableState b;
    public Rect c;
    public final long d;
    public static final TextFieldScrollerPosition.Companion e;
    public static final Saver f;

    static {
        z1.e = new TextFieldScrollerPosition.Companion(null);
        z1.f = SaverKt.Saver(x1.a, y1.a);
    }

    public z1(float f) {
        this.a = SnapshotStateKt.mutableStateOf$default(f, null, 2, null);
        this.b = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
        this.c = Rect.Companion.getZero();
        this.d = 0L;
    }

    public final float a() {
        return ((Number)this.a.getValue()).floatValue();
    }
}

