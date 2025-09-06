package com.google.android.material.color;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.kakao.sdk.auth.RxAuthCodeClient;
import com.kakao.sdk.auth.TalkAuthCodeActivity;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class i implements SingleOnSubscribe {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public i(RxAuthCodeClient rxAuthCodeClient0, List list0, List list1, Context context0, int v) {
        this.b = rxAuthCodeClient0;
        this.c = list0;
        this.d = list1;
        this.e = context0;
        this.a = v;
    }

    public i(List list0, HashSet hashSet0, int v) {
        byte[] arr_b = new byte[0x40];
        this.c = arr_b;
        this.a = v;
        arr_b[0] = 0x40;
        this.e = new g[list0.size()];
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            ((g[])this.e)[v2] = new g(v2, ((c)list0.get(v2)).e);
        }
        this.d = new int[v];
        int v3 = 0;
        for(int v1 = 0; v1 < v; v1 = (short)(v1 + 1)) {
            if(hashSet0.contains(((short)v1))) {
                ((int[])this.d)[v1] = v3;
                v3 += 16;
            }
            else {
                ((int[])this.d)[v1] = -1;
            }
        }
        this.b = new f(0x201, 84, ((g[])this.e).length * 16 + (((int[])this.d).length * 4 + 84));
    }

    @Override  // io.reactivex.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter0) {
        Intrinsics.checkParameterIsNotNull(singleEmitter0, "emitter");
        RxAuthCodeClient rxAuthCodeClient0 = (RxAuthCodeClient)this.b;
        String s = RxAuthCodeClient.access$getApplicationInfo$p(rxAuthCodeClient0).getAppKey();
        String s1 = RxAuthCodeClient.access$getContextInfo$p(rxAuthCodeClient0).getKaHeader();
        Bundle bundle0 = new Bundle();
        List list0 = (List)this.c;
        if(list0 != null) {
            bundle0.putString("channel_public_id", CollectionsKt___CollectionsKt.joinToString$default(list0, ",", null, null, 0, null, null, 62, null));
        }
        List list1 = (List)this.d;
        if(list1 != null) {
            bundle0.putString("service_terms", CollectionsKt___CollectionsKt.joinToString$default(list1, ",", null, null, 0, null, null, 62, null));
        }
        Intent intent0 = rxAuthCodeClient0.talkLoginIntent$auth_rx_release(s, "kakao" + s + "://oauth", s1, bundle0);
        Context context0 = (Context)this.e;
        Intent intent1 = RxAuthCodeClient.access$getIntentResolveClient$p(rxAuthCodeClient0).resolveTalkIntent(context0, intent0);
        if(intent1 == null) {
            singleEmitter0.onError(new ClientError(ClientErrorCause.NotSupported, "KakaoTalk not installed"));
            return;
        }
        try {
            context0.startActivity(new Intent(context0, TalkAuthCodeActivity.class).putExtra("key.login.intent", intent1).putExtra("key.request.code", this.a).putExtra("key.result.receiver", rxAuthCodeClient0.resultReceiver$auth_rx_release(singleEmitter0)));
        }
        catch(Throwable throwable0) {
            singleEmitter0.onError(throwable0);
        }
    }
}

