package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialToolbar extends Toolbar {
    public Integer d0;
    public boolean e0;
    public boolean f0;
    public ImageView.ScaleType g0;
    public Boolean h0;
    public static final int i0;
    public static final ImageView.ScaleType[] j0;

    static {
        MaterialToolbar.i0 = style.Widget_MaterialComponents_Toolbar;
        MaterialToolbar.j0 = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public MaterialToolbar(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialToolbar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.toolbarStyle);
    }

    public MaterialToolbar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, MaterialToolbar.i0), attributeSet0, v);
        Context context1 = this.getContext();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.MaterialToolbar, v, MaterialToolbar.i0, new int[0]);
        if(typedArray0.hasValue(styleable.MaterialToolbar_navigationIconTint)) {
            this.setNavigationIconTint(typedArray0.getColor(styleable.MaterialToolbar_navigationIconTint, -1));
        }
        this.e0 = typedArray0.getBoolean(styleable.MaterialToolbar_titleCentered, false);
        this.f0 = typedArray0.getBoolean(styleable.MaterialToolbar_subtitleCentered, false);
        int v1 = typedArray0.getInt(styleable.MaterialToolbar_logoScaleType, -1);
        if(v1 >= 0) {
            ImageView.ScaleType[] arr_imageView$ScaleType = MaterialToolbar.j0;
            if(v1 < arr_imageView$ScaleType.length) {
                this.g0 = arr_imageView$ScaleType[v1];
            }
        }
        if(typedArray0.hasValue(styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.h0 = Boolean.valueOf(typedArray0.getBoolean(styleable.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArray0.recycle();
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = drawable0 == null ? ColorStateList.valueOf(0) : DrawableUtils.getColorStateListOrNull(drawable0);
        if(colorStateList0 != null) {
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
            materialShapeDrawable0.setFillColor(colorStateList0);
            materialShapeDrawable0.initializeElevationOverlay(context1);
            materialShapeDrawable0.setElevation(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable0);
        }
    }

    public void clearNavigationIconTint() {
        this.d0 = null;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            DrawableCompat.setTintList(DrawableCompat.wrap(drawable0.mutate()), null);
            this.setNavigationIcon(drawable0);
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.g0;
    }

    @ColorInt
    @Nullable
    public Integer getNavigationIconTint() {
        return this.d0;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int v) {
        Menu menu0 = this.getMenu();
        if(menu0 instanceof MenuBuilder) {
            ((MenuBuilder)menu0).stopDispatchingItemsChanged();
        }
        super.inflateMenu(v);
        if(menu0 instanceof MenuBuilder) {
            ((MenuBuilder)menu0).startDispatchingItemsChanged();
        }
    }

    public boolean isLogoAdjustViewBounds() {
        return this.h0 != null && this.h0.booleanValue();
    }

    public boolean isSubtitleCentered() {
        return this.f0;
    }

    public boolean isTitleCentered() {
        return this.e0;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.e0 || this.f0) {
            TextView textView0 = ToolbarUtils.getTitleTextView(this);
            TextView textView1 = ToolbarUtils.getSubtitleTextView(this);
            if(textView0 != null || textView1 != null) {
                int v4 = this.getMeasuredWidth();
                int v5 = this.getPaddingLeft();
                int v6 = v4 - this.getPaddingRight();
                for(int v7 = 0; v7 < this.getChildCount(); ++v7) {
                    View view0 = this.getChildAt(v7);
                    if(view0.getVisibility() != 8 && view0 != textView0 && view0 != textView1) {
                        if(view0.getRight() < v4 / 2 && view0.getRight() > v5) {
                            v5 = view0.getRight();
                        }
                        if(view0.getLeft() > v4 / 2 && view0.getLeft() < v6) {
                            v6 = view0.getLeft();
                        }
                    }
                }
                Pair pair0 = new Pair(v5, v6);
                if(this.e0 && textView0 != null) {
                    this.r(textView0, pair0);
                }
                if(this.f0 && textView1 != null) {
                    this.r(textView1, pair0);
                }
            }
        }
        ImageView imageView0 = ToolbarUtils.getLogoImageView(this);
        if(imageView0 != null) {
            Boolean boolean0 = this.h0;
            if(boolean0 != null) {
                imageView0.setAdjustViewBounds(boolean0.booleanValue());
            }
            ImageView.ScaleType imageView$ScaleType0 = this.g0;
            if(imageView$ScaleType0 != null) {
                imageView0.setScaleType(imageView$ScaleType0);
            }
        }
    }

    public final void r(TextView textView0, Pair pair0) {
        int v = this.getMeasuredWidth();
        int v1 = textView0.getMeasuredWidth();
        int v2 = v / 2 - v1 / 2;
        int v3 = v1 + v2;
        int v4 = Math.max(Math.max(((int)(((Integer)pair0.first))) - v2, 0), Math.max(v3 - ((int)(((Integer)pair0.second))), 0));
        if(v4 > 0) {
            v2 += v4;
            v3 -= v4;
            textView0.measure(View.MeasureSpec.makeMeasureSpec(v3 - v2, 0x40000000), textView0.getMeasuredHeightAndState());
        }
        textView0.layout(v2, textView0.getTop(), v3, textView0.getBottom());
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        if(this.h0 == null || this.h0.booleanValue() != z) {
            this.h0 = Boolean.valueOf(z);
            this.requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        if(this.g0 != imageView$ScaleType0) {
            this.g0 = imageView$ScaleType0;
            this.requestLayout();
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable0) {
        if(drawable0 != null && this.d0 != null) {
            drawable0 = DrawableCompat.wrap(drawable0.mutate());
            DrawableCompat.setTint(drawable0, ((int)this.d0));
        }
        super.setNavigationIcon(drawable0);
    }

    public void setNavigationIconTint(@ColorInt int v) {
        this.d0 = v;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if(this.f0 != z) {
            this.f0 = z;
            this.requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if(this.e0 != z) {
            this.e0 = z;
            this.requestLayout();
        }
    }
}

