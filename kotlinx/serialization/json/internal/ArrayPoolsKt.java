package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ArrayPoolsKt {
    public static final int a;

    static {
        Object object0;
        try {
            String s = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(s, "getProperty(...)");
            object0 = Result.constructor-impl(o.toIntOrNull(s));
        }
        catch(Throwable throwable0) {
            object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        if(Result.isFailure-impl(object0)) {
            object0 = null;
        }
        ArrayPoolsKt.a = ((Integer)object0) == null ? 0x200000 : ((int)(((Integer)object0)));
    }

    public static final int access$getMAX_CHARS_IN_POOL$p() [...] // 潜在的解密器
}

