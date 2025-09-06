package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import m7.a;
import m7.b;

public final class zad {
    public static final ClientKey zaa;
    @ShowFirstParty
    public static final ClientKey zab;
    public static final AbstractClientBuilder zac;
    public static final Scope zae;
    public static final Scope zaf;
    public static final Api zag;
    public static final Api zah;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        zad.zaa = api$ClientKey0;
        ClientKey api$ClientKey1 = new ClientKey();
        zad.zab = api$ClientKey1;
        a a0 = new a();  // 初始化器: Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;-><init>()V
        zad.zac = a0;
        b b0 = new b();  // 初始化器: Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;-><init>()V
        zad.zae = new Scope("profile");
        zad.zaf = new Scope("email");
        zad.zag = new Api("SignIn.API", a0, api$ClientKey0);
        zad.zah = new Api("SignIn.INTERNAL_API", b0, api$ClientKey1);
    }
}

