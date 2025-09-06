package com.google.firebase.messaging.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage.Builder;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001A/\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u00012\u0019\b\u0004\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B¢\u0006\u0002\b\u000EH\u0086\bø\u0001\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001A\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000F"}, d2 = {"LIBRARY_NAME", "", "messaging", "Lcom/google/firebase/messaging/FirebaseMessaging;", "Lcom/google/firebase/ktx/Firebase;", "getMessaging", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/messaging/FirebaseMessaging;", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "to", "init", "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$Builder;", "", "Lkotlin/ExtensionFunctionType;", "com.google.firebase-firebase-messaging-ktx"}, k = 2, mv = {1, 7, 1}, xi = 0x30)
public final class MessagingKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-fcm-ktx";

    @NotNull
    public static final FirebaseMessaging getMessaging(@NotNull Firebase firebase0) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        FirebaseMessaging firebaseMessaging0 = FirebaseMessaging.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseMessaging0, "getInstance()");
        return firebaseMessaging0;
    }

    @NotNull
    public static final RemoteMessage remoteMessage(@NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "to");
        Intrinsics.checkNotNullParameter(function10, "init");
        Builder remoteMessage$Builder0 = new Builder(s);
        function10.invoke(remoteMessage$Builder0);
        RemoteMessage remoteMessage0 = remoteMessage$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(remoteMessage0, "builder.build()");
        return remoteMessage0;
    }
}

