package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout.LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import y7.f;

public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem arg1);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        @Nullable
        public Bundle menuState;

        static {
            SavedState.CREATOR = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(@NonNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.menuState = parcel0.readBundle(classLoader0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeBundle(this.menuState);
        }
    }

    public final NavigationMenu h;
    public final NavigationMenuPresenter i;
    public OnNavigationItemSelectedListener j;
    public final int k;
    public final int[] l;
    public SupportMenuInflater m;
    public final androidx.appcompat.view.menu.c n;
    public boolean o;
    public boolean p;
    public final int q;
    public final ShapeableDelegate r;
    public final MaterialSideContainerBackHelper s;
    public final MaterialBackOrchestrator t;
    public final f u;
    public static final int[] v;
    public static final int[] w;
    public static final int x;

    static {
        NavigationView.v = new int[]{0x10100A0};
        NavigationView.w = new int[]{0xFEFEFF62};
        NavigationView.x = style.Widget_Design_NavigationView;
    }

    public NavigationView(@NonNull Context context0) {
        this(context0, null);
    }

    public NavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.navigationViewStyle);
    }

    public NavigationView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        int v1 = NavigationView.x;
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        NavigationMenuPresenter navigationMenuPresenter0 = new NavigationMenuPresenter();
        this.i = navigationMenuPresenter0;
        this.l = new int[2];
        this.o = true;
        this.p = true;
        this.q = 0;
        this.r = ShapeableDelegate.create(this);
        this.s = new MaterialSideContainerBackHelper(this);
        this.t = new MaterialBackOrchestrator(this);
        this.u = new f(this);
        Context context1 = this.getContext();
        NavigationMenu navigationMenu0 = new NavigationMenu(context1);
        this.h = navigationMenu0;
        TintTypedArray tintTypedArray0 = ThemeEnforcement.obtainTintedStyledAttributes(context1, attributeSet0, styleable.NavigationView, v, v1, new int[0]);
        if(tintTypedArray0.hasValue(styleable.NavigationView_android_background)) {
            ViewCompat.setBackground(this, tintTypedArray0.getDrawable(styleable.NavigationView_android_background));
        }
        this.q = tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_drawerLayoutCornerSize, 0);
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
        if(tintTypedArray0.hasValue(styleable.NavigationView_elevation)) {
            this.setElevation(((float)tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_elevation, 0)));
        }
        this.setFitsSystemWindows(tintTypedArray0.getBoolean(styleable.NavigationView_android_fitsSystemWindows, false));
        this.k = tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateList1 = tintTypedArray0.hasValue(styleable.NavigationView_subheaderColor) ? tintTypedArray0.getColorStateList(styleable.NavigationView_subheaderColor) : null;
        int v2 = tintTypedArray0.hasValue(styleable.NavigationView_subheaderTextAppearance) ? tintTypedArray0.getResourceId(styleable.NavigationView_subheaderTextAppearance, 0) : 0;
        if(v2 == 0 && colorStateList1 == null) {
            colorStateList1 = this.b(0x1010038);
        }
        ColorStateList colorStateList2 = tintTypedArray0.hasValue(styleable.NavigationView_itemIconTint) ? tintTypedArray0.getColorStateList(styleable.NavigationView_itemIconTint) : this.b(0x1010038);
        int v3 = tintTypedArray0.hasValue(styleable.NavigationView_itemTextAppearance) ? tintTypedArray0.getResourceId(styleable.NavigationView_itemTextAppearance, 0) : 0;
        boolean z = tintTypedArray0.getBoolean(styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if(tintTypedArray0.hasValue(styleable.NavigationView_itemIconSize)) {
            this.setItemIconSize(tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateList3 = tintTypedArray0.hasValue(styleable.NavigationView_itemTextColor) ? tintTypedArray0.getColorStateList(styleable.NavigationView_itemTextColor) : null;
        if(v3 == 0 && colorStateList3 == null) {
            colorStateList3 = this.b(0x1010036);
        }
        Drawable drawable1 = tintTypedArray0.getDrawable(styleable.NavigationView_itemBackground);
        if(drawable1 == null && (tintTypedArray0.hasValue(styleable.NavigationView_itemShapeAppearance) || tintTypedArray0.hasValue(styleable.NavigationView_itemShapeAppearanceOverlay))) {
            drawable1 = this.c(tintTypedArray0, MaterialResources.getColorStateList(this.getContext(), tintTypedArray0, styleable.NavigationView_itemShapeFillColor));
            ColorStateList colorStateList4 = MaterialResources.getColorStateList(context1, tintTypedArray0, styleable.NavigationView_itemRippleColor);
            if(colorStateList4 != null) {
                InsetDrawable insetDrawable0 = this.c(tintTypedArray0, null);
                navigationMenuPresenter0.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList4), null, insetDrawable0));
            }
        }
        if(tintTypedArray0.hasValue(styleable.NavigationView_itemHorizontalPadding)) {
            this.setItemHorizontalPadding(tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_itemHorizontalPadding, 0));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationView_itemVerticalPadding)) {
            this.setItemVerticalPadding(tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_itemVerticalPadding, 0));
        }
        this.setDividerInsetStart(tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_dividerInsetStart, 0));
        this.setDividerInsetEnd(tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_dividerInsetEnd, 0));
        this.setSubheaderInsetStart(tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_subheaderInsetStart, 0));
        this.setSubheaderInsetEnd(tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_subheaderInsetEnd, 0));
        this.setTopInsetScrimEnabled(tintTypedArray0.getBoolean(styleable.NavigationView_topInsetScrimEnabled, this.o));
        this.setBottomInsetScrimEnabled(tintTypedArray0.getBoolean(styleable.NavigationView_bottomInsetScrimEnabled, this.p));
        int v4 = tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_itemIconPadding, 0);
        this.setItemMaxLines(tintTypedArray0.getInt(styleable.NavigationView_itemMaxLines, 1));
        navigationMenu0.setCallback(new b(this));
        navigationMenuPresenter0.setId(1);
        navigationMenuPresenter0.initForMenu(context1, navigationMenu0);
        if(v2 != 0) {
            navigationMenuPresenter0.setSubheaderTextAppearance(v2);
        }
        navigationMenuPresenter0.setSubheaderColor(colorStateList1);
        navigationMenuPresenter0.setItemIconTintList(colorStateList2);
        navigationMenuPresenter0.setOverScrollMode(this.getOverScrollMode());
        if(v3 != 0) {
            navigationMenuPresenter0.setItemTextAppearance(v3);
        }
        navigationMenuPresenter0.setItemTextAppearanceActiveBoldEnabled(z);
        navigationMenuPresenter0.setItemTextColor(colorStateList3);
        navigationMenuPresenter0.setItemBackground(drawable1);
        navigationMenuPresenter0.setItemIconPadding(v4);
        navigationMenu0.addMenuPresenter(navigationMenuPresenter0);
        this.addView(((View)navigationMenuPresenter0.getMenuView(this)));
        if(tintTypedArray0.hasValue(styleable.NavigationView_menu)) {
            this.inflateMenu(tintTypedArray0.getResourceId(styleable.NavigationView_menu, 0));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationView_headerLayout)) {
            this.inflateHeaderView(tintTypedArray0.getResourceId(styleable.NavigationView_headerLayout, 0));
        }
        tintTypedArray0.recycle();
        this.n = new androidx.appcompat.view.menu.c(this, 4);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.n);
    }

    public void addHeaderView(@NonNull View view0) {
        this.i.addHeaderView(view0);
    }

    public final ColorStateList b(int v) {
        TypedValue typedValue0 = new TypedValue();
        if(!this.getContext().getTheme().resolveAttribute(v, typedValue0, true)) {
            return null;
        }
        ColorStateList colorStateList0 = AppCompatResources.getColorStateList(this.getContext(), typedValue0.resourceId);
        if(!this.getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue0, true)) {
            return null;
        }
        int v1 = typedValue0.data;
        int v2 = colorStateList0.getDefaultColor();
        return new ColorStateList(new int[][]{NavigationView.w, NavigationView.v, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList0.getColorForState(NavigationView.w, v2), v1, v2});
    }

    public final InsetDrawable c(TintTypedArray tintTypedArray0, ColorStateList colorStateList0) {
        int v = tintTypedArray0.getResourceId(styleable.NavigationView_itemShapeAppearance, 0);
        int v1 = tintTypedArray0.getResourceId(styleable.NavigationView_itemShapeAppearanceOverlay, 0);
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(ShapeAppearanceModel.builder(this.getContext(), v, v1).build());
        materialShapeDrawable0.setFillColor(colorStateList0);
        return new InsetDrawable(materialShapeDrawable0, tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray0.getDimensionPixelSize(styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        this.d();
        this.s.cancelBackProgress();
    }

    public final Pair d() {
        ViewParent viewParent0 = this.getParent();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(!(viewParent0 instanceof DrawerLayout) || !(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        }
        return new Pair(((DrawerLayout)viewParent0), ((LayoutParams)viewGroup$LayoutParams0));
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(@NonNull Canvas canvas0) {
        sc.b b0 = new sc.b(this, 5);
        this.r.maybeClip(canvas0, b0);
    }

    @VisibleForTesting
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.s;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.i.getCheckedItem();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.i.getDividerInsetEnd();
    }

    @Px
    public int getDividerInsetStart() {
        return this.i.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.i.getHeaderCount();
    }

    public View getHeaderView(int v) {
        return this.i.getHeaderView(v);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.i.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.i.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.i.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.i.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.i.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.i.getItemTextColor();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.i.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.h;
    }

    private MenuInflater getMenuInflater() {
        if(this.m == null) {
            this.m = new SupportMenuInflater(this.getContext());
        }
        return this.m;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.i.getSubheaderInsetEnd();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.i.getSubheaderInsetStart();
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair pair0 = this.d();
        DrawerLayout drawerLayout0 = (DrawerLayout)pair0.first;
        MaterialSideContainerBackHelper materialSideContainerBackHelper0 = this.s;
        BackEventCompat backEventCompat0 = materialSideContainerBackHelper0.onHandleBackInvoked();
        if(backEventCompat0 != null && Build.VERSION.SDK_INT >= 34) {
            materialSideContainerBackHelper0.finishBackProgress(backEventCompat0, ((LayoutParams)pair0.second).gravity, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout0, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout0));
            return;
        }
        drawerLayout0.closeDrawer(this);
    }

    public View inflateHeaderView(@LayoutRes int v) {
        return this.i.inflateHeaderView(v);
    }

    public void inflateMenu(int v) {
        this.i.setUpdateSuspended(true);
        this.getMenuInflater().inflate(v, this.h);
        this.i.setUpdateSuspended(false);
        this.i.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.p;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.o;
    }

    @Override  // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof DrawerLayout) {
            MaterialBackOrchestrator materialBackOrchestrator0 = this.t;
            if(materialBackOrchestrator0.shouldListenForBackCallbacks()) {
                ((DrawerLayout)viewParent0).removeDrawerListener(this.u);
                ((DrawerLayout)viewParent0).addDrawerListener(this.u);
                if(((DrawerLayout)viewParent0).isDrawerOpen(this)) {
                    materialBackOrchestrator0.startListeningForBackCallbacksWithPriorityOverlay();
                }
            }
        }
    }

    @Override  // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.n);
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof DrawerLayout) {
            ((DrawerLayout)viewParent0).removeDrawerListener(this.u);
        }
    }

    @Override  // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onInsetsChanged(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        this.i.dispatchApplyWindowInsets(windowInsetsCompat0);
    }

    @Override  // android.widget.FrameLayout
    public void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = this.k;
        switch(v2) {
            case 0x80000000: {
                v = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), v3), 0x40000000);
                break;
            }
            case 0: {
                v = View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
            }
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.h.restorePresenterStates(((SavedState)parcelable0).menuState);
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        Bundle bundle0 = new Bundle();
        parcelable0.menuState = bundle0;
        this.h.savePresenterStates(bundle0);
        return parcelable0;
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(this.getParent() instanceof DrawerLayout && this.getLayoutParams() instanceof LayoutParams) {
            int v4 = this.q;
            if(v4 > 0 && this.getBackground() instanceof MaterialShapeDrawable) {
                boolean z = GravityCompat.getAbsoluteGravity(((LayoutParams)this.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this)) == 3;
                MaterialShapeDrawable materialShapeDrawable0 = (MaterialShapeDrawable)this.getBackground();
                Builder shapeAppearanceModel$Builder0 = materialShapeDrawable0.getShapeAppearanceModel().toBuilder().setAllCornerSizes(((float)v4));
                if(z) {
                    shapeAppearanceModel$Builder0.setTopLeftCornerSize(0.0f);
                    shapeAppearanceModel$Builder0.setBottomLeftCornerSize(0.0f);
                }
                else {
                    shapeAppearanceModel$Builder0.setTopRightCornerSize(0.0f);
                    shapeAppearanceModel$Builder0.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModel0 = shapeAppearanceModel$Builder0.build();
                materialShapeDrawable0.setShapeAppearanceModel(shapeAppearanceModel0);
                this.r.onShapeAppearanceChanged(this, shapeAppearanceModel0);
                RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
                this.r.onMaskChanged(this, rectF0);
                this.r.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    public void removeHeaderView(@NonNull View view0) {
        this.i.removeHeaderView(view0);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.p = z;
    }

    public void setCheckedItem(@IdRes int v) {
        MenuItem menuItem0 = this.h.findItem(v);
        if(menuItem0 != null) {
            this.i.setCheckedItem(((MenuItemImpl)menuItem0));
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        MenuItem menuItem1 = this.h.findItem(v);
        if(menuItem1 == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.i.setCheckedItem(((MenuItemImpl)menuItem1));
    }

    public void setDividerInsetEnd(@Px int v) {
        this.i.setDividerInsetEnd(v);
    }

    public void setDividerInsetStart(@Px int v) {
        this.i.setDividerInsetStart(v);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z) {
        this.r.setForceCompatClippingEnabled(this, z);
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        this.i.setItemBackground(drawable0);
    }

    public void setItemBackgroundResource(@DrawableRes int v) {
        this.setItemBackground(ContextCompat.getDrawable(this.getContext(), v));
    }

    public void setItemHorizontalPadding(@Dimension int v) {
        this.i.setItemHorizontalPadding(v);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.i.setItemHorizontalPadding(v1);
    }

    public void setItemIconPadding(@Dimension int v) {
        this.i.setItemIconPadding(v);
    }

    public void setItemIconPaddingResource(int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.i.setItemIconPadding(v1);
    }

    public void setItemIconSize(@Dimension int v) {
        this.i.setItemIconSize(v);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList0) {
        this.i.setItemIconTintList(colorStateList0);
    }

    public void setItemMaxLines(int v) {
        this.i.setItemMaxLines(v);
    }

    public void setItemTextAppearance(@StyleRes int v) {
        this.i.setItemTextAppearance(v);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.i.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList0) {
        this.i.setItemTextColor(colorStateList0);
    }

    public void setItemVerticalPadding(@Px int v) {
        this.i.setItemVerticalPadding(v);
    }

    public void setItemVerticalPaddingResource(@DimenRes int v) {
        int v1 = this.getResources().getDimensionPixelSize(v);
        this.i.setItemVerticalPadding(v1);
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener navigationView$OnNavigationItemSelectedListener0) {
        this.j = navigationView$OnNavigationItemSelectedListener0;
    }

    @Override  // android.view.View
    public void setOverScrollMode(int v) {
        super.setOverScrollMode(v);
        NavigationMenuPresenter navigationMenuPresenter0 = this.i;
        if(navigationMenuPresenter0 != null) {
            navigationMenuPresenter0.setOverScrollMode(v);
        }
    }

    public void setSubheaderInsetEnd(@Px int v) {
        this.i.setSubheaderInsetEnd(v);
    }

    public void setSubheaderInsetStart(@Px int v) {
        this.i.setSubheaderInsetStart(v);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.o = z;
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat0) {
        this.d();
        this.s.startBackProgress(backEventCompat0);
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat0) {
        Pair pair0 = this.d();
        this.s.updateBackProgress(backEventCompat0, ((LayoutParams)pair0.second).gravity);
    }
}

