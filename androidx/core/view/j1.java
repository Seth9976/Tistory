package androidx.core.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.WindowInsetsAnimation;
import androidx.compose.foundation.layout.e4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class j1 extends WindowInsetsAnimation.Callback {
    public final Callback a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public j1(Callback windowInsetsAnimationCompat$Callback0) {
        super(windowInsetsAnimationCompat$Callback0.getDispatchMode());
        this.d = new HashMap();
        this.a = windowInsetsAnimationCompat$Callback0;
    }

    public final WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation0) {
        WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = (WindowInsetsAnimationCompat)this.d.get(windowInsetsAnimation0);
        if(windowInsetsAnimationCompat0 == null) {
            windowInsetsAnimationCompat0 = new WindowInsetsAnimationCompat(0, null, 0L);
            if(Build.VERSION.SDK_INT >= 30) {
                windowInsetsAnimationCompat0.a = new k1(windowInsetsAnimation0);
            }
            this.d.put(windowInsetsAnimation0, windowInsetsAnimationCompat0);
        }
        return windowInsetsAnimationCompat0;
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation0) {
        WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a(windowInsetsAnimation0);
        this.a.onEnd(windowInsetsAnimationCompat0);
        this.d.remove(windowInsetsAnimation0);
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation0) {
        WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a(windowInsetsAnimation0);
        this.a.onPrepare(windowInsetsAnimationCompat0);
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final WindowInsets onProgress(WindowInsets windowInsets0, List list0) {
        ArrayList arrayList0 = this.c;
        if(arrayList0 == null) {
            ArrayList arrayList1 = new ArrayList(list0.size());
            this.c = arrayList1;
            this.b = Collections.unmodifiableList(arrayList1);
        }
        else {
            arrayList0.clear();
        }
        for(int v = list0.size() - 1; v >= 0; --v) {
            WindowInsetsAnimation windowInsetsAnimation0 = e4.i(list0.get(v));
            WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a(windowInsetsAnimation0);
            windowInsetsAnimationCompat0.setFraction(windowInsetsAnimation0.getFraction());
            this.c.add(windowInsetsAnimationCompat0);
        }
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0);
        return this.a.onProgress(windowInsetsCompat0, this.b).toWindowInsets();
    }

    @Override  // android.view.WindowInsetsAnimation$Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation0, WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
        WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = this.a(windowInsetsAnimation0);
        BoundsCompat windowInsetsAnimationCompat$BoundsCompat0 = BoundsCompat.toBoundsCompat(windowInsetsAnimation$Bounds0);
        return this.a.onStart(windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0).toBounds();
    }
}

