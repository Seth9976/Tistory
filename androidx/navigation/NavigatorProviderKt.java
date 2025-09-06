package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A,\u0010\u0000\u001A\u0002H\u0001\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0086\n¢\u0006\u0002\u0010\u0007\u001A2\u0010\u0000\u001A\u0002H\u0001\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002*\u00020\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00010\tH\u0086\n¢\u0006\u0002\u0010\n\u001A\u001D\u0010\u000B\u001A\u00020\f*\u00020\u00042\u000E\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0086\n\u001A/\u0010\u000E\u001A\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u000E\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0086\n¨\u0006\u000F"}, d2 = {"get", "T", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavigatorProvider;", "name", "", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;)Landroidx/navigation/Navigator;", "clazz", "Lkotlin/reflect/KClass;", "(Landroidx/navigation/NavigatorProvider;Lkotlin/reflect/KClass;)Landroidx/navigation/Navigator;", "plusAssign", "", "navigator", "set", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NavigatorProviderKt {
    @NotNull
    public static final Navigator get(@NotNull NavigatorProvider navigatorProvider0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        return navigatorProvider0.getNavigator(s);
    }

    @NotNull
    public static final Navigator get(@NotNull NavigatorProvider navigatorProvider0, @NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "clazz");
        return navigatorProvider0.getNavigator(JvmClassMappingKt.getJavaClass(kClass0));
    }

    public static final void plusAssign(@NotNull NavigatorProvider navigatorProvider0, @NotNull Navigator navigator0) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        navigatorProvider0.addNavigator(navigator0);
    }

    @Nullable
    public static final Navigator set(@NotNull NavigatorProvider navigatorProvider0, @NotNull String s, @NotNull Navigator navigator0) {
        Intrinsics.checkNotNullParameter(navigatorProvider0, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        return navigatorProvider0.addNavigator(s, navigator0);
    }
}

