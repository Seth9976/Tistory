package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J/\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\b\u0002\u0010\n\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\tH\'¢\u0006\u0004\b\u0006\u0010\u000BJ9\u0010\u000F\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000E\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000E\u0010\f\u001A\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\r\u001A\u00028\u0000H\'¢\u0006\u0004\b\u000F\u0010\u0010J;\u0010\u000F\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000E\u0010\f\u001A\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\'¢\u0006\u0004\b\u000F\u0010\u0014J\u0017\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015H\'¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0001\u0001\u001A¨\u0006\u001B"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "", "T", "Lkotlin/reflect/KClass;", "kclass", "Lkotlinx/serialization/KSerializer;", "getContextual", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "kClass", "", "typeArgumentsSerializers", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "baseClass", "value", "Lkotlinx/serialization/SerializationStrategy;", "getPolymorphic", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "", "serializedClassName", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "collector", "", "dumpTo", "(Lkotlinx/serialization/modules/SerializersModuleCollector;)V", "Lkotlinx/serialization/modules/SerialModuleImpl;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SerializersModule {
    public SerializersModule(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @ExperimentalSerializationApi
    public abstract void dumpTo(@NotNull SerializersModuleCollector arg1);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of overload with default parameter", replaceWith = @ReplaceWith(expression = "getContextual(kclass)", imports = {}))
    @ExperimentalSerializationApi
    public final KSerializer getContextual(KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "kclass");
        return this.getContextual(kClass0, CollectionsKt__CollectionsKt.emptyList());
    }

    @ExperimentalSerializationApi
    @Nullable
    public abstract KSerializer getContextual(@NotNull KClass arg1, @NotNull List arg2);

    public static KSerializer getContextual$default(SerializersModule serializersModule0, KClass kClass0, List list0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        return serializersModule0.getContextual(kClass0, list0);
    }

    @ExperimentalSerializationApi
    @Nullable
    public abstract DeserializationStrategy getPolymorphic(@NotNull KClass arg1, @Nullable String arg2);

    @ExperimentalSerializationApi
    @Nullable
    public abstract SerializationStrategy getPolymorphic(@NotNull KClass arg1, @NotNull Object arg2);
}

