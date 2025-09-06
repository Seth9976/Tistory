package hg;

import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

public final class e implements KType {
    public final KType a;

    public e(KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "origin");
        super();
        this.a = kType0;
    }

    @Override
    public final boolean equals(Object object0) {
        KClassifier kClassifier0 = null;
        if(object0 == null) {
            return false;
        }
        e e0 = object0 instanceof e ? ((e)object0) : null;
        KType kType0 = this.a;
        if(!Intrinsics.areEqual(kType0, (e0 == null ? null : e0.a))) {
            return false;
        }
        KClassifier kClassifier1 = kType0.getClassifier();
        if(kClassifier1 instanceof KClass) {
            KType kType1 = object0 instanceof KType ? ((KType)object0) : null;
            if(kType1 != null) {
                kClassifier0 = kType1.getClassifier();
            }
            return kClassifier0 == null || !(kClassifier0 instanceof KClass) ? false : Intrinsics.areEqual(JvmClassMappingKt.getJavaClass(((KClass)kClassifier1)), JvmClassMappingKt.getJavaClass(((KClass)kClassifier0)));
        }
        return false;
    }

    @Override  // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override  // kotlin.reflect.KType
    public final List getArguments() {
        return this.a.getArguments();
    }

    @Override  // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.a.getClassifier();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.a.isMarkedNullable();
    }

    @Override
    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}

