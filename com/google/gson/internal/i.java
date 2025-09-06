package com.google.gson.internal;

import com.google.gson.internal.reflect.ReflectionHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class i implements ObjectConstructor {
    public final Constructor a;

    public i(Constructor constructor0) {
        this.a = constructor0;
    }

    @Override  // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        Constructor constructor0;
        try {
            constructor0 = this.a;
            return constructor0.newInstance(null);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException("Failed to invoke constructor \'" + ReflectionHelper.constructorToString(constructor0) + "\' with no args", instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException("Failed to invoke constructor \'" + ReflectionHelper.constructorToString(constructor0) + "\' with no args", invocationTargetException0.getCause());
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(illegalAccessException0);
        }
    }
}

