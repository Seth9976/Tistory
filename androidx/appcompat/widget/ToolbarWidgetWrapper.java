package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.drawable;
import androidx.appcompat.R.id;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ToolbarWidgetWrapper implements DecorToolbar {
    public final Toolbar a;
    public int b;
    public ScrollingTabContainerView c;
    public AppCompatSpinner d;
    public View e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public boolean i;
    public CharSequence j;
    public CharSequence k;
    public CharSequence l;
    public Window.Callback m;
    public boolean n;
    public o o;
    public int p;
    public int q;
    public Drawable r;

    public ToolbarWidgetWrapper(Toolbar toolbar0, boolean z) {
        this(toolbar0, z, string.abc_action_bar_up_description, drawable.abc_ic_ab_back_material);
    }

    public ToolbarWidgetWrapper(Toolbar toolbar0, boolean z, int v, int v1) {
        int v9;
        this.p = 0;
        this.q = 0;
        this.a = toolbar0;
        this.j = toolbar0.getTitle();
        this.k = toolbar0.getSubtitle();
        this.i = this.j != null;
        this.h = toolbar0.getNavigationIcon();
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(toolbar0.getContext(), null, styleable.ActionBar, attr.actionBarStyle, 0);
        this.r = tintTypedArray0.getDrawable(styleable.ActionBar_homeAsUpIndicator);
        if(z) {
            CharSequence charSequence0 = tintTypedArray0.getText(styleable.ActionBar_title);
            if(!TextUtils.isEmpty(charSequence0)) {
                this.setTitle(charSequence0);
            }
            CharSequence charSequence1 = tintTypedArray0.getText(styleable.ActionBar_subtitle);
            if(!TextUtils.isEmpty(charSequence1)) {
                this.setSubtitle(charSequence1);
            }
            Drawable drawable0 = tintTypedArray0.getDrawable(styleable.ActionBar_logo);
            if(drawable0 != null) {
                this.setLogo(drawable0);
            }
            Drawable drawable1 = tintTypedArray0.getDrawable(styleable.ActionBar_icon);
            if(drawable1 != null) {
                this.setIcon(drawable1);
            }
            if(this.h == null) {
                Drawable drawable2 = this.r;
                if(drawable2 != null) {
                    this.setNavigationIcon(drawable2);
                }
            }
            this.setDisplayOptions(tintTypedArray0.getInt(styleable.ActionBar_displayOptions, 0));
            int v2 = tintTypedArray0.getResourceId(styleable.ActionBar_customNavigationLayout, 0);
            if(v2 != 0) {
                this.setCustomView(LayoutInflater.from(toolbar0.getContext()).inflate(v2, toolbar0, false));
                this.setDisplayOptions(this.b | 16);
            }
            int v3 = tintTypedArray0.getLayoutDimension(styleable.ActionBar_height, 0);
            if(v3 > 0) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = toolbar0.getLayoutParams();
                viewGroup$LayoutParams0.height = v3;
                toolbar0.setLayoutParams(viewGroup$LayoutParams0);
            }
            int v4 = tintTypedArray0.getDimensionPixelOffset(styleable.ActionBar_contentInsetStart, -1);
            int v5 = tintTypedArray0.getDimensionPixelOffset(styleable.ActionBar_contentInsetEnd, -1);
            if(v4 >= 0 || v5 >= 0) {
                toolbar0.setContentInsetsRelative(Math.max(v4, 0), Math.max(v5, 0));
            }
            int v6 = tintTypedArray0.getResourceId(styleable.ActionBar_titleTextStyle, 0);
            if(v6 != 0) {
                toolbar0.setTitleTextAppearance(toolbar0.getContext(), v6);
            }
            int v7 = tintTypedArray0.getResourceId(styleable.ActionBar_subtitleTextStyle, 0);
            if(v7 != 0) {
                toolbar0.setSubtitleTextAppearance(toolbar0.getContext(), v7);
            }
            int v8 = tintTypedArray0.getResourceId(styleable.ActionBar_popupTheme, 0);
            if(v8 != 0) {
                toolbar0.setPopupTheme(v8);
            }
        }
        else {
            if(toolbar0.getNavigationIcon() == null) {
                v9 = 11;
            }
            else {
                this.r = toolbar0.getNavigationIcon();
                v9 = 15;
            }
            this.b = v9;
        }
        tintTypedArray0.recycle();
        this.setDefaultNavigationContentDescription(v);
        this.l = toolbar0.getNavigationContentDescription();
        toolbar0.setNavigationOnClickListener(new n3(this));
    }

    public final void a() {
        if(this.d == null) {
            this.d = new AppCompatSpinner(this.getContext(), null, attr.actionDropDownStyle);
            LayoutParams toolbar$LayoutParams0 = new LayoutParams(-2, -2, 0x800013);
            this.d.setLayoutParams(toolbar$LayoutParams0);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void animateToVisibility(int v) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.setupAnimatorToVisibility(v, 200L);
        if(viewPropertyAnimatorCompat0 != null) {
            viewPropertyAnimatorCompat0.start();
        }
    }

    public final void b() {
        if((this.b & 4) != 0) {
            boolean z = TextUtils.isEmpty(this.l);
            Toolbar toolbar0 = this.a;
            if(z) {
                toolbar0.setNavigationContentDescription(this.q);
                return;
            }
            toolbar0.setNavigationContentDescription(this.l);
        }
    }

    public final void c() {
        Toolbar toolbar0 = this.a;
        if((this.b & 4) != 0) {
            toolbar0.setNavigationIcon((this.h == null ? this.r : this.h));
            return;
        }
        toolbar0.setNavigationIcon(null);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
        return this.a.canShowOverflowMenu();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
        this.a.collapseActionView();
    }

    public final void d() {
        Drawable drawable0;
        int v = this.b;
        if((v & 2) == 0) {
            drawable0 = null;
        }
        else if((v & 1) != 0) {
            drawable0 = this.g;
            if(drawable0 == null) {
                drawable0 = this.f;
            }
        }
        else {
            drawable0 = this.f;
        }
        this.a.setLogo(drawable0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void dismissPopupMenus() {
        this.a.dismissPopupMenus();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public Context getContext() {
        return this.a.getContext();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public View getCustomView() {
        return this.e;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int getDisplayOptions() {
        return this.b;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int getDropdownItemCount() {
        return this.d == null ? 0 : this.d.getCount();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
        return this.d == null ? 0 : this.d.getSelectedItemPosition();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
        return this.a.getHeight();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public Menu getMenu() {
        return this.a.getMenu();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int getNavigationMode() {
        return this.p;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public CharSequence getSubtitle() {
        return this.a.getSubtitle();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public ViewGroup getViewGroup() {
        return this.a;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
        return this.a.getVisibility();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
        return this.c != null;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean hasExpandedActionView() {
        return this.a.hasExpandedActionView();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean hasIcon() {
        return this.f != null;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean hasLogo() {
        return this.g != null;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean hideOverflowMenu() {
        return this.a.hideOverflowMenu();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void initIndeterminateProgress() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void initProgress() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
        return this.a.isOverflowMenuShowPending();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
        return this.a.isOverflowMenuShowing();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean isTitleTruncated() {
        return this.a.isTitleTruncated();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void restoreHierarchyState(SparseArray sparseArray0) {
        this.a.restoreHierarchyState(sparseArray0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void saveHierarchyState(SparseArray sparseArray0) {
        this.a.saveHierarchyState(sparseArray0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setBackgroundDrawable(Drawable drawable0) {
        ViewCompat.setBackground(this.a, drawable0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setCollapsible(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setCustomView(View view0) {
        View view1 = this.e;
        Toolbar toolbar0 = this.a;
        if(view1 != null && (this.b & 16) != 0) {
            toolbar0.removeView(view1);
        }
        this.e = view0;
        if(view0 != null && (this.b & 16) != 0) {
            toolbar0.addView(view0);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int v) {
        if(v == this.q) {
            return;
        }
        this.q = v;
        if(TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            this.setNavigationContentDescription(this.q);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationIcon(Drawable drawable0) {
        if(this.r != drawable0) {
            this.r = drawable0;
            this.c();
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setDisplayOptions(int v) {
        int v1 = this.b ^ v;
        this.b = v;
        if(v1 != 0) {
            if((v1 & 4) != 0) {
                if((v & 4) != 0) {
                    this.b();
                }
                this.c();
            }
            if((v1 & 3) != 0) {
                this.d();
            }
            Toolbar toolbar0 = this.a;
            if((v1 & 8) != 0) {
                if((v & 8) == 0) {
                    toolbar0.setTitle(null);
                    toolbar0.setSubtitle(null);
                }
                else {
                    toolbar0.setTitle(this.j);
                    toolbar0.setSubtitle(this.k);
                }
            }
            if((v1 & 16) != 0) {
                View view0 = this.e;
                if(view0 != null) {
                    if((v & 16) != 0) {
                        toolbar0.addView(view0);
                        return;
                    }
                    toolbar0.removeView(view0);
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setDropdownParams(SpinnerAdapter spinnerAdapter0, AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        this.a();
        this.d.setAdapter(spinnerAdapter0);
        this.d.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setDropdownSelectedPosition(int v) {
        AppCompatSpinner appCompatSpinner0 = this.d;
        if(appCompatSpinner0 == null) {
            throw new IllegalStateException("Can\'t set dropdown selected position without an adapter");
        }
        appCompatSpinner0.setSelection(v);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView0) {
        Toolbar toolbar0 = this.a;
        if(this.c != null && this.c.getParent() == toolbar0) {
            toolbar0.removeView(this.c);
        }
        this.c = scrollingTabContainerView0;
        if(scrollingTabContainerView0 != null && this.p == 2) {
            toolbar0.addView(scrollingTabContainerView0, 0);
            LayoutParams toolbar$LayoutParams0 = (LayoutParams)this.c.getLayoutParams();
            toolbar$LayoutParams0.width = -2;
            toolbar$LayoutParams0.height = -2;
            toolbar$LayoutParams0.gravity = 0x800053;
            scrollingTabContainerView0.setAllowCollapse(true);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean z) {
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int v) {
        this.setIcon((v == 0 ? null : AppCompatResources.getDrawable(this.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setIcon(Drawable drawable0) {
        this.f = drawable0;
        this.d();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int v) {
        this.setLogo((v == 0 ? null : AppCompatResources.getDrawable(this.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setLogo(Drawable drawable0) {
        this.g = drawable0;
        this.d();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setMenu(Menu menu0, Callback menuPresenter$Callback0) {
        Toolbar toolbar0 = this.a;
        if(this.o == null) {
            o o0 = new o(toolbar0.getContext());
            this.o = o0;
            o0.setId(id.action_menu_presenter);
        }
        this.o.setCallback(menuPresenter$Callback0);
        toolbar0.setMenu(((MenuBuilder)menu0), this.o);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setMenuCallbacks(Callback menuPresenter$Callback0, androidx.appcompat.view.menu.MenuBuilder.Callback menuBuilder$Callback0) {
        this.a.setMenuCallbacks(menuPresenter$Callback0, menuBuilder$Callback0);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setMenuPrepared() {
        this.n = true;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(int v) {
        this.setNavigationContentDescription((v == 0 ? null : this.getContext().getString(v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(CharSequence charSequence0) {
        this.l = charSequence0;
        this.b();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(int v) {
        this.setNavigationIcon((v == 0 ? null : AppCompatResources.getDrawable(this.getContext(), v)));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(Drawable drawable0) {
        this.h = drawable0;
        this.c();
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setNavigationMode(int v) {
        int v1 = this.p;
        if(v != v1) {
            Toolbar toolbar0 = this.a;
            switch(v1) {
                case 1: {
                    if(this.d != null && this.d.getParent() == toolbar0) {
                        toolbar0.removeView(this.d);
                    }
                    break;
                }
                case 2: {
                    if(this.c != null && this.c.getParent() == toolbar0) {
                        toolbar0.removeView(this.c);
                    }
                }
            }
            this.p = v;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        this.a();
                        toolbar0.addView(this.d, 0);
                        return;
                    }
                    case 2: {
                        ScrollingTabContainerView scrollingTabContainerView0 = this.c;
                        if(scrollingTabContainerView0 != null) {
                            toolbar0.addView(scrollingTabContainerView0, 0);
                            LayoutParams toolbar$LayoutParams0 = (LayoutParams)this.c.getLayoutParams();
                            toolbar$LayoutParams0.width = -2;
                            toolbar$LayoutParams0.height = -2;
                            toolbar$LayoutParams0.gravity = 0x800053;
                            return;
                        }
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Invalid navigation mode " + v);
                    }
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setSubtitle(CharSequence charSequence0) {
        this.k = charSequence0;
        if((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence0);
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setTitle(CharSequence charSequence0) {
        this.i = true;
        this.j = charSequence0;
        if((this.b & 8) != 0) {
            Toolbar toolbar0 = this.a;
            toolbar0.setTitle(charSequence0);
            if(this.i) {
                ViewCompat.setAccessibilityPaneTitle(toolbar0.getRootView(), charSequence0);
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int v) {
        this.a.setVisibility(v);
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(Window.Callback window$Callback0) {
        this.m = window$Callback0;
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence0) {
        if(!this.i) {
            this.j = charSequence0;
            if((this.b & 8) != 0) {
                Toolbar toolbar0 = this.a;
                toolbar0.setTitle(charSequence0);
                if(this.i) {
                    ViewCompat.setAccessibilityPaneTitle(toolbar0.getRootView(), charSequence0);
                }
            }
        }
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int v, long v1) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = ViewCompat.animate(this.a);
        return v == 0 ? viewPropertyAnimatorCompat0.alpha(1.0f).setDuration(v1).setListener(new o3(this, 0)) : viewPropertyAnimatorCompat0.alpha(0.0f).setDuration(v1).setListener(new o3(this, v));
    }

    @Override  // androidx.appcompat.widget.DecorToolbar
    public boolean showOverflowMenu() {
        return this.a.showOverflowMenu();
    }
}

