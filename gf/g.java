package gf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;

public final class g extends FunctionReference implements Function2 {
    public final int a;

    public g(int v, Object object0, int v1) {
        this.a = v1;
        super(v, object0);
    }

    @Override  // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return this.a == 0 ? "isStrictSupertype" : "equalTypes";
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return this.a == 0 ? Reflection.getOrCreateKotlinClass(TypeIntersector.class) : Reflection.getOrCreateKotlinClass(NewKotlinTypeCheckerImpl.class);
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return this.a == 0 ? "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z" : "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(((KotlinType)object0), "p0");
            Intrinsics.checkNotNullParameter(((KotlinType)object1), "p1");
            return Boolean.valueOf(((NewKotlinTypeCheckerImpl)this.receiver).equalTypes(((KotlinType)object0), ((KotlinType)object1)));
        }
        Intrinsics.checkNotNullParameter(((KotlinType)object0), "p0");
        Intrinsics.checkNotNullParameter(((KotlinType)object1), "p1");
        return Boolean.valueOf(TypeIntersector.access$isStrictSupertype(((TypeIntersector)this.receiver), ((KotlinType)object0), ((KotlinType)object1)));
    }
}

