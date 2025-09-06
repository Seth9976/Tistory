package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class PrimitiveTypeUtilKt {
    @NotNull
    public static final Collection getAllSignedLiteralTypes(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        return CollectionsKt__CollectionsKt.listOf(new SimpleType[]{moduleDescriptor0.getBuiltIns().getIntType(), moduleDescriptor0.getBuiltIns().getLongType(), moduleDescriptor0.getBuiltIns().getByteType(), moduleDescriptor0.getBuiltIns().getShortType()});
    }
}

