package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00048F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR+\u0010\u0013\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\r8F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u000E\u0010\u0007\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0017\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\r8F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001A\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R+\u0010\u001B\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\r8F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0007\u001A\u0004\b\u0019\u0010\u0010\"\u0004\b\u001A\u0010\u0012R+\u0010\u001F\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\r8F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u001C\u0010\u0007\u001A\u0004\b\u001D\u0010\u0010\"\u0004\b\u001E\u0010\u0012¨\u0006 "}, d2 = {"Lcom/google/accompanist/swiperefresh/Slingshot;", "", "<init>", "()V", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getOffset", "()I", "setOffset", "(I)V", "offset", "", "b", "getStartTrim", "()F", "setStartTrim", "(F)V", "startTrim", "c", "getEndTrim", "setEndTrim", "endTrim", "d", "getRotation", "setRotation", "rotation", "e", "getArrowScale", "setArrowScale", "arrowScale", "swiperefresh_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlingshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slingshot.kt\ncom/google/accompanist/swiperefresh/Slingshot\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n76#2:90\n102#2,2:91\n76#2:93\n102#2,2:94\n76#2:96\n102#2,2:97\n76#2:99\n102#2,2:100\n76#2:102\n102#2,2:103\n*S KotlinDebug\n*F\n+ 1 Slingshot.kt\ncom/google/accompanist/swiperefresh/Slingshot\n*L\n81#1:90\n81#1:91,2\n82#1:93\n82#1:94,2\n83#1:96\n83#1:97,2\n84#1:99\n84#1:100,2\n85#1:102\n85#1:103,2\n*E\n"})
public final class Slingshot {
    public final MutableState a;
    public final MutableState b;
    public final MutableState c;
    public final MutableState d;
    public final MutableState e;

    public Slingshot() {
        this.a = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.b = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
        this.e = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
    }

    public final float getArrowScale() {
        return ((Number)this.e.getValue()).floatValue();
    }

    public final float getEndTrim() {
        return ((Number)this.c.getValue()).floatValue();
    }

    public final int getOffset() {
        return ((Number)this.a.getValue()).intValue();
    }

    public final float getRotation() {
        return ((Number)this.d.getValue()).floatValue();
    }

    public final float getStartTrim() {
        return ((Number)this.b.getValue()).floatValue();
    }

    public final void setArrowScale(float f) {
        this.e.setValue(f);
    }

    public final void setEndTrim(float f) {
        this.c.setValue(f);
    }

    public final void setOffset(int v) {
        this.a.setValue(v);
    }

    public final void setRotation(float f) {
        this.d.setValue(f);
    }

    public final void setStartTrim(float f) {
        this.b.setValue(f);
    }
}

