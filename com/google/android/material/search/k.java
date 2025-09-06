package com.google.android.material.search;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.TextRangeLayoutMeasureResult;
import androidx.compose.foundation.text.TextRangeLayoutMeasureScope;
import androidx.compose.foundation.text.TextRangeScopeMeasurePolicy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import d0.s;
import j0.o3;

public final class k implements TextRangeScopeMeasurePolicy, OnApplyWindowInsetsListener {
    public final int a;
    public final int b;
    public final Object c;

    public k(Object object0, int v, int v1) {
        this.c = object0;
        this.a = v;
        this.b = v1;
        super();
    }

    @Override  // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
    public TextRangeLayoutMeasureResult measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope0) {
        TextLayoutResult textLayoutResult0 = ((TextLinkScope)this.c).getTextLayoutResult();
        if(textLayoutResult0 == null) {
            return textRangeLayoutMeasureScope0.layout(0, 0, o3.w);
        }
        IntRect intRect0 = IntRectKt.roundToIntRect(textLayoutResult0.getPathForRange(this.a, this.b).getBounds());
        return textRangeLayoutMeasureScope0.layout(intRect0.getWidth(), intRect0.getHeight(), new s(intRect0, 28));
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        ((ViewGroup.MarginLayoutParams)this.c).leftMargin = windowInsetsCompat0.getSystemWindowInsetLeft() + this.a;
        ((ViewGroup.MarginLayoutParams)this.c).rightMargin = windowInsetsCompat0.getSystemWindowInsetRight() + this.b;
        return windowInsetsCompat0;
    }
}

