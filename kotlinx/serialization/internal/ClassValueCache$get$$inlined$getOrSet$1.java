package kotlinx.serialization.internal;

import hg.a;
import hg.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "kotlinx/serialization/internal/ClassValueReferences$getOrSet$2"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n1#1,206:1\n52#2:207\n*E\n"})
public final class ClassValueCache.get..inlined.getOrSet.1 extends Lambda implements Function0 {
    public final b w;
    public final KClass x;

    public ClassValueCache.get..inlined.getOrSet.1(b b0, KClass kClass0) {
        this.w = b0;
        this.x = kClass0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new a(((KSerializer)this.w.a.invoke(this.x)));
    }
}

