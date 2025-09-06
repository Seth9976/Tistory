package kotlinx.serialization.internal;

import fg.c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder.DefaultImpls;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0018\u0010\r\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J)\u0010\u0013\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\u001A\u001A\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lkotlinx/serialization/internal/TripleSerializer;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lkotlin/Triple;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/Triple;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlin/Triple;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class TripleSerializer implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;
    public final KSerializer c;
    public final SerialDescriptor d;

    public TripleSerializer(@NotNull KSerializer kSerializer0, @NotNull KSerializer kSerializer1, @NotNull KSerializer kSerializer2) {
        Intrinsics.checkNotNullParameter(kSerializer0, "aSerializer");
        Intrinsics.checkNotNullParameter(kSerializer1, "bSerializer");
        Intrinsics.checkNotNullParameter(kSerializer2, "cSerializer");
        super();
        this.a = kSerializer0;
        this.b = kSerializer1;
        this.c = kSerializer2;
        c c0 = new c(this, 6);
        this.d = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Triple", new SerialDescriptor[0], c0);
    }

    public static final KSerializer access$getASerializer$p(TripleSerializer tripleSerializer0) {
        return tripleSerializer0.a;
    }

    public static final KSerializer access$getBSerializer$p(TripleSerializer tripleSerializer0) {
        return tripleSerializer0.b;
    }

    public static final KSerializer access$getCSerializer$p(TripleSerializer tripleSerializer0) {
        return tripleSerializer0.c;
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder0) {
        return this.deserialize(decoder0);
    }

    @NotNull
    public Triple deserialize(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        CompositeDecoder compositeDecoder0 = decoder0.beginStructure(this.getDescriptor());
        if(compositeDecoder0.decodeSequentially()) {
            Object object0 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 0, this.a, null, 8, null);
            Object object1 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 1, this.b, null, 8, null);
            Object object2 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 2, this.c, null, 8, null);
            compositeDecoder0.endStructure(this.getDescriptor());
            return new Triple(object0, object1, object2);
        }
        Object object3 = TuplesKt.a;
        Object object4 = TuplesKt.a;
        Object object5 = TuplesKt.a;
        while(true) {
            int v = compositeDecoder0.decodeElementIndex(this.getDescriptor());
            switch(v) {
                case -1: {
                    compositeDecoder0.endStructure(this.getDescriptor());
                    if(object3 == TuplesKt.a) {
                        throw new SerializationException("Element \'first\' is missing");
                    }
                    if(object4 == TuplesKt.a) {
                        throw new SerializationException("Element \'second\' is missing");
                    }
                    if(object5 == TuplesKt.a) {
                        throw new SerializationException("Element \'third\' is missing");
                    }
                    return new Triple(object3, object4, object5);
                }
                case 0: {
                    object3 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 0, this.a, null, 8, null);
                    continue;
                }
                case 1: {
                    object4 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 1, this.b, null, 8, null);
                    continue;
                }
                case 2: {
                    break;
                }
                default: {
                    throw new SerializationException("Unexpected index " + v);
                }
            }
            object5 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 2, this.c, null, 8, null);
        }
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder0, Object object0) {
        this.serialize(encoder0, ((Triple)object0));
    }

    public void serialize(@NotNull Encoder encoder0, @NotNull Triple triple0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(triple0, "value");
        CompositeEncoder compositeEncoder0 = encoder0.beginStructure(this.getDescriptor());
        compositeEncoder0.encodeSerializableElement(this.getDescriptor(), 0, this.a, triple0.getFirst());
        compositeEncoder0.encodeSerializableElement(this.getDescriptor(), 1, this.b, triple0.getSecond());
        compositeEncoder0.encodeSerializableElement(this.getDescriptor(), 2, this.c, triple0.getThird());
        compositeEncoder0.endStructure(this.getDescriptor());
    }
}

