package androidx.core.os;

import androidx.annotation.Nullable;

@Deprecated
public final class CancellationSignal {
    public interface OnCancelListener {
        void onCancel();
    }

    public boolean a;
    public OnCancelListener b;
    public android.os.CancellationSignal c;
    public boolean d;

    public void cancel() {
        android.os.CancellationSignal cancellationSignal0;
        OnCancelListener cancellationSignal$OnCancelListener0;
        synchronized(this) {
            if(this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            cancellationSignal$OnCancelListener0 = this.b;
            cancellationSignal0 = this.c;
        }
        try {
            if(cancellationSignal$OnCancelListener0 != null) {
                cancellationSignal$OnCancelListener0.onCancel();
            }
            if(cancellationSignal0 != null) {
                cancellationSignal0.cancel();
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        synchronized(this) {
            this.d = false;
            this.notifyAll();
        }
        throw throwable0;
    label_24:
        synchronized(this) {
            this.d = false;
            this.notifyAll();
        }
    }

    @Nullable
    public Object getCancellationSignalObject() {
        synchronized(this) {
            if(this.c == null) {
                android.os.CancellationSignal cancellationSignal0 = new android.os.CancellationSignal();
                this.c = cancellationSignal0;
                if(this.a) {
                    cancellationSignal0.cancel();
                }
            }
            return this.c;
        }
    }

    public boolean isCanceled() {
        synchronized(this) {
        }
        return this.a;
    }

    public void setOnCancelListener(@Nullable OnCancelListener cancellationSignal$OnCancelListener0) {
        synchronized(this) {
            while(this.d) {
                try {
                    this.wait();
                }
                catch(InterruptedException unused_ex) {
                }
            }
            if(this.b == cancellationSignal$OnCancelListener0) {
                return;
            }
            this.b = cancellationSignal$OnCancelListener0;
            if(this.a && cancellationSignal$OnCancelListener0 != null) {
                cancellationSignal$OnCancelListener0.onCancel();
            }
        }
    }

    public void throwIfCanceled() {
        if(this.isCanceled()) {
            throw new OperationCanceledException();
        }
    }
}

