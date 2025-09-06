package ff;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

public final class d extends Lambda implements Function1 {
    public final int w;
    public final AbstractTypeConstructor x;

    public d(AbstractTypeConstructor abstractTypeConstructor0, int v) {
        this.w = v;
        this.x = abstractTypeConstructor0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((TypeConstructor)object0), "it");
                return AbstractTypeConstructor.access$computeNeighbours(this.x, ((TypeConstructor)object0), true);
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((KotlinType)object0), "it");
                this.x.reportScopesLoopError(((KotlinType)object0));
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((TypeConstructor)object0), "it");
                return AbstractTypeConstructor.access$computeNeighbours(this.x, ((TypeConstructor)object0), false);
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((KotlinType)object0), "it");
                this.x.reportSupertypeLoopError(((KotlinType)object0));
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((b)object0), "supertypes");
                AbstractTypeConstructor abstractTypeConstructor0 = this.x;
                SupertypeLoopChecker supertypeLoopChecker0 = abstractTypeConstructor0.getSupertypeLoopChecker();
                d d0 = new d(abstractTypeConstructor0, 2);
                d d1 = new d(abstractTypeConstructor0, 3);
                Collection collection0 = supertypeLoopChecker0.findLoopsInSupertypesAndDisconnect(abstractTypeConstructor0, ((b)object0).a, d0, d1);
                List list0 = null;
                if(collection0.isEmpty()) {
                    KotlinType kotlinType0 = abstractTypeConstructor0.defaultSupertypeIfEmpty();
                    List list1 = kotlinType0 == null ? null : k.listOf(kotlinType0);
                    if(list1 == null) {
                        list1 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    collection0 = list1;
                }
                if(collection0 instanceof List) {
                    list0 = (List)collection0;
                }
                if(list0 == null) {
                    list0 = CollectionsKt___CollectionsKt.toList(collection0);
                }
                List list2 = abstractTypeConstructor0.processSupertypesWithoutCycles(list0);
                Intrinsics.checkNotNullParameter(list2, "<set-?>");
                ((b)object0).b = list2;
                return Unit.INSTANCE;
            }
        }
    }
}

