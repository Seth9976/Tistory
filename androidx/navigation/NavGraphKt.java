package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.serialization.RouteSerializerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A$\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0006\u001A\u0017\u0010\u0000\u001A\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\u0007\u001A\u00020\bH\u0086\u0002\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\tH\u0086\u0002\u001A\'\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\nH\u0086\n\u001A$\u0010\u000B\u001A\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\u0086\n¢\u0006\u0002\u0010\r\u001A\u0017\u0010\u000B\u001A\u00020\f*\u00020\u00042\b\b\u0001\u0010\u0007\u001A\u00020\bH\u0086\n\u001A\u0015\u0010\u000B\u001A\u00020\f*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\tH\u0086\n\u001A\'\u0010\u000B\u001A\u00020\f\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\nH\u0086\n\u001A\u0015\u0010\u000E\u001A\u00020\u000F*\u00020\u00042\u0006\u0010\u0010\u001A\u00020\fH\u0086\n\u001A\u0015\u0010\u0011\u001A\u00020\u000F*\u00020\u00042\u0006\u0010\u0010\u001A\u00020\fH\u0086\n\u001A\u0015\u0010\u0011\u001A\u00020\u000F*\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004H\u0086\n¨\u0006\u0013"}, d2 = {"contains", "", "T", "", "Landroidx/navigation/NavGraph;", "route", "(Landroidx/navigation/NavGraph;Ljava/lang/Object;)Z", "id", "", "", "Lkotlin/reflect/KClass;", "get", "Landroidx/navigation/NavDestination;", "(Landroidx/navigation/NavGraph;Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "minusAssign", "", "node", "plusAssign", "other", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraphKt\n+ 2 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n1#1,590:1\n221#2:591\n221#2:592\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraphKt\n*L\n534#1:591\n555#1:592\n*E\n"})
public final class NavGraphKt {
    public static final boolean contains(@NotNull NavGraph navGraph0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        return navGraph0.findNode(v) != null;
    }

    public static final boolean contains(@NotNull NavGraph navGraph0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "route");
        return navGraph0.findNode(object0) != null;
    }

    public static final boolean contains(@NotNull NavGraph navGraph0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(s, "route");
        return navGraph0.findNode(s) != null;
    }

    public static final boolean contains(NavGraph navGraph0, KClass kClass0) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "route");
        Intrinsics.reifiedOperationMarker(6, "T");
        return navGraph0.findNode(RouteSerializerKt.generateHashCode(SerializersKt.serializer(null))) != null;
    }

    @NotNull
    public static final NavDestination get(@NotNull NavGraph navGraph0, @IdRes int v) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        NavDestination navDestination0 = navGraph0.findNode(v);
        if(navDestination0 == null) {
            throw new IllegalArgumentException("No destination for " + v + " was found in " + navGraph0);
        }
        return navDestination0;
    }

    @NotNull
    public static final NavDestination get(@NotNull NavGraph navGraph0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "route");
        NavDestination navDestination0 = navGraph0.findNode(object0);
        if(navDestination0 == null) {
            throw new IllegalArgumentException("No destination for " + object0 + " was found in " + navGraph0);
        }
        return navDestination0;
    }

    @NotNull
    public static final NavDestination get(@NotNull NavGraph navGraph0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(s, "route");
        NavDestination navDestination0 = navGraph0.findNode(s);
        if(navDestination0 == null) {
            throw new IllegalArgumentException("No destination for " + s + " was found in " + navGraph0);
        }
        return navDestination0;
    }

    public static final NavDestination get(NavGraph navGraph0, KClass kClass0) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "route");
        Intrinsics.reifiedOperationMarker(6, "T");
        NavDestination navDestination0 = navGraph0.findNode(RouteSerializerKt.generateHashCode(SerializersKt.serializer(null)));
        if(navDestination0 == null) {
            throw new IllegalArgumentException("No destination for " + kClass0 + " was found in " + navGraph0);
        }
        return navDestination0;
    }

    public static final void minusAssign(@NotNull NavGraph navGraph0, @NotNull NavDestination navDestination0) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(navDestination0, "node");
        navGraph0.remove(navDestination0);
    }

    public static final void plusAssign(@NotNull NavGraph navGraph0, @NotNull NavDestination navDestination0) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(navDestination0, "node");
        navGraph0.addDestination(navDestination0);
    }

    public static final void plusAssign(@NotNull NavGraph navGraph0, @NotNull NavGraph navGraph1) {
        Intrinsics.checkNotNullParameter(navGraph0, "<this>");
        Intrinsics.checkNotNullParameter(navGraph1, "other");
        navGraph0.addAll(navGraph1);
    }
}

