package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.ktx.Firebase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0007\u001A\u00020\b*\u00020\u00032\u0017\u0010\t\u001A\u0013\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001A\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"LIBRARY_NAME", "", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lcom/google/firebase/ktx/Firebase;", "getCrashlytics", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "setCustomKeys", "", "init", "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "Lkotlin/ExtensionFunctionType;", "com.google.firebase-firebase-crashlytics-ktx"}, k = 2, mv = {1, 7, 1}, xi = 0x30)
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-cls-ktx";

    @NotNull
    public static final FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase0) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        FirebaseCrashlytics firebaseCrashlytics0 = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics0, "getInstance()");
        return firebaseCrashlytics0;
    }

    public static final void setCustomKeys(@NotNull FirebaseCrashlytics firebaseCrashlytics0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "init");
        function10.invoke(new KeyValueBuilder(firebaseCrashlytics0));
    }
}

