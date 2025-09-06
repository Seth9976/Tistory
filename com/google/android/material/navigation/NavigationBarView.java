package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import y7.e;

public abstract class NavigationBarView extends FrameLayout {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem arg1);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem arg1);
    }

    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    public final NavigationBarMenu a;
    public final NavigationBarMenuView b;
    public final NavigationBarPresenter c;
    public SupportMenuInflater d;
    public OnItemSelectedListener e;
    public OnItemReselectedListener f;

    public NavigationBarView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        NavigationBarPresenter navigationBarPresenter0 = new NavigationBarPresenter();
        this.c = navigationBarPresenter0;
        Context context1 = this.getContext();
        TintTypedArray tintTypedArray0 = ThemeEnforcement.obtainTintedStyledAttributes(context1, attributeSet0, styleable.NavigationBarView, v, v1, new int[]{styleable.NavigationBarView_itemTextAppearanceInactive, styleable.NavigationBarView_itemTextAppearanceActive});
        NavigationBarMenu navigationBarMenu0 = new NavigationBarMenu(context1, this.getClass(), this.getMaxItemCount());
        this.a = navigationBarMenu0;
        NavigationBarMenuView navigationBarMenuView0 = this.createNavigationBarMenuView(context1);
        this.b = navigationBarMenuView0;
        navigationBarPresenter0.setMenuView(navigationBarMenuView0);
        navigationBarPresenter0.setId(1);
        navigationBarMenuView0.setPresenter(navigationBarPresenter0);
        navigationBarMenu0.addMenuPresenter(navigationBarPresenter0);
        navigationBarPresenter0.initForMenu(this.getContext(), navigationBarMenu0);
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_itemIconTint)) {
            navigationBarMenuView0.setIconTintList(tintTypedArray0.getColorStateList(styleable.NavigationBarView_itemIconTint));
        }
        else {
            navigationBarMenuView0.setIconTintList(navigationBarMenuView0.createDefaultColorStateList(0x1010038));
        }
        this.setItemIconSize(tintTypedArray0.getDimensionPixelSize(styleable.NavigationBarView_itemIconSize, this.getResources().getDimensionPixelSize(dimen.mtrl_navigation_bar_item_default_icon_size)));
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_itemTextAppearanceInactive)) {
            this.setItemTextAppearanceInactive(tintTypedArray0.getResourceId(styleable.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_itemTextAppearanceActive)) {
            this.setItemTextAppearanceActive(tintTypedArray0.getResourceId(styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        this.setItemTextAppearanceActiveBoldEnabled(tintTypedArray0.getBoolean(styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_itemTextColor)) {
            this.setItemTextColor(tintTypedArray0.getColorStateList(styleable.NavigationBarView_itemTextColor));
        }
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = DrawableUtils.getColorStateListOrNull(drawable0);
        if(drawable0 == null || colorStateList0 != null) {
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context1, attributeSet0, v, v1).build());
            if(colorStateList0 != null) {
                materialShapeDrawable0.setFillColor(colorStateList0);
            }
            materialShapeDrawable0.initializeElevationOverlay(context1);
            ViewCompat.setBackground(this, materialShapeDrawable0);
        }
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_itemPaddingTop)) {
            this.setItemPaddingTop(tintTypedArray0.getDimensionPixelSize(styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_itemPaddingBottom)) {
            this.setItemPaddingBottom(tintTypedArray0.getDimensionPixelSize(styleable.NavigationBarView_itemPaddingBottom, 0));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_activeIndicatorLabelPadding)) {
            this.setActiveIndicatorLabelPadding(tintTypedArray0.getDimensionPixelSize(styleable.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_elevation)) {
            this.setElevation(((float)tintTypedArray0.getDimensionPixelSize(styleable.NavigationBarView_elevation, 0)));
        }
        ColorStateList colorStateList1 = MaterialResources.getColorStateList(context1, tintTypedArray0, styleable.NavigationBarView_backgroundTint);
        DrawableCompat.setTintList(this.getBackground().mutate(), colorStateList1);
        this.setLabelVisibilityMode(tintTypedArray0.getInteger(styleable.NavigationBarView_labelVisibilityMode, -1));
        int v2 = tintTypedArray0.getResourceId(styleable.NavigationBarView_itemBackground, 0);
        if(v2 == 0) {
            this.setItemRippleColor(MaterialResources.getColorStateList(context1, tintTypedArray0, styleable.NavigationBarView_itemRippleColor));
        }
        else {
            navigationBarMenuView0.setItemBackgroundRes(v2);
        }
        int v3 = tintTypedArray0.getResourceId(styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if(v3 != 0) {
            this.setItemActiveIndicatorEnabled(true);
            TypedArray typedArray0 = context1.obtainStyledAttributes(v3, styleable.NavigationBarActiveIndicator);
            this.setItemActiveIndicatorWidth(typedArray0.getDimensionPixelSize(styleable.NavigationBarActiveIndicator_android_width, 0));
            this.setItemActiveIndicatorHeight(typedArray0.getDimensionPixelSize(styleable.NavigationBarActiveIndicator_android_height, 0));
            this.setItemActiveIndicatorMarginHorizontal(typedArray0.getDimensionPixelOffset(styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            this.setItemActiveIndicatorColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.NavigationBarActiveIndicator_android_color));
            this.setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context1, typedArray0.getResourceId(styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            typedArray0.recycle();
        }
        if(tintTypedArray0.hasValue(styleable.NavigationBarView_menu)) {
            this.inflateMenu(tintTypedArray0.getResourceId(styleable.NavigationBarView_menu, 0));
        }
        tintTypedArray0.recycle();
        this.addView(navigationBarMenuView0);
        navigationBarMenu0.setCallback(new a(this));
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public abstract NavigationBarMenuView createNavigationBarMenuView(@NonNull Context arg1);

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.b.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public BadgeDrawable getBadge(int v) {
        return this.b.getBadge(v);
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.b.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.b.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.b.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.b.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.b.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.b.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.b.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.b.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.b.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.b.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.b.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.b.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.b.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.b.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.a;
    }

    private MenuInflater getMenuInflater() {
        if(this.d == null) {
            this.d = new SupportMenuInflater(this.getContext());
        }
        return this.d;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.b;
    }

    @NonNull
    public BadgeDrawable getOrCreateBadge(int v) {
        NavigationBarMenuView navigationBarMenuView0 = this.b;
        navigationBarMenuView0.getClass();
        NavigationBarMenuView.b(v);
        SparseArray sparseArray0 = navigationBarMenuView0.s;
        BadgeDrawable badgeDrawable0 = (BadgeDrawable)sparseArray0.get(v);
        if(badgeDrawable0 == null) {
            badgeDrawable0 = BadgeDrawable.create(navigationBarMenuView0.getContext());
            sparseArray0.put(v, badgeDrawable0);
        }
        NavigationBarItemView navigationBarItemView0 = navigationBarMenuView0.findItemView(v);
        if(navigationBarItemView0 != null) {
            navigationBarItemView0.setBadge(badgeDrawable0);
        }
        return badgeDrawable0;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.c;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.b.getSelectedItemId();
    }

    public void inflateMenu(int v) {
        this.c.setUpdateSuspended(true);
        this.getMenuInflater().inflate(v, this.a);
        this.c.setUpdateSuspended(false);
        this.c.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.b.getItemActiveIndicatorEnabled();
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        if(!(parcelable0 instanceof e)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((e)parcelable0).getSuperState());
        this.a.restorePresenterStates(((e)parcelable0).b);
    }

    @Override  // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new e(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        Bundle bundle0 = new Bundle();
        parcelable0.b = bundle0;
        this.a.savePresenterStates(bundle0);
        return parcelable0;
    }

    public void removeBadge(int v) {
        NavigationBarMenuView navigationBarMenuView0 = this.b;
        navigationBarMenuView0.getClass();
        NavigationBarMenuView.b(v);
        NavigationBarItemView navigationBarItemView0 = navigationBarMenuView0.findItemView(v);
        if(navigationBarItemView0 != null && navigationBarItemView0.F != null) {
            ImageView imageView0 = navigationBarItemView0.n;
            if(imageView0 != null) {
                navigationBarItemView0.setClipChildren(true);
                navigationBarItemView0.setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(navigationBarItemView0.F, imageView0);
            }
            navigationBarItemView0.F = null;
        }
        navigationBarMenuView0.s.put(v, null);
    }

    public void setActiveIndicatorLabelPadding(@Px int v) {
        this.b.setActiveIndicatorLabelPadding(v);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList0) {
        this.b.setItemActiveIndicatorColor(colorStateList0);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.b.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@Px int v) {
        this.b.setItemActiveIndicatorHeight(v);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int v) {
        this.b.setItemActiveIndicatorMarginHorizontal(v);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel0) {
        this.b.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel0);
    }

    public void setItemActiveIndicatorWidth(@Px int v) {
        this.b.setItemActiveIndicatorWidth(v);
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        this.b.setItemBackground(drawable0);
    }

    public void setItemBackgroundResource(@DrawableRes int v) {
        this.b.setItemBackgroundRes(v);
    }

    public void setItemIconSize(@Dimension int v) {
        this.b.setItemIconSize(v);
    }

    public void setItemIconSizeRes(@DimenRes int v) {
        this.setItemIconSize(this.getResources().getDimensionPixelSize(v));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList0) {
        this.b.setIconTintList(colorStateList0);
    }

    public void setItemOnTouchListener(int v, @Nullable View.OnTouchListener view$OnTouchListener0) {
        this.b.setItemOnTouchListener(v, view$OnTouchListener0);
    }

    public void setItemPaddingBottom(@Px int v) {
        this.b.setItemPaddingBottom(v);
    }

    public void setItemPaddingTop(@Px int v) {
        this.b.setItemPaddingTop(v);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList0) {
        this.b.setItemRippleColor(colorStateList0);
    }

    public void setItemTextAppearanceActive(@StyleRes int v) {
        this.b.setItemTextAppearanceActive(v);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.b.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(@StyleRes int v) {
        this.b.setItemTextAppearanceInactive(v);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList0) {
        this.b.setItemTextColor(colorStateList0);
    }

    public void setLabelVisibilityMode(int v) {
        NavigationBarMenuView navigationBarMenuView0 = this.b;
        if(navigationBarMenuView0.getLabelVisibilityMode() != v) {
            navigationBarMenuView0.setLabelVisibilityMode(v);
            this.c.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener navigationBarView$OnItemReselectedListener0) {
        this.f = navigationBarView$OnItemReselectedListener0;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener navigationBarView$OnItemSelectedListener0) {
        this.e = navigationBarView$OnItemSelectedListener0;
    }

    public void setSelectedItemId(@IdRes int v) {
        MenuItem menuItem0 = this.a.findItem(v);
        if(menuItem0 != null && !this.a.performItemAction(menuItem0, this.c, 0)) {
            menuItem0.setChecked(true);
        }
    }
}

