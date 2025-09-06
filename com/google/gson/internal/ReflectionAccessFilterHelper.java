package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter.FilterResult;
import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.util.List;

public class ReflectionAccessFilterHelper {
    public static boolean canAccess(AccessibleObject accessibleObject0, Object object0) {
        return p.a.a(accessibleObject0, object0);
    }

    public static FilterResult getFilterResult(List list0, Class class0) {
        for(Object object0: list0) {
            FilterResult reflectionAccessFilter$FilterResult0 = ((ReflectionAccessFilter)object0).check(class0);
            if(reflectionAccessFilter$FilterResult0 != FilterResult.INDECISIVE) {
                return reflectionAccessFilter$FilterResult0;
            }
            if(false) {
                break;
            }
        }
        return FilterResult.ALLOW;
    }

    // 去混淆评级： 低(20)
    public static boolean isAndroidType(Class class0) {
        String s = class0.getName();
        return s.startsWith("android.") || s.startsWith("androidx.") || s.startsWith("java.") || s.startsWith("javax.");
    }

    // 去混淆评级： 低(35)
    public static boolean isAnyPlatformType(Class class0) {
        String s = class0.getName();
        return s.startsWith("android.") || s.startsWith("androidx.") || s.startsWith("java.") || s.startsWith("javax.") || s.startsWith("kotlin.") || s.startsWith("kotlinx.") || s.startsWith("scala.");
    }

    public static boolean isJavaType(Class class0) {
        String s = class0.getName();
        return s.startsWith("java.") || s.startsWith("javax.");
    }
}

