package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation.State.FAILURE;
import androidx.work.Operation.State.SUCCESS;
import androidx.work.Operation.State;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({Scope.LIBRARY_GROUP})
public class OperationImpl implements Operation {
    public final MutableLiveData a;
    public final SettableFuture b;

    public OperationImpl() {
        this.a = new MutableLiveData();
        this.b = SettableFuture.create();
        this.markState(Operation.IN_PROGRESS);
    }

    @Override  // androidx.work.Operation
    @NonNull
    public ListenableFuture getResult() {
        return this.b;
    }

    @Override  // androidx.work.Operation
    @NonNull
    public LiveData getState() {
        return this.a;
    }

    public void markState(@NonNull State operation$State0) {
        this.a.postValue(operation$State0);
        SettableFuture settableFuture0 = this.b;
        if(operation$State0 instanceof SUCCESS) {
            settableFuture0.set(((SUCCESS)operation$State0));
            return;
        }
        if(operation$State0 instanceof FAILURE) {
            settableFuture0.setException(((FAILURE)operation$State0).getThrowable());
        }
    }
}

