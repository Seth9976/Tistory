package com.kakao.tistory.module;

import ac.a;
import ac.c;
import ac.d;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.entity.AdInfo;
import com.kakao.tistory.domain.entity.BuildType;
import com.kakao.tistory.domain.home.entity.HomeSlot;
import com.kakao.tistory.domain.repository.ADIDRepository;
import com.kakao.tistory.domain.repository.AccountRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.TimeUnit;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Qualifier;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory;

@Module
@InstallIn({SingletonComponent.class})
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\nH\u0007J\u0018\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0007J*\u0010\u0010\u001A\u00020\u00112\u0010\b\u0001\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00132\u000E\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0013H\u0007J\b\u0010\u0015\u001A\u00020\u0016H\u0007J\u0018\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u001A\u001A\u00020\u0016H\u0007J\u001A\u0010\u001B\u001A\u00020\u001C2\b\b\u0001\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\u0018H\u0007J\u001A\u0010\u001F\u001A\u00020\u001C2\b\b\u0001\u0010\u001D\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\u0018H\u0007¨\u0006\""}, d2 = {"Lcom/kakao/tistory/module/RetrofitModule;", "", "()V", "provideAccessToken", "", "accountRepository", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "provideAdInfo", "Lcom/kakao/tistory/domain/entity/AdInfo;", "adidRepository", "Lcom/kakao/tistory/domain/repository/ADIDRepository;", "provideBaseUrl", "deviceInfoPreference", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "buildType", "Lcom/kakao/tistory/domain/entity/BuildType;", "provideHeaderInterceptor", "Lokhttp3/Interceptor;", "accessToken", "Ljavax/inject/Provider;", "adInfo", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "headerInterceptor", "loggingInterceptor", "provideRetrofit", "Lretrofit2/Retrofit;", "baseUrl", "okHttpClient", "provideSerializationRetrofit", "Companion", "SerializationRetrofit", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRetrofitModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetrofitModule.kt\ncom/kakao/tistory/module/RetrofitModule\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,178:1\n31#2,3:179\n*S KotlinDebug\n*F\n+ 1 RetrofitModule.kt\ncom/kakao/tistory/module/RetrofitModule\n*L\n56#1:179,3\n*E\n"})
public final class RetrofitModule {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000BR\u0014\u0010\r\u001A\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u000ER\u0014\u0010\u0010\u001A\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000ER\u0014\u0010\u0011\u001A\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000ER\u0014\u0010\u0013\u001A\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000ER\u0014\u0010\u0014\u001A\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000ER\u0014\u0010\u0015\u001A\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000ER\u0014\u0010\u0016\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000BR\u0014\u0010\u0017\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000BR\u0014\u0010\u0019\u001A\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/module/RetrofitModule$Companion;", "", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "getJson$annotations", "()V", "", "CONNECTION_TIMEOUT", "J", "", "HEADER_ACCEPT_LANGUAGE", "Ljava/lang/String;", "HEADER_TISTORY_ADID", "HEADER_TISTORY_ADID_ENABLED", "HEADER_TISTORY_APP_KEY", "HEADER_TISTORY_TOKEN", "HEADER_TISTORY_TZOFFSET", "HEADER_TISTORY_VERSION", "HEADER_USER_AGENT", "READ_TIMEOUT", "WRITE_TIMEOUT", "Lkotlinx/serialization/modules/SerializersModule;", "defaultSerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Json getJson() {
            return RetrofitModule.b;
        }

        public static void getJson$annotations() {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Qualifier
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/module/RetrofitModule$SerializationRetrofit;", "", "tistory-3.0.8(3080)_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public @interface SerializationRetrofit {
    }

    @NotNull
    public static final Companion Companion;
    public static final SerializersModule a;
    public static final Json b;

    static {
        RetrofitModule.Companion = new Companion(null);
        SerializersModuleBuilder serializersModuleBuilder0 = new SerializersModuleBuilder();
        serializersModuleBuilder0.polymorphicDefaultDeserializer(Reflection.getOrCreateKotlinClass(HomeSlot.class), d.w);
        RetrofitModule.a = serializersModuleBuilder0.build();
        RetrofitModule.b = JsonKt.Json$default(null, a.z, 1, null);
    }

    public static final SerializersModule access$getDefaultSerializersModule$cp() {
        return RetrofitModule.a;
    }

    @Provides
    @Named("AccessToken")
    @Nullable
    public final String provideAccessToken(@NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        return accountRepository0.getAccessToken();
    }

    @Provides
    @Nullable
    public final AdInfo provideAdInfo(@NotNull ADIDRepository aDIDRepository0) {
        Intrinsics.checkNotNullParameter(aDIDRepository0, "adidRepository");
        return aDIDRepository0.getAdInfo();
    }

    @Provides
    @Named("BaseUrl")
    @NotNull
    public final String provideBaseUrl(@NotNull DeviceInfoPreference deviceInfoPreference0, @NotNull BuildType buildType0) {
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        Intrinsics.checkNotNullParameter(buildType0, "buildType");
        if(buildType0.isDevelop()) {
            String s = deviceInfoPreference0.getDeveloperServerHost();
            return s == null ? "https://api.tistory.com" : s;
        }
        return "https://api.tistory.com";
    }

    @Provides
    @Singleton
    @NotNull
    public final Interceptor provideHeaderInterceptor(@Named("AccessToken") @NotNull Provider provider0, @NotNull Provider provider1) {
        Intrinsics.checkNotNullParameter(provider0, "accessToken");
        Intrinsics.checkNotNullParameter(provider1, "adInfo");
        return new c(provider0, provider1);
    }

    @Provides
    @Singleton
    @NotNull
    public final HttpLoggingInterceptor provideLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor0 = new HttpLoggingInterceptor(null, 1, null);
        httpLoggingInterceptor0.level(Level.NONE);
        return httpLoggingInterceptor0;
    }

    @Provides
    @Singleton
    @NotNull
    public final OkHttpClient provideOkHttpClient(@NotNull Interceptor interceptor0, @NotNull HttpLoggingInterceptor httpLoggingInterceptor0) {
        Intrinsics.checkNotNullParameter(interceptor0, "headerInterceptor");
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor0, "loggingInterceptor");
        Builder okHttpClient$Builder0 = new Builder();
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        return okHttpClient$Builder0.connectTimeout(10L, timeUnit0).readTimeout(30L, timeUnit0).writeTimeout(30L, timeUnit0).addNetworkInterceptor(httpLoggingInterceptor0).addInterceptor(interceptor0).build();
    }

    @Provides
    @Singleton
    @NotNull
    public final Retrofit provideRetrofit(@Named("BaseUrl") @NotNull String s, @NotNull OkHttpClient okHttpClient0) {
        Intrinsics.checkNotNullParameter(s, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient0, "okHttpClient");
        Retrofit retrofit0 = new retrofit2.Retrofit.Builder().baseUrl(s).client(okHttpClient0).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(retrofit0, "build(...)");
        return retrofit0;
    }

    @SerializationRetrofit
    @Provides
    @Singleton
    @NotNull
    public final Retrofit provideSerializationRetrofit(@Named("BaseUrl") @NotNull String s, @NotNull OkHttpClient okHttpClient0) {
        Intrinsics.checkNotNullParameter(s, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient0, "okHttpClient");
        MediaType mediaType0 = MediaType.Companion.get("application/json");
        Retrofit retrofit0 = new retrofit2.Retrofit.Builder().baseUrl(s).client(okHttpClient0).addConverterFactory(KotlinSerializationConverterFactory.create(RetrofitModule.b, mediaType0)).build();
        Intrinsics.checkNotNullExpressionValue(retrofit0, "build(...)");
        return retrofit0;
    }
}

