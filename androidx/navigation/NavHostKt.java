package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000E\n\u0000\u001A`\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u001D\b\u0002\u0010\u0007\u001A\u0017\u0012\u0004\u0012\u00020\t\u0012\r\u0012\u000B\u0012\u0002\b\u00030\n¢\u0006\u0002\b\u000B0\b2\u0017\u0010\f\u001A\u0013\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\r¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000\u001A=\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0011\u001A\u00020\u00122\b\b\u0001\u0010\u0003\u001A\u00020\u00122\u0017\u0010\f\u001A\u0013\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\r¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000\u001A=\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00132\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00132\u0017\u0010\f\u001A\u0013\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\r¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000\u001Ad\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u00062\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u001D\b\u0002\u0010\u0007\u001A\u0017\u0012\u0004\u0012\u00020\t\u0012\r\u0012\u000B\u0012\u0002\b\u00030\n¢\u0006\u0002\b\u000B0\b2\u0017\u0010\f\u001A\u0013\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\r¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"createGraph", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavHost;", "startDestination", "", "route", "Lkotlin/reflect/KClass;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "builder", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "id", "", "", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n+ 2 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 3 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,105:1\n2773#2:106\n2786#2:108\n2803#2:110\n2820#2:112\n45#3:107\n59#3:109\n77#3:111\n95#3:113\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n*L\n63#1:106\n70#1:108\n87#1:110\n104#1:112\n63#1:107\n70#1:109\n87#1:111\n104#1:113\n*E\n"})
public final class NavHostKt {
    @Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost0, @IdRes int v, @IdRes int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navHost0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.getNavController().getNavigatorProvider(), v, v1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost0, @NotNull Object object0, @Nullable KClass kClass0, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navHost0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.getNavController().getNavigatorProvider(), object0, kClass0, map0);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost0, @NotNull String s, @Nullable String s1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navHost0, "<this>");
        Intrinsics.checkNotNullParameter(s, "startDestination");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.getNavController().getNavigatorProvider(), s, s1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost0, @NotNull KClass kClass0, @Nullable KClass kClass1, @NotNull Map map0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(navHost0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.getNavController().getNavigatorProvider(), kClass0, kClass1, map0);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    public static NavGraph createGraph$default(NavHost navHost0, int v, int v1, Function1 function10, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        Intrinsics.checkNotNullParameter(navHost0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.getNavController().getNavigatorProvider(), v, v1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    public static NavGraph createGraph$default(NavHost navHost0, Object object0, KClass kClass0, Map map0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            kClass0 = null;
        }
        if((v & 4) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navHost0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.getNavController().getNavigatorProvider(), object0, kClass0, map0);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    public static NavGraph createGraph$default(NavHost navHost0, String s, String s1, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        Intrinsics.checkNotNullParameter(navHost0, "<this>");
        Intrinsics.checkNotNullParameter(s, "startDestination");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.getNavController().getNavigatorProvider(), s, s1);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }

    public static NavGraph createGraph$default(NavHost navHost0, KClass kClass0, KClass kClass1, Map map0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            kClass1 = null;
        }
        if((v & 4) != 0) {
            map0 = x.emptyMap();
        }
        Intrinsics.checkNotNullParameter(navHost0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "startDestination");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavGraphBuilder navGraphBuilder0 = new NavGraphBuilder(navHost0.getNavController().getNavigatorProvider(), kClass0, kClass1, map0);
        function10.invoke(navGraphBuilder0);
        return navGraphBuilder0.build();
    }
}

