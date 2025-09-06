package androidx.core.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class VelocityTrackerCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface VelocityTrackableMotionEventAxis {
    }

    public static final Map a;

    static {
        VelocityTrackerCompat.a = Collections.synchronizedMap(new WeakHashMap());
    }

    public static void addMovement(@NonNull VelocityTracker velocityTracker0, @NonNull MotionEvent motionEvent0) {
        velocityTracker0.addMovement(motionEvent0);
        if(Build.VERSION.SDK_INT >= 34) {
            return;
        }
        if(motionEvent0.getSource() == 0x400000) {
            Map map0 = VelocityTrackerCompat.a;
            if(!map0.containsKey(velocityTracker0)) {
                map0.put(velocityTracker0, new a0());
            }
            a0 a00 = (a0)map0.get(velocityTracker0);
            a00.getClass();
            long v = motionEvent0.getEventTime();
            long[] arr_v = a00.b;
            if(a00.d != 0 && v - arr_v[a00.e] > 40L) {
                a00.d = 0;
                a00.c = 0.0f;
            }
            int v1 = (a00.e + 1) % 20;
            a00.e = v1;
            int v2 = a00.d;
            if(v2 != 20) {
                a00.d = v2 + 1;
            }
            a00.a[v1] = motionEvent0.getAxisValue(26);
            arr_v[a00.e] = v;
        }
    }

    public static void clear(@NonNull VelocityTracker velocityTracker0) {
        velocityTracker0.clear();
        VelocityTrackerCompat.a.remove(velocityTracker0);
    }

    public static void computeCurrentVelocity(@NonNull VelocityTracker velocityTracker0, int v) {
        VelocityTrackerCompat.computeCurrentVelocity(velocityTracker0, v, 3.402823E+38f);
    }

    public static void computeCurrentVelocity(@NonNull VelocityTracker velocityTracker0, int v, float f) {
        int v13;
        float f3;
        long v4;
        velocityTracker0.computeCurrentVelocity(v, f);
        a0 a00 = (a0)VelocityTrackerCompat.a.get(velocityTracker0);
        if(a00 != null) {
            int v1 = a00.d;
            float f1 = 0.0f;
            if(v1 >= 2) {
                int v2 = (a00.e + 20 - (v1 - 1)) % 20;
                long[] arr_v = a00.b;
                long v3 = arr_v[a00.e];
                while(true) {
                    v4 = arr_v[v2];
                    if(v3 - v4 <= 100L) {
                        break;
                    }
                    --a00.d;
                    v2 = (v2 + 1) % 20;
                }
                int v5 = a00.d;
                if(v5 >= 2) {
                    float[] arr_f = a00.a;
                    if(v5 == 2) {
                        int v6 = (v2 + 1) % 20;
                        long v7 = arr_v[v6];
                        if(v4 != v7) {
                            f1 = arr_f[v6] / ((float)(v7 - v4));
                        }
                    }
                    else {
                        float f2 = 0.0f;
                        int v9 = 0;
                        for(int v8 = 0; true; v8 = v13 + 1) {
                            f3 = 1.0f;
                            if(v8 >= a00.d - 1) {
                                break;
                            }
                            int v10 = v8 + v2;
                            long v11 = arr_v[v10 % 20];
                            int v12 = (v10 + 1) % 20;
                            if(arr_v[v12] == v11) {
                                v13 = v8;
                            }
                            else {
                                ++v9;
                                if(f2 < 0.0f) {
                                    f3 = -1.0f;
                                }
                                v13 = v8;
                                float f4 = arr_f[v12] / ((float)(arr_v[v12] - v11));
                                f2 += Math.abs(f4) * (f4 - f3 * ((float)Math.sqrt(Math.abs(f2) * 2.0f)));
                                if(v9 == 1) {
                                    f2 *= 0.5f;
                                }
                            }
                        }
                        if(f2 < 0.0f) {
                            f3 = -1.0f;
                        }
                        f1 = f3 * ((float)Math.sqrt(Math.abs(f2) * 2.0f));
                    }
                }
            }
            float f5 = f1 * ((float)v);
            a00.c = f5;
            if(f5 < -Math.abs(f)) {
                a00.c = -Math.abs(f);
                return;
            }
            if(a00.c > Math.abs(f)) {
                a00.c = Math.abs(f);
            }
        }
    }

    public static float getAxisVelocity(@NonNull VelocityTracker velocityTracker0, int v) {
        if(Build.VERSION.SDK_INT >= 34) {
            return z.a(velocityTracker0, v);
        }
        if(v == 0) {
            return velocityTracker0.getXVelocity();
        }
        if(v == 1) {
            return velocityTracker0.getYVelocity();
        }
        a0 a00 = (a0)VelocityTrackerCompat.a.get(velocityTracker0);
        return a00 == null || v != 26 ? 0.0f : a00.c;
    }

    public static float getAxisVelocity(@NonNull VelocityTracker velocityTracker0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 34) {
            return z.b(velocityTracker0, v, v1);
        }
        if(v == 0) {
            return velocityTracker0.getXVelocity(v1);
        }
        return v == 1 ? velocityTracker0.getYVelocity(v1) : 0.0f;
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker0, int v) {
        return velocityTracker0.getXVelocity(v);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker0, int v) {
        return velocityTracker0.getYVelocity(v);
    }

    public static boolean isAxisSupported(@NonNull VelocityTracker velocityTracker0, int v) {
        return Build.VERSION.SDK_INT < 34 ? v == 0 || v == 1 || v == 26 : z.c(velocityTracker0, v);
    }

    public static void recycle(@NonNull VelocityTracker velocityTracker0) {
        velocityTracker0.recycle();
        VelocityTrackerCompat.a.remove(velocityTracker0);
    }
}

