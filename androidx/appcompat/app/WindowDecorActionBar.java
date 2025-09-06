package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class WindowDecorActionBar extends ActionBar implements ActionBarVisibilityCallback {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public class ActionModeImpl extends ActionMode implements Callback {
        public final Context c;
        public final MenuBuilder d;
        public androidx.appcompat.view.ActionMode.Callback e;
        public WeakReference f;
        public final WindowDecorActionBar g;

        public ActionModeImpl(Context context0, androidx.appcompat.view.ActionMode.Callback actionMode$Callback0) {
            this.c = context0;
            this.e = actionMode$Callback0;
            MenuBuilder menuBuilder0 = new MenuBuilder(context0).setDefaultShowAsAction(1);
            this.d = menuBuilder0;
            menuBuilder0.setCallback(this);
        }

        public boolean dispatchOnCreate() {
            this.d.stopDispatchingItemsChanged();
            try {
                return this.e.onCreateActionMode(this, this.d);
            }
            finally {
                this.d.startDispatchingItemsChanged();
            }
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void finish() {
            WindowDecorActionBar windowDecorActionBar0 = WindowDecorActionBar.this;
            if(windowDecorActionBar0.n != this) {
                return;
            }
            if(windowDecorActionBar0.v || windowDecorActionBar0.w) {
                windowDecorActionBar0.o = this;
                windowDecorActionBar0.p = this.e;
            }
            else {
                this.e.onDestroyActionMode(this);
            }
            this.e = null;
            windowDecorActionBar0.animateToMode(false);
            windowDecorActionBar0.g.closeMode();
            windowDecorActionBar0.d.setHideOnContentScrollEnabled(windowDecorActionBar0.B);
            windowDecorActionBar0.n = null;
        }

        @Override  // androidx.appcompat.view.ActionMode
        public View getCustomView() {
            return this.f == null ? null : ((View)this.f.get());
        }

        @Override  // androidx.appcompat.view.ActionMode
        public Menu getMenu() {
            return this.d;
        }

        @Override  // androidx.appcompat.view.ActionMode
        public MenuInflater getMenuInflater() {
            return new SupportMenuInflater(this.c);
        }

        @Override  // androidx.appcompat.view.ActionMode
        public CharSequence getSubtitle() {
            return WindowDecorActionBar.this.g.getSubtitle();
        }

        @Override  // androidx.appcompat.view.ActionMode
        public CharSequence getTitle() {
            return WindowDecorActionBar.this.g.getTitle();
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void invalidate() {
            if(WindowDecorActionBar.this.n != this) {
                return;
            }
            this.d.stopDispatchingItemsChanged();
            try {
                this.e.onPrepareActionMode(this, this.d);
            }
            finally {
                this.d.startDispatchingItemsChanged();
            }
        }

        @Override  // androidx.appcompat.view.ActionMode
        public boolean isTitleOptional() {
            return WindowDecorActionBar.this.g.isTitleOptional();
        }

        public void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        }

        public void onCloseSubMenu(SubMenuBuilder subMenuBuilder0) {
        }

        @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
            return this.e == null ? false : this.e.onActionItemClicked(this, menuItem0);
        }

        @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder0) {
            if(this.e == null) {
                return;
            }
            this.invalidate();
            WindowDecorActionBar.this.g.showOverflowMenu();
        }

        public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder0) {
            if(this.e == null) {
                return false;
            }
            if(!subMenuBuilder0.hasVisibleItems()) {
                return true;
            }
            new MenuPopupHelper(WindowDecorActionBar.this.getThemedContext(), subMenuBuilder0).show();
            return true;
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void setCustomView(View view0) {
            WindowDecorActionBar.this.g.setCustomView(view0);
            this.f = new WeakReference(view0);
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void setSubtitle(int v) {
            this.setSubtitle(WindowDecorActionBar.this.a.getResources().getString(v));
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void setSubtitle(CharSequence charSequence0) {
            WindowDecorActionBar.this.g.setSubtitle(charSequence0);
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void setTitle(int v) {
            this.setTitle(WindowDecorActionBar.this.a.getResources().getString(v));
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void setTitle(CharSequence charSequence0) {
            WindowDecorActionBar.this.g.setTitle(charSequence0);
        }

        @Override  // androidx.appcompat.view.ActionMode
        public void setTitleOptionalHint(boolean z) {
            super.setTitleOptionalHint(z);
            WindowDecorActionBar.this.g.setTitleOptional(z);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public class TabImpl extends Tab {
        public TabListener a;
        public Object b;
        public Drawable c;
        public CharSequence d;
        public CharSequence e;
        public int f;
        public View g;
        public final WindowDecorActionBar h;

        public TabImpl() {
            this.f = -1;
        }

        public TabListener getCallback() {
            return this.a;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public CharSequence getContentDescription() {
            return this.e;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public View getCustomView() {
            return this.g;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Drawable getIcon() {
            return this.c;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public int getPosition() {
            return this.f;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Object getTag() {
            return this.b;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public CharSequence getText() {
            return this.d;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public void select() {
            WindowDecorActionBar.this.selectTab(this);
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setContentDescription(int v) {
            return this.setContentDescription(WindowDecorActionBar.this.a.getResources().getText(v));
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setContentDescription(CharSequence charSequence0) {
            this.e = charSequence0;
            int v = this.f;
            if(v >= 0) {
                WindowDecorActionBar.this.i.updateTab(v);
            }
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setCustomView(int v) {
            return this.setCustomView(LayoutInflater.from(WindowDecorActionBar.this.getThemedContext()).inflate(v, null));
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setCustomView(View view0) {
            this.g = view0;
            int v = this.f;
            if(v >= 0) {
                WindowDecorActionBar.this.i.updateTab(v);
            }
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setIcon(int v) {
            return this.setIcon(AppCompatResources.getDrawable(WindowDecorActionBar.this.a, v));
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setIcon(Drawable drawable0) {
            this.c = drawable0;
            int v = this.f;
            if(v >= 0) {
                WindowDecorActionBar.this.i.updateTab(v);
            }
            return this;
        }

        public void setPosition(int v) {
            this.f = v;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setTabListener(TabListener actionBar$TabListener0) {
            this.a = actionBar$TabListener0;
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setTag(Object object0) {
            this.b = object0;
            return this;
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setText(int v) {
            return this.setText(WindowDecorActionBar.this.a.getResources().getText(v));
        }

        @Override  // androidx.appcompat.app.ActionBar$Tab
        public Tab setText(CharSequence charSequence0) {
            this.d = charSequence0;
            int v = this.f;
            if(v >= 0) {
                WindowDecorActionBar.this.i.updateTab(v);
            }
            return this;
        }
    }

    public boolean A;
    public boolean B;
    public final x0 C;
    public final x0 D;
    public final s0 E;
    public static final AccelerateInterpolator F;
    public static final DecelerateInterpolator G;
    public Context a;
    public Context b;
    public final Activity c;
    public ActionBarOverlayLayout d;
    public ActionBarContainer e;
    public DecorToolbar f;
    public ActionBarContextView g;
    public final View h;
    public ScrollingTabContainerView i;
    public final ArrayList j;
    public TabImpl k;
    public int l;
    public boolean m;
    public ActionModeImpl n;
    public ActionModeImpl o;
    public androidx.appcompat.view.ActionMode.Callback p;
    public boolean q;
    public final ArrayList r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public ViewPropertyAnimatorCompatSet z;

    static {
        WindowDecorActionBar.F = new AccelerateInterpolator();
        WindowDecorActionBar.G = new DecelerateInterpolator();
    }

    public WindowDecorActionBar(Activity activity0, boolean z) {
        this.j = new ArrayList();
        this.l = -1;
        this.r = new ArrayList();
        this.t = 0;
        this.u = true;
        this.y = true;
        this.C = new x0(this, 0);
        this.D = new x0(this, 1);
        this.E = new s0(this);
        this.c = activity0;
        View view0 = activity0.getWindow().getDecorView();
        this.d(view0);
        if(!z) {
            this.h = view0.findViewById(0x1020002);
        }
    }

    public WindowDecorActionBar(Dialog dialog0) {
        this.j = new ArrayList();
        this.l = -1;
        this.r = new ArrayList();
        this.t = 0;
        this.u = true;
        this.y = true;
        this.C = new x0(this, 0);
        this.D = new x0(this, 1);
        this.E = new s0(this);
        this.d(dialog0.getWindow().getDecorView());
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public WindowDecorActionBar(View view0) {
        this.j = new ArrayList();
        this.l = -1;
        this.r = new ArrayList();
        this.t = 0;
        this.u = true;
        this.y = true;
        this.C = new x0(this, 0);
        this.D = new x0(this, 1);
        this.E = new s0(this);
        this.d(view0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(OnMenuVisibilityListener actionBar$OnMenuVisibilityListener0) {
        this.r.add(actionBar$OnMenuVisibilityListener0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void addTab(Tab actionBar$Tab0) {
        this.addTab(actionBar$Tab0, this.j.isEmpty());
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void addTab(Tab actionBar$Tab0, int v) {
        this.addTab(actionBar$Tab0, v, this.j.isEmpty());
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void addTab(Tab actionBar$Tab0, int v, boolean z) {
        this.c();
        this.i.addTab(actionBar$Tab0, v, z);
        this.b(actionBar$Tab0, v);
        if(z) {
            this.selectTab(actionBar$Tab0);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void addTab(Tab actionBar$Tab0, boolean z) {
        this.c();
        this.i.addTab(actionBar$Tab0, z);
        this.b(actionBar$Tab0, this.j.size());
        if(z) {
            this.selectTab(actionBar$Tab0);
        }
    }

    public void animateToMode(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0;
        if(!z) {
            if(this.x) {
                this.x = false;
                this.f(false);
            }
        }
        else if(!this.x) {
            this.x = true;
            this.f(false);
        }
        if(ViewCompat.isLaidOut(this.e)) {
            if(z) {
                viewPropertyAnimatorCompat0 = this.f.setupAnimatorToVisibility(4, 100L);
                viewPropertyAnimatorCompat1 = this.g.setupAnimatorToVisibility(0, 200L);
            }
            else {
                viewPropertyAnimatorCompat1 = this.f.setupAnimatorToVisibility(0, 200L);
                viewPropertyAnimatorCompat0 = this.g.setupAnimatorToVisibility(8, 100L);
            }
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = new ViewPropertyAnimatorCompatSet();
            viewPropertyAnimatorCompatSet0.playSequentially(viewPropertyAnimatorCompat0, viewPropertyAnimatorCompat1);
            viewPropertyAnimatorCompatSet0.start();
            return;
        }
        if(z) {
            this.f.setVisibility(4);
            this.g.setVisibility(0);
            return;
        }
        this.f.setVisibility(0);
        this.g.setVisibility(8);
    }

    public final void b(Tab actionBar$Tab0, int v) {
        if(((TabImpl)actionBar$Tab0).getCallback() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        ((TabImpl)actionBar$Tab0).setPosition(v);
        ArrayList arrayList0 = this.j;
        arrayList0.add(v, ((TabImpl)actionBar$Tab0));
        int v1 = arrayList0.size();
        while(true) {
            ++v;
            if(v >= v1) {
                break;
            }
            ((TabImpl)arrayList0.get(v)).setPosition(v);
        }
    }

    public final void c() {
        if(this.i != null) {
            return;
        }
        ScrollingTabContainerView scrollingTabContainerView0 = new ScrollingTabContainerView(this.a);
        if(this.s) {
            scrollingTabContainerView0.setVisibility(0);
            this.f.setEmbeddedTabView(scrollingTabContainerView0);
        }
        else {
            if(this.getNavigationMode() == 2) {
                scrollingTabContainerView0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout0 = this.d;
                if(actionBarOverlayLayout0 != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout0);
                }
            }
            else {
                scrollingTabContainerView0.setVisibility(8);
            }
            this.e.setTabContainer(scrollingTabContainerView0);
        }
        this.i = scrollingTabContainerView0;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
        if(this.f != null && this.f.hasExpandedActionView()) {
            this.f.collapseActionView();
            return true;
        }
        return false;
    }

    public final void d(View view0) {
        DecorToolbar decorToolbar0;
        ActionBarOverlayLayout actionBarOverlayLayout0 = (ActionBarOverlayLayout)view0.findViewById(id.decor_content_parent);
        this.d = actionBarOverlayLayout0;
        if(actionBarOverlayLayout0 != null) {
            actionBarOverlayLayout0.setActionBarVisibilityCallback(this);
        }
        View view1 = view0.findViewById(id.action_bar);
        if(view1 instanceof DecorToolbar) {
            decorToolbar0 = (DecorToolbar)view1;
        }
        else if(view1 instanceof Toolbar) {
            decorToolbar0 = ((Toolbar)view1).getWrapper();
        }
        else {
            throw new IllegalStateException("Can\'t make a decor toolbar out of " + (view1 == null ? "null" : view1.getClass().getSimpleName()));
        }
        this.f = decorToolbar0;
        this.g = (ActionBarContextView)view0.findViewById(id.action_context_bar);
        ActionBarContainer actionBarContainer0 = (ActionBarContainer)view0.findViewById(id.action_bar_container);
        this.e = actionBarContainer0;
        DecorToolbar decorToolbar1 = this.f;
        if(decorToolbar1 == null || this.g == null || actionBarContainer0 == null) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = decorToolbar1.getContext();
        boolean z = (this.f.getDisplayOptions() & 4) != 0;
        if(z) {
            this.m = true;
        }
        ActionBarPolicy actionBarPolicy0 = ActionBarPolicy.get(this.a);
        this.setHomeButtonEnabled(actionBarPolicy0.enableHomeButtonByDefault() || z);
        this.e(actionBarPolicy0.hasEmbeddedTabs());
        TypedArray typedArray0 = this.a.obtainStyledAttributes(null, styleable.ActionBar, attr.actionBarStyle, 0);
        if(typedArray0.getBoolean(styleable.ActionBar_hideOnContentScroll, false)) {
            this.setHideOnContentScrollEnabled(true);
        }
        int v = typedArray0.getDimensionPixelSize(styleable.ActionBar_elevation, 0);
        if(v != 0) {
            this.setElevation(((float)v));
        }
        typedArray0.recycle();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean z) {
        if(z == this.q) {
            return;
        }
        this.q = z;
        ArrayList arrayList0 = this.r;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((OnMenuVisibilityListener)arrayList0.get(v1)).onMenuVisibilityChanged(z);
        }
    }

    public void doHide(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = this.z;
        if(viewPropertyAnimatorCompatSet0 != null) {
            viewPropertyAnimatorCompatSet0.cancel();
        }
        x0 x00 = this.C;
        if(this.t == 0 && (this.A || z)) {
            this.e.setAlpha(1.0f);
            this.e.setTransitioning(true);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet1 = new ViewPropertyAnimatorCompatSet();
            float f = (float)(-this.e.getHeight());
            if(z) {
                int[] arr_v = {0, 0};
                this.e.getLocationInWindow(arr_v);
                f -= (float)arr_v[1];
            }
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = ViewCompat.animate(this.e).translationY(f);
            viewPropertyAnimatorCompat0.setUpdateListener(this.E);
            viewPropertyAnimatorCompatSet1.play(viewPropertyAnimatorCompat0);
            if(this.u) {
                View view0 = this.h;
                if(view0 != null) {
                    viewPropertyAnimatorCompatSet1.play(ViewCompat.animate(view0).translationY(f));
                }
            }
            viewPropertyAnimatorCompatSet1.setInterpolator(WindowDecorActionBar.F);
            viewPropertyAnimatorCompatSet1.setDuration(0xFAL);
            viewPropertyAnimatorCompatSet1.setListener(x00);
            this.z = viewPropertyAnimatorCompatSet1;
            viewPropertyAnimatorCompatSet1.start();
            return;
        }
        x00.onAnimationEnd(null);
    }

    public void doShow(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = this.z;
        if(viewPropertyAnimatorCompatSet0 != null) {
            viewPropertyAnimatorCompatSet0.cancel();
        }
        this.e.setVisibility(0);
        View view0 = this.h;
        x0 x00 = this.D;
        if(this.t != 0 || !this.A && !z) {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if(this.u && view0 != null) {
                view0.setTranslationY(0.0f);
            }
            x00.onAnimationEnd(null);
        }
        else {
            this.e.setTranslationY(0.0f);
            float f = (float)(-this.e.getHeight());
            if(z) {
                int[] arr_v = {0, 0};
                this.e.getLocationInWindow(arr_v);
                f -= (float)arr_v[1];
            }
            this.e.setTranslationY(f);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet1 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = ViewCompat.animate(this.e).translationY(0.0f);
            viewPropertyAnimatorCompat0.setUpdateListener(this.E);
            viewPropertyAnimatorCompatSet1.play(viewPropertyAnimatorCompat0);
            if(this.u && view0 != null) {
                view0.setTranslationY(f);
                viewPropertyAnimatorCompatSet1.play(ViewCompat.animate(view0).translationY(0.0f));
            }
            viewPropertyAnimatorCompatSet1.setInterpolator(WindowDecorActionBar.G);
            viewPropertyAnimatorCompatSet1.setDuration(0xFAL);
            viewPropertyAnimatorCompatSet1.setListener(x00);
            this.z = viewPropertyAnimatorCompatSet1;
            viewPropertyAnimatorCompatSet1.start();
        }
        ActionBarOverlayLayout actionBarOverlayLayout0 = this.d;
        if(actionBarOverlayLayout0 != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout0);
        }
    }

    public final void e(boolean z) {
        this.s = z;
        if(z) {
            this.e.setTabContainer(null);
            this.f.setEmbeddedTabView(this.i);
        }
        else {
            this.f.setEmbeddedTabView(null);
            this.e.setTabContainer(this.i);
        }
        boolean z1 = true;
        boolean z2 = this.getNavigationMode() == 2;
        ScrollingTabContainerView scrollingTabContainerView0 = this.i;
        if(scrollingTabContainerView0 != null) {
            if(z2) {
                scrollingTabContainerView0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout0 = this.d;
                if(actionBarOverlayLayout0 != null) {
                    ViewCompat.requestApplyInsets(actionBarOverlayLayout0);
                }
            }
            else {
                scrollingTabContainerView0.setVisibility(8);
            }
        }
        this.f.setCollapsible(!this.s && z2);
        ActionBarOverlayLayout actionBarOverlayLayout1 = this.d;
        if(this.s || !z2) {
            z1 = false;
        }
        actionBarOverlayLayout1.setHasNonEmbeddedTabs(z1);
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void enableContentAnimations(boolean z) {
        this.u = z;
    }

    public final void f(boolean z) {
        if(this.x || !this.v && !this.w) {
            if(!this.y) {
                this.y = true;
                this.doShow(z);
            }
        }
        else if(this.y) {
            this.y = false;
            this.doHide(z);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public View getCustomView() {
        return this.f.getCustomView();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
        return this.f.getDisplayOptions();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public float getElevation() {
        return ViewCompat.getElevation(this.e);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int getHeight() {
        return this.e.getHeight();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int getHideOffset() {
        return this.d.getActionBarHideOffset();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
        switch(this.f.getNavigationMode()) {
            case 1: {
                return this.f.getDropdownItemCount();
            }
            case 2: {
                return this.j.size();
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
        return this.f.getNavigationMode();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
        switch(this.f.getNavigationMode()) {
            case 1: {
                return this.f.getDropdownSelectedPosition();
            }
            case 2: {
                return this.k == null ? -1 : this.k.getPosition();
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab getSelectedTab() {
        return this.k;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public CharSequence getSubtitle() {
        return this.f.getSubtitle();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab getTabAt(int v) {
        return (Tab)this.j.get(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public int getTabCount() {
        return this.j.size();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Context getThemedContext() {
        if(this.b == null) {
            TypedValue typedValue0 = new TypedValue();
            this.a.getTheme().resolveAttribute(attr.actionBarWidgetTheme, typedValue0, true);
            int v = typedValue0.resourceId;
            if(v != 0) {
                this.b = new ContextThemeWrapper(this.a, v);
                return this.b;
            }
            this.b = this.a;
        }
        return this.b;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public CharSequence getTitle() {
        return this.f.getTitle();
    }

    public boolean hasIcon() {
        return this.f.hasIcon();
    }

    public boolean hasLogo() {
        return this.f.hasLogo();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void hide() {
        if(!this.v) {
            this.v = true;
            this.f(false);
        }
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void hideForSystem() {
        if(!this.w) {
            this.w = true;
            this.f(true);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
        return this.d.isHideOnContentScrollEnabled();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
        int v = this.getHeight();
        return this.y && (v == 0 || this.getHideOffset() < v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
        return this.f != null && this.f.isTitleTruncated();
    }

    @Override  // androidx.appcompat.app.ActionBar
    public Tab newTab() {
        return new TabImpl(this);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(Configuration configuration0) {
        this.e(ActionBarPolicy.get(this.a).hasEmbeddedTabs());
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void onContentScrollStarted() {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = this.z;
        if(viewPropertyAnimatorCompatSet0 != null) {
            viewPropertyAnimatorCompatSet0.cancel();
            this.z = null;
        }
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void onContentScrollStopped() {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int v, KeyEvent keyEvent0) {
        ActionModeImpl windowDecorActionBar$ActionModeImpl0 = this.n;
        if(windowDecorActionBar$ActionModeImpl0 == null) {
            return false;
        }
        Menu menu0 = windowDecorActionBar$ActionModeImpl0.getMenu();
        if(menu0 != null) {
            menu0.setQwertyMode(KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1);
            return menu0.performShortcut(v, keyEvent0, 0);
        }
        return false;
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int v) {
        this.t = v;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
        if(this.k != null) {
            this.selectTab(null);
        }
        this.j.clear();
        ScrollingTabContainerView scrollingTabContainerView0 = this.i;
        if(scrollingTabContainerView0 != null) {
            scrollingTabContainerView0.removeAllTabs();
        }
        this.l = -1;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(OnMenuVisibilityListener actionBar$OnMenuVisibilityListener0) {
        this.r.remove(actionBar$OnMenuVisibilityListener0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void removeTab(Tab actionBar$Tab0) {
        this.removeTabAt(actionBar$Tab0.getPosition());
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void removeTabAt(int v) {
        if(this.i == null) {
            return;
        }
        int v1 = this.k == null ? this.l : this.k.getPosition();
        this.i.removeTabAt(v);
        ArrayList arrayList0 = this.j;
        TabImpl windowDecorActionBar$TabImpl0 = (TabImpl)arrayList0.remove(v);
        if(windowDecorActionBar$TabImpl0 != null) {
            windowDecorActionBar$TabImpl0.setPosition(-1);
        }
        int v2 = arrayList0.size();
        for(int v3 = v; v3 < v2; ++v3) {
            ((TabImpl)arrayList0.get(v3)).setPosition(v3);
        }
        if(v1 == v) {
            this.selectTab((arrayList0.isEmpty() ? null : ((Tab)arrayList0.get(Math.max(0, v - 1)))));
        }
    }

    public boolean requestFocus() {
        ViewGroup viewGroup0 = this.f.getViewGroup();
        if(viewGroup0 != null && !viewGroup0.hasFocus()) {
            viewGroup0.requestFocus();
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void selectTab(Tab actionBar$Tab0) {
        int v = -1;
        if(this.getNavigationMode() != 2) {
            if(actionBar$Tab0 != null) {
                v = actionBar$Tab0.getPosition();
            }
            this.l = v;
            return;
        }
        FragmentTransaction fragmentTransaction0 = !(this.c instanceof FragmentActivity) || this.f.getViewGroup().isInEditMode() ? null : ((FragmentActivity)this.c).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        TabImpl windowDecorActionBar$TabImpl0 = this.k;
        if(windowDecorActionBar$TabImpl0 != actionBar$Tab0) {
            ScrollingTabContainerView scrollingTabContainerView0 = this.i;
            if(actionBar$Tab0 != null) {
                v = actionBar$Tab0.getPosition();
            }
            scrollingTabContainerView0.setTabSelected(v);
            TabImpl windowDecorActionBar$TabImpl1 = this.k;
            if(windowDecorActionBar$TabImpl1 != null) {
                windowDecorActionBar$TabImpl1.getCallback().onTabUnselected(this.k, fragmentTransaction0);
            }
            this.k = (TabImpl)actionBar$Tab0;
            if(((TabImpl)actionBar$Tab0) != null) {
                ((TabImpl)actionBar$Tab0).getCallback().onTabSelected(this.k, fragmentTransaction0);
            }
        }
        else if(windowDecorActionBar$TabImpl0 != null) {
            windowDecorActionBar$TabImpl0.getCallback().onTabReselected(this.k, fragmentTransaction0);
            this.i.animateToTab(actionBar$Tab0.getPosition());
        }
        if(fragmentTransaction0 != null && !fragmentTransaction0.isEmpty()) {
            fragmentTransaction0.commit();
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(Drawable drawable0) {
        this.e.setPrimaryBackground(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setCustomView(int v) {
        this.setCustomView(LayoutInflater.from(this.getThemedContext()).inflate(v, this.f.getViewGroup(), false));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setCustomView(View view0) {
        this.f.setCustomView(view0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setCustomView(View view0, LayoutParams actionBar$LayoutParams0) {
        view0.setLayoutParams(actionBar$LayoutParams0);
        this.f.setCustomView(view0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if(!this.m) {
            this.setDisplayHomeAsUpEnabled(z);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean z) {
        this.setDisplayOptions((z ? 4 : 0), 4);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int v) {
        if((v & 4) != 0) {
            this.m = true;
        }
        this.f.setDisplayOptions(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int v, int v1) {
        int v2 = this.f.getDisplayOptions();
        if((v1 & 4) != 0) {
            this.m = true;
        }
        this.f.setDisplayOptions(v & v1 | ~v1 & v2);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean z) {
        this.setDisplayOptions((z ? 16 : 0), 16);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean z) {
        this.setDisplayOptions((z ? 2 : 0), 2);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean z) {
        this.setDisplayOptions((z ? 8 : 0), 8);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean z) {
        this.setDisplayOptions(((int)z), 1);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setElevation(float f) {
        ViewCompat.setElevation(this.e, f);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setHideOffset(int v) {
        if(v != 0 && !this.d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.d.setActionBarHideOffset(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean z) {
        if(z && !this.d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.B = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int v) {
        this.f.setNavigationContentDescription(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(CharSequence charSequence0) {
        this.f.setNavigationContentDescription(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int v) {
        this.f.setNavigationIcon(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(Drawable drawable0) {
        this.f.setNavigationIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean z) {
        this.f.setHomeButtonEnabled(z);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setIcon(int v) {
        this.f.setIcon(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setIcon(Drawable drawable0) {
        this.f.setIcon(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter0, OnNavigationListener actionBar$OnNavigationListener0) {
        this.f.setDropdownParams(spinnerAdapter0, new o0(actionBar$OnNavigationListener0));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setLogo(int v) {
        this.f.setLogo(v);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setLogo(Drawable drawable0) {
        this.f.setLogo(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int v) {
        int v1 = this.f.getNavigationMode();
        if(v1 == 2) {
            this.l = this.getSelectedNavigationIndex();
            this.selectTab(null);
            this.i.setVisibility(8);
        }
        if(v1 != v && !this.s) {
            ActionBarOverlayLayout actionBarOverlayLayout0 = this.d;
            if(actionBarOverlayLayout0 != null) {
                ViewCompat.requestApplyInsets(actionBarOverlayLayout0);
            }
        }
        this.f.setNavigationMode(v);
        boolean z = false;
        if(v == 2) {
            this.c();
            this.i.setVisibility(0);
            int v2 = this.l;
            if(v2 != -1) {
                this.setSelectedNavigationItem(v2);
                this.l = -1;
            }
        }
        this.f.setCollapsible(v == 2 && !this.s);
        ActionBarOverlayLayout actionBarOverlayLayout1 = this.d;
        if(v == 2 && !this.s) {
            z = true;
        }
        actionBarOverlayLayout1.setHasNonEmbeddedTabs(z);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int v) {
        switch(this.f.getNavigationMode()) {
            case 1: {
                this.f.setDropdownSelectedPosition(v);
                return;
            }
            case 2: {
                this.selectTab(((Tab)this.j.get(v)));
                return;
            }
            default: {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean z) {
        this.A = z;
        if(!z) {
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = this.z;
            if(viewPropertyAnimatorCompatSet0 != null) {
                viewPropertyAnimatorCompatSet0.cancel();
            }
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(Drawable drawable0) {
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(Drawable drawable0) {
        this.e.setStackedBackground(drawable0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setSubtitle(int v) {
        this.setSubtitle(this.a.getString(v));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setSubtitle(CharSequence charSequence0) {
        this.f.setSubtitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setTitle(int v) {
        this.setTitle(this.a.getString(v));
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setTitle(CharSequence charSequence0) {
        this.f.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void setWindowTitle(CharSequence charSequence0) {
        this.f.setWindowTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.ActionBar
    public void show() {
        if(this.v) {
            this.v = false;
            this.f(false);
        }
    }

    @Override  // androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback
    public void showForSystem() {
        if(this.w) {
            this.w = false;
            this.f(true);
        }
    }

    @Override  // androidx.appcompat.app.ActionBar
    public ActionMode startActionMode(androidx.appcompat.view.ActionMode.Callback actionMode$Callback0) {
        ActionModeImpl windowDecorActionBar$ActionModeImpl0 = this.n;
        if(windowDecorActionBar$ActionModeImpl0 != null) {
            windowDecorActionBar$ActionModeImpl0.finish();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.killMode();
        ActionModeImpl windowDecorActionBar$ActionModeImpl1 = new ActionModeImpl(this, this.g.getContext(), actionMode$Callback0);
        if(windowDecorActionBar$ActionModeImpl1.dispatchOnCreate()) {
            this.n = windowDecorActionBar$ActionModeImpl1;
            windowDecorActionBar$ActionModeImpl1.invalidate();
            this.g.initForMode(windowDecorActionBar$ActionModeImpl1);
            this.animateToMode(true);
            return windowDecorActionBar$ActionModeImpl1;
        }
        return null;
    }
}

