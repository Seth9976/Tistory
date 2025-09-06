package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

public final class b extends Lambda implements Function1 {
    public final DeserializedPackageFragmentImpl w;

    public b(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl0) {
        this.w = deserializedPackageFragmentImpl0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ClassId)object0), "it");
        SourceElement sourceElement0 = this.w.i;
        if(sourceElement0 == null) {
            sourceElement0 = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(sourceElement0, "NO_SOURCE");
        }
        return sourceElement0;
    }
}

