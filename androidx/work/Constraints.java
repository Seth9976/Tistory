package androidx.work;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.Ignore;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0014\u0018\u0000 -2\u00020\u0001:\u0003.-/B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\n\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\u000BB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\n\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u0012\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F\u00A2\u0006\u0004\b\b\u0010\u0012B\u0011\b\u0017\u0012\u0006\u0010\u0013\u001A\u00020\u0000\u00A2\u0006\u0004\b\b\u0010\u0014J\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0015J\u000F\u0010\n\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\n\u0010\u0015J\r\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0015J\r\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0015J\u001A\u0010\u0017\u001A\u00020\u00042\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001H\u0097\u0002\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0017\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u001CH\u0017\u00A2\u0006\u0004\b\u001D\u0010\u001ER\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u001A\u0010\r\u001A\u00020\f8GX\u0087\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u001A\u0010\u000E\u001A\u00020\f8GX\u0087\u0004\u00A2\u0006\f\n\u0004\b\'\u0010$\u001A\u0004\b(\u0010&R \u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F8GX\u0087\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,\u00A8\u00060"}, d2 = {"Landroidx/work/Constraints;", "", "Landroidx/work/NetworkType;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Landroidx/work/NetworkType;ZZZ)V", "requiresDeviceIdle", "(Landroidx/work/NetworkType;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Landroidx/work/Constraints$ContentUriTrigger;", "contentUriTriggers", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "other", "(Landroidx/work/Constraints;)V", "()Z", "hasContentUriTriggers", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/work/NetworkType;", "getRequiredNetworkType", "()Landroidx/work/NetworkType;", "f", "J", "getContentTriggerUpdateDelayMillis", "()J", "g", "getContentTriggerMaxDelayMillis", "h", "Ljava/util/Set;", "getContentUriTriggers", "()Ljava/util/Set;", "Companion", "Builder", "ContentUriTrigger", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Constraints {
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0007¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0007¢\u0006\u0004\b\u0014\u0010\nJ\u001F\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001E\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001CH\u0007¢\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010\u001E\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020 H\u0007¢\u0006\u0004\b\u001E\u0010!J\u001F\u0010\"\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001CH\u0007¢\u0006\u0004\b\"\u0010\u001FJ\u0017\u0010\"\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020 H\u0007¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001A\u00020\u0004¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/work/Constraints$Builder;", "", "<init>", "()V", "Landroidx/work/Constraints;", "constraints", "(Landroidx/work/Constraints;)V", "", "requiresCharging", "setRequiresCharging", "(Z)Landroidx/work/Constraints$Builder;", "requiresDeviceIdle", "setRequiresDeviceIdle", "Landroidx/work/NetworkType;", "networkType", "setRequiredNetworkType", "(Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;", "requiresBatteryNotLow", "setRequiresBatteryNotLow", "requiresStorageNotLow", "setRequiresStorageNotLow", "Landroid/net/Uri;", "uri", "triggerForDescendants", "addContentUriTrigger", "(Landroid/net/Uri;Z)Landroidx/work/Constraints$Builder;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setTriggerContentUpdateDelay", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/Constraints$Builder;", "Ljava/time/Duration;", "(Ljava/time/Duration;)Landroidx/work/Constraints$Builder;", "setTriggerContentMaxDelay", "build", "()Landroidx/work/Constraints;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public boolean a;
        public boolean b;
        public NetworkType c;
        public boolean d;
        public boolean e;
        public long f;
        public long g;
        public final Set h;

        public Builder() {
            this.c = NetworkType.NOT_REQUIRED;
            this.f = -1L;
            this.g = -1L;
            this.h = new LinkedHashSet();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public Builder(@NotNull Constraints constraints0) {
            Intrinsics.checkNotNullParameter(constraints0, "constraints");
            super();
            this.c = NetworkType.NOT_REQUIRED;
            this.f = -1L;
            this.g = -1L;
            this.h = new LinkedHashSet();
            this.a = constraints0.requiresCharging();
            this.b = constraints0.requiresDeviceIdle();
            this.c = constraints0.getRequiredNetworkType();
            this.d = constraints0.requiresBatteryNotLow();
            this.e = constraints0.requiresStorageNotLow();
            this.f = constraints0.getContentTriggerUpdateDelayMillis();
            this.g = constraints0.getContentTriggerMaxDelayMillis();
            this.h = CollectionsKt___CollectionsKt.toMutableSet(constraints0.getContentUriTriggers());
        }

        @RequiresApi(24)
        @NotNull
        public final Builder addContentUriTrigger(@NotNull Uri uri0, boolean z) {
            Intrinsics.checkNotNullParameter(uri0, "uri");
            ContentUriTrigger constraints$ContentUriTrigger0 = new ContentUriTrigger(uri0, z);
            this.h.add(constraints$ContentUriTrigger0);
            return this;
        }

        @NotNull
        public final Constraints build() {
            Set set0 = CollectionsKt___CollectionsKt.toSet(this.h);
            return new Constraints(this.c, this.a, this.b, this.d, this.e, this.f, this.g, set0);
        }

        @NotNull
        public final Builder setRequiredNetworkType(@NotNull NetworkType networkType0) {
            Intrinsics.checkNotNullParameter(networkType0, "networkType");
            this.c = networkType0;
            return this;
        }

        @NotNull
        public final Builder setRequiresBatteryNotLow(boolean z) {
            this.d = z;
            return this;
        }

        @NotNull
        public final Builder setRequiresCharging(boolean z) {
            this.a = z;
            return this;
        }

        @RequiresApi(23)
        @NotNull
        public final Builder setRequiresDeviceIdle(boolean z) {
            this.b = z;
            return this;
        }

        @NotNull
        public final Builder setRequiresStorageNotLow(boolean z) {
            this.e = z;
            return this;
        }

        @RequiresApi(24)
        @NotNull
        public final Builder setTriggerContentMaxDelay(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            this.g = timeUnit0.toMillis(v);
            return this;
        }

        @RequiresApi(26)
        @NotNull
        public final Builder setTriggerContentMaxDelay(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            this.g = DurationApi26Impl.toMillisCompat(duration0);
            return this;
        }

        @RequiresApi(24)
        @NotNull
        public final Builder setTriggerContentUpdateDelay(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            this.f = timeUnit0.toMillis(v);
            return this;
        }

        @RequiresApi(26)
        @NotNull
        public final Builder setTriggerContentUpdateDelay(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            this.f = DurationApi26Impl.toMillisCompat(duration0);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/Constraints$Companion;", "", "Landroidx/work/Constraints;", "NONE", "Landroidx/work/Constraints;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\t\u001A\u00020\u00042\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/work/Constraints$ContentUriTrigger;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "b", "Z", "()Z", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ContentUriTrigger {
        public final Uri a;
        public final boolean b;

        public ContentUriTrigger(@NotNull Uri uri0, boolean z) {
            Intrinsics.checkNotNullParameter(uri0, "uri");
            super();
            this.a = uri0;
            this.b = z;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            Class class0 = object0 == null ? null : object0.getClass();
            if(!Intrinsics.areEqual(ContentUriTrigger.class, class0)) {
                return false;
            }
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            return Intrinsics.areEqual(this.a, ((ContentUriTrigger)object0).a) ? this.b == ((ContentUriTrigger)object0).b : false;
        }

        @NotNull
        public final Uri getUri() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        public final boolean isTriggeredForDescendants() {
            return this.b;
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final Constraints NONE;
    public final NetworkType a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    static {
        Constraints.Companion = new Companion(null);
        Constraints.NONE = new Constraints(null, false, false, false, 15, null);
    }

    @SuppressLint({"NewApi"})
    public Constraints(@NotNull Constraints constraints0) {
        Intrinsics.checkNotNullParameter(constraints0, "other");
        super();
        this.b = constraints0.b;
        this.c = constraints0.c;
        this.a = constraints0.a;
        this.d = constraints0.d;
        this.e = constraints0.e;
        this.h = constraints0.h;
        this.f = constraints0.f;
        this.g = constraints0.g;
    }

    @SuppressLint({"NewApi"})
    @Ignore
    public Constraints(@NotNull NetworkType networkType0, boolean z, boolean z1, boolean z2) {
        Intrinsics.checkNotNullParameter(networkType0, "requiredNetworkType");
        this(networkType0, z, false, z1, z2);
    }

    public Constraints(NetworkType networkType0, boolean z, boolean z1, boolean z2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            networkType0 = NetworkType.NOT_REQUIRED;
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        if((v & 8) != 0) {
            z2 = false;
        }
        this(networkType0, z, z1, z2);
    }

    @SuppressLint({"NewApi"})
    @RequiresApi(23)
    @Ignore
    public Constraints(@NotNull NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(networkType0, "requiredNetworkType");
        this(networkType0, z, z1, z2, z3, -1L, 0L, null, 0xC0, null);
    }

    public Constraints(NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            networkType0 = NetworkType.NOT_REQUIRED;
        }
        this(networkType0, ((v & 2) == 0 ? z : false), ((v & 4) == 0 ? z1 : false), ((v & 8) == 0 ? z2 : false), ((v & 16) == 0 ? z3 : false));
    }

    @RequiresApi(24)
    public Constraints(@NotNull NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3, long v, long v1, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(networkType0, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(set0, "contentUriTriggers");
        super();
        this.a = networkType0;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = z3;
        this.f = v;
        this.g = v1;
        this.h = set0;
    }

    public Constraints(NetworkType networkType0, boolean z, boolean z1, boolean z2, boolean z3, long v, long v1, Set set0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v2 & 1) == 0 ? networkType0 : NetworkType.NOT_REQUIRED), ((v2 & 2) == 0 ? z : false), ((v2 & 4) == 0 ? z1 : false), ((v2 & 8) == 0 ? z2 : false), ((v2 & 16) == 0 ? z3 : false), ((v2 & 0x20) == 0 ? v : -1L), ((v2 & 0x40) == 0 ? v1 : -1L), ((v2 & 0x80) == 0 ? set0 : f0.emptySet()));
    }

    @Override
    @SuppressLint({"NewApi"})
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!Intrinsics.areEqual(Constraints.class, class0) || this.b != ((Constraints)object0).b) {
                return false;
            }
            if(this.c != ((Constraints)object0).c) {
                return false;
            }
            if(this.d != ((Constraints)object0).d) {
                return false;
            }
            if(this.e != ((Constraints)object0).e) {
                return false;
            }
            if(this.f != ((Constraints)object0).f) {
                return false;
            }
            if(this.g != ((Constraints)object0).g) {
                return false;
            }
            return this.a == ((Constraints)object0).a ? Intrinsics.areEqual(this.h, ((Constraints)object0).h) : false;
        }
        return false;
    }

    @RequiresApi(24)
    public final long getContentTriggerMaxDelayMillis() {
        return this.g;
    }

    @RequiresApi(24)
    public final long getContentTriggerUpdateDelayMillis() {
        return this.f;
    }

    @RequiresApi(24)
    @NotNull
    public final Set getContentUriTriggers() {
        return this.h;
    }

    @NotNull
    public final NetworkType getRequiredNetworkType() {
        return this.a;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean hasContentUriTriggers() {
        return !this.h.isEmpty();
    }

    @Override
    @SuppressLint({"NewApi"})
    public int hashCode() {
        return this.h.hashCode() + ((((((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + ((int)(this.f ^ this.f >>> 0x20))) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F;
    }

    public final boolean requiresBatteryNotLow() {
        return this.d;
    }

    public final boolean requiresCharging() {
        return this.b;
    }

    @RequiresApi(23)
    public final boolean requiresDeviceIdle() {
        return this.c;
    }

    public final boolean requiresStorageNotLow() {
        return this.e;
    }

    @Override
    @SuppressLint({"NewApi"})
    @NotNull
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.b + ", requiresDeviceIdle=" + this.c + ", requiresBatteryNotLow=" + this.d + ", requiresStorageNotLow=" + this.e + ", contentTriggerUpdateDelayMillis=" + this.f + ", contentTriggerMaxDelayMillis=" + this.g + ", contentUriTriggers=" + this.h + ", }";
    }
}

