package androidx.navigation.serialization;

import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.text.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l1.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u0017\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u001B\u0010\u0007\u001A\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Landroidx/navigation/NavType;", "getNavType", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Landroidx/navigation/NavType;", "Lkotlin/reflect/KType;", "kType", "", "matchKType", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KType;)Z", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NavTypeConverterKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[a.d(12).length];
            try {
                arr_v[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[1] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[2] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[3] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[4] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[5] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[6] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[7] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[8] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[9] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[10] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int a(SerialDescriptor serialDescriptor0) {
        String s = p.replace$default(serialDescriptor0.getSerialName(), "?", "", false, 4, null);
        if(Intrinsics.areEqual(s, "kotlin.Int")) {
            return 1;
        }
        if(Intrinsics.areEqual(s, "kotlin.Boolean")) {
            return 2;
        }
        if(Intrinsics.areEqual(s, "kotlin.Float")) {
            return 3;
        }
        if(Intrinsics.areEqual(s, "kotlin.Long")) {
            return 4;
        }
        if(Intrinsics.areEqual(s, "kotlin.String")) {
            return 5;
        }
        if(Intrinsics.areEqual(s, "kotlin.IntArray")) {
            return 6;
        }
        if(Intrinsics.areEqual(s, "kotlin.BooleanArray")) {
            return 7;
        }
        if(Intrinsics.areEqual(s, "kotlin.FloatArray")) {
            return 8;
        }
        if(Intrinsics.areEqual(s, "kotlin.LongArray")) {
            return 9;
        }
        if(Intrinsics.areEqual(s, "kotlin.Array")) {
            return 10;
        }
        return p.startsWith$default(s, "kotlin.collections.ArrayList", false, 2, null) ? 11 : 12;
    }

    @NotNull
    public static final NavType getNavType(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        switch(a.c(NavTypeConverterKt.a(serialDescriptor0))) {
            case 0: {
                return NavType.IntType;
            }
            case 1: {
                return NavType.BoolType;
            }
            case 2: {
                return NavType.FloatType;
            }
            case 3: {
                return NavType.LongType;
            }
            case 4: {
                return NavType.StringType;
            }
            case 5: {
                return NavType.IntArrayType;
            }
            case 6: {
                return NavType.BoolArrayType;
            }
            case 7: {
                return NavType.FloatArrayType;
            }
            case 8: {
                return NavType.LongArrayType;
            }
            case 9: {
                return NavTypeConverterKt.a(serialDescriptor0.getElementDescriptor(0)) == 5 ? NavType.StringArrayType : UNKNOWN.INSTANCE;
            }
            case 10: {
                switch(a.c(NavTypeConverterKt.a(serialDescriptor0.getElementDescriptor(0)))) {
                    case 0: {
                        return NavType.IntListType;
                    }
                    case 1: {
                        return NavType.BoolListType;
                    }
                    case 2: {
                        return NavType.FloatListType;
                    }
                    case 3: {
                        return NavType.LongListType;
                    }
                    case 4: {
                        return NavType.StringListType;
                    }
                    default: {
                        return UNKNOWN.INSTANCE;
                    }
                }
            }
            default: {
                return UNKNOWN.INSTANCE;
            }
        }
    }

    public static final boolean matchKType(@NotNull SerialDescriptor serialDescriptor0, @NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(kType0, "kType");
        if(serialDescriptor0.isNullable() != kType0.isMarkedNullable()) {
            return false;
        }
        KSerializer kSerializer0 = SerializersKt.serializerOrNull(kType0);
        if(kSerializer0 == null) {
            throw new IllegalStateException("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
        }
        return serialDescriptor0.hashCode() == kSerializer0.getDescriptor().hashCode();
    }
}

