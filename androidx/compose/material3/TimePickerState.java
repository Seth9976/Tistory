package androidx.compose.material3;

import androidx.annotation.IntRange;
import kotlin.Metadata;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R&\u0010\u0004\u001A\u00020\u00032\b\b\u0001\u0010\u0002\u001A\u00020\u00038g@fX¦\u000E¢\u0006\f\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001A\u00020\nX¦\u000E¢\u0006\f\u001A\u0004\b\t\u0010\u000B\"\u0004\b\f\u0010\rR\u0018\u0010\u000E\u001A\u00020\nX¦\u000E¢\u0006\f\u001A\u0004\b\u000E\u0010\u000B\"\u0004\b\u000F\u0010\rR&\u0010\u0010\u001A\u00020\u00032\b\b\u0001\u0010\u0002\u001A\u00020\u00038g@fX¦\u000E¢\u0006\f\u001A\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001E\u0010\u0013\u001A\u00020\u0014X¦\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001A\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "", "<set-?>", "", "hour", "getHour", "()I", "setHour", "(I)V", "is24hour", "", "()Z", "set24hour", "(Z)V", "isAfternoon", "setAfternoon", "minute", "getMinute", "setMinute", "selection", "Landroidx/compose/material3/TimePickerSelectionMode;", "getSelection-yecRtBI", "setSelection-6_8s6DQ", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TimePickerState {
    @IntRange(from = 0L, to = 23L)
    int getHour();

    @IntRange(from = 0L, to = 59L)
    int getMinute();

    int getSelection-yecRtBI();

    boolean is24hour();

    boolean isAfternoon();

    void set24hour(boolean arg1);

    void setAfternoon(boolean arg1);

    void setHour(@IntRange(from = 0L, to = 23L) int arg1);

    void setMinute(@IntRange(from = 0L, to = 59L) int arg1);

    void setSelection-6_8s6DQ(int arg1);
}

