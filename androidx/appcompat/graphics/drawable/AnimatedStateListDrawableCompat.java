package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import androidx.appcompat.resources.R.styleable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import l.a;
import l.b;
import l.c;
import l.e;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    public b p;
    public g.b q;
    public int r;
    public int s;
    public boolean t;

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    public AnimatedStateListDrawableCompat(b b0, Resources resources0) {
        this.r = -1;
        this.s = -1;
        this.e(new b(b0, this, resources0));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    public void addState(@NonNull int[] arr_v, @NonNull Drawable drawable0, int v) {
        ObjectsCompat.requireNonNull(drawable0);
        b b0 = this.p;
        int v1 = b0.a(drawable0);
        b0.I[v1] = arr_v;
        b0.K.put(v1, v);
        this.onStateChange(this.getState());
    }

    public void addTransition(int v, int v1, @NonNull Drawable drawable0, boolean z) {
        ObjectsCompat.requireNonNull(drawable0);
        this.p.g(v, v1, drawable0, z);
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public final e b() {
        return new b(this.p, this, null);
    }

    @Nullable
    public static AnimatedStateListDrawableCompat create(@NonNull Context context0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        try {
            Resources resources0 = context0.getResources();
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
            do {
                int v1 = xmlResourceParser0.next();
            }
            while(v1 != 1 && v1 != 2);
            if(v1 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return AnimatedStateListDrawableCompat.createFromXmlInner(context0, resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("AnimatedStateListDrawableCompat", "parser error", iOException0);
            return null;
        }
        Log.e("AnimatedStateListDrawableCompat", "parser error", xmlPullParserException0);
        return null;
    }

    @NonNull
    public static AnimatedStateListDrawableCompat createFromXmlInner(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws IOException, XmlPullParserException {
        String s = xmlPullParser0.getName();
        if(!s.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": invalid animated-selector tag " + s);
        }
        AnimatedStateListDrawableCompat animatedStateListDrawableCompat0 = new AnimatedStateListDrawableCompat();
        animatedStateListDrawableCompat0.inflate(context0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        return animatedStateListDrawableCompat0;
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public final void e(e e0) {
        super.e(e0);
        if(e0 instanceof b) {
            this.p = (b)e0;
        }
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public final e f() {
        return new b(this.p, this, null);
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, styleable.AnimatedStateListDrawableCompat);
        this.setVisible(typedArray0.getBoolean(styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        b b0 = this.p;
        b0.d |= Api21Impl.getChangingConfigurations(typedArray0);
        b0.i = typedArray0.getBoolean(styleable.AnimatedStateListDrawableCompat_android_variablePadding, b0.i);
        b0.l = typedArray0.getBoolean(styleable.AnimatedStateListDrawableCompat_android_constantSize, b0.l);
        b0.z = typedArray0.getInt(styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, b0.z);
        b0.A = typedArray0.getInt(styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, b0.A);
        this.setDither(typedArray0.getBoolean(styleable.AnimatedStateListDrawableCompat_android_dither, b0.x));
        e e0 = this.a;
        if(resources0 == null) {
            e0.getClass();
        }
        else {
            e0.b = resources0;
            int v = resources0.getDisplayMetrics().densityDpi;
            if(v == 0) {
                v = 0xA0;
            }
            int v1 = e0.c;
            e0.c = v;
            if(v1 != v) {
                e0.m = false;
                e0.j = false;
            }
        }
        typedArray0.recycle();
        int v2 = xmlPullParser0.getDepth();
        while(true) {
            int v3 = xmlPullParser0.next();
            if(v3 == 1) {
                this.onStateChange(this.getState());
                return;
            }
            Drawable drawable0 = null;
            int v4 = xmlPullParser0.getDepth();
            if(v4 < v2 + 1 && v3 == 3) {
                this.onStateChange(this.getState());
                return;
            }
            if(v3 != 2 || v4 > v2 + 1) {
            }
            else if(xmlPullParser0.getName().equals("item")) {
                TypedArray typedArray1 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, styleable.AnimatedStateListDrawableItem);
                int v5 = typedArray1.getResourceId(styleable.AnimatedStateListDrawableItem_android_id, 0);
                int v6 = typedArray1.getResourceId(styleable.AnimatedStateListDrawableItem_android_drawable, -1);
                if(v6 > 0) {
                    drawable0 = ResourceManagerInternal.get().getDrawable(context0, v6);
                }
                typedArray1.recycle();
                int[] arr_v = StateListDrawableCompat.g(attributeSet0);
                if(drawable0 == null) {
                alab1:
                    while(true) {
                        switch(xmlPullParser0.next()) {
                            case 2: {
                                drawable0 = xmlPullParser0.getName().equals("vector") ? VectorDrawableCompat.createFromXmlInner(resources0, xmlPullParser0, attributeSet0, resources$Theme0) : Api21Impl.createFromXmlInner(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
                                break alab1;
                            }
                            case 4: {
                                break;
                            }
                            default: {
                                throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
                            }
                        }
                    }
                }
                if(drawable0 == null) {
                    throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
                }
                b b1 = this.p;
                int v7 = b1.a(drawable0);
                b1.I[v7] = arr_v;
                b1.K.put(v7, v5);
            }
            else if(xmlPullParser0.getName().equals("transition")) {
                TypedArray typedArray2 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, styleable.AnimatedStateListDrawableTransition);
                int v8 = typedArray2.getResourceId(styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
                int v9 = typedArray2.getResourceId(styleable.AnimatedStateListDrawableTransition_android_toId, -1);
                int v10 = typedArray2.getResourceId(styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
                if(v10 > 0) {
                    drawable0 = ResourceManagerInternal.get().getDrawable(context0, v10);
                }
                boolean z = typedArray2.getBoolean(styleable.AnimatedStateListDrawableTransition_android_reversible, false);
                typedArray2.recycle();
                if(drawable0 == null) {
                alab2:
                    while(true) {
                        switch(xmlPullParser0.next()) {
                            case 2: {
                                drawable0 = xmlPullParser0.getName().equals("animated-vector") ? AnimatedVectorDrawableCompat.createFromXmlInner(context0, resources0, xmlPullParser0, attributeSet0, resources$Theme0) : Api21Impl.createFromXmlInner(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
                                break alab2;
                            }
                            case 4: {
                                break;
                            }
                            default: {
                                throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
                            }
                        }
                    }
                }
                if(drawable0 == null) {
                    throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
                }
                if(v8 == -1 || v9 == -1) {
                    break;
                }
                this.p.g(v8, v9, drawable0, z);
            }
        }
        throw new XmlPullParserException(xmlPullParser0.getPositionDescription() + ": <transition> tag requires \'fromId\' & \'toId\' attributes");
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public boolean isStateful() {
        return true;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g.b b0 = this.q;
        if(b0 != null) {
            b0.G();
            this.q = null;
            this.d(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    @NonNull
    public Drawable mutate() {
        if(!this.t && super.mutate() == this) {
            this.p.f();
            this.t = true;
        }
        return this;
    }

    @Override  // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public boolean onStateChange(@NonNull int[] arr_v) {
        c c0;
        int v2;
        b b0 = this.p;
        int v = b0.e(arr_v);
        if(v < 0) {
            v = b0.e(StateSet.WILD_CARD);
        }
        int v1 = this.g;
        boolean z = false;
        if(v != v1) {
            g.b b1 = this.q;
            if(b1 == null) {
            label_21:
                this.q = null;
                this.s = -1;
                this.r = -1;
                b b2 = this.p;
                if(v1 < 0) {
                    b2.getClass();
                    v2 = 0;
                }
                else {
                    v2 = (int)(((Integer)b2.K.get(v1, 0)));
                }
                int v3 = v >= 0 ? ((int)(((Integer)b2.K.get(v, 0)))) : 0;
                if(v3 == 0 || v2 == 0) {
                label_54:
                    if(this.d(v)) {
                        z = true;
                    }
                }
                else {
                    long v4 = ((long)v3) | ((long)v2) << 0x20;
                    int v5 = (int)(((long)(((Long)b2.J.get(v4, -1L)))));
                    if(v5 >= 0) {
                        boolean z1 = (((long)(((Long)b2.J.get(v4, -1L)))) & 0x200000000L) != 0L;
                        this.d(v5);
                        Drawable drawable0 = this.getCurrent();
                        if(drawable0 instanceof AnimationDrawable) {
                            if((((long)(((Long)b2.J.get(v4, -1L)))) & 0x100000000L) != 0L) {
                                z = true;
                            }
                            c0 = new c(((AnimationDrawable)drawable0), z, z1);
                            goto label_48;
                        }
                        else if(drawable0 instanceof AnimatedVectorDrawableCompat) {
                            c0 = new a(((AnimatedVectorDrawableCompat)drawable0), 1);
                            goto label_48;
                        }
                        else {
                            if(drawable0 instanceof Animatable) {
                                c0 = new a(((Animatable)drawable0), 0);
                            label_48:
                                c0.F();
                                this.q = c0;
                                this.s = v1;
                                this.r = v;
                                z = true;
                                goto label_56;
                            }
                            goto label_54;
                        }
                    }
                    else {
                        goto label_54;
                    }
                }
            }
            else if(v == this.r) {
                z = true;
            }
            else if(v == this.s && b1.c()) {
                b1.A();
                this.r = this.s;
                this.s = v;
                z = true;
            }
            else {
                v1 = this.r;
                b1.G();
                goto label_21;
            }
        }
    label_56:
        Drawable drawable1 = this.getCurrent();
        return drawable1 != null ? z | drawable1.setState(arr_v) : z;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        g.b b0 = this.q;
        if(b0 != null && (z2 || z1)) {
            if(z) {
                b0.F();
                return z2;
            }
            this.jumpToCurrentState();
        }
        return z2;
    }
}

