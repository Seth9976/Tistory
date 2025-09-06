package com.bumptech.glide.load.resource.bitmap;

import android.os.Build.VERSION;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public final class HardwareConfigState {
    public static final boolean BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = false;
    public static final boolean HARDWARE_BITMAPS_SUPPORTED = false;
    public static final int NO_MAX_FD_COUNT = -1;
    public final boolean a;
    public final int b;
    public final int c;
    public int d;
    public boolean e;
    public final AtomicBoolean f;
    public static final File g;
    public static volatile HardwareConfigState h;
    public static volatile int i;

    static {
        HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = Build.VERSION.SDK_INT < 29;
        HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED = true;
        HardwareConfigState.g = new File("/proc/self/fd");
        HardwareConfigState.i = -1;
    }

    public HardwareConfigState() {
        boolean z = true;
        this.e = true;
        this.f = new AtomicBoolean(false);
        if(Build.VERSION.SDK_INT == 26) {
            for(Object object0: Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"})) {
                if(!Build.MODEL.startsWith(((String)object0))) {
                    continue;
                }
                z = false;
                goto label_13;
            }
        }
        if((Build.VERSION.SDK_INT == 27 ? Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL) : false)) {
            z = false;
        }
    label_13:
        this.a = z;
        if(Build.VERSION.SDK_INT >= 28) {
            this.b = 20000;
            this.c = 0;
            return;
        }
        this.b = 700;
        this.c = 0x80;
    }

    public boolean areHardwareBitmapsBlocked() {
        Util.assertMainThread();
        return !this.f.get();
    }

    public void blockHardwareBitmaps() {
        Util.assertMainThread();
        this.f.set(false);
    }

    public static HardwareConfigState getInstance() {
        if(HardwareConfigState.h == null) {
            Class class0 = HardwareConfigState.class;
            synchronized(class0) {
                if(HardwareConfigState.h == null) {
                    HardwareConfigState.h = new HardwareConfigState();
                }
            }
        }
        return HardwareConfigState.h;
    }

    public boolean isHardwareConfigAllowed(int v, int v1, boolean z, boolean z1) {
        if(!z) {
            if(Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if(!this.a) {
            if(Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if(!HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED) {
            if(Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if(HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED && !this.f.get()) {
            if(Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if(z1) {
            if(Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int v2 = this.c;
        if(v < v2) {
            if(Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if(v1 < v2) {
            if(Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        synchronized(this) {
            int v4 = this.d + 1;
            this.d = v4;
            if(v4 >= 50) {
                this.d = 0;
                String[] arr_s = HardwareConfigState.g.list();
                int v5 = HardwareConfigState.i == -1 ? this.b : HardwareConfigState.i;
                boolean z2 = ((long)arr_s.length) < ((long)v5);
                this.e = z2;
                if(!z2 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we\'re over the file descriptor limit, file descriptors " + arr_s.length + ", limit " + ((long)v5));
                }
            }
        }
        if(!this.e) {
            if(Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
        return true;
    }

    public void unblockHardwareBitmaps() {
        Util.assertMainThread();
        this.f.set(true);
    }
}

