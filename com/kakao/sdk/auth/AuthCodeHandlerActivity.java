package com.kakao.sdk.auth;

import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.KakaoCustomTabsClient;
import com.kakao.sdk.common.util.SdkLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o0.e;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001A\u00020\u00062\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0014¢\u0006\u0004\b\u000E\u0010\u0003¨\u0006\u000F"}, d2 = {"Lcom/kakao/sdk/auth/AuthCodeHandlerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onDestroy", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class AuthCodeHandlerActivity extends AppCompatActivity {
    public ServiceConnection A;
    public boolean B;
    public HashMap C;
    public ResultReceiver y;
    public Uri z;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap0 = this.C;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    public View _$_findCachedViewById(int v) {
        if(this.C == null) {
            this.C = new HashMap();
        }
        View view0 = (View)this.C.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.C.put(v, view0);
        }
        return view0;
    }

    public static final Uri access$getFullUri$p(AuthCodeHandlerActivity authCodeHandlerActivity0) {
        Uri uri0 = authCodeHandlerActivity0.z;
        if(uri0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullUri");
        }
        return uri0;
    }

    public static final ResultReceiver access$getResultReceiver$p(AuthCodeHandlerActivity authCodeHandlerActivity0) {
        ResultReceiver resultReceiver0 = authCodeHandlerActivity0.y;
        if(resultReceiver0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultReceiver");
        }
        return resultReceiver0;
    }

    public static final void access$sendError(AuthCodeHandlerActivity authCodeHandlerActivity0, KakaoSdkError kakaoSdkError0) {
        authCodeHandlerActivity0.g(kakaoSdkError0);
    }

    public static final void access$setFullUri$p(AuthCodeHandlerActivity authCodeHandlerActivity0, Uri uri0) {
        authCodeHandlerActivity0.z = uri0;
    }

    public static final void access$setResultReceiver$p(AuthCodeHandlerActivity authCodeHandlerActivity0, ResultReceiver resultReceiver0) {
        authCodeHandlerActivity0.y = resultReceiver0;
    }

    public final void g(KakaoSdkError kakaoSdkError0) {
        ResultReceiver resultReceiver0 = this.y;
        if(resultReceiver0 != null) {
            if(resultReceiver0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resultReceiver");
            }
            Bundle bundle0 = new Bundle();
            bundle0.putSerializable("key.exception", kakaoSdkError0);
            resultReceiver0.send(0, bundle0);
        }
        this.finish();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        try {
            Intent intent0 = this.getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent0, "intent");
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 != null) {
                Bundle bundle2 = bundle1.getBundle("key.bundle");
                if(bundle2 != null) {
                    Parcelable parcelable0 = bundle2.getParcelable("key.result.receiver");
                    if(parcelable0 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.os.ResultReceiver");
                    }
                    this.y = (ResultReceiver)parcelable0;
                    Parcelable parcelable1 = bundle2.getParcelable("key.full_authorize_uri");
                    if(parcelable1 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.net.Uri");
                    }
                    this.z = (Uri)parcelable1;
                }
            }
        }
        catch(Throwable throwable0) {
            SdkLog.Companion.e(throwable0);
            ClientError clientError0 = new ClientError(ClientErrorCause.Unknown, null, 2, null);
            clientError0.initCause(throwable0);
            this.g(clientError0);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onDestroy() {
        super.onDestroy();
        ServiceConnection serviceConnection0 = this.A;
        if(serviceConnection0 != null) {
            this.unbindService(serviceConnection0);
        }
    }

    @Override  // androidx.activity.ComponentActivity
    public void onNewIntent(@Nullable Intent intent0) {
        super.onNewIntent(intent0);
        if(intent0 != null) {
            Uri uri0 = intent0.getData();
            if(uri0 != null) {
                Intrinsics.checkExpressionValueIsNotNull(uri0, "it");
                ResultReceiver resultReceiver0 = this.y;
                if(resultReceiver0 != null) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putParcelable("key.url", uri0);
                    resultReceiver0.send(-1, bundle0);
                }
                this.finish();
                return;
            }
        }
        Unit unit0 = (Unit)new e(this, 19).invoke();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        if(!this.B) {
            this.B = true;
            Uri uri0 = this.z;
            if(uri0 != null) {
                SdkLog.Companion.i("Authorize Uri: " + uri0);
                try {
                    this.A = KakaoCustomTabsClient.INSTANCE.openWithDefault(this, uri0);
                }
                catch(UnsupportedOperationException unsupportedOperationException0) {
                    SdkLog.Companion.w(unsupportedOperationException0);
                    KakaoCustomTabsClient.INSTANCE.open(this, uri0);
                }
                return;
            }
            this.g(new ClientError(ClientErrorCause.IllegalState, "/oauth/authorize url has been not initialized."));
            return;
        }
        this.g(new ClientError(ClientErrorCause.Cancelled, "/oauth/authorize cancelled."));
    }
}

