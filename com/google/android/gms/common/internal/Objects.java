package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

@KeepForSdk
public final class Objects {
    @KeepForSdk
    public static final class ToStringHelper {
        public final ArrayList a;
        public final Object b;

        public ToStringHelper(Object object0) {
            Preconditions.checkNotNull(object0);
            this.b = object0;
            this.a = new ArrayList();
        }

        @NonNull
        @KeepForSdk
        @CanIgnoreReturnValue
        public ToStringHelper add(@NonNull String s, @Nullable Object object0) {
            Preconditions.checkNotNull(s);
            this.a.add(s + "=" + object0);
            return this;
        }

        @Override
        @NonNull
        @KeepForSdk
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder(100);
            stringBuilder0.append(this.b.getClass().getSimpleName());
            stringBuilder0.append('{');
            ArrayList arrayList0 = this.a;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append(((String)arrayList0.get(v1)));
                if(v1 < v - 1) {
                    stringBuilder0.append(", ");
                }
            }
            stringBuilder0.append('}');
            return stringBuilder0.toString();
        }
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@NonNull Bundle bundle0, @NonNull Bundle bundle1) {
        if(bundle0 != null && bundle1 != null) {
            if(bundle0.size() != bundle1.size()) {
                return false;
            }
            Set set0 = bundle0.keySet();
            if(!set0.containsAll(bundle1.keySet())) {
                return false;
            }
            for(Object object0: set0) {
                if(!Objects.equal(bundle0.get(((String)object0)), bundle1.get(((String)object0)))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return bundle0 == bundle1;
    }

    // 去混淆评级： 低(20)
    @KeepForSdk
    public static boolean equal(@Nullable Object object0, @Nullable Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    @KeepForSdk
    public static int hashCode(@NonNull Object[] arr_object) {
        return Arrays.hashCode(arr_object);
    }

    @NonNull
    @KeepForSdk
    public static ToStringHelper toStringHelper(@NonNull Object object0) {
        return new ToStringHelper(object0);
    }
}

