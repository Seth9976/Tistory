package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public final class h0 implements Factory {
    @Override  // com.squareup.moshi.JsonAdapter$Factory
    public final JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        if(!set0.isEmpty()) {
            return null;
        }
        Class class0 = Types.getRawType(type0);
        Class class1 = Map.class;
        if(class0 != class1) {
            return null;
        }
        if(type0 == Properties.class) {
            return new i0(moshi0, String.class, String.class).nullSafe();
        }
        if(!class1.isAssignableFrom(class0)) {
            throw new IllegalArgumentException();
        }
        Type type1 = Util.resolve(type0, class0, Util.getGenericSupertype(type0, class0, class1));
        if(type1 instanceof ParameterizedType) {
            Type[] arr_type = ((ParameterizedType)type1).getActualTypeArguments();
            return new i0(moshi0, arr_type[0], arr_type[1]).nullSafe();
        }
        return new i0(moshi0, Object.class, Object.class).nullSafe();
    }
}

