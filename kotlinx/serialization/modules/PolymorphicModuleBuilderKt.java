package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A7\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004\u0018\u0001*\u0002H\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0086\b\u001A7\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004\u0018\u0001*\u0002H\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00040\tH\u0086\b¨\u0006\n"}, d2 = {"subclass", "", "Base", "", "T", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "clazz", "Lkotlin/reflect/KClass;", "serializer", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PolymorphicModuleBuilderKt {
    public static final void subclass(PolymorphicModuleBuilder polymorphicModuleBuilder0, KClass kClass0) {
        Intrinsics.checkNotNullParameter(polymorphicModuleBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "clazz");
        Intrinsics.reifiedOperationMarker(6, "T");
        polymorphicModuleBuilder0.subclass(kClass0, SerializersKt.serializer(null));
    }

    public static final void subclass(PolymorphicModuleBuilder polymorphicModuleBuilder0, KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(polymorphicModuleBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        Intrinsics.reifiedOperationMarker(4, "T");
        polymorphicModuleBuilder0.subclass(Reflection.getOrCreateKotlinClass(Object.class), kSerializer0);
    }
}

