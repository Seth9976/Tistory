package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({Scope.LIBRARY_GROUP})
public class LiveDataUtils {
    @SuppressLint({"LambdaLast"})
    @NonNull
    public static LiveData dedupedMappedLiveDataFor(@NonNull LiveData liveData0, @NonNull Function function0, @NonNull TaskExecutor taskExecutor0) {
        Object object0 = new Object();
        LiveData liveData1 = new MediatorLiveData();
        ((MediatorLiveData)liveData1).addSource(liveData0, new g(taskExecutor0, object0, function0, ((MediatorLiveData)liveData1)));
        return liveData1;
    }
}

