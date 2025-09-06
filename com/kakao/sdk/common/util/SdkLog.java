package com.kakao.sdk.common.util;

import a5.b;
import com.kakao.sdk.common.KakaoSdk;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.k;
import md.c;
import org.jetbrains.annotations.NotNull;
import vb.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/kakao/sdk/common/util/SdkLog;", "", "", "enabled", "<init>", "(Z)V", "Companion", "common_release"}, k = 1, mv = {1, 4, 0})
public final class SdkLog {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0001¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0001¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0001¢\u0006\u0004\b\u000B\u0010\bJ\u0015\u0010\f\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0001¢\u0006\u0004\b\f\u0010\bR!\u0010\u0014\u001A\u00020\r8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u0012\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001A\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/sdk/common/util/SdkLog$Companion;", "", "", "log", "()Ljava/lang/String;", "logged", "", "v", "(Ljava/lang/Object;)V", "d", "i", "w", "e", "Lcom/kakao/sdk/common/util/SdkLog;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/common/util/SdkLog;", "instance$annotations", "()V", "instance", "", "MAX_SIZE", "I", "common_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/common/util/SdkLog;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final void d(@NotNull Object object0) {
            Intrinsics.checkParameterIsNotNull(object0, "logged");
            SdkLog.access$log(this.getInstance(), object0, SdkLogLevel.D);
        }

        public final void e(@NotNull Object object0) {
            Intrinsics.checkParameterIsNotNull(object0, "logged");
            SdkLog.access$log(this.getInstance(), object0, SdkLogLevel.E);
        }

        @NotNull
        public final SdkLog getInstance() {
            Lazy lazy0 = SdkLog.e;
            KProperty kProperty0 = Companion.a[0];
            return (SdkLog)lazy0.getValue();
        }

        public final void i(@NotNull Object object0) {
            Intrinsics.checkParameterIsNotNull(object0, "logged");
            SdkLog.access$log(this.getInstance(), object0, SdkLogLevel.I);
        }

        @JvmStatic
        public static void instance$annotations() {
        }

        @JvmStatic
        @NotNull
        public final String log() {
            StringBuilder stringBuilder0 = b.t(k.trimIndent(("\n                ==== sdk version: 2.0.5\n                ==== app version: " + KakaoSdk.INSTANCE.getApplicationContextInfo().getAppVer() + "\n            ")));
            stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(this.getInstance().a(), "\n", "\n", null, 0, null, null, 60, null));
            return stringBuilder0.toString();
        }

        public final void v(@NotNull Object object0) {
            Intrinsics.checkParameterIsNotNull(object0, "logged");
            SdkLog.access$log(this.getInstance(), object0, SdkLogLevel.V);
        }

        public final void w(@NotNull Object object0) {
            Intrinsics.checkParameterIsNotNull(object0, "logged");
            SdkLog.access$log(this.getInstance(), object0, SdkLogLevel.W);
        }
    }

    public static final Companion Companion = null;
    public static final int MAX_SIZE = 100;
    public final Lazy a;
    public final Lazy b;
    public final boolean c;
    public static final KProperty[] d;
    public static final Lazy e;

    static {
        SdkLog.d = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SdkLog.class), "logs", "getLogs()Ljava/util/LinkedList;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SdkLog.class), "dateFormat", "getDateFormat()Ljava/text/SimpleDateFormat;"))};
        SdkLog.Companion = new Companion(null);
        SdkLog.e = c.lazy(a.y);
    }

    public SdkLog() {
        this(false, 1, null);
    }

    public SdkLog(boolean z) {
        this.c = z;
        this.a = c.lazy(a.A);
        this.b = c.lazy(a.z);
    }

    public SdkLog(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    public final LinkedList a() {
        KProperty kProperty0 = SdkLog.d[0];
        return (LinkedList)this.a.getValue();
    }

    public static final void access$log(SdkLog sdkLog0, Object object0, SdkLogLevel sdkLogLevel0) {
        sdkLog0.getClass();
        String s = sdkLogLevel0.getSymbol() + ' ' + object0;
        if(sdkLog0.c && sdkLogLevel0.compareTo(SdkLogLevel.I) >= 0) {
            LinkedList linkedList0 = sdkLog0.a();
            KProperty kProperty0 = SdkLog.d[1];
            linkedList0.add(((SimpleDateFormat)sdkLog0.b.getValue()).format(new Date()) + ' ' + s);
            if(sdkLog0.a().size() > 100) {
                sdkLog0.a().poll();
            }
        }
    }

    @NotNull
    public static final SdkLog getInstance() {
        return SdkLog.Companion.getInstance();
    }

    @JvmStatic
    @NotNull
    public static final String log() {
        return SdkLog.Companion.log();
    }
}

