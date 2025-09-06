package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.customview.widget.Openable;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController.OnDestinationChangedListener;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bH$¢\u0006\u0004\b\u000B\u0010\fJ#\u0010\u0011\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001A\u00020\u000FH$¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Landroid/content/Context;", "context", "Landroidx/navigation/ui/AppBarConfiguration;", "configuration", "<init>", "(Landroid/content/Context;Landroidx/navigation/ui/AppBarConfiguration;)V", "", "title", "", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "setNavigationIcon", "(Landroid/graphics/drawable/Drawable;I)V", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAbstractAppBarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAppBarOnDestinationChangedListener.kt\nandroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public abstract class AbstractAppBarOnDestinationChangedListener implements OnDestinationChangedListener {
    public final Context a;
    public final AppBarConfiguration b;
    public final WeakReference c;
    public DrawerArrowDrawable d;
    public ObjectAnimator e;

    public AbstractAppBarOnDestinationChangedListener(@NotNull Context context0, @NotNull AppBarConfiguration appBarConfiguration0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(appBarConfiguration0, "configuration");
        super();
        this.a = context0;
        this.b = appBarConfiguration0;
        Openable openable0 = appBarConfiguration0.getOpenableLayout();
        this.c = openable0 == null ? null : new WeakReference(openable0);
    }

    @Override  // androidx.navigation.NavController$OnDestinationChangedListener
    public void onDestinationChanged(@NotNull NavController navController0, @NotNull NavDestination navDestination0, @Nullable Bundle bundle0) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(navController0, "controller");
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        if(navDestination0 instanceof FloatingWindow) {
            return;
        }
        Openable openable0 = this.c == null ? null : ((Openable)this.c.get());
        if(this.c != null && openable0 == null) {
            navController0.removeOnDestinationChangedListener(this);
            return;
        }
        Context context0 = this.a;
        String s = navDestination0.fillInLabel(context0, bundle0);
        if(s != null) {
            this.setTitle(s);
        }
        boolean z = this.b.isTopLevelDestination(navDestination0);
        if(openable0 == null && z) {
            this.setNavigationIcon(null, 0);
            return;
        }
        boolean z1 = openable0 != null && z;
        DrawerArrowDrawable drawerArrowDrawable0 = this.d;
        if(drawerArrowDrawable0 == null) {
        label_21:
            DrawerArrowDrawable drawerArrowDrawable1 = new DrawerArrowDrawable(context0);
            this.d = drawerArrowDrawable1;
            pair0 = TuplesKt.to(drawerArrowDrawable1, Boolean.FALSE);
        }
        else {
            pair0 = TuplesKt.to(drawerArrowDrawable0, Boolean.TRUE);
            if(pair0 == null) {
                goto label_21;
            }
        }
        DrawerArrowDrawable drawerArrowDrawable2 = (DrawerArrowDrawable)pair0.component1();
        this.setNavigationIcon(drawerArrowDrawable2, (z1 ? string.nav_app_bar_open_drawer_description : string.nav_app_bar_navigate_up_description));
        if(((Boolean)pair0.component2()).booleanValue()) {
            float f = drawerArrowDrawable2.getProgress();
            ObjectAnimator objectAnimator0 = this.e;
            if(objectAnimator0 != null) {
                objectAnimator0.cancel();
            }
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(drawerArrowDrawable2, "progress", new float[]{f, (z1 ? 0.0f : 1.0f)});
            this.e = objectAnimator1;
            Intrinsics.checkNotNull(objectAnimator1, "null cannot be cast to non-null type android.animation.ObjectAnimator");
            objectAnimator1.start();
            return;
        }
        drawerArrowDrawable2.setProgress((z1 ? 0.0f : 1.0f));
    }

    public abstract void setNavigationIcon(@Nullable Drawable arg1, @StringRes int arg2);

    public abstract void setTitle(@Nullable CharSequence arg1);
}

