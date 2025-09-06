package androidx.appcompat.widget;

import android.text.StaticLayout.Builder;
import android.widget.TextView;

public abstract class j1 {
    public abstract void a(StaticLayout.Builder arg1, TextView arg2);

    public boolean b(TextView textView0) {
        return ((Boolean)k1.e(textView0, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}

