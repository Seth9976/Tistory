package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R.id;
import androidx.fragment.R.styleable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001BB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u0004\u0010\nB!\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\u0004\u0010\rJ\u0019\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001A\u00020\u00102\u0006\u0010\u0014\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0017H\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0017H\u0017\u00A2\u0006\u0004\b\u001B\u0010\u001AJ\u0017\u0010\u001E\u001A\u00020\u00102\u0006\u0010\u001D\u001A\u00020\u001CH\u0014\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\'\u0010%\u001A\u00020$2\u0006\u0010\u001D\u001A\u00020\u001C2\u0006\u0010!\u001A\u00020 2\u0006\u0010#\u001A\u00020\"H\u0014\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001A\u00020\u00102\u0006\u0010\'\u001A\u00020 H\u0016\u00A2\u0006\u0004\b(\u0010)J\u0017\u0010*\u001A\u00020\u00102\u0006\u0010\'\u001A\u00020 H\u0016\u00A2\u0006\u0004\b*\u0010)J\u0017\u0010,\u001A\u00020\u00102\u0006\u0010+\u001A\u00020$H\u0001\u00A2\u0006\u0004\b,\u0010-J)\u00101\u001A\u00020\u00102\u0006\u0010!\u001A\u00020 2\u0006\u0010.\u001A\u00020\b2\b\u00100\u001A\u0004\u0018\u00010/H\u0016\u00A2\u0006\u0004\b1\u00102J\u0017\u00103\u001A\u00020\u00102\u0006\u0010.\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b3\u00104J\u0017\u00105\u001A\u00020\u00102\u0006\u0010\'\u001A\u00020 H\u0016\u00A2\u0006\u0004\b5\u0010)J\u0017\u00106\u001A\u00020\u00102\u0006\u0010\'\u001A\u00020 H\u0016\u00A2\u0006\u0004\b6\u0010)J\u001F\u00109\u001A\u00020\u00102\u0006\u00107\u001A\u00020\b2\u0006\u00108\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b9\u0010:J\u001F\u0010;\u001A\u00020\u00102\u0006\u00107\u001A\u00020\b2\u0006\u00108\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b;\u0010:J\u000F\u0010<\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b<\u0010=J\u0019\u0010@\u001A\u00028\u0000\"\n\b\u0000\u0010?*\u0004\u0018\u00010>\u00A2\u0006\u0004\b@\u0010A\u00A8\u0006C"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "(Landroid/view/View;)V", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "Api20Impl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n55#2,6:354\n55#2,6:360\n1855#3,2:366\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:354,6\n135#1:360,6\n226#1:366,2\n*E\n"})
public final class FragmentContainerView extends FrameLayout {
    @RequiresApi(20)
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J%\u0010\b\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$Api20Impl;", "", "Landroid/view/View$OnApplyWindowInsetsListener;", "onApplyWindowInsetsListener", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api20Impl {
        @NotNull
        public static final Api20Impl INSTANCE;

        static {
            Api20Impl.INSTANCE = new Api20Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final WindowInsets onApplyWindowInsets(@NotNull View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0, @NotNull View view0, @NotNull WindowInsets windowInsets0) {
            Intrinsics.checkNotNullParameter(view$OnApplyWindowInsetsListener0, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(view0, "v");
            Intrinsics.checkNotNullParameter(windowInsets0, "insets");
            WindowInsets windowInsets1 = view$OnApplyWindowInsetsListener0.onApplyWindowInsets(view0, windowInsets0);
            Intrinsics.checkNotNullExpressionValue(windowInsets1, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsets1;
        }
    }

    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    public FragmentContainerView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
    }

    @JvmOverloads
    public FragmentContainerView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public FragmentContainerView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s1;
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        if(attributeSet0 != null) {
            String s = attributeSet0.getClassAttribute();
            int[] arr_v = styleable.FragmentContainerView;
            Intrinsics.checkNotNullExpressionValue(arr_v, "FragmentContainerView");
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, arr_v, 0, 0);
            if(s == null) {
                s = typedArray0.getString(styleable.FragmentContainerView_android_name);
                s1 = "android:name";
            }
            else {
                s1 = "class";
            }
            typedArray0.recycle();
            if(s != null && !this.isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + s1 + "=\"" + s + '\"');
            }
        }
    }

    public FragmentContainerView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public FragmentContainerView(@NotNull Context context0, @NotNull AttributeSet attributeSet0, @NotNull FragmentManager fragmentManager0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        Intrinsics.checkNotNullParameter(fragmentManager0, "fm");
        super(context0, attributeSet0);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String s = attributeSet0.getClassAttribute();
        int[] arr_v = styleable.FragmentContainerView;
        Intrinsics.checkNotNullExpressionValue(arr_v, "FragmentContainerView");
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, arr_v, 0, 0);
        if(s == null) {
            s = typedArray0.getString(styleable.FragmentContainerView_android_name);
        }
        String s1 = typedArray0.getString(styleable.FragmentContainerView_android_tag);
        typedArray0.recycle();
        int v = this.getId();
        if(s != null && fragmentManager0.findFragmentById(v) == null) {
            if(v == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + s + (s1 == null ? "" : " with tag " + s1));
            }
            Fragment fragment0 = fragmentManager0.getFragmentFactory().instantiate(context0.getClassLoader(), s);
            Intrinsics.checkNotNullExpressionValue(fragment0, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragment0.mFragmentId = v;
            fragment0.mContainerId = v;
            fragment0.mTag = s1;
            fragment0.mFragmentManager = fragmentManager0;
            fragment0.mHost = fragmentManager0.getHost();
            fragment0.onInflate(context0, attributeSet0, null);
            FragmentTransaction fragmentTransaction0 = fragmentManager0.beginTransaction().setReorderingAllowed(true);
            fragmentTransaction0.getClass();
            fragment0.mContainer = this;
            fragmentTransaction0.add(this.getId(), fragment0, s1).commitNowAllowingStateLoss();
        }
        for(Object object0: fragmentManager0.c.d()) {
            k1 k10 = (k1)object0;
            Fragment fragment1 = k10.c;
            if(fragment1.mContainerId == this.getId() && (fragment1.mView != null && fragment1.mView.getParent() == null)) {
                fragment1.mContainer = this;
                k10.b();
            }
        }
    }

    public final void a(View view0) {
        if(this.b.contains(view0)) {
            this.a.add(view0);
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(@NotNull View view0, int v, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        Intrinsics.checkNotNullParameter(view0, "child");
        Object object0 = view0.getTag(id.fragment_container_view_tag);
        if((object0 instanceof Fragment ? ((Fragment)object0) : null) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view0 + " is not associated with a Fragment.").toString());
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    @RequiresApi(20)
    @NotNull
    public WindowInsets dispatchApplyWindowInsets(@NotNull WindowInsets windowInsets0) {
        WindowInsetsCompat windowInsetsCompat1;
        Intrinsics.checkNotNullParameter(windowInsets0, "insets");
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat0, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0 = this.c;
        if(view$OnApplyWindowInsetsListener0 == null) {
            windowInsetsCompat1 = ViewCompat.onApplyWindowInsets(this, windowInsetsCompat0);
        }
        else {
            Intrinsics.checkNotNull(view$OnApplyWindowInsetsListener0);
            windowInsetsCompat1 = WindowInsetsCompat.toWindowInsetsCompat(Api20Impl.INSTANCE.onApplyWindowInsets(view$OnApplyWindowInsetsListener0, this, windowInsets0));
        }
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat1, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if(!windowInsetsCompat1.isConsumed()) {
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                ViewCompat.dispatchApplyWindowInsets(this.getChildAt(v1), windowInsetsCompat1);
            }
        }
        return windowInsets0;
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        if(this.d) {
            for(Object object0: this.a) {
                super.drawChild(canvas0, ((View)object0), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas0);
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas0, @NotNull View view0, long v) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(view0, "child");
        return !this.d || (this.a.isEmpty() || !this.a.contains(view0)) ? super.drawChild(canvas0, view0, v) : false;
    }

    @Override  // android.view.ViewGroup
    public void endViewTransition(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.b.remove(view0);
        if(this.a.remove(view0)) {
            this.d = true;
        }
        super.endViewTransition(view0);
    }

    public final Fragment getFragment() {
        FragmentActivity fragmentActivity0;
        Fragment fragment0 = FragmentManager.A(this);
        if(fragment0 != null) {
            if(!fragment0.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment0 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            return fragment0.getChildFragmentManager().findFragmentById(this.getId());
        }
        for(Context context0 = this.getContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            fragmentActivity0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if(context0 instanceof FragmentActivity) {
                fragmentActivity0 = (FragmentActivity)context0;
                break;
            }
        }
        if(fragmentActivity0 == null) {
            throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
        }
        return fragmentActivity0.getSupportFragmentManager().findFragmentById(this.getId());
    }

    @Override  // android.view.View
    @RequiresApi(20)
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets windowInsets0) {
        Intrinsics.checkNotNullParameter(windowInsets0, "insets");
        return windowInsets0;
    }

    @Override  // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for(int v = this.getChildCount() - 1; -1 < v; --v) {
            View view0 = this.getChildAt(v);
            Intrinsics.checkNotNullExpressionValue(view0, "view");
            this.a(view0);
        }
        super.removeAllViewsInLayout();
    }

    @Override  // android.view.ViewGroup
    public void removeView(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.a(view0);
        super.removeView(view0);
    }

    @Override  // android.view.ViewGroup
    public void removeViewAt(int v) {
        View view0 = this.getChildAt(v);
        Intrinsics.checkNotNullExpressionValue(view0, "view");
        this.a(view0);
        super.removeViewAt(v);
    }

    @Override  // android.view.ViewGroup
    public void removeViewInLayout(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        this.a(view0);
        super.removeViewInLayout(view0);
    }

    @Override  // android.view.ViewGroup
    public void removeViews(int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            View view0 = this.getChildAt(v2);
            Intrinsics.checkNotNullExpressionValue(view0, "view");
            this.a(view0);
        }
        super.removeViews(v, v1);
    }

    @Override  // android.view.ViewGroup
    public void removeViewsInLayout(int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            View view0 = this.getChildAt(v2);
            Intrinsics.checkNotNullExpressionValue(view0, "view");
            this.a(view0);
        }
        super.removeViewsInLayout(v, v1);
    }

    @JvmName(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override  // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition layoutTransition0) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override  // android.view.View
    public void setOnApplyWindowInsetsListener(@NotNull View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0) {
        Intrinsics.checkNotNullParameter(view$OnApplyWindowInsetsListener0, "listener");
        this.c = view$OnApplyWindowInsetsListener0;
    }

    @Override  // android.view.ViewGroup
    public void startViewTransition(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        if(view0.getParent() == this) {
            this.b.add(view0);
        }
        super.startViewTransition(view0);
    }
}

