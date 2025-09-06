package com.kakao.sdk.auth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.sdk.common.model.AuthError;
import com.kakao.sdk.common.model.AuthErrorCause;
import com.kakao.sdk.common.model.AuthErrorResponse;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog.Companion;
import com.kakao.sdk.common.util.SdkLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u001B\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000E\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0015\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001A\u0010\u0018\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001A\u0004\b\u0017\u0010\u0014R\u001A\u0010\u001B\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001A\u0004\b\u001A\u0010\u0014R\u001A\u0010\u001E\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u001C\u0010\u0012\u001A\u0004\b\u001D\u0010\u0014R\u001A\u0010!\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u001F\u0010\u0012\u001A\u0004\b \u0010\u0014R\u001A\u0010$\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010\u0012\u001A\u0004\b#\u0010\u0014R\u001A\u0010\'\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\u0012\u001A\u0004\b&\u0010\u0014R\u001A\u0010*\u001A\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b(\u0010\u0012\u001A\u0004\b)\u0010\u0014¨\u0006+"}, d2 = {"Lcom/kakao/sdk/auth/TalkAuthCodeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "z", "Ljava/lang/String;", "getEXTRA_ERROR_TYPE", "()Ljava/lang/String;", "EXTRA_ERROR_TYPE", "A", "getEXTRA_ERROR_DESCRIPTION", "EXTRA_ERROR_DESCRIPTION", "B", "getNOT_SUPPORT_ERROR", "NOT_SUPPORT_ERROR", "C", "getUNKNOWN_ERROR", "UNKNOWN_ERROR", "D", "getPROTOCOL_ERROR", "PROTOCOL_ERROR", "E", "getAPPLICATION_ERROR", "APPLICATION_ERROR", "F", "getAUTH_CODE_ERROR", "AUTH_CODE_ERROR", "G", "getCLIENT_INFO_ERROR", "CLIENT_INFO_ERROR", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class TalkAuthCodeActivity extends AppCompatActivity {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public HashMap H;
    public ResultReceiver y;
    public final String z;

    public TalkAuthCodeActivity() {
        this.z = "com.kakao.sdk.talk.error.type";
        this.A = "com.kakao.sdk.talk.error.description";
        this.B = "NotSupportError";
        this.C = "UnknownError";
        this.D = "ProtocolError";
        this.E = "ApplicationError";
        this.F = "AuthCodeError";
        this.G = "ClientInfoError";
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap0 = this.H;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    public View _$_findCachedViewById(int v) {
        if(this.H == null) {
            this.H = new HashMap();
        }
        View view0 = (View)this.H.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.H.put(v, view0);
        }
        return view0;
    }

    public static final ResultReceiver access$getResultReceiver$p(TalkAuthCodeActivity talkAuthCodeActivity0) {
        ResultReceiver resultReceiver0 = talkAuthCodeActivity0.y;
        if(resultReceiver0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resultReceiver");
        }
        return resultReceiver0;
    }

    public static final void access$setResultReceiver$p(TalkAuthCodeActivity talkAuthCodeActivity0, ResultReceiver resultReceiver0) {
        talkAuthCodeActivity0.y = resultReceiver0;
    }

    public final void g(KakaoSdkError kakaoSdkError0) {
        ResultReceiver resultReceiver0 = this.y;
        if(resultReceiver0 != null) {
            Bundle bundle0 = new Bundle();
            bundle0.putSerializable("key.exception", kakaoSdkError0);
            resultReceiver0.send(0, bundle0);
        }
        this.finish();
    }

    @NotNull
    public final String getAPPLICATION_ERROR() {
        return this.E;
    }

    @NotNull
    public final String getAUTH_CODE_ERROR() {
        return this.F;
    }

    @NotNull
    public final String getCLIENT_INFO_ERROR() {
        return this.G;
    }

    @NotNull
    public final String getEXTRA_ERROR_DESCRIPTION() {
        return this.A;
    }

    @NotNull
    public final String getEXTRA_ERROR_TYPE() {
        return this.z;
    }

    @NotNull
    public final String getNOT_SUPPORT_ERROR() {
        return this.B;
    }

    @NotNull
    public final String getPROTOCOL_ERROR() {
        return this.D;
    }

    @NotNull
    public final String getUNKNOWN_ERROR() {
        return this.C;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        Bundle bundle0 = new Bundle();
        if(intent0 != null) {
            switch(v1) {
                case -1: {
                    Bundle bundle1 = intent0.getExtras();
                    if(bundle1 == null) {
                        this.g(new ClientError(ClientErrorCause.Unknown, "No result from KakaoTalk."));
                        return;
                    }
                    String s = bundle1.getString(this.z);
                    String s1 = bundle1.getString(this.A);
                    if(Intrinsics.areEqual(s, "access_denied")) {
                        this.g(new ClientError(ClientErrorCause.Cancelled, null, 2, null));
                        return;
                    }
                    if(s != null) {
                        AuthErrorCause authErrorCause0 = (AuthErrorCause)KakaoJson.INSTANCE.fromJson(s, AuthErrorCause.class);
                        if(authErrorCause0 == null) {
                            authErrorCause0 = AuthErrorCause.Unknown;
                        }
                        if(s1 == null) {
                            s1 = "no error description";
                        }
                        this.g(new AuthError(302, authErrorCause0, new AuthErrorResponse(s, s1)));
                        return;
                    }
                    Object object0 = bundle1.get("com.kakao.sdk.talk.redirectUrl");
                    if(object0 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                    bundle0.putParcelable("key.url", Uri.parse(((String)object0)));
                    ResultReceiver resultReceiver0 = this.y;
                    if(resultReceiver0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resultReceiver");
                    }
                    resultReceiver0.send(-1, bundle0);
                    this.finish();
                    this.overridePendingTransition(0, 0);
                    return;
                }
                case 0: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException("");
                }
            }
        }
        this.g(new ClientError(ClientErrorCause.Cancelled, null, 2, null));
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(layout.activity_talk_auth_code);
        try {
            Intent intent0 = this.getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent0, "intent");
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 == null) {
                throw new IllegalArgumentException("no extras.");
            }
            Intrinsics.checkExpressionValueIsNotNull(bundle1, "intent.extras ?: throw I…ntException(\"no extras.\")");
            Parcelable parcelable0 = bundle1.getParcelable("key.result.receiver");
            if(parcelable0 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.os.ResultReceiver");
            }
            this.y = (ResultReceiver)parcelable0;
            int v = bundle1.getInt("key.request.code");
            Companion sdkLog$Companion0 = SdkLog.Companion;
            sdkLog$Companion0.i("requestCode: " + v);
            Intent intent1 = (Intent)bundle1.getParcelable("key.login.intent");
            sdkLog$Companion0.i("loginIntent:");
            if(intent1 != null) {
                Bundle bundle2 = intent1.getExtras();
                if(bundle2 != null) {
                    sdkLog$Companion0.i("\tcom.kakao.sdk.talk.appKey : " + bundle2.getString("com.kakao.sdk.talk.appKey"));
                    sdkLog$Companion0.i("\tcom.kakao.sdk.talk.redirectUri : " + bundle2.getString("com.kakao.sdk.talk.redirectUri"));
                    sdkLog$Companion0.i("\tcom.kakao.sdk.talk.kaHeader : " + bundle2.getString("com.kakao.sdk.talk.kaHeader"));
                    Bundle bundle3 = bundle2.getBundle("com.kakao.sdk.talk.extraparams");
                    if(bundle3 != null) {
                        sdkLog$Companion0.i("\tcom.kakao.sdk.talk.extraparams");
                        Set set0 = bundle3.keySet();
                        Intrinsics.checkExpressionValueIsNotNull(set0, "keySet()");
                        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(set0, 10));
                        for(Object object0: set0) {
                            arrayList0.add("\t\t" + ((String)object0) + " : " + bundle3.get(((String)object0)));
                        }
                        for(Object object1: arrayList0) {
                            SdkLog.Companion.i(((String)object1));
                        }
                    }
                }
            }
            this.startActivityForResult(intent1, v);
            return;
        }
        catch(Throwable throwable0) {
        }
        SdkLog.Companion.e(throwable0);
        ClientError clientError0 = new ClientError(ClientErrorCause.Unknown, null, 2, null);
        clientError0.initCause(throwable0);
        this.g(clientError0);
    }
}

