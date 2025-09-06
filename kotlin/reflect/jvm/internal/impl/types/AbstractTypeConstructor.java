package kotlin.reflect.jvm.internal.impl.types;

import d0.s;
import ff.a;
import ff.b;
import ff.c;
import ff.d;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {
    public final NotNullLazyValue b;

    public AbstractTypeConstructor(@NotNull StorageManager storageManager0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        super();
        s s0 = new s(this, 12);
        d d0 = new d(this, 4);
        this.b = storageManager0.createLazyValueWithPostCompute(s0, c.w, d0);
    }

    public static final Collection access$computeNeighbours(AbstractTypeConstructor abstractTypeConstructor0, TypeConstructor typeConstructor0, boolean z) {
        abstractTypeConstructor0.getClass();
        AbstractTypeConstructor abstractTypeConstructor1 = typeConstructor0 instanceof AbstractTypeConstructor ? ((AbstractTypeConstructor)typeConstructor0) : null;
        if(abstractTypeConstructor1 != null) {
            List list0 = CollectionsKt___CollectionsKt.plus(((b)abstractTypeConstructor1.b.invoke()).a, abstractTypeConstructor1.getAdditionalNeighboursInSupertypeGraph(z));
            if(list0 != null) {
                return list0;
            }
        }
        Collection collection0 = typeConstructor0.getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collection0, "supertypes");
        return collection0;
    }

    @NotNull
    public abstract Collection computeSupertypes();

    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @NotNull
    public Collection getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public boolean getShouldReportCyclicScopeWithCompanionWarning() [...] // Inlined contents

    @NotNull
    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection getSupertypes() {
        return this.getSupertypes();
    }

    @NotNull
    public List getSupertypes() {
        return ((b)this.b.invoke()).b;
    }

    @NotNull
    public List processSupertypesWithoutCycles(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "supertypes");
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner0);
    }

    public void reportScopesLoopError(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
    }

    public void reportSupertypeLoopError(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
    }
}

