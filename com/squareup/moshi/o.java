package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class o implements Factory {
    @Override  // com.squareup.moshi.JsonAdapter$Factory
    public final JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        Class class0 = Types.getRawType(type0);
        if(!set0.isEmpty()) {
            return null;
        }
        Class class1 = Collection.class;
        if(class0 != List.class && class0 != class1) {
            return class0 == Set.class ? new p(moshi0.adapter(Types.collectionElementType(type0, class1)), 1).nullSafe() : null;
        }
        return new p(moshi0.adapter(Types.collectionElementType(type0, class1)), 0).nullSafe();
    }
}

