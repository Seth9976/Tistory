package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J!\u0010\u001B\u001A\u00020\u001C2\b\u0010\u001D\u001A\u0004\u0018\u00010\t2\b\u0010\u001E\u001A\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\u001FR\u001E\u0010\u0002\u001A\u00020\u0003X¦\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\tX¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0012\u0010\u000E\u001A\u00020\u000FX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001A\u0004\u0018\u00010\t8fX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001A\u0004\u0018\u00010\t8fX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0014R\u0012\u0010\u0017\u001A\u00020\u0018X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001Aø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "", "displayMode", "Landroidx/compose/material3/DisplayMode;", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayedMonthMillis", "", "getDisplayedMonthMillis", "()J", "setDisplayedMonthMillis", "(J)V", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "getSelectableDates", "()Landroidx/compose/material3/SelectableDates;", "selectedEndDateMillis", "getSelectedEndDateMillis", "()Ljava/lang/Long;", "selectedStartDateMillis", "getSelectedStartDateMillis", "yearRange", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "setSelection", "", "startDateMillis", "endDateMillis", "(Ljava/lang/Long;Ljava/lang/Long;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DateRangePickerState {
    int getDisplayMode-jFl-4v0();

    long getDisplayedMonthMillis();

    @NotNull
    SelectableDates getSelectableDates();

    @Nullable
    Long getSelectedEndDateMillis();

    @Nullable
    Long getSelectedStartDateMillis();

    @NotNull
    IntRange getYearRange();

    void setDisplayMode-vCnGnXg(int arg1);

    void setDisplayedMonthMillis(long arg1);

    void setSelection(@Nullable Long arg1, @Nullable Long arg2);
}

