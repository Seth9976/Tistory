package fe;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.KTypeImpl.arguments.2.WhenMappings;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import md.c;

public final class p extends Lambda implements Function0 {
    public final KTypeImpl w;
    public final Function0 x;

    public p(KTypeImpl kTypeImpl0, Function0 function00) {
        this.w = kTypeImpl0;
        this.x = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KTypeProjection kTypeProjection0;
        KTypeImpl kTypeImpl0 = this.w;
        List list0 = kTypeImpl0.getType().getArguments();
        if(list0.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        o o0 = new o(kTypeImpl0, 0);
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.PUBLICATION, o0);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        int v = 0;
        for(Object object0: list0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if(((TypeProjection)object0).isStarProjection()) {
                kTypeProjection0 = KTypeProjection.Companion.getSTAR();
            }
            else {
                KotlinType kotlinType0 = ((TypeProjection)object0).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "typeProjection.type");
                KTypeImpl kTypeImpl1 = new KTypeImpl(kotlinType0, (this.x == null ? null : new n(kTypeImpl0, v, lazy0)));
                switch(KTypeImpl.arguments.2.WhenMappings.$EnumSwitchMapping$0[((TypeProjection)object0).getProjectionKind().ordinal()]) {
                    case 1: {
                        kTypeProjection0 = KTypeProjection.Companion.invariant(kTypeImpl1);
                        break;
                    }
                    case 2: {
                        kTypeProjection0 = KTypeProjection.Companion.contravariant(kTypeImpl1);
                        break;
                    }
                    case 3: {
                        kTypeProjection0 = KTypeProjection.Companion.covariant(kTypeImpl1);
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            arrayList0.add(kTypeProjection0);
            ++v;
        }
        return arrayList0;
    }
}

