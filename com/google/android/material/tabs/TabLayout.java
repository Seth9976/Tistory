package com.google.android.material.tabs;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.appcompat.widget.y1;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools.SimplePool;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.DecorView;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.g;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import e8.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@DecorView
public class TabLayout extends HorizontalScrollView {
    @Deprecated
    public interface BaseOnTabSelectedListener {
        void onTabReselected(Tab arg1);

        void onTabSelected(Tab arg1);

        void onTabUnselected(Tab arg1);
    }

    public @interface LabelVisibility {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabSelectedListener extends BaseOnTabSelectedListener {
    }

    public static class Tab {
        public static final int INVALID_POSITION = -1;
        public Object a;
        public Drawable b;
        public CharSequence c;
        public CharSequence d;
        public int e;
        public View f;
        public int g;
        public int h;
        @Nullable
        public TabLayout parent;
        @NonNull
        public TabView view;

        public Tab() {
            this.e = -1;
            this.g = 1;
            this.h = -1;
        }

        public final void a() {
            TabView tabLayout$TabView0 = this.view;
            if(tabLayout$TabView0 != null) {
                tabLayout$TabView0.h();
                tabLayout$TabView0.setSelected(tabLayout$TabView0.a != null && tabLayout$TabView0.a.isSelected());
            }
        }

        @Nullable
        public BadgeDrawable getBadge() {
            return TabView.a(this.view);
        }

        @Nullable
        public CharSequence getContentDescription() {
            return this.view == null ? null : this.view.getContentDescription();
        }

        @Nullable
        public View getCustomView() {
            return this.f;
        }

        @Nullable
        public Drawable getIcon() {
            return this.b;
        }

        public int getId() {
            return this.h;
        }

        @NonNull
        public BadgeDrawable getOrCreateBadge() {
            return TabView.b(this.view);
        }

        public int getPosition() {
            return this.e;
        }

        @LabelVisibility
        public int getTabLabelVisibility() {
            return this.g;
        }

        @Nullable
        public Object getTag() {
            return this.a;
        }

        @Nullable
        public CharSequence getText() {
            return this.c;
        }

        public boolean isSelected() {
            TabLayout tabLayout0 = this.parent;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int v = tabLayout0.getSelectedTabPosition();
            return v != -1 && v == this.e;
        }

        public void removeBadge() {
            TabView tabLayout$TabView0 = this.view;
            if(tabLayout$TabView0.d != null) {
                tabLayout$TabView0.d();
            }
            tabLayout$TabView0.e = null;
        }

        public void select() {
            TabLayout tabLayout0 = this.parent;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout0.selectTab(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setContentDescription(@StringRes int v) {
            TabLayout tabLayout0 = this.parent;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return this.setContentDescription(tabLayout0.getResources().getText(v));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setContentDescription(@Nullable CharSequence charSequence0) {
            this.d = charSequence0;
            this.a();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setCustomView(@LayoutRes int v) {
            return this.setCustomView(LayoutInflater.from(this.view.getContext()).inflate(v, this.view, false));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setCustomView(@Nullable View view0) {
            this.f = view0;
            this.a();
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setIcon(@DrawableRes int v) {
            TabLayout tabLayout0 = this.parent;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return this.setIcon(AppCompatResources.getDrawable(tabLayout0.getContext(), v));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setIcon(@Nullable Drawable drawable0) {
            this.b = drawable0;
            TabLayout tabLayout0 = this.parent;
            if(tabLayout0.z == 1 || tabLayout0.C == 2) {
                tabLayout0.l(true);
            }
            this.a();
            if(BadgeUtils.USE_COMPAT_PARENT && this.view.c() && this.view.e.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setId(int v) {
            this.h = v;
            TabView tabLayout$TabView0 = this.view;
            if(tabLayout$TabView0 != null) {
                tabLayout$TabView0.setId(v);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setTabLabelVisibility(@LabelVisibility int v) {
            this.g = v;
            TabLayout tabLayout0 = this.parent;
            if(tabLayout0.z == 1 || tabLayout0.C == 2) {
                tabLayout0.l(true);
            }
            this.a();
            if(BadgeUtils.USE_COMPAT_PARENT && this.view.c() && this.view.e.isVisible()) {
                this.view.invalidate();
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setTag(@Nullable Object object0) {
            this.a = object0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setText(@StringRes int v) {
            TabLayout tabLayout0 = this.parent;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return this.setText(tabLayout0.getResources().getText(v));
        }

        @NonNull
        @CanIgnoreReturnValue
        public Tab setText(@Nullable CharSequence charSequence0) {
            if(TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence0)) {
                this.view.setContentDescription(charSequence0);
            }
            this.c = charSequence0;
            this.a();
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorAnimationMode {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabIndicatorGravity {
    }

    public static class TabLayoutOnPageChangeListener implements OnPageChangeListener {
        public final WeakReference a;
        public int b;
        public int c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout0) {
            this.a = new WeakReference(tabLayout0);
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void onPageScrollStateChanged(int v) {
            this.b = this.c;
            this.c = v;
            TabLayout tabLayout0 = (TabLayout)this.a.get();
            if(tabLayout0 != null) {
                tabLayout0.U = this.c;
            }
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void onPageScrolled(int v, float f, int v1) {
            Object object0 = this.a.get();
            if(((TabLayout)object0) != null) {
                ((TabLayout)object0).j(v, f, this.c != 2 || this.b == 1, this.c != 2 || this.b != 0, false);
            }
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void onPageSelected(int v) {
            TabLayout tabLayout0 = (TabLayout)this.a.get();
            if(tabLayout0 != null && tabLayout0.getSelectedTabPosition() != v && v < tabLayout0.getTabCount()) {
                boolean z = this.c == 0 || this.c == 2 && this.b == 0;
                tabLayout0.selectTab(tabLayout0.getTabAt(v), z);
            }
        }
    }

    public final class TabView extends LinearLayout {
        public Tab a;
        public TextView b;
        public ImageView c;
        public View d;
        public BadgeDrawable e;
        public View f;
        public TextView g;
        public ImageView h;
        public Drawable i;
        public int j;
        public final TabLayout k;
        public static final int l;

        public TabView(@NonNull Context context0) {
            super(context0);
            this.j = 2;
            this.g(context0);
            ViewCompat.setPaddingRelative(this, tabLayout0.e, tabLayout0.f, tabLayout0.g, tabLayout0.h);
            this.setGravity(17);
            this.setOrientation(!tabLayout0.D);
            this.setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(this.getContext(), 1002));
        }

        public static BadgeDrawable a(TabView tabLayout$TabView0) {
            return tabLayout$TabView0.getBadge();
        }

        public static BadgeDrawable b(TabView tabLayout$TabView0) {
            return tabLayout$TabView0.getOrCreateBadge();
        }

        public final boolean c() {
            return this.e != null;
        }

        public final void d() {
            if(!this.c()) {
                return;
            }
            this.setClipChildren(true);
            this.setClipToPadding(true);
            ViewGroup viewGroup0 = (ViewGroup)this.getParent();
            if(viewGroup0 != null) {
                viewGroup0.setClipChildren(true);
                viewGroup0.setClipToPadding(true);
            }
            View view0 = this.d;
            if(view0 != null) {
                BadgeUtils.detachBadgeDrawable(this.e, view0);
                this.d = null;
            }
        }

        @Override  // android.view.ViewGroup
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] arr_v = this.getDrawableState();
            if((this.i == null || !this.i.isStateful() ? false : this.i.setState(arr_v))) {
                this.invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            FrameLayout frameLayout0 = null;
            if(!this.c()) {
                return;
            }
            if(this.f != null) {
                this.d();
                return;
            }
            if(this.c != null && (this.a != null && this.a.getIcon() != null)) {
                ImageView imageView0 = this.c;
                if(this.d == imageView0) {
                    this.f(imageView0);
                    return;
                }
                this.d();
                ImageView imageView1 = this.c;
                if(this.c() && imageView1 != null) {
                    this.setClipChildren(false);
                    this.setClipToPadding(false);
                    ViewGroup viewGroup0 = (ViewGroup)this.getParent();
                    if(viewGroup0 != null) {
                        viewGroup0.setClipChildren(false);
                        viewGroup0.setClipToPadding(false);
                    }
                    BadgeDrawable badgeDrawable0 = this.e;
                    if((imageView1 == this.c || imageView1 == this.b) && BadgeUtils.USE_COMPAT_PARENT) {
                        frameLayout0 = (FrameLayout)imageView1.getParent();
                    }
                    BadgeUtils.attachBadgeDrawable(badgeDrawable0, imageView1, frameLayout0);
                    this.d = imageView1;
                }
            }
            else if(this.b != null && (this.a != null && this.a.getTabLabelVisibility() == 1)) {
                TextView textView0 = this.b;
                if(this.d == textView0) {
                    this.f(textView0);
                    return;
                }
                this.d();
                TextView textView1 = this.b;
                if(this.c() && textView1 != null) {
                    this.setClipChildren(false);
                    this.setClipToPadding(false);
                    ViewGroup viewGroup1 = (ViewGroup)this.getParent();
                    if(viewGroup1 != null) {
                        viewGroup1.setClipChildren(false);
                        viewGroup1.setClipToPadding(false);
                    }
                    BadgeDrawable badgeDrawable1 = this.e;
                    if((textView1 == this.c || textView1 == this.b) && BadgeUtils.USE_COMPAT_PARENT) {
                        frameLayout0 = (FrameLayout)textView1.getParent();
                    }
                    BadgeUtils.attachBadgeDrawable(badgeDrawable1, textView1, frameLayout0);
                    this.d = textView1;
                }
            }
            else {
                this.d();
            }
        }

        public final void f(View view0) {
            if(this.c() && view0 == this.d) {
                BadgeUtils.setBadgeDrawableBounds(this.e, view0, (view0 != this.c && view0 != this.b || !BadgeUtils.USE_COMPAT_PARENT ? null : ((FrameLayout)view0.getParent())));
            }
        }

        public final void g(Context context0) {
            TabLayout tabLayout0 = TabLayout.this;
            int v = tabLayout0.t;
            GradientDrawable gradientDrawable0 = null;
            if(v == 0) {
                this.i = null;
            }
            else {
                Drawable drawable0 = AppCompatResources.getDrawable(context0, v);
                this.i = drawable0;
                if(drawable0 != null && drawable0.isStateful()) {
                    this.i.setState(this.getDrawableState());
                }
            }
            GradientDrawable gradientDrawable1 = new GradientDrawable();
            gradientDrawable1.setColor(0);
            if(tabLayout0.n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(0.00001f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateList0 = RippleUtils.convertToRippleDrawableColor(tabLayout0.n);
                boolean z = tabLayout0.H;
                if(z) {
                    gradientDrawable1 = null;
                }
                if(!z) {
                    gradientDrawable0 = gradientDrawable2;
                }
                gradientDrawable1 = new RippleDrawable(colorStateList0, gradientDrawable1, gradientDrawable0);
            }
            ViewCompat.setBackground(this, gradientDrawable1);
            tabLayout0.invalidate();
        }

        @Nullable
        private BadgeDrawable getBadge() {
            return this.e;
        }

        public int getContentHeight() {
            View[] arr_view = {this.b, this.c, this.f};
            int v = 0;
            int v1 = 0;
            boolean z = false;
            for(int v2 = 0; v2 < 3; ++v2) {
                View view0 = arr_view[v2];
                if(view0 != null && view0.getVisibility() == 0) {
                    v1 = z ? Math.min(v1, view0.getTop()) : view0.getTop();
                    v = z ? Math.max(v, view0.getBottom()) : view0.getBottom();
                    z = true;
                }
            }
            return v - v1;
        }

        public int getContentWidth() {
            View[] arr_view = {this.b, this.c, this.f};
            int v = 0;
            int v1 = 0;
            boolean z = false;
            for(int v2 = 0; v2 < 3; ++v2) {
                View view0 = arr_view[v2];
                if(view0 != null && view0.getVisibility() == 0) {
                    v1 = z ? Math.min(v1, view0.getLeft()) : view0.getLeft();
                    v = z ? Math.max(v, view0.getRight()) : view0.getRight();
                    z = true;
                }
            }
            return v - v1;
        }

        @NonNull
        private BadgeDrawable getOrCreateBadge() {
            if(this.e == null) {
                this.e = BadgeDrawable.create(this.getContext());
            }
            this.e();
            BadgeDrawable badgeDrawable0 = this.e;
            if(badgeDrawable0 == null) {
                throw new IllegalStateException("Unable to create badge");
            }
            return badgeDrawable0;
        }

        @Nullable
        public Tab getTab() {
            return this.a;
        }

        public final void h() {
            FrameLayout frameLayout1;
            FrameLayout frameLayout0;
            Tab tabLayout$Tab0 = this.a;
            View view0 = tabLayout$Tab0 == null ? null : tabLayout$Tab0.getCustomView();
            if(view0 == null) {
                View view2 = this.f;
                if(view2 != null) {
                    this.removeView(view2);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            else {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 != this) {
                    if(viewParent0 != null) {
                        ((ViewGroup)viewParent0).removeView(view0);
                    }
                    View view1 = this.f;
                    if(view1 != null) {
                        ViewParent viewParent1 = view1.getParent();
                        if(viewParent1 != null) {
                            ((ViewGroup)viewParent1).removeView(this.f);
                        }
                    }
                    this.addView(view0);
                }
                this.f = view0;
                TextView textView0 = this.b;
                if(textView0 != null) {
                    textView0.setVisibility(8);
                }
                ImageView imageView0 = this.c;
                if(imageView0 != null) {
                    imageView0.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView1 = (TextView)view0.findViewById(0x1020014);
                this.g = textView1;
                if(textView1 != null) {
                    this.j = TextViewCompat.getMaxLines(textView1);
                }
                this.h = (ImageView)view0.findViewById(0x1020006);
            }
            if(this.f == null) {
                if(this.c == null) {
                    if(BadgeUtils.USE_COMPAT_PARENT) {
                        frameLayout0 = new FrameLayout(this.getContext());
                        frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        this.addView(frameLayout0, 0);
                    }
                    else {
                        frameLayout0 = this;
                    }
                    ImageView imageView1 = (ImageView)LayoutInflater.from(this.getContext()).inflate(layout.design_layout_tab_icon, frameLayout0, false);
                    this.c = imageView1;
                    frameLayout0.addView(imageView1, 0);
                }
                if(this.b == null) {
                    if(BadgeUtils.USE_COMPAT_PARENT) {
                        frameLayout1 = new FrameLayout(this.getContext());
                        frameLayout1.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        this.addView(frameLayout1);
                    }
                    else {
                        frameLayout1 = this;
                    }
                    TextView textView2 = (TextView)LayoutInflater.from(this.getContext()).inflate(layout.design_layout_tab_text, frameLayout1, false);
                    this.b = textView2;
                    frameLayout1.addView(textView2);
                    this.j = TextViewCompat.getMaxLines(this.b);
                }
                TabLayout tabLayout0 = TabLayout.this;
                TextViewCompat.setTextAppearance(this.b, tabLayout0.i);
                if(this.isSelected()) {
                    int v = tabLayout0.k;
                    if(v == -1) {
                        TextViewCompat.setTextAppearance(this.b, tabLayout0.j);
                    }
                    else {
                        TextViewCompat.setTextAppearance(this.b, v);
                    }
                }
                else {
                    TextViewCompat.setTextAppearance(this.b, tabLayout0.j);
                }
                ColorStateList colorStateList0 = tabLayout0.l;
                if(colorStateList0 != null) {
                    this.b.setTextColor(colorStateList0);
                }
                this.i(this.b, this.c, true);
                this.e();
                ImageView imageView2 = this.c;
                if(imageView2 != null) {
                    imageView2.addOnLayoutChangeListener(new b(this, imageView2));
                }
                TextView textView3 = this.b;
                if(textView3 != null) {
                    textView3.addOnLayoutChangeListener(new b(this, textView3));
                }
            }
            else {
                TextView textView4 = this.g;
                if(textView4 != null || this.h != null) {
                    this.i(textView4, this.h, false);
                }
            }
            if(tabLayout$Tab0 != null && !TextUtils.isEmpty(tabLayout$Tab0.d)) {
                this.setContentDescription(tabLayout$Tab0.d);
            }
        }

        public final void i(TextView textView0, ImageView imageView0, boolean z) {
            CharSequence charSequence0 = null;
            Drawable drawable0 = this.a == null || this.a.getIcon() == null ? null : DrawableCompat.wrap(this.a.getIcon()).mutate();
            TabLayout tabLayout0 = TabLayout.this;
            if(drawable0 != null) {
                DrawableCompat.setTintList(drawable0, tabLayout0.m);
                PorterDuff.Mode porterDuff$Mode0 = tabLayout0.q;
                if(porterDuff$Mode0 != null) {
                    DrawableCompat.setTintMode(drawable0, porterDuff$Mode0);
                }
            }
            CharSequence charSequence1 = this.a == null ? null : this.a.getText();
            if(imageView0 != null) {
                if(drawable0 == null) {
                    imageView0.setVisibility(8);
                    imageView0.setImageDrawable(null);
                }
                else {
                    imageView0.setImageDrawable(drawable0);
                    imageView0.setVisibility(0);
                    this.setVisibility(0);
                }
            }
            boolean z1 = true;
            boolean z2 = TextUtils.isEmpty(charSequence1);
            if(textView0 == null) {
                z1 = false;
            }
            else {
                if(z2 || this.a.g != 1) {
                    z1 = false;
                }
                textView0.setText((z2 ? null : charSequence1));
                textView0.setVisibility((z1 ? 0 : 8));
                if(!z2) {
                    this.setVisibility(0);
                }
            }
            if(z && imageView0 != null) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)imageView0.getLayoutParams();
                int v = !z1 || imageView0.getVisibility() != 0 ? 0 : ((int)ViewUtils.dpToPx(this.getContext(), 8));
                if(!tabLayout0.D) {
                    if(v != viewGroup$MarginLayoutParams0.bottomMargin) {
                        viewGroup$MarginLayoutParams0.bottomMargin = v;
                        MarginLayoutParamsCompat.setMarginEnd(viewGroup$MarginLayoutParams0, 0);
                        imageView0.setLayoutParams(viewGroup$MarginLayoutParams0);
                        imageView0.requestLayout();
                    }
                }
                else if(v != MarginLayoutParamsCompat.getMarginEnd(viewGroup$MarginLayoutParams0)) {
                    MarginLayoutParamsCompat.setMarginEnd(viewGroup$MarginLayoutParams0, v);
                    viewGroup$MarginLayoutParams0.bottomMargin = 0;
                    imageView0.setLayoutParams(viewGroup$MarginLayoutParams0);
                    imageView0.requestLayout();
                }
            }
            Tab tabLayout$Tab0 = this.a;
            if(tabLayout$Tab0 != null) {
                charSequence0 = tabLayout$Tab0.d;
            }
            if(z2) {
                charSequence1 = charSequence0;
            }
            TooltipCompat.setTooltipText(this, charSequence1);
        }

        @Override  // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
            if(this.e != null && this.e.isVisible()) {
                accessibilityNodeInfo0.setContentDescription(this.getContentDescription() + ", " + this.e.getContentDescription());
            }
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0);
            accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(0, 1, this.a.getPosition(), 1, false, this.isSelected()));
            if(this.isSelected()) {
                accessibilityNodeInfoCompat0.setClickable(false);
                accessibilityNodeInfoCompat0.removeAction(AccessibilityActionCompat.ACTION_CLICK);
            }
            accessibilityNodeInfoCompat0.setRoleDescription(this.getResources().getString(string.item_view_role_description));
        }

        @Override  // android.widget.LinearLayout
        public void onMeasure(int v, int v1) {
            int v2 = View.MeasureSpec.getSize(v);
            int v3 = View.MeasureSpec.getMode(v);
            TabLayout tabLayout0 = TabLayout.this;
            int v4 = tabLayout0.getTabMaxWidth();
            if(v4 > 0 && (v3 == 0 || v2 > v4)) {
                v = View.MeasureSpec.makeMeasureSpec(tabLayout0.u, 0x80000000);
            }
            super.onMeasure(v, v1);
            if(this.b != null) {
                float f = tabLayout0.r;
                int v5 = this.j;
                if(this.c != null && this.c.getVisibility() == 0) {
                    v5 = 1;
                }
                else if(this.b != null && this.b.getLineCount() > 1) {
                    f = tabLayout0.s;
                }
                float f1 = this.b.getTextSize();
                int v6 = this.b.getLineCount();
                int v7 = TextViewCompat.getMaxLines(this.b);
                int v8 = Float.compare(f, f1);
                if(v8 != 0 || v7 >= 0 && v5 != v7) {
                    if(tabLayout0.C != 1 || v8 <= 0 || v6 != 1) {
                        this.b.setTextSize(0, f);
                        this.b.setMaxLines(v5);
                        super.onMeasure(v, v1);
                    }
                    else {
                        Layout layout0 = this.b.getLayout();
                        if(layout0 != null) {
                            float f2 = layout0.getLineWidth(0);
                            if(f / layout0.getPaint().getTextSize() * f2 <= ((float)(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()))) {
                                this.b.setTextSize(0, f);
                                this.b.setMaxLines(v5);
                                super.onMeasure(v, v1);
                            }
                        }
                    }
                }
            }
        }

        @Override  // android.view.View
        public boolean performClick() {
            boolean z = super.performClick();
            if(this.a != null) {
                if(!z) {
                    this.playSoundEffect(0);
                }
                this.a.select();
                return true;
            }
            return z;
        }

        @Override  // android.view.View
        public void setSelected(boolean z) {
            this.isSelected();
            super.setSelected(z);
            TextView textView0 = this.b;
            if(textView0 != null) {
                textView0.setSelected(z);
            }
            ImageView imageView0 = this.c;
            if(imageView0 != null) {
                imageView0.setSelected(z);
            }
            View view0 = this.f;
            if(view0 != null) {
                view0.setSelected(z);
            }
        }

        public void setTab(@Nullable Tab tabLayout$Tab0) {
            if(tabLayout$Tab0 != this.a) {
                this.a = tabLayout$Tab0;
                this.h();
                this.setSelected(this.a != null && this.a.isSelected());
            }
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        public final ViewPager a;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager0) {
            this.a = viewPager0;
        }

        @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
        public void onTabReselected(Tab tabLayout$Tab0) {
        }

        @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
        public void onTabSelected(@NonNull Tab tabLayout$Tab0) {
            this.a.setCurrentItem(tabLayout$Tab0.getPosition());
        }

        @Override  // com.google.android.material.tabs.TabLayout$BaseOnTabSelectedListener
        public void onTabUnselected(Tab tabLayout$Tab0) {
        }
    }

    public final int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int GRAVITY_START = 2;
    public boolean H;
    public a I;
    public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
    public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
    public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
    public static final int INDICATOR_GRAVITY_BOTTOM = 0;
    public static final int INDICATOR_GRAVITY_CENTER = 1;
    public static final int INDICATOR_GRAVITY_STRETCH = 3;
    public static final int INDICATOR_GRAVITY_TOP = 2;
    public final TimeInterpolator J;
    public BaseOnTabSelectedListener K;
    public final ArrayList L;
    public ViewPagerOnTabSelectedListener M;
    public static final int MODE_AUTO = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public ValueAnimator N;
    public ViewPager O;
    public PagerAdapter P;
    public y1 Q;
    public TabLayoutOnPageChangeListener R;
    public e8.b S;
    public boolean T;
    public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
    public static final int TAB_LABEL_VISIBILITY_UNLABELED;
    public int U;
    public final SimplePool V;
    public static final int W;
    public int a;
    public static final SynchronizedPool a0;
    public final ArrayList b;
    public Tab c;
    public final d d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public int p;
    public final PorterDuff.Mode q;
    public final float r;
    public final float s;
    public final int t;
    public int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public int z;

    static {
        TabLayout.W = style.Widget_Design_TabLayout;
        TabLayout.a0 = new SynchronizedPool(16);
    }

    public TabLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public TabLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.tabStyle);
    }

    public TabLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, TabLayout.W), attributeSet0, v);
        float f;
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.u = 0x7FFFFFFF;
        this.F = -1;
        this.L = new ArrayList();
        this.V = new SimplePool(12);
        Context context1 = this.getContext();
        this.setHorizontalScrollBarEnabled(false);
        d d0 = new d(this, context1);
        this.d = d0;
        super.addView(d0, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.TabLayout, v, TabLayout.W, new int[]{styleable.TabLayout_tabTextAppearance});
        ColorStateList colorStateList0 = DrawableUtils.getColorStateListOrNull(this.getBackground());
        if(colorStateList0 != null) {
            MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
            materialShapeDrawable0.setFillColor(colorStateList0);
            materialShapeDrawable0.initializeElevationOverlay(context1);
            materialShapeDrawable0.setElevation(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable0);
        }
        this.setSelectedTabIndicator(MaterialResources.getDrawable(context1, typedArray0, styleable.TabLayout_tabIndicator));
        this.setSelectedTabIndicatorColor(typedArray0.getColor(styleable.TabLayout_tabIndicatorColor, 0));
        d0.b(typedArray0.getDimensionPixelSize(styleable.TabLayout_tabIndicatorHeight, -1));
        this.setSelectedTabIndicatorGravity(typedArray0.getInt(styleable.TabLayout_tabIndicatorGravity, 0));
        this.setTabIndicatorAnimationMode(typedArray0.getInt(styleable.TabLayout_tabIndicatorAnimationMode, 0));
        this.setTabIndicatorFullWidth(typedArray0.getBoolean(styleable.TabLayout_tabIndicatorFullWidth, true));
        int v1 = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPadding, 0);
        this.h = v1;
        this.g = v1;
        this.f = v1;
        this.e = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPaddingStart, v1);
        this.f = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPaddingTop, v1);
        this.g = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPaddingEnd, v1);
        this.h = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPaddingBottom, v1);
        this.i = ThemeEnforcement.isMaterial3Theme(context1) ? attr.textAppearanceTitleSmall : attr.textAppearanceButton;
        int v2 = typedArray0.getResourceId(styleable.TabLayout_tabTextAppearance, style.TextAppearance_Design_Tab);
        this.j = v2;
        TypedArray typedArray1 = context1.obtainStyledAttributes(v2, androidx.appcompat.R.styleable.TextAppearance);
        try {
            f = (float)typedArray1.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.r = f;
            this.l = MaterialResources.getColorStateList(context1, typedArray1, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
        }
        finally {
            typedArray1.recycle();
        }
        if(typedArray0.hasValue(styleable.TabLayout_tabSelectedTextAppearance)) {
            this.k = typedArray0.getResourceId(styleable.TabLayout_tabSelectedTextAppearance, v2);
        }
        int v4 = this.k;
        if(v4 != -1) {
            TypedArray typedArray2 = context1.obtainStyledAttributes(v4, androidx.appcompat.R.styleable.TextAppearance);
            try {
                typedArray2.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, ((int)f));
                ColorStateList colorStateList1 = MaterialResources.getColorStateList(context1, typedArray2, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
                if(colorStateList1 != null) {
                    int v6 = this.l.getDefaultColor();
                    int v7 = colorStateList1.getDefaultColor();
                    this.l = TabLayout.e(v6, colorStateList1.getColorForState(new int[]{0x10100A1}, v7));
                }
            }
            finally {
                typedArray2.recycle();
            }
        }
        if(typedArray0.hasValue(styleable.TabLayout_tabTextColor)) {
            this.l = MaterialResources.getColorStateList(context1, typedArray0, styleable.TabLayout_tabTextColor);
        }
        if(typedArray0.hasValue(styleable.TabLayout_tabSelectedTextColor)) {
            int v8 = typedArray0.getColor(styleable.TabLayout_tabSelectedTextColor, 0);
            this.l = TabLayout.e(this.l.getDefaultColor(), v8);
        }
        this.m = MaterialResources.getColorStateList(context1, typedArray0, styleable.TabLayout_tabIconTint);
        this.q = ViewUtils.parseTintMode(typedArray0.getInt(styleable.TabLayout_tabIconTintMode, -1), null);
        this.n = MaterialResources.getColorStateList(context1, typedArray0, styleable.TabLayout_tabRippleColor);
        this.A = typedArray0.getInt(styleable.TabLayout_tabIndicatorAnimationDuration, 300);
        this.J = MotionUtils.resolveThemeInterpolator(context1, attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.v = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabMinWidth, -1);
        this.w = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabMaxWidth, -1);
        this.t = typedArray0.getResourceId(styleable.TabLayout_tabBackground, 0);
        this.y = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabContentStart, 0);
        this.C = typedArray0.getInt(styleable.TabLayout_tabMode, 1);
        this.z = typedArray0.getInt(styleable.TabLayout_tabGravity, 0);
        this.D = typedArray0.getBoolean(styleable.TabLayout_tabInlineLabel, false);
        this.H = typedArray0.getBoolean(styleable.TabLayout_tabUnboundedRipple, false);
        typedArray0.recycle();
        Resources resources0 = this.getResources();
        this.s = (float)resources0.getDimensionPixelSize(dimen.design_tab_text_size_2line);
        this.x = resources0.getDimensionPixelSize(dimen.design_tab_scrollable_min_width);
        this.c();
    }

    public final void a(View view0) {
        if(!(view0 instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        Tab tabLayout$Tab0 = this.newTab();
        CharSequence charSequence0 = ((TabItem)view0).text;
        if(charSequence0 != null) {
            tabLayout$Tab0.setText(charSequence0);
        }
        Drawable drawable0 = ((TabItem)view0).icon;
        if(drawable0 != null) {
            tabLayout$Tab0.setIcon(drawable0);
        }
        int v = ((TabItem)view0).customLayout;
        if(v != 0) {
            tabLayout$Tab0.setCustomView(v);
        }
        if(!TextUtils.isEmpty(((TabItem)view0).getContentDescription())) {
            tabLayout$Tab0.setContentDescription(((TabItem)view0).getContentDescription());
        }
        this.addTab(tabLayout$Tab0);
    }

    @Deprecated
    public void addOnTabSelectedListener(@Nullable BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener0) {
        ArrayList arrayList0 = this.L;
        if(!arrayList0.contains(tabLayout$BaseOnTabSelectedListener0)) {
            arrayList0.add(tabLayout$BaseOnTabSelectedListener0);
        }
    }

    public void addOnTabSelectedListener(@NonNull OnTabSelectedListener tabLayout$OnTabSelectedListener0) {
        this.addOnTabSelectedListener(tabLayout$OnTabSelectedListener0);
    }

    public void addTab(@NonNull Tab tabLayout$Tab0) {
        this.addTab(tabLayout$Tab0, this.b.isEmpty());
    }

    public void addTab(@NonNull Tab tabLayout$Tab0, int v) {
        this.addTab(tabLayout$Tab0, v, this.b.isEmpty());
    }

    public void addTab(@NonNull Tab tabLayout$Tab0, int v, boolean z) {
        if(tabLayout$Tab0.parent != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        tabLayout$Tab0.e = v;
        ArrayList arrayList0 = this.b;
        arrayList0.add(v, tabLayout$Tab0);
        int v1 = arrayList0.size();
        int v2 = v + 1;
        int v3 = -1;
        while(v2 < v1) {
            if(((Tab)arrayList0.get(v2)).getPosition() == this.a) {
                v3 = v2;
            }
            ((Tab)arrayList0.get(v2)).e = v2;
            ++v2;
        }
        this.a = v3;
        TabView tabLayout$TabView0 = tabLayout$Tab0.view;
        tabLayout$TabView0.setSelected(false);
        tabLayout$TabView0.setActivated(false);
        int v4 = tabLayout$Tab0.getPosition();
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -1);
        if(this.C != 1 || this.z != 0) {
            linearLayout$LayoutParams0.width = -2;
            linearLayout$LayoutParams0.weight = 0.0f;
        }
        else {
            linearLayout$LayoutParams0.width = 0;
            linearLayout$LayoutParams0.weight = 1.0f;
        }
        this.d.addView(tabLayout$TabView0, v4, linearLayout$LayoutParams0);
        if(z) {
            tabLayout$Tab0.select();
        }
    }

    public void addTab(@NonNull Tab tabLayout$Tab0, boolean z) {
        this.addTab(tabLayout$Tab0, this.b.size(), z);
    }

    @Override  // android.widget.HorizontalScrollView
    public void addView(View view0) {
        this.a(view0);
    }

    @Override  // android.widget.HorizontalScrollView
    public void addView(View view0, int v) {
        this.a(view0);
    }

    @Override  // android.widget.HorizontalScrollView
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.a(view0);
    }

    @Override  // android.widget.HorizontalScrollView
    public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.a(view0);
    }

    public final void b(int v) {
        if(v == -1) {
            return;
        }
        if(this.getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            d d0 = this.d;
            int v1 = d0.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(d0.getChildAt(v2).getWidth() <= 0) {
                    this.setScrollPosition(v, 0.0f, true);
                    return;
                }
            }
            int v3 = this.getScrollX();
            int v4 = this.d(0.0f, v);
            if(v3 != v4) {
                this.f();
                this.N.setIntValues(new int[]{v3, v4});
                this.N.start();
            }
            if(d0.a != null && d0.a.isRunning() && d0.b.a != v) {
                d0.a.cancel();
            }
            d0.d(v, this.A, true);
            return;
        }
        this.setScrollPosition(v, 0.0f, true);
    }

    public final void c() {
        d d0 = this.d;
        ViewCompat.setPaddingRelative(d0, (this.C == 0 || this.C == 2 ? Math.max(0, this.y - this.e) : 0), 0, 0, 0);
    alab1:
        switch(this.C) {
            case 0: {
                switch(this.z) {
                    case 0: {
                        Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                        break;
                    }
                    case 1: {
                        d0.setGravity(1);
                        break alab1;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        break alab1;
                    }
                }
                d0.setGravity(0x800003);
                break;
            }
            case 1: 
            case 2: {
                if(this.z == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                d0.setGravity(1);
            }
        }
        this.l(true);
    }

    public void clearOnTabSelectedListeners() {
        this.L.clear();
    }

    public Tab createTabFromPool() {
        Tab tabLayout$Tab0 = (Tab)TabLayout.a0.acquire();
        return tabLayout$Tab0 == null ? new Tab() : tabLayout$Tab0;
    }

    public final int d(float f, int v) {
        int v1 = 0;
        if(this.C != 0 && this.C != 2) {
            return 0;
        }
        d d0 = this.d;
        View view0 = d0.getChildAt(v);
        if(view0 == null) {
            return 0;
        }
        View view1 = v + 1 >= d0.getChildCount() ? null : d0.getChildAt(v + 1);
        int v2 = view0.getWidth();
        if(view1 != null) {
            v1 = view1.getWidth();
        }
        int v3 = v2 / 2 + view0.getLeft() - this.getWidth() / 2;
        int v4 = (int)(((float)(v2 + v1)) * 0.5f * f);
        return ViewCompat.getLayoutDirection(this) == 0 ? v3 + v4 : v3 - v4;
    }

    public static ColorStateList e(int v, int v1) {
        int[][] arr2_v = new int[2][];
        int[] arr_v = new int[2];
        arr2_v[0] = HorizontalScrollView.SELECTED_STATE_SET;
        arr_v[0] = v1;
        arr2_v[1] = HorizontalScrollView.EMPTY_STATE_SET;
        arr_v[1] = v;
        return new ColorStateList(arr2_v, arr_v);
    }

    public final void f() {
        if(this.N == null) {
            ValueAnimator valueAnimator0 = new ValueAnimator();
            this.N = valueAnimator0;
            valueAnimator0.setInterpolator(this.J);
            this.N.setDuration(((long)this.A));
            this.N.addUpdateListener(new g(this, 4));
        }
    }

    public final void g() {
        this.removeAllTabs();
        PagerAdapter pagerAdapter0 = this.P;
        if(pagerAdapter0 != null) {
            int v = pagerAdapter0.getCount();
            for(int v1 = 0; v1 < v; ++v1) {
                this.addTab(this.newTab().setText(null), false);
            }
            ViewPager viewPager0 = this.O;
            if(viewPager0 != null && v > 0) {
                int v2 = viewPager0.getCurrentItem();
                if(v2 != this.getSelectedTabPosition() && v2 < this.getTabCount()) {
                    this.selectTab(this.getTabAt(v2));
                }
            }
        }
    }

    @Override  // android.widget.FrameLayout
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.widget.FrameLayout
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateDefaultLayoutParams();
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Tab tabLayout$Tab0 = (Tab)arrayList0.get(v1);
            if(tabLayout$Tab0 != null && tabLayout$Tab0.getIcon() != null && !TextUtils.isEmpty(tabLayout$Tab0.getText())) {
                return this.D ? 0x30 : 72;
            }
        }
        return 0x30;
    }

    public int getSelectedTabPosition() {
        return this.c == null ? -1 : this.c.getPosition();
    }

    @Nullable
    public Tab getTabAt(int v) {
        return v < 0 || v >= this.getTabCount() ? null : ((Tab)this.b.get(v));
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.G;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.u;
    }

    private int getTabMinWidth() {
        int v = this.v;
        if(v != -1) {
            return v;
        }
        return this.C == 0 || this.C == 2 ? this.x : 0;
    }

    public int getTabMode() {
        return this.C;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    private int getTabScrollRange() {
        return Math.max(0, this.d.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final void h(int v) {
        TabView tabLayout$TabView0 = (TabView)this.d.getChildAt(v);
        this.d.removeViewAt(v);
        if(tabLayout$TabView0 != null) {
            tabLayout$TabView0.setTab(null);
            tabLayout$TabView0.setSelected(false);
            this.V.release(tabLayout$TabView0);
        }
        this.requestLayout();
    }

    public boolean hasUnboundedRipple() {
        return this.H;
    }

    public final void i(PagerAdapter pagerAdapter0, boolean z) {
        PagerAdapter pagerAdapter1 = this.P;
        if(pagerAdapter1 != null) {
            y1 y10 = this.Q;
            if(y10 != null) {
                pagerAdapter1.unregisterDataSetObserver(y10);
            }
        }
        this.P = pagerAdapter0;
        if(z && pagerAdapter0 != null) {
            if(this.Q == null) {
                this.Q = new y1(this, 2);
            }
            pagerAdapter0.registerDataSetObserver(this.Q);
        }
        this.g();
    }

    public boolean isInlineLabel() {
        return this.D;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.E;
    }

    public final void j(int v, float f, boolean z, boolean z1, boolean z2) {
        float f1 = ((float)v) + f;
        int v1 = Math.round(f1);
        if(v1 >= 0) {
            d d0 = this.d;
            if(v1 < d0.getChildCount()) {
                if(z1) {
                    d0.b.a = Math.round(f1);
                    if(d0.a != null && d0.a.isRunning()) {
                        d0.a.cancel();
                    }
                    d0.c(d0.getChildAt(v), d0.getChildAt(v + 1), f);
                }
                if(this.N != null && this.N.isRunning()) {
                    this.N.cancel();
                }
                int v2 = this.d(f, v);
                int v3 = this.getScrollX();
                boolean z3 = v < this.getSelectedTabPosition() && v2 >= v3 || v > this.getSelectedTabPosition() && v2 <= v3 || v == this.getSelectedTabPosition();
                if(ViewCompat.getLayoutDirection(this) == 1) {
                    z3 = v < this.getSelectedTabPosition() && v2 <= v3 || v > this.getSelectedTabPosition() && v2 >= v3 || v == this.getSelectedTabPosition();
                }
                if(z3 || this.U == 1 || z2) {
                    if(v < 0) {
                        v2 = 0;
                    }
                    this.scrollTo(v2, 0);
                }
                if(z) {
                    this.setSelectedTabView(v1);
                }
            }
        }
    }

    public final void k(ViewPager viewPager0, boolean z, boolean z1) {
        ViewPager viewPager1 = this.O;
        if(viewPager1 != null) {
            TabLayoutOnPageChangeListener tabLayout$TabLayoutOnPageChangeListener0 = this.R;
            if(tabLayout$TabLayoutOnPageChangeListener0 != null) {
                viewPager1.removeOnPageChangeListener(tabLayout$TabLayoutOnPageChangeListener0);
            }
            e8.b b0 = this.S;
            if(b0 != null) {
                this.O.removeOnAdapterChangeListener(b0);
            }
        }
        ViewPagerOnTabSelectedListener tabLayout$ViewPagerOnTabSelectedListener0 = this.M;
        if(tabLayout$ViewPagerOnTabSelectedListener0 != null) {
            this.removeOnTabSelectedListener(tabLayout$ViewPagerOnTabSelectedListener0);
            this.M = null;
        }
        if(viewPager0 == null) {
            this.O = null;
            this.i(null, false);
        }
        else {
            this.O = viewPager0;
            if(this.R == null) {
                this.R = new TabLayoutOnPageChangeListener(this);
            }
            this.R.c = 0;
            this.R.b = 0;
            viewPager0.addOnPageChangeListener(this.R);
            ViewPagerOnTabSelectedListener tabLayout$ViewPagerOnTabSelectedListener1 = new ViewPagerOnTabSelectedListener(viewPager0);
            this.M = tabLayout$ViewPagerOnTabSelectedListener1;
            this.addOnTabSelectedListener(tabLayout$ViewPagerOnTabSelectedListener1);
            PagerAdapter pagerAdapter0 = viewPager0.getAdapter();
            if(pagerAdapter0 != null) {
                this.i(pagerAdapter0, z);
            }
            if(this.S == null) {
                this.S = new e8.b(this);
            }
            this.S.a = z;
            viewPager0.addOnAdapterChangeListener(this.S);
            this.setScrollPosition(viewPager0.getCurrentItem(), 0.0f, true);
        }
        this.T = z1;
    }

    public final void l(boolean z) {
        for(int v = 0; true; ++v) {
            d d0 = this.d;
            if(v >= d0.getChildCount()) {
                break;
            }
            View view0 = d0.getChildAt(v);
            view0.setMinimumWidth(this.getTabMinWidth());
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)view0.getLayoutParams();
            if(this.C != 1 || this.z != 0) {
                linearLayout$LayoutParams0.width = -2;
                linearLayout$LayoutParams0.weight = 0.0f;
            }
            else {
                linearLayout$LayoutParams0.width = 0;
                linearLayout$LayoutParams0.weight = 1.0f;
            }
            if(z) {
                view0.requestLayout();
            }
        }
    }

    @NonNull
    public Tab newTab() {
        Tab tabLayout$Tab0 = this.createTabFromPool();
        tabLayout$Tab0.parent = this;
        TabView tabLayout$TabView0 = this.V == null ? null : ((TabView)this.V.acquire());
        if(tabLayout$TabView0 == null) {
            tabLayout$TabView0 = new TabView(this, this.getContext());
        }
        tabLayout$TabView0.setTab(tabLayout$Tab0);
        tabLayout$TabView0.setFocusable(true);
        tabLayout$TabView0.setMinimumWidth(this.getTabMinWidth());
        if(TextUtils.isEmpty(tabLayout$Tab0.d)) {
            tabLayout$TabView0.setContentDescription(tabLayout$Tab0.c);
        }
        else {
            tabLayout$TabView0.setContentDescription(tabLayout$Tab0.d);
        }
        tabLayout$Tab0.view = tabLayout$TabView0;
        int v = tabLayout$Tab0.h;
        if(v != -1) {
            tabLayout$TabView0.setId(v);
        }
        return tabLayout$Tab0;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        if(this.O == null) {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 instanceof ViewPager) {
                this.k(((ViewPager)viewParent0), true, true);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.T) {
            this.setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override  // android.view.View
    public void onDraw(@NonNull Canvas canvas0) {
        for(int v = 0; true; ++v) {
            d d0 = this.d;
            if(v >= d0.getChildCount()) {
                break;
            }
            View view0 = d0.getChildAt(v);
            if(view0 instanceof TabView) {
                Drawable drawable0 = ((TabView)view0).i;
                if(drawable0 != null) {
                    drawable0.setBounds(((TabView)view0).getLeft(), ((TabView)view0).getTop(), ((TabView)view0).getRight(), ((TabView)view0).getBottom());
                    ((TabView)view0).i.draw(canvas0);
                }
            }
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0).setCollectionInfo(CollectionInfoCompat.obtain(1, this.getTabCount(), false, 1));
    }

    @Override  // android.widget.HorizontalScrollView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return (this.getTabMode() == 0 || this.getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.widget.HorizontalScrollView
    public void onMeasure(int v, int v1) {
        int v2 = Math.round(ViewUtils.dpToPx(this.getContext(), this.getDefaultHeight()));
        switch(View.MeasureSpec.getMode(v1)) {
            case 0x80000000: {
                if(this.getChildCount() == 1 && View.MeasureSpec.getSize(v1) >= v2) {
                    this.getChildAt(0).setMinimumHeight(v2);
                }
                break;
            }
            case 0: {
                int v3 = this.getPaddingTop();
                v1 = View.MeasureSpec.makeMeasureSpec(this.getPaddingBottom() + (v3 + v2), 0x40000000);
            }
        }
        int v4 = View.MeasureSpec.getSize(v);
        if(View.MeasureSpec.getMode(v) != 0) {
            this.u = this.w > 0 ? this.w : ((int)(((float)v4) - ViewUtils.dpToPx(this.getContext(), 56)));
        }
        super.onMeasure(v, v1);
        if(this.getChildCount() == 1) {
            View view0 = this.getChildAt(0);
            int v5 = this.C;
            switch(v5) {
                case 0: {
                label_18:
                    if(view0.getMeasuredWidth() < this.getMeasuredWidth()) {
                        goto label_21;
                    }
                    break;
                }
                case 1: {
                    if(view0.getMeasuredWidth() != this.getMeasuredWidth()) {
                    label_21:
                        int v6 = this.getPaddingTop();
                        int v7 = ViewGroup.getChildMeasureSpec(v1, this.getPaddingBottom() + v6, view0.getLayoutParams().height);
                        view0.measure(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), v7);
                    }
                    break;
                }
                default: {
                    if(v5 != 2) {
                        return;
                    }
                    goto label_18;
                }
            }
        }
    }

    @Override  // android.widget.HorizontalScrollView
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return motionEvent0.getActionMasked() != 8 || (this.getTabMode() == 0 || this.getTabMode() == 2) ? super.onTouchEvent(motionEvent0) : false;
    }

    public boolean releaseFromTabPool(Tab tabLayout$Tab0) {
        return TabLayout.a0.release(tabLayout$Tab0);
    }

    public void removeAllTabs() {
        for(int v = this.d.getChildCount() - 1; v >= 0; --v) {
            this.h(v);
        }
        Iterator iterator0 = this.b.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            iterator0.remove();
            ((Tab)object0).parent = null;
            ((Tab)object0).view = null;
            ((Tab)object0).a = null;
            ((Tab)object0).b = null;
            ((Tab)object0).h = -1;
            ((Tab)object0).c = null;
            ((Tab)object0).d = null;
            ((Tab)object0).e = -1;
            ((Tab)object0).f = null;
            this.releaseFromTabPool(((Tab)object0));
        }
        this.c = null;
    }

    @Deprecated
    public void removeOnTabSelectedListener(@Nullable BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener0) {
        this.L.remove(tabLayout$BaseOnTabSelectedListener0);
    }

    public void removeOnTabSelectedListener(@NonNull OnTabSelectedListener tabLayout$OnTabSelectedListener0) {
        this.removeOnTabSelectedListener(tabLayout$OnTabSelectedListener0);
    }

    public void removeTab(@NonNull Tab tabLayout$Tab0) {
        if(tabLayout$Tab0.parent != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        this.removeTabAt(tabLayout$Tab0.getPosition());
    }

    public void removeTabAt(int v) {
        int v1 = this.c == null ? 0 : this.c.getPosition();
        this.h(v);
        ArrayList arrayList0 = this.b;
        Tab tabLayout$Tab0 = (Tab)arrayList0.remove(v);
        int v2 = -1;
        Tab tabLayout$Tab1 = null;
        if(tabLayout$Tab0 != null) {
            tabLayout$Tab0.parent = null;
            tabLayout$Tab0.view = null;
            tabLayout$Tab0.a = null;
            tabLayout$Tab0.b = null;
            tabLayout$Tab0.h = -1;
            tabLayout$Tab0.c = null;
            tabLayout$Tab0.d = null;
            tabLayout$Tab0.e = -1;
            tabLayout$Tab0.f = null;
            this.releaseFromTabPool(tabLayout$Tab0);
        }
        int v3 = arrayList0.size();
        for(int v4 = v; v4 < v3; ++v4) {
            if(((Tab)arrayList0.get(v4)).getPosition() == this.a) {
                v2 = v4;
            }
            ((Tab)arrayList0.get(v4)).e = v4;
        }
        this.a = v2;
        if(v1 == v) {
            if(!arrayList0.isEmpty()) {
                tabLayout$Tab1 = (Tab)arrayList0.get(Math.max(0, v - 1));
            }
            this.selectTab(tabLayout$Tab1);
        }
    }

    public void selectTab(@Nullable Tab tabLayout$Tab0) {
        this.selectTab(tabLayout$Tab0, true);
    }

    public void selectTab(@Nullable Tab tabLayout$Tab0, boolean z) {
        Tab tabLayout$Tab1 = this.c;
        ArrayList arrayList0 = this.L;
        if(tabLayout$Tab1 != tabLayout$Tab0) {
            int v1 = tabLayout$Tab0 == null ? -1 : tabLayout$Tab0.getPosition();
            if(z) {
                if(tabLayout$Tab1 != null && tabLayout$Tab1.getPosition() != -1 || v1 == -1) {
                    this.b(v1);
                }
                else {
                    this.setScrollPosition(v1, 0.0f, true);
                }
                if(v1 != -1) {
                    this.setSelectedTabView(v1);
                }
            }
            this.c = tabLayout$Tab0;
            if(tabLayout$Tab1 != null && tabLayout$Tab1.parent != null) {
                for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
                    ((BaseOnTabSelectedListener)arrayList0.get(v2)).onTabUnselected(tabLayout$Tab1);
                }
            }
            if(tabLayout$Tab0 != null) {
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    ((BaseOnTabSelectedListener)arrayList0.get(v3)).onTabSelected(tabLayout$Tab0);
                }
            }
        }
        else if(tabLayout$Tab1 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                ((BaseOnTabSelectedListener)arrayList0.get(v)).onTabReselected(tabLayout$Tab0);
            }
            this.b(tabLayout$Tab0.getPosition());
        }
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setInlineLabel(boolean z) {
        if(this.D != z) {
            this.D = z;
            for(int v = 0; true; ++v) {
                d d0 = this.d;
                if(v >= d0.getChildCount()) {
                    break;
                }
                View view0 = d0.getChildAt(v);
                if(view0 instanceof TabView) {
                    ((TabView)view0).setOrientation(!TabLayout.this.D);
                    TextView textView0 = ((TabView)view0).g;
                    if(textView0 != null || ((TabView)view0).h != null) {
                        ((TabView)view0).i(textView0, ((TabView)view0).h, false);
                    }
                    else {
                        ((TabView)view0).i(((TabView)view0).b, ((TabView)view0).c, true);
                    }
                }
            }
            this.c();
        }
    }

    public void setInlineLabelResource(@BoolRes int v) {
        this.setInlineLabel(this.getResources().getBoolean(v));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener0) {
        BaseOnTabSelectedListener tabLayout$BaseOnTabSelectedListener1 = this.K;
        if(tabLayout$BaseOnTabSelectedListener1 != null) {
            this.removeOnTabSelectedListener(tabLayout$BaseOnTabSelectedListener1);
        }
        this.K = tabLayout$BaseOnTabSelectedListener0;
        if(tabLayout$BaseOnTabSelectedListener0 != null) {
            this.addOnTabSelectedListener(tabLayout$BaseOnTabSelectedListener0);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable OnTabSelectedListener tabLayout$OnTabSelectedListener0) {
        this.setOnTabSelectedListener(tabLayout$OnTabSelectedListener0);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.f();
        this.N.addListener(animator$AnimatorListener0);
    }

    public void setScrollPosition(int v, float f, boolean z) {
        this.setScrollPosition(v, f, z, true);
    }

    public void setScrollPosition(int v, float f, boolean z, boolean z1) {
        this.j(v, f, z, z1, true);
    }

    public void setSelectedTabIndicator(@DrawableRes int v) {
        if(v != 0) {
            this.setSelectedTabIndicator(AppCompatResources.getDrawable(this.getContext(), v));
            return;
        }
        this.setSelectedTabIndicator(null);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            drawable0 = new GradientDrawable();
        }
        Drawable drawable1 = drawable0.mutate();
        this.o = drawable1;
        DrawableUtils.setTint(drawable1, this.p);
        int v = this.F == -1 ? this.o.getIntrinsicHeight() : this.F;
        this.d.b(v);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int v) {
        this.p = v;
        DrawableUtils.setTint(this.o, v);
        this.l(false);
    }

    public void setSelectedTabIndicatorGravity(int v) {
        if(this.B != v) {
            this.B = v;
            ViewCompat.postInvalidateOnAnimation(this.d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int v) {
        this.F = v;
        this.d.b(v);
    }

    private void setSelectedTabView(int v) {
        d d0 = this.d;
        int v1 = d0.getChildCount();
        if(v < v1) {
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = d0.getChildAt(v2);
                boolean z = true;
                if((v2 != v || view0.isSelected()) && (v2 == v || !view0.isSelected())) {
                    view0.setSelected(v2 == v);
                    if(v2 != v) {
                        z = false;
                    }
                    view0.setActivated(z);
                }
                else {
                    view0.setSelected(v2 == v);
                    if(v2 != v) {
                        z = false;
                    }
                    view0.setActivated(z);
                    if(view0 instanceof TabView) {
                        ((TabView)view0).h();
                    }
                }
            }
        }
    }

    public void setTabGravity(int v) {
        if(this.z != v) {
            this.z = v;
            this.c();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList0) {
        if(this.m != colorStateList0) {
            this.m = colorStateList0;
            ArrayList arrayList0 = this.b;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((Tab)arrayList0.get(v1)).a();
            }
        }
    }

    public void setTabIconTintResource(@ColorRes int v) {
        this.setTabIconTint(AppCompatResources.getColorStateList(this.getContext(), v));
    }

    public void setTabIndicatorAnimationMode(int v) {
        this.G = v;
        switch(v) {
            case 0: {
                this.I = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
                return;
            }
            case 1: {
                this.I = new e8.a(0);
                return;
            }
            case 2: {
                this.I = new e8.a(1);
                return;
            }
            default: {
                throw new IllegalArgumentException(v + " is not a valid TabIndicatorAnimationMode");
            }
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.E = z;
        int v = this.d.b.getSelectedTabPosition();
        this.d.a(v);
        ViewCompat.postInvalidateOnAnimation(this.d);
    }

    public void setTabMode(int v) {
        if(v != this.C) {
            this.C = v;
            this.c();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList0) {
        if(this.n != colorStateList0) {
            this.n = colorStateList0;
            for(int v = 0; true; ++v) {
                d d0 = this.d;
                if(v >= d0.getChildCount()) {
                    break;
                }
                View view0 = d0.getChildAt(v);
                if(view0 instanceof TabView) {
                    ((TabView)view0).g(this.getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int v) {
        this.setTabRippleColor(AppCompatResources.getColorStateList(this.getContext(), v));
    }

    public void setTabTextColors(int v, int v1) {
        this.setTabTextColors(TabLayout.e(v, v1));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList0) {
        if(this.l != colorStateList0) {
            this.l = colorStateList0;
            ArrayList arrayList0 = this.b;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((Tab)arrayList0.get(v1)).a();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter0) {
        this.i(pagerAdapter0, false);
    }

    public void setUnboundedRipple(boolean z) {
        if(this.H != z) {
            this.H = z;
            for(int v = 0; true; ++v) {
                d d0 = this.d;
                if(v >= d0.getChildCount()) {
                    break;
                }
                View view0 = d0.getChildAt(v);
                if(view0 instanceof TabView) {
                    ((TabView)view0).g(this.getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int v) {
        this.setUnboundedRipple(this.getResources().getBoolean(v));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager0) {
        this.setupWithViewPager(viewPager0, true);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager0, boolean z) {
        this.k(viewPager0, z, false);
    }

    @Override  // android.widget.HorizontalScrollView
    public boolean shouldDelayChildPressedState() {
        return this.getTabScrollRange() > 0;
    }
}

