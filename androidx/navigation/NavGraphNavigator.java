package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Name("navigation")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0011\u001A\u00020\u00102\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001A\u0004\u0018\u00010\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0016\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00138F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroidx/navigation/NavigatorProvider;)V", "createDestination", "()Landroidx/navigation/NavGraph;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public class NavGraphNavigator extends Navigator {
    public final NavigatorProvider c;

    public NavGraphNavigator(@NotNull NavigatorProvider navigatorProvider0) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "navigatorProvider");
        super();
        this.c = navigatorProvider0;
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return this.createDestination();
    }

    @NotNull
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    @NotNull
    public final StateFlow getBackStack() {
        return this.getState().getBackStack();
    }

    @Override  // androidx.navigation.Navigator
    public void navigate(@NotNull List list0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(list0, "entries");
        for(Object object0: list0) {
            NavDestination navDestination0 = ((NavBackStackEntry)object0).getDestination();
            Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            NavGraph navGraph0 = (NavGraph)navDestination0;
            Bundle bundle0 = ((NavBackStackEntry)object0).getArguments();
            int v = navGraph0.getStartDestinationId();
            String s = navGraph0.getStartDestinationRoute();
            if(v == 0 && s == null) {
                throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph0.getDisplayName()).toString());
            }
            NavDestination navDestination1 = s == null ? ((NavDestination)navGraph0.getNodes().get(v)) : navGraph0.findNode(s, false);
            if(navDestination1 == null) {
                throw new IllegalArgumentException(a.d("navigation destination ", navGraph0.getStartDestDisplayName(), " is not a direct child of this NavGraph"));
            }
            if(s != null) {
                DeepLinkMatch navDestination$DeepLinkMatch0 = navDestination1.matchDeepLink(s);
                Bundle bundle1 = navDestination$DeepLinkMatch0 == null ? null : navDestination$DeepLinkMatch0.getMatchingArgs();
                if(bundle1 != null && !bundle1.isEmpty()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putAll(bundle1);
                    if(bundle0 != null) {
                        bundle2.putAll(bundle0);
                    }
                    bundle0 = bundle2;
                }
            }
            this.c.getNavigator(navDestination1.getNavigatorName()).navigate(k.listOf(this.getState().createBackStackEntry(navDestination1, navDestination1.addInDefaultArgs(bundle0))), navOptions0, navigator$Extras0);
        }
    }
}

