package androidx.transition;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;

public final class w implements GhostView {
    public final View a;
    public static Class b;
    public static boolean c;
    public static Method d;
    public static boolean e;
    public static Method f;
    public static boolean g;

    public w(View view0) {
        this.a = view0;
    }

    public static void a() {
        if(!w.c) {
            try {
                w.b = Class.forName("android.view.GhostView");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", classNotFoundException0);
            }
            w.c = true;
        }
    }

    @Override  // androidx.transition.GhostView
    public final void reserveEndViewTransition(ViewGroup viewGroup0, View view0) {
    }

    @Override  // androidx.transition.GhostView
    public final void setVisibility(int v) {
        this.a.setVisibility(v);
    }
}

