package androidx.work.impl.utils;

import androidx.arch.core.util.Function;
import androidx.core.app.o;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

public final class g implements Observer {
    public Object a;
    public final TaskExecutor b;
    public final Object c;
    public final Function d;
    public final MediatorLiveData e;

    public g(TaskExecutor taskExecutor0, Object object0, Function function0, MediatorLiveData mediatorLiveData0) {
        this.b = taskExecutor0;
        this.c = object0;
        this.d = function0;
        this.e = mediatorLiveData0;
        this.a = null;
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        o o0 = new o(8, this, object0);
        this.b.executeOnTaskThread(o0);
    }
}

