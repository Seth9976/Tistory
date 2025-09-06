package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.p2;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;

@RestrictTo({Scope.LIBRARY_GROUP})
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableDelegate {
    public final Paint.FontMetrics A;
    public final TextDrawableHelper B;
    public final p2 C;
    public final Rect D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public float N;
    public static final int O;
    public static final int P;
    public CharSequence y;
    public final Context z;

    static {
        TooltipDrawable.O = style.Widget_MaterialComponents_Tooltip;
        TooltipDrawable.P = attr.tooltipStyle;
    }

    public TooltipDrawable(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.A = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper0 = new TextDrawableHelper(this);
        this.B = textDrawableHelper0;
        this.C = new p2(this, 1);
        this.D = new Rect();
        this.K = 1.0f;
        this.L = 1.0f;
        this.M = 0.5f;
        this.N = 1.0f;
        this.z = context0;
        textDrawableHelper0.getTextPaint().density = context0.getResources().getDisplayMetrics().density;
        textDrawableHelper0.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    @NonNull
    public static TooltipDrawable create(@NonNull Context context0) {
        return TooltipDrawable.createFromAttributes(context0, null, TooltipDrawable.P, TooltipDrawable.O);
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        return TooltipDrawable.createFromAttributes(context0, attributeSet0, TooltipDrawable.P, TooltipDrawable.O);
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        TooltipDrawable tooltipDrawable0 = new TooltipDrawable(context0, attributeSet0, v, v1);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(tooltipDrawable0.z, attributeSet0, styleable.Tooltip, v, v1, new int[0]);
        Context context1 = tooltipDrawable0.z;
        tooltipDrawable0.I = context1.getResources().getDimensionPixelSize(dimen.mtrl_tooltip_arrowSize);
        tooltipDrawable0.setShapeAppearanceModel(tooltipDrawable0.getShapeAppearanceModel().toBuilder().setBottomEdge(tooltipDrawable0.j()).build());
        tooltipDrawable0.setText(typedArray0.getText(styleable.Tooltip_android_text));
        TextAppearance textAppearance0 = MaterialResources.getTextAppearance(context1, typedArray0, styleable.Tooltip_android_textAppearance);
        if(textAppearance0 != null && typedArray0.hasValue(styleable.Tooltip_android_textColor)) {
            textAppearance0.setTextColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.Tooltip_android_textColor));
        }
        tooltipDrawable0.setTextAppearance(textAppearance0);
        int v2 = MaterialColors.getColor(context1, attr.colorOnBackground, TooltipDrawable.class.getCanonicalName());
        int v3 = MaterialColors.layer(ColorUtils.setAlphaComponent(MaterialColors.getColor(context1, 0x1010031, TooltipDrawable.class.getCanonicalName()), 0xE5), ColorUtils.setAlphaComponent(v2, 0x99));
        tooltipDrawable0.setFillColor(ColorStateList.valueOf(typedArray0.getColor(styleable.Tooltip_backgroundTint, v3)));
        tooltipDrawable0.setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(context1, attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        tooltipDrawable0.E = typedArray0.getDimensionPixelSize(styleable.Tooltip_android_padding, 0);
        tooltipDrawable0.F = typedArray0.getDimensionPixelSize(styleable.Tooltip_android_minWidth, 0);
        tooltipDrawable0.G = typedArray0.getDimensionPixelSize(styleable.Tooltip_android_minHeight, 0);
        tooltipDrawable0.H = typedArray0.getDimensionPixelSize(styleable.Tooltip_android_layout_margin, 0);
        typedArray0.recycle();
        return tooltipDrawable0;
    }

    public void detachView(@Nullable View view0) {
        if(view0 == null) {
            return;
        }
        view0.removeOnLayoutChangeListener(this.C);
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public void draw(@NonNull Canvas canvas0) {
        canvas0.save();
        float f = this.i();
        float f1 = (float)(-(1.414214 * ((double)this.I) - ((double)this.I)));
        float f2 = this.K;
        float f3 = this.L;
        float f4 = (float)this.getBounds().left;
        float f5 = ((float)this.getBounds().width()) * 0.5f + f4;
        float f6 = (float)this.getBounds().top;
        canvas0.scale(f2, f3, f5, ((float)this.getBounds().height()) * this.M + f6);
        canvas0.translate(f, f1);
        super.draw(canvas0);
        if(this.y != null) {
            Rect rect0 = this.getBounds();
            float f7 = (float)rect0.centerY();
            TextDrawableHelper textDrawableHelper0 = this.B;
            textDrawableHelper0.getTextPaint().getFontMetrics(this.A);
            int v = (int)(f7 - (this.A.descent + this.A.ascent) / 2.0f);
            if(textDrawableHelper0.getTextAppearance() != null) {
                textDrawableHelper0.getTextPaint().drawableState = this.getState();
                textDrawableHelper0.updateTextPaintDrawState(this.z);
                textDrawableHelper0.getTextPaint().setAlpha(((int)(this.N * 255.0f)));
            }
            canvas0.drawText(this.y, 0, this.y.length(), ((float)rect0.centerX()), ((float)v), textDrawableHelper0.getTextPaint());
        }
        canvas0.restore();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int)Math.max(this.B.getTextPaint().getTextSize(), this.G);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f = (float)(this.E * 2);
        return this.y == null ? ((int)Math.max(f + 0.0f, this.F)) : ((int)Math.max(f + this.B.getTextWidth(this.y.toString()), this.F));
    }

    public int getLayoutMargin() {
        return this.H;
    }

    public int getMinHeight() {
        return this.G;
    }

    public int getMinWidth() {
        return this.F;
    }

    @Nullable
    public CharSequence getText() {
        return this.y;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.B.getTextAppearance();
    }

    public int getTextPadding() {
        return this.E;
    }

    public final float i() {
        Rect rect0 = this.D;
        if(rect0.right - this.getBounds().right - this.J - this.H < 0) {
            return (float)(rect0.right - this.getBounds().right - this.J - this.H);
        }
        return rect0.left - this.getBounds().left - this.J + this.H <= 0 ? 0.0f : ((float)(rect0.left - this.getBounds().left - this.J + this.H));
    }

    public final OffsetEdgeTreatment j() {
        float f = this.i();
        float f1 = ((float)(((double)this.getBounds().width()) - 1.414214 * ((double)this.I))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(((float)this.I)), Math.min(Math.max(-f, -f1), f1));
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable
    public void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.setShapeAppearanceModel(this.getShapeAppearanceModel().toBuilder().setBottomEdge(this.j()).build());
    }

    @Override  // com.google.android.material.shape.MaterialShapeDrawable, com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate
    public boolean onStateChange(int[] arr_v) {
        return super.onStateChange(arr_v);
    }

    @Override  // com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate
    public void onTextSizeChange() {
        this.invalidateSelf();
    }

    public void setLayoutMargin(@Px int v) {
        this.H = v;
        this.invalidateSelf();
    }

    public void setMinHeight(@Px int v) {
        this.G = v;
        this.invalidateSelf();
    }

    public void setMinWidth(@Px int v) {
        this.F = v;
        this.invalidateSelf();
    }

    public void setRelativeToView(@Nullable View view0) {
        if(view0 == null) {
            return;
        }
        int[] arr_v = new int[2];
        view0.getLocationOnScreen(arr_v);
        this.J = arr_v[0];
        view0.getWindowVisibleDisplayFrame(this.D);
        view0.addOnLayoutChangeListener(this.C);
    }

    public void setRevealFraction(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.M = 1.2f;
        this.K = f;
        this.L = f;
        this.N = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f);
        this.invalidateSelf();
    }

    public void setText(@Nullable CharSequence charSequence0) {
        if(!TextUtils.equals(this.y, charSequence0)) {
            this.y = charSequence0;
            this.B.setTextWidthDirty(true);
            this.invalidateSelf();
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance0) {
        this.B.setTextAppearance(textAppearance0, this.z);
    }

    public void setTextAppearanceResource(@StyleRes int v) {
        this.setTextAppearance(new TextAppearance(this.z, v));
    }

    public void setTextPadding(@Px int v) {
        this.E = v;
        this.invalidateSelf();
    }

    public void setTextResource(@StringRes int v) {
        this.setText(this.z.getResources().getString(v));
    }
}

