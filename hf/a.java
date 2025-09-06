package hf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

public final class a extends Lambda implements Function1 {
    public static final a w;

    static {
        a.w = new a(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((UnwrappedType)object0), "it");
        ClassifierDescriptor classifierDescriptor0 = ((UnwrappedType)object0).getConstructor().getDeclarationDescriptor();
        return classifierDescriptor0 == null ? false : Boolean.valueOf(TypeUtilsKt.isTypeAliasParameter(classifierDescriptor0));
    }
}

