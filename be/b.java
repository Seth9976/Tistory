package be;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;

public final class b extends AbstractPlatformRandom implements Serializable {
    public final Random b;

    public b(Random random0) {
        Intrinsics.checkNotNullParameter(random0, "impl");
        super();
        this.b = random0;
    }

    @Override  // kotlin.random.AbstractPlatformRandom
    public final Random getImpl() {
        return this.b;
    }
}

