package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001A\'\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0017\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"navArgument", "Landroidx/navigation/NamedNavArgument;", "name", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "", "Lkotlin/ExtensionFunctionType;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NamedNavArgumentKt {
    @NotNull
    public static final NamedNavArgument navArgument(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "builder");
        NavArgumentBuilder navArgumentBuilder0 = new NavArgumentBuilder();
        function10.invoke(navArgumentBuilder0);
        return new NamedNavArgument(s, navArgumentBuilder0.build());
    }
}

