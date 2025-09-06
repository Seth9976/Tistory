package com.google.gson.internal.bind;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

public final class i implements PrivilegedAction {
    public final Class a;

    public i(Class class0) {
        this.a = class0;
    }

    @Override
    public final Object run() {
        Field[] arr_field = this.a.getDeclaredFields();
        ArrayList arrayList0 = new ArrayList(arr_field.length);
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            if(field0.isEnumConstant()) {
                arrayList0.add(field0);
            }
        }
        Field[] arr_field1 = (Field[])arrayList0.toArray(new Field[0]);
        AccessibleObject.setAccessible(arr_field1, true);
        return arr_field1;
    }
}

