package com.kakao.sdk.common.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.os.Build;
import android.provider.Settings.Secure;
import android.util.Base64;
import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.kakao.sdk.common.KakaoSdk.Type;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import wd.i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u001D\u0010\n\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0010\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001A\u001A\u00020\u00042\u0014\u0010\u0019\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u0015\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u001C\u001A\u00020\u0004¢\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010\u001F\u001A\u00020\f2\u0006\u0010\u001C\u001A\u00020\u0004¢\u0006\u0004\b\u001F\u0010 J\u0015\u0010\"\u001A\u00020!2\u0006\u0010\u001C\u001A\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u001D\u0010&\u001A\u00020%2\u0006\u0010$\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u0004¢\u0006\u0004\b&\u0010\'¨\u0006("}, d2 = {"Lcom/kakao/sdk/common/util/Utility;", "", "Landroid/content/Context;", "context", "", "getKeyHash", "(Landroid/content/Context;)Ljava/lang/String;", "getKeyHashDeprecated", "Lcom/kakao/sdk/common/KakaoSdk$Type;", "sdkType", "getKAHeader", "(Landroid/content/Context;Lcom/kakao/sdk/common/KakaoSdk$Type;)Ljava/lang/String;", "Lcom/google/gson/JsonObject;", "getExtras", "(Landroid/content/Context;Lcom/kakao/sdk/common/KakaoSdk$Type;)Lcom/google/gson/JsonObject;", "key", "getMetadata", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "", "androidId", "(Landroid/content/Context;)[B", "queries", "", "parseQuery", "(Ljava/lang/String;)Ljava/util/Map;", "params", "buildQuery", "(Ljava/util/Map;)Ljava/lang/String;", "path", "getJson", "(Ljava/lang/String;)Ljava/lang/String;", "getJsonObject", "(Ljava/lang/String;)Lcom/google/gson/JsonObject;", "Lcom/google/gson/JsonArray;", "getJsonArray", "(Ljava/lang/String;)Lcom/google/gson/JsonArray;", "jsonObject", "", "hasAndNotNull", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", "common_release"}, k = 1, mv = {1, 4, 0})
public final class Utility {
    public static final Utility INSTANCE;

    static {
        Utility.INSTANCE = new Utility();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @SuppressLint({"HardwareIds"})
    @NotNull
    public final byte[] androidId(@NotNull Context context0) throws NoSuchAlgorithmException {
        byte[] arr_b1;
        Intrinsics.checkParameterIsNotNull(context0, "context");
        try {
            String s = Settings.Secure.getString(context0.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(s, "androidId");
            String s1 = new Regex("[0\\s]").replace(s, "");
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
            messageDigest0.reset();
            Charset charset0 = Charsets.UTF_8;
            if("SDK-" + s1 != null) {
                byte[] arr_b = ("SDK-" + s1).getBytes(charset0);
                Intrinsics.checkExpressionValueIsNotNull(arr_b, "(this as java.lang.String).getBytes(charset)");
                messageDigest0.update(arr_b);
                arr_b1 = messageDigest0.digest();
                Intrinsics.checkExpressionValueIsNotNull(arr_b1, "md.digest()");
                return arr_b1;
            }
        }
        catch(Exception unused_ex) {
        }
        String s2 = a.o(new StringBuilder("xxxx"), Build.PRODUCT, "a23456789012345bcdefg");
        Charset charset1 = Charsets.UTF_8;
        if(s2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        arr_b1 = s2.getBytes(charset1);
        Intrinsics.checkExpressionValueIsNotNull(arr_b1, "(this as java.lang.String).getBytes(charset)");
        return arr_b1;
    }

    @NotNull
    public final String buildQuery(@Nullable Map map0) {
        if(map0 != null && !map0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(map0.size());
            for(Object object0: map0.entrySet()) {
                arrayList0.add(((String)((Map.Entry)object0).getKey()) + '=' + ((String)((Map.Entry)object0).getValue()));
            }
            Iterator iterator1 = arrayList0.iterator();
            if(!iterator1.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
            }
            String s;
            for(s = iterator1.next(); iterator1.hasNext(); s = s + '&' + ((String)object1)) {
                Object object1 = iterator1.next();
            }
            return s;
        }
        return "";
    }

    @NotNull
    public final JsonObject getExtras(@NotNull Context context0, @NotNull Type kakaoSdk$Type0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(kakaoSdk$Type0, "sdkType");
        JsonObject jsonObject0 = new JsonObject();
        jsonObject0.addProperty("appPkg", "net.daum.android.tistoryapp");
        jsonObject0.addProperty("keyHash", this.getKeyHash(context0));
        jsonObject0.addProperty("KA", this.getKAHeader(context0, kakaoSdk$Type0));
        return jsonObject0;
    }

    @NotNull
    public final String getJson(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "path");
        ClassLoader classLoader0 = Utility.class.getClassLoader();
        classLoader0.getClass();
        URL uRL0 = classLoader0.getResource(s);
        Intrinsics.checkExpressionValueIsNotNull(uRL0, "uri");
        return new String(i.readBytes(new File(uRL0.getPath())), Charsets.UTF_8);
    }

    @NotNull
    public final JsonArray getJsonArray(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "path");
        String s1 = this.getJson(s);
        return (JsonArray)KakaoJson.INSTANCE.fromJson(s1, JsonArray.class);
    }

    @NotNull
    public final JsonObject getJsonObject(@NotNull String s) {
        Intrinsics.checkParameterIsNotNull(s, "path");
        String s1 = this.getJson(s);
        return (JsonObject)KakaoJson.INSTANCE.fromJson(s1, JsonObject.class);
    }

    @NotNull
    public final String getKAHeader(@NotNull Context context0, @NotNull Type kakaoSdk$Type0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(kakaoSdk$Type0, "sdkType");
        String s = Utility.WhenMappings.$EnumSwitchMapping$0[kakaoSdk$Type0.ordinal()] == 1 ? "rx-kotlin" : "kotlin";
        Integer integer0 = Build.VERSION.SDK_INT;
        Locale locale0 = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale0, "Locale.getDefault()");
        String s1 = locale0.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(s1, "Locale.getDefault().language");
        if(s1 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String s2 = s1.toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(s2, "(this as java.lang.String).toLowerCase()");
        Locale locale1 = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale1, "Locale.getDefault()");
        String s3 = locale1.getCountry();
        Intrinsics.checkExpressionValueIsNotNull(s3, "Locale.getDefault().country");
        if(s3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String s4 = s3.toUpperCase();
        Intrinsics.checkExpressionValueIsNotNull(s4, "(this as java.lang.String).toUpperCase()");
        String s5 = this.getKeyHash(context0);
        String s6 = Build.MODEL;
        Intrinsics.checkExpressionValueIsNotNull(s6, "Build.MODEL");
        String s7 = new Regex("\\s").replace(s6, "-");
        if(s7 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String s8 = s7.toUpperCase();
        Intrinsics.checkExpressionValueIsNotNull(s8, "(this as java.lang.String).toUpperCase()");
        String s9 = String.format("%s/%s %s/%s %s/android-%s %s/%s-%s %s/%s %s/%s %s/%s %s/%s", Arrays.copyOf(new Object[]{"sdk", "2.0.5", "sdk_type", s, "os", integer0, "lang", s2, s4, "origin", s5, "device", s8, "android_pkg", "net.daum.android.tistoryapp", "app_ver", context0.getPackageManager().getPackageInfo("net.daum.android.tistoryapp", 0).versionName}, 17));
        Intrinsics.checkExpressionValueIsNotNull(s9, "java.lang.String.format(format, *args)");
        return s9;
    }

    @TargetApi(28)
    @NotNull
    public final String getKeyHash(@NotNull Context context0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        return this.getKeyHashDeprecated(context0);
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    @NotNull
    public final String getKeyHashDeprecated(@NotNull Context context0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Signature[] arr_signature = context0.getPackageManager().getPackageInfo("net.daum.android.tistoryapp", 0x40).signatures;
        if(arr_signature.length <= 0) {
            throw new IllegalStateException();
        }
        Signature signature0 = arr_signature[0];
        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA");
        messageDigest0.update(signature0.toByteArray());
        String s = Base64.encodeToString(messageDigest0.digest(), 2);
        Intrinsics.checkExpressionValueIsNotNull(s, "Base64.encodeToString(md.digest(), Base64.NO_WRAP)");
        return s;
    }

    @Nullable
    public final String getMetadata(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(s, "key");
        ApplicationInfo applicationInfo0 = context0.getPackageManager().getApplicationInfo("net.daum.android.tistoryapp", 0x80);
        Intrinsics.checkExpressionValueIsNotNull(applicationInfo0, "context.packageManager.g…r.GET_META_DATA\n        )");
        return applicationInfo0.metaData.getString(s);
    }

    public final boolean hasAndNotNull(@NotNull JsonObject jsonObject0, @NotNull String s) {
        Intrinsics.checkParameterIsNotNull(jsonObject0, "jsonObject");
        Intrinsics.checkParameterIsNotNull(s, "key");
        return jsonObject0.has(s) && !(jsonObject0.get(s) instanceof JsonNull);
    }

    @NotNull
    public final Map parseQuery(@Nullable String s) {
        if(s == null) {
            return x.emptyMap();
        }
        Iterable iterable0 = StringsKt__StringsKt.split$default(s, new String[]{"&"}, false, 0, 6, null);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(StringsKt__StringsKt.split$default(((String)object0), new String[]{"="}, false, 0, 6, null));
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(((List)object1).size() > 1) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(arrayList1, 10));
        for(Object object2: arrayList1) {
            arrayList2.add(new Pair(((List)object2).get(0), ((List)object2).get(1)));
        }
        Map map0 = new LinkedHashMap();
        for(Object object3: arrayList2) {
            String s1 = URLDecoder.decode(((String)((Pair)object3).getSecond()), "UTF-8");
            Intrinsics.checkExpressionValueIsNotNull(s1, "URLDecoder.decode(pair.second, \"UTF-8\")");
            map0.put(((Pair)object3).getFirst(), s1);
        }
        return map0;
    }
}

