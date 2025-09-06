package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout.TextInclusionStrategy;
import kotlin.jvm.functions.Function2;

public final class a implements Layout.TextInclusionStrategy {
    public final Function2 a;

    public a(Function2 function20) {
        this.a = function20;
    }

    @Override  // android.text.Layout$TextInclusionStrategy
    public final boolean isSegmentInside(RectF rectF0, RectF rectF1) {
        return ((Boolean)this.a.invoke(rectF0, rectF1)).booleanValue();
    }
}

