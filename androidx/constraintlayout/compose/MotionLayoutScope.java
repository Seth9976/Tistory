package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001FB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\rJ&\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001B\u001A\u00020\u00192\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001A\u0010\u0015J&\u0010\u001E\u001A\u00020\u001C2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001D\u0010\u0011\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope;", "", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "<init>", "(Landroidx/constraintlayout/compose/MotionMeasurer;)V", "", "id", "Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "motionProperties", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableState;", "tag", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "name", "Landroidx/compose/ui/graphics/Color;", "motionColor-WaAFU9c", "(Ljava/lang/String;Ljava/lang/String;)J", "motionColor", "", "motionFloat", "(Ljava/lang/String;Ljava/lang/String;)F", "", "motionInt", "(Ljava/lang/String;Ljava/lang/String;)I", "Landroidx/compose/ui/unit/Dp;", "motionDistance-chRvn1I", "motionDistance", "Landroidx/compose/ui/unit/TextUnit;", "motionFontSize-5XXgJZs", "motionFontSize", "MotionProperties", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MotionLayoutScope {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\tJ\u000F\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u001E\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001A\u00020\u00122\u0006\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001E\u0010\u0017\u001A\u00020\u00152\u0006\u0010\n\u001A\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u001E\u0010\u001A\u001A\u00020\u00182\u0006\u0010\n\u001A\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "", "", "id", "tag", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/constraintlayout/compose/MotionMeasurer;)V", "()Ljava/lang/String;", "name", "Landroidx/compose/ui/graphics/Color;", "color-vNxB06k", "(Ljava/lang/String;)J", "color", "", "float", "(Ljava/lang/String;)F", "", "int", "(Ljava/lang/String;)I", "Landroidx/compose/ui/unit/Dp;", "distance-u2uoSUM", "distance", "Landroidx/compose/ui/unit/TextUnit;", "fontSize-kPz2Gy4", "fontSize", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class MotionProperties {
        public static final int $stable = 8;
        public final String a;
        public final MotionMeasurer b;

        public MotionProperties(@NotNull String s, @Nullable String s1, @NotNull MotionMeasurer motionMeasurer0) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(motionMeasurer0, "measurer");
            super();
            this.a = s;
            this.b = motionMeasurer0;
        }

        public final long color-vNxB06k(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            return this.b.getCustomColor-WaAFU9c(this.a, s);
        }

        public final float distance-u2uoSUM(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            return Dp.constructor-impl(this.b.getCustomFloat(this.a, s));
        }

        public final float float(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            return this.b.getCustomFloat(this.a, s);
        }

        public final long fontSize-kPz2Gy4(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            return TextUnitKt.getSp(this.b.getCustomFloat(this.a, s));
        }

        @NotNull
        public final String id() {
            return this.a;
        }

        public final int int(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            return (int)this.b.getCustomFloat(this.a, s);
        }

        @Nullable
        public final String tag() {
            return null;
        }
    }

    public static final int $stable = 8;
    public final MotionMeasurer a;

    @PublishedApi
    public MotionLayoutScope(@NotNull MotionMeasurer motionMeasurer0) {
        Intrinsics.checkNotNullParameter(motionMeasurer0, "measurer");
        super();
        this.a = motionMeasurer0;
    }

    public final long motionColor-WaAFU9c(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "name");
        return this.a.getCustomColor-WaAFU9c(s, s1);
    }

    public final float motionDistance-chRvn1I(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "name");
        return Dp.constructor-impl(this.a.getCustomFloat(s, s1));
    }

    public final float motionFloat(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "name");
        return this.a.getCustomFloat(s, s1);
    }

    public final long motionFontSize-5XXgJZs(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "name");
        return TextUnitKt.getSp(this.a.getCustomFloat(s, s1));
    }

    public final int motionInt(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "name");
        return (int)this.a.getCustomFloat(s, s1);
    }

    @Composable
    @NotNull
    public final MutableState motionProperties(@NotNull String s, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "id");
        composer0.startReplaceableGroup(-1035552373);
        composer0.startReplaceableGroup(0xFFC7BCB7);
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(new MotionProperties(s, null, this.a), null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return mutableState0;
    }

    @NotNull
    public final MotionProperties motionProperties(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "tag");
        return new MotionProperties(s, s1, this.a);
    }
}

