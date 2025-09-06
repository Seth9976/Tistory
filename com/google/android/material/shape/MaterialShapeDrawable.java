package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.R.attr;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static class MaterialShapeDrawableState extends Drawable.ConstantState {
        public ShapeAppearanceModel a;
        public ElevationOverlayProvider b;
        public ColorStateList c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public PorterDuff.Mode g;
        public Rect h;
        public float i;
        public float j;
        public float k;
        public int l;
        public float m;
        public float n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public boolean t;
        public Paint.Style u;

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0) {
            this.h = null;
            this.a = materialShapeDrawable$MaterialShapeDrawableState0.a;
            this.b = materialShapeDrawable$MaterialShapeDrawableState0.b;
            this.k = materialShapeDrawable$MaterialShapeDrawableState0.k;
            this.c = materialShapeDrawable$MaterialShapeDrawableState0.c;
            this.d = materialShapeDrawable$MaterialShapeDrawableState0.d;
            this.g = materialShapeDrawable$MaterialShapeDrawableState0.g;
            this.f = materialShapeDrawable$MaterialShapeDrawableState0.f;
            this.l = materialShapeDrawable$MaterialShapeDrawableState0.l;
            this.i = materialShapeDrawable$MaterialShapeDrawableState0.i;
            this.r = materialShapeDrawable$MaterialShapeDrawableState0.r;
            this.p = materialShapeDrawable$MaterialShapeDrawableState0.p;
            this.t = materialShapeDrawable$MaterialShapeDrawableState0.t;
            this.j = materialShapeDrawable$MaterialShapeDrawableState0.j;
            this.m = materialShapeDrawable$MaterialShapeDrawableState0.m;
            this.n = materialShapeDrawable$MaterialShapeDrawableState0.n;
            this.o = materialShapeDrawable$MaterialShapeDrawableState0.o;
            this.q = materialShapeDrawable$MaterialShapeDrawableState0.q;
            this.s = materialShapeDrawable$MaterialShapeDrawableState0.s;
            this.e = materialShapeDrawable$MaterialShapeDrawableState0.e;
            this.u = materialShapeDrawable$MaterialShapeDrawableState0.u;
            if(materialShapeDrawable$MaterialShapeDrawableState0.h != null) {
                this.h = new Rect(materialShapeDrawable$MaterialShapeDrawableState0.h);
            }
        }

        public MaterialShapeDrawableState(@NonNull ShapeAppearanceModel shapeAppearanceModel0, @Nullable ElevationOverlayProvider elevationOverlayProvider0) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 0xFF;
            this.m = 0.0f;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.a = shapeAppearanceModel0;
            this.b = elevationOverlayProvider0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable() {
            Drawable drawable0 = new MaterialShapeDrawable(this);
            drawable0.e = true;
            return drawable0;
        }
    }

    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    public MaterialShapeDrawableState a;
    public final i[] b;
    public final i[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public ShapeAppearanceModel m;
    public final Paint n;
    public final Paint o;
    public final ShadowRenderer p;
    public final b q;
    public final ShapeAppearancePathProvider r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public int u;
    public final RectF v;
    public boolean w;
    public static final Paint x;

    static {
        Paint paint0 = new Paint(1);
        MaterialShapeDrawable.x = paint0;
        paint0.setColor(-1);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    public MaterialShapeDrawable(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        this(ShapeAppearanceModel.builder(context0, attributeSet0, v, v1).build());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0) {
        this.b = new i[4];
        this.c = new i[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint0 = new Paint(1);
        this.n = paint0;
        Paint paint1 = new Paint(1);
        this.o = paint1;
        this.p = new ShadowRenderer();
        this.r = Looper.getMainLooper().getThread() == Thread.currentThread() ? ShapeAppearancePathProvider.getInstance() : new ShapeAppearancePathProvider();
        this.v = new RectF();
        this.w = true;
        this.a = materialShapeDrawable$MaterialShapeDrawableState0;
        paint1.setStyle(Paint.Style.STROKE);
        paint0.setStyle(Paint.Style.FILL);
        this.g();
        this.f(this.getState());
        this.q = new b(this);
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel0, null));
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull ShapePathModel shapePathModel0) {
        this(shapePathModel0);
    }

    public final void a(RectF rectF0, Path path0) {
        this.calculatePathForSize(rectF0, path0);
        if(this.a.i != 1.0f) {
            this.f.reset();
            float f = this.a.i;
            float f1 = rectF0.width();
            float f2 = rectF0.height();
            this.f.setScale(f, f, f1 / 2.0f, f2 / 2.0f);
            path0.transform(this.f);
        }
        path0.computeBounds(this.v, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0, Paint paint0, boolean z) {
        if(colorStateList0 != null && porterDuff$Mode0 != null) {
            int v = colorStateList0.getColorForState(this.getState(), 0);
            if(z) {
                v = this.compositeElevationOverlayIfNeeded(v);
            }
            this.u = v;
            return new PorterDuffColorFilter(v, porterDuff$Mode0);
        }
        if(z) {
            int v1 = paint0.getColor();
            int v2 = this.compositeElevationOverlayIfNeeded(v1);
            this.u = v2;
            return v2 == v1 ? null : new PorterDuffColorFilter(v2, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public final void c(Canvas canvas0) {
        if(this.d.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can\'t be drawn for all operations in this shape.");
        }
        Path path0 = this.g;
        ShadowRenderer shadowRenderer0 = this.p;
        if(this.a.r != 0) {
            canvas0.drawPath(path0, shadowRenderer0.getShadowPaint());
        }
        for(int v = 0; v < 4; ++v) {
            this.b[v].a(i.b, shadowRenderer0, this.a.q, canvas0);
            this.c[v].a(i.b, shadowRenderer0, this.a.q, canvas0);
        }
        if(this.w) {
            int v1 = this.getShadowOffsetX();
            int v2 = this.getShadowOffsetY();
            canvas0.translate(((float)(-v1)), ((float)(-v2)));
            canvas0.drawPath(path0, MaterialShapeDrawable.x);
            canvas0.translate(((float)v1), ((float)v2));
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void calculatePathForSize(@NonNull RectF rectF0, @NonNull Path path0) {
        this.r.calculatePath(this.a.a, this.a.j, rectF0, this.q, path0);
    }

    @ColorInt
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int compositeElevationOverlayIfNeeded(@ColorInt int v) {
        ElevationOverlayProvider elevationOverlayProvider0 = this.a.b;
        return elevationOverlayProvider0 == null ? v : elevationOverlayProvider0.compositeOverlayIfNeeded(v, this.getParentAbsoluteElevation() + this.getZ());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context0) {
        return MaterialShapeDrawable.createWithElevationOverlay(context0, 0.0f);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context0, float f) {
        return MaterialShapeDrawable.createWithElevationOverlay(context0, f, null);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context0, float f, @Nullable ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(MaterialColors.getColor(context0, attr.colorSurface, "MaterialShapeDrawable"));
        }
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
        materialShapeDrawable0.initializeElevationOverlay(context0);
        materialShapeDrawable0.setFillColor(colorStateList0);
        materialShapeDrawable0.setElevation(f);
        return materialShapeDrawable0;
    }

    public final void d(Canvas canvas0, Paint paint0, Path path0, ShapeAppearanceModel shapeAppearanceModel0, RectF rectF0) {
        if(shapeAppearanceModel0.isRoundRect(rectF0)) {
            float f = shapeAppearanceModel0.getTopRightCornerSize().getCornerSize(rectF0) * this.a.j;
            canvas0.drawRoundRect(rectF0, f, f, paint0);
            return;
        }
        canvas0.drawPath(path0, paint0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        float f = 0.0f;
        Paint paint0 = this.n;
        paint0.setColorFilter(this.s);
        int v = paint0.getAlpha();
        paint0.setAlpha((this.a.l + (this.a.l >>> 7)) * v >>> 8);
        Paint paint1 = this.o;
        paint1.setColorFilter(this.t);
        paint1.setStrokeWidth(this.a.k);
        int v1 = paint1.getAlpha();
        paint1.setAlpha((this.a.l + (this.a.l >>> 7)) * v1 >>> 8);
        Path path0 = this.g;
        if(this.e) {
            ShapeAppearanceModel shapeAppearanceModel0 = this.getShapeAppearanceModel().withTransformedCornerSizes(new c(-(this.e() ? paint1.getStrokeWidth() / 2.0f : 0.0f)));
            this.m = shapeAppearanceModel0;
            float f1 = this.a.j;
            RectF rectF0 = this.j;
            rectF0.set(this.getBoundsAsRectF());
            if(this.e()) {
                f = paint1.getStrokeWidth() / 2.0f;
            }
            rectF0.inset(f, f);
            this.r.calculatePath(shapeAppearanceModel0, f1, rectF0, this.h);
            this.a(this.getBoundsAsRectF(), path0);
            this.e = false;
        }
        int v2 = this.a.p;
        if(v2 != 1 && this.a.q > 0 && (v2 == 2 || this.requiresCompatShadow())) {
            canvas0.save();
            canvas0.translate(((float)this.getShadowOffsetX()), ((float)this.getShadowOffsetY()));
            if(this.w) {
                RectF rectF1 = this.v;
                int v3 = (int)(rectF1.width() - ((float)this.getBounds().width()));
                int v4 = (int)(rectF1.height() - ((float)this.getBounds().height()));
                if(v3 < 0 || v4 < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                int v5 = (int)rectF1.width();
                int v6 = this.a.q * 2 + v5 + v3;
                int v7 = (int)rectF1.height();
                Bitmap bitmap0 = Bitmap.createBitmap(v6, this.a.q * 2 + v7 + v4, Bitmap.Config.ARGB_8888);
                Canvas canvas1 = new Canvas(bitmap0);
                float f2 = (float)(this.getBounds().left - this.a.q - v3);
                float f3 = (float)(this.getBounds().top - this.a.q - v4);
                canvas1.translate(-f2, -f3);
                this.c(canvas1);
                canvas0.drawBitmap(bitmap0, f2, f3, null);
                bitmap0.recycle();
            }
            else {
                this.c(canvas0);
            }
            canvas0.restore();
        }
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.u == Paint.Style.FILL_AND_STROKE || materialShapeDrawable$MaterialShapeDrawableState0.u == Paint.Style.FILL) {
            this.d(canvas0, paint0, path0, materialShapeDrawable$MaterialShapeDrawableState0.a, this.getBoundsAsRectF());
        }
        if(this.e()) {
            this.drawStrokeShape(canvas0);
        }
        paint0.setAlpha(v);
        paint1.setAlpha(v1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void drawShape(@NonNull Canvas canvas0, @NonNull Paint paint0, @NonNull Path path0, @NonNull RectF rectF0) {
        this.d(canvas0, paint0, path0, this.a.a, rectF0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void drawStrokeShape(@NonNull Canvas canvas0) {
        ShapeAppearanceModel shapeAppearanceModel0 = this.m;
        this.j.set(this.getBoundsAsRectF());
        float f = this.e() ? this.o.getStrokeWidth() / 2.0f : 0.0f;
        this.j.inset(f, f);
        this.d(canvas0, this.o, this.h, shapeAppearanceModel0, this.j);
    }

    public final boolean e() {
        Paint.Style paint$Style0 = this.a.u;
        return (paint$Style0 == Paint.Style.FILL_AND_STROKE || paint$Style0 == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    public final boolean f(int[] arr_v) {
        boolean z;
        if(this.a.c == null) {
            z = false;
        }
        else {
            Paint paint0 = this.n;
            int v = paint0.getColor();
            int v1 = this.a.c.getColorForState(arr_v, v);
            if(v == v1) {
                z = false;
            }
            else {
                paint0.setColor(v1);
                z = true;
            }
        }
        if(this.a.d != null) {
            Paint paint1 = this.o;
            int v2 = paint1.getColor();
            int v3 = this.a.d.getColorForState(arr_v, v2);
            if(v2 != v3) {
                paint1.setColor(v3);
                return true;
            }
        }
        return z;
    }

    public final boolean g() {
        PorterDuffColorFilter porterDuffColorFilter0 = this.s;
        PorterDuffColorFilter porterDuffColorFilter1 = this.t;
        this.s = this.b(this.a.f, this.a.g, this.n, true);
        this.t = this.b(this.a.e, this.a.g, this.o, false);
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.t) {
            int v = materialShapeDrawable$MaterialShapeDrawableState0.f.getColorForState(this.getState(), 0);
            this.p.setShadowColor(v);
        }
        return !ObjectsCompat.equals(porterDuffColorFilter0, this.s) || !ObjectsCompat.equals(porterDuffColorFilter1, this.t);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.l;
    }

    public float getBottomLeftCornerResolvedSize() {
        return this.a.a.getBottomLeftCornerSize().getCornerSize(this.getBoundsAsRectF());
    }

    public float getBottomRightCornerResolvedSize() {
        return this.a.a.getBottomRightCornerSize().getCornerSize(this.getBoundsAsRectF());
    }

    @NonNull
    public RectF getBoundsAsRectF() {
        Rect rect0 = this.getBounds();
        this.i.set(rect0);
        return this.i;
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public float getElevation() {
        return this.a.n;
    }

    @Nullable
    public ColorStateList getFillColor() {
        return this.a.c;
    }

    public float getInterpolation() {
        return this.a.j;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline0) {
        if(this.a.p == 2) {
            return;
        }
        if(this.isRoundRect()) {
            float f = this.getTopLeftCornerResolvedSize() * this.a.j;
            outline0.setRoundRect(this.getBounds(), f);
            return;
        }
        this.a(this.getBoundsAsRectF(), this.g);
        DrawableUtils.setOutlineToPath(outline0, this.g);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect0) {
        Rect rect1 = this.a.h;
        if(rect1 != null) {
            rect0.set(rect1);
            return true;
        }
        return super.getPadding(rect0);
    }

    public Paint.Style getPaintStyle() {
        return this.a.u;
    }

    public float getParentAbsoluteElevation() {
        return this.a.m;
    }

    @Deprecated
    public void getPathForSize(int v, int v1, @NonNull Path path0) {
        this.calculatePathForSize(new RectF(0.0f, 0.0f, ((float)v), ((float)v1)), path0);
    }

    @ColorInt
    public int getResolvedTintColor() {
        return this.u;
    }

    public float getScale() {
        return this.a.i;
    }

    public int getShadowCompatRotation() {
        return this.a.s;
    }

    public int getShadowCompatibilityMode() {
        return this.a.p;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int)this.getElevation();
    }

    public int getShadowOffsetX() {
        return (int)(Math.sin(Math.toRadians(this.a.s)) * ((double)this.a.r));
    }

    public int getShadowOffsetY() {
        return (int)(Math.cos(Math.toRadians(this.a.s)) * ((double)this.a.r));
    }

    public int getShadowRadius() {
        return this.a.q;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getShadowVerticalOffset() {
        return this.a.r;
    }

    @Override  // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.a.a;
    }

    @Nullable
    @Deprecated
    public ShapePathModel getShapedViewModel() {
        ShapeAppearanceModel shapeAppearanceModel0 = this.getShapeAppearanceModel();
        return shapeAppearanceModel0 instanceof ShapePathModel ? ((ShapePathModel)shapeAppearanceModel0) : null;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.a.d;
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
        return this.a.e;
    }

    public float getStrokeWidth() {
        return this.a.k;
    }

    @Nullable
    public ColorStateList getTintList() {
        return this.a.f;
    }

    public float getTopLeftCornerResolvedSize() {
        return this.a.a.getTopLeftCornerSize().getCornerSize(this.getBoundsAsRectF());
    }

    public float getTopRightCornerResolvedSize() {
        return this.a.a.getTopRightCornerSize().getCornerSize(this.getBoundsAsRectF());
    }

    public float getTranslationZ() {
        return this.a.o;
    }

    @Override  // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Rect rect0 = this.getBounds();
        this.k.set(rect0);
        this.a(this.getBoundsAsRectF(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public float getZ() {
        return this.getTranslationZ() + this.getElevation();
    }

    public final void h() {
        float f = this.getZ();
        this.a.q = (int)Math.ceil(0.75f * f);
        this.a.r = (int)Math.ceil(f * 0.25f);
        this.g();
        super.invalidateSelf();
    }

    public void initializeElevationOverlay(Context context0) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        materialShapeDrawable$MaterialShapeDrawableState0.b = new ElevationOverlayProvider(context0);
        this.h();
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        ElevationOverlayProvider elevationOverlayProvider0 = this.a.b;
        return elevationOverlayProvider0 != null && elevationOverlayProvider0.isThemeElevationOverlayEnabled();
    }

    public boolean isElevationOverlayInitialized() {
        return this.a.b != null;
    }

    public boolean isPointInTransparentRegion(int v, int v1) {
        return this.getTransparentRegion().contains(v, v1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isRoundRect() {
        return this.a.a.isRoundRect(this.getBoundsAsRectF());
    }

    @Deprecated
    public boolean isShadowEnabled() {
        return this.a.p == 0 || this.a.p == 2;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if(!super.isStateful()) {
            ColorStateList colorStateList0 = this.a.f;
            if(colorStateList0 == null || !colorStateList0.isStateful()) {
                ColorStateList colorStateList1 = this.a.e;
                if(colorStateList1 == null || !colorStateList1.isStateful()) {
                    ColorStateList colorStateList2 = this.a.d;
                    if(colorStateList2 == null || !colorStateList2.isStateful()) {
                        ColorStateList colorStateList3 = this.a.c;
                        return colorStateList3 != null && colorStateList3.isStateful();
                    }
                }
            }
        }
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.a = new MaterialShapeDrawableState(this.a);
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect0) {
        this.e = true;
        super.onBoundsChange(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] arr_v) {
        boolean z = this.f(arr_v) || this.g();
        if(z) {
            this.invalidateSelf();
        }
        return z;
    }

    public boolean requiresCompatShadow() {
        int v = Build.VERSION.SDK_INT;
        return !this.isRoundRect() && !this.g.isConvex() && v < 29;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0L, to = 0xFFL) int v) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.l != v) {
            materialShapeDrawable$MaterialShapeDrawableState0.l = v;
            super.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.a.getClass();
        super.invalidateSelf();
    }

    public void setCornerSize(float f) {
        this.setShapeAppearanceModel(this.a.a.withCornerSize(f));
    }

    public void setCornerSize(@NonNull CornerSize cornerSize0) {
        this.setShapeAppearanceModel(this.a.a.withCornerSize(cornerSize0));
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setEdgeIntersectionCheckEnable(boolean z) {
        this.r.l = z;
    }

    public void setElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.n != f) {
            materialShapeDrawable$MaterialShapeDrawableState0.n = f;
            this.h();
        }
    }

    public void setFillColor(@Nullable ColorStateList colorStateList0) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.c != colorStateList0) {
            materialShapeDrawable$MaterialShapeDrawableState0.c = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public void setInterpolation(float f) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.j != f) {
            materialShapeDrawable$MaterialShapeDrawableState0.j = f;
            this.e = true;
            this.invalidateSelf();
        }
    }

    public void setPadding(int v, int v1, int v2, int v3) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.h == null) {
            materialShapeDrawable$MaterialShapeDrawableState0.h = new Rect();
        }
        this.a.h.set(v, v1, v2, v3);
        this.invalidateSelf();
    }

    public void setPaintStyle(Paint.Style paint$Style0) {
        this.a.u = paint$Style0;
        super.invalidateSelf();
    }

    public void setParentAbsoluteElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.m != f) {
            materialShapeDrawable$MaterialShapeDrawableState0.m = f;
            this.h();
        }
    }

    public void setScale(float f) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.i != f) {
            materialShapeDrawable$MaterialShapeDrawableState0.i = f;
            this.invalidateSelf();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setShadowBitmapDrawingEnable(boolean z) {
        this.w = z;
    }

    public void setShadowColor(int v) {
        this.p.setShadowColor(v);
        this.a.t = false;
        super.invalidateSelf();
    }

    public void setShadowCompatRotation(int v) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.s != v) {
            materialShapeDrawable$MaterialShapeDrawableState0.s = v;
            super.invalidateSelf();
        }
    }

    public void setShadowCompatibilityMode(int v) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.p != v) {
            materialShapeDrawable$MaterialShapeDrawableState0.p = v;
            super.invalidateSelf();
        }
    }

    @Deprecated
    public void setShadowElevation(int v) {
        this.setElevation(((float)v));
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
        this.setShadowCompatibilityMode(!z);
    }

    @Deprecated
    public void setShadowRadius(int v) {
        this.a.q = v;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setShadowVerticalOffset(int v) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.r != v) {
            materialShapeDrawable$MaterialShapeDrawableState0.r = v;
            super.invalidateSelf();
        }
    }

    @Override  // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        this.a.a = shapeAppearanceModel0;
        this.invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(@NonNull ShapePathModel shapePathModel0) {
        this.setShapeAppearanceModel(shapePathModel0);
    }

    public void setStroke(float f, @ColorInt int v) {
        this.setStrokeWidth(f);
        this.setStrokeColor(ColorStateList.valueOf(v));
    }

    public void setStroke(float f, @Nullable ColorStateList colorStateList0) {
        this.setStrokeWidth(f);
        this.setStrokeColor(colorStateList0);
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList0) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.d != colorStateList0) {
            materialShapeDrawable$MaterialShapeDrawableState0.d = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public void setStrokeTint(@ColorInt int v) {
        this.setStrokeTint(ColorStateList.valueOf(v));
    }

    public void setStrokeTint(ColorStateList colorStateList0) {
        this.a.e = colorStateList0;
        this.g();
        super.invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        this.a.k = f;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList0) {
        this.a.f = colorStateList0;
        this.g();
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.g != porterDuff$Mode0) {
            materialShapeDrawable$MaterialShapeDrawableState0.g = porterDuff$Mode0;
            this.g();
            super.invalidateSelf();
        }
    }

    public void setTranslationZ(float f) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.o != f) {
            materialShapeDrawable$MaterialShapeDrawableState0.o = f;
            this.h();
        }
    }

    public void setUseTintColorForShadow(boolean z) {
        MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState0 = this.a;
        if(materialShapeDrawable$MaterialShapeDrawableState0.t != z) {
            materialShapeDrawable$MaterialShapeDrawableState0.t = z;
            this.invalidateSelf();
        }
    }

    public void setZ(float f) {
        this.setTranslationZ(f - this.getElevation());
    }
}

