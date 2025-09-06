package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003J\u0013\u0010\u0007\u001A\u00020\u0006*\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001A\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0014¢\u0006\u0004\b\u000B\u0010\fJ/\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00052\u0006\u0010\u0011\u001A\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\'\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lkotlinx/serialization/internal/BooleanArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/BooleanArrayBuilder;", "", "collectionSize", "([Z)I", "toBuilder", "([Z)Lkotlinx/serialization/internal/BooleanArrayBuilder;", "empty", "()[Z", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "index", "builder", "checkIndex", "", "readElement", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILkotlinx/serialization/internal/BooleanArrayBuilder;Z)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "writeContent", "(Lkotlinx/serialization/encoding/CompositeEncoder;[ZI)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class BooleanArraySerializer extends PrimitiveArraySerializer implements KSerializer {
    @NotNull
    public static final BooleanArraySerializer INSTANCE;

    static {
        BooleanArraySerializer.INSTANCE = new BooleanArraySerializer(BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));  // 初始化器: Lkotlinx/serialization/internal/PrimitiveArraySerializer;-><init>(Lkotlinx/serialization/KSerializer;)V
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Object object0) {
        return this.collectionSize(((boolean[])object0));
    }

    public int collectionSize(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return arr_z.length;
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public Object empty() {
        return this.empty();
    }

    @NotNull
    public boolean[] empty() {
        return new boolean[0];
    }

    @Override  // kotlinx.serialization.internal.CollectionLikeSerializer
    public void readElement(CompositeDecoder compositeDecoder0, int v, Object object0, boolean z) {
        this.readElement(compositeDecoder0, v, ((BooleanArrayBuilder)object0), z);
    }

    public void readElement(@NotNull CompositeDecoder compositeDecoder0, int v, @NotNull BooleanArrayBuilder booleanArrayBuilder0, boolean z) {
        Intrinsics.checkNotNullParameter(compositeDecoder0, "decoder");
        Intrinsics.checkNotNullParameter(booleanArrayBuilder0, "builder");
        booleanArrayBuilder0.append$kotlinx_serialization_core(compositeDecoder0.decodeBooleanElement(this.getDescriptor(), v));
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(CompositeDecoder compositeDecoder0, int v, PrimitiveArrayBuilder primitiveArrayBuilder0, boolean z) {
        this.readElement(compositeDecoder0, v, ((BooleanArrayBuilder)primitiveArrayBuilder0), z);
    }

    @Override  // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Object toBuilder(Object object0) {
        return this.toBuilder(((boolean[])object0));
    }

    @NotNull
    public BooleanArrayBuilder toBuilder(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "<this>");
        return new BooleanArrayBuilder(arr_z);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void writeContent(CompositeEncoder compositeEncoder0, Object object0, int v) {
        this.writeContent(compositeEncoder0, ((boolean[])object0), v);
    }

    public void writeContent(@NotNull CompositeEncoder compositeEncoder0, @NotNull boolean[] arr_z, int v) {
        Intrinsics.checkNotNullParameter(compositeEncoder0, "encoder");
        Intrinsics.checkNotNullParameter(arr_z, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            compositeEncoder0.encodeBooleanElement(this.getDescriptor(), v1, arr_z[v1]);
        }
    }
}

