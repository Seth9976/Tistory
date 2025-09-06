package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@ExperimentalUnsignedTypes
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003J\u0016\u0010\t\u001A\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001A\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000F\u001A\u00020\u0002H\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ/\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u0015\u001A\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001F\u001A\u00020\u00162\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u0006H\u0014ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001E\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lkotlinx/serialization/internal/UByteArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UByteArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UByte;", "Lkotlinx/serialization/internal/UByteArrayBuilder;", "", "collectionSize-GBYM_sE", "([B)I", "collectionSize", "toBuilder-GBYM_sE", "([B)Lkotlinx/serialization/internal/UByteArrayBuilder;", "toBuilder", "empty-TcUX1vc", "()[B", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/UByteArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent-Coi6ktg", "(Lkotlinx/serialization/encoding/CompositeEncoder;[BI)V", "writeContent", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@ExperimentalSerializationApi
public final class UByteArraySerializer extends PrimitiveArraySerializer implements KSerializer {
    @NotNull
    public static final UByteArraySerializer INSTANCE;

    static {
        UByteArraySerializer.INSTANCE = new UByteArraySerializer(BuiltinSerializersKt.serializer(UByte.Companion));  // 初始化器: Lkotlinx/serialization/internal/PrimitiveArraySerializer;-><init>(Lkotlinx/serialization/KSerializer;)V
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Object object0) {
        return this.collectionSize-GBYM_sE(((UByteArray)object0).unbox-impl());
    }

    public int collectionSize-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$collectionSize");
        return UByteArray.getSize-impl(arr_b);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public Object empty() {
        return UByteArray.box-impl(new byte[0]);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public byte[] empty-TcUX1vc() [...] // 潜在的解密器

    @Override  // kotlinx.serialization.internal.CollectionLikeSerializer
    public void readElement(CompositeDecoder compositeDecoder0, int v, Object object0, boolean z) {
        this.readElement(compositeDecoder0, v, ((UByteArrayBuilder)object0), z);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder compositeDecoder0, int v, PrimitiveArrayBuilder primitiveArrayBuilder0, boolean z) {
        this.readElement(compositeDecoder0, v, ((UByteArrayBuilder)primitiveArrayBuilder0), z);
    }

    public void readElement(@NotNull CompositeDecoder compositeDecoder0, int v, @NotNull UByteArrayBuilder uByteArrayBuilder0, boolean z) {
        Intrinsics.checkNotNullParameter(compositeDecoder0, "decoder");
        Intrinsics.checkNotNullParameter(uByteArrayBuilder0, "builder");
        uByteArrayBuilder0.append-7apg3OU$kotlinx_serialization_core(UByte.constructor-impl(compositeDecoder0.decodeInlineElement(this.getDescriptor(), v).decodeByte()));
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object toBuilder(Object object0) {
        return this.toBuilder-GBYM_sE(((UByteArray)object0).unbox-impl());
    }

    @NotNull
    public UByteArrayBuilder toBuilder-GBYM_sE(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "$this$toBuilder");
        return new UByteArrayBuilder(arr_b, null);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder compositeEncoder0, Object object0, int v) {
        this.writeContent-Coi6ktg(compositeEncoder0, ((UByteArray)object0).unbox-impl(), v);
    }

    public void writeContent-Coi6ktg(@NotNull CompositeEncoder compositeEncoder0, @NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(compositeEncoder0, "encoder");
        Intrinsics.checkNotNullParameter(arr_b, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            compositeEncoder0.encodeInlineElement(this.getDescriptor(), v1).encodeByte(UByteArray.get-w2LRezQ(arr_b, v1));
        }
    }
}

