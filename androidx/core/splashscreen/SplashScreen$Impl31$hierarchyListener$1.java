package androidx.core.splashscreen;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.webkit.internal.k;
import i3.a;
import i3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001A\u00020\u00052\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001A\u00020\u00052\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"androidx/core/splashscreen/SplashScreen$Impl31$hierarchyListener$1", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", "onChildViewRemoved", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplashScreen.Impl31.hierarchyListener.1 implements ViewGroup.OnHierarchyChangeListener {
    public final d a;
    public final Activity b;

    public SplashScreen.Impl31.hierarchyListener.1(d d0, Activity activity0) {
        this.a = d0;
        this.b = activity0;
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewAdded(@Nullable View view0, @Nullable View view1) {
        if(a.q(view1)) {
            this.a.getClass();
            Intrinsics.checkNotNullParameter(((SplashScreenView)view1), "child");
            WindowInsets windowInsets0 = k.k(k.j());
            Intrinsics.checkNotNullExpressionValue(windowInsets0, "Builder().build()");
            Rect rect0 = new Rect(0x80000000, 0x80000000, 0x7FFFFFFF, 0x7FFFFFFF);
            this.a.j = windowInsets0 != a.h(((SplashScreenView)view1)).computeSystemWindowInsets(windowInsets0, rect0) || !rect0.isEmpty();
            ((ViewGroup)this.b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public void onChildViewRemoved(@Nullable View view0, @Nullable View view1) {
    }
}

