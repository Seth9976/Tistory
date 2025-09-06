package com.bumptech.glide.load.engine.executor;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import c6.b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class GlideExecutor implements ExecutorService {
    public static final class Builder {
        public static final long NO_THREAD_TIMEOUT;
        public final boolean a;
        public int b;
        public int c;
        public final b d;
        public UncaughtThrowableStrategy e;
        public String f;
        public long g;

        public Builder(boolean z) {
            this.d = new b(0);
            this.e = UncaughtThrowableStrategy.DEFAULT;
            this.a = z;
        }

        public GlideExecutor build() {
            if(TextUtils.isEmpty(this.f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f);
            }
            ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(this.b, this.c, this.g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new com.bumptech.glide.load.engine.executor.b(this.d, this.f, this.e, this.a));
            if(this.g != 0L) {
                threadPoolExecutor0.allowCoreThreadTimeOut(true);
            }
            return new GlideExecutor(threadPoolExecutor0);
        }

        public Builder setName(String s) {
            this.f = s;
            return this;
        }

        public Builder setThreadCount(@IntRange(from = 1L) int v) {
            this.b = v;
            this.c = v;
            return this;
        }

        public Builder setThreadTimeoutMillis(long v) {
            this.g = v;
            return this;
        }

        public Builder setUncaughtThrowableStrategy(@NonNull UncaughtThrowableStrategy glideExecutor$UncaughtThrowableStrategy0) {
            this.e = glideExecutor$UncaughtThrowableStrategy0;
            return this;
        }
    }

    public interface UncaughtThrowableStrategy {
        public static final UncaughtThrowableStrategy DEFAULT;
        public static final UncaughtThrowableStrategy IGNORE;
        public static final UncaughtThrowableStrategy LOG;
        public static final UncaughtThrowableStrategy THROW;

        static {
            UncaughtThrowableStrategy.IGNORE = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
            d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
            UncaughtThrowableStrategy.LOG = d0;
            UncaughtThrowableStrategy.THROW = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
            UncaughtThrowableStrategy.DEFAULT = d0;
        }

        void handle(Throwable arg1);
    }

    public final ThreadPoolExecutor a;
    public static final long b;
    public static volatile int c;

    static {
        GlideExecutor.b = TimeUnit.SECONDS.toMillis(10L);
    }

    public GlideExecutor(ThreadPoolExecutor threadPoolExecutor0) {
        this.a = threadPoolExecutor0;
    }

    @Override
    public boolean awaitTermination(long v, @NonNull TimeUnit timeUnit0) throws InterruptedException {
        return this.a.awaitTermination(v, timeUnit0);
    }

    public static int calculateBestThreadCount() {
        if(GlideExecutor.c == 0) {
            GlideExecutor.c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return GlideExecutor.c;
    }

    @Override
    public void execute(@NonNull Runnable runnable0) {
        this.a.execute(runnable0);
    }

    @Override
    @NonNull
    public List invokeAll(@NonNull Collection collection0) throws InterruptedException {
        return this.a.invokeAll(collection0);
    }

    @Override
    @NonNull
    public List invokeAll(@NonNull Collection collection0, long v, @NonNull TimeUnit timeUnit0) throws InterruptedException {
        return this.a.invokeAll(collection0, v, timeUnit0);
    }

    @Override
    @NonNull
    public Object invokeAny(@NonNull Collection collection0) throws InterruptedException, ExecutionException {
        return this.a.invokeAny(collection0);
    }

    @Override
    public Object invokeAny(@NonNull Collection collection0, long v, @NonNull TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a.invokeAny(collection0, v, timeUnit0);
    }

    @Override
    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    public static Builder newAnimationBuilder() {
        return GlideExecutor.calculateBestThreadCount() < 4 ? new Builder(true).setThreadCount(1).setName("animation") : new Builder(true).setThreadCount(2).setName("animation");
    }

    public static GlideExecutor newAnimationExecutor() {
        return GlideExecutor.newAnimationBuilder().build();
    }

    @Deprecated
    public static GlideExecutor newAnimationExecutor(int v, UncaughtThrowableStrategy glideExecutor$UncaughtThrowableStrategy0) {
        return GlideExecutor.newAnimationBuilder().setThreadCount(v).setUncaughtThrowableStrategy(glideExecutor$UncaughtThrowableStrategy0).build();
    }

    public static Builder newDiskCacheBuilder() {
        return new Builder(true).setThreadCount(1).setName("disk-cache");
    }

    public static GlideExecutor newDiskCacheExecutor() {
        return GlideExecutor.newDiskCacheBuilder().build();
    }

    @Deprecated
    public static GlideExecutor newDiskCacheExecutor(int v, String s, UncaughtThrowableStrategy glideExecutor$UncaughtThrowableStrategy0) {
        return GlideExecutor.newDiskCacheBuilder().setThreadCount(v).setName(s).setUncaughtThrowableStrategy(glideExecutor$UncaughtThrowableStrategy0).build();
    }

    @Deprecated
    public static GlideExecutor newDiskCacheExecutor(UncaughtThrowableStrategy glideExecutor$UncaughtThrowableStrategy0) {
        return GlideExecutor.newDiskCacheBuilder().setUncaughtThrowableStrategy(glideExecutor$UncaughtThrowableStrategy0).build();
    }

    public static Builder newSourceBuilder() {
        return new Builder(false).setThreadCount(GlideExecutor.calculateBestThreadCount()).setName("source");
    }

    public static GlideExecutor newSourceExecutor() {
        return GlideExecutor.newSourceBuilder().build();
    }

    @Deprecated
    public static GlideExecutor newSourceExecutor(int v, String s, UncaughtThrowableStrategy glideExecutor$UncaughtThrowableStrategy0) {
        return GlideExecutor.newSourceBuilder().setThreadCount(v).setName(s).setUncaughtThrowableStrategy(glideExecutor$UncaughtThrowableStrategy0).build();
    }

    @Deprecated
    public static GlideExecutor newSourceExecutor(UncaughtThrowableStrategy glideExecutor$UncaughtThrowableStrategy0) {
        return GlideExecutor.newSourceBuilder().setUncaughtThrowableStrategy(glideExecutor$UncaughtThrowableStrategy0).build();
    }

    public static GlideExecutor newUnlimitedSourceExecutor() {
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        SynchronousQueue synchronousQueue0 = new SynchronousQueue();
        com.bumptech.glide.load.engine.executor.b b0 = new com.bumptech.glide.load.engine.executor.b(new b(0), "source-unlimited", UncaughtThrowableStrategy.DEFAULT, false);
        return new GlideExecutor(new ThreadPoolExecutor(0, 0x7FFFFFFF, GlideExecutor.b, timeUnit0, synchronousQueue0, b0));
    }

    @Override
    public void shutdown() {
        this.a.shutdown();
    }

    @Override
    @NonNull
    public List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    @NonNull
    public Future submit(@NonNull Runnable runnable0) {
        return this.a.submit(runnable0);
    }

    @Override
    @NonNull
    public Future submit(@NonNull Runnable runnable0, Object object0) {
        return this.a.submit(runnable0, object0);
    }

    @Override
    public Future submit(@NonNull Callable callable0) {
        return this.a.submit(callable0);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

