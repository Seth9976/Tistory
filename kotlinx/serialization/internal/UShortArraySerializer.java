package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@ExperimentalUnsignedTypes
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003J\u0016\u0010\t\u001A\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001A\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000F\u001A\u00020\u0002H\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ/\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u0015\u001A\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001F\u001A\u00020\u00162\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u0006H\u0014ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001E\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lkotlinx/serialization/internal/UShortArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShortArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UShort;", "Lkotlinx/serialization/internal/UShortArrayBuilder;", "", "collectionSize-rL5Bavg", "([S)I", "collectionSize", "toBuilder-rL5Bavg", "([S)Lkotlinx/serialization/internal/UShortArrayBuilder;", "toBuilder", "empty-amswpOA", "()[S", "empty", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/UShortArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent-eny0XGE", "(Lkotlinx/serialization/encoding/CompositeEncoder;[SI)V", "writeContent", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@ExperimentalSerializationApi
public final class UShortArraySerializer extends PrimitiveArraySerializer implements KSerializer {
    @NotNull
    public static final UShortArraySerializer INSTANCE;

    static {
        UShortArraySerializer.INSTANCE = new UShortArraySerializer(BuiltinSerializersKt.serializer(UShort.Companion));  // 初始化器: Lkotlinx/serialization/internal/PrimitiveArraySerializer;-><init>(Lkotlinx/serialization/KSerializer;)V
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Object object0) {
        return this.collectionSize-rL5Bavg(((UShortArray)object0).unbox-impl());
    }

    public int collectionSize-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$collectionSize");
        return UShortArray.getSize-impl(arr_v);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public Object empty() {
        return UShortArray.box-impl(this.empty-amswpOA());
    }

    @NotNull
    public short[] empty-amswpOA() {
        return UShortArray.constructor-impl(0);
    }

    @Override  // kotlinx.serialization.internal.CollectionLikeSerializer
    public void readElement(CompositeDecoder compositeDecoder0, int v, Object object0, boolean z) {
        this.readElement(compositeDecoder0, v, ((UShortArrayBuilder)object0), z);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder compositeDecoder0, int v, PrimitiveArrayBuilder primitiveArrayBuilder0, boolean z) {
        this.readElement(compositeDecoder0, v, ((UShortArrayBuilder)primitiveArrayBuilder0), z);
    }

    public void readElement(@NotNull CompositeDecoder compositeDecoder0, int v, @NotNull UShortArrayBuilder uShortArrayBuilder0, boolean z) {
        Intrinsics.checkNotNullParameter(compositeDecoder0, "decoder");
        Intrinsics.checkNotNullParameter(uShortArrayBuilder0, "builder");
        uShortArrayBuilder0.append-xj2QHRw$kotlinx_serialization_core(UShort.constructor-impl(compositeDecoder0.decodeInlineElement(this.getDescriptor(), v).decodeShort()));
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object toBuilder(Object object0) {
        return this.toBuilder-rL5Bavg(((UShortArray)object0).unbox-impl());
    }

    @NotNull
    public UShortArrayBuilder toBuilder-rL5Bavg(@NotNull short[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "$this$toBuilder");
        return new UShortArrayBuilder(arr_v, null);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder compositeEncoder0, Object object0, int v) {
        this.writeContent-eny0XGE(compositeEncoder0, ((UShortArray)object0).unbox-impl(), v);
    }

    public void writeContent-eny0XGE(@NotNull CompositeEncoder compositeEncoder0, @NotNull short[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(compositeEncoder0, "encoder");
        Intrinsics.checkNotNullParameter(arr_v, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            compositeEncoder0.encodeInlineElement(this.getDescriptor(), v1).encodeShort(UShortArray.get-Mh2AYeg(arr_v, v1));
        }
    }
}

