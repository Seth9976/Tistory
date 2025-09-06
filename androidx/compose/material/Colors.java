package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0092\u0001\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018R1\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR1\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b \u0010\u001B\u001A\u0004\b!\u0010\u001D\"\u0004\b\"\u0010\u001FR1\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b#\u0010\u001B\u001A\u0004\b$\u0010\u001D\"\u0004\b%\u0010\u001FR1\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b&\u0010\u001B\u001A\u0004\b\'\u0010\u001D\"\u0004\b(\u0010\u001FR1\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b)\u0010\u001B\u001A\u0004\b*\u0010\u001D\"\u0004\b+\u0010\u001FR1\u0010\b\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b,\u0010\u001B\u001A\u0004\b-\u0010\u001D\"\u0004\b.\u0010\u001FR1\u0010\t\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b/\u0010\u001B\u001A\u0004\b0\u0010\u001D\"\u0004\b1\u0010\u001FR1\u0010\n\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b2\u0010\u001B\u001A\u0004\b3\u0010\u001D\"\u0004\b4\u0010\u001FR1\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b5\u0010\u001B\u001A\u0004\b6\u0010\u001D\"\u0004\b7\u0010\u001FR1\u0010\f\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b8\u0010\u001B\u001A\u0004\b9\u0010\u001D\"\u0004\b:\u0010\u001FR1\u0010\r\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b;\u0010\u001B\u001A\u0004\b<\u0010\u001D\"\u0004\b=\u0010\u001FR1\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00028F@@X\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b>\u0010\u001B\u001A\u0004\b?\u0010\u001D\"\u0004\b@\u0010\u001FR+\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\u000F8F@@X\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bA\u0010\u001B\u001A\u0004\b\u0010\u0010B\"\u0004\bC\u0010D\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006E"}, d2 = {"Landroidx/compose/material/Colors;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-pvPzIIM", "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "copy", "", "toString", "()Ljava/lang/String;", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getPrimary-0d7_KjU", "()J", "setPrimary-8_81llA$material_release", "(J)V", "b", "getPrimaryVariant-0d7_KjU", "setPrimaryVariant-8_81llA$material_release", "c", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material_release", "d", "getSecondaryVariant-0d7_KjU", "setSecondaryVariant-8_81llA$material_release", "e", "getBackground-0d7_KjU", "setBackground-8_81llA$material_release", "f", "getSurface-0d7_KjU", "setSurface-8_81llA$material_release", "g", "getError-0d7_KjU", "setError-8_81llA$material_release", "h", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material_release", "i", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material_release", "j", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material_release", "k", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material_release", "l", "getOnError-0d7_KjU", "setOnError-8_81llA$material_release", "m", "()Z", "setLight$material_release", "(Z)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,337:1\n81#2:338\n107#2,2:339\n81#2:341\n107#2,2:342\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n81#2:350\n107#2,2:351\n81#2:353\n107#2,2:354\n81#2:356\n107#2,2:357\n81#2:359\n107#2,2:360\n81#2:362\n107#2,2:363\n81#2:365\n107#2,2:366\n81#2:368\n107#2,2:369\n81#2:371\n107#2,2:372\n81#2:374\n107#2,2:375\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n*L\n82#1:338\n82#1:339,2\n84#1:341\n84#1:342,2\n86#1:344\n86#1:345,2\n88#1:347\n88#1:348,2\n90#1:350\n90#1:351,2\n92#1:353\n92#1:354,2\n94#1:356\n94#1:357,2\n96#1:359\n96#1:360,2\n98#1:362\n98#1:363,2\n100#1:365\n100#1:366,2\n102#1:368\n102#1:369,2\n104#1:371\n104#1:372,2\n106#1:374\n106#1:375,2\n*E\n"})
public final class Colors {
    public static final int $stable;
    public final MutableState a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;
    public final MutableState g;
    public final MutableState h;
    public final MutableState i;
    public final MutableState j;
    public final MutableState k;
    public final MutableState l;
    public final MutableState m;

    public Colors(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = SnapshotStateKt.mutableStateOf(Color.box-impl(v), SnapshotStateKt.structuralEqualityPolicy());
        this.b = SnapshotStateKt.mutableStateOf(Color.box-impl(v1), SnapshotStateKt.structuralEqualityPolicy());
        this.c = SnapshotStateKt.mutableStateOf(Color.box-impl(v2), SnapshotStateKt.structuralEqualityPolicy());
        this.d = SnapshotStateKt.mutableStateOf(Color.box-impl(v3), SnapshotStateKt.structuralEqualityPolicy());
        this.e = SnapshotStateKt.mutableStateOf(Color.box-impl(v4), SnapshotStateKt.structuralEqualityPolicy());
        this.f = SnapshotStateKt.mutableStateOf(Color.box-impl(v5), SnapshotStateKt.structuralEqualityPolicy());
        this.g = SnapshotStateKt.mutableStateOf(Color.box-impl(v6), SnapshotStateKt.structuralEqualityPolicy());
        this.h = SnapshotStateKt.mutableStateOf(Color.box-impl(v7), SnapshotStateKt.structuralEqualityPolicy());
        this.i = SnapshotStateKt.mutableStateOf(Color.box-impl(v8), SnapshotStateKt.structuralEqualityPolicy());
        this.j = SnapshotStateKt.mutableStateOf(Color.box-impl(v9), SnapshotStateKt.structuralEqualityPolicy());
        this.k = SnapshotStateKt.mutableStateOf(Color.box-impl(v10), SnapshotStateKt.structuralEqualityPolicy());
        this.l = SnapshotStateKt.mutableStateOf(Color.box-impl(v11), SnapshotStateKt.structuralEqualityPolicy());
        this.m = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }

    @NotNull
    public final Colors copy-pvPzIIM(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, boolean z) {
        return new Colors(v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, z, null);
    }

    public static Colors copy-pvPzIIM$default(Colors colors0, long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, boolean z, int v12, Object object0) {
        long v13 = (v12 & 1) == 0 ? v : colors0.getPrimary-0d7_KjU();
        long v14 = (v12 & 2) == 0 ? v1 : colors0.getPrimaryVariant-0d7_KjU();
        long v15 = (v12 & 4) == 0 ? v2 : colors0.getSecondary-0d7_KjU();
        long v16 = (v12 & 8) == 0 ? v3 : colors0.getSecondaryVariant-0d7_KjU();
        long v17 = (v12 & 16) == 0 ? v4 : colors0.getBackground-0d7_KjU();
        long v18 = (v12 & 0x20) == 0 ? v5 : colors0.getSurface-0d7_KjU();
        long v19 = (v12 & 0x40) == 0 ? v6 : colors0.getError-0d7_KjU();
        long v20 = (v12 & 0x80) == 0 ? v7 : colors0.getOnPrimary-0d7_KjU();
        long v21 = (v12 & 0x100) == 0 ? v8 : colors0.getOnSecondary-0d7_KjU();
        long v22 = (v12 & 0x200) == 0 ? v9 : colors0.getOnBackground-0d7_KjU();
        long v23 = (v12 & 0x400) == 0 ? v10 : colors0.getOnSurface-0d7_KjU();
        long v24 = (v12 & 0x800) == 0 ? v11 : colors0.getOnError-0d7_KjU();
        return (v12 & 0x1000) == 0 ? colors0.copy-pvPzIIM(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, z) : colors0.copy-pvPzIIM(v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, colors0.isLight());
    }

    public final long getBackground-0d7_KjU() {
        return ((Color)this.e.getValue()).unbox-impl();
    }

    public final long getError-0d7_KjU() {
        return ((Color)this.g.getValue()).unbox-impl();
    }

    public final long getOnBackground-0d7_KjU() {
        return ((Color)this.j.getValue()).unbox-impl();
    }

    public final long getOnError-0d7_KjU() {
        return ((Color)this.l.getValue()).unbox-impl();
    }

    public final long getOnPrimary-0d7_KjU() {
        return ((Color)this.h.getValue()).unbox-impl();
    }

    public final long getOnSecondary-0d7_KjU() {
        return ((Color)this.i.getValue()).unbox-impl();
    }

    public final long getOnSurface-0d7_KjU() {
        return ((Color)this.k.getValue()).unbox-impl();
    }

    public final long getPrimary-0d7_KjU() {
        return ((Color)this.a.getValue()).unbox-impl();
    }

    public final long getPrimaryVariant-0d7_KjU() {
        return ((Color)this.b.getValue()).unbox-impl();
    }

    public final long getSecondary-0d7_KjU() {
        return ((Color)this.c.getValue()).unbox-impl();
    }

    public final long getSecondaryVariant-0d7_KjU() {
        return ((Color)this.d.getValue()).unbox-impl();
    }

    public final long getSurface-0d7_KjU() {
        return ((Color)this.f.getValue()).unbox-impl();
    }

    public final boolean isLight() {
        return ((Boolean)this.m.getValue()).booleanValue();
    }

    public final void setBackground-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.e.setValue(color0);
    }

    public final void setError-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.g.setValue(color0);
    }

    public final void setLight$material_release(boolean z) {
        this.m.setValue(Boolean.valueOf(z));
    }

    public final void setOnBackground-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.j.setValue(color0);
    }

    public final void setOnError-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.l.setValue(color0);
    }

    public final void setOnPrimary-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.h.setValue(color0);
    }

    public final void setOnSecondary-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.i.setValue(color0);
    }

    public final void setOnSurface-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.k.setValue(color0);
    }

    public final void setPrimary-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.a.setValue(color0);
    }

    public final void setPrimaryVariant-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.b.setValue(color0);
    }

    public final void setSecondary-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.c.setValue(color0);
    }

    public final void setSecondaryVariant-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.d.setValue(color0);
    }

    public final void setSurface-8_81llA$material_release(long v) {
        Color color0 = Color.box-impl(v);
        this.f.setValue(color0);
    }

    @Override
    @NotNull
    public String toString() {
        return "Colors(primary=" + Color.toString-impl(this.getPrimary-0d7_KjU()) + ", primaryVariant=" + Color.toString-impl(this.getPrimaryVariant-0d7_KjU()) + ", secondary=" + Color.toString-impl(this.getSecondary-0d7_KjU()) + ", secondaryVariant=" + Color.toString-impl(this.getSecondaryVariant-0d7_KjU()) + ", background=" + Color.toString-impl(this.getBackground-0d7_KjU()) + ", surface=" + Color.toString-impl(this.getSurface-0d7_KjU()) + ", error=" + Color.toString-impl(this.getError-0d7_KjU()) + ", onPrimary=" + Color.toString-impl(this.getOnPrimary-0d7_KjU()) + ", onSecondary=" + Color.toString-impl(this.getOnSecondary-0d7_KjU()) + ", onBackground=" + Color.toString-impl(this.getOnBackground-0d7_KjU()) + ", onSurface=" + Color.toString-impl(this.getOnSurface-0d7_KjU()) + ", onError=" + Color.toString-impl(this.getOnError-0d7_KjU()) + ", isLight=" + this.isLight() + ')';
    }
}

