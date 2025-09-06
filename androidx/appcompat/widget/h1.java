package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

public class h1 extends j1 {
    @Override  // androidx.appcompat.widget.j1
    public void a(StaticLayout.Builder staticLayout$Builder0, TextView textView0) {
        staticLayout$Builder0.setTextDirection(((TextDirectionHeuristic)k1.e(textView0, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)));
    }
}

