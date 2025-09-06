package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.appcompat.widget.p2;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.integer;
import com.google.android.material.R.string;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import j7.d;
import y7.a;
import y7.b;

@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements ItemView {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public BadgeDrawable F;
    public static final int[] G;
    public static final d H;
    public static final b I;
    public boolean a;
    public ColorStateList b;
    public Drawable c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public int j;
    public boolean k;
    public final FrameLayout l;
    public final View m;
    public final ImageView n;
    public final ViewGroup o;
    public final TextView p;
    public final TextView q;
    public int r;
    public int s;
    public MenuItemImpl t;
    public ColorStateList u;
    public Drawable v;
    public Drawable w;
    public ValueAnimator x;
    public d y;
    public float z;

    static {
        NavigationBarItemView.G = new int[]{0x10100A0};
        NavigationBarItemView.H = new d(15);
        NavigationBarItemView.I = new b(15);  // 初始化器: Lj7/d;-><init>(I)V
    }

    public NavigationBarItemView(@NonNull Context context0) {
        super(context0);
        this.a = false;
        this.r = -1;
        this.s = 0;
        this.y = NavigationBarItemView.H;
        this.z = 0.0f;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.E = 0;
        LayoutInflater.from(context0).inflate(this.getItemLayoutResId(), this, true);
        this.l = (FrameLayout)this.findViewById(id.navigation_bar_item_icon_container);
        this.m = this.findViewById(id.navigation_bar_item_active_indicator_view);
        ImageView imageView0 = (ImageView)this.findViewById(id.navigation_bar_item_icon_view);
        this.n = imageView0;
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(id.navigation_bar_item_labels_group);
        this.o = viewGroup0;
        TextView textView0 = (TextView)this.findViewById(id.navigation_bar_item_small_label_view);
        this.p = textView0;
        TextView textView1 = (TextView)this.findViewById(id.navigation_bar_item_large_label_view);
        this.q = textView1;
        this.setBackgroundResource(0x7F070380);  // drawable:mtrl_navigation_bar_item_background
        this.d = this.getResources().getDimensionPixelSize(this.getItemDefaultMarginResId());
        this.e = viewGroup0.getPaddingBottom();
        this.f = this.getResources().getDimensionPixelSize(dimen.m3_navigation_item_active_indicator_label_padding);
        ViewCompat.setImportantForAccessibility(textView0, 2);
        ViewCompat.setImportantForAccessibility(textView1, 2);
        this.setFocusable(true);
        this.a(textView0.getTextSize(), textView1.getTextSize());
        if(imageView0 != null) {
            imageView0.addOnLayoutChangeListener(new p2(this, 2));
        }
    }

    public final void a(float f, float f1) {
        this.g = f - f1;
        this.h = f1 * 1.0f / f;
        this.i = f * 1.0f / f1;
    }

    public final void b() {
        MenuItemImpl menuItemImpl0 = this.t;
        if(menuItemImpl0 != null) {
            this.setChecked(menuItemImpl0.isChecked());
        }
    }

    public final void c() {
        Drawable drawable0 = this.c;
        FrameLayout frameLayout0 = this.l;
        Drawable drawable1 = null;
        boolean z = true;
        if(this.b != null) {
            Drawable drawable2 = this.getActiveIndicatorDrawable();
            if(this.A && this.getActiveIndicatorDrawable() != null && frameLayout0 != null && drawable2 != null) {
                drawable1 = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.b), null, drawable2);
                z = false;
            }
            else if(drawable0 == null) {
                drawable0 = new RippleDrawable(RippleUtils.convertToRippleDrawableColor(this.b), null, null);
            }
        }
        if(frameLayout0 != null) {
            frameLayout0.setPadding(0, 0, 0, 0);
            frameLayout0.setForeground(drawable1);
        }
        ViewCompat.setBackground(this, drawable0);
        this.setDefaultFocusHighlightEnabled(z);
    }

    public final void d(float f, float f1) {
        View view0 = this.m;
        if(view0 != null) {
            d d0 = this.y;
            d0.getClass();
            view0.setScaleX(AnimationUtils.lerp(0.4f, 1.0f, f));
            view0.setScaleY(d0.c(f, f1));
            int v = Float.compare(f1, 0.0f);
            view0.setAlpha(AnimationUtils.lerp(0.0f, 1.0f, (v == 0 ? 0.8f : 0.0f), (v == 0 ? 1.0f : 0.2f), f));
        }
        this.z = f;
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        FrameLayout frameLayout0 = this.l;
        if(frameLayout0 != null && this.A) {
            frameLayout0.dispatchTouchEvent(motionEvent0);
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    public static void e(View view0, float f, float f1, int v) {
        view0.setScaleX(f);
        view0.setScaleY(f1);
        view0.setVisibility(v);
    }

    public static void f(int v, View view0, int v1) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
        frameLayout$LayoutParams0.topMargin = v;
        frameLayout$LayoutParams0.bottomMargin = v;
        frameLayout$LayoutParams0.gravity = v1;
        view0.setLayoutParams(frameLayout$LayoutParams0);
    }

    public final void g(int v) {
        View view0 = this.m;
        if(view0 != null && v > 0) {
            int v1 = Math.min(this.B, v - this.E * 2);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)view0.getLayoutParams();
            frameLayout$LayoutParams0.height = !this.D || this.j != 2 ? this.C : v1;
            frameLayout$LayoutParams0.width = v1;
            view0.setLayoutParams(frameLayout$LayoutParams0);
        }
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        return this.m == null ? null : this.m.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.F;
    }

    private View getIconOrContainer() {
        View view0 = this.l;
        return view0 == null ? this.n : view0;
    }

    @DrawableRes
    public int getItemBackgroundResId() [...] // 潜在的解密器

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    @Nullable
    public MenuItemImpl getItemData() {
        return this.t;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.r;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup0 = (ViewGroup)this.getParent();
        int v = viewGroup0.indexOfChild(this);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof NavigationBarItemView && view0.getVisibility() == 0) {
                ++v2;
            }
        }
        return v2;
    }

    private int getSuggestedIconHeight() {
        int v = ((FrameLayout.LayoutParams)this.getIconOrContainer().getLayoutParams()).topMargin;
        return this.getIconOrContainer().getMeasuredHeight() + v;
    }

    private int getSuggestedIconWidth() {
        int v = this.F == null ? 0 : this.F.getMinimumWidth() - this.F.getHorizontalOffset();
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.getIconOrContainer().getLayoutParams();
        int v1 = Math.max(v, frameLayout$LayoutParams0.leftMargin);
        int v2 = this.n.getMeasuredWidth();
        return Math.max(v, frameLayout$LayoutParams0.rightMargin) + (v2 + v1);
    }

    @Override  // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.o.getLayoutParams();
        int v = this.getSuggestedIconHeight() + (this.o.getVisibility() == 0 ? this.f : 0) + frameLayout$LayoutParams0.topMargin;
        return this.o.getMeasuredHeight() + v + frameLayout$LayoutParams0.bottomMargin;
    }

    @Override  // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.o.getLayoutParams();
        int v = frameLayout$LayoutParams0.leftMargin;
        int v1 = this.o.getMeasuredWidth() + v + frameLayout$LayoutParams0.rightMargin;
        return Math.max(this.getSuggestedIconWidth(), v1);
    }

    public static void h(int v, View view0) {
        view0.setPadding(view0.getPaddingLeft(), view0.getPaddingTop(), view0.getPaddingRight(), v);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void initialize(@NonNull MenuItemImpl menuItemImpl0, int v) {
        this.t = menuItemImpl0;
        this.setCheckable(menuItemImpl0.isCheckable());
        this.setChecked(menuItemImpl0.isChecked());
        this.setEnabled(menuItemImpl0.isEnabled());
        this.setIcon(menuItemImpl0.getIcon());
        this.setTitle(menuItemImpl0.getTitle());
        this.setId(menuItemImpl0.getItemId());
        if(!TextUtils.isEmpty(menuItemImpl0.getContentDescription())) {
            this.setContentDescription(menuItemImpl0.getContentDescription());
        }
        TooltipCompat.setTooltipText(this, (TextUtils.isEmpty(menuItemImpl0.getTooltipText()) ? menuItemImpl0.getTitle() : menuItemImpl0.getTooltipText()));
        this.setVisibility((menuItemImpl0.isVisible() ? 0 : 8));
        this.a = true;
    }

    @Override  // android.view.ViewGroup
    @NonNull
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.t != null && this.t.isCheckable() && this.t.isChecked()) {
            View.mergeDrawableStates(arr_v, NavigationBarItemView.G);
        }
        return arr_v;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        if(this.F != null && this.F.isVisible()) {
            CharSequence charSequence0 = this.t.getTitle();
            if(!TextUtils.isEmpty(this.t.getContentDescription())) {
                charSequence0 = this.t.getContentDescription();
            }
            accessibilityNodeInfo0.setContentDescription(charSequence0 + ", " + this.F.getContentDescription());
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0);
        accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(0, 1, this.getItemVisiblePosition(), 1, false, this.isSelected()));
        if(this.isSelected()) {
            accessibilityNodeInfoCompat0.setClickable(false);
            accessibilityNodeInfoCompat0.removeAction(AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompat0.setRoleDescription(this.getResources().getString(string.item_view_role_description));
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.post(new androidx.work.impl.foreground.b(this, v, 4));
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable0) {
        View view0 = this.m;
        if(view0 == null) {
            return;
        }
        view0.setBackgroundDrawable(drawable0);
        this.c();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.A = z;
        this.c();
        View view0 = this.m;
        if(view0 != null) {
            view0.setVisibility((z ? 0 : 8));
            this.requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int v) {
        this.C = v;
        this.g(this.getWidth());
    }

    public void setActiveIndicatorLabelPadding(int v) {
        if(this.f != v) {
            this.f = v;
            this.b();
        }
    }

    public void setActiveIndicatorMarginHorizontal(@Px int v) {
        this.E = v;
        this.g(this.getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.D = z;
    }

    public void setActiveIndicatorWidth(int v) {
        this.B = v;
        this.g(this.getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable0) {
        BadgeDrawable badgeDrawable1 = this.F;
        if(badgeDrawable1 == badgeDrawable0) {
            return;
        }
        FrameLayout frameLayout0 = null;
        ImageView imageView0 = this.n;
        if(badgeDrawable1 != null && imageView0 != null) {
            Log.w("NavigationBar", "Multiple badges shouldn\'t be attached to one item.");
            if(this.F != null) {
                this.setClipChildren(true);
                this.setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.F, imageView0);
                this.F = null;
            }
        }
        this.F = badgeDrawable0;
        if(imageView0 != null && badgeDrawable0 != null) {
            this.setClipChildren(false);
            this.setClipToPadding(false);
            BadgeDrawable badgeDrawable2 = this.F;
            if(BadgeUtils.USE_COMPAT_PARENT) {
                frameLayout0 = (FrameLayout)imageView0.getParent();
            }
            BadgeUtils.attachBadgeDrawable(badgeDrawable2, imageView0, frameLayout0);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setCheckable(boolean z) {
        this.refreshDrawableState();
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setChecked(boolean z) {
        TextView textView0 = this.q;
        textView0.setPivotX(((float)(textView0.getWidth() / 2)));
        textView0.setPivotY(((float)textView0.getBaseline()));
        TextView textView1 = this.p;
        textView1.setPivotX(((float)(textView1.getWidth() / 2)));
        textView1.setPivotY(((float)textView1.getBaseline()));
        if(!this.A || !this.a || !ViewCompat.isAttachedToWindow(this)) {
            this.d((z ? 1.0f : 0.0f), (z ? 1.0f : 0.0f));
        }
        else {
            ValueAnimator valueAnimator0 = this.x;
            if(valueAnimator0 != null) {
                valueAnimator0.cancel();
                this.x = null;
            }
            ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{this.z, (z ? 1.0f : 0.0f)});
            this.x = valueAnimator1;
            valueAnimator1.addUpdateListener(new a(this, (z ? 1.0f : 0.0f)));
            this.x.setInterpolator(MotionUtils.resolveThemeInterpolator(this.getContext(), attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.x.setDuration(((long)MotionUtils.resolveThemeDuration(this.getContext(), attr.motionDurationLong2, this.getResources().getInteger(integer.material_motion_duration_long_1))));
            this.x.start();
        }
        ViewGroup viewGroup0 = this.o;
        switch(this.j) {
            case -1: {
                if(!this.k) {
                    NavigationBarItemView.h(this.e, viewGroup0);
                    if(z) {
                        View view2 = this.getIconOrContainer();
                        NavigationBarItemView.f(((int)(((float)this.d) + this.g)), view2, 49);
                        NavigationBarItemView.e(textView0, 1.0f, 1.0f, 0);
                        NavigationBarItemView.e(textView1, this.h, this.h, 4);
                    }
                    else {
                        View view3 = this.getIconOrContainer();
                        NavigationBarItemView.f(this.d, view3, 49);
                        NavigationBarItemView.e(textView0, this.i, this.i, 4);
                        NavigationBarItemView.e(textView1, 1.0f, 1.0f, 0);
                    }
                }
                else if(z) {
                    View view0 = this.getIconOrContainer();
                    NavigationBarItemView.f(this.d, view0, 49);
                    NavigationBarItemView.h(this.e, viewGroup0);
                    textView0.setVisibility(0);
                    textView1.setVisibility(4);
                }
                else {
                    View view1 = this.getIconOrContainer();
                    NavigationBarItemView.f(this.d, view1, 17);
                    NavigationBarItemView.h(0, viewGroup0);
                    textView0.setVisibility(4);
                    textView1.setVisibility(4);
                }
                break;
            }
            case 0: {
                if(z) {
                    View view4 = this.getIconOrContainer();
                    NavigationBarItemView.f(this.d, view4, 49);
                    NavigationBarItemView.h(this.e, viewGroup0);
                    textView0.setVisibility(0);
                }
                else {
                    View view5 = this.getIconOrContainer();
                    NavigationBarItemView.f(this.d, view5, 17);
                    NavigationBarItemView.h(0, viewGroup0);
                    textView0.setVisibility(4);
                }
                textView1.setVisibility(4);
                break;
            }
            case 1: {
                NavigationBarItemView.h(this.e, viewGroup0);
                if(z) {
                    View view6 = this.getIconOrContainer();
                    NavigationBarItemView.f(((int)(((float)this.d) + this.g)), view6, 49);
                    NavigationBarItemView.e(textView0, 1.0f, 1.0f, 0);
                    NavigationBarItemView.e(textView1, this.h, this.h, 4);
                }
                else {
                    View view7 = this.getIconOrContainer();
                    NavigationBarItemView.f(this.d, view7, 49);
                    NavigationBarItemView.e(textView0, this.i, this.i, 4);
                    NavigationBarItemView.e(textView1, 1.0f, 1.0f, 0);
                }
                break;
            }
            case 2: {
                View view8 = this.getIconOrContainer();
                NavigationBarItemView.f(this.d, view8, 17);
                textView0.setVisibility(8);
                textView1.setVisibility(8);
            }
        }
        this.refreshDrawableState();
        this.setSelected(z);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.p.setEnabled(z);
        this.q.setEnabled(z);
        this.n.setEnabled(z);
        if(z) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(this.getContext(), 1002));
            return;
        }
        ViewCompat.setPointerIcon(this, null);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setIcon(@Nullable Drawable drawable0) {
        if(drawable0 == this.v) {
            return;
        }
        this.v = drawable0;
        if(drawable0 != null) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 != null) {
                drawable0 = drawable$ConstantState0.newDrawable();
            }
            drawable0 = drawable0.mutate();
            this.w = drawable0;
            ColorStateList colorStateList0 = this.u;
            if(colorStateList0 != null) {
                DrawableCompat.setTintList(drawable0, colorStateList0);
            }
        }
        this.n.setImageDrawable(drawable0);
    }

    public void setIconSize(int v) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.n.getLayoutParams();
        frameLayout$LayoutParams0.width = v;
        frameLayout$LayoutParams0.height = v;
        this.n.setLayoutParams(frameLayout$LayoutParams0);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList0) {
        this.u = colorStateList0;
        if(this.t != null) {
            Drawable drawable0 = this.w;
            if(drawable0 != null) {
                DrawableCompat.setTintList(drawable0, colorStateList0);
                this.w.invalidateSelf();
            }
        }
    }

    public void setItemBackground(int v) {
        this.setItemBackground((v == 0 ? null : ContextCompat.getDrawable(this.getContext(), v)));
    }

    public void setItemBackground(@Nullable Drawable drawable0) {
        if(drawable0 != null && drawable0.getConstantState() != null) {
            drawable0 = drawable0.getConstantState().newDrawable().mutate();
        }
        this.c = drawable0;
        this.c();
    }

    public void setItemPaddingBottom(int v) {
        if(this.e != v) {
            this.e = v;
            this.b();
        }
    }

    public void setItemPaddingTop(int v) {
        if(this.d != v) {
            this.d = v;
            this.b();
        }
    }

    public void setItemPosition(int v) {
        this.r = v;
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList0) {
        this.b = colorStateList0;
        this.c();
    }

    public void setLabelVisibilityMode(int v) {
        if(this.j != v) {
            this.j = v;
            this.y = !this.D || v != 2 ? NavigationBarItemView.H : NavigationBarItemView.I;
            this.g(this.getWidth());
            this.b();
        }
    }

    public void setShifting(boolean z) {
        if(this.k != z) {
            this.k = z;
            this.b();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@StyleRes int v) {
        this.s = v;
        TextView textView0 = this.q;
        TextViewCompat.setTextAppearance(textView0, v);
        int v1 = MaterialResources.getUnscaledTextSize(textView0.getContext(), v, 0);
        if(v1 != 0) {
            textView0.setTextSize(0, ((float)v1));
        }
        this.a(this.p.getTextSize(), textView0.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.setTextAppearanceActive(this.s);
        Typeface typeface0 = this.q.getTypeface();
        this.q.setTypeface(typeface0, ((int)z));
    }

    public void setTextAppearanceInactive(@StyleRes int v) {
        TextView textView0 = this.p;
        TextViewCompat.setTextAppearance(textView0, v);
        int v1 = MaterialResources.getUnscaledTextSize(textView0.getContext(), v, 0);
        if(v1 != 0) {
            textView0.setTextSize(0, ((float)v1));
        }
        this.a(textView0.getTextSize(), this.q.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList0) {
        if(colorStateList0 != null) {
            this.p.setTextColor(colorStateList0);
            this.q.setTextColor(colorStateList0);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public void setTitle(@Nullable CharSequence charSequence0) {
        this.p.setText(charSequence0);
        this.q.setText(charSequence0);
        if(this.t == null || TextUtils.isEmpty(this.t.getContentDescription())) {
            this.setContentDescription(charSequence0);
        }
        if(this.t != null && !TextUtils.isEmpty(this.t.getTooltipText())) {
            charSequence0 = this.t.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, charSequence0);
    }

    @Override  // androidx.appcompat.view.menu.MenuView$ItemView
    public boolean showsIcon() {
        return true;
    }
}

