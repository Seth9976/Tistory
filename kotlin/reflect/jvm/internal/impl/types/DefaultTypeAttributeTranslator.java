package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {
    @NotNull
    public static final DefaultTypeAttributeTranslator INSTANCE;

    static {
        DefaultTypeAttributeTranslator.INSTANCE = new DefaultTypeAttributeTranslator();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    @NotNull
    public TypeAttributes toAttributes(@NotNull Annotations annotations0, @Nullable TypeConstructor typeConstructor0, @Nullable DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        if(annotations0.isEmpty()) {
            return TypeAttributes.Companion.getEmpty();
        }
        List list0 = k.listOf(new AnnotationsTypeAttribute(annotations0));
        return TypeAttributes.Companion.create(list0);
    }
}

