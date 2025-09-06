package androidx.compose.material3;

import a2.b;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@ExperimentalMaterial3Api
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b9\b\u0007\u0018\u00002\u00020\u0001B\u00CF\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u0002\u0012\u0006\u0010\u0010\u001A\u00020\u0002\u0012\u0006\u0010\u0011\u001A\u00020\u0002\u0012\u0006\u0010\u0012\u001A\u00020\u0002\u0012\u0006\u0010\u0013\u001A\u00020\u0002\u0012\u0006\u0010\u0014\u001A\u00020\u0002\u0012\u0006\u0010\u0015\u001A\u00020\u0002\u0012\u0006\u0010\u0016\u001A\u00020\u0002\u0012\u0006\u0010\u0017\u001A\u00020\u0002\u0012\u0006\u0010\u0018\u001A\u00020\u0002\u0012\u0006\u0010\u0019\u001A\u00020\u0002\u0012\u0006\u0010\u001A\u001A\u00020\u0002\u0012\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u008C\u0002\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00022\b\b\u0002\u0010\u0015\u001A\u00020\u00022\b\b\u0002\u0010\u0016\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u00022\b\b\u0002\u0010\u0018\u001A\u00020\u00022\b\b\u0002\u0010\u0019\u001A\u00020\u00022\b\b\u0002\u0010\u001A\u001A\u00020\u00022\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J#\u0010&\u001A\u00020\u001B*\u0004\u0018\u00010\u001B2\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\u001B0\"H\u0000\u00A2\u0006\u0004\b$\u0010%J5\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'H\u0001\u00A2\u0006\u0004\b-\u0010.J-\u00102\u001A\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010)\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'2\u0006\u0010/\u001A\u00020\'H\u0001\u00A2\u0006\u0004\b0\u00101J-\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u00103\u001A\u00020\'2\u0006\u0010)\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'H\u0001\u00A2\u0006\u0004\b4\u00101J%\u00107\u001A\b\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010)\u001A\u00020\'2\u0006\u0010+\u001A\u00020\'H\u0001\u00A2\u0006\u0004\b5\u00106J\u001A\u00109\u001A\u00020\'2\b\u00108\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b9\u0010:J\u000F\u0010<\u001A\u00020;H\u0016\u00A2\u0006\u0004\b<\u0010=R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010AR\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bB\u0010?\u001A\u0004\bC\u0010AR\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bD\u0010?\u001A\u0004\bE\u0010AR\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bF\u0010?\u001A\u0004\bG\u0010AR\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bH\u0010?\u001A\u0004\bI\u0010AR\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bJ\u0010?\u001A\u0004\bK\u0010AR\u001D\u0010\t\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bL\u0010?\u001A\u0004\bM\u0010AR\u001D\u0010\n\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bN\u0010?\u001A\u0004\bO\u0010AR\u001D\u0010\u000B\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bP\u0010?\u001A\u0004\bQ\u0010AR\u001D\u0010\f\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bR\u0010?\u001A\u0004\bS\u0010AR\u001D\u0010\r\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bT\u0010?\u001A\u0004\bU\u0010AR\u001D\u0010\u000E\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bV\u0010?\u001A\u0004\bW\u0010AR\u001D\u0010\u000F\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bX\u0010?\u001A\u0004\bY\u0010AR\u001D\u0010\u0010\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bZ\u0010?\u001A\u0004\b[\u0010AR\u001D\u0010\u0011\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\\\u0010?\u001A\u0004\b]\u0010AR\u001D\u0010\u0012\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b^\u0010?\u001A\u0004\b_\u0010AR\u001D\u0010\u0013\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b`\u0010?\u001A\u0004\ba\u0010AR\u001D\u0010\u0014\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bb\u0010?\u001A\u0004\bc\u0010AR\u001D\u0010\u0015\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bd\u0010?\u001A\u0004\be\u0010AR\u001D\u0010\u0016\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bf\u0010?\u001A\u0004\bg\u0010AR\u001D\u0010\u0017\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bh\u0010?\u001A\u0004\bi\u0010AR\u001D\u0010\u0018\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bj\u0010?\u001A\u0004\bk\u0010AR\u001D\u0010\u0019\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bl\u0010?\u001A\u0004\bm\u0010AR\u001D\u0010\u001A\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bn\u0010?\u001A\u0004\bo\u0010AR\u0017\u0010\u001C\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\bp\u0010q\u001A\u0004\br\u0010s\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006t"}, d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "dateTextFieldColors", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-tNwlRmA", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;)Landroidx/compose/material3/DatePickerColors;", "copy", "Lkotlin/Function0;", "block", "takeOrElse$material3_release", "(Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function0;)Landroidx/compose/material3/TextFieldColors;", "takeOrElse", "", "isToday", "selected", "inRange", "enabled", "Landroidx/compose/runtime/State;", "dayContentColor$material3_release", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animate", "dayContainerColor$material3_release", "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "dayContainerColor", "currentYear", "yearContentColor$material3_release", "yearContainerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "yearContainerColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getContainerColor-0d7_KjU", "()J", "b", "getTitleContentColor-0d7_KjU", "c", "getHeadlineContentColor-0d7_KjU", "d", "getWeekdayContentColor-0d7_KjU", "e", "getSubheadContentColor-0d7_KjU", "f", "getNavigationContentColor-0d7_KjU", "g", "getYearContentColor-0d7_KjU", "h", "getDisabledYearContentColor-0d7_KjU", "i", "getCurrentYearContentColor-0d7_KjU", "j", "getSelectedYearContentColor-0d7_KjU", "k", "getDisabledSelectedYearContentColor-0d7_KjU", "l", "getSelectedYearContainerColor-0d7_KjU", "m", "getDisabledSelectedYearContainerColor-0d7_KjU", "n", "getDayContentColor-0d7_KjU", "o", "getDisabledDayContentColor-0d7_KjU", "p", "getSelectedDayContentColor-0d7_KjU", "q", "getDisabledSelectedDayContentColor-0d7_KjU", "r", "getSelectedDayContainerColor-0d7_KjU", "s", "getDisabledSelectedDayContainerColor-0d7_KjU", "t", "getTodayContentColor-0d7_KjU", "u", "getTodayDateBorderColor-0d7_KjU", "v", "getDayInSelectionRangeContainerColor-0d7_KjU", "w", "getDayInSelectionRangeContentColor-0d7_KjU", "x", "getDividerColor-0d7_KjU", "y", "Landroidx/compose/material3/TextFieldColors;", "getDateTextFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2252:1\n708#2:2253\n696#2:2254\n708#2:2255\n696#2:2256\n708#2:2257\n696#2:2258\n708#2:2259\n696#2:2260\n708#2:2261\n696#2:2262\n708#2:2263\n696#2:2264\n708#2:2265\n696#2:2266\n708#2:2267\n696#2:2268\n708#2:2269\n696#2:2270\n708#2:2271\n696#2:2272\n708#2:2273\n696#2:2274\n708#2:2275\n696#2:2276\n708#2:2277\n696#2:2278\n708#2:2279\n696#2:2280\n708#2:2281\n696#2:2282\n708#2:2283\n696#2:2284\n708#2:2285\n696#2:2286\n708#2:2287\n696#2:2288\n708#2:2289\n696#2:2290\n708#2:2291\n696#2:2292\n708#2:2293\n696#2:2294\n708#2:2295\n696#2:2296\n708#2:2297\n696#2:2298\n708#2:2299\n696#2:2300\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n*L\n852#1:2253\n852#1:2254\n853#1:2255\n853#1:2256\n854#1:2257\n854#1:2258\n855#1:2259\n855#1:2260\n856#1:2261\n856#1:2262\n857#1:2263\n857#1:2264\n858#1:2265\n858#1:2266\n859#1:2267\n859#1:2268\n860#1:2269\n860#1:2270\n861#1:2271\n861#1:2272\n862#1:2273\n862#1:2274\n863#1:2275\n863#1:2276\n864#1:2277\n864#1:2278\n867#1:2279\n867#1:2280\n868#1:2281\n868#1:2282\n869#1:2283\n869#1:2284\n870#1:2285\n870#1:2286\n871#1:2287\n871#1:2288\n872#1:2289\n872#1:2290\n873#1:2291\n873#1:2292\n874#1:2293\n874#1:2294\n875#1:2295\n875#1:2296\n876#1:2297\n876#1:2298\n877#1:2299\n877#1:2300\n*E\n"})
public final class DatePickerColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final TextFieldColors y;

    public DatePickerColors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, TextFieldColors textFieldColors0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
        this.j = v9;
        this.k = v10;
        this.l = v11;
        this.m = v12;
        this.n = v13;
        this.o = v14;
        this.p = v15;
        this.q = v16;
        this.r = v17;
        this.s = v18;
        this.t = v19;
        this.u = v20;
        this.v = v21;
        this.w = v22;
        this.x = v23;
        this.y = textFieldColors0;
    }

    @NotNull
    public final DatePickerColors copy-tNwlRmA(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, @Nullable TextFieldColors textFieldColors0) {
        long v24 = v == 16L ? this.a : v;
        long v25 = v1 == 16L ? this.b : v1;
        long v26 = v2 == 16L ? this.c : v2;
        long v27 = v3 == 16L ? this.d : v3;
        long v28 = v4 == 16L ? this.e : v4;
        long v29 = v5 == 16L ? this.f : v5;
        long v30 = v6 == 16L ? this.g : v6;
        long v31 = v7 == 16L ? this.h : v7;
        long v32 = v8 == 16L ? this.i : v8;
        long v33 = v9 == 16L ? this.j : v9;
        long v34 = v10 == 16L ? this.k : v10;
        long v35 = v11 == 16L ? this.l : v11;
        long v36 = v12 == 16L ? this.m : v12;
        long v37 = v13 == 16L ? this.n : v13;
        long v38 = v14 == 16L ? this.o : v14;
        long v39 = v15 == 16L ? this.p : v15;
        long v40 = v16 == 16L ? this.q : v16;
        long v41 = v17 == 16L ? this.r : v17;
        long v42 = v18 == 16L ? this.s : v18;
        long v43 = v19 == 16L ? this.t : v19;
        long v44 = v20 == 16L ? this.u : v20;
        long v45 = v21 == 16L ? this.v : v21;
        long v46 = v22 == 16L ? this.w : v22;
        return v23 == 16L ? new DatePickerColors(v24, v25, v26, v27, v28, v29, v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, this.x, this.takeOrElse$material3_release(textFieldColors0, new b(this, 6)), null) : new DatePickerColors(v24, v25, v26, v27, v28, v29, v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v23, this.takeOrElse$material3_release(textFieldColors0, new b(this, 6)), null);
    }

    public static DatePickerColors copy-tNwlRmA$default(DatePickerColors datePickerColors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, TextFieldColors textFieldColors0, int v24, Object object0) {
        long v25 = (v24 & 1) == 0 ? v : datePickerColors0.a;
        long v26 = (v24 & 2) == 0 ? v1 : datePickerColors0.b;
        long v27 = (v24 & 4) == 0 ? v2 : datePickerColors0.c;
        long v28 = (v24 & 8) == 0 ? v3 : datePickerColors0.d;
        long v29 = (v24 & 16) == 0 ? v4 : datePickerColors0.e;
        long v30 = (v24 & 0x20) == 0 ? v5 : datePickerColors0.f;
        long v31 = (v24 & 0x40) == 0 ? v6 : datePickerColors0.g;
        long v32 = (v24 & 0x80) == 0 ? v7 : datePickerColors0.h;
        long v33 = (v24 & 0x100) == 0 ? v8 : datePickerColors0.i;
        long v34 = (v24 & 0x200) == 0 ? v9 : datePickerColors0.j;
        long v35 = (v24 & 0x400) == 0 ? v10 : datePickerColors0.k;
        long v36 = (v24 & 0x800) == 0 ? v11 : datePickerColors0.l;
        long v37 = (v24 & 0x1000) == 0 ? v12 : datePickerColors0.m;
        long v38 = (v24 & 0x2000) == 0 ? v13 : datePickerColors0.n;
        long v39 = (v24 & 0x4000) == 0 ? v14 : datePickerColors0.o;
        long v40 = (v24 & 0x8000) == 0 ? v15 : datePickerColors0.p;
        long v41 = (v24 & 0x10000) == 0 ? v16 : datePickerColors0.q;
        long v42 = (v24 & 0x20000) == 0 ? v17 : datePickerColors0.r;
        long v43 = (v24 & 0x40000) == 0 ? v18 : datePickerColors0.s;
        long v44 = (v24 & 0x80000) == 0 ? v19 : datePickerColors0.t;
        long v45 = (v24 & 0x100000) == 0 ? v20 : datePickerColors0.u;
        long v46 = (v24 & 0x200000) == 0 ? v21 : datePickerColors0.v;
        long v47 = (v24 & 0x400000) == 0 ? v22 : datePickerColors0.w;
        long v48 = (v24 & 0x800000) == 0 ? v23 : datePickerColors0.x;
        return (v24 & 0x1000000) == 0 ? datePickerColors0.copy-tNwlRmA(v25, v26, v27, v28, v29, v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, textFieldColors0) : datePickerColors0.copy-tNwlRmA(v25, v26, v27, v28, v29, v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, datePickerColors0.y);
    }

    @Composable
    @NotNull
    public final State dayContainerColor$material3_release(boolean z, boolean z1, boolean z2, @Nullable Composer composer0, int v) {
        State state0;
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB60FBC9E, v, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:929)");
        }
        if(!z) {
            v1 = Color.Companion.getTransparent-0d7_KjU();
        }
        else if(z1) {
            v1 = this.r;
        }
        else {
            v1 = this.s;
        }
        if(z2) {
            composer0.startReplaceGroup(0xF3087893);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer0, 0, 12);
        }
        else {
            composer0.startReplaceGroup(0xF30A3A8F);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public final State dayContentColor$material3_release(boolean z, boolean z1, boolean z2, boolean z3, @Nullable Composer composer0, int v) {
        State state0;
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB6774F3A, v, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:897)");
        }
        if(z1 && z3) {
            v1 = this.p;
        }
        else if(z1 && !z3) {
            v1 = this.q;
        }
        else if(!z2 || !z3) {
            v1 = this.o;
            if(!z2 || z3) {
                if(z) {
                    v1 = this.t;
                }
                else if(z3) {
                    v1 = this.n;
                }
            }
        }
        else {
            v1 = this.w;
        }
        if(z2) {
            composer0.startReplaceGroup(0xCE9E43C7);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        else {
            composer0.startReplaceGroup(0xCE9F353D);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer0, 0, 12);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(!(object0 instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors0 = (DatePickerColors)object0;
        if(!Color.equals-impl0(this.a, datePickerColors0.a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, datePickerColors0.b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, datePickerColors0.c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, datePickerColors0.d)) {
            return false;
        }
        if(!Color.equals-impl0(this.e, datePickerColors0.e)) {
            return false;
        }
        if(!Color.equals-impl0(this.g, datePickerColors0.g)) {
            return false;
        }
        if(!Color.equals-impl0(this.h, datePickerColors0.h)) {
            return false;
        }
        if(!Color.equals-impl0(this.i, datePickerColors0.i)) {
            return false;
        }
        if(!Color.equals-impl0(this.j, datePickerColors0.j)) {
            return false;
        }
        if(!Color.equals-impl0(this.k, datePickerColors0.k)) {
            return false;
        }
        if(!Color.equals-impl0(this.l, datePickerColors0.l)) {
            return false;
        }
        if(!Color.equals-impl0(this.m, datePickerColors0.m)) {
            return false;
        }
        if(!Color.equals-impl0(this.n, datePickerColors0.n)) {
            return false;
        }
        if(!Color.equals-impl0(this.o, datePickerColors0.o)) {
            return false;
        }
        if(!Color.equals-impl0(this.p, datePickerColors0.p)) {
            return false;
        }
        if(!Color.equals-impl0(this.q, datePickerColors0.q)) {
            return false;
        }
        if(!Color.equals-impl0(this.r, datePickerColors0.r)) {
            return false;
        }
        if(!Color.equals-impl0(this.s, datePickerColors0.s)) {
            return false;
        }
        if(!Color.equals-impl0(this.t, datePickerColors0.t)) {
            return false;
        }
        if(!Color.equals-impl0(this.u, datePickerColors0.u)) {
            return false;
        }
        return Color.equals-impl0(this.v, datePickerColors0.v) ? Color.equals-impl0(this.w, datePickerColors0.w) : false;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getCurrentYearContentColor-0d7_KjU() {
        return this.i;
    }

    @NotNull
    public final TextFieldColors getDateTextFieldColors() {
        return this.y;
    }

    public final long getDayContentColor-0d7_KjU() {
        return this.n;
    }

    public final long getDayInSelectionRangeContainerColor-0d7_KjU() {
        return this.v;
    }

    public final long getDayInSelectionRangeContentColor-0d7_KjU() {
        return this.w;
    }

    public final long getDisabledDayContentColor-0d7_KjU() {
        return this.o;
    }

    public final long getDisabledSelectedDayContainerColor-0d7_KjU() {
        return this.s;
    }

    public final long getDisabledSelectedDayContentColor-0d7_KjU() {
        return this.q;
    }

    public final long getDisabledSelectedYearContainerColor-0d7_KjU() {
        return this.m;
    }

    public final long getDisabledSelectedYearContentColor-0d7_KjU() {
        return this.k;
    }

    public final long getDisabledYearContentColor-0d7_KjU() {
        return this.h;
    }

    public final long getDividerColor-0d7_KjU() {
        return this.x;
    }

    public final long getHeadlineContentColor-0d7_KjU() {
        return this.c;
    }

    public final long getNavigationContentColor-0d7_KjU() {
        return this.f;
    }

    public final long getSelectedDayContainerColor-0d7_KjU() {
        return this.r;
    }

    public final long getSelectedDayContentColor-0d7_KjU() {
        return this.p;
    }

    public final long getSelectedYearContainerColor-0d7_KjU() {
        return this.l;
    }

    public final long getSelectedYearContentColor-0d7_KjU() {
        return this.j;
    }

    public final long getSubheadContentColor-0d7_KjU() {
        return this.e;
    }

    public final long getTitleContentColor-0d7_KjU() {
        return this.b;
    }

    public final long getTodayContentColor-0d7_KjU() {
        return this.t;
    }

    public final long getTodayDateBorderColor-0d7_KjU() {
        return this.u;
    }

    public final long getWeekdayContentColor-0d7_KjU() {
        return this.d;
    }

    public final long getYearContentColor-0d7_KjU() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.w) + a.a(this.v, a.a(this.u, a.a(this.t, a.a(this.s, a.a(this.r, a.a(this.q, a.a(this.p, a.a(this.o, a.a(this.n, a.a(this.m, a.a(this.l, a.a(this.k, a.a(this.j, a.a(this.i, a.a(this.h, a.a(this.g, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @NotNull
    public final TextFieldColors takeOrElse$material3_release(@Nullable TextFieldColors textFieldColors0, @NotNull Function0 function00) {
        return textFieldColors0 == null ? ((TextFieldColors)function00.invoke()) : textFieldColors0;
    }

    @Composable
    @NotNull
    public final State yearContainerColor$material3_release(boolean z, boolean z1, @Nullable Composer composer0, int v) {
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, v, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:978)");
        }
        if(!z) {
            v1 = Color.Companion.getTransparent-0d7_KjU();
        }
        else if(z1) {
            v1 = this.l;
        }
        else {
            v1 = this.m;
        }
        State state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer0, 0, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public final State yearContentColor$material3_release(boolean z, boolean z1, boolean z2, @Nullable Composer composer0, int v) {
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3419E079, v, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:955)");
        }
        if(z1 && z2) {
            v1 = this.j;
        }
        else if(z1 && !z2) {
            v1 = this.k;
        }
        else if(z) {
            v1 = this.i;
        }
        else {
            v1 = z2 ? this.g : this.h;
        }
        State state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer0, 0, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }
}

