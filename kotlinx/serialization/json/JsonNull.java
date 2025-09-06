package kotlinx.serialization.json;

import ig.f;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001A\u0010\n\u001A\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u0014\u0010\f\u001A\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "a", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "content", "", "isString", "()Z", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable(with = JsonNullSerializer.class)
public final class JsonNull extends JsonPrimitive {
    @NotNull
    public static final JsonNull INSTANCE;
    public static final String a;
    public static final Lazy b;

    static {
        JsonNull.INSTANCE = new JsonNull(null);  // 初始化器: Lkotlinx/serialization/json/JsonPrimitive;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        JsonNull.a = "null";
        JsonNull.b = c.lazy(LazyThreadSafetyMode.PUBLICATION, f.w);
    }

    @Override  // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String getContent() {
        return JsonNull.a;
    }

    @Override  // kotlinx.serialization.json.JsonPrimitive
    public boolean isString() {
        return false;
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer)JsonNull.b.getValue();
    }
}

