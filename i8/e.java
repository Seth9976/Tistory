package i8;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzg;
import com.google.android.play.core.appupdate.internal.zzm;

public abstract class e extends zzg {
    public final zzm a;
    public final TaskCompletionSource b;
    public final h c;

    public e(h h0, zzm zzm0, TaskCompletionSource taskCompletionSource0) {
        this.c = h0;
        super();
        this.a = zzm0;
        this.b = taskCompletionSource0;
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzh
    public void zzb(Bundle bundle0) {
        this.c.a.zzu(this.b);
        this.a.zzd("onCompleteUpdate", new Object[0]);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzh
    public void zzc(Bundle bundle0) {
        this.c.a.zzu(this.b);
        this.a.zzd("onRequestInfo", new Object[0]);
    }
}

