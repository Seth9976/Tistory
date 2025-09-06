package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import d5.a;
import d5.c;
import d5.e;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedVectorDrawableCompat extends e implements Animatable2Compat {
    public final c b;
    public final Context c;
    public b d;
    public ArrayList e;
    public final d5.b f;

    public AnimatedVectorDrawableCompat(Context context0) {
        this.d = null;
        this.e = null;
        this.f = new d5.b(this);
        this.c = context0;
        this.b = new c();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
    }

    @Override  // d5.e
    public void applyTheme(Resources.Theme resources$Theme0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.applyTheme(drawable0, resources$Theme0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.a == null ? false : DrawableCompat.canApplyTheme(this.a);
    }

    public static void clearAnimationCallbacks(Drawable drawable0) {
        if(!(drawable0 instanceof Animatable)) {
            return;
        }
        ((AnimatedVectorDrawable)drawable0).clearAnimationCallbacks();
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).clearAnimationCallbacks();
            return;
        }
        b b0 = this.d;
        if(b0 != null) {
            this.b.b.removeListener(b0);
            this.d = null;
        }
        ArrayList arrayList0 = this.e;
        if(arrayList0 == null) {
            return;
        }
        arrayList0.clear();
    }

    @Override  // d5.e
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    @Nullable
    public static AnimatedVectorDrawableCompat create(@NonNull Context context0, @DrawableRes int v) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat0 = new AnimatedVectorDrawableCompat(context0);
        Drawable drawable0 = ResourcesCompat.getDrawable(context0.getResources(), v, context0.getTheme());
        animatedVectorDrawableCompat0.a = drawable0;
        drawable0.setCallback(animatedVectorDrawableCompat0.f);
        new com.google.android.material.floatingactionbutton.c(animatedVectorDrawableCompat0.a.getConstantState());
        return animatedVectorDrawableCompat0;
    }

    public static AnimatedVectorDrawableCompat createFromXmlInner(Context context0, Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat0 = new AnimatedVectorDrawableCompat(context0);
        animatedVectorDrawableCompat0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        return animatedVectorDrawableCompat0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
            return;
        }
        this.b.a.draw(canvas0);
        if(this.b.b.isStarted()) {
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.getAlpha() : DrawableCompat.getAlpha(drawable0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            return drawable0.getChangingConfigurations();
        }
        int v = super.getChangingConfigurations();
        this.b.getClass();
        return v;
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.getColorFilter() : DrawableCompat.getColorFilter(drawable0);
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a != null ? new com.google.android.material.floatingactionbutton.c(this.a.getConstantState()) : null;
    }

    @Override  // d5.e
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.getIntrinsicHeight() : drawable0.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.getIntrinsicWidth() : drawable0.getIntrinsicWidth();
    }

    @Override  // d5.e
    public int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override  // d5.e
    public int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.getOpacity() : drawable0.getOpacity();
    }

    @Override  // d5.e
    public boolean getPadding(Rect rect0) {
        return super.getPadding(rect0);
    }

    @Override  // d5.e
    public int[] getState() {
        return super.getState();
    }

    @Override  // d5.e
    public Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0) throws XmlPullParserException, IOException {
        this.inflate(resources0, xmlPullParser0, attributeSet0, null);
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        c c0;
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.inflate(drawable0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            return;
        }
        int v = xmlPullParser0.getEventType();
        int v1 = xmlPullParser0.getDepth();
        while(true) {
            c0 = this.b;
            if(v == 1 || xmlPullParser0.getDepth() < v1 + 1 && v == 3) {
                break;
            }
            if(v == 2) {
                String s = xmlPullParser0.getName();
                if("animated-vector".equals(s)) {
                    TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, a.e);
                    int v2 = typedArray0.getResourceId(0, 0);
                    if(v2 != 0) {
                        VectorDrawableCompat vectorDrawableCompat0 = VectorDrawableCompat.create(resources0, v2, resources$Theme0);
                        vectorDrawableCompat0.f = false;
                        vectorDrawableCompat0.setCallback(this.f);
                        VectorDrawableCompat vectorDrawableCompat1 = c0.a;
                        if(vectorDrawableCompat1 != null) {
                            vectorDrawableCompat1.setCallback(null);
                        }
                        c0.a = vectorDrawableCompat0;
                    }
                    typedArray0.recycle();
                }
                else if("target".equals(s)) {
                    TypedArray typedArray1 = resources0.obtainAttributes(attributeSet0, a.f);
                    String s1 = typedArray1.getString(0);
                    int v3 = typedArray1.getResourceId(1, 0);
                    if(v3 != 0) {
                        Context context0 = this.c;
                        if(context0 != null) {
                            Animator animator0 = AnimatorInflaterCompat.loadAnimator(context0, v3);
                            animator0.setTarget(c0.a.b.b.o.get(s1));
                            if(c0.c == null) {
                                c0.c = new ArrayList();
                                c0.d = new ArrayMap();
                            }
                            c0.c.add(animator0);
                            c0.d.put(animator0, s1);
                            goto label_40;
                        }
                        typedArray1.recycle();
                        throw new IllegalStateException("Context can\'t be null when inflating animators");
                    }
                label_40:
                    typedArray1.recycle();
                }
            }
            v = xmlPullParser0.next();
        }
        if(c0.b == null) {
            c0.b = new AnimatorSet();
        }
        c0.b.playTogether(c0.c);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.isAutoMirrored() : DrawableCompat.isAutoMirrored(drawable0);
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.b.isRunning() : ((AnimatedVectorDrawable)drawable0).isRunning();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.isStateful() : drawable0.isStateful();
    }

    @Override  // d5.e
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.mutate();
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
            return;
        }
        this.b.a.setBounds(rect0);
    }

    @Override  // d5.e
    public boolean onLevelChange(int v) {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.setLevel(v) : drawable0.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] arr_v) {
        Drawable drawable0 = this.a;
        return drawable0 == null ? this.b.a.setState(arr_v) : drawable0.setState(arr_v);
    }

    public static void registerAnimationCallback(Drawable drawable0, AnimationCallback animatable2Compat$AnimationCallback0) {
        if(drawable0 == null || animatable2Compat$AnimationCallback0 == null || !(drawable0 instanceof Animatable)) {
            return;
        }
        ((AnimatedVectorDrawable)drawable0).registerAnimationCallback(animatable2Compat$AnimationCallback0.a());
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).registerAnimationCallback(animatable2Compat$AnimationCallback0.a());
            return;
        }
        if(animatable2Compat$AnimationCallback0 == null) {
            return;
        }
        if(this.e == null) {
            this.e = new ArrayList();
        }
        if(this.e.contains(animatable2Compat$AnimationCallback0)) {
            return;
        }
        this.e.add(animatable2Compat$AnimationCallback0);
        if(this.d == null) {
            this.d = new b(this);
        }
        this.b.b.addListener(this.d);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
            return;
        }
        this.b.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.setAutoMirrored(drawable0, z);
            return;
        }
        this.b.a.setAutoMirrored(z);
    }

    @Override  // d5.e
    public void setChangingConfigurations(int v) {
        super.setChangingConfigurations(v);
    }

    @Override  // d5.e
    public void setColorFilter(int v, PorterDuff.Mode porterDuff$Mode0) {
        super.setColorFilter(v, porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setColorFilter(colorFilter0);
            return;
        }
        this.b.a.setColorFilter(colorFilter0);
    }

    @Override  // d5.e
    public void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override  // d5.e
    public void setHotspot(float f, float f1) {
        super.setHotspot(f, f1);
    }

    @Override  // d5.e
    public void setHotspotBounds(int v, int v1, int v2, int v3) {
        super.setHotspotBounds(v, v1, v2, v3);
    }

    @Override  // d5.e
    public boolean setState(int[] arr_v) {
        return super.setState(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.setTint(drawable0, v);
            return;
        }
        this.b.a.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.setTintList(drawable0, colorStateList0);
            return;
        }
        this.b.a.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.setTintMode(drawable0, porterDuff$Mode0);
            return;
        }
        this.b.a.setTintMode(porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            return drawable0.setVisible(z, z1);
        }
        this.b.a.setVisible(z, z1);
        return super.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).start();
            return;
        }
        c c0 = this.b;
        if(c0.b.isStarted()) {
            return;
        }
        c0.b.start();
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).stop();
            return;
        }
        this.b.b.end();
    }

    // 去混淆评级： 低(20)
    public static boolean unregisterAnimationCallback(Drawable drawable0, AnimationCallback animatable2Compat$AnimationCallback0) {
        return drawable0 != null && animatable2Compat$AnimationCallback0 != null && drawable0 instanceof Animatable ? ((AnimatedVectorDrawable)drawable0).unregisterAnimationCallback(animatable2Compat$AnimationCallback0.a()) : false;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            ((AnimatedVectorDrawable)drawable0).unregisterAnimationCallback(animatable2Compat$AnimationCallback0.a());
        }
        ArrayList arrayList0 = this.e;
        if(arrayList0 != null && animatable2Compat$AnimationCallback0 != null) {
            boolean z = arrayList0.remove(animatable2Compat$AnimationCallback0);
            if(this.e.size() == 0) {
                b b0 = this.d;
                if(b0 != null) {
                    this.b.b.removeListener(b0);
                    this.d = null;
                }
            }
            return z;
        }
        return false;
    }
}

