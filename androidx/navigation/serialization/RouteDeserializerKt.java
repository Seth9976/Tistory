package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.SavedStateHandle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A=\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0016\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006H\u0007¢\u0006\u0002\u0010\t\u001A=\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\n\u001A\u00020\u000B2\u0016\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"decodeArguments", "T", "Lkotlinx/serialization/KSerializer;", "bundle", "Landroid/os/Bundle;", "typeMap", "", "", "Landroidx/navigation/NavType;", "(Lkotlinx/serialization/KSerializer;Landroid/os/Bundle;Ljava/util/Map;)Ljava/lang/Object;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Lkotlinx/serialization/KSerializer;Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RouteDeserializerKt {
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final Object decodeArguments(@NotNull KSerializer kSerializer0, @NotNull Bundle bundle0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "<this>");
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        return new RouteDecoder(bundle0, map0).decodeRouteWithArgs$navigation_common_release(kSerializer0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final Object decodeArguments(@NotNull KSerializer kSerializer0, @NotNull SavedStateHandle savedStateHandle0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "<this>");
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        Intrinsics.checkNotNullParameter(map0, "typeMap");
        return new RouteDecoder(savedStateHandle0, map0).decodeRouteWithArgs$navigation_common_release(kSerializer0);
    }
}

