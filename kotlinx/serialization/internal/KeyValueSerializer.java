package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder.DefaultImpls;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004J\u001F\u0010\u0007\u001A\u00028\u00022\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0006\u001A\u00028\u0001H$¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0006\u001A\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00028\u00022\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001A\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0005\u001A\u00028\u0000*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u0018\u0010\u0006\u001A\u00028\u0001*\u00028\u00028$X¤\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001B\u0082\u0001\u0002\u001D\u001E¨\u0006\u001F"}, d2 = {"Lkotlinx/serialization/internal/KeyValueSerializer;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Lkotlinx/serialization/KSerializer;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "keySerializer", "b", "getValueSerializer", "valueSerializer", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "Lkotlinx/serialization/internal/MapEntrySerializer;", "Lkotlinx/serialization/internal/PairSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nTuples.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,168:1\n570#2,4:169\n*S KotlinDebug\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n*L\n35#1:169,4\n*E\n"})
public abstract class KeyValueSerializer implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;

    public KeyValueSerializer(KSerializer kSerializer0, KSerializer kSerializer1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = kSerializer0;
        this.b = kSerializer1;
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(@NotNull Decoder decoder0) {
        Object object0;
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        SerialDescriptor serialDescriptor0 = this.getDescriptor();
        CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
        if(compositeDecoder0.decodeSequentially()) {
            object0 = this.toResult(DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 0, this.getKeySerializer(), null, 8, null), DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 1, this.getValueSerializer(), null, 8, null));
            compositeDecoder0.endStructure(serialDescriptor0);
            return object0;
        }
        Object object1 = TuplesKt.access$getNULL$p();
        Object object2 = TuplesKt.access$getNULL$p();
        while(true) {
            int v = compositeDecoder0.decodeElementIndex(this.getDescriptor());
            switch(v) {
                case -1: {
                    if(object1 == TuplesKt.access$getNULL$p()) {
                        throw new SerializationException("Element \'key\' is missing");
                    }
                    if(object2 == TuplesKt.access$getNULL$p()) {
                        throw new SerializationException("Element \'value\' is missing");
                    }
                    object0 = this.toResult(object1, object2);
                    compositeDecoder0.endStructure(serialDescriptor0);
                    return object0;
                }
                case 0: {
                    object1 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 0, this.getKeySerializer(), null, 8, null);
                    break;
                }
                default: {
                    if(v != 1) {
                        throw new SerializationException("Invalid index: " + v);
                    }
                    object2 = DefaultImpls.decodeSerializableElement$default(compositeDecoder0, this.getDescriptor(), 1, this.getValueSerializer(), null, 8, null);
                    break;
                }
            }
        }
    }

    public abstract Object getKey(Object arg1);

    @NotNull
    public final KSerializer getKeySerializer() {
        return this.a;
    }

    public abstract Object getValue(Object arg1);

    @NotNull
    public final KSerializer getValueSerializer() {
        return this.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder0, Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        CompositeEncoder compositeEncoder0 = encoder0.beginStructure(this.getDescriptor());
        SerialDescriptor serialDescriptor0 = this.getDescriptor();
        Object object1 = this.getKey(object0);
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 0, this.a, object1);
        SerialDescriptor serialDescriptor1 = this.getDescriptor();
        Object object2 = this.getValue(object0);
        compositeEncoder0.encodeSerializableElement(serialDescriptor1, 1, this.b, object2);
        compositeEncoder0.endStructure(this.getDescriptor());
    }

    public abstract Object toResult(Object arg1, Object arg2);
}

