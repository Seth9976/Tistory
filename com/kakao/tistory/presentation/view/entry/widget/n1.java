package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.ranges.c;

public final class n1 implements OffsetMapping {
    public final int a;

    public n1(int v) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public final int originalToTransformed(int v) {
        return v + this.a;
    }

    @Override  // androidx.compose.ui.text.input.OffsetMapping
    public final int transformedToOriginal(int v) {
        return c.coerceAtLeast(0, v - this.a);
    }
}

