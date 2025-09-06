package l4;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.ModernAsyncTask.Status;
import java.util.concurrent.CountDownLatch;

public final class f extends Handler {
    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        e e0 = (e)message0.obj;
        switch(message0.what) {
            case 1: {
                g g0 = e0.a;
                Object object0 = e0.b[0];
                if(g0.d.get()) {
                    CountDownLatch countDownLatch0 = ((a)g0).i;
                    try {
                        AsyncTaskLoader asyncTaskLoader0 = ((a)g0).k;
                        asyncTaskLoader0.onCanceled(object0);
                        if(asyncTaskLoader0.l == ((a)g0)) {
                            asyncTaskLoader0.rollbackContentChanged();
                            asyncTaskLoader0.n = SystemClock.uptimeMillis();
                            asyncTaskLoader0.l = null;
                            asyncTaskLoader0.deliverCancellation();
                            asyncTaskLoader0.a();
                        }
                    }
                    finally {
                        countDownLatch0.countDown();
                    }
                }
                else {
                    try {
                        AsyncTaskLoader asyncTaskLoader1 = ((a)g0).k;
                        if(asyncTaskLoader1.k != ((a)g0)) {
                            asyncTaskLoader1.onCanceled(object0);
                            if(asyncTaskLoader1.l == ((a)g0)) {
                                asyncTaskLoader1.rollbackContentChanged();
                                asyncTaskLoader1.n = SystemClock.uptimeMillis();
                                asyncTaskLoader1.l = null;
                                asyncTaskLoader1.deliverCancellation();
                                asyncTaskLoader1.a();
                            }
                        }
                        else if(asyncTaskLoader1.isAbandoned()) {
                            asyncTaskLoader1.onCanceled(object0);
                        }
                        else {
                            asyncTaskLoader1.commitContentChanged();
                            asyncTaskLoader1.n = SystemClock.uptimeMillis();
                            asyncTaskLoader1.k = null;
                            asyncTaskLoader1.deliverResult(object0);
                        }
                    }
                    finally {
                        ((a)g0).i.countDown();
                    }
                }
                g0.c = ModernAsyncTask.Status.FINISHED;
                return;
            }
            case 2: {
                e0.a.getClass();
            }
        }
    }
}

