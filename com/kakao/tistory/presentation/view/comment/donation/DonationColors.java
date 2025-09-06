package com.kakao.tistory.presentation.view.comment.donation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0086\u0081\u0002\u0018\u0000 \u000B2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000BR\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\n\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/donation/DonationColors;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getContainerColor-0d7_KjU", "()J", "containerColor", "b", "getContentColor-0d7_KjU", "contentColor", "Companion", "RangeIn1000Until5000", "RangeIn5000Until10000", "RangeIn10000Until50000", "RangeIn50000Until100000", "RangeIn100000UntilInfinity", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum DonationColors {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/donation/DonationColors$Companion;", "", "", "amount", "Lcom/kakao/tistory/presentation/view/comment/donation/DonationColors;", "of", "(J)Lcom/kakao/tistory/presentation/view/comment/donation/DonationColors;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final DonationColors of(long v) {
            if(Long.compare(1000L, v) <= 0 && v < 5000L) {
                return DonationColors.RangeIn1000Until5000;
            }
            if(Long.compare(5000L, v) <= 0 && v < 10000L) {
                return DonationColors.RangeIn5000Until10000;
            }
            if(Long.compare(10000L, v) <= 0 && v < 50000L) {
                return DonationColors.RangeIn10000Until50000;
            }
            if(Long.compare(50000L, v) <= 0 && v < 100000L) {
                return DonationColors.RangeIn50000Until100000;
            }
            return 100000L > v || v >= 0x7FFFFFFFFFFFFFFFL ? DonationColors.RangeIn1000Until5000 : DonationColors.RangeIn100000UntilInfinity;
        }
    }

    RangeIn1000Until5000(0xFFF5F1E400000000L, 0xFF80702A00000000L),
    RangeIn5000Until10000(0xFFE1F0EC00000000L, 0xFF37785600000000L),
    RangeIn10000Until50000(0xFFE1EDF500000000L, 0xFF3968AD00000000L),
    RangeIn50000Until100000(0xFFE3E5F700000000L, 0xFF6255AD00000000L),
    RangeIn100000UntilInfinity(0xFFF5DFE000000000L, 0xFF94475600000000L);

    @NotNull
    public static final Companion Companion;
    public final long a;
    public final long b;
    public static final DonationColors[] c;
    public static final EnumEntries d;

    static {
        DonationColors.c = arr_donationColors;
        Intrinsics.checkNotNullParameter(arr_donationColors, "entries");
        DonationColors.d = new a(arr_donationColors);
        DonationColors.Companion = new Companion(null);
    }

    public DonationColors(long v1, long v2) {
        this.a = v1;
        this.b = v2;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getContentColor-0d7_KjU() {
        return this.b;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return DonationColors.d;
    }
}

