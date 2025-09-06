package ig;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonNullSerializer;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

public final class b extends Lambda implements Function0 {
    public static final b A;
    public static final b B;
    public final int w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b.x = new b(0, 0);
        b.y = new b(0, 1);
        b.z = new b(0, 2);
        b.A = new b(0, 3);
        b.B = new b(0, 4);
    }

    public b(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return JsonPrimitiveSerializer.INSTANCE.getDescriptor();
            }
            case 1: {
                return JsonNullSerializer.INSTANCE.getDescriptor();
            }
            case 2: {
                return e.b;
            }
            case 3: {
                return JsonObjectSerializer.INSTANCE.getDescriptor();
            }
            default: {
                return JsonArraySerializer.INSTANCE.getDescriptor();
            }
        }
    }
}

