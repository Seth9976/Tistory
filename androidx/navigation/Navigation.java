package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import com.google.android.material.datepicker.t;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import n4.a;
import n4.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0001\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000BJ%\u0010\u0010\u001A\u00020\u000F2\b\b\u0001\u0010\f\u001A\u00020\u00042\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J!\u0010\u0017\u001A\u00020\u00162\u0006\u0010\n\u001A\u00020\t2\b\u0010\u0015\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/navigation/Navigation;", "", "Landroid/app/Activity;", "activity", "", "viewId", "Landroidx/navigation/NavController;", "findNavController", "(Landroid/app/Activity;I)Landroidx/navigation/NavController;", "Landroid/view/View;", "view", "(Landroid/view/View;)Landroidx/navigation/NavController;", "resId", "Landroid/os/Bundle;", "args", "Landroid/view/View$OnClickListener;", "createNavigateOnClickListener", "(ILandroid/os/Bundle;)Landroid/view/View$OnClickListener;", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavDirections;)Landroid/view/View$OnClickListener;", "controller", "", "setViewNavController", "(Landroid/view/View;Landroidx/navigation/NavController;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Navigation {
    @NotNull
    public static final Navigation INSTANCE;

    static {
        Navigation.INSTANCE = new Navigation();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final NavController access$getViewNavController(Navigation navigation0, View view0) {
        navigation0.getClass();
        Object object0 = view0.getTag(id.nav_controller_view_tag);
        if(object0 instanceof WeakReference) {
            return (NavController)((WeakReference)object0).get();
        }
        return object0 instanceof NavController ? ((NavController)object0) : null;
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int v) {
        return Navigation.createNavigateOnClickListener$default(v, null, 2, null);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int v, @Nullable Bundle bundle0) {
        return new n(v, bundle0);
    }

    @JvmStatic
    @NotNull
    public static final View.OnClickListener createNavigateOnClickListener(@NotNull NavDirections navDirections0) {
        Intrinsics.checkNotNullParameter(navDirections0, "directions");
        return new t(navDirections0, 18);
    }

    public static View.OnClickListener createNavigateOnClickListener$default(int v, Bundle bundle0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            bundle0 = null;
        }
        return Navigation.createNavigateOnClickListener(v, bundle0);
    }

    @JvmStatic
    @NotNull
    public static final NavController findNavController(@NotNull Activity activity0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        View view0 = ActivityCompat.requireViewById(activity0, v);
        Intrinsics.checkNotNullExpressionValue(view0, "requireViewById<View>(activity, viewId)");
        Navigation.INSTANCE.getClass();
        NavController navController0 = (NavController)SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view0, a.I), a.J));
        if(navController0 == null) {
            throw new IllegalStateException("Activity " + activity0 + " does not have a NavController set on " + v);
        }
        return navController0;
    }

    @JvmStatic
    @NotNull
    public static final NavController findNavController(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Navigation.INSTANCE.getClass();
        NavController navController0 = (NavController)SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view0, a.I), a.J));
        if(navController0 == null) {
            throw new IllegalStateException("View " + view0 + " does not have a NavController set");
        }
        return navController0;
    }

    @JvmStatic
    public static final void setViewNavController(@NotNull View view0, @Nullable NavController navController0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        view0.setTag(id.nav_controller_view_tag, navController0);
    }
}

