package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSpecialNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialNames.kt\norg/jetbrains/kotlin/name/SpecialNames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class SpecialNames {
    @JvmField
    @NotNull
    public static final Name ANONYMOUS;
    @JvmField
    @NotNull
    public static final Name ARRAY;
    @JvmField
    @NotNull
    public static final Name DEFAULT_NAME_FOR_COMPANION_OBJECT;
    @JvmField
    @NotNull
    public static final Name DESTRUCT;
    @JvmField
    @NotNull
    public static final Name ENUM_GET_ENTRIES;
    @JvmField
    @NotNull
    public static final Name IMPLICIT_SET_PARAMETER;
    @JvmField
    @NotNull
    public static final Name INIT;
    @NotNull
    public static final SpecialNames INSTANCE;
    @JvmField
    @NotNull
    public static final Name ITERATOR;
    @JvmField
    @NotNull
    public static final Name LOCAL;
    @JvmField
    @NotNull
    public static final Name NO_NAME_PROVIDED;
    @JvmField
    @NotNull
    public static final Name RECEIVER;
    @JvmField
    @NotNull
    public static final Name ROOT_PACKAGE;
    @JvmField
    @NotNull
    public static final Name SAFE_IDENTIFIER_FOR_NO_NAME;
    @JvmField
    @NotNull
    public static final Name THIS;
    @JvmField
    @NotNull
    public static final Name UNARY;
    @JvmField
    @NotNull
    public static final Name UNARY_RESULT;
    @JvmField
    @NotNull
    public static final Name UNDERSCORE_FOR_UNUSED_VAR;

    static {
        SpecialNames.INSTANCE = new SpecialNames();  // 初始化器: Ljava/lang/Object;-><init>()V
        Name name0 = Name.special("<no name provided>");
        Intrinsics.checkNotNullExpressionValue(name0, "special(\"<no name provided>\")");
        SpecialNames.NO_NAME_PROVIDED = name0;
        Name name1 = Name.special("<root package>");
        Intrinsics.checkNotNullExpressionValue(name1, "special(\"<root package>\")");
        SpecialNames.ROOT_PACKAGE = name1;
        Name name2 = Name.identifier("Companion");
        Intrinsics.checkNotNullExpressionValue(name2, "identifier(\"Companion\")");
        SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT = name2;
        Name name3 = Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        Intrinsics.checkNotNullExpressionValue(name3, "identifier(\"no_name_in_P…_4cd0_b7f5_b46aa3cd5d40\")");
        SpecialNames.SAFE_IDENTIFIER_FOR_NO_NAME = name3;
        Name name4 = Name.special("<anonymous>");
        Intrinsics.checkNotNullExpressionValue(name4, "special(ANONYMOUS_STRING)");
        SpecialNames.ANONYMOUS = name4;
        Name name5 = Name.special("<unary>");
        Intrinsics.checkNotNullExpressionValue(name5, "special(\"<unary>\")");
        SpecialNames.UNARY = name5;
        Name name6 = Name.special("<unary-result>");
        Intrinsics.checkNotNullExpressionValue(name6, "special(\"<unary-result>\")");
        SpecialNames.UNARY_RESULT = name6;
        Name name7 = Name.special("<this>");
        Intrinsics.checkNotNullExpressionValue(name7, "special(\"<this>\")");
        SpecialNames.THIS = name7;
        Name name8 = Name.special("<init>");
        Intrinsics.checkNotNullExpressionValue(name8, "special(\"<init>\")");
        SpecialNames.INIT = name8;
        Name name9 = Name.special("<iterator>");
        Intrinsics.checkNotNullExpressionValue(name9, "special(\"<iterator>\")");
        SpecialNames.ITERATOR = name9;
        Name name10 = Name.special("<destruct>");
        Intrinsics.checkNotNullExpressionValue(name10, "special(\"<destruct>\")");
        SpecialNames.DESTRUCT = name10;
        Name name11 = Name.special("<local>");
        Intrinsics.checkNotNullExpressionValue(name11, "special(\"<local>\")");
        SpecialNames.LOCAL = name11;
        Name name12 = Name.special("<unused var>");
        Intrinsics.checkNotNullExpressionValue(name12, "special(\"<unused var>\")");
        SpecialNames.UNDERSCORE_FOR_UNUSED_VAR = name12;
        Name name13 = Name.special("<set-?>");
        Intrinsics.checkNotNullExpressionValue(name13, "special(\"<set-?>\")");
        SpecialNames.IMPLICIT_SET_PARAMETER = name13;
        Name name14 = Name.special("<array>");
        Intrinsics.checkNotNullExpressionValue(name14, "special(\"<array>\")");
        SpecialNames.ARRAY = name14;
        Name name15 = Name.special("<receiver>");
        Intrinsics.checkNotNullExpressionValue(name15, "special(\"<receiver>\")");
        SpecialNames.RECEIVER = name15;
        Name name16 = Name.special("<get-entries>");
        Intrinsics.checkNotNullExpressionValue(name16, "special(\"<get-entries>\")");
        SpecialNames.ENUM_GET_ENTRIES = name16;
    }

    public final boolean isSafeIdentifier(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        String s = name0.asString();
        Intrinsics.checkNotNullExpressionValue(s, "name.asString()");
        return s.length() > 0 && !name0.isSpecial();
    }

    // 去混淆评级： 低(20)
    @JvmStatic
    @NotNull
    public static final Name safeIdentifier(@Nullable Name name0) {
        return name0 != null && !name0.isSpecial() ? name0 : SpecialNames.SAFE_IDENTIFIER_FOR_NO_NAME;
    }
}

