package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A3\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001A\u00020\u00042\u0017\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001A1\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001A\u00020\n2\u0017\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001AT\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u000B\u0018\u0001*\u00020\f*\u00020\u00022\u001D\b\u0002\u0010\r\u001A\u0017\u0012\u0004\u0012\u00020\u000F\u0012\r\u0012\u000B\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000E2\u0017\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"activity", "", "Landroidx/navigation/NavGraphBuilder;", "id", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "route", "", "T", "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nActivityNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,126:1\n157#2:127\n157#2:128\n157#2:129\n*S KotlinDebug\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n*L\n40#1:127\n49#1:128\n66#1:129\n*E\n"})
public final class ActivityNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to build your ActivityDestination instead", replaceWith = @ReplaceWith(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(@NotNull NavGraphBuilder navGraphBuilder0, @IdRes int v, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder0 = new ActivityNavigatorDestinationBuilder(((ActivityNavigator)navGraphBuilder0.getProvider().getNavigator(ActivityNavigator.class)), v);
        function10.invoke(activityNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(activityNavigatorDestinationBuilder0);
    }

    public static final void activity(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "route");
        Intrinsics.checkNotNullParameter(function10, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder0 = new ActivityNavigatorDestinationBuilder(((ActivityNavigator)navGraphBuilder0.getProvider().getNavigator(ActivityNavigator.class)), s);
        function10.invoke(activityNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(activityNavigatorDestinationBuilder0);
    }

    public static final void activity(NavGraphBuilder navGraphBuilder0, Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        ActivityNavigator activityNavigator0 = (ActivityNavigator)navGraphBuilder0.getProvider().getNavigator(ActivityNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder0 = new ActivityNavigatorDestinationBuilder(activityNavigator0, Reflection.getOrCreateKotlinClass(Object.class), map0);
        function10.invoke(activityNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(activityNavigatorDestinationBuilder0);
    }

    public static void activity$default(NavGraphBuilder navGraphBuilder0, Map map0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        ActivityNavigator activityNavigator0 = (ActivityNavigator)navGraphBuilder0.getProvider().getNavigator(ActivityNavigator.class);
        Intrinsics.reifiedOperationMarker(4, "T");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder0 = new ActivityNavigatorDestinationBuilder(activityNavigator0, Reflection.getOrCreateKotlinClass(Object.class), map0);
        function10.invoke(activityNavigatorDestinationBuilder0);
        navGraphBuilder0.destination(activityNavigatorDestinationBuilder0);
    }
}

