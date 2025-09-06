package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;

public final class v0 extends FontCallback {
    public final int a;
    public final int b;
    public final WeakReference c;
    public final b1 d;

    public v0(b1 b10, int v, int v1, WeakReference weakReference0) {
        this.d = b10;
        this.a = v;
        this.b = v1;
        this.c = weakReference0;
        super();
    }

    @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
    public final void onFontRetrievalFailed(int v) {
    }

    @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
    public final void onFontRetrieved(Typeface typeface0) {
        if(Build.VERSION.SDK_INT >= 28) {
            int v = this.a;
            if(v != -1) {
                typeface0 = a1.a(typeface0, v, (this.b & 2) != 0);
            }
        }
        b1 b10 = this.d;
        if(b10.m) {
            b10.l = typeface0;
            TextView textView0 = (TextView)this.c.get();
            if(textView0 != null) {
                if(ViewCompat.isAttachedToWindow(textView0)) {
                    textView0.post(new w0(textView0, typeface0, b10.j, 0));
                    return;
                }
                textView0.setTypeface(typeface0, b10.j);
            }
        }
    }
}

