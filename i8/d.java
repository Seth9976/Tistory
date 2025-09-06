package i8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzf;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzo;
import com.google.android.play.core.appupdate.internal.zzx;

public final class d extends zzn {
    public final int b;
    public final TaskCompletionSource c;
    public final Object d;
    public final Object e;

    public d(h h0, TaskCompletionSource taskCompletionSource0, String s, TaskCompletionSource taskCompletionSource1) {
        this.b = 0;
        this.e = h0;
        this.d = s;
        this.c = taskCompletionSource1;
        super(taskCompletionSource0);
    }

    public d(Object object0, TaskCompletionSource taskCompletionSource0, TaskCompletionSource taskCompletionSource1, Object object1, int v) {
        this.b = v;
        this.e = object0;
        this.c = taskCompletionSource1;
        this.d = object1;
        super(taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        switch(this.b) {
            case 0: {
                TaskCompletionSource taskCompletionSource0 = this.c;
                String s = (String)this.d;
                h h0 = (h)this.e;
                try {
                    Bundle bundle0 = h.a(h0, s);
                    g g0 = new g(h0, taskCompletionSource0, s);
                    ((zzf)h0.a.zze()).zzd(h0.b, bundle0, g0);
                }
                catch(RemoteException remoteException0) {
                    h.e.zzc(remoteException0, "requestUpdateInfo(%s)", new Object[]{s});
                    taskCompletionSource0.trySetException(new RuntimeException(remoteException0));
                }
                return;
            }
            case 1: {
                TaskCompletionSource taskCompletionSource1 = this.c;
                h h1 = (h)this.e;
                try {
                    Bundle bundle1 = h.b();
                    f f0 = new f(h1, new zzm("OnCompleteUpdateCallback"), taskCompletionSource1);  // 初始化器: Li8/e;-><init>(Li8/h;Lcom/google/android/play/core/appupdate/internal/zzm;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
                    ((zzf)h1.a.zze()).zzc(h1.b, bundle1, f0);
                }
                catch(RemoteException remoteException1) {
                    h.e.zzc(remoteException1, "completeUpdate(%s)", new Object[]{((String)this.d)});
                    taskCompletionSource1.trySetException(new RuntimeException(remoteException1));
                }
                return;
            }
            default: {
                Object object0 = ((zzx)this.e).f;
                synchronized(object0) {
                    ((zzx)this.e).e.add(this.c);
                    zzo zzo0 = new zzo(((zzx)this.e), this.c);
                    this.c.getTask().addOnCompleteListener(zzo0);
                    if(((zzx)this.e).k.getAndIncrement() > 0) {
                        ((zzx)this.e).b.zzd("Already connected to the service.", new Object[0]);
                    }
                    zzx.a(((zzx)this.e), ((zzn)this.d));
                }
            }
        }
    }
}

