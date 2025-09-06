package i8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class g extends e {
    public final String d;
    public final h e;

    public g(h h0, TaskCompletionSource taskCompletionSource0, String s) {
        this.e = h0;
        super(h0, new zzm("OnRequestInstallCallback"), taskCompletionSource0);
        this.d = s;
    }

    @Override  // i8.e
    public final void zzc(Bundle bundle0) {
        super.zzc(bundle0);
        int v = bundle0.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource0 = this.b;
        if(v != 0) {
            taskCompletionSource0.trySetException(new InstallException(bundle0.getInt("error.code", -2)));
            return;
        }
        int v1 = bundle0.getInt("version.code", -1);
        int v2 = bundle0.getInt("update.availability");
        int v3 = bundle0.getInt("install.status", 0);
        Integer integer0 = bundle0.getInt("client.version.staleness", -1) == -1 ? null : bundle0.getInt("client.version.staleness");
        int v4 = bundle0.getInt("in.app.update.priority", 0);
        long v5 = bundle0.getLong("bytes.downloaded");
        long v6 = bundle0.getLong("total.bytes.to.download");
        long v7 = bundle0.getLong("additional.size.required");
        this.e.d.getClass();
        long v8 = i.a(new File(this.e.d.a.getFilesDir(), "assetpacks"));
        Parcelable parcelable0 = bundle0.getParcelable("blocking.intent");
        Parcelable parcelable1 = bundle0.getParcelable("nonblocking.intent");
        Parcelable parcelable2 = bundle0.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("nonblocking.destructive.intent");
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = bundle0.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet0 = new HashSet();
        if(arrayList0 != null) {
            hashSet0.addAll(arrayList0);
        }
        hashMap0.put("blocking.destructive.intent", hashSet0);
        ArrayList arrayList1 = bundle0.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet1 = new HashSet();
        if(arrayList1 != null) {
            hashSet1.addAll(arrayList1);
        }
        hashMap0.put("nonblocking.destructive.intent", hashSet1);
        ArrayList arrayList2 = bundle0.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet2 = new HashSet();
        if(arrayList2 != null) {
            hashSet2.addAll(arrayList2);
        }
        hashMap0.put("blocking.intent", hashSet2);
        ArrayList arrayList3 = bundle0.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet3 = new HashSet();
        if(arrayList3 != null) {
            hashSet3.addAll(arrayList3);
        }
        hashMap0.put("nonblocking.intent", hashSet3);
        taskCompletionSource0.trySetResult(AppUpdateInfo.zzb(this.d, v1, v2, v3, integer0, v4, v5, v6, v7, v8, ((PendingIntent)parcelable0), ((PendingIntent)parcelable1), ((PendingIntent)parcelable2), pendingIntent0, hashMap0));
    }
}

