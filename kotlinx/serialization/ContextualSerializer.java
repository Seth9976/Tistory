package kotlinx.serialization;

import androidx.compose.foundation.text.selection.g1;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\b\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007¢\u0006\u0004\b\t\u0010\nB\u0017\b\u0016\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\u000BJ\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001A\u0010\u001B\u001A\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Lkotlinx/serialization/ContextualSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "serializableClass", "fallbackSerializer", "", "typeArgumentsSerializers", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V", "(Lkotlin/reflect/KClass;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public final class ContextualSerializer implements KSerializer {
    public final KClass a;
    public final KSerializer b;
    public final List c;
    public final SerialDescriptor d;

    public ContextualSerializer(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "serializableClass");
        this(kClass0, null, PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY);
    }

    public ContextualSerializer(@NotNull KClass kClass0, @Nullable KSerializer kSerializer0, @NotNull KSerializer[] arr_kSerializer) {
        Intrinsics.checkNotNullParameter(kClass0, "serializableClass");
        Intrinsics.checkNotNullParameter(arr_kSerializer, "typeArgumentsSerializers");
        super();
        this.a = kClass0;
        this.b = kSerializer0;
        this.c = ArraysKt___ArraysJvmKt.asList(arr_kSerializer);
        g1 g10 = new g1(this, 29);
        this.d = ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", CONTEXTUAL.INSTANCE, new SerialDescriptor[0], g10), kClass0);
    }

    public static final KSerializer access$getFallbackSerializer$p(ContextualSerializer contextualSerializer0) {
        return contextualSerializer0.b;
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Object deserialize(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        SerializersModule serializersModule0 = decoder0.getSerializersModule();
        KClass kClass0 = this.a;
        KSerializer kSerializer0 = serializersModule0.getContextual(kClass0, this.c);
        if(kSerializer0 == null) {
            kSerializer0 = this.b;
            if(kSerializer0 == null) {
                Platform_commonKt.serializerNotRegistered(kClass0);
                throw new KotlinNothingValueException();
            }
        }
        return decoder0.decodeSerializableValue(kSerializer0);
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(object0, "value");
        SerializersModule serializersModule0 = encoder0.getSerializersModule();
        KClass kClass0 = this.a;
        KSerializer kSerializer0 = serializersModule0.getContextual(kClass0, this.c);
        if(kSerializer0 == null) {
            kSerializer0 = this.b;
            if(kSerializer0 == null) {
                Platform_commonKt.serializerNotRegistered(kClass0);
                throw new KotlinNothingValueException();
            }
        }
        encoder0.encodeSerializableValue(kSerializer0, object0);
    }
}

