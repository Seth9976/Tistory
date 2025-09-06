package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

public class MaterialDividerItemDecoration extends ItemDecoration {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public Drawable m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final Rect t;
    public static final int u;

    static {
        MaterialDividerItemDecoration.u = style.Widget_MaterialComponents_MaterialDivider;
    }

    public MaterialDividerItemDecoration(@NonNull Context context0, int v) {
        this(context0, null, v);
    }

    public MaterialDividerItemDecoration(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, attr.materialDividerStyle, v);
    }

    public MaterialDividerItemDecoration(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        this.t = new Rect();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context0, attributeSet0, styleable.MaterialDivider, v, MaterialDividerItemDecoration.u, new int[0]);
        this.o = MaterialResources.getColorStateList(context0, typedArray0, styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.n = typedArray0.getDimensionPixelSize(styleable.MaterialDivider_dividerThickness, context0.getResources().getDimensionPixelSize(dimen.material_divider_thickness));
        this.q = typedArray0.getDimensionPixelOffset(styleable.MaterialDivider_dividerInsetStart, 0);
        this.r = typedArray0.getDimensionPixelOffset(styleable.MaterialDivider_dividerInsetEnd, 0);
        this.s = typedArray0.getBoolean(styleable.MaterialDivider_lastItemDecorated, true);
        typedArray0.recycle();
        this.m = new ShapeDrawable();
        this.setDividerColor(this.o);
        this.setOrientation(v1);
    }

    public final boolean a(RecyclerView recyclerView0, View view0) {
        int v = recyclerView0.getChildAdapterPosition(view0);
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        return v != -1 && (recyclerView$Adapter0 == null || v != recyclerView$Adapter0.getItemCount() - 1 || this.s);
    }

    @ColorInt
    public int getDividerColor() {
        return this.o;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.r;
    }

    @Px
    public int getDividerInsetStart() {
        return this.q;
    }

    @Px
    public int getDividerThickness() {
        return this.n;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void getItemOffsets(@NonNull Rect rect0, @NonNull View view0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        rect0.set(0, 0, 0, 0);
        if(this.a(recyclerView0, view0)) {
            if(this.p == 1) {
                rect0.bottom = this.n;
                return;
            }
            if(ViewUtils.isLayoutRtl(recyclerView0)) {
                rect0.left = this.n;
                return;
            }
            rect0.right = this.n;
        }
    }

    public int getOrientation() {
        return this.p;
    }

    public boolean isLastItemDecorated() {
        return this.s;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void onDraw(@NonNull Canvas canvas0, @NonNull RecyclerView recyclerView0, @NonNull State recyclerView$State0) {
        int v15;
        int v14;
        int v9;
        int v8;
        int v2;
        int v1;
        if(recyclerView0.getLayoutManager() == null) {
            return;
        }
        Rect rect0 = this.t;
        int v = 0;
        if(this.p == 1) {
            canvas0.save();
            if(recyclerView0.getClipToPadding()) {
                v1 = recyclerView0.getPaddingLeft();
                v2 = recyclerView0.getWidth() - recyclerView0.getPaddingRight();
                canvas0.clipRect(v1, recyclerView0.getPaddingTop(), v2, recyclerView0.getHeight() - recyclerView0.getPaddingBottom());
            }
            else {
                v2 = recyclerView0.getWidth();
                v1 = 0;
            }
            boolean z = ViewUtils.isLayoutRtl(recyclerView0);
            int v3 = z ? this.r : this.q;
            int v4 = z ? this.q : this.r;
            int v5 = recyclerView0.getChildCount();
            while(v < v5) {
                View view0 = recyclerView0.getChildAt(v);
                if(this.a(recyclerView0, view0)) {
                    recyclerView0.getLayoutManager().getDecoratedBoundsWithMargins(view0, rect0);
                    int v6 = rect0.bottom;
                    int v7 = Math.round(view0.getTranslationY());
                    this.m.setBounds(v1 + v3, v7 + v6 - this.n, v2 - v4, v7 + v6);
                    this.m.draw(canvas0);
                }
                ++v;
            }
            canvas0.restore();
            return;
        }
        canvas0.save();
        if(recyclerView0.getClipToPadding()) {
            v8 = recyclerView0.getPaddingTop();
            v9 = recyclerView0.getHeight() - recyclerView0.getPaddingBottom();
            canvas0.clipRect(recyclerView0.getPaddingLeft(), v8, recyclerView0.getWidth() - recyclerView0.getPaddingRight(), v9);
        }
        else {
            v9 = recyclerView0.getHeight();
            v8 = 0;
        }
        int v10 = v8 + this.q;
        int v11 = v9 - this.r;
        boolean z1 = ViewUtils.isLayoutRtl(recyclerView0);
        int v12 = recyclerView0.getChildCount();
        while(v < v12) {
            View view1 = recyclerView0.getChildAt(v);
            if(this.a(recyclerView0, view1)) {
                recyclerView0.getLayoutManager().getDecoratedBoundsWithMargins(view1, rect0);
                int v13 = Math.round(view1.getTranslationX());
                if(z1) {
                    v14 = rect0.left + v13;
                    v15 = this.n + v14;
                }
                else {
                    v15 = v13 + rect0.right;
                    v14 = v15 - this.n;
                }
                this.m.setBounds(v14, v10, v15, v11);
                this.m.draw(canvas0);
            }
            ++v;
        }
        canvas0.restore();
    }

    public void setDividerColor(@ColorInt int v) {
        this.o = v;
        Drawable drawable0 = this.m;
        this.m = drawable0;
        DrawableCompat.setTint(drawable0, v);
    }

    public void setDividerColorResource(@NonNull Context context0, @ColorRes int v) {
        this.setDividerColor(ContextCompat.getColor(context0, v));
    }

    public void setDividerInsetEnd(@Px int v) {
        this.r = v;
    }

    public void setDividerInsetEndResource(@NonNull Context context0, @DimenRes int v) {
        this.setDividerInsetEnd(context0.getResources().getDimensionPixelOffset(v));
    }

    public void setDividerInsetStart(@Px int v) {
        this.q = v;
    }

    public void setDividerInsetStartResource(@NonNull Context context0, @DimenRes int v) {
        this.setDividerInsetStart(context0.getResources().getDimensionPixelOffset(v));
    }

    public void setDividerThickness(@Px int v) {
        this.n = v;
    }

    public void setDividerThicknessResource(@NonNull Context context0, @DimenRes int v) {
        this.setDividerThickness(context0.getResources().getDimensionPixelSize(v));
    }

    public void setLastItemDecorated(boolean z) {
        this.s = z;
    }

    public void setOrientation(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + v + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.p = v;
    }

    public boolean shouldDrawDivider(int v, @Nullable Adapter recyclerView$Adapter0) [...] // Inlined contents
}

