package kotlinx.serialization.json.internal;

import jg.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1", "Lkotlinx/serialization/encoding/AbstractEncoder;", "", "value", "", "encodeString", "(Ljava/lang/String;)V", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AbstractJsonTreeEncoder.inlineUnquotedLiteralEncoder.1 extends AbstractEncoder {
    public final b a;
    public final String b;
    public final SerialDescriptor c;

    public AbstractJsonTreeEncoder.inlineUnquotedLiteralEncoder.1(b b0, String s, SerialDescriptor serialDescriptor0) {
        this.a = b0;
        this.b = s;
        this.c = serialDescriptor0;
        super();
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeString(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        JsonLiteral jsonLiteral0 = new JsonLiteral(s, false, this.c);
        this.a.b(this.b, jsonLiteral0);
    }

    @Override  // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.a.b.getSerializersModule();
    }
}

