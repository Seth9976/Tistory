package com.google.android.material.color;

import android.os.Build;
import java.lang.reflect.Method;

public final class l implements DeviceSupportCondition {
    public Long a;

    @Override  // com.google.android.material.color.DynamicColors$DeviceSupportCondition
    public final boolean isSupported() {
        if(this.a == null) {
            try {
                Method method0 = Build.class.getDeclaredMethod("getLong", String.class);
                method0.setAccessible(true);
                Long long0 = (Long)method0.invoke(null, "ro.build.version.oneui");
                long0.longValue();
                this.a = long0;
                return ((long)this.a) >= 40100L;
            }
            catch(Exception unused_ex) {
                this.a = -1L;
            }
        }
        return ((long)this.a) >= 40100L;
    }
}

