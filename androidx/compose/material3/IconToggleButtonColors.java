package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u00A2\u0006\u0004\b\t\u0010\nJL\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ%\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000EH\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000EH\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u000E2\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AR\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001F\u0010\u001C\u001A\u0004\b \u0010\u001ER\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b!\u0010\u001C\u001A\u0004\b\"\u0010\u001ER\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b#\u0010\u001C\u001A\u0004\b$\u0010\u001ER\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b%\u0010\u001C\u001A\u0004\b&\u0010\u001ER\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\'\u0010\u001C\u001A\u0004\b(\u0010\u001E\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006)"}, d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/IconToggleButtonColors;", "copy", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$material3_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getContainerColor-0d7_KjU", "()J", "b", "getContentColor-0d7_KjU", "c", "getDisabledContainerColor-0d7_KjU", "d", "getDisabledContentColor-0d7_KjU", "e", "getCheckedContainerColor-0d7_KjU", "f", "getCheckedContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconToggleButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1292:1\n708#2:1293\n696#2:1294\n708#2:1295\n696#2:1296\n708#2:1297\n696#2:1298\n708#2:1299\n696#2:1300\n708#2:1301\n696#2:1302\n708#2:1303\n696#2:1304\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconToggleButtonColors\n*L\n1225#1:1293\n1225#1:1294\n1226#1:1295\n1226#1:1296\n1227#1:1297\n1227#1:1298\n1228#1:1299\n1228#1:1300\n1229#1:1301\n1229#1:1302\n1230#1:1303\n1230#1:1304\n*E\n"})
public final class IconToggleButtonColors {
    public static final int $stable;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public IconToggleButtonColors(long v, long v1, long v2, long v3, long v4, long v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    @Composable
    @NotNull
    public final State containerColor$material3_release(boolean z, boolean z1, @Nullable Composer composer0, int v) {
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x460F18AE, v, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:1239)");
        }
        if(z) {
            v1 = z1 ? this.e : this.a;
        }
        else {
            v1 = this.c;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public final State contentColor$material3_release(boolean z, boolean z1, @Nullable Composer composer0, int v) {
        long v1;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4FEBCF26, v, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:1256)");
        }
        if(z) {
            v1 = z1 ? this.f : this.b;
        }
        else {
            v1 = this.d;
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @NotNull
    public final IconToggleButtonColors copy-tNS2XkQ(long v, long v1, long v2, long v3, long v4, long v5) {
        long v6 = v == 16L ? this.a : v;
        long v7 = v1 == 16L ? this.b : v1;
        long v8 = v2 == 16L ? this.c : v2;
        long v9 = v3 == 16L ? this.d : v3;
        long v10 = v4 == 16L ? this.e : v4;
        return v5 == 16L ? new IconToggleButtonColors(v6, v7, v8, v9, v10, this.f, null) : new IconToggleButtonColors(v6, v7, v8, v9, v10, v5, null);
    }

    public static IconToggleButtonColors copy-tNS2XkQ$default(IconToggleButtonColors iconToggleButtonColors0, long v, long v1, long v2, long v3, long v4, long v5, int v6, Object object0) {
        long v7 = (v6 & 1) == 0 ? v : iconToggleButtonColors0.a;
        long v8 = (v6 & 2) == 0 ? v1 : iconToggleButtonColors0.b;
        long v9 = (v6 & 4) == 0 ? v2 : iconToggleButtonColors0.c;
        long v10 = (v6 & 8) == 0 ? v3 : iconToggleButtonColors0.d;
        long v11 = (v6 & 16) == 0 ? v4 : iconToggleButtonColors0.e;
        return (v6 & 0x20) == 0 ? iconToggleButtonColors0.copy-tNS2XkQ(v7, v8, v9, v10, v11, v5) : iconToggleButtonColors0.copy-tNS2XkQ(v7, v8, v9, v10, v11, iconToggleButtonColors0.f);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof IconToggleButtonColors) || !Color.equals-impl0(this.a, ((IconToggleButtonColors)object0).a)) {
            return false;
        }
        if(!Color.equals-impl0(this.b, ((IconToggleButtonColors)object0).b)) {
            return false;
        }
        if(!Color.equals-impl0(this.c, ((IconToggleButtonColors)object0).c)) {
            return false;
        }
        if(!Color.equals-impl0(this.d, ((IconToggleButtonColors)object0).d)) {
            return false;
        }
        return Color.equals-impl0(this.e, ((IconToggleButtonColors)object0).e) ? Color.equals-impl0(this.f, ((IconToggleButtonColors)object0).f) : false;
    }

    public final long getCheckedContainerColor-0d7_KjU() {
        return this.e;
    }

    public final long getCheckedContentColor-0d7_KjU() {
        return this.f;
    }

    public final long getContainerColor-0d7_KjU() {
        return this.a;
    }

    public final long getContentColor-0d7_KjU() {
        return this.b;
    }

    public final long getDisabledContainerColor-0d7_KjU() {
        return this.c;
    }

    public final long getDisabledContentColor-0d7_KjU() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.f) + a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }
}

