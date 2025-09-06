package n4;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import androidx.navigation.AnimBuilder;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigation;
import androidx.navigation.PopUpToBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(1, 0);
        a.y = new a(1, 1);
        a.z = new a(1, 2);
        a.A = new a(1, 3);
        a.B = new a(1, 4);
        a.C = new a(1, 5);
        a.D = new a(1, 6);
        a.E = new a(1, 7);
        a.F = new a(1, 8);
        a.G = new a(1, 9);
        a.H = new a(1, 10);
        a.I = new a(1, 11);
        a.J = new a(1, 12);
        a.K = new a(1, 13);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Context)object0), "it");
                return ((Context)object0) instanceof ContextWrapper ? ((ContextWrapper)(((Context)object0))).getBaseContext() : null;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Context)object0), "it");
                return ((Context)object0) instanceof ContextWrapper ? ((ContextWrapper)(((Context)object0))).getBaseContext() : null;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((NavOptionsBuilder)object0), "$this$navOptions");
                ((NavOptionsBuilder)object0).setRestoreState(true);
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((NavDestination)object0), "destination");
                NavGraph navGraph0 = ((NavDestination)object0).getParent();
                return navGraph0 != null && navGraph0.getStartDestinationId() == ((NavDestination)object0).getId() ? ((NavDestination)object0).getParent() : null;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((NavDestination)object0), "destination");
                NavGraph navGraph1 = ((NavDestination)object0).getParent();
                return navGraph1 != null && navGraph1.getStartDestinationId() == ((NavDestination)object0).getId() ? ((NavDestination)object0).getParent() : null;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((AnimBuilder)object0), "$this$anim");
                ((AnimBuilder)object0).setEnter(0);
                ((AnimBuilder)object0).setExit(0);
                return Unit.INSTANCE;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((PopUpToBuilder)object0), "$this$popUpTo");
                ((PopUpToBuilder)object0).setSaveState(true);
                return Unit.INSTANCE;
            }
            case 7: {
                Intrinsics.checkNotNullParameter(((NavDestination)object0), "it");
                String s = ((NavDestination)object0).getRoute();
                Intrinsics.checkNotNull(s);
                return s;
            }
            case 8: {
                Intrinsics.checkNotNullParameter(((PopUpToBuilder)object0), "$this$null");
                return Unit.INSTANCE;
            }
            case 9: {
                Intrinsics.checkNotNullParameter(((PopUpToBuilder)object0), "$this$null");
                return Unit.INSTANCE;
            }
            case 10: {
                Intrinsics.checkNotNullParameter(((PopUpToBuilder)object0), "$this$null");
                return Unit.INSTANCE;
            }
            case 11: {
                Intrinsics.checkNotNullParameter(((View)object0), "it");
                ViewParent viewParent0 = ((View)object0).getParent();
                return viewParent0 instanceof View ? ((View)viewParent0) : null;
            }
            case 12: {
                Intrinsics.checkNotNullParameter(((View)object0), "it");
                return Navigation.access$getViewNavController(Navigation.INSTANCE, ((View)object0));
            }
            default: {
                Intrinsics.checkNotNullParameter(((NavOptionsBuilder)object0), "$this$navOptions");
                ((NavOptionsBuilder)object0).setLaunchSingleTop(true);
                return Unit.INSTANCE;
            }
        }
    }
}

