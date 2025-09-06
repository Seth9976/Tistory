package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.navigation.serialization.RouteSerializerKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001:\u0001;B[\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\b\b\u0001\u0010\t\u001A\u00020\u0005\u0012\b\b\u0001\u0010\n\u001A\u00020\u0005\u0012\b\b\u0001\u0010\u000B\u001A\u00020\u0005\u0012\b\b\u0001\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\r\u0010\u000EBS\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\f\u0010\u0013\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0015\u001A\u00020\u0001\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\r\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0005H\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\u0002\u00A2\u0006\u0004\b\u001B\u0010\u001AJ\r\u0010\u001C\u001A\u00020\u0002\u00A2\u0006\u0004\b\u001C\u0010\u001AJ\r\u0010\u001D\u001A\u00020\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001AJ\u001A\u0010\u001F\u001A\u00020\u00022\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b!\u0010\u0018J\u000F\u0010\"\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\"\u0010#R\u001A\u0010\u0006\u001A\u00020\u00058\u0007X\u0087\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0018R\u0017\u0010\t\u001A\u00020\u00058\u0007\u00A2\u0006\f\n\u0004\b\'\u0010%\u001A\u0004\b(\u0010\u0018R\u0017\u0010\n\u001A\u00020\u00058\u0007\u00A2\u0006\f\n\u0004\b)\u0010%\u001A\u0004\b*\u0010\u0018R\u0017\u0010\u000B\u001A\u00020\u00058\u0007\u00A2\u0006\f\n\u0004\b+\u0010%\u001A\u0004\b,\u0010\u0018R\u0017\u0010\f\u001A\u00020\u00058\u0007\u00A2\u0006\f\n\u0004\b-\u0010%\u001A\u0004\b.\u0010\u0018R(\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\u0010/\u001A\u0004\u0018\u00010\u000F8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010#R0\u0010\u0013\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010/\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R(\u0010\u0015\u001A\u0004\u0018\u00010\u00012\b\u0010/\u001A\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\u00A8\u0006<"}, d2 = {"Landroidx/navigation/NavOptions;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "Lkotlin/reflect/KClass;", "popUpToRouteClass", "(ZZLkotlin/reflect/KClass;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "getPopUpTo", "()I", "shouldLaunchSingleTop", "()Z", "shouldRestoreState", "isPopUpToInclusive", "shouldPopUpToSaveState", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "c", "I", "getPopUpToId", "f", "getEnterAnim", "g", "getExitAnim", "h", "getPopEnterAnim", "i", "getPopExitAnim", "<set-?>", "j", "Ljava/lang/String;", "getPopUpToRoute", "k", "Lkotlin/reflect/KClass;", "getPopUpToRouteClass", "()Lkotlin/reflect/KClass;", "l", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "Builder", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NavOptions {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000E\u001A\u00020\u00002\b\b\u0001\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ+\u0010\u000E\u001A\u00020\u00002\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u0012J.\u0010\u000E\u001A\u00020\u0000\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u0004H\u0087\b¢\u0006\u0004\b\u000E\u0010\u0014J-\u0010\u000E\u001A\u00020\u00002\n\u0010\u0016\u001A\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u0017J3\u0010\u000E\u001A\u00020\u0000\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0006\u0010\u0011\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u0018J\u0017\u0010\u001A\u001A\u00020\u00002\b\b\u0001\u0010\u0019\u001A\u00020\n¢\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001D\u001A\u00020\u00002\b\b\u0001\u0010\u001C\u001A\u00020\n¢\u0006\u0004\b\u001D\u0010\u001BJ\u0017\u0010\u001F\u001A\u00020\u00002\b\b\u0001\u0010\u001E\u001A\u00020\n¢\u0006\u0004\b\u001F\u0010\u001BJ\u0017\u0010!\u001A\u00020\u00002\b\b\u0001\u0010 \u001A\u00020\n¢\u0006\u0004\b!\u0010\u001BJ\r\u0010#\u001A\u00020\"¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "<init>", "()V", "", "singleTop", "setLaunchSingleTop", "(Z)Landroidx/navigation/NavOptions$Builder;", "restoreState", "setRestoreState", "", "destinationId", "inclusive", "saveState", "setPopUpTo", "(IZZ)Landroidx/navigation/NavOptions$Builder;", "", "route", "(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;", "T", "(ZZ)Landroidx/navigation/NavOptions$Builder;", "Lkotlin/reflect/KClass;", "klass", "(Lkotlin/reflect/KClass;ZZ)Landroidx/navigation/NavOptions$Builder;", "(Ljava/lang/Object;ZZ)Landroidx/navigation/NavOptions$Builder;", "enterAnim", "setEnterAnim", "(I)Landroidx/navigation/NavOptions$Builder;", "exitAnim", "setExitAnim", "popEnterAnim", "setPopEnterAnim", "popExitAnim", "setPopExitAnim", "Landroidx/navigation/NavOptions;", "build", "()Landroidx/navigation/NavOptions;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nNavOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptions.kt\nandroidx/navigation/NavOptions$Builder\n*L\n1#1,594:1\n430#1,6:595\n*S KotlinDebug\n*F\n+ 1 NavOptions.kt\nandroidx/navigation/NavOptions$Builder\n*L\n-1#1:595,6\n*E\n"})
    public static final class Builder {
        public boolean a;
        public boolean b;
        public int c;
        public String d;
        public KClass e;
        public Object f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public int k;
        public int l;

        public Builder() {
            this.c = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
        }

        @NotNull
        public final NavOptions build() {
            String s = this.d;
            if(s != null) {
                return new NavOptions(this.a, this.b, s, this.g, this.h, this.i, this.j, this.k, this.l);
            }
            KClass kClass0 = this.e;
            if(kClass0 != null) {
                return new NavOptions(this.a, this.b, kClass0, this.g, this.h, this.i, this.j, this.k, this.l);
            }
            Object object0 = this.f;
            if(object0 != null) {
                boolean z = this.a;
                boolean z1 = this.b;
                Intrinsics.checkNotNull(object0);
                return new NavOptions(z, z1, object0, this.g, this.h, this.i, this.j, this.k, this.l);
            }
            return new NavOptions(this.a, this.b, this.c, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @NotNull
        public final Builder setEnterAnim(@AnimRes @AnimatorRes int v) {
            this.i = v;
            return this;
        }

        @NotNull
        public final Builder setExitAnim(@AnimRes @AnimatorRes int v) {
            this.j = v;
            return this;
        }

        @NotNull
        public final Builder setLaunchSingleTop(boolean z) {
            this.a = z;
            return this;
        }

        @NotNull
        public final Builder setPopEnterAnim(@AnimRes @AnimatorRes int v) {
            this.k = v;
            return this;
        }

        @NotNull
        public final Builder setPopExitAnim(@AnimRes @AnimatorRes int v) {
            this.l = v;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@IdRes int v, boolean z) {
            return Builder.setPopUpTo$default(this, v, z, false, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@IdRes int v, boolean z, boolean z1) {
            this.c = v;
            this.d = null;
            this.g = z;
            this.h = z1;
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@NotNull Object object0, boolean z) {
            Intrinsics.checkNotNullParameter(object0, "route");
            return Builder.setPopUpTo$default(this, object0, z, false, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@NotNull Object object0, boolean z, boolean z1) {
            Intrinsics.checkNotNullParameter(object0, "route");
            this.f = object0;
            this.setPopUpTo(RouteSerializerKt.generateHashCode(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(object0.getClass()))), z, z1);
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@Nullable String s, boolean z) {
            return Builder.setPopUpTo$default(this, s, z, false, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder setPopUpTo(@Nullable String s, boolean z, boolean z1) {
            this.d = s;
            this.c = -1;
            this.g = z;
            this.h = z1;
            return this;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @NotNull
        public final Builder setPopUpTo(@NotNull KClass kClass0, boolean z, boolean z1) {
            Intrinsics.checkNotNullParameter(kClass0, "klass");
            this.e = kClass0;
            this.c = -1;
            this.g = z;
            this.h = z1;
            return this;
        }

        @JvmOverloads
        public final Builder setPopUpTo(boolean z) {
            Intrinsics.reifiedOperationMarker(4, "T");
            this.setPopUpTo(Reflection.getOrCreateKotlinClass(Object.class), z, false);
            return this;
        }

        @JvmOverloads
        public final Builder setPopUpTo(boolean z, boolean z1) {
            Intrinsics.reifiedOperationMarker(4, "T");
            this.setPopUpTo(Reflection.getOrCreateKotlinClass(Object.class), z, z1);
            return this;
        }

        public static Builder setPopUpTo$default(Builder navOptions$Builder0, int v, boolean z, boolean z1, int v1, Object object0) {
            if((v1 & 4) != 0) {
                z1 = false;
            }
            return navOptions$Builder0.setPopUpTo(v, z, z1);
        }

        public static Builder setPopUpTo$default(Builder navOptions$Builder0, Object object0, boolean z, boolean z1, int v, Object object1) {
            if((v & 4) != 0) {
                z1 = false;
            }
            return navOptions$Builder0.setPopUpTo(object0, z, z1);
        }

        public static Builder setPopUpTo$default(Builder navOptions$Builder0, String s, boolean z, boolean z1, int v, Object object0) {
            if((v & 4) != 0) {
                z1 = false;
            }
            return navOptions$Builder0.setPopUpTo(s, z, z1);
        }

        public static Builder setPopUpTo$default(Builder navOptions$Builder0, KClass kClass0, boolean z, boolean z1, int v, Object object0) {
            if((v & 4) != 0) {
                z1 = false;
            }
            return navOptions$Builder0.setPopUpTo(kClass0, z, z1);
        }

        public static Builder setPopUpTo$default(Builder navOptions$Builder0, boolean z, boolean z1, int v, Object object0) {
            if((v & 2) != 0) {
                z1 = false;
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            navOptions$Builder0.setPopUpTo(Reflection.getOrCreateKotlinClass(Object.class), z, z1);
            return navOptions$Builder0;
        }

        @NotNull
        public final Builder setRestoreState(boolean z) {
            this.b = z;
            return this;
        }
    }

    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final KClass k;
    public final Object l;

    public NavOptions(boolean z, boolean z1, @IdRes int v, boolean z2, boolean z3, @AnimRes @AnimatorRes int v1, @AnimRes @AnimatorRes int v2, @AnimRes @AnimatorRes int v3, @AnimRes @AnimatorRes int v4) {
        this.a = z;
        this.b = z1;
        this.c = v;
        this.d = z2;
        this.e = z3;
        this.f = v1;
        this.g = v2;
        this.h = v3;
        this.i = v4;
    }

    public NavOptions(boolean z, boolean z1, @NotNull Object object0, boolean z2, boolean z3, int v, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(object0, "popUpToRouteObject");
        this(z, z1, RouteSerializerKt.generateHashCode(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(object0.getClass()))), z2, z3, v, v1, v2, v3);
        this.l = object0;
    }

    public NavOptions(boolean z, boolean z1, @Nullable String s, boolean z2, boolean z3, int v, int v1, int v2, int v3) {
        this(z, z1, NavDestination.Companion.createRoute(s).hashCode(), z2, z3, v, v1, v2, v3);
        this.j = s;
    }

    public NavOptions(boolean z, boolean z1, @Nullable KClass kClass0, boolean z2, boolean z3, int v, int v1, int v2, int v3) {
        Intrinsics.checkNotNull(kClass0);
        this(z, z1, RouteSerializerKt.generateHashCode(SerializersKt.serializer(kClass0)), z2, z3, v, v1, v2, v3);
        this.k = kClass0;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && object0 instanceof NavOptions && (this.a == ((NavOptions)object0).a && this.b == ((NavOptions)object0).b && this.c == ((NavOptions)object0).c && Intrinsics.areEqual(this.j, ((NavOptions)object0).j) && Intrinsics.areEqual(this.k, ((NavOptions)object0).k) && Intrinsics.areEqual(this.l, ((NavOptions)object0).l) && this.d == ((NavOptions)object0).d && this.e == ((NavOptions)object0).e && this.f == ((NavOptions)object0).f && this.g == ((NavOptions)object0).g && this.h == ((NavOptions)object0).h && this.i == ((NavOptions)object0).i);
    }

    @AnimRes
    @AnimatorRes
    public final int getEnterAnim() {
        return this.f;
    }

    @AnimRes
    @AnimatorRes
    public final int getExitAnim() {
        return this.g;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopEnterAnim() {
        return this.h;
    }

    @AnimRes
    @AnimatorRes
    public final int getPopExitAnim() {
        return this.i;
    }

    @IdRes
    @Deprecated(message = "Use popUpToId instead.", replaceWith = @ReplaceWith(expression = "popUpToId", imports = {}))
    public final int getPopUpTo() {
        return this.c;
    }

    @IdRes
    public final int getPopUpToId() {
        return this.c;
    }

    @Nullable
    public final String getPopUpToRoute() {
        return this.j;
    }

    @Nullable
    public final KClass getPopUpToRouteClass() {
        return this.k;
    }

    @Nullable
    public final Object getPopUpToRouteObject() {
        return this.l;
    }

    @Override
    public int hashCode() {
        int v = ((this.shouldRestoreState() + this.shouldLaunchSingleTop() * 0x1F) * 0x1F + this.c) * 0x1F;
        int v1 = 0;
        int v2 = this.j == null ? 0 : this.j.hashCode();
        int v3 = this.k == null ? 0 : this.k.hashCode();
        Object object0 = this.l;
        if(object0 != null) {
            v1 = object0.hashCode();
        }
        return ((((this.shouldPopUpToSaveState() + (this.isPopUpToInclusive() + (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F) * 0x1F) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i;
    }

    public final boolean isPopUpToInclusive() {
        return this.d;
    }

    public final boolean shouldLaunchSingleTop() {
        return this.a;
    }

    public final boolean shouldPopUpToSaveState() {
        return this.e;
    }

    public final boolean shouldRestoreState() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NavOptions(");
        if(this.a) {
            stringBuilder0.append("launchSingleTop ");
        }
        if(this.b) {
            stringBuilder0.append("restoreState ");
        }
        int v = this.c;
        String s = this.j;
        if((s != null || v != -1) && s != null) {
            stringBuilder0.append("popUpTo(");
            if(s == null) {
                KClass kClass0 = this.k;
                if(kClass0 == null) {
                    Object object0 = this.l;
                    if(object0 == null) {
                        stringBuilder0.append("0x");
                        stringBuilder0.append(Integer.toHexString(v));
                    }
                    else {
                        stringBuilder0.append(object0);
                    }
                }
                else {
                    stringBuilder0.append(kClass0);
                }
            }
            else {
                stringBuilder0.append(s);
            }
            if(this.d) {
                stringBuilder0.append(" inclusive");
            }
            if(this.e) {
                stringBuilder0.append(" saveState");
            }
            stringBuilder0.append(")");
        }
        int v1 = this.i;
        int v2 = this.h;
        int v3 = this.g;
        int v4 = this.f;
        if(v4 != -1 || v3 != -1 || v2 != -1 || v1 != -1) {
            stringBuilder0.append("anim(enterAnim=0x");
            stringBuilder0.append(Integer.toHexString(v4));
            stringBuilder0.append(" exitAnim=0x");
            stringBuilder0.append(Integer.toHexString(v3));
            stringBuilder0.append(" popEnterAnim=0x");
            stringBuilder0.append(Integer.toHexString(v2));
            stringBuilder0.append(" popExitAnim=0x");
            stringBuilder0.append(Integer.toHexString(v1));
            stringBuilder0.append(")");
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "sb.toString()");
        return s1;
    }
}

