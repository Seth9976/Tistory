package ig;

import java.util.Map.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializersKt;
import kotlinx.serialization.json.internal.StringOpsKt;

public final class c extends Lambda implements Function1 {
    public final int w;
    public static final c x;
    public static final c y;

    static {
        c.x = new c(1, 0);
        c.y = new c(1, 1);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Map.Entry)object0), "<name for destructuring parameter 0>");
            String s = (String)((Map.Entry)object0).getKey();
            JsonElement jsonElement0 = (JsonElement)((Map.Entry)object0).getValue();
            StringBuilder stringBuilder0 = new StringBuilder();
            StringOpsKt.printQuoted(stringBuilder0, s);
            stringBuilder0.append(':');
            stringBuilder0.append(jsonElement0);
            String s1 = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
            return s1;
        }
        Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "JsonPrimitive", JsonElementSerializersKt.access$defer(b.x), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "JsonNull", JsonElementSerializersKt.access$defer(b.y), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "JsonLiteral", JsonElementSerializersKt.access$defer(b.z), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "JsonObject", JsonElementSerializersKt.access$defer(b.A), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "JsonArray", JsonElementSerializersKt.access$defer(b.B), null, false, 12, null);
        return Unit.INSTANCE;
    }
}

