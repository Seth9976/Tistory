package com.kakao.tistory.presentation.screen.item;

import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000F\b\u0086\u0081\u0002\u0018\u0000 \u000B2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000BR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/screen/item/Vendor;", "", "", "a", "I", "getDrawable", "()I", "drawable", "b", "getTitle", "title", "Companion", "ADSENSE", "ADFIT", "DABLE", "TENPING", "SUPPORT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum Vendor {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00040\u0007*\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/screen/item/Vendor$Companion;", "", "", "name", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "valueOfName", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/item/Vendor;", "", "toVendorList", "(Ljava/util/List;)Ljava/util/List;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nVendor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vendor.kt\ncom/kakao/tistory/presentation/screen/item/Vendor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n288#2,2:20\n1603#2,9:22\n1855#2:31\n1856#2:33\n1612#2:34\n1#3:32\n*S KotlinDebug\n*F\n+ 1 Vendor.kt\ncom/kakao/tistory/presentation/screen/item/Vendor$Companion\n*L\n15#1:20,2\n17#1:22,9\n17#1:31\n17#1:33\n17#1:34\n17#1:32\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List toVendorList(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "<this>");
            List list1 = new ArrayList();
            for(Object object0: list0) {
                Vendor vendor0 = Vendor.Companion.valueOfName(((String)object0));
                if(vendor0 != null) {
                    ((ArrayList)list1).add(vendor0);
                }
            }
            return list1;
        }

        @Nullable
        public final Vendor valueOfName(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            for(Object object0: Vendor.getEntries()) {
                if(Intrinsics.areEqual(((Vendor)object0).name(), s)) {
                    return (Vendor)object0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    ADSENSE(drawable.ic_adsense, string.revenue_ad_title_adsense),
    ADFIT(drawable.ic_adfit, string.revenue_ad_title_adfit),
    DABLE(drawable.ic_dable, string.revenue_ad_title_dable),
    TENPING(drawable.ic_tenping, string.revenue_ad_title_tenping),
    SUPPORT(drawable.ic_donation, string.revenue_ad_title_donation);

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public static final Vendor[] c;
    public static final EnumEntries d;

    static {
        Vendor.c = arr_vendor;
        Intrinsics.checkNotNullParameter(arr_vendor, "entries");
        Vendor.d = new a(arr_vendor);
        Vendor.Companion = new Companion(null);
    }

    public Vendor(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    public final int getDrawable() {
        return this.a;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return Vendor.d;
    }

    public final int getTitle() {
        return this.b;
    }
}

