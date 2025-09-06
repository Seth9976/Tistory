package fe;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class c extends Lambda implements Function0 {
    public final int w;
    public final KCallableImpl x;

    public c(KCallableImpl kCallableImpl0, int v) {
        this.w = v;
        this.x = kCallableImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                KCallableImpl kCallableImpl1 = this.x;
                int v = kCallableImpl1.getParameters().size();
                int v1 = kCallableImpl1.isSuspend() + v;
                int v2 = (kCallableImpl1.getParameters().size() + 0x1F) / 0x20;
                Object[] arr_object = new Object[v1 + v2 + 1];
                for(Object object1: kCallableImpl1.getParameters()) {
                    KParameter kParameter0 = (KParameter)object1;
                    if(kParameter0.isOptional() && !UtilKt.isInlineClassType(kParameter0.getType())) {
                        int v3 = kParameter0.getIndex();
                        arr_object[v3] = UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(kParameter0.getType()));
                    }
                    else if(kParameter0.isVararg()) {
                        int v4 = kParameter0.getIndex();
                        arr_object[v4] = KCallableImpl.access$defaultEmptyArray(kCallableImpl1, kParameter0.getType());
                    }
                }
                for(int v5 = 0; v5 < v2; ++v5) {
                    arr_object[v1 + v5] = 0;
                }
                return arr_object;
            }
            case 1: {
                return UtilKt.computeAnnotations(this.x.getDescriptor());
            }
            case 2: {
                Type type0 = KCallableImpl.access$extractContinuationArgument(this.x);
                return type0 == null ? this.x.getCaller().getReturnType() : type0;
            }
            case 3: {
                KotlinType kotlinType0 = this.x.getDescriptor().getReturnType();
                Intrinsics.checkNotNull(kotlinType0);
                return new KTypeImpl(kotlinType0, new c(this.x, 2));
            }
            default: {
                KCallableImpl kCallableImpl0 = this.x;
                List list0 = kCallableImpl0.getDescriptor().getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(list0, "descriptor.typeParameters");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object0: list0) {
                    Intrinsics.checkNotNullExpressionValue(((TypeParameterDescriptor)object0), "descriptor");
                    arrayList0.add(new KTypeParameterImpl(kCallableImpl0, ((TypeParameterDescriptor)object0)));
                }
                return arrayList0;
            }
        }
    }
}

