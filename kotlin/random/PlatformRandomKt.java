package kotlin.random;

import be.a;
import be.b;
import java.util.Random;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0013\u0010\u0004\u001A\u00020\u0000*\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lkotlin/random/Random;", "Ljava/util/Random;", "asJavaRandom", "(Lkotlin/random/Random;)Ljava/util/Random;", "asKotlinRandom", "(Ljava/util/Random;)Lkotlin/random/Random;", "", "hi26", "low27", "", "doubleFromParts", "(II)D", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PlatformRandomKt {
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Random asJavaRandom(@NotNull kotlin.random.Random random0) {
        Intrinsics.checkNotNullParameter(random0, "<this>");
        AbstractPlatformRandom abstractPlatformRandom0 = random0 instanceof AbstractPlatformRandom ? ((AbstractPlatformRandom)random0) : null;
        if(abstractPlatformRandom0 != null) {
            Random random1 = abstractPlatformRandom0.getImpl();
            if(random1 != null) {
                return random1;
            }
        }
        return new a(random0);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final kotlin.random.Random asKotlinRandom(@NotNull Random random0) {
        Intrinsics.checkNotNullParameter(random0, "<this>");
        a a0 = random0 instanceof a ? ((a)random0) : null;
        if(a0 != null) {
            kotlin.random.Random random1 = a0.a;
            if(random1 != null) {
                return random1;
            }
        }
        return new b(random0);
    }

    public static final double doubleFromParts(int v, int v1) {
        return ((double)((((long)v) << 27) + ((long)v1))) / 9007199254740992.0;
    }
}

