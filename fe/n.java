package fe;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.text.Regex;

public final class n extends Lambda implements Function0 {
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public n(KTypeImpl kTypeImpl0, int v, Lazy lazy0) {
        this.w = 0;
        this.y = kTypeImpl0;
        this.x = v;
        this.z = lazy0;
        super(0);
    }

    public n(Regex regex0, CharSequence charSequence0, int v) {
        this.w = 1;
        this.y = regex0;
        this.z = charSequence0;
        this.x = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Type type1;
        if(this.w != 0) {
            return ((Regex)this.y).find(((CharSequence)this.z), this.x);
        }
        KTypeImpl kTypeImpl0 = (KTypeImpl)this.y;
        Type type0 = kTypeImpl0.getJavaType();
        if(type0 instanceof Class) {
            type1 = ((Class)type0).isArray() ? ((Class)type0).getComponentType() : Object.class;
            Intrinsics.checkNotNullExpressionValue(type1, "{\n                      …                        }");
            return type1;
        }
        int v = this.x;
        if(type0 instanceof GenericArrayType) {
            if(v != 0) {
                throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl0);
            }
            type1 = ((GenericArrayType)type0).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(type1, "{\n                      …                        }");
            return type1;
        }
        if(!(type0 instanceof ParameterizedType)) {
            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl0);
        }
        type1 = (Type)((List)((Lazy)this.z).getValue()).get(v);
        if(type1 instanceof WildcardType) {
            Type[] arr_type = ((WildcardType)type1).getLowerBounds();
            Intrinsics.checkNotNullExpressionValue(arr_type, "argument.lowerBounds");
            Type type2 = (Type)ArraysKt___ArraysKt.firstOrNull(arr_type);
            if(type2 == null) {
                Type[] arr_type1 = ((WildcardType)type1).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(arr_type1, "argument.upperBounds");
                type1 = (Type)ArraysKt___ArraysKt.first(arr_type1);
            }
            else {
                type1 = type2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(type1, "{\n                      …                        }");
        return type1;
    }
}

