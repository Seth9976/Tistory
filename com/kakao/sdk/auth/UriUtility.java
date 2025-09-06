package com.kakao.sdk.auth;

import android.net.Uri.Builder;
import android.net.Uri;
import com.google.gson.annotations.SerializedName;
import com.kakao.sdk.auth.model.AuthType;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ServerHosts;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jw\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\u00062\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/sdk/auth/UriUtility;", "", "Lcom/kakao/sdk/common/model/ServerHosts;", "hosts", "<init>", "(Lcom/kakao/sdk/common/model/ServerHosts;)V", "", "clientId", "agt", "redirectUri", "", "scopes", "kaHeader", "channelPublicIds", "serviceTerms", "Lcom/kakao/sdk/auth/model/AuthType;", "authType", "Landroid/net/Uri;", "authorizeUri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/kakao/sdk/auth/model/AuthType;)Landroid/net/Uri;", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class UriUtility {
    public final ServerHosts a;

    public UriUtility() {
        this(null, 1, null);
    }

    public UriUtility(@NotNull ServerHosts serverHosts0) {
        Intrinsics.checkParameterIsNotNull(serverHosts0, "hosts");
        super();
        this.a = serverHosts0;
    }

    public UriUtility(ServerHosts serverHosts0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            serverHosts0 = KakaoSdk.INSTANCE.getHosts();
        }
        this(serverHosts0);
    }

    @NotNull
    public final Uri authorizeUri(@NotNull String s, @Nullable String s1, @NotNull String s2, @Nullable List list0, @Nullable String s3, @Nullable List list1, @Nullable List list2, @Nullable AuthType authType0) {
        Intrinsics.checkParameterIsNotNull(s, "clientId");
        Intrinsics.checkParameterIsNotNull(s2, "redirectUri");
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").authority("kauth.kakao.com").path("oauth/authorize").appendQueryParameter("client_id", s).appendQueryParameter("redirect_uri", s2).appendQueryParameter("response_type", "code");
        if(s1 != null) {
            uri$Builder0.appendQueryParameter("agt", s1);
        }
        if(list0 != null && !list0.isEmpty()) {
            uri$Builder0.appendQueryParameter("scope", CollectionsKt___CollectionsKt.joinToString$default(list0, ",", null, null, 0, null, null, 62, null));
        }
        if(list1 != null) {
            uri$Builder0.appendQueryParameter("channel_public_id", CollectionsKt___CollectionsKt.joinToString$default(list1, ",", null, null, 0, null, null, 62, null));
        }
        if(list2 != null) {
            uri$Builder0.appendQueryParameter("service_terms", CollectionsKt___CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null));
        }
        if(authType0 != null) {
            Field field0 = AuthType.class.getField(authType0.name());
            if(field0 != null) {
                SerializedName serializedName0 = (SerializedName)field0.getAnnotation(SerializedName.class);
                if(serializedName0 != null) {
                    String s4 = serializedName0.value();
                    if(s4 != null) {
                        uri$Builder0.appendQueryParameter("auth_type", s4);
                    }
                }
            }
        }
        Uri uri0 = uri$Builder0.appendQueryParameter("ka", s3).build();
        Intrinsics.checkExpressionValueIsNotNull(uri0, "builder.build()");
        return uri0;
    }

    public static Uri authorizeUri$default(UriUtility uriUtility0, String s, String s1, String s2, List list0, String s3, List list1, List list2, AuthType authType0, int v, Object object0) {
        String s4 = (v & 2) == 0 ? s1 : null;
        List list3 = (v & 8) == 0 ? list0 : null;
        String s5 = (v & 16) == 0 ? s3 : null;
        List list4 = (v & 0x20) == 0 ? list1 : null;
        List list5 = (v & 0x40) == 0 ? list2 : null;
        return (v & 0x80) == 0 ? uriUtility0.authorizeUri(s, s4, s2, list3, s5, list4, list5, authType0) : uriUtility0.authorizeUri(s, s4, s2, list3, s5, list4, list5, null);
    }
}

