package kotlinx.serialization.internal;

import aa.m;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001D\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\'\b\u0010\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u001F\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001B\u0010\u000B\u001A\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Lkotlinx/serialization/internal/EnumSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "toString", "()Ljava/lang/String;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,151:1\n13309#2,2:152\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n*L\n123#1:152,2\n*E\n"})
public final class EnumSerializer implements KSerializer {
    public final Enum[] a;
    public final SerialDescriptor b;
    public final Lazy c;

    public EnumSerializer(@NotNull String s, @NotNull Enum[] arr_enum) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(arr_enum, "values");
        super();
        this.a = arr_enum;
        this.c = c.lazy(new m(26, this, s));
    }

    public EnumSerializer(@NotNull String s, @NotNull Enum[] arr_enum, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(s, "serialName");
        Intrinsics.checkNotNullParameter(arr_enum, "values");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this(s, arr_enum);
        this.b = serialDescriptor0;
    }

    public static final SerialDescriptor access$createUnmarkedDescriptor(EnumSerializer enumSerializer0, String s) {
        Enum[] arr_enum = enumSerializer0.a;
        SerialDescriptor serialDescriptor0 = new EnumDescriptor(s, arr_enum.length);
        for(int v = 0; v < arr_enum.length; ++v) {
            PluginGeneratedSerialDescriptor.addElement$default(((PluginGeneratedSerialDescriptor)serialDescriptor0), arr_enum[v].name(), false, 2, null);
        }
        return serialDescriptor0;
    }

    public static final SerialDescriptor access$getOverriddenDescriptor$p(EnumSerializer enumSerializer0) {
        return enumSerializer0.b;
    }

    @NotNull
    public Enum deserialize(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        int v = decoder0.decodeEnum(this.getDescriptor());
        Enum[] arr_enum = this.a;
        if(v < 0 || v >= arr_enum.length) {
            throw new SerializationException(v + " is not among valid " + this.getDescriptor().getSerialName() + " enum values, values size is " + arr_enum.length);
        }
        return arr_enum[v];
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder0) {
        return this.deserialize(decoder0);
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }

    public void serialize(@NotNull Encoder encoder0, @NotNull Enum enum0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(enum0, "value");
        Enum[] arr_enum = this.a;
        int v = ArraysKt___ArraysKt.indexOf(arr_enum, enum0);
        if(v != -1) {
            encoder0.encodeEnum(this.getDescriptor(), v);
            return;
        }
        String s = Arrays.toString(arr_enum);
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        throw new SerializationException(enum0 + " is not a valid enum " + this.getDescriptor().getSerialName() + ", must be one of " + s);
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder0, Object object0) {
        this.serialize(encoder0, ((Enum)object0));
    }

    @Override
    @NotNull
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + this.getDescriptor().getSerialName() + '>';
    }
}

