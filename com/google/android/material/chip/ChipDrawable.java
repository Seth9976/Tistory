package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.text.BidiFormatter;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback, TintAwareDrawable, TextDrawableDelegate {
    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    public float A;
    public boolean A0;
    public float B;
    public ColorStateList B0;
    public ColorStateList C;
    public WeakReference C0;
    public float D;
    public TextUtils.TruncateAt D0;
    public ColorStateList E;
    public boolean E0;
    public CharSequence F;
    public int F0;
    public boolean G;
    public boolean G0;
    public Drawable H;
    public static final int[] H0;
    public ColorStateList I;
    public static final ShapeDrawable I0;
    public float J;
    public boolean K;
    public boolean L;
    public Drawable M;
    public RippleDrawable N;
    public ColorStateList O;
    public float P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public MotionSpec V;
    public MotionSpec W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public final Context f0;
    public final Paint g0;
    public final Paint.FontMetrics h0;
    public final RectF i0;
    public final PointF j0;
    public final Path k0;
    public final TextDrawableHelper l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public int u0;
    public ColorFilter v0;
    public PorterDuffColorFilter w0;
    public ColorStateList x0;
    public ColorStateList y;
    public PorterDuff.Mode y0;
    public ColorStateList z;
    public int[] z0;

    static {
        ChipDrawable.H0 = new int[]{0x101009E};
        ChipDrawable.I0 = new ShapeDrawable(new OvalShape());
    }

    public ChipDrawable(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.B = -1.0f;
        this.g0 = new Paint(1);
        this.h0 = new Paint.FontMetrics();
        this.i0 = new RectF();
        this.j0 = new PointF();
        this.k0 = new Path();
        this.u0 = 0xFF;
        this.y0 = PorterDuff.Mode.SRC_IN;
        this.C0 = new WeakReference(null);
        this.initializeElevationOverlay(context0);
        this.f0 = context0;
        TextDrawableHelper textDrawableHelper0 = new TextDrawableHelper(this);
        this.l0 = textDrawableHelper0;
        this.F = "";
        textDrawableHelper0.getTextPaint().density = context0.getResources().getDisplayMetrics().density;
        this.setState(ChipDrawable.H0);
        this.setCloseIconState(ChipDrawable.H0);
        this.E0 = true;
        if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
            ChipDrawable.I0.setTint(-1);
        }
    }

    @NonNull
    public static ChipDrawable createFromAttributes(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        ChipDrawable chipDrawable0 = new ChipDrawable(context0, attributeSet0, v, v1);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(chipDrawable0.f0, attributeSet0, styleable.Chip, v, v1, new int[0]);
        chipDrawable0.G0 = typedArray0.hasValue(styleable.Chip_shapeAppearance);
        Context context1 = chipDrawable0.f0;
        ColorStateList colorStateList0 = MaterialResources.getColorStateList(context1, typedArray0, styleable.Chip_chipSurfaceColor);
        if(chipDrawable0.y != colorStateList0) {
            chipDrawable0.y = colorStateList0;
            chipDrawable0.onStateChange(chipDrawable0.getState());
        }
        chipDrawable0.setChipBackgroundColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.Chip_chipBackgroundColor));
        chipDrawable0.setChipMinHeight(typedArray0.getDimension(styleable.Chip_chipMinHeight, 0.0f));
        if(typedArray0.hasValue(styleable.Chip_chipCornerRadius)) {
            chipDrawable0.setChipCornerRadius(typedArray0.getDimension(styleable.Chip_chipCornerRadius, 0.0f));
        }
        chipDrawable0.setChipStrokeColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.Chip_chipStrokeColor));
        chipDrawable0.setChipStrokeWidth(typedArray0.getDimension(styleable.Chip_chipStrokeWidth, 0.0f));
        chipDrawable0.setRippleColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.Chip_rippleColor));
        chipDrawable0.setText(typedArray0.getText(styleable.Chip_android_text));
        TextAppearance textAppearance0 = MaterialResources.getTextAppearance(context1, typedArray0, styleable.Chip_android_textAppearance);
        textAppearance0.setTextSize(typedArray0.getDimension(styleable.Chip_android_textSize, textAppearance0.getTextSize()));
        chipDrawable0.setTextAppearance(textAppearance0);
        switch(typedArray0.getInt(styleable.Chip_android_ellipsize, 0)) {
            case 1: {
                chipDrawable0.setEllipsize(TextUtils.TruncateAt.START);
                break;
            }
            case 2: {
                chipDrawable0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                break;
            }
            case 3: {
                chipDrawable0.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        chipDrawable0.setChipIconVisible(typedArray0.getBoolean(styleable.Chip_chipIconVisible, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable0.setChipIconVisible(typedArray0.getBoolean(styleable.Chip_chipIconEnabled, false));
        }
        chipDrawable0.setChipIcon(MaterialResources.getDrawable(context1, typedArray0, styleable.Chip_chipIcon));
        if(typedArray0.hasValue(styleable.Chip_chipIconTint)) {
            chipDrawable0.setChipIconTint(MaterialResources.getColorStateList(context1, typedArray0, styleable.Chip_chipIconTint));
        }
        chipDrawable0.setChipIconSize(typedArray0.getDimension(styleable.Chip_chipIconSize, -1.0f));
        chipDrawable0.setCloseIconVisible(typedArray0.getBoolean(styleable.Chip_closeIconVisible, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable0.setCloseIconVisible(typedArray0.getBoolean(styleable.Chip_closeIconEnabled, false));
        }
        chipDrawable0.setCloseIcon(MaterialResources.getDrawable(context1, typedArray0, styleable.Chip_closeIcon));
        chipDrawable0.setCloseIconTint(MaterialResources.getColorStateList(context1, typedArray0, styleable.Chip_closeIconTint));
        chipDrawable0.setCloseIconSize(typedArray0.getDimension(styleable.Chip_closeIconSize, 0.0f));
        chipDrawable0.setCheckable(typedArray0.getBoolean(styleable.Chip_android_checkable, false));
        chipDrawable0.setCheckedIconVisible(typedArray0.getBoolean(styleable.Chip_checkedIconVisible, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable0.setCheckedIconVisible(typedArray0.getBoolean(styleable.Chip_checkedIconEnabled, false));
        }
        chipDrawable0.setCheckedIcon(MaterialResources.getDrawable(context1, typedArray0, styleable.Chip_checkedIcon));
        if(typedArray0.hasValue(styleable.Chip_checkedIconTint)) {
            chipDrawable0.setCheckedIconTint(MaterialResources.getColorStateList(context1, typedArray0, styleable.Chip_checkedIconTint));
        }
        chipDrawable0.setShowMotionSpec(MotionSpec.createFromAttribute(context1, typedArray0, styleable.Chip_showMotionSpec));
        chipDrawable0.setHideMotionSpec(MotionSpec.createFromAttribute(context1, typedArray0, styleable.Chip_hideMotionSpec));
        chipDrawable0.setChipStartPadding(typedArray0.getDimension(styleable.Chip_chipStartPadding, 0.0f));
        chipDrawable0.setIconStartPadding(typedArray0.getDimension(styleable.Chip_iconStartPadding, 0.0f));
        chipDrawable0.setIconEndPadding(typedArray0.getDimension(styleable.Chip_iconEndPadding, 0.0f));
        chipDrawable0.setTextStartPadding(typedArray0.getDimension(styleable.Chip_textStartPadding, 0.0f));
        chipDrawable0.setTextEndPadding(typedArray0.getDimension(styleable.Chip_textEndPadding, 0.0f));
        chipDrawable0.setCloseIconStartPadding(typedArray0.getDimension(styleable.Chip_closeIconStartPadding, 0.0f));
        chipDrawable0.setCloseIconEndPadding(typedArray0.getDimension(styleable.Chip_closeIconEndPadding, 0.0f));
        chipDrawable0.setChipEndPadding(typedArray0.getDimension(styleable.Chip_chipEndPadding, 0.0f));
        chipDrawable0.setMaxWidth(typedArray0.getDimensionPixelSize(styleable.Chip_android_maxWidth, 0x7FFFFFFF));
        typedArray0.recycle();
        return chipDrawable0;
    }

    @NonNull
    public static ChipDrawable createFromResource(@NonNull Context context0, @XmlRes int v) {
        AttributeSet attributeSet0 = DrawableUtils.parseDrawableXml(context0, v, "chip");
        int v1 = attributeSet0.getStyleAttribute();
        if(v1 == 0) {
            v1 = style.Widget_MaterialComponents_Chip_Entry;
        }
        return ChipDrawable.createFromAttributes(context0, attributeSet0, attr.chipStandaloneStyle, v1);
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public void draw(@NonNull Canvas canvas0) {
        int v2;
        Rect rect0 = this.getBounds();
        if(!rect0.isEmpty() && this.getAlpha() != 0) {
            int v = this.u0 >= 0xFF ? 0 : CanvasCompat.saveLayerAlpha(canvas0, ((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom), this.u0);
            Paint paint0 = this.g0;
            RectF rectF0 = this.i0;
            if(!this.G0) {
                paint0.setColor(this.m0);
                paint0.setStyle(Paint.Style.FILL);
                rectF0.set(rect0);
                canvas0.drawRoundRect(rectF0, this.getChipCornerRadius(), this.getChipCornerRadius(), paint0);
            }
            if(!this.G0) {
                paint0.setColor(this.n0);
                paint0.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter0 = this.v0;
                if(colorFilter0 == null) {
                    colorFilter0 = this.w0;
                }
                paint0.setColorFilter(colorFilter0);
                rectF0.set(rect0);
                canvas0.drawRoundRect(rectF0, this.getChipCornerRadius(), this.getChipCornerRadius(), paint0);
            }
            if(this.G0) {
                super.draw(canvas0);
            }
            if(Float.compare(this.D, 0.0f) > 0 && !this.G0) {
                paint0.setColor(this.p0);
                paint0.setStyle(Paint.Style.STROKE);
                if(!this.G0) {
                    ColorFilter colorFilter1 = this.v0;
                    if(colorFilter1 == null) {
                        colorFilter1 = this.w0;
                    }
                    paint0.setColorFilter(colorFilter1);
                }
                rectF0.set(((float)rect0.left) + this.D / 2.0f, ((float)rect0.top) + this.D / 2.0f, ((float)rect0.right) - this.D / 2.0f, ((float)rect0.bottom) - this.D / 2.0f);
                float f = this.B - this.D / 2.0f;
                canvas0.drawRoundRect(rectF0, f, f, paint0);
            }
            paint0.setColor(this.q0);
            paint0.setStyle(Paint.Style.FILL);
            rectF0.set(rect0);
            if(this.G0) {
                this.calculatePathForSize(new RectF(rect0), this.k0);
                RectF rectF1 = this.getBoundsAsRectF();
                super.drawShape(canvas0, paint0, this.k0, rectF1);
            }
            else {
                canvas0.drawRoundRect(rectF0, this.getChipCornerRadius(), this.getChipCornerRadius(), paint0);
            }
            if(this.q()) {
                this.j(rect0, rectF0);
                float f1 = rectF0.left;
                float f2 = rectF0.top;
                canvas0.translate(f1, f2);
                this.H.setBounds(0, 0, ((int)rectF0.width()), ((int)rectF0.height()));
                this.H.draw(canvas0);
                canvas0.translate(-f1, -f2);
            }
            if(this.p()) {
                this.j(rect0, rectF0);
                float f3 = rectF0.left;
                float f4 = rectF0.top;
                canvas0.translate(f3, f4);
                this.T.setBounds(0, 0, ((int)rectF0.width()), ((int)rectF0.height()));
                this.T.draw(canvas0);
                canvas0.translate(-f3, -f4);
            }
            if(this.E0 && this.F != null) {
                PointF pointF0 = this.j0;
                pointF0.set(0.0f, 0.0f);
                Paint.Align paint$Align0 = Paint.Align.LEFT;
                TextDrawableHelper textDrawableHelper0 = this.l0;
                if(this.F != null) {
                    float f5 = this.X;
                    float f6 = this.k() + f5 + this.a0;
                    if(DrawableCompat.getLayoutDirection(this) == 0) {
                        pointF0.x = ((float)rect0.left) + f6;
                    }
                    else {
                        pointF0.x = ((float)rect0.right) - f6;
                        paint$Align0 = Paint.Align.RIGHT;
                    }
                    float f7 = (float)rect0.centerY();
                    textDrawableHelper0.getTextPaint().getFontMetrics(this.h0);
                    pointF0.y = f7 - (this.h0.descent + this.h0.ascent) / 2.0f;
                }
                rectF0.setEmpty();
                if(this.F != null) {
                    float f8 = this.X;
                    float f9 = this.k() + f8 + this.a0;
                    float f10 = this.l() + this.e0 + this.b0;
                    if(DrawableCompat.getLayoutDirection(this) == 0) {
                        rectF0.left = ((float)rect0.left) + f9;
                        rectF0.right = ((float)rect0.right) - f10;
                    }
                    else {
                        rectF0.left = ((float)rect0.left) + f10;
                        rectF0.right = ((float)rect0.right) - f9;
                    }
                    rectF0.top = (float)rect0.top;
                    rectF0.bottom = (float)rect0.bottom;
                }
                if(textDrawableHelper0.getTextAppearance() != null) {
                    textDrawableHelper0.getTextPaint().drawableState = this.getState();
                    textDrawableHelper0.updateTextPaintDrawState(this.f0);
                }
                textDrawableHelper0.getTextPaint().setTextAlign(paint$Align0);
                boolean z = Math.round(textDrawableHelper0.getTextWidth(this.getText().toString())) > Math.round(rectF0.width());
                if(z) {
                    int v1 = canvas0.save();
                    canvas0.clipRect(rectF0);
                    v2 = v1;
                }
                else {
                    v2 = 0;
                }
                CharSequence charSequence0 = !z || this.D0 == null ? this.F : TextUtils.ellipsize(this.F, textDrawableHelper0.getTextPaint(), rectF0.width(), this.D0);
                canvas0.drawText(charSequence0, 0, charSequence0.length(), pointF0.x, pointF0.y, textDrawableHelper0.getTextPaint());
                if(z) {
                    canvas0.restoreToCount(v2);
                }
            }
            if(this.r()) {
                rectF0.setEmpty();
                if(this.r()) {
                    float f11 = this.e0 + this.d0;
                    if(DrawableCompat.getLayoutDirection(this) == 0) {
                        float f12 = ((float)rect0.right) - f11;
                        rectF0.right = f12;
                        rectF0.left = f12 - this.P;
                    }
                    else {
                        float f13 = ((float)rect0.left) + f11;
                        rectF0.left = f13;
                        rectF0.right = f13 + this.P;
                    }
                    float f14 = rect0.exactCenterY() - this.P / 2.0f;
                    rectF0.top = f14;
                    rectF0.bottom = f14 + this.P;
                }
                float f15 = rectF0.left;
                float f16 = rectF0.top;
                canvas0.translate(f15, f16);
                this.M.setBounds(0, 0, ((int)rectF0.width()), ((int)rectF0.height()));
                if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
                    this.N.setBounds(this.M.getBounds());
                    this.N.jumpToCurrentState();
                    this.N.draw(canvas0);
                }
                else {
                    this.M.draw(canvas0);
                }
                canvas0.translate(-f15, -f16);
            }
            if(this.u0 < 0xFF) {
                canvas0.restoreToCount(v);
            }
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public int getAlpha() {
        return this.u0;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.T;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.U;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.z;
    }

    // 去混淆评级： 低(20)
    public float getChipCornerRadius() {
        return this.G0 ? this.getTopLeftCornerResolvedSize() : this.B;
    }

    public float getChipEndPadding() {
        return this.e0;
    }

    @Nullable
    public Drawable getChipIcon() {
        return this.H == null ? null : DrawableCompat.unwrap(this.H);
    }

    public float getChipIconSize() {
        return this.J;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.I;
    }

    public float getChipMinHeight() {
        return this.A;
    }

    public float getChipStartPadding() {
        return this.X;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.C;
    }

    public float getChipStrokeWidth() {
        return this.D;
    }

    public void getChipTouchBounds(@NonNull RectF rectF0) {
        Rect rect0 = this.getBounds();
        rectF0.set(rect0);
        if(this.r()) {
            float f = this.e0 + this.d0 + this.P + this.c0 + this.b0;
            if(DrawableCompat.getLayoutDirection(this) == 0) {
                rectF0.right = ((float)rect0.right) - f;
                return;
            }
            rectF0.left = ((float)rect0.left) + f;
        }
    }

    @Nullable
    public Drawable getCloseIcon() {
        return this.M == null ? null : DrawableCompat.unwrap(this.M);
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.Q;
    }

    public float getCloseIconEndPadding() {
        return this.d0;
    }

    public float getCloseIconSize() {
        return this.P;
    }

    public float getCloseIconStartPadding() {
        return this.c0;
    }

    @NonNull
    public int[] getCloseIconState() {
        return this.z0;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.O;
    }

    public void getCloseIconTouchBounds(@NonNull RectF rectF0) {
        Rect rect0 = this.getBounds();
        rectF0.setEmpty();
        if(this.r()) {
            float f = this.e0 + this.d0 + this.P + this.c0 + this.b0;
            if(DrawableCompat.getLayoutDirection(this) == 0) {
                float f1 = (float)rect0.right;
                rectF0.right = f1;
                rectF0.left = f1 - f;
            }
            else {
                float f2 = (float)rect0.left;
                rectF0.left = f2;
                rectF0.right = f2 + f;
            }
            rectF0.top = (float)rect0.top;
            rectF0.bottom = (float)rect0.bottom;
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.v0;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.D0;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.W;
    }

    public float getIconEndPadding() {
        return this.Z;
    }

    public float getIconStartPadding() {
        return this.Y;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int)this.A;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f = this.X;
        float f1 = this.k() + f + this.a0;
        return Math.min(Math.round(this.l() + (this.l0.getTextWidth(this.getText().toString()) + f1 + this.b0) + this.e0), this.F0);
    }

    @Px
    public int getMaxWidth() {
        return this.F0;
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public int getOpacity() {
        return -3;
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline0) {
        if(this.G0) {
            super.getOutline(outline0);
            return;
        }
        Rect rect0 = this.getBounds();
        if(rect0.isEmpty()) {
            outline0.setRoundRect(0, 0, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.B);
        }
        else {
            outline0.setRoundRect(rect0, this.B);
        }
        outline0.setAlpha(((float)this.getAlpha()) / 255.0f);
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.E;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.V;
    }

    @Nullable
    public CharSequence getText() {
        return this.F;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.l0.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.b0;
    }

    public float getTextStartPadding() {
        return this.a0;
    }

    public boolean getUseCompatRipple() {
        return this.A0;
    }

    public final void i(Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        drawable0.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable0, DrawableCompat.getLayoutDirection(this));
        drawable0.setLevel(this.getLevel());
        drawable0.setVisible(this.isVisible(), false);
        if(drawable0 == this.M) {
            if(drawable0.isStateful()) {
                drawable0.setState(this.getCloseIconState());
            }
            DrawableCompat.setTintList(drawable0, this.O);
            return;
        }
        Drawable drawable1 = this.H;
        if(drawable0 == drawable1 && this.K) {
            DrawableCompat.setTintList(drawable1, this.I);
        }
        if(drawable0.isStateful()) {
            drawable0.setState(this.getState());
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(@NonNull Drawable drawable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.R;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return this.isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.S;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return this.isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.G;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return this.isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return ChipDrawable.n(this.M);
    }

    public boolean isCloseIconVisible() {
        return this.L;
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public boolean isStateful() {
        if(!ChipDrawable.m(this.y) && !ChipDrawable.m(this.z) && !ChipDrawable.m(this.C) && (!this.A0 || !ChipDrawable.m(this.B0))) {
            TextAppearance textAppearance0 = this.l0.getTextAppearance();
            return textAppearance0 != null && textAppearance0.getTextColor() != null && textAppearance0.getTextColor().isStateful() || this.S && this.T != null && this.R || ChipDrawable.n(this.H) || ChipDrawable.n(this.T) || ChipDrawable.m(this.x0);
        }
        return true;
    }

    public final void j(Rect rect0, RectF rectF0) {
        rectF0.setEmpty();
        if(this.q() || this.p()) {
            float f = this.X + this.Y;
            Drawable drawable0 = this.s0 ? this.T : this.H;
            float f1 = this.J > 0.0f || drawable0 == null ? this.J : ((float)drawable0.getIntrinsicWidth());
            if(DrawableCompat.getLayoutDirection(this) == 0) {
                float f2 = ((float)rect0.left) + f;
                rectF0.left = f2;
                rectF0.right = f2 + f1;
            }
            else {
                float f3 = ((float)rect0.right) - f;
                rectF0.right = f3;
                rectF0.left = f3 - f1;
            }
            Drawable drawable1 = this.s0 ? this.T : this.H;
            float f4 = this.J;
            if(f4 <= 0.0f && drawable1 != null) {
                f4 = (float)Math.ceil(ViewUtils.dpToPx(this.f0, 24));
                if(((float)drawable1.getIntrinsicHeight()) <= f4) {
                    f4 = (float)drawable1.getIntrinsicHeight();
                }
            }
            float f5 = rect0.exactCenterY() - f4 / 2.0f;
            rectF0.top = f5;
            rectF0.bottom = f5 + f4;
        }
    }

    public final float k() {
        if(!this.q() && !this.p()) {
            return 0.0f;
        }
        float f = this.Y;
        Drawable drawable0 = this.s0 ? this.T : this.H;
        return (this.J > 0.0f || drawable0 == null ? this.J : ((float)drawable0.getIntrinsicWidth())) + f + this.Z;
    }

    // 去混淆评级： 低(20)
    public final float l() {
        return this.r() ? this.c0 + this.P + this.d0 : 0.0f;
    }

    public static boolean m(ColorStateList colorStateList0) {
        return colorStateList0 != null && colorStateList0.isStateful();
    }

    public static boolean n(Drawable drawable0) {
        return drawable0 != null && drawable0.isStateful();
    }

    public final boolean o(int[] arr_v, int[] arr_v1) {
        boolean z3;
        boolean z = super.onStateChange(arr_v);
        int v = this.compositeElevationOverlayIfNeeded((this.y == null ? 0 : this.y.getColorForState(arr_v, this.m0)));
        boolean z1 = true;
        if(this.m0 != v) {
            this.m0 = v;
            z = true;
        }
        int v1 = this.compositeElevationOverlayIfNeeded((this.z == null ? 0 : this.z.getColorForState(arr_v, this.n0)));
        if(this.n0 != v1) {
            this.n0 = v1;
            z = true;
        }
        int v2 = MaterialColors.layer(v, v1);
        if(((this.o0 == v2 ? 0 : 1) | (this.getFillColor() == null ? 1 : 0)) != 0) {
            this.o0 = v2;
            this.setFillColor(ColorStateList.valueOf(v2));
            z = true;
        }
        int v3 = this.C == null ? 0 : this.C.getColorForState(arr_v, this.p0);
        if(this.p0 != v3) {
            this.p0 = v3;
            z = true;
        }
        int v4 = this.B0 == null || !RippleUtils.shouldDrawRippleCompat(arr_v) ? 0 : this.B0.getColorForState(arr_v, this.q0);
        if(this.q0 != v4) {
            this.q0 = v4;
            if(this.A0) {
                z = true;
            }
        }
        int v5 = this.l0.getTextAppearance() == null || this.l0.getTextAppearance().getTextColor() == null ? 0 : this.l0.getTextAppearance().getTextColor().getColorForState(arr_v, this.r0);
        if(this.r0 != v5) {
            this.r0 = v5;
            z = true;
        }
        boolean z2 = false;
        int[] arr_v2 = this.getState();
        if(arr_v2 != null) {
            for(int v6 = 0; v6 < arr_v2.length; ++v6) {
                if(arr_v2[v6] == 0x10100A0) {
                    if(!this.R) {
                        break;
                    }
                    z2 = true;
                    break;
                }
            }
        }
        if(this.s0 == z2 || this.T == null) {
            z3 = false;
        }
        else {
            float f = this.k();
            this.s0 = z2;
            if(f == this.k()) {
                z3 = false;
                z = true;
            }
            else {
                z = true;
                z3 = true;
            }
        }
        int v7 = this.x0 == null ? 0 : this.x0.getColorForState(arr_v, this.t0);
        if(this.t0 == v7) {
            z1 = z;
        }
        else {
            this.t0 = v7;
            this.w0 = DrawableUtils.updateTintFilter(this, this.x0, this.y0);
        }
        if(ChipDrawable.n(this.H)) {
            z1 |= this.H.setState(arr_v);
        }
        if(ChipDrawable.n(this.T)) {
            z1 |= this.T.setState(arr_v);
        }
        if(ChipDrawable.n(this.M)) {
            int[] arr_v3 = new int[arr_v.length + arr_v1.length];
            System.arraycopy(arr_v, 0, arr_v3, 0, arr_v.length);
            System.arraycopy(arr_v1, 0, arr_v3, arr_v.length, arr_v1.length);
            z1 |= this.M.setState(arr_v3);
        }
        if(RippleUtils.USE_FRAMEWORK_RIPPLE && ChipDrawable.n(this.N)) {
            z1 |= this.N.setState(arr_v1);
        }
        if(z1) {
            this.invalidateSelf();
        }
        if(z3) {
            this.onSizeChange();
        }
        return z1;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int v) {
        boolean z = super.onLayoutDirectionChanged(v);
        if(this.q()) {
            z |= DrawableCompat.setLayoutDirection(this.H, v);
        }
        if(this.p()) {
            z |= DrawableCompat.setLayoutDirection(this.T, v);
        }
        if(this.r()) {
            z |= DrawableCompat.setLayoutDirection(this.M, v);
        }
        if(z) {
            this.invalidateSelf();
        }
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLevelChange(int v) {
        boolean z = super.onLevelChange(v);
        if(this.q()) {
            z |= this.H.setLevel(v);
        }
        if(this.p()) {
            z |= this.T.setLevel(v);
        }
        if(this.r()) {
            z |= this.M.setLevel(v);
        }
        if(z) {
            this.invalidateSelf();
        }
        return z;
    }

    public void onSizeChange() {
        Delegate chipDrawable$Delegate0 = (Delegate)this.C0.get();
        if(chipDrawable$Delegate0 != null) {
            chipDrawable$Delegate0.onChipDrawableSizeChange();
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable, com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] arr_v) {
        if(this.G0) {
            super.onStateChange(arr_v);
        }
        return this.o(arr_v, this.getCloseIconState());
    }

    @Override  // com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate
    public void onTextSizeChange() {
        this.onSizeChange();
        this.invalidateSelf();
    }

    // 去混淆评级： 低(20)
    public final boolean p() {
        return this.S && this.T != null && this.s0;
    }

    public final boolean q() {
        return this.G && this.H != null;
    }

    public final boolean r() {
        return this.L && this.M != null;
    }

    public static void s(Drawable drawable0) {
        if(drawable0 != null) {
            drawable0.setCallback(null);
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0, long v) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public void setAlpha(int v) {
        if(this.u0 != v) {
            this.u0 = v;
            this.invalidateSelf();
        }
    }

    public void setCheckable(boolean z) {
        if(this.R != z) {
            this.R = z;
            float f = this.k();
            if(!z && this.s0) {
                this.s0 = false;
            }
            float f1 = this.k();
            this.invalidateSelf();
            if(f != f1) {
                this.onSizeChange();
            }
        }
    }

    public void setCheckableResource(@BoolRes int v) {
        this.setCheckable(this.f0.getResources().getBoolean(v));
    }

    public void setCheckedIcon(@Nullable Drawable drawable0) {
        if(this.T != drawable0) {
            float f = this.k();
            this.T = drawable0;
            float f1 = this.k();
            ChipDrawable.s(this.T);
            this.i(this.T);
            this.invalidateSelf();
            if(f != f1) {
                this.onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        this.setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int v) {
        this.setCheckedIconVisible(this.f0.getResources().getBoolean(v));
    }

    public void setCheckedIconResource(@DrawableRes int v) {
        this.setCheckedIcon(AppCompatResources.getDrawable(this.f0, v));
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList0) {
        if(this.U != colorStateList0) {
            this.U = colorStateList0;
            if(this.S) {
                Drawable drawable0 = this.T;
                if(drawable0 != null && this.R) {
                    DrawableCompat.setTintList(drawable0, colorStateList0);
                }
            }
            this.onStateChange(this.getState());
        }
    }

    public void setCheckedIconTintResource(@ColorRes int v) {
        this.setCheckedIconTint(AppCompatResources.getColorStateList(this.f0, v));
    }

    public void setCheckedIconVisible(@BoolRes int v) {
        this.setCheckedIconVisible(this.f0.getResources().getBoolean(v));
    }

    public void setCheckedIconVisible(boolean z) {
        if(this.S != z) {
            boolean z1 = this.p();
            this.S = z;
            boolean z2 = this.p();
            if(z1 != z2) {
                if(z2) {
                    this.i(this.T);
                }
                else {
                    ChipDrawable.s(this.T);
                }
                this.invalidateSelf();
                this.onSizeChange();
            }
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList0) {
        if(this.z != colorStateList0) {
            this.z = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int v) {
        this.setChipBackgroundColor(AppCompatResources.getColorStateList(this.f0, v));
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        if(this.B != f) {
            this.B = f;
            this.setShapeAppearanceModel(this.getShapeAppearanceModel().withCornerSize(f));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int v) {
        this.setChipCornerRadius(this.f0.getResources().getDimension(v));
    }

    public void setChipEndPadding(float f) {
        if(this.e0 != f) {
            this.e0 = f;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int v) {
        this.setChipEndPadding(this.f0.getResources().getDimension(v));
    }

    public void setChipIcon(@Nullable Drawable drawable0) {
        Drawable drawable1 = this.getChipIcon();
        if(drawable1 != drawable0) {
            float f = this.k();
            this.H = drawable0 == null ? null : drawable0.mutate();
            float f1 = this.k();
            ChipDrawable.s(drawable1);
            if(this.q()) {
                this.i(this.H);
            }
            this.invalidateSelf();
            if(f != f1) {
                this.onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        this.setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int v) {
        this.setChipIconVisible(v);
    }

    public void setChipIconResource(@DrawableRes int v) {
        this.setChipIcon(AppCompatResources.getDrawable(this.f0, v));
    }

    public void setChipIconSize(float f) {
        if(this.J != f) {
            float f1 = this.k();
            this.J = f;
            float f2 = this.k();
            this.invalidateSelf();
            if(f1 != f2) {
                this.onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(@DimenRes int v) {
        this.setChipIconSize(this.f0.getResources().getDimension(v));
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList0) {
        this.K = true;
        if(this.I != colorStateList0) {
            this.I = colorStateList0;
            if(this.q()) {
                DrawableCompat.setTintList(this.H, colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public void setChipIconTintResource(@ColorRes int v) {
        this.setChipIconTint(AppCompatResources.getColorStateList(this.f0, v));
    }

    public void setChipIconVisible(@BoolRes int v) {
        this.setChipIconVisible(this.f0.getResources().getBoolean(v));
    }

    public void setChipIconVisible(boolean z) {
        if(this.G != z) {
            boolean z1 = this.q();
            this.G = z;
            boolean z2 = this.q();
            if(z1 != z2) {
                if(z2) {
                    this.i(this.H);
                }
                else {
                    ChipDrawable.s(this.H);
                }
                this.invalidateSelf();
                this.onSizeChange();
            }
        }
    }

    public void setChipMinHeight(float f) {
        if(this.A != f) {
            this.A = f;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipMinHeightResource(@DimenRes int v) {
        this.setChipMinHeight(this.f0.getResources().getDimension(v));
    }

    public void setChipStartPadding(float f) {
        if(this.X != f) {
            this.X = f;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int v) {
        this.setChipStartPadding(this.f0.getResources().getDimension(v));
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList0) {
        if(this.C != colorStateList0) {
            this.C = colorStateList0;
            if(this.G0) {
                this.setStrokeColor(colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int v) {
        this.setChipStrokeColor(AppCompatResources.getColorStateList(this.f0, v));
    }

    public void setChipStrokeWidth(float f) {
        if(this.D != f) {
            this.D = f;
            this.g0.setStrokeWidth(f);
            if(this.G0) {
                super.setStrokeWidth(f);
            }
            this.invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int v) {
        this.setChipStrokeWidth(this.f0.getResources().getDimension(v));
    }

    public void setCloseIcon(@Nullable Drawable drawable0) {
        Drawable drawable1 = this.getCloseIcon();
        if(drawable1 != drawable0) {
            float f = this.l();
            this.M = drawable0 == null ? null : drawable0.mutate();
            if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.N = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.getRippleColor()), this.M, ChipDrawable.I0);
            }
            float f1 = this.l();
            ChipDrawable.s(drawable1);
            if(this.r()) {
                this.i(this.M);
            }
            this.invalidateSelf();
            if(f != f1) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence0) {
        if(this.Q != charSequence0) {
            this.Q = BidiFormatter.getInstance().unicodeWrap(charSequence0);
            this.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        this.setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int v) {
        this.setCloseIconVisible(v);
    }

    public void setCloseIconEndPadding(float f) {
        if(this.d0 != f) {
            this.d0 = f;
            this.invalidateSelf();
            if(this.r()) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int v) {
        this.setCloseIconEndPadding(this.f0.getResources().getDimension(v));
    }

    public void setCloseIconResource(@DrawableRes int v) {
        this.setCloseIcon(AppCompatResources.getDrawable(this.f0, v));
    }

    public void setCloseIconSize(float f) {
        if(this.P != f) {
            this.P = f;
            this.invalidateSelf();
            if(this.r()) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(@DimenRes int v) {
        this.setCloseIconSize(this.f0.getResources().getDimension(v));
    }

    public void setCloseIconStartPadding(float f) {
        if(this.c0 != f) {
            this.c0 = f;
            this.invalidateSelf();
            if(this.r()) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int v) {
        this.setCloseIconStartPadding(this.f0.getResources().getDimension(v));
    }

    public boolean setCloseIconState(@NonNull int[] arr_v) {
        if(!Arrays.equals(this.z0, arr_v)) {
            this.z0 = arr_v;
            return this.r() ? this.o(this.getState(), arr_v) : false;
        }
        return false;
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList0) {
        if(this.O != colorStateList0) {
            this.O = colorStateList0;
            if(this.r()) {
                DrawableCompat.setTintList(this.M, colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public void setCloseIconTintResource(@ColorRes int v) {
        this.setCloseIconTint(AppCompatResources.getColorStateList(this.f0, v));
    }

    public void setCloseIconVisible(@BoolRes int v) {
        this.setCloseIconVisible(this.f0.getResources().getBoolean(v));
    }

    public void setCloseIconVisible(boolean z) {
        if(this.L != z) {
            boolean z1 = this.r();
            this.L = z;
            boolean z2 = this.r();
            if(z1 != z2) {
                if(z2) {
                    this.i(this.M);
                }
                else {
                    ChipDrawable.s(this.M);
                }
                this.invalidateSelf();
                this.onSizeChange();
            }
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        if(this.v0 != colorFilter0) {
            this.v0 = colorFilter0;
            this.invalidateSelf();
        }
    }

    public void setDelegate(@Nullable Delegate chipDrawable$Delegate0) {
        this.C0 = new WeakReference(chipDrawable$Delegate0);
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.D0 = textUtils$TruncateAt0;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec0) {
        this.W = motionSpec0;
    }

    public void setHideMotionSpecResource(@AnimatorRes int v) {
        this.setHideMotionSpec(MotionSpec.createFromResource(this.f0, v));
    }

    public void setIconEndPadding(float f) {
        if(this.Z != f) {
            float f1 = this.k();
            this.Z = f;
            float f2 = this.k();
            this.invalidateSelf();
            if(f1 != f2) {
                this.onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(@DimenRes int v) {
        this.setIconEndPadding(this.f0.getResources().getDimension(v));
    }

    public void setIconStartPadding(float f) {
        if(this.Y != f) {
            float f1 = this.k();
            this.Y = f;
            float f2 = this.k();
            this.invalidateSelf();
            if(f1 != f2) {
                this.onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(@DimenRes int v) {
        this.setIconStartPadding(this.f0.getResources().getDimension(v));
    }

    public void setMaxWidth(@Px int v) {
        this.F0 = v;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        if(this.E != colorStateList0) {
            this.E = colorStateList0;
            this.B0 = this.A0 ? RippleUtils.sanitizeRippleDrawableColor(colorStateList0) : null;
            this.onStateChange(this.getState());
        }
    }

    public void setRippleColorResource(@ColorRes int v) {
        this.setRippleColor(AppCompatResources.getColorStateList(this.f0, v));
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec0) {
        this.V = motionSpec0;
    }

    public void setShowMotionSpecResource(@AnimatorRes int v) {
        this.setShowMotionSpec(MotionSpec.createFromResource(this.f0, v));
    }

    public void setText(@Nullable CharSequence charSequence0) {
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        if(!TextUtils.equals(this.F, charSequence0)) {
            this.F = charSequence0;
            this.l0.setTextWidthDirty(true);
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance0) {
        this.l0.setTextAppearance(textAppearance0, this.f0);
    }

    public void setTextAppearanceResource(@StyleRes int v) {
        this.setTextAppearance(new TextAppearance(this.f0, v));
    }

    public void setTextColor(@ColorInt int v) {
        this.setTextColor(ColorStateList.valueOf(v));
    }

    public void setTextColor(@Nullable ColorStateList colorStateList0) {
        TextAppearance textAppearance0 = this.getTextAppearance();
        if(textAppearance0 != null) {
            textAppearance0.setTextColor(colorStateList0);
            this.invalidateSelf();
        }
    }

    public void setTextEndPadding(float f) {
        if(this.b0 != f) {
            this.b0 = f;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int v) {
        this.setTextEndPadding(this.f0.getResources().getDimension(v));
    }

    public void setTextResource(@StringRes int v) {
        this.setText(this.f0.getResources().getString(v));
    }

    public void setTextSize(@Dimension float f) {
        TextAppearance textAppearance0 = this.getTextAppearance();
        if(textAppearance0 != null) {
            textAppearance0.setTextSize(f);
            this.l0.getTextPaint().setTextSize(f);
            this.onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f) {
        if(this.a0 != f) {
            this.a0 = f;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int v) {
        this.setTextStartPadding(this.f0.getResources().getDimension(v));
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList0) {
        if(this.x0 != colorStateList0) {
            this.x0 = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        if(this.y0 != porterDuff$Mode0) {
            this.y0 = porterDuff$Mode0;
            this.w0 = DrawableUtils.updateTintFilter(this, this.x0, porterDuff$Mode0);
            this.invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z) {
        if(this.A0 != z) {
            this.A0 = z;
            this.B0 = z ? RippleUtils.sanitizeRippleDrawableColor(this.E) : null;
            this.onStateChange(this.getState());
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        if(this.q()) {
            z2 |= this.H.setVisible(z, z1);
        }
        if(this.p()) {
            z2 |= this.T.setVisible(z, z1);
        }
        if(this.r()) {
            z2 |= this.M.setVisible(z, z1);
        }
        if(z2) {
            this.invalidateSelf();
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.unscheduleDrawable(this, runnable0);
        }
    }
}

