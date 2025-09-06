package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import d5.a;
import d5.e;
import d5.f;
import d5.g;
import d5.h;
import d5.k;
import d5.l;
import d5.m;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class VectorDrawableCompat extends e {
    public l b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;
    public static final PorterDuff.Mode j;

    static {
        VectorDrawableCompat.j = PorterDuff.Mode.SRC_IN;
    }

    public VectorDrawableCompat() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        l l0 = new l();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
        l0.c = null;
        l0.d = VectorDrawableCompat.j;
        l0.b = new k();
        this.b = l0;
    }

    public VectorDrawableCompat(l l0) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = l0;
        this.c = this.a(l0.c, l0.d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(this.getState(), 0), porterDuff$Mode0);
    }

    @Override  // d5.e
    public void applyTheme(Resources.Theme resources$Theme0) {
        super.applyTheme(resources$Theme0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.canApplyTheme(drawable0);
        }
        return false;
    }

    @Override  // d5.e
    public void clearColorFilter() {
        super.clearColorFilter();
    }

    @Nullable
    public static VectorDrawableCompat create(@NonNull Resources resources0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        VectorDrawableCompat vectorDrawableCompat0 = new VectorDrawableCompat();
        vectorDrawableCompat0.a = ResourcesCompat.getDrawable(resources0, v, resources$Theme0);
        new m(vectorDrawableCompat0.a.getConstantState());
        return vectorDrawableCompat0;
    }

    public static VectorDrawableCompat createFromXmlInner(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat0 = new VectorDrawableCompat();
        vectorDrawableCompat0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        return vectorDrawableCompat0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Paint paint0;
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
            return;
        }
        Rect rect0 = this.i;
        this.copyBounds(rect0);
        if(rect0.width() > 0 && rect0.height() > 0) {
            ColorFilter colorFilter0 = this.d;
            if(colorFilter0 == null) {
                colorFilter0 = this.c;
            }
            canvas0.getMatrix(this.h);
            this.h.getValues(this.g);
            float f = Math.abs(this.g[0]);
            float f1 = Math.abs(this.g[4]);
            if(Float.compare(Math.abs(this.g[1]), 0.0f) != 0 || Math.abs(this.g[3]) != 0.0f) {
                f = 1.0f;
                f1 = 1.0f;
            }
            int v = Math.min(0x800, ((int)(((float)rect0.width()) * f)));
            int v1 = Math.min(0x800, ((int)(((float)rect0.height()) * f1)));
            if(v > 0 && v1 > 0) {
                int v2 = canvas0.save();
                canvas0.translate(((float)rect0.left), ((float)rect0.top));
                if(this.isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
                    canvas0.translate(((float)rect0.width()), 0.0f);
                    canvas0.scale(-1.0f, 1.0f);
                }
                rect0.offsetTo(0, 0);
                l l0 = this.b;
                if(l0.f == null || v != l0.f.getWidth() || v1 != l0.f.getHeight()) {
                    l0.f = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                    l0.k = true;
                }
                if(!this.f) {
                    l l1 = this.b;
                    l1.f.eraseColor(0);
                    Canvas canvas1 = new Canvas(l1.f);
                    l1.b.a(l1.b.g, k.p, canvas1, v, v1);
                }
                else if(this.b.k || this.b.g != this.b.c || this.b.h != this.b.d || this.b.j != this.b.e || this.b.i != this.b.b.getRootAlpha()) {
                    l l2 = this.b;
                    l2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(l2.f);
                    l2.b.a(l2.b.g, k.p, canvas2, v, v1);
                    l l3 = this.b;
                    l3.g = l3.c;
                    l3.h = l3.d;
                    l3.i = l3.b.getRootAlpha();
                    l3.j = l3.e;
                    l3.k = false;
                }
                l l4 = this.b;
                if(l4.b.getRootAlpha() < 0xFF || colorFilter0 != null) {
                    if(l4.l == null) {
                        Paint paint1 = new Paint();
                        l4.l = paint1;
                        paint1.setFilterBitmap(true);
                    }
                    l4.l.setAlpha(l4.b.getRootAlpha());
                    l4.l.setColorFilter(colorFilter0);
                    paint0 = l4.l;
                }
                else {
                    paint0 = null;
                }
                canvas0.drawBitmap(l4.f, null, rect0, paint0);
                canvas0.restoreToCount(v2);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a == null ? this.b.b.getRootAlpha() : DrawableCompat.getAlpha(this.a);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable0 = this.a;
        return drawable0 == null ? super.getChangingConfigurations() | this.b.getChangingConfigurations() : drawable0.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.a == null ? this.d : DrawableCompat.getColorFilter(this.a);
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if(this.a != null) {
            return new m(this.a.getConstantState());
        }
        l l0 = this.b;
        l0.a = this.getChangingConfigurations();
        return this.b;
    }

    @Override  // d5.e
    public Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a == null ? ((int)this.b.b.i) : this.a.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a == null ? ((int)this.b.b.h) : this.a.getIntrinsicWidth();
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
        return this.a == null ? -3 : this.a.getOpacity();
    }

    @Override  // d5.e
    public boolean getPadding(Rect rect0) {
        return super.getPadding(rect0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public float getPixelSize() {
        l l0 = this.b;
        if(l0 != null) {
            k k0 = l0.b;
            if(k0 != null) {
                float f = k0.h;
                if(f != 0.0f) {
                    float f1 = k0.i;
                    if(f1 != 0.0f) {
                        float f2 = k0.k;
                        if(f2 != 0.0f) {
                            return k0.j == 0.0f ? 1.0f : Math.min(k0.j / f, f2 / f1);
                        }
                    }
                }
            }
        }
        return 1.0f;
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
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0);
            return;
        }
        this.inflate(resources0, xmlPullParser0, attributeSet0, null);
    }

    @Override  // android.graphics.drawable.Drawable
    public void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) throws XmlPullParserException, IOException {
        ArrayDeque arrayDeque2;
        TypedArray typedArray2;
        ArrayMap arrayMap1;
        int v3;
        g g1;
        k k2;
        ArrayDeque arrayDeque1;
        Paint.Cap paint$Cap2;
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.inflate(drawable0, resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            return;
        }
        l l0 = this.b;
        l0.b = new k();
        TypedArray typedArray0 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, a.a);
        l l1 = this.b;
        k k0 = l1.b;
        int v = TypedArrayUtils.getNamedInt(typedArray0, xmlPullParser0, "tintMode", 6, -1);
        PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
        switch(v) {
            case 3: {
                porterDuff$Mode0 = PorterDuff.Mode.SRC_OVER;
                break;
            }
            case 9: {
                porterDuff$Mode0 = PorterDuff.Mode.SRC_ATOP;
                break;
            }
            case 14: {
                porterDuff$Mode0 = PorterDuff.Mode.MULTIPLY;
                break;
            }
            case 15: {
                porterDuff$Mode0 = PorterDuff.Mode.SCREEN;
                break;
            }
            case 16: {
                porterDuff$Mode0 = PorterDuff.Mode.ADD;
            }
        }
        l1.d = porterDuff$Mode0;
        ColorStateList colorStateList0 = TypedArrayUtils.getNamedColorStateList(typedArray0, xmlPullParser0, resources$Theme0, "tint", 1);
        if(colorStateList0 != null) {
            l1.c = colorStateList0;
        }
        l1.e = TypedArrayUtils.getNamedBoolean(typedArray0, xmlPullParser0, "autoMirrored", 5, l1.e);
        k0.j = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "viewportWidth", 7, k0.j);
        float f = TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "viewportHeight", 8, k0.k);
        k0.k = f;
        if(k0.j <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if(f <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        k0.h = typedArray0.getDimension(3, k0.h);
        float f1 = typedArray0.getDimension(2, k0.i);
        k0.i = f1;
        if(k0.h <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if(f1 <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        k0.setAlpha(TypedArrayUtils.getNamedFloat(typedArray0, xmlPullParser0, "alpha", 4, k0.getAlpha()));
        String s = typedArray0.getString(0);
        if(s != null) {
            k0.m = s;
            k0.o.put(s, k0);
        }
        typedArray0.recycle();
        l0.a = this.getChangingConfigurations();
        l0.k = true;
        l l2 = this.b;
        k k1 = l2.b;
        ArrayDeque arrayDeque0 = new ArrayDeque();
        arrayDeque0.push(k1.g);
        int v1 = xmlPullParser0.getEventType();
        int v2 = xmlPullParser0.getDepth() + 1;
        boolean z = true;
        while(v1 != 1 && (xmlPullParser0.getDepth() >= v2 || v1 != 3)) {
            if(v1 == 2) {
                String s1 = xmlPullParser0.getName();
                h h0 = (h)arrayDeque0.peek();
                ArrayMap arrayMap0 = k1.o;
                if("path".equals(s1)) {
                    g g0 = new g();  // 初始化器: Ld5/j;-><init>()V
                    g0.e = 0.0f;
                    g0.g = 1.0f;
                    g0.h = 1.0f;
                    g0.i = 0.0f;
                    g0.j = 1.0f;
                    g0.k = 0.0f;
                    g0.l = Paint.Cap.BUTT;
                    Paint.Join paint$Join0 = Paint.Join.MITER;
                    g0.m = paint$Join0;
                    Paint.Cap paint$Cap0 = Paint.Cap.BUTT;
                    g0.n = 4.0f;
                    TypedArray typedArray1 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, a.c);
                    if(TypedArrayUtils.hasAttribute(xmlPullParser0, "pathData")) {
                        String s2 = typedArray1.getString(0);
                        if(s2 != null) {
                            g0.b = s2;
                        }
                        String s3 = typedArray1.getString(2);
                        if(s3 != null) {
                            g0.a = PathParser.createNodesFromPathData(s3);
                        }
                        arrayDeque1 = arrayDeque0;
                        k2 = k1;
                        v3 = v2;
                        arrayMap1 = arrayMap0;
                        g0.f = TypedArrayUtils.getNamedComplexColor(typedArray1, xmlPullParser0, resources$Theme0, "fillColor", 1, 0);
                        g0.h = TypedArrayUtils.getNamedFloat(typedArray1, xmlPullParser0, "fillAlpha", 12, g0.h);
                        int v4 = TypedArrayUtils.getNamedInt(typedArray1, xmlPullParser0, "strokeLineCap", 8, -1);
                        Paint.Cap paint$Cap1 = g0.l;
                        switch(v4) {
                            case 0: {
                                paint$Cap2 = paint$Cap0;
                                break;
                            }
                            case 1: {
                                paint$Cap2 = Paint.Cap.ROUND;
                                break;
                            }
                            default: {
                                paint$Cap2 = v4 == 2 ? Paint.Cap.SQUARE : paint$Cap1;
                            }
                        }
                        g0.l = paint$Cap2;
                        int v5 = TypedArrayUtils.getNamedInt(typedArray1, xmlPullParser0, "strokeLineJoin", 9, -1);
                        Paint.Join paint$Join1 = g0.m;
                        switch(v5) {
                            case 0: {
                                break;
                            }
                            case 1: {
                                paint$Join0 = Paint.Join.ROUND;
                                break;
                            }
                            default: {
                                paint$Join0 = v5 == 2 ? Paint.Join.BEVEL : paint$Join1;
                            }
                        }
                        g0.m = paint$Join0;
                        g0.n = TypedArrayUtils.getNamedFloat(typedArray1, xmlPullParser0, "strokeMiterLimit", 10, g0.n);
                        typedArray2 = typedArray1;
                        g1 = g0;
                        g1.d = TypedArrayUtils.getNamedComplexColor(typedArray1, xmlPullParser0, resources$Theme0, "strokeColor", 3, 0);
                        g1.g = TypedArrayUtils.getNamedFloat(typedArray2, xmlPullParser0, "strokeAlpha", 11, g1.g);
                        g1.e = TypedArrayUtils.getNamedFloat(typedArray2, xmlPullParser0, "strokeWidth", 4, g1.e);
                        g1.j = TypedArrayUtils.getNamedFloat(typedArray2, xmlPullParser0, "trimPathEnd", 6, g1.j);
                        g1.k = TypedArrayUtils.getNamedFloat(typedArray2, xmlPullParser0, "trimPathOffset", 7, g1.k);
                        g1.i = TypedArrayUtils.getNamedFloat(typedArray2, xmlPullParser0, "trimPathStart", 5, g1.i);
                        g1.c = TypedArrayUtils.getNamedInt(typedArray2, xmlPullParser0, "fillType", 13, g1.c);
                    }
                    else {
                        arrayDeque1 = arrayDeque0;
                        k2 = k1;
                        g1 = g0;
                        v3 = v2;
                        arrayMap1 = arrayMap0;
                        typedArray2 = typedArray1;
                    }
                    typedArray2.recycle();
                    h0.b.add(g1);
                    if(g1.getPathName() != null) {
                        arrayMap1.put(g1.getPathName(), g1);
                    }
                    l2.a = l2.a;
                    arrayDeque2 = arrayDeque1;
                    z = false;
                }
                else {
                    k2 = k1;
                    v3 = v2;
                    if("clip-path".equals(s1)) {
                        f f2 = new f();  // 初始化器: Ld5/j;-><init>()V
                        if(TypedArrayUtils.hasAttribute(xmlPullParser0, "pathData")) {
                            TypedArray typedArray3 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, a.d);
                            String s4 = typedArray3.getString(0);
                            if(s4 != null) {
                                f2.b = s4;
                            }
                            String s5 = typedArray3.getString(1);
                            if(s5 != null) {
                                f2.a = PathParser.createNodesFromPathData(s5);
                            }
                            f2.c = TypedArrayUtils.getNamedInt(typedArray3, xmlPullParser0, "fillType", 2, 0);
                            typedArray3.recycle();
                        }
                        h0.b.add(f2);
                        if(f2.getPathName() != null) {
                            arrayMap0.put(f2.getPathName(), f2);
                        }
                        l2.a = l2.a;
                    }
                    else if("group".equals(s1)) {
                        h h1 = new h();
                        TypedArray typedArray4 = TypedArrayUtils.obtainAttributes(resources0, resources$Theme0, attributeSet0, a.b);
                        h1.c = TypedArrayUtils.getNamedFloat(typedArray4, xmlPullParser0, "rotation", 5, h1.c);
                        h1.d = typedArray4.getFloat(1, h1.d);
                        h1.e = typedArray4.getFloat(2, h1.e);
                        h1.f = TypedArrayUtils.getNamedFloat(typedArray4, xmlPullParser0, "scaleX", 3, h1.f);
                        h1.g = TypedArrayUtils.getNamedFloat(typedArray4, xmlPullParser0, "scaleY", 4, h1.g);
                        h1.h = TypedArrayUtils.getNamedFloat(typedArray4, xmlPullParser0, "translateX", 6, h1.h);
                        h1.i = TypedArrayUtils.getNamedFloat(typedArray4, xmlPullParser0, "translateY", 7, h1.i);
                        String s6 = typedArray4.getString(0);
                        if(s6 != null) {
                            h1.k = s6;
                        }
                        h1.c();
                        typedArray4.recycle();
                        h0.b.add(h1);
                        arrayDeque2 = arrayDeque0;
                        arrayDeque2.push(h1);
                        if(h1.getGroupName() != null) {
                            arrayMap0.put(h1.getGroupName(), h1);
                        }
                        l2.a = l2.a;
                        goto label_179;
                    }
                    arrayDeque2 = arrayDeque0;
                }
            }
            else {
                k2 = k1;
                v3 = v2;
                arrayDeque2 = arrayDeque0;
                if(v1 == 3 && "group".equals(xmlPullParser0.getName())) {
                    arrayDeque2.pop();
                }
            }
        label_179:
            v1 = xmlPullParser0.next();
            arrayDeque0 = arrayDeque2;
            k1 = k2;
            v2 = v3;
        }
        if(z) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = this.a(l0.c, l0.d);
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.a == null ? this.b.e : DrawableCompat.isAutoMirrored(this.a);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            return drawable0.isStateful();
        }
        if(!super.isStateful()) {
            l l0 = this.b;
            if(l0 == null) {
                return false;
            }
            k k0 = l0.b;
            if(k0.n == null) {
                k0.n = Boolean.valueOf(k0.g.a());
            }
            if(!k0.n.booleanValue()) {
                ColorStateList colorStateList0 = this.b.c;
                return colorStateList0 != null && colorStateList0.isStateful();
            }
        }
        return true;
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
            return this;
        }
        if(!this.e && super.mutate() == this) {
            l l0 = this.b;
            l l1 = new l();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
            l1.c = null;
            l1.d = VectorDrawableCompat.j;
            if(l0 != null) {
                l1.a = l0.a;
                k k0 = new k(l0.b);
                l1.b = k0;
                if(l0.b.e != null) {
                    k0.e = new Paint(l0.b.e);
                }
                if(l0.b.d != null) {
                    k k1 = l1.b;
                    k1.d = new Paint(l0.b.d);
                }
                l1.c = l0.c;
                l1.d = l0.d;
                l1.e = l0.e;
            }
            this.b = l1;
            this.e = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] arr_v) {
        boolean z;
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            return drawable0.setState(arr_v);
        }
        l l0 = this.b;
        ColorStateList colorStateList0 = l0.c;
        if(colorStateList0 == null) {
            z = false;
        }
        else {
            PorterDuff.Mode porterDuff$Mode0 = l0.d;
            if(porterDuff$Mode0 == null) {
                z = false;
            }
            else {
                this.c = this.a(colorStateList0, porterDuff$Mode0);
                this.invalidateSelf();
                z = true;
            }
        }
        k k0 = l0.b;
        if(k0.n == null) {
            k0.n = Boolean.valueOf(k0.g.a());
        }
        if(k0.n.booleanValue()) {
            boolean z1 = l0.b.g.b(arr_v);
            l0.k |= z1;
            if(z1) {
                this.invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable0, long v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.scheduleSelf(runnable0, v);
            return;
        }
        super.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
            return;
        }
        if(this.b.b.getRootAlpha() != v) {
            this.b.b.setRootAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.setAutoMirrored(drawable0, z);
            return;
        }
        this.b.e = z;
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
        this.d = colorFilter0;
        this.invalidateSelf();
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
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.setTintList(drawable0, colorStateList0);
            return;
        }
        l l0 = this.b;
        if(l0.c != colorStateList0) {
            l0.c = colorStateList0;
            this.c = this.a(colorStateList0, l0.d);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.setTintMode(drawable0, porterDuff$Mode0);
            return;
        }
        l l0 = this.b;
        if(l0.d != porterDuff$Mode0) {
            l0.d = porterDuff$Mode0;
            this.c = this.a(l0.c, porterDuff$Mode0);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        Drawable drawable0 = this.a;
        return drawable0 == null ? super.setVisible(z, z1) : drawable0.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.unscheduleSelf(runnable0);
            return;
        }
        super.unscheduleSelf(runnable0);
    }
}

