package hf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class c extends Lambda implements Function1 {
    public static final c w;

    static {
        c.w = new c(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((UnwrappedType)object0), "it");
        ClassifierDescriptor classifierDescriptor0 = ((UnwrappedType)object0).getConstructor().getDeclarationDescriptor();
        return Boolean.valueOf(classifierDescriptor0 != null && (classifierDescriptor0 instanceof TypeAliasDescriptor || classifierDescriptor0 instanceof TypeParameterDescriptor));
    }
}

