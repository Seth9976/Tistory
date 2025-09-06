package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import androidx.appcompat.resources.R.styleable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import l.e;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class StateListDrawableCompat extends DrawableContainerCompat {
    public e n;
    public boolean o;

    public StateListDrawableCompat() {
        this(null, null);
    }

    public StateListDrawableCompat(e e0, Resources resources0) {
        this.e(new e(e0, this, resources0));
        this.onStateChange(this.getState());
    }

    public void addState(int[] arr_v, Drawable drawable0) {
        if(drawable0 != null) {
            e e0 = this.n;
            e0.I[e0.a(drawable0)] = arr_v;
            this.onStateChange(this.getState());
        }
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme resources$Theme0) {
        super.applyTheme(resources$Theme0);
        this.onStateChange(this.getState());
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public e b() {
        return this.f();
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public void e(e e0) {
        super.e(e0);
        this.n = e0;
    }

    public e f() {
        return new e(this.n, this, null);
    }

    public static int[] g(AttributeSet attributeSet0) {
        int v = attributeSet0.getAttributeCount();
        int[] arr_v = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = attributeSet0.getAttributeNameResource(v1);
            if(v3 != 0 && v3 != 0x10100D0 && v3 != 0x1010199) {
                if(!attributeSet0.getAttributeBooleanValue(v1, false)) {
                    v3 = -v3;
                }
                arr_v[v2] = v3;
                ++v2;
            }
        }
        return StateSet.trimStateSet(arr_v, v2);
    }

    public void inflate(@NonNull Context context0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, styleable.StateListDrawable);
        this.setVisible(typedArray0.getBoolean(styleable.StateListDrawable_android_visible, true), true);
        e e0 = this.n;
        e0.d |= Api21Impl.getChangingConfigurations(typedArray0);
        e0.i = typedArray0.getBoolean(styleable.StateListDrawable_android_variablePadding, e0.i);
        e0.l = typedArray0.getBoolean(styleable.StateListDrawable_android_constantSize, e0.l);
        e0.z = typedArray0.getInt(styleable.StateListDrawable_android_enterFadeDuration, e0.z);
        e0.A = typedArray0.getInt(styleable.StateListDrawable_android_exitFadeDuration, e0.A);
        e0.x = typedArray0.getBoolean(styleable.StateListDrawable_android_dither, e0.x);
        e e1 = this.a;
        if(resources0 == null) {
            e1.getClass();
        }
        else {
            e1.b = resources0;
            int v = resources0.getDisplayMetrics().densityDpi;
            if(v == 0) {
                v = 0xA0;
            }
            int v1 = e1.c;
            e1.c = v;
            if(v1 != v) {
                e1.m = false;
                e1.j = false;
            }
        }
        typedArray0.recycle();
        e e2 = this.n;
        int v2 = xmlPullParser0.getDepth();
        int v3;
        while((v3 = xmlPullParser0.next()) != 1) {
            int v4 = xmlPullParser0.getDepth();
            if(v4 < v2 + 1 && v3 == 3) {
                break;
            }
            if(v3 == 2 && v4 <= v2 + 1 && xmlPullParser0.getName().equals("item")) {
                TypedArray typedArray1 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, styleable.StateListDrawableItem);
                int v5 = typedArray1.getResourceId(styleable.StateListDrawableItem_android_drawable, -1);
                Drawable drawable0 = v5 <= 0 ? null : ResourceManagerInternal.get().getDrawable(context0, v5);
                typedArray1.recycle();
                int[] arr_v = StateListDrawableCompat.g(attributeSet0);
                if(drawable0 == null) {
                alab1:
                    while(true) {
                        switch(xmlPullParser0.next()) {
                            case 2: {
                                drawable0 = Api21Impl.createFromXmlInner(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
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
                e2.I[e2.a(drawable0)] = arr_v;
            }
        }
        this.onStateChange(this.getState());
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public boolean isStateful() {
        return true;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    @NonNull
    public Drawable mutate() {
        if(!this.o && super.mutate() == this) {
            this.n.f();
            this.o = true;
        }
        return this;
    }

    @Override  // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public boolean onStateChange(@NonNull int[] arr_v) {
        boolean z = super.onStateChange(arr_v);
        int v = this.n.e(arr_v);
        if(v < 0) {
            v = this.n.e(StateSet.WILD_CARD);
        }
        return this.d(v) || z;
    }
}

