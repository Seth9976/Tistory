package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001:\u0001-B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000E\u001A\u00020\u00062\b\b\u0001\u0010\u000B\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001A\u00020\u00062\b\b\u0001\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\f2\b\b\u0001\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u0006¢\u0006\u0004\b\u001A\u0010\u0011J\u001D\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001C0\u001B2\u0006\u0010\u0019\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010\"\u001A\u00020\f2\u0006\u0010!\u001A\u00020 ¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u0017\u0010,\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+¨\u0006."}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "paragraphIndex", "Ljava/text/Bidi;", "analyzeBidi", "(I)Ljava/text/Bidi;", "offset", "", "upstream", "getParagraphForOffset", "(IZ)I", "getParagraphStart", "(I)I", "getParagraphEnd", "isRtlParagraph", "(I)Z", "usePrimaryDirection", "", "getHorizontalPosition", "(IZZ)F", "lineIndex", "getLineVisibleEnd", "", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "getLineBidiRuns$ui_text_release", "(I)[Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "getLineBidiRuns", "", "c", "isLineEndSpace", "(C)Z", "a", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "f", "I", "getParagraphCount", "()I", "paragraphCount", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,422:1\n1#2:423\n1627#3,6:424\n1627#3,6:430\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n281#1:424,6\n320#1:430,6\n*E\n"})
public final class LayoutHelper {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u000E\b\u0080\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001A\u0010\u0015\u001A\u00020\u00052\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u0006\u0010\r¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "", "start", "end", "", "isRtl", "<init>", "(IIZ)V", "component1", "()I", "component2", "component3", "()Z", "copy", "(IIZ)Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getStart", "b", "getEnd", "c", "Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class BidiRun {
        public static final int $stable;
        public final int a;
        public final int b;
        public final boolean c;

        public BidiRun(int v, int v1, boolean z) {
            this.a = v;
            this.b = v1;
            this.c = z;
        }

        public final int component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final boolean component3() {
            return this.c;
        }

        @NotNull
        public final BidiRun copy(int v, int v1, boolean z) {
            return new BidiRun(v, v1, z);
        }

        public static BidiRun copy$default(BidiRun layoutHelper$BidiRun0, int v, int v1, boolean z, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = layoutHelper$BidiRun0.a;
            }
            if((v2 & 2) != 0) {
                v1 = layoutHelper$BidiRun0.b;
            }
            if((v2 & 4) != 0) {
                z = layoutHelper$BidiRun0.c;
            }
            return layoutHelper$BidiRun0.copy(v, v1, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof BidiRun)) {
                return false;
            }
            if(this.a != ((BidiRun)object0).a) {
                return false;
            }
            return this.b == ((BidiRun)object0).b ? this.c == ((BidiRun)object0).c : false;
        }

        public final int getEnd() {
            return this.b;
        }

        public final int getStart() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.c) + a.c(this.b, this.a * 0x1F, 0x1F);
        }

        public final boolean isRtl() {
            return this.c;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("BidiRun(start=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", end=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", isRtl=");
            return a.p(stringBuilder0, this.c, ')');
        }
    }

    public static final int $stable = 8;
    public final Layout a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean[] d;
    public char[] e;
    public final int f;

    public LayoutHelper(@NotNull Layout layout0) {
        this.a = layout0;
        ArrayList arrayList0 = new ArrayList();
        int v1 = 0;
        do {
            int v2 = StringsKt__StringsKt.indexOf$default(this.a.getText(), '\n', v1, false, 4, null);
            v1 = v2 >= 0 ? v2 + 1 : this.a.getText().length();
            arrayList0.add(v1);
        }
        while(v1 < this.a.getText().length());
        this.b = arrayList0;
        int v3 = arrayList0.size();
        ArrayList arrayList1 = new ArrayList(v3);
        for(int v = 0; v < v3; ++v) {
            arrayList1.add(null);
        }
        this.c = arrayList1;
        this.d = new boolean[this.b.size()];
        this.f = this.b.size();
    }

    public final float a(int v, boolean z) {
        int v1 = c.coerceAtMost(v, this.a.getLineEnd(this.a.getLineForOffset(v)));
        return z ? this.a.getPrimaryHorizontal(v1) : this.a.getSecondaryHorizontal(v1);
    }

    @Nullable
    public final Bidi analyzeBidi(int v) {
        Bidi bidi0;
        boolean[] arr_z = this.d;
        ArrayList arrayList0 = this.c;
        if(arr_z[v]) {
            return (Bidi)arrayList0.get(v);
        }
        int v1 = v == 0 ? 0 : ((Number)this.b.get(v - 1)).intValue();
        int v2 = ((Number)this.b.get(v)).intValue();
        int v3 = v2 - v1;
        char[] arr_c = this.e != null && this.e.length >= v3 ? this.e : new char[v3];
        TextUtils.getChars(this.a.getText(), v1, v2, arr_c, 0);
        if(Bidi.requiresBidi(arr_c, 0, v3)) {
            bidi0 = new Bidi(arr_c, 0, null, 0, v3, ((int)this.isRtlParagraph(v)));
            if(bidi0.getRunCount() == 1) {
                bidi0 = null;
            }
        }
        else {
            bidi0 = null;
        }
        arrayList0.set(v, bidi0);
        arr_z[v] = true;
        if(bidi0 != null) {
            arr_c = arr_c == this.e ? null : this.e;
        }
        this.e = arr_c;
        return bidi0;
    }

    public final int b(int v, int v1) {
        while(v > v1 && this.isLineEndSpace(this.a.getText().charAt(v - 1))) {
            --v;
        }
        return v;
    }

    public final float getHorizontalPosition(int v, boolean z, boolean z1) {
        int v1 = v;
        if(!z1) {
            return this.a(v, z);
        }
        Layout layout0 = this.a;
        int v2 = LayoutCompat_androidKt.getLineForOffset(layout0, v1, true);
        int v3 = layout0.getLineStart(v2);
        int v4 = layout0.getLineEnd(v2);
        if(v1 != v3 && v1 != v4) {
            return this.a(v, z);
        }
        if(v1 != 0 && v1 != layout0.getText().length()) {
            int v5 = this.getParagraphForOffset(v1, true);
            boolean z2 = this.isRtlParagraph(v5);
            int v6 = this.b(v4, v3);
            int v7 = this.getParagraphStart(v5);
            Bidi bidi0 = this.analyzeBidi(v5);
            Bidi bidi1 = bidi0 == null ? null : bidi0.createLineBidi(v3 - v7, v6 - v7);
            if(bidi1 != null && bidi1.getRunCount() != 1) {
                int v8 = bidi1.getRunCount();
                BidiRun[] arr_layoutHelper$BidiRun = new BidiRun[v8];
                for(int v9 = 0; v9 < v8; ++v9) {
                    arr_layoutHelper$BidiRun[v9] = new BidiRun(bidi1.getRunStart(v9) + v3, bidi1.getRunLimit(v9) + v3, bidi1.getRunLevel(v9) % 2 == 1);
                }
                int v10 = bidi1.getRunCount();
                byte[] arr_b = new byte[v10];
                for(int v11 = 0; v11 < v10; ++v11) {
                    arr_b[v11] = (byte)bidi1.getRunLevel(v11);
                }
                Bidi.reorderVisually(arr_b, 0, arr_layoutHelper$BidiRun, 0, v8);
                int v12 = -1;
                if(v1 == v3) {
                    for(int v13 = 0; v13 < v8; ++v13) {
                        if(arr_layoutHelper$BidiRun[v13].getStart() == v1) {
                            v12 = v13;
                            break;
                        }
                    }
                    if(z || z2 == arr_layoutHelper$BidiRun[v12].isRtl()) {
                        z2 = !z2;
                    }
                    if(v12 == 0 && z2) {
                        return layout0.getLineLeft(v2);
                    }
                    if(v12 == ArraysKt___ArraysKt.getLastIndex(arr_layoutHelper$BidiRun) && !z2) {
                        return layout0.getLineRight(v2);
                    }
                    return z2 ? layout0.getPrimaryHorizontal(arr_layoutHelper$BidiRun[v12 - 1].getStart()) : layout0.getPrimaryHorizontal(arr_layoutHelper$BidiRun[v12 + 1].getStart());
                }
                if(v1 > v6) {
                    v1 = this.b(v1, v3);
                }
                for(int v14 = 0; v14 < v8; ++v14) {
                    if(arr_layoutHelper$BidiRun[v14].getEnd() == v1) {
                        v12 = v14;
                        break;
                    }
                }
                if(!z && z2 != arr_layoutHelper$BidiRun[v12].isRtl()) {
                    z2 = !z2;
                }
                if(v12 == 0 && z2) {
                    return layout0.getLineLeft(v2);
                }
                if(v12 == ArraysKt___ArraysKt.getLastIndex(arr_layoutHelper$BidiRun) && !z2) {
                    return layout0.getLineRight(v2);
                }
                return z2 ? layout0.getPrimaryHorizontal(arr_layoutHelper$BidiRun[v12 - 1].getEnd()) : layout0.getPrimaryHorizontal(arr_layoutHelper$BidiRun[v12 + 1].getEnd());
            }
            if(z || z2 == layout0.isRtlCharAt(v3)) {
                z2 = !z2;
            }
            if(v1 == v3) {
                return z2 ? layout0.getLineLeft(v2) : layout0.getLineRight(v2);
            }
            return z2 ? layout0.getLineRight(v2) : layout0.getLineLeft(v2);
        }
        return this.a(v, z);
    }

    @NotNull
    public final Layout getLayout() {
        return this.a;
    }

    @NotNull
    public final BidiRun[] getLineBidiRuns$ui_text_release(int v) {
        Layout layout0 = this.a;
        int v1 = layout0.getLineStart(v);
        int v2 = layout0.getLineEnd(v);
        int v3 = LayoutHelper.getParagraphForOffset$default(this, v1, false, 2, null);
        int v4 = this.getParagraphStart(v3);
        Bidi bidi0 = this.analyzeBidi(v3);
        if(bidi0 != null) {
            Bidi bidi1 = bidi0.createLineBidi(v1 - v4, v2 - v4);
            if(bidi1 != null) {
                int v5 = bidi1.getRunCount();
                BidiRun[] arr_layoutHelper$BidiRun = new BidiRun[v5];
                for(int v6 = 0; v6 < v5; ++v6) {
                    arr_layoutHelper$BidiRun[v6] = new BidiRun(bidi1.getRunStart(v6) + v1, bidi1.getRunLimit(v6) + v1, bidi1.getRunLevel(v6) % 2 == 1);
                }
                return arr_layoutHelper$BidiRun;
            }
        }
        return new BidiRun[]{new BidiRun(v1, v2, layout0.isRtlCharAt(v1))};
    }

    public final int getLineVisibleEnd(int v) {
        return this.b(this.a.getLineEnd(v), this.a.getLineStart(v));
    }

    public final int getParagraphCount() {
        return this.f;
    }

    public final int getParagraphEnd(@IntRange(from = 0L) int v) {
        return ((Number)this.b.get(v)).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0L) int v, boolean z) {
        int v1 = CollectionsKt__CollectionsKt.binarySearch$default(this.b, v, 0, 0, 6, null);
        int v2 = v1 >= 0 ? v1 + 1 : -(v1 + 1);
        return !z || v2 <= 0 || v != ((Number)this.b.get(v2 - 1)).intValue() ? v2 : v2 - 1;
    }

    public static int getParagraphForOffset$default(LayoutHelper layoutHelper0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return layoutHelper0.getParagraphForOffset(v, z);
    }

    public final int getParagraphStart(@IntRange(from = 0L) int v) {
        return v == 0 ? 0 : ((Number)this.b.get(v - 1)).intValue();
    }

    public final boolean isLineEndSpace(char c) {
        return c == 10 || c == 0x20 || c == 5760 || Intrinsics.compare(c, 0x2000) >= 0 && Intrinsics.compare(c, 0x200A) <= 0 && c != 0x2007 || (c == 0x205F || c == 0x3000);
    }

    public final boolean isRtlParagraph(@IntRange(from = 0L) int v) {
        int v1 = this.getParagraphStart(v);
        int v2 = this.a.getLineForOffset(v1);
        return this.a.getParagraphDirection(v2) == -1;
    }
}

