package com.kakao.tistory.data.preference;

import android.content.Context;
import com.kakao.tistory.data.model.WebSession;
import com.kakao.tistory.data.utils.AESUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u001A\u0010\u000F\u001A\u00020\n8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER.\u0010\u0015\u001A\u0004\u0018\u00010\n2\b\u0010\u0010\u001A\u0004\u0018\u00010\n8F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001A\u0004\b\u0012\u0010\u000E\"\u0004\b\u0013\u0010\u0014R.\u0010\u0019\u001A\u0004\u0018\u00010\n2\b\u0010\u0010\u001A\u0004\u0018\u00010\n8F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001A\u0004\b\u0017\u0010\u000E\"\u0004\b\u0018\u0010\u0014R.\u0010\u001D\u001A\u0004\u0018\u00010\n2\b\u0010\u0010\u001A\u0004\u0018\u00010\n8F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\f\u001A\u0004\b\u001B\u0010\u000E\"\u0004\b\u001C\u0010\u0014R.\u0010%\u001A\u0004\u0018\u00010\u001E2\b\u0010\u0010\u001A\u0004\u0018\u00010\u001E8F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/data/preference/AppSessionPreference;", "Lcom/kakao/tistory/data/preference/BasePreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "clearWebSession", "()V", "clearAll", "", "b", "Ljava/lang/String;", "getPREFERENCE_NAME", "()Ljava/lang/String;", "PREFERENCE_NAME", "value", "c", "getAccessToken", "setAccessToken", "(Ljava/lang/String;)V", "accessToken", "d", "getKakaoAccessToken", "setKakaoAccessToken", "kakaoAccessToken", "e", "getCurrentBlogName", "setCurrentBlogName", "currentBlogName", "Lcom/kakao/tistory/data/model/WebSession;", "f", "Lcom/kakao/tistory/data/model/WebSession;", "getWebSession", "()Lcom/kakao/tistory/data/model/WebSession;", "setWebSession", "(Lcom/kakao/tistory/data/model/WebSession;)V", "webSession", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AppSessionPreference extends BasePreference {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/data/preference/AppSessionPreference$Companion;", "", "", "APP_KEY_SECRET_KEY", "Ljava/lang/String;", "PROPERTY_ACCESS_TOKEN_V2", "PROPERTY_CURRENT_BLOG_NAME", "PROPERTY_KAKAO_ACCESS_TOKEN", "PROPERTY_WEB_SESSION", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final String APP_KEY_SECRET_KEY = "TISTORY_APP_2019TISTORY_APP_2019";
    @NotNull
    public static final Companion Companion;
    public final String b;
    public String c;
    public String d;
    public String e;
    public WebSession f;

    static {
        AppSessionPreference.Companion = new Companion(null);
    }

    @Inject
    public AppSessionPreference(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.b = "SETTING_PREPERENCE_APP_SESSION";
    }

    @Override  // com.kakao.tistory.data.preference.BasePreference
    public void clearAll() {
        this.setAccessToken(null);
        this.setKakaoAccessToken(null);
        this.remove("PROPERTY_ACCESS_TOKEN");
        this.remove("PROPERTY_ACCESS_TOKEN_V2");
        this.remove("PROPERTY_KAKAO_ACCESS_TOKEN");
        this.remove("PROPERTY_CURRENT_BLOG_NAME");
        this.remove("PROPERTY_WEB_SESSION");
    }

    public final void clearWebSession() {
        this.remove("PROPERTY_WEB_SESSION");
    }

    @Nullable
    public final String getAccessToken() {
        String s = this.c;
        if(s == null) {
            String s1 = null;
            String s2 = BasePreference.getString$default(this, "PROPERTY_ACCESS_TOKEN_V2", null, 2, null);
            String s3 = s2 == null ? null : new AESUtils("TISTORY_APP_2019TISTORY_APP_2019", null, null, 6, null).decrypt(s2);
            if(s3 == null) {
                String s4 = BasePreference.getString$default(this, "PROPERTY_ACCESS_TOKEN", null, 2, null);
                if(BasePreference.getString$default(this, "PROPERTY_ACCESS_TOKEN", null, 2, null) != null) {
                    this.remove("PROPERTY_ACCESS_TOKEN");
                }
                if(s4 != null) {
                    s1 = new AESUtils("TISTORY_APP_2019TISTORY_APP_2019", null, null, 6, null).encrypt(s4);
                }
                this.putString("PROPERTY_ACCESS_TOKEN_V2", s1);
                return s4;
            }
            return s3;
        }
        return s;
    }

    @Nullable
    public final String getCurrentBlogName() {
        return this.e == null ? BasePreference.getString$default(this, "PROPERTY_CURRENT_BLOG_NAME", null, 2, null) : this.e;
    }

    @Nullable
    public final String getKakaoAccessToken() {
        String s = this.d;
        if(s == null) {
            String s1 = BasePreference.getString$default(this, "PROPERTY_KAKAO_ACCESS_TOKEN", null, 2, null);
            return s1 == null ? null : new AESUtils("TISTORY_APP_2019TISTORY_APP_2019", null, null, 6, null).decrypt(s1);
        }
        return s;
    }

    @Override  // com.kakao.tistory.data.preference.BasePreference
    @NotNull
    public String getPREFERENCE_NAME() {
        return this.b;
    }

    @Nullable
    public final WebSession getWebSession() {
        return this.f == null ? ((WebSession)this.getObject("PROPERTY_WEB_SESSION", WebSession.class)) : this.f;
    }

    public final void setAccessToken(@Nullable String s) {
        this.c = s;
        String s1 = null;
        if(BasePreference.getString$default(this, "PROPERTY_ACCESS_TOKEN", null, 2, null) != null) {
            this.remove("PROPERTY_ACCESS_TOKEN");
        }
        if(s != null) {
            s1 = new AESUtils("TISTORY_APP_2019TISTORY_APP_2019", null, null, 6, null).encrypt(s);
        }
        this.putString("PROPERTY_ACCESS_TOKEN_V2", s1);
    }

    public final void setCurrentBlogName(@Nullable String s) {
        this.e = s;
        this.putString("PROPERTY_CURRENT_BLOG_NAME", s);
    }

    public final void setKakaoAccessToken(@Nullable String s) {
        this.d = s;
        this.putString("PROPERTY_KAKAO_ACCESS_TOKEN", (s == null ? null : new AESUtils("TISTORY_APP_2019TISTORY_APP_2019", null, null, 6, null).encrypt(s)));
    }

    public final void setWebSession(@Nullable WebSession webSession0) {
        this.f = webSession0;
        this.putObject("PROPERTY_WEB_SESSION", webSession0);
    }
}

