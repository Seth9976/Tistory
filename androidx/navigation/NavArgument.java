package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001,B;\b\u0000\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0012\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0017\u001A\u00020\u00042\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u001F\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\u0005\u0010\"R\u0017\u0010$\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001A\u0004\b$\u0010\"R\u001A\u0010\'\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010!\u001A\u0004\b&\u0010\"R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/navigation/NavArgument;", "", "Landroidx/navigation/NavType;", "type", "", "isNullable", "defaultValue", "defaultValuePresent", "unknownDefaultValuePresent", "<init>", "(Landroidx/navigation/NavType;ZLjava/lang/Object;ZZ)V", "", "name", "Landroid/os/Bundle;", "bundle", "", "putDefaultValue", "(Ljava/lang/String;Landroid/os/Bundle;)V", "verify", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/navigation/NavType;", "getType", "()Landroidx/navigation/NavType;", "b", "Z", "()Z", "c", "isDefaultValuePresent", "d", "isDefaultValueUnknown$navigation_common_release", "isDefaultValueUnknown", "e", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "Builder", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NavArgument {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001A\u00020\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000E\u001A\u00020\u00002\b\u0010\r\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/navigation/NavArgument$Builder;", "", "<init>", "()V", "T", "Landroidx/navigation/NavType;", "type", "setType", "(Landroidx/navigation/NavType;)Landroidx/navigation/NavArgument$Builder;", "", "isNullable", "setIsNullable", "(Z)Landroidx/navigation/NavArgument$Builder;", "defaultValue", "setDefaultValue", "(Ljava/lang/Object;)Landroidx/navigation/NavArgument$Builder;", "unknownDefaultValuePresent", "setUnknownDefaultValuePresent$navigation_common_release", "setUnknownDefaultValuePresent", "Landroidx/navigation/NavArgument;", "build", "()Landroidx/navigation/NavArgument;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public NavType a;
        public boolean b;
        public Object c;
        public boolean d;
        public boolean e;

        @NotNull
        public final NavArgument build() {
            NavType navType0 = this.a;
            if(navType0 == null) {
                navType0 = NavType.Companion.inferFromValueType(this.c);
                Intrinsics.checkNotNull(navType0, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new NavArgument(navType0, this.b, this.c, this.d, this.e);
        }

        @NotNull
        public final Builder setDefaultValue(@Nullable Object object0) {
            this.c = object0;
            this.d = true;
            return this;
        }

        @NotNull
        public final Builder setIsNullable(boolean z) {
            this.b = z;
            return this;
        }

        @NotNull
        public final Builder setType(@NotNull NavType navType0) {
            Intrinsics.checkNotNullParameter(navType0, "type");
            this.a = navType0;
            return this;
        }

        @NotNull
        public final Builder setUnknownDefaultValuePresent$navigation_common_release(boolean z) {
            this.e = z;
            return this;
        }
    }

    public final NavType a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public NavArgument(@NotNull NavType navType0, boolean z, @Nullable Object object0, boolean z1, boolean z2) {
        Intrinsics.checkNotNullParameter(navType0, "type");
        super();
        if(!navType0.isNullableAllowed() && z) {
            throw new IllegalArgumentException("nav_type does not allow nullable values");
        }
        if(!z && z1 && object0 == null) {
            throw new IllegalArgumentException("Argument with type nav_type has null value but is not nullable.");
        }
        this.a = navType0;
        this.b = z;
        this.e = object0;
        this.c = z1 || z2;
        this.d = z2;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!Intrinsics.areEqual(NavArgument.class, class0) || this.b != ((NavArgument)object0).b) {
                return false;
            }
            if(this.c != ((NavArgument)object0).c) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((NavArgument)object0).a)) {
                return false;
            }
            Object object1 = ((NavArgument)object0).e;
            return this.e == null ? object1 == null : Intrinsics.areEqual(this.e, object1);
        }
        return false;
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.e;
    }

    @NotNull
    public final NavType getType() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F;
        return this.e == null ? v : v + this.e.hashCode();
    }

    public final boolean isDefaultValuePresent() {
        return this.c;
    }

    public final boolean isDefaultValueUnknown$navigation_common_release() {
        return this.d;
    }

    public final boolean isNullable() {
        return this.b;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void putDefaultValue(@NotNull String s, @NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        if(this.c) {
            Object object0 = this.e;
            if(object0 != null) {
                this.a.put(bundle0, s, object0);
            }
        }
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NavArgument");
        stringBuilder0.append(" Type: " + this.a);
        stringBuilder0.append(" Nullable: " + this.b);
        if(this.c) {
            stringBuilder0.append(" DefaultValue: " + this.e);
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "sb.toString()");
        return s;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean verify(@NotNull String s, @NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        if(!this.b && bundle0.containsKey(s) && bundle0.get(s) == null) {
            return false;
        }
        try {
            this.a.get(bundle0, s);
            return true;
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
    }
}

