package a6;

import android.os.Binder;
import android.os.Process;
import androidx.core.os.OperationCanceledException;
import androidx.webkit.internal.JavaScriptReplyProxyImpl;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import com.bumptech.glide.disklrucache.DiskLruCache;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import l4.g;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

public final class a implements Callable {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final Object call() {
        switch(this.a) {
            case 0: {
                DiskLruCache diskLruCache0 = (DiskLruCache)this.b;
                synchronized(diskLruCache0) {
                    DiskLruCache diskLruCache1 = (DiskLruCache)this.b;
                    if(diskLruCache1.i == null) {
                        return null;
                    }
                    diskLruCache1.m();
                    if(((DiskLruCache)this.b).g()) {
                        ((DiskLruCache)this.b).k();
                        ((DiskLruCache)this.b).k = 0;
                    }
                    return null;
                }
            }
            case 1: {
                return new JavaScriptReplyProxyImpl(((JsReplyProxyBoundaryInterface)this.b));
            }
            case 2: {
                return new WebViewRenderProcessImpl(((WebViewRendererBoundaryInterface)this.b));
            }
            case 3: {
                return ((Flowable)this.b).replay();
            }
            case 4: {
                return ((Observable)this.b).replay();
            }
            case 5: {
                return ((Function0)this.b).invoke();
            }
            default: {
                g g0 = (g)this.b;
                g0.e.set(true);
                Object object0 = null;
                try {
                    Process.setThreadPriority(10);
                    l4.a a0 = (l4.a)g0;
                    try {
                        object0 = a0.k.onLoadInBackground();
                    }
                    catch(OperationCanceledException operationCanceledException0) {
                        if(!a0.d.get()) {
                            throw operationCanceledException0;
                        }
                    }
                    Binder.flushPendingCommands();
                }
                catch(Throwable throwable0) {
                    try {
                        g0.d.set(true);
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        g0.a(object0);
                        throw throwable1;
                    }
                }
                g0.a(object0);
                return object0;
            }
        }
    }
}

