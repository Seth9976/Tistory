package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;

public final class zaz extends RemoteCreator {
    public static final zaz c;

    static {
        zaz.c = new zaz("com.google.android.gms.common.ui.SignInButtonCreatorImpl");  // 初始化器: Lcom/google/android/gms/dynamic/RemoteCreator;-><init>(Ljava/lang/String;)V
    }

    @Override  // com.google.android.gms.dynamic.RemoteCreator
    public final Object getRemoteCreator(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterface0 instanceof zam ? ((zam)iInterface0) : new zam(iBinder0, "com.google.android.gms.common.internal.ISignInButtonCreator");  // 初始化器: Lcom/google/android/gms/internal/base/zaa;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }

    public static View zaa(Context context0, int v, int v1) throws RemoteCreatorException {
        try {
            zax zax0 = new zax(1, v, v1, null);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
            return (View)ObjectWrapper.unwrap(((zam)zaz.c.getRemoteCreatorInstance(context0)).zae(iObjectWrapper0, zax0));
        }
        catch(Exception exception0) {
            throw new RemoteCreatorException("Could not get button with size " + v + " and color " + v1, exception0);
        }
    }
}

