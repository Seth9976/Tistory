package z5;

import android.os.SystemClock;
import coil.size.Dimension.Pixels;
import coil.size.Dimension;
import coil.size.Size;
import coil.util.HardwareBitmapService;
import coil.util.Logger;

public final class d implements HardwareBitmapService {
    public final Logger a;

    static {
    }

    public d(Logger logger0) {
        this.a = logger0;
    }

    @Override  // coil.util.HardwareBitmapService
    public final boolean allowHardwareMainThread(Size size0) {
        Dimension dimension0 = size0.getWidth();
        int v = 0x7FFFFFFF;
        if((dimension0 instanceof Pixels ? ((Pixels)dimension0).px : 0x7FFFFFFF) > 100) {
            Dimension dimension1 = size0.getHeight();
            if(dimension1 instanceof Pixels) {
                v = ((Pixels)dimension1).px;
            }
            return v > 100;
        }
        return false;
    }

    @Override  // coil.util.HardwareBitmapService
    public final boolean allowHardwareWorkerThread() {
        c c0 = c.a;
        Logger logger0 = this.a;
        synchronized(c0) {
            int v1 = c.c;
            c.c = v1 + 1;
            if(v1 >= 30 || SystemClock.uptimeMillis() > c.d + 30000L) {
                boolean z = false;
                c.c = 0;
                c.d = SystemClock.uptimeMillis();
                String[] arr_s = c.b.list();
                if(arr_s == null) {
                    arr_s = new String[0];
                }
                if(arr_s.length < 800) {
                    z = true;
                }
                c.e = z;
                if(!z && logger0 != null && logger0.getLevel() <= 5) {
                    logger0.log("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + arr_s.length, null);
                }
            }
            return c.e;
        }
    }
}

