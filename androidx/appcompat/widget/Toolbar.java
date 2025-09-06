package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;

public class Toolbar extends ViewGroup implements MenuHost {
    public static class LayoutParams extends androidx.appcompat.app.ActionBar.LayoutParams {
        public int a;

        public LayoutParams(int v) {
            this(-2, -1, v);
        }

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = 0;
            this.gravity = 0x800013;
        }

        public LayoutParams(int v, int v1, int v2) {
            super(v, v1);
            this.a = 0;
            this.gravity = v2;
        }

        public LayoutParams(@NonNull Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.a = 0;
            this.leftMargin = viewGroup$MarginLayoutParams0.leftMargin;
            this.topMargin = viewGroup$MarginLayoutParams0.topMargin;
            this.rightMargin = viewGroup$MarginLayoutParams0.rightMargin;
            this.bottomMargin = viewGroup$MarginLayoutParams0.bottomMargin;
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams actionBar$LayoutParams0) {
            super(actionBar$LayoutParams0);
            this.a = 0;
        }

        public LayoutParams(LayoutParams toolbar$LayoutParams0) {
            super(toolbar$LayoutParams0);
            this.a = toolbar$LayoutParams0.a;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem arg1);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public int b;
        public boolean c;

        static {
            SavedState.CREATOR = new m3();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0) {
            this(parcel0, null);
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.b = parcel0.readInt();
            this.c = parcel0.readInt() != 0;
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.b);
            parcel0.writeInt(((int)this.c));
        }
    }

    public int A;
    public int B;
    public final int C;
    public CharSequence D;
    public CharSequence E;
    public ColorStateList F;
    public ColorStateList G;
    public boolean H;
    public boolean I;
    public final ArrayList J;
    public final ArrayList K;
    public final int[] L;
    public final MenuHostHelper M;
    public ArrayList N;
    public OnMenuItemClickListener O;
    public final h3 P;
    public ToolbarWidgetWrapper Q;
    public o R;
    public l3 S;
    public Callback T;
    public androidx.appcompat.view.menu.MenuBuilder.Callback U;
    public boolean V;
    public OnBackInvokedCallback W;
    public OnBackInvokedDispatcher a0;
    public boolean b0;
    public final a c0;
    public ActionMenuView g;
    public AppCompatTextView h;
    public AppCompatTextView i;
    public AppCompatImageButton j;
    public AppCompatImageView k;
    public final Drawable l;
    public final CharSequence m;
    public AppCompatImageButton n;
    public View o;
    public Context p;
    public int q;
    public int r;
    public int s;
    public final int t;
    public final int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public i2 z;

    public Toolbar(@NonNull Context context0) {
        this(context0, null);
    }

    public Toolbar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.toolbarStyle);
    }

    public Toolbar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.C = 0x800013;
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new int[2];
        this.M = new MenuHostHelper(new g3(this, 1));
        this.N = new ArrayList();
        this.P = new h3(this);
        this.c0 = new a(this, 2);
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(this.getContext(), attributeSet0, styleable.Toolbar, v, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context0, styleable.Toolbar, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        this.r = tintTypedArray0.getResourceId(styleable.Toolbar_titleTextAppearance, 0);
        this.s = tintTypedArray0.getResourceId(styleable.Toolbar_subtitleTextAppearance, 0);
        this.C = tintTypedArray0.getInteger(styleable.Toolbar_android_gravity, 0x800013);
        this.t = tintTypedArray0.getInteger(styleable.Toolbar_buttonGravity, 0x30);
        int v1 = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_titleMargin, 0);
        if(tintTypedArray0.hasValue(styleable.Toolbar_titleMargins)) {
            v1 = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_titleMargins, v1);
        }
        this.y = v1;
        this.x = v1;
        this.w = v1;
        this.v = v1;
        int v2 = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_titleMarginStart, -1);
        if(v2 >= 0) {
            this.v = v2;
        }
        int v3 = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_titleMarginEnd, -1);
        if(v3 >= 0) {
            this.w = v3;
        }
        int v4 = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_titleMarginTop, -1);
        if(v4 >= 0) {
            this.x = v4;
        }
        int v5 = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_titleMarginBottom, -1);
        if(v5 >= 0) {
            this.y = v5;
        }
        this.u = tintTypedArray0.getDimensionPixelSize(styleable.Toolbar_maxButtonHeight, -1);
        int v6 = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_contentInsetStart, 0x80000000);
        int v7 = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_contentInsetEnd, 0x80000000);
        int v8 = tintTypedArray0.getDimensionPixelSize(styleable.Toolbar_contentInsetLeft, 0);
        int v9 = tintTypedArray0.getDimensionPixelSize(styleable.Toolbar_contentInsetRight, 0);
        this.d();
        i2 i20 = this.z;
        i20.h = false;
        if(v8 != 0x80000000) {
            i20.e = v8;
            i20.a = v8;
        }
        if(v9 != 0x80000000) {
            i20.f = v9;
            i20.b = v9;
        }
        if(v6 != 0x80000000 || v7 != 0x80000000) {
            i20.a(v6, v7);
        }
        this.A = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_contentInsetStartWithNavigation, 0x80000000);
        this.B = tintTypedArray0.getDimensionPixelOffset(styleable.Toolbar_contentInsetEndWithActions, 0x80000000);
        this.l = tintTypedArray0.getDrawable(styleable.Toolbar_collapseIcon);
        this.m = tintTypedArray0.getText(styleable.Toolbar_collapseContentDescription);
        CharSequence charSequence0 = tintTypedArray0.getText(styleable.Toolbar_title);
        if(!TextUtils.isEmpty(charSequence0)) {
            this.setTitle(charSequence0);
        }
        CharSequence charSequence1 = tintTypedArray0.getText(styleable.Toolbar_subtitle);
        if(!TextUtils.isEmpty(charSequence1)) {
            this.setSubtitle(charSequence1);
        }
        this.p = this.getContext();
        this.setPopupTheme(tintTypedArray0.getResourceId(styleable.Toolbar_popupTheme, 0));
        Drawable drawable0 = tintTypedArray0.getDrawable(styleable.Toolbar_navigationIcon);
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
        CharSequence charSequence2 = tintTypedArray0.getText(styleable.Toolbar_navigationContentDescription);
        if(!TextUtils.isEmpty(charSequence2)) {
            this.setNavigationContentDescription(charSequence2);
        }
        Drawable drawable1 = tintTypedArray0.getDrawable(styleable.Toolbar_logo);
        if(drawable1 != null) {
            this.setLogo(drawable1);
        }
        CharSequence charSequence3 = tintTypedArray0.getText(styleable.Toolbar_logoDescription);
        if(!TextUtils.isEmpty(charSequence3)) {
            this.setLogoDescription(charSequence3);
        }
        if(tintTypedArray0.hasValue(styleable.Toolbar_titleTextColor)) {
            this.setTitleTextColor(tintTypedArray0.getColorStateList(styleable.Toolbar_titleTextColor));
        }
        if(tintTypedArray0.hasValue(styleable.Toolbar_subtitleTextColor)) {
            this.setSubtitleTextColor(tintTypedArray0.getColorStateList(styleable.Toolbar_subtitleTextColor));
        }
        if(tintTypedArray0.hasValue(styleable.Toolbar_menu)) {
            this.inflateMenu(tintTypedArray0.getResourceId(styleable.Toolbar_menu, 0));
        }
        tintTypedArray0.recycle();
    }

    public final void a(ArrayList arrayList0, int v) {
        boolean z = ViewCompat.getLayoutDirection(this) == 1;
        int v2 = this.getChildCount();
        int v3 = GravityCompat.getAbsoluteGravity(v, ViewCompat.getLayoutDirection(this));
        arrayList0.clear();
        if(z) {
            for(int v4 = v2 - 1; v4 >= 0; --v4) {
                View view0 = this.getChildAt(v4);
                LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(toolbar$LayoutParams0.a == 0 && this.p(view0)) {
                    int v5 = toolbar$LayoutParams0.gravity;
                    int v6 = ViewCompat.getLayoutDirection(this);
                    int v7 = GravityCompat.getAbsoluteGravity(v5, v6) & 7;
                    if(v7 != 1 && v7 != 3 && v7 != 5) {
                        v7 = v6 == 1 ? 5 : 3;
                    }
                    if(v7 == v3) {
                        arrayList0.add(view0);
                    }
                }
            }
            return;
        }
        for(int v1 = 0; v1 < v2; ++v1) {
            View view1 = this.getChildAt(v1);
            LayoutParams toolbar$LayoutParams1 = (LayoutParams)view1.getLayoutParams();
            if(toolbar$LayoutParams1.a == 0 && this.p(view1)) {
                int v8 = toolbar$LayoutParams1.gravity;
                int v9 = ViewCompat.getLayoutDirection(this);
                int v10 = GravityCompat.getAbsoluteGravity(v8, v9) & 7;
                if(v10 != 1 && v10 != 3 && v10 != 5) {
                    v10 = v9 == 1 ? 5 : 3;
                }
                if(v10 == v3) {
                    arrayList0.add(view1);
                }
            }
        }
    }

    @Override  // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider0) {
        this.M.addMenuProvider(menuProvider0);
    }

    @Override  // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider0, @NonNull LifecycleOwner lifecycleOwner0) {
        this.M.addMenuProvider(menuProvider0, lifecycleOwner0);
    }

    @Override  // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider0, @NonNull LifecycleOwner lifecycleOwner0, @NonNull State lifecycle$State0) {
        this.M.addMenuProvider(menuProvider0, lifecycleOwner0, lifecycle$State0);
    }

    public final void b(View view0, boolean z) {
        LayoutParams toolbar$LayoutParams0;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            toolbar$LayoutParams0 = this.generateDefaultLayoutParams();
        }
        else {
            toolbar$LayoutParams0 = this.checkLayoutParams(viewGroup$LayoutParams0) ? ((LayoutParams)viewGroup$LayoutParams0) : this.generateLayoutParams(viewGroup$LayoutParams0);
        }
        toolbar$LayoutParams0.a = 1;
        if(z && this.o != null) {
            view0.setLayoutParams(toolbar$LayoutParams0);
            this.K.add(view0);
            return;
        }
        this.addView(view0, toolbar$LayoutParams0);
    }

    public final void c() {
        if(this.n == null) {
            AppCompatImageButton appCompatImageButton0 = new AppCompatImageButton(this.getContext(), null, attr.toolbarNavigationButtonStyle);
            this.n = appCompatImageButton0;
            appCompatImageButton0.setImageDrawable(this.l);
            this.n.setContentDescription(this.m);
            LayoutParams toolbar$LayoutParams0 = this.generateDefaultLayoutParams();
            toolbar$LayoutParams0.gravity = this.t & 0x70 | 0x800003;
            toolbar$LayoutParams0.a = 2;
            this.n.setLayoutParams(toolbar$LayoutParams0);
            this.n.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                MenuItemImpl menuItemImpl0 = this.S == null ? null : this.S.b;
                if(menuItemImpl0 != null) {
                    menuItemImpl0.collapseActionView();
                }
            });
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        return this.getVisibility() == 0 && (this.g != null && this.g.isOverflowReserved());
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return super.checkLayoutParams(viewGroup$LayoutParams0) && viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    // 检测为 Lambda 实现
    public void collapseActionView() [...]

    public final void d() {
        if(this.z == null) {
            i2 i20 = new i2();  // 初始化器: Ljava/lang/Object;-><init>()V
            i20.a = 0;
            i20.b = 0;
            i20.c = 0x80000000;
            i20.d = 0x80000000;
            i20.e = 0;
            i20.f = 0;
            i20.g = false;
            i20.h = false;
            this.z = i20;
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView0 = this.g;
        if(actionMenuView0 != null) {
            actionMenuView0.dismissPopupMenus();
        }
    }

    public final void e() {
        this.f();
        if(this.g.peekMenu() == null) {
            MenuBuilder menuBuilder0 = (MenuBuilder)this.g.getMenu();
            if(this.S == null) {
                this.S = new l3(this);
            }
            this.g.setExpandedActionViewsExclusive(true);
            menuBuilder0.addMenuPresenter(this.S, this.p);
            this.q();
        }
    }

    public final void f() {
        if(this.g == null) {
            ActionMenuView actionMenuView0 = new ActionMenuView(this.getContext());
            this.g = actionMenuView0;
            actionMenuView0.setPopupTheme(this.q);
            this.g.setOnMenuItemClickListener(this.P);
            this.g.setMenuCallbacks(this.T, new i3(this));
            LayoutParams toolbar$LayoutParams0 = this.generateDefaultLayoutParams();
            toolbar$LayoutParams0.gravity = this.t & 0x70 | 0x800005;
            this.g.setLayoutParams(toolbar$LayoutParams0);
            this.b(this.g, false);
        }
    }

    public final void g() {
        if(this.j == null) {
            this.j = new AppCompatImageButton(this.getContext(), null, attr.toolbarNavigationButtonStyle);
            LayoutParams toolbar$LayoutParams0 = this.generateDefaultLayoutParams();
            toolbar$LayoutParams0.gravity = this.t & 0x70 | 0x800003;
            this.j.setLayoutParams(toolbar$LayoutParams0);
        }
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.generateLayoutParams(viewGroup$LayoutParams0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            return new LayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        if(viewGroup$LayoutParams0 instanceof androidx.appcompat.app.ActionBar.LayoutParams) {
            return new LayoutParams(((androidx.appcompat.app.ActionBar.LayoutParams)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new LayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new LayoutParams(viewGroup$LayoutParams0);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        return this.n == null ? null : this.n.getContentDescription();
    }

    @Nullable
    public Drawable getCollapseIcon() {
        return this.n == null ? null : this.n.getDrawable();
    }

    public int getContentInsetEnd() {
        i2 i20 = this.z;
        if(i20 != null) {
            return i20.g ? i20.a : i20.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        return this.B == 0x80000000 ? this.getContentInsetEnd() : this.B;
    }

    public int getContentInsetLeft() {
        return this.z == null ? 0 : this.z.a;
    }

    public int getContentInsetRight() {
        return this.z == null ? 0 : this.z.b;
    }

    public int getContentInsetStart() {
        i2 i20 = this.z;
        if(i20 != null) {
            return i20.g ? i20.b : i20.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        return this.A == 0x80000000 ? this.getContentInsetStart() : this.A;
    }

    public int getCurrentContentInsetEnd() {
        ActionMenuView actionMenuView0 = this.g;
        if(actionMenuView0 != null) {
            MenuBuilder menuBuilder0 = actionMenuView0.peekMenu();
            return menuBuilder0 == null || !menuBuilder0.hasVisibleItems() ? this.getContentInsetEnd() : Math.max(this.getContentInsetEnd(), Math.max(this.B, 0));
        }
        return this.getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return ViewCompat.getLayoutDirection(this) == 1 ? this.getCurrentContentInsetEnd() : this.getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return ViewCompat.getLayoutDirection(this) == 1 ? this.getCurrentContentInsetStart() : this.getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return this.getNavigationIcon() == null ? this.getContentInsetStart() : Math.max(this.getContentInsetStart(), Math.max(this.A, 0));
    }

    private ArrayList getCurrentMenuItems() {
        ArrayList arrayList0 = new ArrayList();
        Menu menu0 = this.getMenu();
        for(int v = 0; v < menu0.size(); ++v) {
            arrayList0.add(menu0.getItem(v));
        }
        return arrayList0;
    }

    public Drawable getLogo() {
        return this.k == null ? null : this.k.getDrawable();
    }

    public CharSequence getLogoDescription() {
        return this.k == null ? null : this.k.getContentDescription();
    }

    public Menu getMenu() {
        this.e();
        return this.g.getMenu();
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.getContext());
    }

    @Nullable
    @RestrictTo({Scope.TESTS})
    public View getNavButtonView() {
        return this.j;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        return this.j == null ? null : this.j.getContentDescription();
    }

    @Nullable
    public Drawable getNavigationIcon() {
        return this.j == null ? null : this.j.getDrawable();
    }

    public o getOuterActionMenuPresenter() {
        return this.R;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        this.e();
        return this.g.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.p;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.q;
    }

    public CharSequence getSubtitle() {
        return this.E;
    }

    @Nullable
    @RestrictTo({Scope.TESTS})
    public final TextView getSubtitleTextView() {
        return this.i;
    }

    public CharSequence getTitle() {
        return this.D;
    }

    public int getTitleMarginBottom() {
        return this.y;
    }

    public int getTitleMarginEnd() {
        return this.w;
    }

    public int getTitleMarginStart() {
        return this.v;
    }

    public int getTitleMarginTop() {
        return this.x;
    }

    @Nullable
    @RestrictTo({Scope.TESTS})
    public final TextView getTitleTextView() {
        return this.h;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public DecorToolbar getWrapper() {
        if(this.Q == null) {
            this.Q = new ToolbarWidgetWrapper(this, true);
        }
        return this.Q;
    }

    public final int h(int v, View view0) {
        LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v1 = view0.getMeasuredHeight();
        int v2 = v <= 0 ? 0 : (v1 - v) / 2;
        int v3 = toolbar$LayoutParams0.gravity & 0x70;
        switch((v3 == 16 || v3 == 0x30 || v3 == 80 ? toolbar$LayoutParams0.gravity & 0x70 : this.C & 0x70)) {
            case 0x30: {
                return this.getPaddingTop() - v2;
            }
            case 80: {
                return this.getHeight() - this.getPaddingBottom() - v1 - toolbar$LayoutParams0.bottomMargin - v2;
            }
            default: {
                int v4 = this.getPaddingTop();
                int v5 = this.getPaddingBottom();
                int v6 = this.getHeight();
                int v7 = (v6 - v4 - v5 - v1) / 2;
                int v8 = toolbar$LayoutParams0.topMargin;
                if(v7 < v8) {
                    return v4 + v8;
                }
                int v9 = v6 - v5 - v1 - v7 - v4;
                int v10 = toolbar$LayoutParams0.bottomMargin;
                if(v9 < v10) {
                    v7 = Math.max(0, v7 - (v10 - v9));
                }
                return v4 + v7;
            }
        }
    }

    public boolean hasExpandedActionView() {
        return this.S != null && this.S.b != null;
    }

    public boolean hideOverflowMenu() {
        return this.g != null && this.g.hideOverflowMenu();
    }

    public static int i(View view0) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v = MarginLayoutParamsCompat.getMarginStart(viewGroup$MarginLayoutParams0);
        return MarginLayoutParamsCompat.getMarginEnd(viewGroup$MarginLayoutParams0) + v;
    }

    public void inflateMenu(@MenuRes int v) {
        this.getMenuInflater().inflate(v, this.getMenu());
    }

    @Override  // androidx.core.view.MenuHost
    @MainThread
    public void invalidateMenu() {
        for(Object object0: this.N) {
            this.getMenu().removeItem(((MenuItem)object0).getItemId());
        }
        Menu menu0 = this.getMenu();
        ArrayList arrayList0 = this.getCurrentMenuItems();
        MenuInflater menuInflater0 = this.getMenuInflater();
        this.M.onCreateMenu(menu0, menuInflater0);
        ArrayList arrayList1 = this.getCurrentMenuItems();
        arrayList1.removeAll(arrayList0);
        this.N = arrayList1;
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.b0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        return this.g != null && this.g.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        return this.g != null && this.g.isOverflowMenuShowing();
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        AppCompatTextView appCompatTextView0 = this.h;
        if(appCompatTextView0 == null) {
            return false;
        }
        Layout layout0 = appCompatTextView0.getLayout();
        if(layout0 == null) {
            return false;
        }
        int v = layout0.getLineCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(layout0.getEllipsisCount(v1) > 0) {
                return true;
            }
        }
        return false;
    }

    public static int j(View view0) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        return viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin;
    }

    public final boolean k(View view0) {
        return view0.getParent() == this || this.K.contains(view0);
    }

    public final int l(View view0, int v, int v1, int[] arr_v) {
        LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v2 = toolbar$LayoutParams0.leftMargin - arr_v[0];
        int v3 = Math.max(0, v2) + v;
        arr_v[0] = Math.max(0, -v2);
        int v4 = this.h(v1, view0);
        int v5 = view0.getMeasuredWidth();
        view0.layout(v3, v4, v3 + v5, view0.getMeasuredHeight() + v4);
        return v5 + toolbar$LayoutParams0.rightMargin + v3;
    }

    public final int m(View view0, int v, int v1, int[] arr_v) {
        LayoutParams toolbar$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        int v2 = toolbar$LayoutParams0.rightMargin - arr_v[1];
        int v3 = v - Math.max(0, v2);
        arr_v[1] = Math.max(0, -v2);
        int v4 = this.h(v1, view0);
        int v5 = view0.getMeasuredWidth();
        view0.layout(v3 - v5, v4, v3, view0.getMeasuredHeight() + v4);
        return v3 - (v5 + toolbar$LayoutParams0.leftMargin);
    }

    public final int n(View view0, int v, int v1, int v2, int v3, int[] arr_v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = viewGroup$MarginLayoutParams0.leftMargin - arr_v[0];
        int v5 = viewGroup$MarginLayoutParams0.rightMargin - arr_v[1];
        int v6 = Math.max(0, v5) + Math.max(0, v4);
        arr_v[0] = Math.max(0, -v4);
        arr_v[1] = Math.max(0, -v5);
        int v7 = this.getPaddingLeft();
        int v8 = ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v7 + v6 + v1, viewGroup$MarginLayoutParams0.width);
        int v9 = this.getPaddingTop();
        view0.measure(v8, ViewGroup.getChildMeasureSpec(v2, this.getPaddingBottom() + v9 + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin + v3, viewGroup$MarginLayoutParams0.height));
        return view0.getMeasuredWidth() + v6;
    }

    public final void o(View view0, int v, int v1, int v2, int v3) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        int v4 = this.getPaddingLeft();
        int v5 = ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v4 + viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin + v1, viewGroup$MarginLayoutParams0.width);
        int v6 = this.getPaddingTop();
        int v7 = ViewGroup.getChildMeasureSpec(v2, this.getPaddingBottom() + v6 + viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin, viewGroup$MarginLayoutParams0.height);
        int v8 = View.MeasureSpec.getMode(v7);
        if(v8 != 0x40000000 && v3 >= 0) {
            if(v8 != 0) {
                v3 = Math.min(View.MeasureSpec.getSize(v7), v3);
            }
            v7 = View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
        }
        view0.measure(v5, v7);
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.c0);
        this.q();
    }

    @Override  // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 9) {
            this.I = false;
        }
        if(!this.I && (v == 9 && !super.onHoverEvent(motionEvent0))) {
            this.I = true;
        }
        if(v == 3 || v == 10) {
            this.I = false;
        }
        return true;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v43;
        int v39;
        int v35;
        int v31;
        int v27;
        int v21;
        int v14;
        int v13;
        boolean z1 = ViewCompat.getLayoutDirection(this) == 1;
        int v4 = this.getWidth();
        int v5 = this.getHeight();
        int v6 = this.getPaddingLeft();
        int v7 = this.getPaddingRight();
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingBottom();
        int v10 = v4 - v7;
        int[] arr_v = this.L;
        arr_v[1] = 0;
        arr_v[0] = 0;
        int v11 = ViewCompat.getMinimumHeight(this);
        int v12 = v11 < 0 ? 0 : Math.min(v11, v3 - v1);
        if(!this.p(this.j)) {
            v14 = v6;
            v13 = v10;
        }
        else if(z1) {
            v13 = this.m(this.j, v10, v12, arr_v);
            v14 = v6;
        }
        else {
            v14 = this.l(this.j, v6, v12, arr_v);
            v13 = v10;
        }
        if(this.p(this.n)) {
            if(z1) {
                v13 = this.m(this.n, v13, v12, arr_v);
            }
            else {
                v14 = this.l(this.n, v14, v12, arr_v);
            }
        }
        if(this.p(this.g)) {
            if(z1) {
                v14 = this.l(this.g, v14, v12, arr_v);
            }
            else {
                v13 = this.m(this.g, v13, v12, arr_v);
            }
        }
        int v15 = this.getCurrentContentInsetLeft();
        int v16 = this.getCurrentContentInsetRight();
        arr_v[0] = Math.max(0, v15 - v14);
        arr_v[1] = Math.max(0, v16 - (v10 - v13));
        int v17 = Math.max(v14, v15);
        int v18 = Math.min(v13, v10 - v16);
        if(this.p(this.o)) {
            if(z1) {
                v18 = this.m(this.o, v18, v12, arr_v);
            }
            else {
                v17 = this.l(this.o, v17, v12, arr_v);
            }
        }
        if(this.p(this.k)) {
            if(z1) {
                v18 = this.m(this.k, v18, v12, arr_v);
            }
            else {
                v17 = this.l(this.k, v17, v12, arr_v);
            }
        }
        boolean z2 = this.p(this.h);
        boolean z3 = this.p(this.i);
        if(z2) {
            LayoutParams toolbar$LayoutParams0 = (LayoutParams)this.h.getLayoutParams();
            int v19 = toolbar$LayoutParams0.topMargin;
            int v20 = this.h.getMeasuredHeight();
            v21 = toolbar$LayoutParams0.bottomMargin + (v20 + v19);
        }
        else {
            v21 = 0;
        }
        if(z3) {
            LayoutParams toolbar$LayoutParams1 = (LayoutParams)this.i.getLayoutParams();
            int v22 = toolbar$LayoutParams1.topMargin;
            v21 += this.i.getMeasuredHeight() + v22 + toolbar$LayoutParams1.bottomMargin;
        }
        if(z2 || z3) {
            AppCompatTextView appCompatTextView0 = z3 ? this.i : this.h;
            LayoutParams toolbar$LayoutParams2 = (LayoutParams)(z2 ? this.h : this.i).getLayoutParams();
            LayoutParams toolbar$LayoutParams3 = (LayoutParams)appCompatTextView0.getLayoutParams();
            boolean z4 = z2 && this.h.getMeasuredWidth() > 0 || z3 && this.i.getMeasuredWidth() > 0;
            switch(this.C & 0x70) {
                case 0x30: {
                    v27 = this.getPaddingTop() + toolbar$LayoutParams2.topMargin + this.x;
                    break;
                }
                case 80: {
                    v27 = v5 - v9 - toolbar$LayoutParams3.bottomMargin - this.y - v21;
                    break;
                }
                default: {
                    int v23 = (v5 - v8 - v9 - v21) / 2;
                    int v24 = toolbar$LayoutParams2.topMargin + this.x;
                    if(v23 < v24) {
                        v23 = v24;
                    }
                    else {
                        int v25 = v5 - v9 - v21 - v23 - v8;
                        int v26 = this.y;
                        if(v25 < toolbar$LayoutParams2.bottomMargin + v26) {
                            v23 = Math.max(0, v23 - (toolbar$LayoutParams3.bottomMargin + v26 - v25));
                        }
                    }
                    v27 = v8 + v23;
                }
            }
            if(z1) {
                int v28 = (z4 ? this.v : 0) - arr_v[1];
                v18 -= Math.max(0, v28);
                arr_v[1] = Math.max(0, -v28);
                if(z2) {
                    LayoutParams toolbar$LayoutParams4 = (LayoutParams)this.h.getLayoutParams();
                    int v29 = v18 - this.h.getMeasuredWidth();
                    int v30 = this.h.getMeasuredHeight() + v27;
                    this.h.layout(v29, v27, v18, v30);
                    v31 = v29 - this.w;
                    v27 = v30 + toolbar$LayoutParams4.bottomMargin;
                }
                else {
                    v31 = v18;
                }
                if(z3) {
                    int v32 = v27 + ((LayoutParams)this.i.getLayoutParams()).topMargin;
                    int v33 = this.i.getMeasuredWidth();
                    int v34 = this.i.getMeasuredHeight();
                    this.i.layout(v18 - v33, v32, v18, v34 + v32);
                    v35 = v18 - this.w;
                }
                else {
                    v35 = v18;
                }
                if(z4) {
                    v18 = Math.min(v31, v35);
                }
            }
            else {
                int v36 = (z4 ? this.v : 0) - arr_v[0];
                v17 += Math.max(0, v36);
                arr_v[0] = Math.max(0, -v36);
                if(z2) {
                    LayoutParams toolbar$LayoutParams5 = (LayoutParams)this.h.getLayoutParams();
                    int v37 = this.h.getMeasuredWidth() + v17;
                    int v38 = this.h.getMeasuredHeight() + v27;
                    this.h.layout(v17, v27, v37, v38);
                    v39 = v37 + this.w;
                    v27 = v38 + toolbar$LayoutParams5.bottomMargin;
                }
                else {
                    v39 = v17;
                }
                if(z3) {
                    int v40 = v27 + ((LayoutParams)this.i.getLayoutParams()).topMargin;
                    int v41 = this.i.getMeasuredWidth() + v17;
                    int v42 = this.i.getMeasuredHeight();
                    this.i.layout(v17, v40, v41, v42 + v40);
                    v43 = v41 + this.w;
                }
                else {
                    v43 = v17;
                }
                if(z4) {
                    v17 = Math.max(v39, v43);
                }
            }
        }
        ArrayList arrayList0 = this.J;
        this.a(arrayList0, 3);
        int v44 = arrayList0.size();
        int v45 = v17;
        for(int v46 = 0; v46 < v44; ++v46) {
            v45 = this.l(((View)arrayList0.get(v46)), v45, v12, arr_v);
        }
        this.a(arrayList0, 5);
        int v47 = arrayList0.size();
        for(int v48 = 0; v48 < v47; ++v48) {
            v18 = this.m(((View)arrayList0.get(v48)), v18, v12, arr_v);
        }
        this.a(arrayList0, 1);
        int v49 = arr_v[0];
        int v50 = arrayList0.size();
        int v51 = arr_v[1];
        int v52 = v49;
        int v53 = 0;
        int v54 = 0;
        while(v53 < v50) {
            View view0 = (View)arrayList0.get(v53);
            LayoutParams toolbar$LayoutParams6 = (LayoutParams)view0.getLayoutParams();
            int v55 = toolbar$LayoutParams6.leftMargin - v52;
            int v56 = toolbar$LayoutParams6.rightMargin - v51;
            v54 += view0.getMeasuredWidth() + Math.max(0, v55) + Math.max(0, v56);
            ++v53;
            v51 = Math.max(0, -v56);
            v52 = Math.max(0, -v55);
        }
        int v58 = (v4 - v6 - v7) / 2 + v6 - v54 / 2;
        int v59 = v54 + v58;
        if(v58 >= v45) {
            v45 = v59 <= v18 ? v58 : v58 - (v59 - v18);
        }
        int v60 = arrayList0.size();
        for(int v57 = 0; v57 < v60; ++v57) {
            v45 = this.l(((View)arrayList0.get(v57)), v45, v12, arr_v);
        }
        arrayList0.clear();
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v29;
        int v28;
        int v27;
        int v13;
        int v7;
        int v6;
        int v4;
        boolean z = ViewUtils.isLayoutRtl(this);
        int v2 = 0;
        if(this.p(this.j)) {
            this.o(this.j, v, 0, v1, this.u);
            int v3 = this.j.getMeasuredWidth();
            v4 = Toolbar.i(this.j) + v3;
            int v5 = this.j.getMeasuredHeight();
            v6 = Math.max(0, Toolbar.j(this.j) + v5);
            v7 = View.combineMeasuredStates(0, this.j.getMeasuredState());
        }
        else {
            v4 = 0;
            v6 = 0;
            v7 = 0;
        }
        if(this.p(this.n)) {
            this.o(this.n, v, 0, v1, this.u);
            int v8 = this.n.getMeasuredWidth();
            v4 = Toolbar.i(this.n) + v8;
            int v9 = this.n.getMeasuredHeight();
            v6 = Math.max(v6, Toolbar.j(this.n) + v9);
            v7 = View.combineMeasuredStates(v7, this.n.getMeasuredState());
        }
        int v10 = this.getCurrentContentInsetStart();
        int v11 = Math.max(v10, v4);
        int[] arr_v = this.L;
        arr_v[z] = Math.max(0, v10 - v4);
        if(this.p(this.g)) {
            this.o(this.g, v, v11, v1, this.u);
            int v12 = this.g.getMeasuredWidth();
            v13 = Toolbar.i(this.g) + v12;
            int v14 = this.g.getMeasuredHeight();
            v6 = Math.max(v6, Toolbar.j(this.g) + v14);
            v7 = View.combineMeasuredStates(v7, this.g.getMeasuredState());
        }
        else {
            v13 = 0;
        }
        int v15 = this.getCurrentContentInsetEnd();
        int v16 = v11 + Math.max(v15, v13);
        arr_v[!z] = Math.max(0, v15 - v13);
        if(this.p(this.o)) {
            v16 += this.n(this.o, v, v16, v1, 0, arr_v);
            int v17 = this.o.getMeasuredHeight();
            v6 = Math.max(v6, Toolbar.j(this.o) + v17);
            v7 = View.combineMeasuredStates(v7, this.o.getMeasuredState());
        }
        if(this.p(this.k)) {
            v16 += this.n(this.k, v, v16, v1, 0, arr_v);
            int v18 = this.k.getMeasuredHeight();
            v6 = Math.max(v6, Toolbar.j(this.k) + v18);
            v7 = View.combineMeasuredStates(v7, this.k.getMeasuredState());
        }
        int v19 = this.getChildCount();
        for(int v20 = 0; v20 < v19; ++v20) {
            View view0 = this.getChildAt(v20);
            if(((LayoutParams)view0.getLayoutParams()).a == 0 && this.p(view0)) {
                v16 += this.n(view0, v, v16, v1, 0, arr_v);
                int v21 = view0.getMeasuredHeight();
                v6 = Math.max(v6, Toolbar.j(view0) + v21);
                v7 = View.combineMeasuredStates(v7, view0.getMeasuredState());
            }
        }
        int v22 = this.x + this.y;
        int v23 = this.v + this.w;
        if(this.p(this.h)) {
            this.n(this.h, v, v16 + v23, v1, v22, arr_v);
            int v24 = this.h.getMeasuredWidth();
            int v25 = Toolbar.i(this.h);
            int v26 = this.h.getMeasuredHeight();
            v27 = Toolbar.j(this.h) + v26;
            v28 = View.combineMeasuredStates(v7, this.h.getMeasuredState());
            v29 = v25 + v24;
        }
        else {
            v27 = 0;
            v28 = v7;
            v29 = 0;
        }
        if(this.p(this.i)) {
            v29 = Math.max(v29, this.n(this.i, v, v16 + v23, v1, v27 + v22, arr_v));
            int v30 = this.i.getMeasuredHeight();
            v27 += Toolbar.j(this.i) + v30;
            v28 = View.combineMeasuredStates(v28, this.i.getMeasuredState());
        }
        int v31 = this.getPaddingLeft();
        int v32 = this.getPaddingRight();
        int v33 = this.getPaddingTop();
        int v34 = this.getPaddingBottom();
        int v35 = View.resolveSizeAndState(Math.max(v32 + v31 + (v16 + v29), this.getSuggestedMinimumWidth()), v, 0xFF000000 & v28);
        int v36 = View.resolveSizeAndState(Math.max(v34 + v33 + Math.max(v6, v27), this.getSuggestedMinimumHeight()), v1, v28 << 16);
        if(this.V) {
            int v37 = this.getChildCount();
            for(int v38 = 0; v38 < v37; ++v38) {
                View view1 = this.getChildAt(v38);
                if(this.p(view1) && view1.getMeasuredWidth() > 0 && view1.getMeasuredHeight() > 0) {
                    v2 = v36;
                    this.setMeasuredDimension(v35, v2);
                    return;
                }
            }
        }
        else {
            v2 = v36;
        }
        this.setMeasuredDimension(v35, v2);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        MenuBuilder menuBuilder0 = this.g == null ? null : this.g.peekMenu();
        int v = ((SavedState)parcelable0).b;
        if(v != 0 && this.S != null && menuBuilder0 != null) {
            MenuItem menuItem0 = menuBuilder0.findItem(v);
            if(menuItem0 != null) {
                menuItem0.expandActionView();
            }
        }
        if(((SavedState)parcelable0).c) {
            this.removeCallbacks(this.c0);
            this.post(this.c0);
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        this.d();
        i2 i20 = this.z;
        if(v == 1 != i20.g) {
            i20.g = v == 1;
            if(i20.h) {
                if(v == 1) {
                    i20.a = i20.d == 0x80000000 ? i20.e : i20.d;
                    i20.b = i20.c == 0x80000000 ? i20.f : i20.c;
                    return;
                }
                i20.a = i20.c == 0x80000000 ? i20.e : i20.c;
                i20.b = i20.d == 0x80000000 ? i20.f : i20.d;
                return;
            }
            i20.a = i20.e;
            i20.b = i20.f;
        }
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        l3 l30 = this.S;
        if(l30 != null) {
            MenuItemImpl menuItemImpl0 = l30.b;
            if(menuItemImpl0 != null) {
                parcelable0.b = menuItemImpl0.getItemId();
            }
        }
        parcelable0.c = this.isOverflowMenuShowing();
        return parcelable0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.H = false;
        }
        if(!this.H && (v == 0 && !super.onTouchEvent(motionEvent0))) {
            this.H = true;
        }
        if(v == 1 || v == 3) {
            this.H = false;
        }
        return true;
    }

    public final boolean p(View view0) {
        return view0 != null && view0.getParent() == this && view0.getVisibility() != 8;
    }

    public final void q() {
        if(Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher0 = k3.a(this);
            boolean z = this.hasExpandedActionView() && onBackInvokedDispatcher0 != null && ViewCompat.isAttachedToWindow(this) && this.b0;
            if(z && this.a0 == null) {
                if(this.W == null) {
                    this.W = k3.b(new g3(this, 0));
                }
                k3.c(onBackInvokedDispatcher0, this.W);
                this.a0 = onBackInvokedDispatcher0;
                return;
            }
            if(!z) {
                OnBackInvokedDispatcher onBackInvokedDispatcher1 = this.a0;
                if(onBackInvokedDispatcher1 != null) {
                    k3.d(onBackInvokedDispatcher1, this.W);
                    this.a0 = null;
                }
            }
        }
    }

    @Override  // androidx.core.view.MenuHost
    @MainThread
    public void removeMenuProvider(@NonNull MenuProvider menuProvider0) {
        this.M.removeMenuProvider(menuProvider0);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if(this.b0 != z) {
            this.b0 = z;
            this.q();
        }
    }

    public void setCollapseContentDescription(@StringRes int v) {
        this.setCollapseContentDescription((v == 0 ? null : this.getContext().getText(v)));
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.c();
        }
        AppCompatImageButton appCompatImageButton0 = this.n;
        if(appCompatImageButton0 != null) {
            appCompatImageButton0.setContentDescription(charSequence0);
        }
    }

    public void setCollapseIcon(@DrawableRes int v) {
        this.setCollapseIcon(AppCompatResources.getDrawable(this.getContext(), v));
    }

    public void setCollapseIcon(@Nullable Drawable drawable0) {
        if(drawable0 != null) {
            this.c();
            this.n.setImageDrawable(drawable0);
            return;
        }
        AppCompatImageButton appCompatImageButton0 = this.n;
        if(appCompatImageButton0 != null) {
            appCompatImageButton0.setImageDrawable(this.l);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.V = z;
        this.requestLayout();
    }

    public void setContentInsetEndWithActions(int v) {
        if(v < 0) {
            v = 0x80000000;
        }
        if(v != this.B) {
            this.B = v;
            if(this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int v) {
        if(v < 0) {
            v = 0x80000000;
        }
        if(v != this.A) {
            this.A = v;
            if(this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int v, int v1) {
        this.d();
        i2 i20 = this.z;
        i20.h = false;
        if(v != 0x80000000) {
            i20.e = v;
            i20.a = v;
        }
        if(v1 != 0x80000000) {
            i20.f = v1;
            i20.b = v1;
        }
    }

    public void setContentInsetsRelative(int v, int v1) {
        this.d();
        this.z.a(v, v1);
    }

    public void setLogo(@DrawableRes int v) {
        this.setLogo(AppCompatResources.getDrawable(this.getContext(), v));
    }

    public void setLogo(Drawable drawable0) {
        if(drawable0 != null) {
            if(this.k == null) {
                this.k = new AppCompatImageView(this.getContext());
            }
            if(!this.k(this.k)) {
                this.b(this.k, true);
            }
        }
        else if(this.k != null && this.k(this.k)) {
            this.removeView(this.k);
            this.K.remove(this.k);
        }
        AppCompatImageView appCompatImageView0 = this.k;
        if(appCompatImageView0 != null) {
            appCompatImageView0.setImageDrawable(drawable0);
        }
    }

    public void setLogoDescription(@StringRes int v) {
        this.setLogoDescription(this.getContext().getText(v));
    }

    public void setLogoDescription(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0) && this.k == null) {
            this.k = new AppCompatImageView(this.getContext());
        }
        AppCompatImageView appCompatImageView0 = this.k;
        if(appCompatImageView0 != null) {
            appCompatImageView0.setContentDescription(charSequence0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public void setMenu(MenuBuilder menuBuilder0, o o0) {
        if(menuBuilder0 == null && this.g == null) {
            return;
        }
        this.f();
        MenuBuilder menuBuilder1 = this.g.peekMenu();
        if(menuBuilder1 == menuBuilder0) {
            return;
        }
        if(menuBuilder1 != null) {
            menuBuilder1.removeMenuPresenter(this.R);
            menuBuilder1.removeMenuPresenter(this.S);
        }
        if(this.S == null) {
            this.S = new l3(this);
        }
        o0.m = true;
        if(menuBuilder0 == null) {
            o0.initForMenu(this.p, null);
            this.S.initForMenu(this.p, null);
            o0.updateMenuView(true);
            this.S.updateMenuView(true);
        }
        else {
            menuBuilder0.addMenuPresenter(o0, this.p);
            menuBuilder0.addMenuPresenter(this.S, this.p);
        }
        this.g.setPopupTheme(this.q);
        this.g.setPresenter(o0);
        this.R = o0;
        this.q();
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(Callback menuPresenter$Callback0, androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0) {
        this.T = menuPresenter$Callback0;
        this.U = menuBuilder$Callback0;
        ActionMenuView actionMenuView0 = this.g;
        if(actionMenuView0 != null) {
            actionMenuView0.setMenuCallbacks(menuPresenter$Callback0, menuBuilder$Callback0);
        }
    }

    public void setNavigationContentDescription(@StringRes int v) {
        this.setNavigationContentDescription((v == 0 ? null : this.getContext().getText(v)));
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            this.g();
        }
        AppCompatImageButton appCompatImageButton0 = this.j;
        if(appCompatImageButton0 != null) {
            appCompatImageButton0.setContentDescription(charSequence0);
            TooltipCompat.setTooltipText(this.j, charSequence0);
        }
    }

    public void setNavigationIcon(@DrawableRes int v) {
        this.setNavigationIcon(AppCompatResources.getDrawable(this.getContext(), v));
    }

    public void setNavigationIcon(@Nullable Drawable drawable0) {
        if(drawable0 != null) {
            this.g();
            if(!this.k(this.j)) {
                this.b(this.j, true);
            }
        }
        else if(this.j != null && this.k(this.j)) {
            this.removeView(this.j);
            this.K.remove(this.j);
        }
        AppCompatImageButton appCompatImageButton0 = this.j;
        if(appCompatImageButton0 != null) {
            appCompatImageButton0.setImageDrawable(drawable0);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.g();
        this.j.setOnClickListener(view$OnClickListener0);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener toolbar$OnMenuItemClickListener0) {
        this.O = toolbar$OnMenuItemClickListener0;
    }

    public void setOverflowIcon(@Nullable Drawable drawable0) {
        this.e();
        this.g.setOverflowIcon(drawable0);
    }

    public void setPopupTheme(@StyleRes int v) {
        if(this.q != v) {
            this.q = v;
            if(v == 0) {
                this.p = this.getContext();
                return;
            }
            this.p = new ContextThemeWrapper(this.getContext(), v);
        }
    }

    public void setSubtitle(@StringRes int v) {
        this.setSubtitle(this.getContext().getText(v));
    }

    public void setSubtitle(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(this.i == null) {
                Context context0 = this.getContext();
                AppCompatTextView appCompatTextView0 = new AppCompatTextView(context0);
                this.i = appCompatTextView0;
                appCompatTextView0.setSingleLine();
                this.i.setEllipsize(TextUtils.TruncateAt.END);
                int v = this.s;
                if(v != 0) {
                    this.i.setTextAppearance(context0, v);
                }
                ColorStateList colorStateList0 = this.G;
                if(colorStateList0 != null) {
                    this.i.setTextColor(colorStateList0);
                }
            }
            if(!this.k(this.i)) {
                this.b(this.i, true);
            }
        }
        else if(this.i != null && this.k(this.i)) {
            this.removeView(this.i);
            this.K.remove(this.i);
        }
        AppCompatTextView appCompatTextView1 = this.i;
        if(appCompatTextView1 != null) {
            appCompatTextView1.setText(charSequence0);
        }
        this.E = charSequence0;
    }

    public void setSubtitleTextAppearance(Context context0, @StyleRes int v) {
        this.s = v;
        AppCompatTextView appCompatTextView0 = this.i;
        if(appCompatTextView0 != null) {
            appCompatTextView0.setTextAppearance(context0, v);
        }
    }

    public void setSubtitleTextColor(@ColorInt int v) {
        this.setSubtitleTextColor(ColorStateList.valueOf(v));
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList0) {
        this.G = colorStateList0;
        AppCompatTextView appCompatTextView0 = this.i;
        if(appCompatTextView0 != null) {
            appCompatTextView0.setTextColor(colorStateList0);
        }
    }

    public void setTitle(@StringRes int v) {
        this.setTitle(this.getContext().getText(v));
    }

    public void setTitle(CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(this.h == null) {
                Context context0 = this.getContext();
                AppCompatTextView appCompatTextView0 = new AppCompatTextView(context0);
                this.h = appCompatTextView0;
                appCompatTextView0.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int v = this.r;
                if(v != 0) {
                    this.h.setTextAppearance(context0, v);
                }
                ColorStateList colorStateList0 = this.F;
                if(colorStateList0 != null) {
                    this.h.setTextColor(colorStateList0);
                }
            }
            if(!this.k(this.h)) {
                this.b(this.h, true);
            }
        }
        else if(this.h != null && this.k(this.h)) {
            this.removeView(this.h);
            this.K.remove(this.h);
        }
        AppCompatTextView appCompatTextView1 = this.h;
        if(appCompatTextView1 != null) {
            appCompatTextView1.setText(charSequence0);
        }
        this.D = charSequence0;
    }

    public void setTitleMargin(int v, int v1, int v2, int v3) {
        this.v = v;
        this.x = v1;
        this.w = v2;
        this.y = v3;
        this.requestLayout();
    }

    public void setTitleMarginBottom(int v) {
        this.y = v;
        this.requestLayout();
    }

    public void setTitleMarginEnd(int v) {
        this.w = v;
        this.requestLayout();
    }

    public void setTitleMarginStart(int v) {
        this.v = v;
        this.requestLayout();
    }

    public void setTitleMarginTop(int v) {
        this.x = v;
        this.requestLayout();
    }

    public void setTitleTextAppearance(Context context0, @StyleRes int v) {
        this.r = v;
        AppCompatTextView appCompatTextView0 = this.h;
        if(appCompatTextView0 != null) {
            appCompatTextView0.setTextAppearance(context0, v);
        }
    }

    public void setTitleTextColor(@ColorInt int v) {
        this.setTitleTextColor(ColorStateList.valueOf(v));
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList0) {
        this.F = colorStateList0;
        AppCompatTextView appCompatTextView0 = this.h;
        if(appCompatTextView0 != null) {
            appCompatTextView0.setTextColor(colorStateList0);
        }
    }

    public boolean showOverflowMenu() {
        return this.g != null && this.g.showOverflowMenu();
    }
}

