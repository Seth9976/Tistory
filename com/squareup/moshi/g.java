package com.squareup.moshi;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Set;

public final class g implements Factory {
    @Override  // com.squareup.moshi.JsonAdapter$Factory
    public final JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        Type type1;
        if(type0 instanceof GenericArrayType) {
            type1 = ((GenericArrayType)type0).getGenericComponentType();
        }
        else if(type0 instanceof Class) {
            type1 = ((Class)type0).getComponentType();
        }
        else {
            type1 = null;
        }
        if(type1 == null) {
            return null;
        }
        return set0.isEmpty() ? new h(Types.getRawType(type1), moshi0.adapter(type1)).nullSafe() : null;
    }
}

