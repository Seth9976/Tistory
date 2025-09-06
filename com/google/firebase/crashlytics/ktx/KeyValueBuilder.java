package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0007\u0010\u000BJ\u001D\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\f¢\u0006\u0004\b\u0007\u0010\rJ\u001D\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u000E¢\u0006\u0004\b\u0007\u0010\u000FJ\u001D\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0011J\u001D\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0012¢\u0006\u0004\b\u0007\u0010\u0013J\u001D\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "", "key", "", "value", "", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;D)V", "", "(Ljava/lang/String;F)V", "", "(Ljava/lang/String;I)V", "", "(Ljava/lang/String;J)V", "(Ljava/lang/String;Ljava/lang/String;)V", "com.google.firebase-firebase-crashlytics-ktx"}, k = 1, mv = {1, 7, 1}, xi = 0x30)
public final class KeyValueBuilder {
    public final FirebaseCrashlytics a;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics firebaseCrashlytics0) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics0, "crashlytics");
        super();
        this.a = firebaseCrashlytics0;
    }

    public final void key(@NotNull String s, double f) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a.setCustomKey(s, f);
    }

    public final void key(@NotNull String s, float f) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a.setCustomKey(s, f);
    }

    public final void key(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a.setCustomKey(s, v);
    }

    public final void key(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a.setCustomKey(s, v);
    }

    public final void key(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "value");
        this.a.setCustomKey(s, s1);
    }

    public final void key(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a.setCustomKey(s, z);
    }
}

