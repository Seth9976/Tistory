package androidx.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import androidx.core.view.v1;

public class t0 extends s0 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;

    @Override  // androidx.transition.v0
    public void a(int v, View view0) {
        if(Build.VERSION.SDK_INT == 28) {
            super.a(v, view0);
            return;
        }
        if(t0.h) {
            try {
                v1.m(v, view0);
            }
            catch(NoSuchMethodError unused_ex) {
                t0.h = false;
            }
        }
    }

    public void d(View view0, Matrix matrix0) {
        if(t0.d) {
            try {
                view0.setAnimationMatrix(matrix0);
            }
            catch(NoSuchMethodError unused_ex) {
                t0.d = false;
            }
        }
    }

    public void e(View view0, int v, int v1, int v2, int v3) {
        if(t0.g) {
            try {
                view0.setLeftTopRightBottom(v, v1, v2, v3);
            }
            catch(NoSuchMethodError unused_ex) {
                t0.g = false;
            }
        }
    }

    public void f(View view0, Matrix matrix0) {
        if(t0.e) {
            try {
                view0.transformMatrixToGlobal(matrix0);
            }
            catch(NoSuchMethodError unused_ex) {
                t0.e = false;
            }
        }
    }

    public void g(View view0, Matrix matrix0) {
        if(t0.f) {
            try {
                view0.transformMatrixToLocal(matrix0);
            }
            catch(NoSuchMethodError unused_ex) {
                t0.f = false;
            }
        }
    }
}

