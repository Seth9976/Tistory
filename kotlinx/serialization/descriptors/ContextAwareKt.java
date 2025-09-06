package kotlinx.serialization.descriptors;

import gg.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001A\u0016\u0010\u0007\u001A\u0004\u0018\u00010\u0002*\u00020\b2\u0006\u0010\t\u001A\u00020\u0002H\u0007\u001A\u001A\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\u000B*\u00020\b2\u0006\u0010\t\u001A\u00020\u0002H\u0007\u001A\u0018\u0010\f\u001A\u00020\u0002*\u00020\u00022\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\u0001H\u0000\"$\u0010\u0000\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u000E"}, d2 = {"capturedKClass", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getCapturedKClass", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlin/reflect/KClass;", "getContextualDescriptor", "Lkotlinx/serialization/modules/SerializersModule;", "descriptor", "getPolymorphicDescriptors", "", "withContext", "context", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1#2:112\n1549#3:113\n1620#3,3:114\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nkotlinx/serialization/descriptors/ContextAwareKt\n*L\n76#1:113\n76#1:114,3\n*E\n"})
public final class ContextAwareKt {
    @Nullable
    public static final KClass getCapturedKClass(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        if(serialDescriptor0 instanceof a) {
            return ((a)serialDescriptor0).b;
        }
        return serialDescriptor0 instanceof SerialDescriptorForNullable ? ContextAwareKt.getCapturedKClass(((SerialDescriptorForNullable)serialDescriptor0).getOriginal$kotlinx_serialization_core()) : null;
    }

    @ExperimentalSerializationApi
    public static void getCapturedKClass$annotations(SerialDescriptor serialDescriptor0) {
    }

    @ExperimentalSerializationApi
    @Nullable
    public static final SerialDescriptor getContextualDescriptor(@NotNull SerializersModule serializersModule0, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        KClass kClass0 = ContextAwareKt.getCapturedKClass(serialDescriptor0);
        if(kClass0 != null) {
            KSerializer kSerializer0 = SerializersModule.getContextual$default(serializersModule0, kClass0, null, 2, null);
            return kSerializer0 == null ? null : kSerializer0.getDescriptor();
        }
        return null;
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final List getPolymorphicDescriptors(@NotNull SerializersModule serializersModule0, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        KClass kClass0 = ContextAwareKt.getCapturedKClass(serialDescriptor0);
        if(kClass0 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Map map0 = (Map)((SerialModuleImpl)serializersModule0).polyBase2Serializers.get(kClass0);
        Collection collection0 = map0 == null ? null : map0.values();
        if(collection0 == null) {
            collection0 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            list0.add(((KSerializer)object0).getDescriptor());
        }
        return list0;
    }

    @NotNull
    public static final SerialDescriptor withContext(@NotNull SerialDescriptor serialDescriptor0, @NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "context");
        return new a(serialDescriptor0, kClass0);
    }
}

