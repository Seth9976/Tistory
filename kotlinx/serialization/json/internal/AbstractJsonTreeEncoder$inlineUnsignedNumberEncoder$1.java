package kotlinx.serialization.json.internal;

import jg.b;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000F\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0019\u001A\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1", "Lkotlinx/serialization/encoding/AbstractEncoder;", "", "s", "", "putUnquotedString", "(Ljava/lang/String;)V", "", "value", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "Lkotlinx/serialization/modules/SerializersModule;", "a", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AbstractJsonTreeEncoder.inlineUnsignedNumberEncoder.1 extends AbstractEncoder {
    public final SerializersModule a;
    public final b b;
    public final String c;

    public AbstractJsonTreeEncoder.inlineUnsignedNumberEncoder.1(b b0, String s) {
        this.b = b0;
        this.c = s;
        super();
        this.a = b0.b.getSerializersModule();
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeByte(byte b) {
        this.putUnquotedString(UByte.toString-impl(b));
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeInt(int v) {
        this.putUnquotedString(Integer.toUnsignedString(v));
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeLong(long v) {
        this.putUnquotedString(Long.toUnsignedString(v));
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeShort(short v) {
        this.putUnquotedString(UShort.toString-impl(v));
    }

    @Override  // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.a;
    }

    public final void putUnquotedString(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        JsonLiteral jsonLiteral0 = new JsonLiteral(s, false, null, 4, null);
        this.b.b(this.c, jsonLiteral0);
    }
}

