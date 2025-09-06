package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.drawable;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;

@RestrictTo({Scope.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements ItemView {
    public MenuItemImpl A;
    public ColorStateList B;
    public boolean C;
    public Drawable D;
    public final b E;
    public static final int[] F;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final CheckedTextView y;
    public FrameLayout z;

    static {
        NavigationMenuItemView.F = new int[]{0x10100A0};
    }

    public NavigationMenuItemView(@NonNull Context context0) {
        this(context0, null);
    }

    public NavigationMenuItemView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public NavigationMenuItemView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.x = true;
        b b0 = new b(this, 1);
        this.E = b0;
        this.setOrientation(0);
        LayoutInflater.from(context0).inflate(layout.design_navigation_menu_item, this, true);
        this.setIconSize(context0.getResources().getDimensionPixelSize(dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView0 = (CheckedTextView)this.findViewById(id.design_menu_item_text);
        this.y = checkedTextView0;
        checkedTextView0.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(checkedTextView0, b0);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public MenuItemImpl getItemData() {
        return this.A;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl0, int v) {
        StateListDrawable stateListDrawable0;
        this.A = menuItemImpl0;
        if(menuItemImpl0.getItemId() > 0) {
            this.setId(menuItemImpl0.getItemId());
        }
        this.setVisibility((menuItemImpl0.isVisible() ? 0 : 8));
        if(this.getBackground() == null) {
            TypedValue typedValue0 = new TypedValue();
            if(this.getContext().getTheme().resolveAttribute(attr.colorControlHighlight, typedValue0, true)) {
                stateListDrawable0 = new StateListDrawable();
                ColorDrawable colorDrawable0 = new ColorDrawable(typedValue0.data);
                stateListDrawable0.addState(NavigationMenuItemView.F, colorDrawable0);
                stateListDrawable0.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            }
            else {
                stateListDrawable0 = null;
            }
            ViewCompat.setBackground(this, stateListDrawable0);
        }
        this.setCheckable(menuItemImpl0.isCheckable());
        this.setChecked(menuItemImpl0.isChecked());
        this.setEnabled(menuItemImpl0.isEnabled());
        this.setTitle(menuItemImpl0.getTitle());
        this.setIcon(menuItemImpl0.getIcon());
        this.setActionView(menuItemImpl0.getActionView());
        this.setContentDescription(menuItemImpl0.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl0.getTooltipText());
        CheckedTextView checkedTextView0 = this.y;
        if(this.A.getTitle() != null || this.A.getIcon() != null || this.A.getActionView() == null) {
            checkedTextView0.setVisibility(0);
            FrameLayout frameLayout1 = this.z;
            if(frameLayout1 != null) {
                LayoutParams linearLayoutCompat$LayoutParams1 = (LayoutParams)frameLayout1.getLayoutParams();
                linearLayoutCompat$LayoutParams1.width = -2;
                this.z.setLayoutParams(linearLayoutCompat$LayoutParams1);
            }
        }
        else {
            checkedTextView0.setVisibility(8);
            FrameLayout frameLayout0 = this.z;
            if(frameLayout0 != null) {
                LayoutParams linearLayoutCompat$LayoutParams0 = (LayoutParams)frameLayout0.getLayoutParams();
                linearLayoutCompat$LayoutParams0.width = -1;
                this.z.setLayoutParams(linearLayoutCompat$LayoutParams0);
            }
        }
    }

    public void initialize(@NonNull MenuItemImpl menuItemImpl0, boolean z) {
        this.x = z;
        this.initialize(menuItemImpl0, 0);
    }

    @Override  // android.view.ViewGroup
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.A != null && this.A.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(arr_v, NavigationMenuItemView.F);
        }
        return arr_v;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout0 = this.z;
        if(frameLayout0 != null) {
            frameLayout0.removeAllViews();
        }
        this.y.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(@Nullable View view0) {
        if(view0 != null) {
            if(this.z == null) {
                this.z = (FrameLayout)((ViewStub)this.findViewById(id.design_menu_item_action_area_stub)).inflate();
            }
            this.z.removeAllViews();
            this.z.addView(view0);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setCheckable(boolean z) {
        this.refreshDrawableState();
        if(this.w != z) {
            this.w = z;
            this.E.sendAccessibilityEvent(this.y, 0x800);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setChecked(boolean z) {
        this.refreshDrawableState();
        this.y.setChecked(z);
        Typeface typeface0 = this.y.getTypeface();
        this.y.setTypeface(typeface0, (!z || !this.x ? 0 : 1));
    }

    public void setHorizontalPadding(int v) {
        this.setPadding(v, this.getPaddingTop(), v, this.getPaddingBottom());
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setIcon(@Nullable Drawable drawable0) {
        if(drawable0 != null) {
            if(this.C) {
                Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                if(drawable$ConstantState0 != null) {
                    drawable0 = drawable$ConstantState0.newDrawable();
                }
                drawable0 = drawable0.mutate();
                DrawableCompat.setTintList(drawable0, this.B);
            }
            drawable0.setBounds(0, 0, this.u, this.u);
        }
        else if(this.v) {
            if(this.D == null) {
                Drawable drawable1 = ResourcesCompat.getDrawable(this.getResources(), drawable.navigation_empty_icon, this.getContext().getTheme());
                this.D = drawable1;
                if(drawable1 != null) {
                    drawable1.setBounds(0, 0, this.u, this.u);
                }
            }
            drawable0 = this.D;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.y, drawable0, null, null, null);
    }

    public void setIconPadding(int v) {
        this.y.setCompoundDrawablePadding(v);
    }

    public void setIconSize(@Dimension int v) {
        this.u = v;
    }

    public void setIconTintList(ColorStateList colorStateList0) {
        this.B = colorStateList0;
        this.C = colorStateList0 != null;
        MenuItemImpl menuItemImpl0 = this.A;
        if(menuItemImpl0 != null) {
            this.setIcon(menuItemImpl0.getIcon());
        }
    }

    public void setMaxLines(int v) {
        this.y.setMaxLines(v);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.v = z;
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int v) {
        TextViewCompat.setTextAppearance(this.y, v);
    }

    public void setTextColor(ColorStateList colorStateList0) {
        this.y.setTextColor(colorStateList0);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setTitle(CharSequence charSequence0) {
        this.y.setText(charSequence0);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean showsIcon() {
        return true;
    }
}

