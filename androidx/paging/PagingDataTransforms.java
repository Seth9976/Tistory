package androidx.paging;

import androidx.annotation.CheckResult;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s4.i1;
import s4.o1;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class PagingDataTransforms {
    @CheckResult
    @JvmName(name = "filter")
    @NotNull
    public static final PagingData filter(@NotNull PagingData pagingData0, @NotNull Executor executor0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return new PagingData(new PagingDataTransforms__PagingDataTransforms_jvmKt.filter..inlined.transform.1(pagingData0.getFlow$paging_common_release(), executor0, function10), pagingData0.getUiReceiver$paging_common_release(), pagingData0.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final PagingData filter(PagingData pagingData0, Function2 function20) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "predicate");
        return new PagingData(new PagingDataTransforms__PagingDataTransformsKt.filter..inlined.transform.1(pagingData0.getFlow$paging_common_release(), function20), pagingData0.getUiReceiver$paging_common_release(), pagingData0.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    @NotNull
    public static final PagingData flatMap(@NotNull PagingData pagingData0, @NotNull Executor executor0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return new PagingData(new PagingDataTransforms__PagingDataTransforms_jvmKt.flatMap..inlined.transform.1(pagingData0.getFlow$paging_common_release(), executor0, function10), pagingData0.getUiReceiver$paging_common_release(), pagingData0.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final PagingData flatMap(PagingData pagingData0, Function2 function20) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return new PagingData(new PagingDataTransforms__PagingDataTransformsKt.flatMap..inlined.transform.1(pagingData0.getFlow$paging_common_release(), function20), pagingData0.getUiReceiver$paging_common_release(), pagingData0.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final PagingData insertFooterItem(@NotNull PagingData pagingData0, @NotNull TerminalSeparatorType terminalSeparatorType0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType0, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(object0, "item");
        return PagingDataTransforms.insertSeparators(pagingData0, terminalSeparatorType0, new i1(0, object0, null));
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final PagingData insertFooterItem(@NotNull PagingData pagingData0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "item");
        return PagingDataTransforms.insertFooterItem$default(pagingData0, null, object0, 1, null);
    }

    public static PagingData insertFooterItem$default(PagingData pagingData0, TerminalSeparatorType terminalSeparatorType0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            terminalSeparatorType0 = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertFooterItem(pagingData0, terminalSeparatorType0, object0);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final PagingData insertHeaderItem(@NotNull PagingData pagingData0, @NotNull TerminalSeparatorType terminalSeparatorType0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType0, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(object0, "item");
        return PagingDataTransforms.insertSeparators(pagingData0, terminalSeparatorType0, new i1(1, object0, null));
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final PagingData insertHeaderItem(@NotNull PagingData pagingData0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "item");
        return PagingDataTransforms.insertHeaderItem$default(pagingData0, null, object0, 1, null);
    }

    public static PagingData insertHeaderItem$default(PagingData pagingData0, TerminalSeparatorType terminalSeparatorType0, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            terminalSeparatorType0 = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertHeaderItem(pagingData0, terminalSeparatorType0, object0);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final PagingData insertSeparators(@NotNull PagingData pagingData0, @NotNull TerminalSeparatorType terminalSeparatorType0, @NotNull Executor executor0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType0, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(function20, "generator");
        return PagingDataTransforms.insertSeparators(pagingData0, terminalSeparatorType0, new o1(executor0, function20, null));
    }

    @CheckResult
    public static final PagingData insertSeparators(PagingData pagingData0, TerminalSeparatorType terminalSeparatorType0, Function3 function30) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType0, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(function30, "generator");
        return new PagingData(SeparatorsKt.insertEventSeparators(pagingData0.getFlow$paging_common_release(), terminalSeparatorType0, function30), pagingData0.getUiReceiver$paging_common_release(), pagingData0.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final PagingData insertSeparators(@NotNull PagingData pagingData0, @NotNull Executor executor0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(function20, "generator");
        return PagingDataTransforms.insertSeparators$default(pagingData0, null, executor0, function20, 1, null);
    }

    public static PagingData insertSeparators$default(PagingData pagingData0, TerminalSeparatorType terminalSeparatorType0, Executor executor0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            terminalSeparatorType0 = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertSeparators(pagingData0, terminalSeparatorType0, executor0, function20);
    }

    public static PagingData insertSeparators$default(PagingData pagingData0, TerminalSeparatorType terminalSeparatorType0, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            terminalSeparatorType0 = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertSeparators(pagingData0, terminalSeparatorType0, function30);
    }

    @CheckResult
    @NotNull
    public static final PagingData map(@NotNull PagingData pagingData0, @NotNull Executor executor0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(function10, "transform");
        return new PagingData(new PagingDataTransforms__PagingDataTransforms_jvmKt.map..inlined.transform.1(pagingData0.getFlow$paging_common_release(), executor0, function10), pagingData0.getUiReceiver$paging_common_release(), pagingData0.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final PagingData map(PagingData pagingData0, Function2 function20) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return new PagingData(new PagingDataTransforms__PagingDataTransformsKt.map..inlined.transform.1(pagingData0.getFlow$paging_common_release(), function20), pagingData0.getUiReceiver$paging_common_release(), pagingData0.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @NotNull
    public static final PagingData transform(@NotNull PagingData pagingData0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(pagingData0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        return new PagingData(new PagingDataTransforms__PagingDataTransformsKt.transform..inlined.map.1(pagingData0.getFlow$paging_common_release(), function20), pagingData0.getUiReceiver$paging_common_release(), pagingData0.getHintReceiver$paging_common_release(), null, 8, null);
    }
}

