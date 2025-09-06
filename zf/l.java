package zf;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.CtorCache;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

public final class l extends CtorCache {
    public static final l a;
    public static final ReentrantReadWriteLock b;
    public static final WeakHashMap c;

    static {
        l.a = new l();  // 初始化器: Lkotlinx/coroutines/internal/CtorCache;-><init>()V
        l.b = new ReentrantReadWriteLock();
        l.c = new WeakHashMap();
    }

    @Override  // kotlinx.coroutines.internal.CtorCache
    public final Function1 get(Class class0) {
        Function1 function10;
        Function1 function12;
        Function1 function11;
        ReentrantReadWriteLock reentrantReadWriteLock0 = l.b;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        reentrantReadWriteLock$ReadLock0.lock();
        WeakHashMap weakHashMap0 = l.c;
        try {
            function10 = (Function1)weakHashMap0.get(class0);
        }
        finally {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        if(function10 != null) {
            return function10;
        }
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock1 = reentrantReadWriteLock0.readLock();
        int v2 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v3 = 0; v3 < v2; ++v3) {
            reentrantReadWriteLock$ReadLock1.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            function11 = (Function1)weakHashMap0.get(class0);
            if(function11 == null) {
                function12 = ExceptionsConstructorKt.access$createConstructor(class0);
                weakHashMap0.put(class0, function12);
                goto label_33;
            }
            goto label_39;
        }
        catch(Throwable throwable0) {
            for(int v1 = 0; v1 < v2; ++v1) {
                reentrantReadWriteLock$ReadLock1.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
            throw throwable0;
        }
    label_33:
        while(v1 < v2) {
            reentrantReadWriteLock$ReadLock1.lock();
            ++v1;
        }
        reentrantReadWriteLock$WriteLock0.unlock();
        return function12;
    label_39:
        while(v1 < v2) {
            reentrantReadWriteLock$ReadLock1.lock();
            ++v1;
        }
        reentrantReadWriteLock$WriteLock0.unlock();
        return function11;
    }
}

