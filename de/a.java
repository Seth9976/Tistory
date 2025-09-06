package de;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.full.Java8RepeatableContainerLoader.Cache;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

public final class a implements Neighbors {
    public static final a a;
    public static Java8RepeatableContainerLoader.Cache b;
    public static final a c;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a.c = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors
    public Iterable getNeighbors(Object object0) {
        KClassifier kClassifier0 = ((KType)object0).getClassifier();
        KClass kClass0 = kClassifier0 instanceof KClass ? ((KClass)kClassifier0) : null;
        if(kClass0 == null) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + ((KType)object0));
        }
        List list0 = kClass0.getSupertypes();
        if(((KType)object0).getArguments().isEmpty()) {
            return list0;
        }
        Intrinsics.checkNotNull(((KType)object0), "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        TypeSubstitutor typeSubstitutor0 = TypeSubstitutor.create(((KTypeImpl)(((KType)object0))).getType());
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object1: list0) {
            KType kType0 = (KType)object1;
            Intrinsics.checkNotNull(kType0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            KotlinType kotlinType0 = typeSubstitutor0.substitute(((KTypeImpl)kType0).getType(), Variance.INVARIANT);
            if(kotlinType0 == null) {
                throw new KotlinReflectionInternalError("Type substitution failed: " + kType0 + " (" + ((KType)object0) + ')');
            }
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "substitutor.substitute((…: $supertype ($current)\")");
            arrayList0.add(new KTypeImpl(kotlinType0, null, 2, null));
        }
        return arrayList0;
    }
}

