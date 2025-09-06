package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A$\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"InlinePrimitiveDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "name", "", "primitiveSerializer", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class InlineClassDescriptorKt {
    @InternalSerializationApi
    @NotNull
    public static final SerialDescriptor InlinePrimitiveDescriptor(@NotNull String s, @NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(kSerializer0, "primitiveSerializer");
        return new InlineClassDescriptor(s, new GeneratedSerializer() {
            public final KSerializer a;

            {
                KSerializer kSerializer0 = kSerializer0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = kSerializer0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                return new KSerializer[]{this.a};
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(@NotNull Decoder decoder0) {
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                throw new IllegalStateException("unsupported");
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                throw new IllegalStateException("unsupported");
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(@NotNull Encoder encoder0, Object object0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                throw new IllegalStateException("unsupported");
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        });
    }
}

