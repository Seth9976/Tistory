package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar.OnMenuItemClickListener;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.m2;
import androidx.compose.ui.platform.m0;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class SearchView extends FrameLayout implements AttachedBehavior, MaterialBackHandler {
    public static class Behavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior {
        public Behavior() {
        }

        public Behavior(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
            return this.onDependentViewChanged(coordinatorLayout0, ((SearchView)view0), view1);
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull SearchView searchView0, @NonNull View view0) {
            if(!searchView0.isSetupWithSearchBar() && view0 instanceof SearchBar) {
                searchView0.setupWithSearchBar(((SearchBar)view0));
            }
            return false;
        }
    }

    public interface TransitionListener {
        void onStateChanged(@NonNull SearchView arg1, @NonNull TransitionState arg2, @NonNull TransitionState arg3);
    }

    public static enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN;

    }

    public boolean A;
    public TransitionState B;
    public HashMap C;
    public static final int D;
    public final View a;
    public final ClippableRoundedCornerLayout b;
    public final View c;
    public final View d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final MaterialToolbar g;
    public final Toolbar h;
    public final TextView i;
    public final EditText j;
    public final ImageButton k;
    public final View l;
    public final TouchObserverFrameLayout m;
    public final boolean n;
    public final u o;
    public final MaterialBackOrchestrator p;
    public final boolean q;
    public final ElevationOverlayProvider r;
    public final LinkedHashSet s;
    public SearchBar t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final int y;
    public boolean z;

    static {
        SearchView.D = style.Widget_Material3_SearchView;
    }

    public SearchView(@NonNull Context context0) {
        this(context0, null);
    }

    public SearchView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialSearchViewStyle);
    }

    public SearchView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, SearchView.D), attributeSet0, v);
        this.p = new MaterialBackOrchestrator(this);
        this.s = new LinkedHashSet();
        this.u = 16;
        this.B = TransitionState.HIDDEN;
        Context context1 = this.getContext();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.SearchView, v, SearchView.D, new int[0]);
        this.y = typedArray0.getColor(styleable.SearchView_backgroundTint, 0);
        int v1 = typedArray0.getResourceId(styleable.SearchView_headerLayout, -1);
        int v2 = typedArray0.getResourceId(styleable.SearchView_android_textAppearance, -1);
        String s = typedArray0.getString(styleable.SearchView_android_text);
        String s1 = typedArray0.getString(styleable.SearchView_android_hint);
        String s2 = typedArray0.getString(styleable.SearchView_searchPrefixText);
        boolean z = typedArray0.getBoolean(styleable.SearchView_useDrawerArrowDrawable, false);
        this.v = typedArray0.getBoolean(styleable.SearchView_animateNavigationIcon, true);
        this.w = typedArray0.getBoolean(styleable.SearchView_animateMenuItems, true);
        boolean z1 = typedArray0.getBoolean(styleable.SearchView_hideNavigationIcon, false);
        this.x = typedArray0.getBoolean(styleable.SearchView_autoShowKeyboard, true);
        this.q = typedArray0.getBoolean(styleable.SearchView_backHandlingEnabled, true);
        typedArray0.recycle();
        LayoutInflater.from(context1).inflate(layout.mtrl_search_view, this);
        this.n = true;
        this.a = this.findViewById(id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout0 = (ClippableRoundedCornerLayout)this.findViewById(id.open_search_view_root);
        this.b = clippableRoundedCornerLayout0;
        this.c = this.findViewById(id.open_search_view_background);
        View view0 = this.findViewById(id.open_search_view_status_bar_spacer);
        this.d = view0;
        this.e = (FrameLayout)this.findViewById(id.open_search_view_header_container);
        this.f = (FrameLayout)this.findViewById(id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar0 = (MaterialToolbar)this.findViewById(id.open_search_view_toolbar);
        this.g = materialToolbar0;
        this.h = (Toolbar)this.findViewById(id.open_search_view_dummy_toolbar);
        this.i = (TextView)this.findViewById(id.open_search_view_search_prefix);
        EditText editText0 = (EditText)this.findViewById(id.open_search_view_edit_text);
        this.j = editText0;
        ImageButton imageButton0 = (ImageButton)this.findViewById(id.open_search_view_clear_button);
        this.k = imageButton0;
        View view1 = this.findViewById(id.open_search_view_divider);
        this.l = view1;
        TouchObserverFrameLayout touchObserverFrameLayout0 = (TouchObserverFrameLayout)this.findViewById(id.open_search_view_content_container);
        this.m = touchObserverFrameLayout0;
        this.o = new u(this);
        this.r = new ElevationOverlayProvider(context1);
        clippableRoundedCornerLayout0.setOnTouchListener(new m());  // 初始化器: Ljava/lang/Object;-><init>()V
        this.setUpBackgroundViewElevationOverlay(this.getOverlayElevation());
        this.setUpHeaderLayout(v1);
        this.setSearchPrefixText(s2);
        if(v2 != -1) {
            TextViewCompat.setTextAppearance(editText0, v2);
        }
        editText0.setText(s);
        editText0.setHint(s1);
        if(z1) {
            materialToolbar0.setNavigationIcon(null);
        }
        else {
            materialToolbar0.setNavigationOnClickListener(new i(this, 0));
            if(z) {
                DrawerArrowDrawable drawerArrowDrawable0 = new DrawerArrowDrawable(this.getContext());
                drawerArrowDrawable0.setColor(MaterialColors.getColor(this, attr.colorOnSurface));
                materialToolbar0.setNavigationIcon(drawerArrowDrawable0);
            }
        }
        imageButton0.setOnClickListener(new i(this, 1));
        editText0.addTextChangedListener(new m2(this, 1));
        touchObserverFrameLayout0.setOnTouchListener(new o(this, 1));
        ViewUtils.doOnApplyWindowInsets(materialToolbar0, new l(this));
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
        ViewCompat.setOnApplyWindowInsetsListener(view1, new k(viewGroup$MarginLayoutParams0, viewGroup$MarginLayoutParams0.leftMargin, viewGroup$MarginLayoutParams0.rightMargin));
        this.setUpStatusBarSpacer(this.getStatusBarHeight());
        ViewCompat.setOnApplyWindowInsetsListener(view0, new l(this));
    }

    public static void a(SearchView searchView0, WindowInsetsCompat windowInsetsCompat0) {
        searchView0.getClass();
        int v = windowInsetsCompat0.getSystemWindowInsetTop();
        searchView0.setUpStatusBarSpacer(v);
        if(!searchView0.A) {
            searchView0.setStatusBarSpacerEnabledInternal(v > 0);
        }
    }

    public void addHeaderView(@NonNull View view0) {
        this.e.addView(view0);
        this.e.setVisibility(0);
    }

    public void addTransitionListener(@NonNull TransitionListener searchView$TransitionListener0) {
        this.s.add(searchView$TransitionListener0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(this.n) {
            this.m.addView(view0, v, viewGroup$LayoutParams0);
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    public final boolean b() {
        return this.u == 0x30;
    }

    // 去混淆评级： 低(20)
    public final boolean c() {
        return this.B.equals(TransitionState.HIDDEN) || this.B.equals(TransitionState.HIDING);
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if(!this.c() && this.t != null && Build.VERSION.SDK_INT >= 34) {
            u u0 = this.o;
            u0.m.cancelBackProgress(u0.o);
            AnimatorSet animatorSet0 = u0.n;
            if(animatorSet0 != null) {
                animatorSet0.reverse();
            }
            u0.n = null;
        }
    }

    public void clearFocusAndHideKeyboard() {
        j j0 = new j(this, 0);
        this.j.post(j0);
    }

    public void clearText() {
        this.j.setText("");
    }

    public final void d(TransitionState searchView$TransitionState0, boolean z) {
        if(this.B.equals(searchView$TransitionState0)) {
            return;
        }
        if(z) {
            if(searchView$TransitionState0 == TransitionState.SHOWN) {
                this.setModalForAccessibility(true);
            }
            else if(searchView$TransitionState0 == TransitionState.HIDDEN) {
                this.setModalForAccessibility(false);
            }
        }
        TransitionState searchView$TransitionState1 = this.B;
        this.B = searchView$TransitionState0;
        for(Object object0: new LinkedHashSet(this.s)) {
            ((TransitionListener)object0).onStateChanged(this, searchView$TransitionState1, searchView$TransitionState0);
        }
        this.f(searchView$TransitionState0);
    }

    public final void e(ViewGroup viewGroup0, boolean z) {
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            View view0 = viewGroup0.getChildAt(v);
            if(view0 != this) {
                if(view0.findViewById(this.b.getId()) != null) {
                    this.e(((ViewGroup)view0), z);
                }
                else if(z) {
                    this.C.put(view0, view0.getImportantForAccessibility());
                    ViewCompat.setImportantForAccessibility(view0, 4);
                }
                else if(this.C != null && this.C.containsKey(view0)) {
                    ViewCompat.setImportantForAccessibility(view0, ((int)(((Integer)this.C.get(view0)))));
                }
            }
        }
    }

    public final void f(TransitionState searchView$TransitionState0) {
        if(this.t != null && this.q) {
            boolean z = searchView$TransitionState0.equals(TransitionState.SHOWN);
            MaterialBackOrchestrator materialBackOrchestrator0 = this.p;
            if(z) {
                materialBackOrchestrator0.startListeningForBackCallbacks();
                return;
            }
            if(searchView$TransitionState0.equals(TransitionState.HIDDEN)) {
                materialBackOrchestrator0.stopListeningForBackCallbacks();
            }
        }
    }

    public final void g() {
        ImageButton imageButton0 = ToolbarUtils.getNavigationIconButton(this.g);
        if(imageButton0 == null) {
            return;
        }
        int v = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable drawable0 = DrawableCompat.unwrap(imageButton0.getDrawable());
        if(drawable0 instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable)drawable0).setProgress(((float)v));
        }
        if(drawable0 instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable)drawable0).setProgress(((float)v));
        }
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activity0 = ContextUtils.getActivity(this.getContext());
        return activity0 == null ? null : activity0.getWindow();
    }

    @VisibleForTesting
    public MaterialMainContainerBackHelper getBackHelper() {
        return this.o.m;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.B;
    }

    @DrawableRes
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() [...] // 潜在的解密器

    @NonNull
    public EditText getEditText() {
        return this.j;
    }

    @Nullable
    public CharSequence getHint() {
        return this.j.getHint();
    }

    private float getOverlayElevation() {
        SearchBar searchBar0 = this.t;
        return searchBar0 == null ? this.getResources().getDimension(dimen.m3_searchview_elevation) : searchBar0.getCompatElevation();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.i;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.u;
    }

    @Px
    private int getStatusBarHeight() {
        int v = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return v <= 0 ? 0 : this.getResources().getDimensionPixelSize(v);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @NonNull
    public Editable getText() {
        return this.j.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.g;
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if(this.c()) {
            return;
        }
        u u0 = this.o;
        BackEventCompat backEventCompat0 = u0.m.onHandleBackInvoked();
        if(Build.VERSION.SDK_INT >= 34 && this.t != null && backEventCompat0 != null) {
            long v = u0.j().getTotalDuration();
            u0.m.finishBackProgress(v, u0.o);
            if(u0.n != null) {
                u0.c(false).start();
                u0.n.resume();
            }
            u0.n = null;
            return;
        }
        this.hide();
    }

    public void hide() {
        if(!this.B.equals(TransitionState.HIDDEN) && !this.B.equals(TransitionState.HIDING)) {
            this.o.j();
        }
    }

    public void inflateMenu(@MenuRes int v) {
        this.g.inflateMenu(v);
    }

    public boolean isAnimatedNavigationIcon() {
        return this.v;
    }

    public boolean isAutoShowKeyboard() {
        return this.x;
    }

    public boolean isMenuItemsAnimated() {
        return this.w;
    }

    public boolean isSetupWithSearchBar() {
        return this.t != null;
    }

    // 去混淆评级： 低(20)
    public boolean isShowing() {
        return this.B.equals(TransitionState.SHOWN) || this.B.equals(TransitionState.SHOWING);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.z;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override  // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.updateSoftInputMode();
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof n)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((n)parcelable0).getSuperState());
        this.setText(((n)parcelable0).b);
        this.setVisible(((n)parcelable0).c == 0);
    }

    @Override  // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new n(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        Editable editable0 = this.getText();
        parcelable0.b = editable0 == null ? null : editable0.toString();
        parcelable0.c = this.b.getVisibility();
        return parcelable0;
    }

    public void removeAllHeaderViews() {
        this.e.removeAllViews();
        this.e.setVisibility(8);
    }

    public void removeHeaderView(@NonNull View view0) {
        FrameLayout frameLayout0 = this.e;
        frameLayout0.removeView(view0);
        if(frameLayout0.getChildCount() == 0) {
            frameLayout0.setVisibility(8);
        }
    }

    public void removeTransitionListener(@NonNull TransitionListener searchView$TransitionListener0) {
        this.s.remove(searchView$TransitionListener0);
    }

    public void requestFocusAndShowKeyboard() {
        j j0 = new j(this, 1);
        this.j.postDelayed(j0, 100L);
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.v = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.x = z;
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        this.setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(@StringRes int v) {
        this.j.setHint(v);
    }

    public void setHint(@Nullable CharSequence charSequence0) {
        this.j.setHint(charSequence0);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.w = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup0 = (ViewGroup)this.getRootView();
        if(z) {
            this.C = new HashMap(viewGroup0.getChildCount());
        }
        this.e(viewGroup0, z);
        if(!z) {
            this.C = null;
        }
    }

    public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener toolbar$OnMenuItemClickListener0) {
        this.g.setOnMenuItemClickListener(toolbar$OnMenuItemClickListener0);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence0) {
        this.i.setText(charSequence0);
        int v = TextUtils.isEmpty(charSequence0) ? 8 : 0;
        this.i.setVisibility(v);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z) {
        this.A = true;
        this.setStatusBarSpacerEnabledInternal(z);
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.d.setVisibility((z ? 0 : 8));
    }

    public void setText(@StringRes int v) {
        this.j.setText(v);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence0) {
        this.j.setText(charSequence0);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.g.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(@NonNull TransitionState searchView$TransitionState0) {
        this.d(searchView$TransitionState0, true);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        ElevationOverlayProvider elevationOverlayProvider0 = this.r;
        if(elevationOverlayProvider0 != null) {
            View view0 = this.c;
            if(view0 != null) {
                view0.setBackgroundColor(elevationOverlayProvider0.compositeOverlayIfNeeded(this.y, f));
            }
        }
    }

    private void setUpHeaderLayout(int v) {
        if(v != -1) {
            this.addHeaderView(LayoutInflater.from(this.getContext()).inflate(v, this.e, false));
        }
    }

    private void setUpStatusBarSpacer(@Px int v) {
        View view0 = this.d;
        if(view0.getLayoutParams().height != v) {
            view0.getLayoutParams().height = v;
            view0.requestLayout();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z) {
        this.z = z;
    }

    public void setVisible(boolean z) {
        boolean z1 = true;
        boolean z2 = this.b.getVisibility() == 0;
        this.b.setVisibility((z ? 0 : 8));
        this.g();
        TransitionState searchView$TransitionState0 = z ? TransitionState.SHOWN : TransitionState.HIDDEN;
        if(z2 == z) {
            z1 = false;
        }
        this.d(searchView$TransitionState0, z1);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar0) {
        this.t = searchBar0;
        this.o.o = searchBar0;
        if(searchBar0 != null) {
            searchBar0.setOnClickListener(new i(this, 2));
            if(Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar0.setHandwritingDelegatorCallback(new j(this, 2));
                    m0.q(this.j);
                }
                catch(LinkageError unused_ex) {
                }
            }
        }
        MaterialToolbar materialToolbar0 = this.g;
        if(materialToolbar0 != null && !(DrawableCompat.unwrap(materialToolbar0.getNavigationIcon()) instanceof DrawerArrowDrawable)) {
            if(this.t == null) {
                materialToolbar0.setNavigationIcon(0x7F070110);  // drawable:ic_arrow_back_black_24
            }
            else {
                Drawable drawable0 = DrawableCompat.wrap(AppCompatResources.getDrawable(this.getContext(), 0x7F070110).mutate());  // drawable:ic_arrow_back_black_24
                if(materialToolbar0.getNavigationIconTint() != null) {
                    DrawableCompat.setTint(drawable0, ((int)materialToolbar0.getNavigationIconTint()));
                }
                materialToolbar0.setNavigationIcon(new FadeThroughDrawable(this.t.getNavigationIcon(), drawable0));
                this.g();
            }
        }
        this.setUpBackgroundViewElevationOverlay(this.getOverlayElevation());
        this.f(this.getCurrentTransitionState());
    }

    public void show() {
        if(!this.B.equals(TransitionState.SHOWN)) {
            TransitionState searchView$TransitionState0 = TransitionState.SHOWING;
            if(!this.B.equals(searchView$TransitionState0)) {
                u u0 = this.o;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout0 = u0.c;
                SearchView searchView0 = u0.a;
                if(u0.o != null) {
                    if(searchView0.b() && searchView0.x) {
                        searchView0.requestFocusAndShowKeyboard();
                    }
                    searchView0.setTransitionState(searchView$TransitionState0);
                    Toolbar toolbar0 = u0.g;
                    Menu menu0 = toolbar0.getMenu();
                    if(menu0 != null) {
                        menu0.clear();
                    }
                    if(u0.o.getMenuResId() == -1 || !searchView0.isMenuItemsAnimated()) {
                        toolbar0.setVisibility(8);
                    }
                    else {
                        toolbar0.inflateMenu(u0.o.getMenuResId());
                        ActionMenuView actionMenuView0 = ToolbarUtils.getActionMenuView(toolbar0);
                        if(actionMenuView0 != null) {
                            for(int v = 0; v < actionMenuView0.getChildCount(); ++v) {
                                View view0 = actionMenuView0.getChildAt(v);
                                view0.setClickable(false);
                                view0.setFocusable(false);
                                view0.setFocusableInTouchMode(false);
                            }
                        }
                        toolbar0.setVisibility(0);
                    }
                    CharSequence charSequence0 = u0.o.getText();
                    u0.i.setText(charSequence0);
                    int v1 = u0.i.getText().length();
                    u0.i.setSelection(v1);
                    clippableRoundedCornerLayout0.setVisibility(4);
                    clippableRoundedCornerLayout0.post(new p(u0, 0));
                    return;
                }
                if(searchView0.b()) {
                    searchView0.postDelayed(new j(searchView0, 3), 150L);
                }
                clippableRoundedCornerLayout0.setVisibility(4);
                clippableRoundedCornerLayout0.post(new p(u0, 1));
            }
        }
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat0) {
        if(!this.c() && this.t != null) {
            this.o.m.startBackProgress(backEventCompat0, this.o.o);
        }
    }

    @Override  // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat0) {
        if(!this.c() && this.t != null && Build.VERSION.SDK_INT >= 34) {
            u u0 = this.o;
            u0.getClass();
            if(backEventCompat0.getProgress() > 0.0f) {
                SearchBar searchBar0 = u0.o;
                float f = searchBar0.getCornerSize();
                u0.m.updateBackProgress(backEventCompat0, searchBar0, f);
                AnimatorSet animatorSet0 = u0.n;
                if(animatorSet0 == null) {
                    SearchView searchView0 = u0.a;
                    if(searchView0.b()) {
                        searchView0.clearFocusAndHideKeyboard();
                    }
                    if(searchView0.isAnimatedNavigationIcon()) {
                        AnimatorSet animatorSet1 = new AnimatorSet();
                        u0.b(animatorSet1);
                        animatorSet1.setDuration(0xFAL);
                        animatorSet1.setInterpolator(ReversableAnimatedValueInterpolator.of(false, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
                        u0.n = animatorSet1;
                        animatorSet1.start();
                        u0.n.pause();
                    }
                }
                else {
                    animatorSet0.setCurrentPlayTime(((long)(backEventCompat0.getProgress() * ((float)u0.n.getDuration()))));
                }
            }
        }
    }

    public void updateSoftInputMode() {
        Window window0 = this.getActivityWindow();
        if(window0 != null) {
            this.u = window0.getAttributes().softInputMode;
        }
    }
}

