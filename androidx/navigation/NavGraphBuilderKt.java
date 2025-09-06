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
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\\\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00032\u001D\b\u0002\u0010\u0006\u001A\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000B\u0012\u0002\b\u00030\t\u00A2\u0006\u0002\b\n0\u00072\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0002\b\rH\u0086\b\u00F8\u0001\u0000\u001A=\u0010\u0000\u001A\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\u000E\u001A\u00020\u000F2\b\b\u0001\u0010\u0005\u001A\u00020\u000F2\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0002\b\rH\u0087\b\u00F8\u0001\u0000\u001A9\u0010\u0000\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0002\b\rH\u0086\b\u00F8\u0001\u0000\u001A`\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u00122\u001D\b\u0002\u0010\u0006\u001A\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000B\u0012\u0002\b\u00030\t\u00A2\u0006\u0002\b\n0\u00072\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0002\b\rH\u0086\b\u00F8\u0001\u0000\u001A`\u0010\u0000\u001A\u00020\u0013*\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00032\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u001D\b\u0002\u0010\u0006\u001A\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000B\u0012\u0002\b\u00030\t\u00A2\u0006\u0002\b\n0\u00072\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0002\b\rH\u0086\b\u00F8\u0001\u0000\u001A=\u0010\u0000\u001A\u00020\u0013*\u00020\u00142\b\b\u0003\u0010\u000E\u001A\u00020\u000F2\b\b\u0001\u0010\u0005\u001A\u00020\u000F2\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0002\b\rH\u0087\b\u00F8\u0001\u0000\u001A=\u0010\u0000\u001A\u00020\u0013*\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u00102\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0002\b\rH\u0086\b\u00F8\u0001\u0000\u001Ad\u0010\u0000\u001A\u00020\u0013*\u00020\u00142\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u00122\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u001D\b\u0002\u0010\u0006\u001A\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000B\u0012\u0002\b\u00030\t\u00A2\u0006\u0002\b\n0\u00072\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f\u00A2\u0006\u0002\b\rH\u0086\b\u00F8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006\u0015"}, d2 = {"navigation", "", "T", "", "Landroidx/navigation/NavGraphBuilder;", "startDestination", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "builder", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "id", "", "", "route", "Lkotlin/reflect/KClass;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NavGraphBuilderKt {
    @Deprecated(message = "Use routes to build your NavGraph instead", replaceWith = @ReplaceWith(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider0, @IdRes int v, @IdRes int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, v, v1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider0, @NotNull Object object0, @Nullable KClass kClass0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, object0, kClass0, map0);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider0, @NotNull String s, @Nullable String s1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(s, "startDestination");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, s, s1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider0, @NotNull KClass kClass0, @Nullable KClass kClass1, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, kClass0, kClass1, map0);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    @Deprecated(message = "Use routes to build your nested NavGraph instead", replaceWith = @ReplaceWith(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder0, @IdRes int v, @IdRes int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), v, v1);
        function10.invoke(navGraphBuilder1);
        navGraphBuilder0.destination(navGraphBuilder1);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder0, Object object0, Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), object0, Reflection.getOrCreateKotlinClass(Object.class), map0);
        function10.invoke(navGraphBuilder1);
        navGraphBuilder0.destination(navGraphBuilder1);
    }

    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull String s, @NotNull String s1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "startDestination");
        Intrinsics.checkNotNullParameter(s1, "route");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), s, s1);
        function10.invoke(navGraphBuilder1);
        navGraphBuilder0.destination(navGraphBuilder1);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder0, KClass kClass0, Map map0, Function1 function10) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), kClass0, Reflection.getOrCreateKotlinClass(Object.class), map0);
        function10.invoke(navGraphBuilder1);
        navGraphBuilder0.destination(navGraphBuilder1);
    }

    public static NavGraph navigation$default(NavigatorProvider navigatorProvider0, int v, int v1, Function1 function10, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, v, v1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    public static NavGraph navigation$default(NavigatorProvider navigatorProvider0, Object object0, KClass kClass0, Map map0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            kClass0 = null;
        }
        if((v & 4) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, object0, kClass0, map0);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    public static NavGraph navigation$default(NavigatorProvider navigatorProvider0, String s, String s1, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(s, "startDestination");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, s, s1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    public static NavGraph navigation$default(NavigatorProvider navigatorProvider0, KClass kClass0, KClass kClass1, Map map0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            kClass1 = null;
        }
        if((v & 4) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navigatorProvider0, kClass0, kClass1, map0);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, Object object0, Map map0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), object0, Reflection.getOrCreateKotlinClass(Object.class), map0);
        function10.invoke(navGraphBuilder1);
        navGraphBuilder0.destination(navGraphBuilder1);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder0, KClass kClass0, Map map0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilder navGraphBuilder1 = new NavGraphBuilder(navGraphBuilder0.getProvider(), kClass0, Reflection.getOrCreateKotlinClass(Object.class), map0);
        function10.invoke(navGraphBuilder1);
        navGraphBuilder0.destination(navGraphBuilder1);
    }
}

