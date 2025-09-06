package vg;

import java.util.concurrent.locks.ReentrantLock;
import okio.AsyncTimeout;

public final class b extends Thread {
    @Override
    public final void run() {
        AsyncTimeout asyncTimeout0;
        while(true) {
            try {
                AsyncTimeout.h.getClass();
                ReentrantLock reentrantLock0 = AsyncTimeout.i;
                reentrantLock0.lock();
                try {
                    AsyncTimeout.h.getClass();
                    asyncTimeout0 = a.c();
                    if(asyncTimeout0 == AsyncTimeout.m) {
                        AsyncTimeout.m = null;
                        return;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                if(asyncTimeout0 != null) {
                    asyncTimeout0.timedOut();
                }
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }
}

