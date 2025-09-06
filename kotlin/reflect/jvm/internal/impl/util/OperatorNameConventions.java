package kotlin.reflect.jvm.internal.impl.util;

import java.util.Set;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

public final class OperatorNameConventions {
    @JvmField
    @NotNull
    public static final Set ALL_BINARY_OPERATION_NAMES;
    @JvmField
    @NotNull
    public static final Name AND;
    @JvmField
    @NotNull
    public static final Set ASSIGNMENT_OPERATIONS;
    @JvmField
    @NotNull
    public static final Set BINARY_OPERATION_NAMES;
    @JvmField
    @NotNull
    public static final Set BITWISE_OPERATION_NAMES;
    @JvmField
    @NotNull
    public static final Name COMPARE_TO;
    @JvmField
    @NotNull
    public static final Regex COMPONENT_REGEX;
    @JvmField
    @NotNull
    public static final Name CONTAINS;
    @JvmField
    @NotNull
    public static final Name DEC;
    @JvmField
    @NotNull
    public static final Set DELEGATED_PROPERTY_OPERATORS;
    @JvmField
    @NotNull
    public static final Name DIV;
    @JvmField
    @NotNull
    public static final Name DIV_ASSIGN;
    @JvmField
    @NotNull
    public static final Name EQUALS;
    @JvmField
    @NotNull
    public static final Name GET;
    @JvmField
    @NotNull
    public static final Name GET_VALUE;
    @JvmField
    @NotNull
    public static final Name HASH_CODE;
    @JvmField
    @NotNull
    public static final Name HAS_NEXT;
    @JvmField
    @NotNull
    public static final Name INC;
    @NotNull
    public static final OperatorNameConventions INSTANCE;
    @JvmField
    @NotNull
    public static final Name INV;
    @JvmField
    @NotNull
    public static final Name INVOKE;
    @JvmField
    @NotNull
    public static final Name ITERATOR;
    @JvmField
    @NotNull
    public static final Name MINUS;
    @JvmField
    @NotNull
    public static final Name MINUS_ASSIGN;
    @JvmField
    @NotNull
    public static final Name MOD;
    @JvmField
    @NotNull
    public static final Name MOD_ASSIGN;
    @JvmField
    @NotNull
    public static final Name NEXT;
    @JvmField
    @NotNull
    public static final Name NOT;
    @JvmField
    @NotNull
    public static final Name OR;
    @JvmField
    @NotNull
    public static final Name PLUS;
    @JvmField
    @NotNull
    public static final Name PLUS_ASSIGN;
    @JvmField
    @NotNull
    public static final Name PROVIDE_DELEGATE;
    @JvmField
    @NotNull
    public static final Name RANGE_TO;
    @JvmField
    @NotNull
    public static final Name RANGE_UNTIL;
    @JvmField
    @NotNull
    public static final Name REM;
    @JvmField
    @NotNull
    public static final Name REM_ASSIGN;
    @JvmField
    @NotNull
    public static final Name SET;
    @JvmField
    @NotNull
    public static final Name SET_VALUE;
    @JvmField
    @NotNull
    public static final Name SHL;
    @JvmField
    @NotNull
    public static final Name SHR;
    @JvmField
    @NotNull
    public static final Set SIMPLE_UNARY_OPERATION_NAMES;
    @JvmField
    @NotNull
    public static final Name TIMES;
    @JvmField
    @NotNull
    public static final Name TIMES_ASSIGN;
    @JvmField
    @NotNull
    public static final Name TO_STRING;
    @JvmField
    @NotNull
    public static final Name UNARY_MINUS;
    @JvmField
    @NotNull
    public static final Set UNARY_OPERATION_NAMES;
    @JvmField
    @NotNull
    public static final Name UNARY_PLUS;
    @JvmField
    @NotNull
    public static final Name USHR;
    @JvmField
    @NotNull
    public static final Name XOR;

    static {
        OperatorNameConventions.INSTANCE = new OperatorNameConventions();  // 初始化器: Ljava/lang/Object;-><init>()V
        Name name0 = Name.identifier("getValue");
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(\"getValue\")");
        OperatorNameConventions.GET_VALUE = name0;
        Name name1 = Name.identifier("setValue");
        Intrinsics.checkNotNullExpressionValue(name1, "identifier(\"setValue\")");
        OperatorNameConventions.SET_VALUE = name1;
        Name name2 = Name.identifier("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(name2, "identifier(\"provideDelegate\")");
        OperatorNameConventions.PROVIDE_DELEGATE = name2;
        Name name3 = Name.identifier("equals");
        Intrinsics.checkNotNullExpressionValue(name3, "identifier(\"equals\")");
        OperatorNameConventions.EQUALS = name3;
        Name name4 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(name4, "identifier(\"hashCode\")");
        OperatorNameConventions.HASH_CODE = name4;
        Name name5 = Name.identifier("compareTo");
        Intrinsics.checkNotNullExpressionValue(name5, "identifier(\"compareTo\")");
        OperatorNameConventions.COMPARE_TO = name5;
        Name name6 = Name.identifier("contains");
        Intrinsics.checkNotNullExpressionValue(name6, "identifier(\"contains\")");
        OperatorNameConventions.CONTAINS = name6;
        Name name7 = Name.identifier("invoke");
        Intrinsics.checkNotNullExpressionValue(name7, "identifier(\"invoke\")");
        OperatorNameConventions.INVOKE = name7;
        Name name8 = Name.identifier("iterator");
        Intrinsics.checkNotNullExpressionValue(name8, "identifier(\"iterator\")");
        OperatorNameConventions.ITERATOR = name8;
        Name name9 = Name.identifier("get");
        Intrinsics.checkNotNullExpressionValue(name9, "identifier(\"get\")");
        OperatorNameConventions.GET = name9;
        Name name10 = Name.identifier("set");
        Intrinsics.checkNotNullExpressionValue(name10, "identifier(\"set\")");
        OperatorNameConventions.SET = name10;
        Name name11 = Name.identifier("next");
        Intrinsics.checkNotNullExpressionValue(name11, "identifier(\"next\")");
        OperatorNameConventions.NEXT = name11;
        Name name12 = Name.identifier("hasNext");
        Intrinsics.checkNotNullExpressionValue(name12, "identifier(\"hasNext\")");
        OperatorNameConventions.HAS_NEXT = name12;
        Name name13 = Name.identifier("toString");
        Intrinsics.checkNotNullExpressionValue(name13, "identifier(\"toString\")");
        OperatorNameConventions.TO_STRING = name13;
        OperatorNameConventions.COMPONENT_REGEX = new Regex("component\\d+");
        Name name14 = Name.identifier("and");
        Intrinsics.checkNotNullExpressionValue(name14, "identifier(\"and\")");
        OperatorNameConventions.AND = name14;
        Name name15 = Name.identifier("or");
        Intrinsics.checkNotNullExpressionValue(name15, "identifier(\"or\")");
        OperatorNameConventions.OR = name15;
        Name name16 = Name.identifier("xor");
        Intrinsics.checkNotNullExpressionValue(name16, "identifier(\"xor\")");
        OperatorNameConventions.XOR = name16;
        Name name17 = Name.identifier("inv");
        Intrinsics.checkNotNullExpressionValue(name17, "identifier(\"inv\")");
        OperatorNameConventions.INV = name17;
        Name name18 = Name.identifier("shl");
        Intrinsics.checkNotNullExpressionValue(name18, "identifier(\"shl\")");
        OperatorNameConventions.SHL = name18;
        Name name19 = Name.identifier("shr");
        Intrinsics.checkNotNullExpressionValue(name19, "identifier(\"shr\")");
        OperatorNameConventions.SHR = name19;
        Name name20 = Name.identifier("ushr");
        Intrinsics.checkNotNullExpressionValue(name20, "identifier(\"ushr\")");
        OperatorNameConventions.USHR = name20;
        Name name21 = Name.identifier("inc");
        Intrinsics.checkNotNullExpressionValue(name21, "identifier(\"inc\")");
        OperatorNameConventions.INC = name21;
        Name name22 = Name.identifier("dec");
        Intrinsics.checkNotNullExpressionValue(name22, "identifier(\"dec\")");
        OperatorNameConventions.DEC = name22;
        Name name23 = Name.identifier("plus");
        Intrinsics.checkNotNullExpressionValue(name23, "identifier(\"plus\")");
        OperatorNameConventions.PLUS = name23;
        Name name24 = Name.identifier("minus");
        Intrinsics.checkNotNullExpressionValue(name24, "identifier(\"minus\")");
        OperatorNameConventions.MINUS = name24;
        Name name25 = Name.identifier("not");
        Intrinsics.checkNotNullExpressionValue(name25, "identifier(\"not\")");
        OperatorNameConventions.NOT = name25;
        Name name26 = Name.identifier("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(name26, "identifier(\"unaryMinus\")");
        OperatorNameConventions.UNARY_MINUS = name26;
        Name name27 = Name.identifier("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(name27, "identifier(\"unaryPlus\")");
        OperatorNameConventions.UNARY_PLUS = name27;
        Name name28 = Name.identifier("times");
        Intrinsics.checkNotNullExpressionValue(name28, "identifier(\"times\")");
        OperatorNameConventions.TIMES = name28;
        Name name29 = Name.identifier("div");
        Intrinsics.checkNotNullExpressionValue(name29, "identifier(\"div\")");
        OperatorNameConventions.DIV = name29;
        Name name30 = Name.identifier("mod");
        Intrinsics.checkNotNullExpressionValue(name30, "identifier(\"mod\")");
        OperatorNameConventions.MOD = name30;
        Name name31 = Name.identifier("rem");
        Intrinsics.checkNotNullExpressionValue(name31, "identifier(\"rem\")");
        OperatorNameConventions.REM = name31;
        Name name32 = Name.identifier("rangeTo");
        Intrinsics.checkNotNullExpressionValue(name32, "identifier(\"rangeTo\")");
        OperatorNameConventions.RANGE_TO = name32;
        Name name33 = Name.identifier("rangeUntil");
        Intrinsics.checkNotNullExpressionValue(name33, "identifier(\"rangeUntil\")");
        OperatorNameConventions.RANGE_UNTIL = name33;
        Name name34 = Name.identifier("timesAssign");
        Intrinsics.checkNotNullExpressionValue(name34, "identifier(\"timesAssign\")");
        OperatorNameConventions.TIMES_ASSIGN = name34;
        Name name35 = Name.identifier("divAssign");
        Intrinsics.checkNotNullExpressionValue(name35, "identifier(\"divAssign\")");
        OperatorNameConventions.DIV_ASSIGN = name35;
        Name name36 = Name.identifier("modAssign");
        Intrinsics.checkNotNullExpressionValue(name36, "identifier(\"modAssign\")");
        OperatorNameConventions.MOD_ASSIGN = name36;
        Name name37 = Name.identifier("remAssign");
        Intrinsics.checkNotNullExpressionValue(name37, "identifier(\"remAssign\")");
        OperatorNameConventions.REM_ASSIGN = name37;
        Name name38 = Name.identifier("plusAssign");
        Intrinsics.checkNotNullExpressionValue(name38, "identifier(\"plusAssign\")");
        OperatorNameConventions.PLUS_ASSIGN = name38;
        Name name39 = Name.identifier("minusAssign");
        Intrinsics.checkNotNullExpressionValue(name39, "identifier(\"minusAssign\")");
        OperatorNameConventions.MINUS_ASSIGN = name39;
        OperatorNameConventions.UNARY_OPERATION_NAMES = f0.setOf(new Name[]{name21, name22, name27, name26, name25, name17});
        OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES = f0.setOf(new Name[]{name27, name26, name25, name17});
        Set set0 = f0.setOf(new Name[]{name28, name23, name24, name29, name30, name31, name32, name33});
        OperatorNameConventions.BINARY_OPERATION_NAMES = set0;
        Set set1 = f0.setOf(new Name[]{name14, name15, name16, name17, name18, name19, name20});
        OperatorNameConventions.BITWISE_OPERATION_NAMES = set1;
        OperatorNameConventions.ALL_BINARY_OPERATION_NAMES = g0.plus(g0.plus(set0, set1), f0.setOf(new Name[]{name3, name6, name5}));
        OperatorNameConventions.ASSIGNMENT_OPERATIONS = f0.setOf(new Name[]{name34, name35, name36, name37, name38, name39});
        OperatorNameConventions.DELEGATED_PROPERTY_OPERATORS = f0.setOf(new Name[]{name0, name1, name2});
    }
}

