package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import u7.c;

public class ChipGroup extends FlowLayout {
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int v, int v1) {
            super(v, v1);
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
        }
    }

    @Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(@NonNull ChipGroup arg1, @IdRes int arg2);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(@NonNull ChipGroup arg1, @NonNull List arg2);
    }

    public int e;
    public int f;
    public OnCheckedStateChangeListener g;
    public final CheckableGroup h;
    public final int i;
    public final c j;
    public static final int k;

    static {
        ChipGroup.k = style.Widget_MaterialComponents_ChipGroup;
    }

    public ChipGroup(Context context0) {
        this(context0, null);
    }

    public ChipGroup(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.chipGroupStyle);
    }

    public ChipGroup(Context context0, AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, ChipGroup.k), attributeSet0, v);
        CheckableGroup checkableGroup0 = new CheckableGroup();
        this.h = checkableGroup0;
        c c0 = new c(this);
        this.j = c0;
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(this.getContext(), attributeSet0, styleable.ChipGroup, v, ChipGroup.k, new int[0]);
        int v1 = typedArray0.getDimensionPixelOffset(styleable.ChipGroup_chipSpacing, 0);
        this.setChipSpacingHorizontal(typedArray0.getDimensionPixelOffset(styleable.ChipGroup_chipSpacingHorizontal, v1));
        this.setChipSpacingVertical(typedArray0.getDimensionPixelOffset(styleable.ChipGroup_chipSpacingVertical, v1));
        this.setSingleLine(typedArray0.getBoolean(styleable.ChipGroup_singleLine, false));
        this.setSingleSelection(typedArray0.getBoolean(styleable.ChipGroup_singleSelection, false));
        this.setSelectionRequired(typedArray0.getBoolean(styleable.ChipGroup_selectionRequired, false));
        this.i = typedArray0.getResourceId(styleable.ChipGroup_checkedChip, -1);
        typedArray0.recycle();
        checkableGroup0.setOnCheckedStateChangeListener(new a(this));
        super.setOnHierarchyChangeListener(c0);
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public void check(@IdRes int v) {
        this.h.check(v);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return super.checkLayoutParams(viewGroup$LayoutParams0) && viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    public void clearCheck() {
        this.h.clearCheck();
    }

    @Override  // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override  // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.h.getSingleCheckedId();
    }

    @NonNull
    public List getCheckedChipIds() {
        return this.h.getCheckedIdsSortedByChildOrder(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.e;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f;
    }

    private int getVisibleChipCount() {
        int v1 = 0;
        for(int v = 0; v < this.getChildCount(); ++v) {
            if(this.getChildAt(v) instanceof Chip && this.getChildAt(v).getVisibility() == 0) {
                ++v1;
            }
        }
        return v1;
    }

    public boolean isSelectionRequired() {
        return this.h.isSelectionRequired();
    }

    @Override  // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.h.isSingleSelection();
    }

    @Override  // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int v = this.i;
        if(v != -1) {
            this.h.check(v);
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0).setCollectionInfo(CollectionInfoCompat.obtain(this.getRowCount(), (this.isSingleLine() ? this.getVisibleChipCount() : -1), false, (this.isSingleSelection() ? 1 : 2)));
    }

    public void setChipSpacing(@Dimension int v) {
        this.setChipSpacingHorizontal(v);
        this.setChipSpacingVertical(v);
    }

    public void setChipSpacingHorizontal(@Dimension int v) {
        if(this.e != v) {
            this.e = v;
            this.setItemSpacing(v);
            this.requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int v) {
        this.setChipSpacingHorizontal(this.getResources().getDimensionPixelOffset(v));
    }

    public void setChipSpacingResource(@DimenRes int v) {
        this.setChipSpacing(this.getResources().getDimensionPixelOffset(v));
    }

    public void setChipSpacingVertical(@Dimension int v) {
        if(this.f != v) {
            this.f = v;
            this.setLineSpacing(v);
            this.requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int v) {
        this.setChipSpacingVertical(this.getResources().getDimensionPixelOffset(v));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable0) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable0) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int v) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener chipGroup$OnCheckedChangeListener0) {
        if(chipGroup$OnCheckedChangeListener0 == null) {
            this.setOnCheckedStateChangeListener(null);
            return;
        }
        this.setOnCheckedStateChangeListener(new b(this, chipGroup$OnCheckedChangeListener0));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener chipGroup$OnCheckedStateChangeListener0) {
        this.g = chipGroup$OnCheckedStateChangeListener0;
    }

    @Override  // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0) {
        this.j.a = viewGroup$OnHierarchyChangeListener0;
    }

    public void setSelectionRequired(boolean z) {
        this.h.setSelectionRequired(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int v) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int v) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@BoolRes int v) {
        this.setSingleLine(this.getResources().getBoolean(v));
    }

    @Override  // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(@BoolRes int v) {
        this.setSingleSelection(this.getResources().getBoolean(v));
    }

    public void setSingleSelection(boolean z) {
        this.h.setSingleSelection(z);
    }
}

