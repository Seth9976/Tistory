package androidx.emoji2.text;

import a7.c;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.accessibility.e;

public final class c0 extends c {
    // 去混淆评级： 低(20)
    @Override  // a7.c
    public final boolean b(CharSequence charSequence0) {
        return e.v(charSequence0) || charSequence0 instanceof PrecomputedTextCompat;
    }
}

