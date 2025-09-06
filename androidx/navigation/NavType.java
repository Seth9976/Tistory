package androidx.navigation;

import a5.b;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001F\b&\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006%&\'()*B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\'\u0010\r\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000EJ\"\u0010\u000F\u001A\u0004\u0018\u00018\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH¦\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001F\u0010\u0011\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\u0013\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\'\u0010\u0015\u001A\u00028\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0015\u001A\u00028\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001A\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0018\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001B\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\u001A\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\tH\u0016¢\u0006\u0004\b\u001D\u0010\u001ER\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b\u0004\u0010!R\u001A\u0010\"\u001A\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u001E¨\u0006+"}, d2 = {"Landroidx/navigation/NavType;", "T", "", "", "isNullableAllowed", "<init>", "(Z)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "parseAndPut", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "serializeAsValue", "(Ljava/lang/Object;)Ljava/lang/String;", "other", "valueEquals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "name", "Ljava/lang/String;", "getName", "Companion", "EnumType", "ParcelableArrayType", "ParcelableType", "SerializableArrayType", "SerializableType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class NavType {
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\'\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0017\u00A2\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\b\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u000E\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001H\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0012R\u001C\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00160\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001A\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\t0\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u001C\u0010\u001A\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0015R\"\u0010\u001C\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001B\u0018\u00010\u00160\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u0015R\u001A\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001B0\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u0015R\u001C\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E0\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u0015R\"\u0010!\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00160\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b!\u0010\u0015R\u001A\u0010\"\u001A\b\u0012\u0004\u0012\u00020 0\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\"\u0010\u0015R\u001C\u0010$\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b$\u0010\u0015R\"\u0010&\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00160\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b&\u0010\u0015R\u001A\u0010\'\u001A\b\u0012\u0004\u0012\u00020%0\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\'\u0010\u0015R\u001A\u0010(\u001A\b\u0012\u0004\u0012\u00020 0\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b(\u0010\u0015R\"\u0010*\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)0\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b*\u0010\u0015R\"\u0010+\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00160\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b+\u0010\u0015R\u001C\u0010,\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b,\u0010\u0015\u00A8\u0006-"}, d2 = {"Landroidx/navigation/NavType$Companion;", "", "", "type", "packageName", "Landroidx/navigation/NavType;", "fromArgType", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavType;", "className", "", "isArray", "parseSerializableOrParcelableType$navigation_common_release", "(Ljava/lang/String;Z)Landroidx/navigation/NavType;", "parseSerializableOrParcelableType", "value", "inferFromValue", "(Ljava/lang/String;)Landroidx/navigation/NavType;", "inferFromValueType", "(Ljava/lang/Object;)Landroidx/navigation/NavType;", "", "BoolArrayType", "Landroidx/navigation/NavType;", "", "BoolListType", "BoolType", "", "FloatArrayType", "", "FloatListType", "FloatType", "", "IntArrayType", "", "IntListType", "IntType", "", "LongArrayType", "", "LongListType", "LongType", "ReferenceType", "", "StringArrayType", "StringListType", "StringType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public NavType fromArgType(@Nullable String s, @Nullable String s1) {
            NavType navType0 = NavType.IntType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType0;
            }
            NavType navType1 = NavType.IntArrayType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType1;
            }
            NavType navType2 = NavType.IntListType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType2;
            }
            NavType navType3 = NavType.LongType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType3;
            }
            NavType navType4 = NavType.LongArrayType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType4;
            }
            NavType navType5 = NavType.LongListType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType5;
            }
            NavType navType6 = NavType.BoolType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType6;
            }
            NavType navType7 = NavType.BoolArrayType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType7;
            }
            NavType navType8 = NavType.BoolListType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType8;
            }
            NavType navType9 = NavType.StringType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType9;
            }
            NavType navType10 = NavType.StringArrayType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType10;
            }
            NavType navType11 = NavType.StringListType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType11;
            }
            NavType navType12 = NavType.FloatType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType12;
            }
            NavType navType13 = NavType.FloatArrayType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType13;
            }
            NavType navType14 = NavType.FloatListType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType14;
            }
            NavType navType15 = NavType.ReferenceType;
            if(Intrinsics.areEqual("nav_type", s)) {
                return navType15;
            }
            if(s != null && s.length() != 0) {
                try {
                    String s2 = !p.startsWith$default(s, ".", false, 2, null) || s1 == null ? s : s1 + s;
                    boolean z = p.endsWith$default(s, "[]", false, 2, null);
                    if(z) {
                        s2 = s2.substring(0, s2.length() - 2);
                        Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
                    }
                    NavType navType16 = this.parseSerializableOrParcelableType$navigation_common_release(s2, z);
                    if(navType16 == null) {
                        throw new IllegalArgumentException((s2 + " is not Serializable or Parcelable.").toString());
                    }
                    return navType16;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                }
                throw new RuntimeException(classNotFoundException0);
            }
            return navType9;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public final NavType inferFromValue(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            try {
                NavType.IntType.parseValue(s);
                Intrinsics.checkNotNull(NavType.IntType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.IntType;
            }
            catch(IllegalArgumentException unused_ex) {
                try {
                    NavType.LongType.parseValue(s);
                    Intrinsics.checkNotNull(NavType.LongType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return NavType.LongType;
                }
                catch(IllegalArgumentException unused_ex) {
                    try {
                        NavType.FloatType.parseValue(s);
                        Intrinsics.checkNotNull(NavType.FloatType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return NavType.FloatType;
                    }
                    catch(IllegalArgumentException unused_ex) {
                        try {
                            NavType.BoolType.parseValue(s);
                            Intrinsics.checkNotNull(NavType.BoolType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return NavType.BoolType;
                        }
                        catch(IllegalArgumentException unused_ex) {
                            Intrinsics.checkNotNull(NavType.StringType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return NavType.StringType;
                        }
                    }
                }
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public final NavType inferFromValueType(@Nullable Object object0) {
            if(object0 instanceof Integer) {
                Intrinsics.checkNotNull(NavType.IntType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.IntType;
            }
            if(object0 instanceof int[]) {
                Intrinsics.checkNotNull(NavType.IntArrayType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.IntArrayType;
            }
            if(object0 instanceof Long) {
                Intrinsics.checkNotNull(NavType.LongType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.LongType;
            }
            if(object0 instanceof long[]) {
                Intrinsics.checkNotNull(NavType.LongArrayType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.LongArrayType;
            }
            if(object0 instanceof Float) {
                Intrinsics.checkNotNull(NavType.FloatType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.FloatType;
            }
            if(object0 instanceof float[]) {
                Intrinsics.checkNotNull(NavType.FloatArrayType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.FloatArrayType;
            }
            if(object0 instanceof Boolean) {
                Intrinsics.checkNotNull(NavType.BoolType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.BoolType;
            }
            if(object0 instanceof boolean[]) {
                Intrinsics.checkNotNull(NavType.BoolArrayType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return NavType.BoolArrayType;
            }
            if(!(object0 instanceof String) && object0 != null) {
                if(object0 instanceof Object[] && ((Object[])object0) instanceof String[]) {
                    Intrinsics.checkNotNull(NavType.StringArrayType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return NavType.StringArrayType;
                }
                if(object0.getClass().isArray()) {
                    Class class0 = object0.getClass().getComponentType();
                    Intrinsics.checkNotNull(class0);
                    if(Parcelable.class.isAssignableFrom(class0)) {
                        Class class1 = object0.getClass().getComponentType();
                        Intrinsics.checkNotNull(class1, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        return new ParcelableArrayType(class1);
                    }
                }
                if(object0.getClass().isArray()) {
                    Class class2 = object0.getClass().getComponentType();
                    Intrinsics.checkNotNull(class2);
                    if(Serializable.class.isAssignableFrom(class2)) {
                        Class class3 = object0.getClass().getComponentType();
                        Intrinsics.checkNotNull(class3, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new SerializableArrayType(class3);
                    }
                }
                if(object0 instanceof Parcelable) {
                    return new ParcelableType(object0.getClass());
                }
                if(object0 instanceof Enum) {
                    return new EnumType(object0.getClass());
                }
                if(!(object0 instanceof Serializable)) {
                    throw new IllegalArgumentException("Object of type " + object0.getClass().getName() + " is not supported for navigation arguments.");
                }
                return new SerializableType(object0.getClass());
            }
            Intrinsics.checkNotNull(NavType.StringType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return NavType.StringType;
        }

        @Nullable
        public final NavType parseSerializableOrParcelableType$navigation_common_release(@NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(s, "className");
            Class class0 = Class.forName(s);
            if(Parcelable.class.isAssignableFrom(class0)) {
                if(z) {
                    Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new ParcelableArrayType(class0);
                }
                Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                return new ParcelableType(class0);
            }
            if(Enum.class.isAssignableFrom(class0) && !z) {
                Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                return new EnumType(class0);
            }
            if(Serializable.class.isAssignableFrom(class0)) {
                if(z) {
                    Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new SerializableArrayType(class0);
                }
                Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                return new SerializableType(class0);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00028\u00012\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BR\u0014\u0010\u000E\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/navigation/NavType$EnumType;", "", "D", "Landroidx/navigation/NavType$SerializableType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "value", "parseValue", "(Ljava/lang/String;)Ljava/lang/Enum;", "getName", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1214:1\n1#2:1215\n1282#3,2:1216\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n*L\n1137#1:1216,2\n*E\n"})
    public static final class EnumType extends SerializableType {
        public final Class c;

        public EnumType(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "type");
            super(false, class0);
            if(!class0.isEnum()) {
                throw new IllegalArgumentException((class0 + " is not an Enum type.").toString());
            }
            this.c = class0;
        }

        @Override  // androidx.navigation.NavType$SerializableType
        @NotNull
        public String getName() {
            String s = this.c.getName();
            Intrinsics.checkNotNullExpressionValue(s, "type.name");
            return s;
        }

        @Override  // androidx.navigation.NavType$SerializableType
        public Serializable parseValue(String s) {
            return this.parseValue(s);
        }

        @NotNull
        public Enum parseValue(@NotNull String s) {
            Object object0;
            Intrinsics.checkNotNullParameter(s, "value");
            Class class0 = this.c;
            Object[] arr_object = class0.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(arr_object, "type.enumConstants");
            for(int v = 0; true; ++v) {
                object0 = null;
                if(v >= arr_object.length) {
                    break;
                }
                Object object1 = arr_object[v];
                if(p.equals(((Enum)object1).name(), s, true)) {
                    object0 = object1;
                    break;
                }
            }
            if(((Enum)object0) != null) {
                return (Enum)object0;
            }
            StringBuilder stringBuilder0 = b.v("Enum value ", s, " not found for type ");
            stringBuilder0.append(class0.getName());
            stringBuilder0.append('.');
            throw new IllegalArgumentException(stringBuilder0.toString());
        }

        @Override  // androidx.navigation.NavType$SerializableType
        public Object parseValue(String s) {
            return this.parseValue(s);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J(\u0010\u0011\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ/\u0010\u001D\u001A\u00020\u00172\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000E\u0010\u0016\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001D\u0010\u001ER\u0014\u0010!\u001A\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010 ¨\u0006\""}, d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "parseValue", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueEquals", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "getName", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ParcelableArrayType extends NavType {
        public final Class b;

        public ParcelableArrayType(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "type");
            super(true);
            if(Parcelable.class.isAssignableFrom(class0)) {
                try {
                    Class class1 = Class.forName(("[L" + class0.getName() + ';'));
                    Intrinsics.checkNotNull(class1, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.b = class1;
                    return;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new RuntimeException(classNotFoundException0);
                }
            }
            throw new IllegalArgumentException((class0 + " does not implement Parcelable.").toString());
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Intrinsics.areEqual(ParcelableArrayType.class, class0) ? Intrinsics.areEqual(this.b, ((ParcelableArrayType)object0).b) : false;
            }
            return false;
        }

        @Override  // androidx.navigation.NavType
        public Object get(Bundle bundle0, String s) {
            return this.get(bundle0, s);
        }

        @Nullable
        public Parcelable[] get(@NotNull Bundle bundle0, @NotNull String s) {
            return (Parcelable[])q.i(bundle0, "bundle", s, "key", s);
        }

        @Override  // androidx.navigation.NavType
        @NotNull
        public String getName() {
            String s = this.b.getName();
            Intrinsics.checkNotNullExpressionValue(s, "arrayType.name");
            return s;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode();
        }

        @Override  // androidx.navigation.NavType
        public Object parseValue(String s) {
            return this.parseValue(s);
        }

        @NotNull
        public Parcelable[] parseValue(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            throw new UnsupportedOperationException("Arrays don\'t support default values.");
        }

        @Override  // androidx.navigation.NavType
        public void put(Bundle bundle0, String s, Object object0) {
            this.put(bundle0, s, ((Parcelable[])object0));
        }

        public void put(@NotNull Bundle bundle0, @NotNull String s, @Nullable Parcelable[] arr_parcelable) {
            Intrinsics.checkNotNullParameter(bundle0, "bundle");
            Intrinsics.checkNotNullParameter(s, "key");
            this.b.cast(arr_parcelable);
            bundle0.putParcelableArray(s, arr_parcelable);
        }

        @Override  // androidx.navigation.NavType
        public boolean valueEquals(Object object0, Object object1) {
            return this.valueEquals(((Parcelable[])object0), ((Parcelable[])object1));
        }

        public boolean valueEquals(@Nullable Parcelable[] arr_parcelable, @Nullable Parcelable[] arr_parcelable1) {
            return f.contentDeepEquals(arr_parcelable, arr_parcelable1);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\'\u0010\r\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\"\u0010\u000F\u001A\u0004\u0018\u00018\u00012\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00028\u00012\u0006\u0010\u000B\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001D\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getName", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ParcelableType extends NavType {
        public final Class b;

        public ParcelableType(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "type");
            super(true);
            if(!Parcelable.class.isAssignableFrom(class0) && !Serializable.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException((class0 + " does not implement Parcelable or Serializable.").toString());
            }
            this.b = class0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Intrinsics.areEqual(ParcelableType.class, class0) ? Intrinsics.areEqual(this.b, ((ParcelableType)object0).b) : false;
            }
            return false;
        }

        @Override  // androidx.navigation.NavType
        @Nullable
        public Object get(@NotNull Bundle bundle0, @NotNull String s) {
            return q.i(bundle0, "bundle", s, "key", s);
        }

        @Override  // androidx.navigation.NavType
        @NotNull
        public String getName() {
            String s = this.b.getName();
            Intrinsics.checkNotNullExpressionValue(s, "type.name");
            return s;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode();
        }

        @Override  // androidx.navigation.NavType
        public Object parseValue(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            throw new UnsupportedOperationException("Parcelables don\'t support default values.");
        }

        @Override  // androidx.navigation.NavType
        public void put(@NotNull Bundle bundle0, @NotNull String s, Object object0) {
            Intrinsics.checkNotNullParameter(bundle0, "bundle");
            Intrinsics.checkNotNullParameter(s, "key");
            this.b.cast(object0);
            if(object0 == null || object0 instanceof Parcelable) {
                bundle0.putParcelable(s, ((Parcelable)object0));
            }
            else if(object0 instanceof Serializable) {
                bundle0.putSerializable(s, ((Serializable)object0));
            }
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J(\u0010\u0011\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ/\u0010\u001D\u001A\u00020\u00172\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000E\u0010\u0016\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001D\u0010\u001ER\u0014\u0010!\u001A\u00020\u000B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010 ¨\u0006\""}, d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueEquals", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "getName", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class SerializableArrayType extends NavType {
        public final Class b;

        public SerializableArrayType(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "type");
            super(true);
            if(Serializable.class.isAssignableFrom(class0)) {
                try {
                    Class class1 = Class.forName(("[L" + class0.getName() + ';'));
                    Intrinsics.checkNotNull(class1, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.b = class1;
                    return;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new RuntimeException(classNotFoundException0);
                }
            }
            throw new IllegalArgumentException((class0 + " does not implement Serializable.").toString());
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Intrinsics.areEqual(SerializableArrayType.class, class0) ? Intrinsics.areEqual(this.b, ((SerializableArrayType)object0).b) : false;
            }
            return false;
        }

        @Override  // androidx.navigation.NavType
        public Object get(Bundle bundle0, String s) {
            return this.get(bundle0, s);
        }

        @Nullable
        public Serializable[] get(@NotNull Bundle bundle0, @NotNull String s) {
            return (Serializable[])q.i(bundle0, "bundle", s, "key", s);
        }

        @Override  // androidx.navigation.NavType
        @NotNull
        public String getName() {
            String s = this.b.getName();
            Intrinsics.checkNotNullExpressionValue(s, "arrayType.name");
            return s;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode();
        }

        @Override  // androidx.navigation.NavType
        public Object parseValue(String s) {
            return this.parseValue(s);
        }

        @NotNull
        public Serializable[] parseValue(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            throw new UnsupportedOperationException("Arrays don\'t support default values.");
        }

        @Override  // androidx.navigation.NavType
        public void put(Bundle bundle0, String s, Object object0) {
            this.put(bundle0, s, ((Serializable[])object0));
        }

        public void put(@NotNull Bundle bundle0, @NotNull String s, @Nullable Serializable[] arr_serializable) {
            Intrinsics.checkNotNullParameter(bundle0, "bundle");
            Intrinsics.checkNotNullParameter(s, "key");
            this.b.cast(arr_serializable);
            bundle0.putSerializable(s, ((Serializable)arr_serializable));
        }

        @Override  // androidx.navigation.NavType
        public boolean valueEquals(Object object0, Object object1) {
            return this.valueEquals(((Serializable[])object0), ((Serializable[])object1));
        }

        public boolean valueEquals(@Nullable Serializable[] arr_serializable, @Nullable Serializable[] arr_serializable1) {
            return f.contentDeepEquals(arr_serializable, arr_serializable1);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001F\b\u0010\u0012\u0006\u0010\t\u001A\u00020\b\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ\'\u0010\u0011\u001A\u00020\u00102\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001A\u0004\u0018\u00018\u00012\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00028\u00012\u0006\u0010\u000F\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0019\u001A\u00020\b2\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u0014\u0010 \u001A\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001F¨\u0006!"}, d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getName", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1214:1\n1#2:1215\n*E\n"})
    public static class SerializableType extends NavType {
        public final Class b;

        public SerializableType(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "type");
            super(true);
            if(!Serializable.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException((class0 + " does not implement Serializable.").toString());
            }
            if(class0.isEnum()) {
                throw new IllegalArgumentException((class0 + " is an Enum. You should use EnumType instead.").toString());
            }
            this.b = class0;
        }

        public SerializableType(boolean z, @NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "type");
            super(z);
            if(!Serializable.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException((class0 + " does not implement Serializable.").toString());
            }
            this.b = class0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SerializableType ? Intrinsics.areEqual(this.b, ((SerializableType)object0).b) : false;
        }

        @Nullable
        public Serializable get(@NotNull Bundle bundle0, @NotNull String s) {
            return (Serializable)q.i(bundle0, "bundle", s, "key", s);
        }

        @Override  // androidx.navigation.NavType
        public Object get(Bundle bundle0, String s) {
            return this.get(bundle0, s);
        }

        @Override  // androidx.navigation.NavType
        @NotNull
        public String getName() {
            String s = this.b.getName();
            Intrinsics.checkNotNullExpressionValue(s, "type.name");
            return s;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode();
        }

        @NotNull
        public Serializable parseValue(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            throw new UnsupportedOperationException("Serializables don\'t support default values.");
        }

        @Override  // androidx.navigation.NavType
        public Object parseValue(String s) {
            return this.parseValue(s);
        }

        public void put(@NotNull Bundle bundle0, @NotNull String s, @NotNull Serializable serializable0) {
            Intrinsics.checkNotNullParameter(bundle0, "bundle");
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(serializable0, "value");
            this.b.cast(serializable0);
            bundle0.putSerializable(s, serializable0);
        }

        @Override  // androidx.navigation.NavType
        public void put(Bundle bundle0, String s, Object object0) {
            this.put(bundle0, s, ((Serializable)object0));
        }
    }

    @JvmField
    @NotNull
    public static final NavType BoolArrayType;
    @JvmField
    @NotNull
    public static final NavType BoolListType;
    @JvmField
    @NotNull
    public static final NavType BoolType;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final NavType FloatArrayType;
    @JvmField
    @NotNull
    public static final NavType FloatListType;
    @JvmField
    @NotNull
    public static final NavType FloatType;
    @JvmField
    @NotNull
    public static final NavType IntArrayType;
    @JvmField
    @NotNull
    public static final NavType IntListType;
    @JvmField
    @NotNull
    public static final NavType IntType;
    @JvmField
    @NotNull
    public static final NavType LongArrayType;
    @JvmField
    @NotNull
    public static final NavType LongListType;
    @JvmField
    @NotNull
    public static final NavType LongType;
    @JvmField
    @NotNull
    public static final NavType ReferenceType;
    @JvmField
    @NotNull
    public static final NavType StringArrayType;
    @JvmField
    @NotNull
    public static final NavType StringListType;
    @JvmField
    @NotNull
    public static final NavType StringType;
    public final boolean a;

    static {
        NavType.Companion = new Companion(null);
        NavType.IntType = new NavType.Companion.IntType.1(false);  // 初始化器: Landroidx/navigation/NavType;-><init>(Z)V
        NavType.ReferenceType = new NavType.Companion.ReferenceType.1(false);  // 初始化器: Landroidx/navigation/NavType;-><init>(Z)V
        NavType.IntArrayType = new NavType.Companion.IntArrayType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.IntListType = new NavType.Companion.IntListType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.LongType = new NavType.Companion.LongType.1(false);  // 初始化器: Landroidx/navigation/NavType;-><init>(Z)V
        NavType.LongArrayType = new NavType.Companion.LongArrayType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.LongListType = new NavType.Companion.LongListType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.FloatType = new NavType.Companion.FloatType.1(false);  // 初始化器: Landroidx/navigation/NavType;-><init>(Z)V
        NavType.FloatArrayType = new NavType.Companion.FloatArrayType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.FloatListType = new NavType.Companion.FloatListType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.BoolType = new NavType.Companion.BoolType.1(false);  // 初始化器: Landroidx/navigation/NavType;-><init>(Z)V
        NavType.BoolArrayType = new NavType.Companion.BoolArrayType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.BoolListType = new NavType.Companion.BoolListType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.StringType = new NavType.Companion.StringType.1(true);  // 初始化器: Landroidx/navigation/NavType;-><init>(Z)V
        NavType.StringArrayType = new NavType.Companion.StringArrayType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
        NavType.StringListType = new NavType.Companion.StringListType.1(true);  // 初始化器: Landroidx/navigation/CollectionNavType;-><init>(Z)V
    }

    public NavType(boolean z) {
        this.a = z;
    }

    @JvmStatic
    @NotNull
    public static NavType fromArgType(@Nullable String s, @Nullable String s1) {
        return NavType.Companion.fromArgType(s, s1);
    }

    @Nullable
    public abstract Object get(@NotNull Bundle arg1, @NotNull String arg2);

    @NotNull
    public String getName() [...] // 潜在的解密器

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    @NotNull
    public static final NavType inferFromValue(@NotNull String s) {
        return NavType.Companion.inferFromValue(s);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    @NotNull
    public static final NavType inferFromValueType(@Nullable Object object0) {
        return NavType.Companion.inferFromValueType(object0);
    }

    public boolean isNullableAllowed() {
        return this.a;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final Object parseAndPut(@NotNull Bundle bundle0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "value");
        Object object0 = this.parseValue(s1);
        this.put(bundle0, s, object0);
        return object0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final Object parseAndPut(@NotNull Bundle bundle0, @NotNull String s, @Nullable String s1, Object object0) {
        Intrinsics.checkNotNullParameter(bundle0, "bundle");
        Intrinsics.checkNotNullParameter(s, "key");
        if(!bundle0.containsKey(s)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if(s1 != null) {
            Object object1 = this.parseValue(s1, object0);
            this.put(bundle0, s, object1);
            return object1;
        }
        return object0;
    }

    public abstract Object parseValue(@NotNull String arg1);

    public Object parseValue(@NotNull String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "value");
        return this.parseValue(s);
    }

    public abstract void put(@NotNull Bundle arg1, @NotNull String arg2, Object arg3);

    @NotNull
    public String serializeAsValue(Object object0) {
        return String.valueOf(object0);
    }

    // 去混淆评级： 低(20)
    @Override
    @NotNull
    public String toString() {
        return "nav_type";
    }

    public boolean valueEquals(Object object0, Object object1) {
        return Intrinsics.areEqual(object0, object1);
    }
}

