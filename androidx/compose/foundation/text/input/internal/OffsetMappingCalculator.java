package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\u000F\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0011\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000E\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "<init>", "()V", "", "sourceStart", "sourceEnd", "newLength", "", "recordEditOperation", "(III)V", "offset", "Landroidx/compose/ui/text/TextRange;", "mapFromSource--jx7JFs", "(I)J", "mapFromSource", "mapFromDest--jx7JFs", "mapFromDest", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,416:1\n1#2:417\n390#3,21:418\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n298#1:418,21\n*E\n"})
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    public int[] a;
    public int b;

    public OffsetMappingCalculator() {
        this.a = new int[30];
    }

    public final long a(int v, boolean z) {
        int[] arr_v = this.a;
        int v1 = this.b;
        if(v1 >= 0) {
            if(!z) {
                int v2 = v1 - 1;
                int v3 = v;
                while(-1 < v2) {
                    int v4 = arr_v[v2 * 3];
                    int v5 = arr_v[v2 * 3 + 1];
                    int v6 = arr_v[v2 * 3 + 2];
                    long v7 = OffsetMappingCalculator.b(v, v4, v5, v6, false);
                    long v8 = OffsetMappingCalculator.b(v3, v4, v5, v6, false);
                    v = Math.min(TextRange.getStart-impl(v7), TextRange.getStart-impl(v8));
                    v3 = Math.max(TextRange.getEnd-impl(v7), TextRange.getEnd-impl(v8));
                    --v2;
                }
                return TextRangeKt.TextRange(v, v3);
            }
            int v10 = v;
            for(int v9 = 0; v9 < v1; ++v9) {
                int v11 = arr_v[v9 * 3];
                int v12 = arr_v[v9 * 3 + 1];
                int v13 = arr_v[v9 * 3 + 2];
                long v14 = OffsetMappingCalculator.b(v, v11, v12, v13, true);
                long v15 = OffsetMappingCalculator.b(v10, v11, v12, v13, true);
                v = Math.min(TextRange.getStart-impl(v14), TextRange.getStart-impl(v15));
                v10 = Math.max(TextRange.getEnd-impl(v14), TextRange.getEnd-impl(v15));
            }
            return TextRangeKt.TextRange(v, v10);
        }
        return TextRangeKt.TextRange(v, v);
    }

    public static long b(int v, int v1, int v2, int v3, boolean z) {
        int v4 = z ? v2 : v3;
        if(z) {
            v2 = v3;
        }
        if(v < v1) {
            return TextRangeKt.TextRange(v);
        }
        if(v == v1) {
            return v4 == 0 ? TextRangeKt.TextRange(v1, v2 + v1) : TextRangeKt.TextRange(v1);
        }
        if(v < v1 + v4) {
            return v2 == 0 ? TextRangeKt.TextRange(v1) : TextRangeKt.TextRange(v1, v2 + v1);
        }
        return TextRangeKt.TextRange(v - v4 + v2);
    }

    public final long mapFromDest--jx7JFs(int v) {
        return this.a(v, false);
    }

    public final long mapFromSource--jx7JFs(int v) {
        return this.a(v, true);
    }

    public final void recordEditOperation(int v, int v1, int v2) {
        if(v2 < 0) {
            throw new IllegalArgumentException(("Expected newLen to be ≥ 0, was " + v2).toString());
        }
        int v3 = Math.min(v, v1);
        int v4 = Math.max(v3, v1) - v3;
        if(v4 < 2 && v4 == v2) {
            return;
        }
        int v5 = this.b + 1;
        int[] arr_v = this.a;
        if(v5 > arr_v.length / 3) {
            int[] arr_v1 = Arrays.copyOf(this.a, Math.max(v5 * 2, arr_v.length / 3 * 2) * 3);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
        int[] arr_v2 = this.a;
        int v6 = this.b * 3;
        arr_v2[v6] = v3;
        arr_v2[v6 + 1] = v4;
        arr_v2[v6 + 2] = v2;
        this.b = v5;
    }
}

