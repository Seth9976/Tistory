package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.w0;
import java.util.ArrayList;

public abstract class DynamicAnimation implements AnimationHandler.AnimationFrameCallback {
    public interface OnAnimationEndListener {
        void onAnimationEnd(DynamicAnimation arg1, boolean arg2, float arg3, float arg4);
    }

    public interface OnAnimationUpdateListener {
        void onAnimationUpdate(DynamicAnimation arg1, float arg2, float arg3);
    }

    public static abstract class ViewProperty extends FloatPropertyCompat {
    }

    public static final ViewProperty ALPHA = null;
    public static final float MIN_VISIBLE_CHANGE_ALPHA = 0.003906f;
    public static final float MIN_VISIBLE_CHANGE_PIXELS = 1.0f;
    public static final float MIN_VISIBLE_CHANGE_ROTATION_DEGREES = 0.1f;
    public static final float MIN_VISIBLE_CHANGE_SCALE = 0.002f;
    public static final ViewProperty ROTATION;
    public static final ViewProperty ROTATION_X;
    public static final ViewProperty ROTATION_Y;
    public static final ViewProperty SCALE_X;
    public static final ViewProperty SCALE_Y;
    public static final ViewProperty SCROLL_X;
    public static final ViewProperty SCROLL_Y;
    public static final ViewProperty TRANSLATION_X;
    public static final ViewProperty TRANSLATION_Y;
    public static final ViewProperty TRANSLATION_Z;
    public static final ViewProperty X;
    public static final ViewProperty Y;
    public static final ViewProperty Z;
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final FloatPropertyCompat e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;

    static {
        DynamicAnimation.TRANSLATION_X = new j("translationX");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.TRANSLATION_Y = new k("translationY");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.TRANSLATION_Z = new l("translationZ");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.SCALE_X = new m("scaleX");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.SCALE_Y = new n("scaleY");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.ROTATION = new o("rotation");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.ROTATION_X = new p("rotationX");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.ROTATION_Y = new q("rotationY");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.X = new r("x");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.Y = new d("y");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.Z = new e("z");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.ALPHA = new f("alpha");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.SCROLL_X = new g("scrollX");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
        DynamicAnimation.SCROLL_Y = new h("scrollY");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
    }

    public DynamicAnimation(FloatValueHolder floatValueHolder0) {
        this.a = 0.0f;
        this.b = 3.402823E+38f;
        this.c = false;
        this.f = false;
        this.g = 3.402823E+38f;
        this.h = -3.402823E+38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new i(floatValueHolder0);
        this.j = 1.0f;
    }

    public DynamicAnimation(Object object0, FloatPropertyCompat floatPropertyCompat0) {
        this.a = 0.0f;
        this.b = 3.402823E+38f;
        this.c = false;
        this.f = false;
        this.g = 3.402823E+38f;
        this.h = -2139095040.0f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = object0;
        this.e = floatPropertyCompat0;
        if(floatPropertyCompat0 != DynamicAnimation.ROTATION && floatPropertyCompat0 != DynamicAnimation.ROTATION_X && floatPropertyCompat0 != DynamicAnimation.ROTATION_Y) {
            if(floatPropertyCompat0 == DynamicAnimation.ALPHA) {
                this.j = 0.003906f;
                return;
            }
            if(floatPropertyCompat0 != DynamicAnimation.SCALE_X && floatPropertyCompat0 != DynamicAnimation.SCALE_Y) {
                this.j = 1.0f;
                return;
            }
            this.j = 0.003906f;
            return;
        }
        this.j = 0.1f;
    }

    public final void a(boolean z) {
        ArrayList arrayList1;
        this.f = false;
        ThreadLocal threadLocal0 = c.f;
        if(threadLocal0.get() == null) {
            threadLocal0.set(new c());
        }
        c c0 = (c)threadLocal0.get();
        c0.a.remove(this);
        ArrayList arrayList0 = c0.b;
        int v1 = arrayList0.indexOf(this);
        if(v1 >= 0) {
            arrayList0.set(v1, null);
            c0.e = true;
        }
        this.i = 0L;
        this.c = false;
        for(int v = 0; true; ++v) {
            arrayList1 = this.k;
            if(v >= arrayList1.size()) {
                break;
            }
            if(arrayList1.get(v) != null) {
                ((OnAnimationEndListener)arrayList1.get(v)).onAnimationEnd(this, z, this.b, this.a);
            }
        }
        for(int v2 = arrayList1.size() - 1; v2 >= 0; --v2) {
            if(arrayList1.get(v2) == null) {
                arrayList1.remove(v2);
            }
        }
    }

    public DynamicAnimation addEndListener(OnAnimationEndListener dynamicAnimation$OnAnimationEndListener0) {
        ArrayList arrayList0 = this.k;
        if(!arrayList0.contains(dynamicAnimation$OnAnimationEndListener0)) {
            arrayList0.add(dynamicAnimation$OnAnimationEndListener0);
        }
        return this;
    }

    public DynamicAnimation addUpdateListener(OnAnimationUpdateListener dynamicAnimation$OnAnimationUpdateListener0) {
        if(this.isRunning()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList0 = this.l;
        if(!arrayList0.contains(dynamicAnimation$OnAnimationUpdateListener0)) {
            arrayList0.add(dynamicAnimation$OnAnimationUpdateListener0);
        }
        return this;
    }

    public final void b(float f) {
        ArrayList arrayList0;
        this.e.setValue(this.d, f);
        for(int v = 0; true; ++v) {
            arrayList0 = this.l;
            if(v >= arrayList0.size()) {
                break;
            }
            if(arrayList0.get(v) != null) {
                ((OnAnimationUpdateListener)arrayList0.get(v)).onAnimationUpdate(this, this.b, this.a);
            }
        }
        for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
            if(arrayList0.get(v1) == null) {
                arrayList0.remove(v1);
            }
        }
    }

    public abstract void c(float arg1);

    public void cancel() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if(this.f) {
            this.a(true);
        }
    }

    public abstract boolean d(long arg1);

    @Override  // androidx.dynamicanimation.animation.AnimationHandler$AnimationFrameCallback
    @RestrictTo({Scope.LIBRARY})
    public boolean doAnimationFrame(long v) {
        long v1 = this.i;
        if(Long.compare(v1, 0L) == 0) {
            this.i = v;
            this.b(this.b);
            return false;
        }
        this.i = v;
        boolean z = this.d(v - v1);
        float f = Math.max(Math.min(this.b, this.g), this.h);
        this.b = f;
        this.b(f);
        if(z) {
            this.a(false);
        }
        return z;
    }

    public float getMinimumVisibleChange() {
        return this.j;
    }

    public boolean isRunning() {
        return this.f;
    }

    public void removeEndListener(OnAnimationEndListener dynamicAnimation$OnAnimationEndListener0) {
        ArrayList arrayList0 = this.k;
        int v = arrayList0.indexOf(dynamicAnimation$OnAnimationEndListener0);
        if(v >= 0) {
            arrayList0.set(v, null);
        }
    }

    public void removeUpdateListener(OnAnimationUpdateListener dynamicAnimation$OnAnimationUpdateListener0) {
        ArrayList arrayList0 = this.l;
        int v = arrayList0.indexOf(dynamicAnimation$OnAnimationUpdateListener0);
        if(v >= 0) {
            arrayList0.set(v, null);
        }
    }

    public DynamicAnimation setMaxValue(float f) {
        this.g = f;
        return this;
    }

    public DynamicAnimation setMinValue(float f) {
        this.h = f;
        return this;
    }

    public DynamicAnimation setMinimumVisibleChange(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.j = f;
        this.c(f * 0.75f);
        return this;
    }

    public DynamicAnimation setStartValue(float f) {
        this.b = f;
        this.c = true;
        return this;
    }

    public DynamicAnimation setStartVelocity(float f) {
        this.a = f;
        return this;
    }

    public void start() {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if(!this.f) {
            this.f = true;
            if(!this.c) {
                this.b = this.e.getValue(this.d);
            }
            if(this.b > this.g || this.b < this.h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            ThreadLocal threadLocal0 = c.f;
            if(threadLocal0.get() == null) {
                threadLocal0.set(new c());
            }
            c c0 = (c)threadLocal0.get();
            ArrayList arrayList0 = c0.b;
            if(arrayList0.size() == 0) {
                if(c0.d == null) {
                    c0.d = new w0(c0.c);
                }
                ((Choreographer)c0.d.b).postFrameCallback(((b)c0.d.c));
            }
            if(!arrayList0.contains(this)) {
                arrayList0.add(this);
            }
        }
    }
}

