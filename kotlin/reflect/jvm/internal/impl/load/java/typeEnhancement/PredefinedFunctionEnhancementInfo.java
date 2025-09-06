package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PredefinedFunctionEnhancementInfo {
    public final TypeEnhancementInfo a;
    public final List b;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, 3, null);
    }

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "parametersInfo");
        super();
        this.a = typeEnhancementInfo0;
        this.b = list0;
    }

    public PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            typeEnhancementInfo0 = null;
        }
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(typeEnhancementInfo0, list0);
    }

    @NotNull
    public final List getParametersInfo() {
        return this.b;
    }

    @Nullable
    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.a;
    }
}

