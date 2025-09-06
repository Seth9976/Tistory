package kotlin.time;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import mf.a;
import mf.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.d;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b8\b\u0087@\u0018\u0000 \u008C\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u008C\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0006\u0010\u0005J\u0018\u0010\u000B\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0000H\u0086\u0002\u00A2\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0000H\u0086\u0002\u00A2\u0006\u0004\b\f\u0010\nJ\u001B\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000EH\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001B\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u0013H\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0014J\u001B\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000EH\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0011J\u001B\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u0013H\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0016\u001A\u00020\u00132\u0006\u0010\b\u001A\u00020\u0000H\u0086\u0002\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001D\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0019H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\r\u0010!\u001A\u00020\u001E\u00A2\u0006\u0004\b\u001F\u0010 J\r\u0010#\u001A\u00020\u001E\u00A2\u0006\u0004\b\"\u0010 J\r\u0010%\u001A\u00020\u001E\u00A2\u0006\u0004\b$\u0010 J\r\u0010\'\u001A\u00020\u001E\u00A2\u0006\u0004\b&\u0010 J\u0018\u0010*\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\u0000H\u0096\u0002\u00A2\u0006\u0004\b(\u0010)J\u009D\u0001\u00107\u001A\u00028\u0000\"\u0004\b\u0000\u0010+2u\u00104\u001Aq\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u00000,H\u0086\b\u00F8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0004\b5\u00106J\u0088\u0001\u00107\u001A\u00028\u0000\"\u0004\b\u0000\u0010+2`\u00104\u001A\\\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u000008H\u0086\b\u00F8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0004\b5\u00109Js\u00107\u001A\u00028\u0000\"\u0004\b\u0000\u0010+2K\u00104\u001AG\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u00000:H\u0086\b\u00F8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0004\b5\u0010;J^\u00107\u001A\u00028\u0000\"\u0004\b\u0000\u0010+26\u00104\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00028\u00000<H\u0086\b\u00F8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00A2\u0006\u0004\b5\u0010=J\u0015\u0010@\u001A\u00020\u00132\u0006\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b>\u0010?J\u0015\u0010B\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\bA\u0010\u001CJ\u0015\u0010E\u001A\u00020\u000E2\u0006\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\bC\u0010DJ\u000F\u0010G\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\bF\u0010\u0005J\u000F\u0010I\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\bH\u0010\u0005J\u000F\u0010M\u001A\u00020JH\u0016\u00A2\u0006\u0004\bK\u0010LJ\u001F\u0010M\u001A\u00020J2\u0006\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010N\u001A\u00020\u000E\u00A2\u0006\u0004\bK\u0010OJ\r\u0010Q\u001A\u00020J\u00A2\u0006\u0004\bP\u0010LJ\u0010\u0010T\u001A\u00020\u000EH\u00D6\u0001\u00A2\u0006\u0004\bR\u0010SJ\u001A\u0010X\u001A\u00020\u001E2\b\u0010\b\u001A\u0004\u0018\u00010UH\u00D6\u0003\u00A2\u0006\u0004\bV\u0010WR\u0014\u0010Z\u001A\u00020\u00008F\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\bY\u0010\u0005R\u001A\u0010^\u001A\u00020\u000E8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b\\\u0010]\u001A\u0004\b[\u0010SR\u001A\u0010a\u001A\u00020\u000E8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b`\u0010]\u001A\u0004\b_\u0010SR\u001A\u0010d\u001A\u00020\u000E8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\bc\u0010]\u001A\u0004\bb\u0010SR\u001A\u0010g\u001A\u00020\u000E8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\bf\u0010]\u001A\u0004\be\u0010SR\u001A\u0010k\u001A\u00020\u00138FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bj\u0010]\u001A\u0004\bh\u0010iR\u001A\u0010n\u001A\u00020\u00138FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bm\u0010]\u001A\u0004\bl\u0010iR\u001A\u0010q\u001A\u00020\u00138FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bp\u0010]\u001A\u0004\bo\u0010iR\u001A\u0010t\u001A\u00020\u00138FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bs\u0010]\u001A\u0004\br\u0010iR\u001A\u0010w\u001A\u00020\u00138FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bv\u0010]\u001A\u0004\bu\u0010iR\u001A\u0010z\u001A\u00020\u00138FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\by\u0010]\u001A\u0004\bx\u0010iR\u001A\u0010}\u001A\u00020\u00138FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b|\u0010]\u001A\u0004\b{\u0010iR\u0011\u0010\u007F\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b~\u0010\u0005R\u0013\u0010\u0081\u0001\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0080\u0001\u0010\u0005R\u0013\u0010\u0083\u0001\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0082\u0001\u0010\u0005R\u0013\u0010\u0085\u0001\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0084\u0001\u0010\u0005R\u0013\u0010\u0087\u0001\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0086\u0001\u0010\u0005R\u0013\u0010\u0089\u0001\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0088\u0001\u0010\u0005R\u0013\u0010\u008B\u0001\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u008A\u0001\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u009920\u0001\u00A8\u0006\u008D\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "", "rawValue", "constructor-impl", "(J)J", "unaryMinus-UwyO8pc", "unaryMinus", "other", "plus-LRDsOJo", "(JJ)J", "plus", "minus-LRDsOJo", "minus", "", "scale", "times-UwyO8pc", "(JI)J", "times", "", "(JD)J", "div-UwyO8pc", "div", "div-LRDsOJo", "(JJ)D", "Lkotlin/time/DurationUnit;", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "truncateTo", "", "isNegative-impl", "(J)Z", "isNegative", "isPositive-impl", "isPositive", "isInfinite-impl", "isInfinite", "isFinite-impl", "isFinite", "compareTo-LRDsOJo", "(JJ)I", "compareTo", "T", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "action", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "toComponents", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toDouble", "toLong-impl", "toLong", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toInt", "toLongNanoseconds-impl", "toLongNanoseconds", "toLongMilliseconds-impl", "toLongMilliseconds", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString-impl", "toIsoString", "hashCode-impl", "(J)I", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getAbsoluteValue-UwyO8pc", "absoluteValue", "getHoursComponent-impl", "getHoursComponent$annotations", "()V", "hoursComponent", "getMinutesComponent-impl", "getMinutesComponent$annotations", "minutesComponent", "getSecondsComponent-impl", "getSecondsComponent$annotations", "secondsComponent", "getNanosecondsComponent-impl", "getNanosecondsComponent$annotations", "nanosecondsComponent", "getInDays-impl", "(J)D", "getInDays$annotations", "inDays", "getInHours-impl", "getInHours$annotations", "inHours", "getInMinutes-impl", "getInMinutes$annotations", "inMinutes", "getInSeconds-impl", "getInSeconds$annotations", "inSeconds", "getInMilliseconds-impl", "getInMilliseconds$annotations", "inMilliseconds", "getInMicroseconds-impl", "getInMicroseconds$annotations", "inMicroseconds", "getInNanoseconds-impl", "getInNanoseconds$annotations", "inNanoseconds", "getInWholeDays-impl", "inWholeDays", "getInWholeHours-impl", "inWholeHours", "getInWholeMinutes-impl", "inWholeMinutes", "getInWholeSeconds-impl", "inWholeSeconds", "getInWholeMilliseconds-impl", "inWholeMilliseconds", "getInWholeMicroseconds-impl", "inWholeMicroseconds", "getInWholeNanoseconds-impl", "inWholeNanoseconds", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = {ExperimentalTime.class})
@JvmInline
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
public final class Duration implements Comparable {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000E\n\u0002\u0010\u000E\n\u0002\b$\b\u0086\u0003\u0018\u00002\u00020\u0001J\'\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\r\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\r\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\u000FJ\u001A\u0010\r\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\u0010J\u001A\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\fJ\u001A\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\fJ\u001A\u0010\u0014\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u000FJ\u001A\u0010\u0014\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0010J\u001A\u0010\u0016\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\fJ\u001A\u0010\u0016\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u000FJ\u001A\u0010\u0016\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0010J\u001A\u0010\u0018\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\fJ\u001A\u0010\u0018\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u000FJ\u001A\u0010\u0018\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0010J\u001A\u0010\u001A\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\fJ\u001A\u0010\u001A\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u000FJ\u001A\u0010\u001A\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u0010J\u001A\u0010\u001C\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\fJ\u001A\u0010\u001C\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u000FJ\u001A\u0010\u001C\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0010J\u0018\u0010 \u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u001D\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0018\u0010\"\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u001D\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\u001FJ\u001A\u0010%\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001A\u00020\u001D\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010\'\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001A\u00020\u001D\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010$R\u001A\u0010(\u001A\u00020\n8\u0006\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u001A\u0010,\u001A\u00020\n8\u0006\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b,\u0010)\u001A\u0004\b-\u0010+R\u001D\u0010.\u001A\u00020\n8\u0000X\u0080\u0004\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b.\u0010)\u001A\u0004\b/\u0010+R\"\u0010\r\u001A\u00020\n*\u00020\t8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b1\u00102\u001A\u0004\b0\u0010\fR\"\u0010\r\u001A\u00020\n*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b1\u00103\u001A\u0004\b0\u0010\u000FR\"\u0010\r\u001A\u00020\n*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b1\u00104\u001A\u0004\b0\u0010\u0010R\"\u0010\u0012\u001A\u00020\n*\u00020\t8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b6\u00102\u001A\u0004\b5\u0010\fR\"\u0010\u0012\u001A\u00020\n*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b6\u00103\u001A\u0004\b5\u0010\u000FR\"\u0010\u0012\u001A\u00020\n*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b6\u00104\u001A\u0004\b5\u0010\u0010R\"\u0010\u0014\u001A\u00020\n*\u00020\t8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b8\u00102\u001A\u0004\b7\u0010\fR\"\u0010\u0014\u001A\u00020\n*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b8\u00103\u001A\u0004\b7\u0010\u000FR\"\u0010\u0014\u001A\u00020\n*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b8\u00104\u001A\u0004\b7\u0010\u0010R\"\u0010\u0016\u001A\u00020\n*\u00020\t8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b:\u00102\u001A\u0004\b9\u0010\fR\"\u0010\u0016\u001A\u00020\n*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b:\u00103\u001A\u0004\b9\u0010\u000FR\"\u0010\u0016\u001A\u00020\n*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b:\u00104\u001A\u0004\b9\u0010\u0010R\"\u0010\u0018\u001A\u00020\n*\u00020\t8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b<\u00102\u001A\u0004\b;\u0010\fR\"\u0010\u0018\u001A\u00020\n*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b<\u00103\u001A\u0004\b;\u0010\u000FR\"\u0010\u0018\u001A\u00020\n*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b<\u00104\u001A\u0004\b;\u0010\u0010R\"\u0010\u001A\u001A\u00020\n*\u00020\t8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b>\u00102\u001A\u0004\b=\u0010\fR\"\u0010\u001A\u001A\u00020\n*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b>\u00103\u001A\u0004\b=\u0010\u000FR\"\u0010\u001A\u001A\u00020\n*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b>\u00104\u001A\u0004\b=\u0010\u0010R\"\u0010\u001C\u001A\u00020\n*\u00020\t8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b@\u00102\u001A\u0004\b?\u0010\fR\"\u0010\u001C\u001A\u00020\n*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b@\u00103\u001A\u0004\b?\u0010\u000FR\"\u0010\u001C\u001A\u00020\n*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b@\u00104\u001A\u0004\b?\u0010\u0010\u0082\u0002\u0004\n\u0002\b!\u00A8\u0006A"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "", "value", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "convert", "(DLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)D", "", "Lkotlin/time/Duration;", "nanoseconds-UwyO8pc", "(I)J", "nanoseconds", "", "(J)J", "(D)J", "microseconds-UwyO8pc", "microseconds", "milliseconds-UwyO8pc", "milliseconds", "seconds-UwyO8pc", "seconds", "minutes-UwyO8pc", "minutes", "hours-UwyO8pc", "hours", "days-UwyO8pc", "days", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parse", "parseIsoString-UwyO8pc", "parseIsoString", "parseOrNull-FghU774", "(Ljava/lang/String;)Lkotlin/time/Duration;", "parseOrNull", "parseIsoStringOrNull-FghU774", "parseIsoStringOrNull", "ZERO", "J", "getZERO-UwyO8pc", "()J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "getNanoseconds-UwyO8pc", "getNanoseconds-UwyO8pc$annotations", "(I)V", "(J)V", "(D)V", "getMicroseconds-UwyO8pc", "getMicroseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "getMilliseconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "getSeconds-UwyO8pc$annotations", "getMinutes-UwyO8pc", "getMinutes-UwyO8pc$annotations", "getHours-UwyO8pc", "getHours-UwyO8pc$annotations", "getDays-UwyO8pc", "getDays-UwyO8pc$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @ExperimentalTime
        public final double convert(double f, @NotNull DurationUnit durationUnit0, @NotNull DurationUnit durationUnit1) {
            Intrinsics.checkNotNullParameter(durationUnit0, "sourceUnit");
            Intrinsics.checkNotNullParameter(durationUnit1, "targetUnit");
            return a.convertDurationUnit(f, durationUnit0, durationUnit1);
        }

        @Deprecated(message = "Use \'Double.days\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long days-UwyO8pc(double f) {
            return DurationKt.toDuration(f, DurationUnit.DAYS);
        }

        @Deprecated(message = "Use \'Int.days\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long days-UwyO8pc(int v) {
            return DurationKt.toDuration(v, DurationUnit.DAYS);
        }

        @Deprecated(message = "Use \'Long.days\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long days-UwyO8pc(long v) {
            return DurationKt.toDuration(v, DurationUnit.DAYS);
        }

        @InlineOnly
        public static void getDays-UwyO8pc$annotations(double f) {
        }

        @InlineOnly
        public static void getDays-UwyO8pc$annotations(int v) {
        }

        @InlineOnly
        public static void getDays-UwyO8pc$annotations(long v) {
        }

        @InlineOnly
        public static void getHours-UwyO8pc$annotations(double f) {
        }

        @InlineOnly
        public static void getHours-UwyO8pc$annotations(int v) {
        }

        @InlineOnly
        public static void getHours-UwyO8pc$annotations(long v) {
        }

        // 去混淆评级： 低(20)
        public final long getINFINITE-UwyO8pc() [...] // 潜在的解密器

        @InlineOnly
        public static void getMicroseconds-UwyO8pc$annotations(double f) {
        }

        @InlineOnly
        public static void getMicroseconds-UwyO8pc$annotations(int v) {
        }

        @InlineOnly
        public static void getMicroseconds-UwyO8pc$annotations(long v) {
        }

        @InlineOnly
        public static void getMilliseconds-UwyO8pc$annotations(double f) {
        }

        @InlineOnly
        public static void getMilliseconds-UwyO8pc$annotations(int v) {
        }

        @InlineOnly
        public static void getMilliseconds-UwyO8pc$annotations(long v) {
        }

        @InlineOnly
        public static void getMinutes-UwyO8pc$annotations(double f) {
        }

        @InlineOnly
        public static void getMinutes-UwyO8pc$annotations(int v) {
        }

        @InlineOnly
        public static void getMinutes-UwyO8pc$annotations(long v) {
        }

        // 去混淆评级： 低(20)
        public final long getNEG_INFINITE-UwyO8pc$kotlin_stdlib() [...] // 潜在的解密器

        @InlineOnly
        public static void getNanoseconds-UwyO8pc$annotations(double f) {
        }

        @InlineOnly
        public static void getNanoseconds-UwyO8pc$annotations(int v) {
        }

        @InlineOnly
        public static void getNanoseconds-UwyO8pc$annotations(long v) {
        }

        @InlineOnly
        public static void getSeconds-UwyO8pc$annotations(double f) {
        }

        @InlineOnly
        public static void getSeconds-UwyO8pc$annotations(int v) {
        }

        @InlineOnly
        public static void getSeconds-UwyO8pc$annotations(long v) {
        }

        // 去混淆评级： 低(20)
        public final long getZERO-UwyO8pc() [...] // 潜在的解密器

        @Deprecated(message = "Use \'Double.hours\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long hours-UwyO8pc(double f) {
            return DurationKt.toDuration(f, DurationUnit.HOURS);
        }

        @Deprecated(message = "Use \'Int.hours\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long hours-UwyO8pc(int v) {
            return DurationKt.toDuration(v, DurationUnit.HOURS);
        }

        @Deprecated(message = "Use \'Long.hours\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long hours-UwyO8pc(long v) {
            return DurationKt.toDuration(v, DurationUnit.HOURS);
        }

        @Deprecated(message = "Use \'Double.microseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long microseconds-UwyO8pc(double f) {
            return DurationKt.toDuration(f, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use \'Int.microseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long microseconds-UwyO8pc(int v) {
            return DurationKt.toDuration(v, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use \'Long.microseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long microseconds-UwyO8pc(long v) {
            return DurationKt.toDuration(v, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use \'Double.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long milliseconds-UwyO8pc(double f) {
            return DurationKt.toDuration(f, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use \'Int.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long milliseconds-UwyO8pc(int v) {
            return DurationKt.toDuration(v, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use \'Long.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long milliseconds-UwyO8pc(long v) {
            return DurationKt.toDuration(v, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use \'Double.minutes\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long minutes-UwyO8pc(double f) {
            return DurationKt.toDuration(f, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use \'Int.minutes\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long minutes-UwyO8pc(int v) {
            return DurationKt.toDuration(v, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use \'Long.minutes\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long minutes-UwyO8pc(long v) {
            return DurationKt.toDuration(v, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use \'Double.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long nanoseconds-UwyO8pc(double f) {
            return DurationKt.toDuration(f, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message = "Use \'Int.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long nanoseconds-UwyO8pc(int v) {
            return DurationKt.toDuration(v, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message = "Use \'Long.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long nanoseconds-UwyO8pc(long v) {
            return DurationKt.toDuration(v, DurationUnit.NANOSECONDS);
        }

        public final long parse-UwyO8pc(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            try {
                return DurationKt.access$parseDuration(s, false);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new IllegalArgumentException(wb.a.d("Invalid duration string format: \'", s, "\'."), illegalArgumentException0);
            }
        }

        public final long parseIsoString-UwyO8pc(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            try {
                return DurationKt.access$parseDuration(s, true);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new IllegalArgumentException("Invalid ISO duration string format: \'" + s + "\'.", illegalArgumentException0);
            }
        }

        @Nullable
        public final Duration parseIsoStringOrNull-FghU774(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            try {
                return Duration.box-impl(DurationKt.access$parseDuration(s, true));
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }

        @Nullable
        public final Duration parseOrNull-FghU774(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "value");
            try {
                return Duration.box-impl(DurationKt.access$parseDuration(s, false));
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }

        @Deprecated(message = "Use \'Double.seconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long seconds-UwyO8pc(double f) {
            return DurationKt.toDuration(f, DurationUnit.SECONDS);
        }

        @Deprecated(message = "Use \'Int.seconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long seconds-UwyO8pc(int v) {
            return DurationKt.toDuration(v, DurationUnit.SECONDS);
        }

        @Deprecated(message = "Use \'Long.seconds\' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @SinceKotlin(version = "1.5")
        @ExperimentalTime
        public final long seconds-UwyO8pc(long v) {
            return DurationKt.toDuration(v, DurationUnit.SECONDS);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public static final long b;
    public static final long c;
    public static final long d;

    static {
        Duration.Companion = new Companion(null);
        Duration.b = Duration.constructor-impl(0L);
        Duration.c = DurationKt.access$durationOfMillis(0x3FFFFFFFFFFFFFFFL);
        Duration.d = DurationKt.access$durationOfMillis(0xC000000000000001L);
    }

    public Duration(long v) {
        this.a = v;
    }

    public static final long a(long v, long v1) {
        long v2 = v + v1 / 1000000L;
        return new LongRange(-4611686018426L, 4611686018426L).contains(v2) ? DurationKt.access$durationOfNanos(v2 * 1000000L + (v1 - v1 / 1000000L * 1000000L)) : DurationKt.access$durationOfMillis(c.coerceIn(v2, 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL));
    }

    public static final long access$getINFINITE$cp() [...] // 潜在的解密器

    public static final long access$getNEG_INFINITE$cp() [...] // 潜在的解密器

    public static final long access$getZERO$cp() [...] // 潜在的解密器

    public static final void b(StringBuilder stringBuilder0, int v, int v1, int v2, String s, boolean z) {
        stringBuilder0.append(v);
        if(v1 != 0) {
            stringBuilder0.append('.');
            String s1 = StringsKt__StringsKt.padStart(String.valueOf(v1), v2, '0');
            int v3 = -1;
            int v4 = s1.length() - 1;
            if(v4 >= 0) {
                while(true) {
                    if(s1.charAt(v4) != 0x30) {
                        v3 = v4;
                        break;
                    }
                    if(v4 - 1 < 0) {
                        break;
                    }
                    --v4;
                }
            }
            if(z || v3 + 1 >= 3) {
                stringBuilder0.append(s1, 0, (v3 + 3) / 3 * 3);
            }
            else {
                stringBuilder0.append(s1, 0, v3 + 1);
            }
            Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
        }
        stringBuilder0.append(s);
    }

    public static final Duration box-impl(long v) {
        return new Duration(v);
    }

    // 去混淆评级： 低(20)
    public static final DurationUnit c(long v) {
        return Duration.d(v) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo-LRDsOJo(((Duration)object0).unbox-impl());
    }

    public static int compareTo-LRDsOJo(long v, long v1) {
        if((v ^ v1) >= 0L && (((int)(v ^ v1)) & 1) != 0) {
            int v2 = (((int)v) & 1) - (((int)v1) & 1);
            return Duration.isNegative-impl(v) ? -v2 : v2;
        }
        return Intrinsics.compare(v, v1);
    }

    public int compareTo-LRDsOJo(long v) {
        return Duration.compareTo-LRDsOJo(this.a, v);
    }

    public static long constructor-impl(long v) {
        return v;
    }

    public static final boolean d(long v) {
        return (((int)v) & 1) == 0;
    }

    public static final double div-LRDsOJo(long v, long v1) {
        DurationUnit durationUnit0 = (DurationUnit)d.maxOf(Duration.c(v), Duration.c(v1));
        return Duration.toDouble-impl(v, durationUnit0) / Duration.toDouble-impl(v1, durationUnit0);
    }

    public static final long div-UwyO8pc(long v, double f) {
        int v1 = zd.c.roundToInt(f);
        if(((double)v1) == f && v1 != 0) {
            return Duration.div-UwyO8pc(v, v1);
        }
        DurationUnit durationUnit0 = Duration.c(v);
        return DurationKt.toDuration(Duration.toDouble-impl(v, durationUnit0) / f, durationUnit0);
    }

    public static final long div-UwyO8pc(long v, int v1) {
        if(v1 == 0) {
            if(Duration.isPositive-impl(v)) {
                return Duration.c;
            }
            if(!Duration.isNegative-impl(v)) {
                throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
            }
            return Duration.d;
        }
        if(Duration.d(v)) {
            return DurationKt.access$durationOfNanos((v >> 1) / ((long)v1));
        }
        if(Duration.isInfinite-impl(v)) {
            return Duration.times-UwyO8pc(v, zd.c.getSign(v1));
        }
        long v2 = (v >> 1) / ((long)v1);
        return new LongRange(-4611686018426L, 4611686018426L).contains(v2) ? DurationKt.access$durationOfNanos(v2 * 1000000L + ((v >> 1) - v2 * ((long)v1)) * 1000000L / ((long)v1)) : DurationKt.access$durationOfMillis(v2);
    }

    @Override
    public boolean equals(Object object0) {
        return Duration.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Duration ? v == ((Duration)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    // 去混淆评级： 低(20)
    public static final long getAbsoluteValue-UwyO8pc(long v) {
        return Duration.isNegative-impl(v) ? Duration.unaryMinus-UwyO8pc(v) : v;
    }

    @PublishedApi
    public static void getHoursComponent$annotations() {
    }

    // 去混淆评级： 低(20)
    public static final int getHoursComponent-impl(long v) {
        return Duration.isInfinite-impl(v) ? 0 : ((int)(Duration.getInWholeHours-impl(v) % 24L));
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static void getInDays$annotations() {
    }

    public static final double getInDays-impl(long v) {
        return Duration.toDouble-impl(v, DurationUnit.DAYS);
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static void getInHours$annotations() {
    }

    public static final double getInHours-impl(long v) {
        return Duration.toDouble-impl(v, DurationUnit.HOURS);
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static void getInMicroseconds$annotations() {
    }

    public static final double getInMicroseconds-impl(long v) {
        return Duration.toDouble-impl(v, DurationUnit.MICROSECONDS);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static void getInMilliseconds$annotations() {
    }

    public static final double getInMilliseconds-impl(long v) {
        return Duration.toDouble-impl(v, DurationUnit.MILLISECONDS);
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static void getInMinutes$annotations() {
    }

    public static final double getInMinutes-impl(long v) {
        return Duration.toDouble-impl(v, DurationUnit.MINUTES);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static void getInNanoseconds$annotations() {
    }

    public static final double getInNanoseconds-impl(long v) {
        return Duration.toDouble-impl(v, DurationUnit.NANOSECONDS);
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static void getInSeconds$annotations() {
    }

    public static final double getInSeconds-impl(long v) {
        return Duration.toDouble-impl(v, DurationUnit.SECONDS);
    }

    public static final long getInWholeDays-impl(long v) {
        return Duration.toLong-impl(v, DurationUnit.DAYS);
    }

    public static final long getInWholeHours-impl(long v) {
        return Duration.toLong-impl(v, DurationUnit.HOURS);
    }

    public static final long getInWholeMicroseconds-impl(long v) {
        return Duration.toLong-impl(v, DurationUnit.MICROSECONDS);
    }

    public static final long getInWholeMilliseconds-impl(long v) {
        return (((int)v) & 1) != 1 || !Duration.isFinite-impl(v) ? Duration.toLong-impl(v, DurationUnit.MILLISECONDS) : v >> 1;
    }

    public static final long getInWholeMinutes-impl(long v) {
        return Duration.toLong-impl(v, DurationUnit.MINUTES);
    }

    public static final long getInWholeNanoseconds-impl(long v) {
        if(!Duration.d(v)) {
            if(v >> 1 > 0x8637BD05AF6L) {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            return v >> 1 >= 0xFFFFF79C842FA50AL ? (v >> 1) * 1000000L : 0x8000000000000000L;
        }
        return v >> 1;
    }

    public static final long getInWholeSeconds-impl(long v) {
        return Duration.toLong-impl(v, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static void getMinutesComponent$annotations() {
    }

    // 去混淆评级： 低(20)
    public static final int getMinutesComponent-impl(long v) {
        return Duration.isInfinite-impl(v) ? 0 : ((int)(Duration.getInWholeMinutes-impl(v) % 60L));
    }

    @PublishedApi
    public static void getNanosecondsComponent$annotations() {
    }

    public static final int getNanosecondsComponent-impl(long v) {
        if(!Duration.isInfinite-impl(v)) {
            return (((int)v) & 1) == 1 ? ((int)((v >> 1) % 1000L * 1000000L)) : ((int)((v >> 1) % 1000000000L));
        }
        return 0;
    }

    @PublishedApi
    public static void getSecondsComponent$annotations() {
    }

    // 去混淆评级： 低(20)
    public static final int getSecondsComponent-impl(long v) {
        return Duration.isInfinite-impl(v) ? 0 : ((int)(Duration.getInWholeSeconds-impl(v) % 60L));
    }

    @Override
    public int hashCode() {
        return Duration.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    public static final boolean isFinite-impl(long v) {
        return !Duration.isInfinite-impl(v);
    }

    public static final boolean isInfinite-impl(long v) {
        return v == 0x7FFFFFFFFFFFFFFFL || v == Duration.d;
    }

    public static final boolean isNegative-impl(long v) {
        return v < 0L;
    }

    public static final boolean isPositive-impl(long v) {
        return v > 0L;
    }

    public static final long minus-LRDsOJo(long v, long v1) {
        return Duration.plus-LRDsOJo(v, Duration.unaryMinus-UwyO8pc(v1));
    }

    public static final long plus-LRDsOJo(long v, long v1) {
        if(Duration.isInfinite-impl(v)) {
            if(!Duration.isFinite-impl(v1) && (v1 ^ v) < 0L) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return v;
        }
        if(Duration.isInfinite-impl(v1)) {
            return v1;
        }
        if((((int)v) & 1) == (((int)v1) & 1)) {
            long v2 = (v >> 1) + (v1 >> 1);
            return Duration.d(v) ? DurationKt.access$durationOfNanosNormalized(v2) : DurationKt.a(v2);
        }
        return (((int)v) & 1) == 1 ? Duration.a(v >> 1, v1 >> 1) : Duration.a(v1 >> 1, v >> 1);
    }

    public static final long times-UwyO8pc(long v, double f) {
        int v1 = zd.c.roundToInt(f);
        if(((double)v1) == f) {
            return Duration.times-UwyO8pc(v, v1);
        }
        DurationUnit durationUnit0 = Duration.c(v);
        return DurationKt.toDuration(Duration.toDouble-impl(v, durationUnit0) * f, durationUnit0);
    }

    public static final long times-UwyO8pc(long v, int v1) {
        if(Duration.isInfinite-impl(v)) {
            if(v1 == 0) {
                throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
            }
            return v1 <= 0 ? Duration.unaryMinus-UwyO8pc(v) : v;
        }
        if(v1 == 0) {
            return 0L;
        }
        long v2 = (v >> 1) * ((long)v1);
        long v3 = Duration.d;
        if(Duration.d(v)) {
            if(new LongRange(0xFFFFFFFF80000001L, 0x7FFFFFFFL).contains(v >> 1)) {
                return DurationKt.b(v2);
            }
            if(v2 / ((long)v1) == v >> 1) {
                return DurationKt.access$durationOfNanosNormalized(v2);
            }
            long v4 = (v >> 1) / 1000000L;
            long v5 = v4 * ((long)v1);
            long v6 = ((v >> 1) - v4 * 1000000L) * ((long)v1) / 1000000L + v5;
            if(v5 / ((long)v1) == v4 && (v6 ^ v5) >= 0L) {
                return DurationKt.access$durationOfMillis(c.coerceIn(v6, new LongRange(0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)));
            }
            return zd.c.getSign(v1) * zd.c.getSign(v >> 1) <= 0 ? v3 : 0x7FFFFFFFFFFFFFFFL;
        }
        if(v2 / ((long)v1) == v >> 1) {
            return DurationKt.access$durationOfMillis(c.coerceIn(v2, new LongRange(0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)));
        }
        return zd.c.getSign(v1) * zd.c.getSign(v >> 1) > 0 ? 0x7FFFFFFFFFFFFFFFL : v3;
    }

    public static final Object toComponents-impl(long v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "action");
        return function20.invoke(Duration.getInWholeSeconds-impl(v), Duration.getNanosecondsComponent-impl(v));
    }

    public static final Object toComponents-impl(long v, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "action");
        return function30.invoke(Duration.getInWholeMinutes-impl(v), Duration.getSecondsComponent-impl(v), Duration.getNanosecondsComponent-impl(v));
    }

    public static final Object toComponents-impl(long v, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(function40, "action");
        return function40.invoke(Duration.getInWholeHours-impl(v), Duration.getMinutesComponent-impl(v), Duration.getSecondsComponent-impl(v), Duration.getNanosecondsComponent-impl(v));
    }

    public static final Object toComponents-impl(long v, @NotNull Function5 function50) {
        Intrinsics.checkNotNullParameter(function50, "action");
        return function50.invoke(Duration.getInWholeDays-impl(v), Duration.getHoursComponent-impl(v), Duration.getMinutesComponent-impl(v), Duration.getSecondsComponent-impl(v), Duration.getNanosecondsComponent-impl(v));
    }

    public static final double toDouble-impl(long v, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            return Infinity;
        }
        return v == Duration.d ? -Infinity : a.convertDurationUnit(v >> 1, Duration.c(v), durationUnit0);
    }

    public static final int toInt-impl(long v, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        return (int)c.coerceIn(Duration.toLong-impl(v, durationUnit0), 0xFFFFFFFF80000000L, 0x7FFFFFFFL);
    }

    @NotNull
    public static final String toIsoString-impl(long v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(Duration.isNegative-impl(v)) {
            stringBuilder0.append('-');
        }
        stringBuilder0.append("PT");
        long v1 = Duration.getAbsoluteValue-UwyO8pc(v);
        long v2 = Duration.getInWholeHours-impl(v1);
        int v3 = Duration.getMinutesComponent-impl(v1);
        int v4 = Duration.getSecondsComponent-impl(v1);
        int v5 = Duration.getNanosecondsComponent-impl(v1);
        if(Duration.isInfinite-impl(v)) {
            v2 = 0x9184E729FFFL;
        }
        boolean z = false;
        boolean z1 = Long.compare(v2, 0L) != 0;
        boolean z2 = v4 != 0 || v5 != 0;
        if(v3 != 0 || z2 && z1) {
            z = true;
        }
        if(z1) {
            stringBuilder0.append(v2);
            stringBuilder0.append('H');
        }
        if(z) {
            stringBuilder0.append(v3);
            stringBuilder0.append('M');
        }
        if(z2 || !z1 && !z) {
            Duration.b(stringBuilder0, v4, v5, 9, "S", true);
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    public static final long toLong-impl(long v, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return v == Duration.d ? 0x8000000000000000L : a.convertDurationUnit(v >> 1, Duration.c(v), durationUnit0);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static final long toLongMilliseconds-impl(long v) {
        return Duration.getInWholeMilliseconds-impl(v);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static final long toLongNanoseconds-impl(long v) {
        return Duration.getInWholeNanoseconds-impl(v);
    }

    @Override
    @NotNull
    public String toString() {
        return Duration.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(long v) {
        if(v == 0L) {
            return "0s";
        }
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            return "Infinity";
        }
        if(v == Duration.d) {
            return "-Infinity";
        }
        boolean z = Duration.isNegative-impl(v);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            stringBuilder0.append('-');
        }
        long v1 = Duration.getAbsoluteValue-UwyO8pc(v);
        long v2 = Duration.getInWholeDays-impl(v1);
        int v3 = Duration.getHoursComponent-impl(v1);
        int v4 = Duration.getMinutesComponent-impl(v1);
        int v5 = Duration.getSecondsComponent-impl(v1);
        int v6 = Duration.getNanosecondsComponent-impl(v1);
        int v7 = 0;
        boolean z1 = Long.compare(v2, 0L) != 0;
        boolean z2 = v5 != 0 || v6 != 0;
        if(z1) {
            stringBuilder0.append(v2);
            stringBuilder0.append('d');
            v7 = 1;
        }
        if(v3 != 0 || z1 && (v4 != 0 || z2)) {
            if(v7 > 0) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append(v3);
            stringBuilder0.append('h');
            ++v7;
        }
        if(v4 != 0 || z2 && (v3 != 0 || z1)) {
            if(v7 > 0) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append(v4);
            stringBuilder0.append('m');
            ++v7;
        }
        if(z2) {
            if(v7 > 0) {
                stringBuilder0.append(' ');
            }
            if(v5 != 0 || z1 || v3 != 0 || v4 != 0) {
                Duration.b(stringBuilder0, v5, v6, 9, "s", false);
            }
            else if(v6 >= 1000000) {
                Duration.b(stringBuilder0, v6 / 1000000, v6 % 1000000, 6, "ms", false);
            }
            else if(v6 >= 1000) {
                Duration.b(stringBuilder0, v6 / 1000, v6 % 1000, 3, "us", false);
            }
            else {
                stringBuilder0.append(v6);
                stringBuilder0.append("ns");
            }
            ++v7;
        }
        if(z && v7 > 1) {
            stringBuilder0.insert(1, '(').append(')');
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @NotNull
    public static final String toString-impl(long v, @NotNull DurationUnit durationUnit0, int v1) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        if(v1 < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + v1).toString());
        }
        double f = Duration.toDouble-impl(v, durationUnit0);
        return Double.isInfinite(f) ? String.valueOf(f) : DurationJvmKt.formatToExactDecimals(f, c.coerceAtMost(v1, 12)) + b.shortName(durationUnit0);
    }

    public static String toString-impl$default(long v, DurationUnit durationUnit0, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return Duration.toString-impl(v, durationUnit0, v1);
    }

    public static final long truncateTo-UwyO8pc$kotlin_stdlib(long v, @NotNull DurationUnit durationUnit0) {
        Intrinsics.checkNotNullParameter(durationUnit0, "unit");
        DurationUnit durationUnit1 = Duration.c(v);
        return durationUnit0.compareTo(durationUnit1) <= 0 || Duration.isInfinite-impl(v) ? v : DurationKt.toDuration((v >> 1) - (v >> 1) % a.convertDurationUnit(1L, durationUnit0, durationUnit1), durationUnit1);
    }

    public static final long unaryMinus-UwyO8pc(long v) {
        return DurationKt.access$durationOf(-(v >> 1), ((int)v) & 1);
    }

    public final long unbox-impl() {
        return this.a;
    }
}

