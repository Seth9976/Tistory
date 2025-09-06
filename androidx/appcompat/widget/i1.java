package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.widget.TextView;

public final class i1 extends h1 {
    @Override  // androidx.appcompat.widget.h1
    public void a(StaticLayout.Builder staticLayout$Builder0, TextView textView0) {
        staticLayout$Builder0.setTextDirection(textView0.getTextDirectionHeuristic());
    }

    @Override  // androidx.appcompat.widget.j1
    public boolean b(TextView textView0) {
        return textView0.isHorizontallyScrollable();
    }
}

