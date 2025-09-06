package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class NativeOnCompleteListener implements OnCompleteListener {
    public final long a;

    @KeepForSdk
    public NativeOnCompleteListener(long v) {
        this.a = v;
    }

    @KeepForSdk
    public static void createAndAddCallback(@NonNull Task task0, long v) {
        task0.addOnCompleteListener(new NativeOnCompleteListener(v));
    }

    @KeepForSdk
    public native void nativeOnComplete(long arg1, @Nullable Object arg2, boolean arg3, boolean arg4, @Nullable String arg5) {
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@NonNull Task task0) {
        String s;
        Object object0;
        if(task0.isSuccessful()) {
            object0 = task0.getResult();
            s = null;
        }
        else if(task0.isCanceled()) {
            object0 = null;
            s = null;
        }
        else {
            Exception exception0 = task0.getException();
            if(exception0 == null) {
                object0 = null;
                s = null;
            }
            else {
                s = exception0.getMessage();
                object0 = null;
            }
        }
        boolean z = task0.isSuccessful();
        boolean z1 = task0.isCanceled();
        this.nativeOnComplete(this.a, object0, z, z1, s);
    }
}

