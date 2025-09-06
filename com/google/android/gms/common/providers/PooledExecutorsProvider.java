package com.google.android.gms.common.providers;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
@Deprecated
public class PooledExecutorsProvider {
    public interface PooledExecutorFactory {
        @NonNull
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    public static a a;

    @NonNull
    @KeepForSdk
    @Deprecated
    public static PooledExecutorFactory getInstance() {
        synchronized(PooledExecutorsProvider.class) {
            if(PooledExecutorsProvider.a == null) {
                PooledExecutorsProvider.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            return PooledExecutorsProvider.a;
        }
    }
}

