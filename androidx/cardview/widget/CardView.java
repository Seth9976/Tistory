package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.cardview.R.attr;
import androidx.cardview.R.color;
import androidx.cardview.R.style;
import androidx.cardview.R.styleable;

public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public final Rect e;
    public final Rect f;
    public final a g;
    public static final int[] h;
    public static final b i;

    static {
        CardView.h = new int[]{0x1010031};
        CardView.i = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public CardView(@NonNull Context context0) {
        this(context0, null);
    }

    public CardView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.cardViewStyle);
    }

    public CardView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ColorStateList colorStateList0;
        Rect rect0 = new Rect();
        this.e = rect0;
        this.f = new Rect();
        a a0 = new a(this);
        this.g = a0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.CardView, v, style.CardView);
        if(typedArray0.hasValue(styleable.CardView_cardBackgroundColor)) {
            colorStateList0 = typedArray0.getColorStateList(styleable.CardView_cardBackgroundColor);
        }
        else {
            TypedArray typedArray1 = this.getContext().obtainStyledAttributes(CardView.h);
            int v1 = typedArray1.getColor(0, 0);
            typedArray1.recycle();
            float[] arr_f = new float[3];
            Color.colorToHSV(v1, arr_f);
            colorStateList0 = ColorStateList.valueOf((arr_f[2] > 0.5f ? this.getResources().getColor(color.cardview_light_background) : this.getResources().getColor(color.cardview_dark_background)));
        }
        float f = typedArray0.getDimension(styleable.CardView_cardCornerRadius, 0.0f);
        float f1 = typedArray0.getDimension(styleable.CardView_cardElevation, 0.0f);
        float f2 = typedArray0.getDimension(styleable.CardView_cardMaxElevation, 0.0f);
        this.a = typedArray0.getBoolean(styleable.CardView_cardUseCompatPadding, false);
        this.b = typedArray0.getBoolean(styleable.CardView_cardPreventCornerOverlap, true);
        int v2 = typedArray0.getDimensionPixelSize(styleable.CardView_contentPadding, 0);
        rect0.left = typedArray0.getDimensionPixelSize(styleable.CardView_contentPaddingLeft, v2);
        rect0.top = typedArray0.getDimensionPixelSize(styleable.CardView_contentPaddingTop, v2);
        rect0.right = typedArray0.getDimensionPixelSize(styleable.CardView_contentPaddingRight, v2);
        rect0.bottom = typedArray0.getDimensionPixelSize(styleable.CardView_contentPaddingBottom, v2);
        this.c = typedArray0.getDimensionPixelSize(styleable.CardView_android_minWidth, 0);
        this.d = typedArray0.getDimensionPixelSize(styleable.CardView_android_minHeight, 0);
        typedArray0.recycle();
        CardView.i.initialize(a0, context0, colorStateList0, f, f1, (f1 > f2 ? f1 : f2));
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return CardView.i.getBackgroundColor(this.g);
    }

    public float getCardElevation() {
        return CardView.i.getElevation(this.g);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.e.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.e.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return CardView.i.getMaxElevation(this.g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return CardView.i.getRadius(this.g);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override  // android.widget.FrameLayout
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
    }

    public void setCardBackgroundColor(@ColorInt int v) {
        ColorStateList colorStateList0 = ColorStateList.valueOf(v);
        CardView.i.setBackgroundColor(this.g, colorStateList0);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList0) {
        CardView.i.setBackgroundColor(this.g, colorStateList0);
    }

    public void setCardElevation(float f) {
        CardView.i.setElevation(this.g, f);
    }

    public void setContentPadding(@Px int v, @Px int v1, @Px int v2, @Px int v3) {
        this.e.set(v, v1, v2, v3);
        CardView.i.updatePadding(this.g);
    }

    public void setMaxCardElevation(float f) {
        CardView.i.setMaxElevation(this.g, f);
    }

    @Override  // android.view.View
    public void setMinimumHeight(int v) {
        this.d = v;
        super.setMinimumHeight(v);
    }

    @Override  // android.view.View
    public void setMinimumWidth(int v) {
        this.c = v;
        super.setMinimumWidth(v);
    }

    @Override  // android.view.View
    public void setPadding(int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public void setPaddingRelative(int v, int v1, int v2, int v3) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if(z != this.b) {
            this.b = z;
            CardView.i.onPreventCornerOverlapChanged(this.g);
        }
    }

    public void setRadius(float f) {
        CardView.i.setRadius(this.g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if(this.a != z) {
            this.a = z;
            CardView.i.onCompatPaddingChanged(this.g);
        }
    }
}

