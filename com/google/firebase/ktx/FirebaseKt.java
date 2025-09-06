package com.google.firebase.ktx;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0001\u001A\u0014\u0010\f\u001A\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\r\u001A\u00020\u000E\u001A\u001A\u0010\f\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\b\u001A\"\u0010\f\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u0001\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001A\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0007\u001A\u00020\b*\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006\u000F"}, d2 = {"LIBRARY_NAME", "", "app", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/ktx/Firebase;", "getApp", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseApp;", "options", "Lcom/google/firebase/FirebaseOptions;", "getOptions", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseOptions;", "name", "initialize", "context", "Landroid/content/Context;", "com.google.firebase-firebase-common-ktx"}, k = 2, mv = {1, 7, 1}, xi = 0x30)
public final class FirebaseKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-core-ktx";

    @NotNull
    public static final FirebaseApp app(@NotNull Firebase firebase0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        FirebaseApp firebaseApp0 = FirebaseApp.getInstance(s);
        Intrinsics.checkNotNullExpressionValue(firebaseApp0, "getInstance(name)");
        return firebaseApp0;
    }

    @NotNull
    public static final FirebaseApp getApp(@NotNull Firebase firebase0) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        FirebaseApp firebaseApp0 = FirebaseApp.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseApp0, "getInstance()");
        return firebaseApp0;
    }

    @NotNull
    public static final FirebaseOptions getOptions(@NotNull Firebase firebase0) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        FirebaseOptions firebaseOptions0 = FirebaseKt.getApp(Firebase.INSTANCE).getOptions();
        Intrinsics.checkNotNullExpressionValue(firebaseOptions0, "Firebase.app.options");
        return firebaseOptions0;
    }

    @Nullable
    public static final FirebaseApp initialize(@NotNull Firebase firebase0, @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        return FirebaseApp.initializeApp(context0);
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase0, @NotNull Context context0, @NotNull FirebaseOptions firebaseOptions0) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(firebaseOptions0, "options");
        FirebaseApp firebaseApp0 = FirebaseApp.initializeApp(context0, firebaseOptions0);
        Intrinsics.checkNotNullExpressionValue(firebaseApp0, "initializeApp(context, options)");
        return firebaseApp0;
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase0, @NotNull Context context0, @NotNull FirebaseOptions firebaseOptions0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(firebaseOptions0, "options");
        Intrinsics.checkNotNullParameter(s, "name");
        FirebaseApp firebaseApp0 = FirebaseApp.initializeApp(context0, firebaseOptions0, s);
        Intrinsics.checkNotNullExpressionValue(firebaseApp0, "initializeApp(context, options, name)");
        return firebaseApp0;
    }
}

