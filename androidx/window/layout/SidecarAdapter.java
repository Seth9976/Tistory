package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Bounds;
import androidx.window.core.SpecificationComputer.VerificationMode;
import androidx.window.core.SpecificationComputer;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0000\u0018\u0000 \u001D2\u00020\u0001:\u0001\u001DB\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\f\u001A\u00020\u00112\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0010\u001A\u00020\t¢\u0006\u0004\b\f\u0010\u0012J!\u0010\u0016\u001A\u00020\u00152\b\u0010\u0013\u001A\u0004\u0018\u00010\t2\b\u0010\u0014\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001A\u00020\u00152\b\u0010\u0013\u001A\u0004\u0018\u00010\u000E2\b\u0010\u0014\u001A\u0004\u0018\u00010\u000E¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\f\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u001A\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/window/layout/SidecarAdapter;", "", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "<init>", "(Landroidx/window/core/SpecificationComputer$VerificationMode;)V", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "deviceState", "Landroidx/window/layout/DisplayFeature;", "translate", "(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/List;", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "extensionInfo", "state", "Landroidx/window/layout/WindowLayoutInfo;", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/WindowLayoutInfo;", "first", "second", "", "isEqualSidecarDeviceState", "(Landroidx/window/sidecar/SidecarDeviceState;Landroidx/window/sidecar/SidecarDeviceState;)Z", "isEqualSidecarWindowLayoutInfo", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Z", "feature", "translate$window_release", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/DisplayFeature;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SidecarAdapter {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\'\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u001F\u0010\u0014\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001C\u0010\u0018\u001A\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/window/layout/SidecarAdapter$Companion;", "", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "getSidecarDisplayFeatures", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;", "displayFeatures", "", "setSidecarDisplayFeatures", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Ljava/util/List;)V", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "getSidecarDevicePosture$window_release", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "getSidecarDevicePosture", "getRawSidecarDevicePosture", "posture", "setSidecarDevicePosture", "(Landroidx/window/sidecar/SidecarDeviceState;I)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final int getRawSidecarDevicePosture(@NotNull SidecarDeviceState sidecarDeviceState0) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState0, "sidecarDeviceState");
            return sidecarDeviceState0.posture;
        }

        public final int getSidecarDevicePosture$window_release(@NotNull SidecarDeviceState sidecarDeviceState0) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState0, "sidecarDeviceState");
            int v = this.getRawSidecarDevicePosture(sidecarDeviceState0);
            return v >= 0 && v <= 4 ? v : 0;
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        @NotNull
        public final List getSidecarDisplayFeatures(@NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo0) {
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo0, "info");
            return sidecarWindowLayoutInfo0.displayFeatures == null ? CollectionsKt__CollectionsKt.emptyList() : sidecarWindowLayoutInfo0.displayFeatures;
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final void setSidecarDevicePosture(@NotNull SidecarDeviceState sidecarDeviceState0, int v) {
            Intrinsics.checkNotNullParameter(sidecarDeviceState0, "sidecarDeviceState");
            sidecarDeviceState0.posture = v;
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final void setSidecarDisplayFeatures(@NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo0, "info");
            Intrinsics.checkNotNullParameter(list0, "displayFeatures");
            sidecarWindowLayoutInfo0.displayFeatures = list0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final VerificationMode a;
    public static final String b;

    static {
        SidecarAdapter.Companion = new Companion(null);
        SidecarAdapter.b = "SidecarAdapter";
    }

    public SidecarAdapter() {
        this(null, 1, null);
    }

    public SidecarAdapter(@NotNull VerificationMode specificationComputer$VerificationMode0) {
        Intrinsics.checkNotNullParameter(specificationComputer$VerificationMode0, "verificationMode");
        super();
        this.a = specificationComputer$VerificationMode0;
    }

    public SidecarAdapter(VerificationMode specificationComputer$VerificationMode0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            specificationComputer$VerificationMode0 = VerificationMode.QUIET;
        }
        this(specificationComputer$VerificationMode0);
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature0, SidecarDisplayFeature sidecarDisplayFeature1) {
        if(Intrinsics.areEqual(sidecarDisplayFeature0, sidecarDisplayFeature1)) {
            return true;
        }
        if(sidecarDisplayFeature0 == null) {
            return false;
        }
        if(sidecarDisplayFeature1 == null) {
            return false;
        }
        return sidecarDisplayFeature0.getType() == sidecarDisplayFeature1.getType() ? Intrinsics.areEqual(sidecarDisplayFeature0.getRect(), sidecarDisplayFeature1.getRect()) : false;
    }

    public static boolean b(List list0, List list1) {
        if(list0 == list1) {
            return true;
        }
        if(list0 == null) {
            return false;
        }
        if(list1 == null) {
            return false;
        }
        if(list0.size() != list1.size()) {
            return false;
        }
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!SidecarAdapter.a(((SidecarDisplayFeature)list0.get(v1)), ((SidecarDisplayFeature)list1.get(v1)))) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEqualSidecarDeviceState(@Nullable SidecarDeviceState sidecarDeviceState0, @Nullable SidecarDeviceState sidecarDeviceState1) {
        if(Intrinsics.areEqual(sidecarDeviceState0, sidecarDeviceState1)) {
            return true;
        }
        if(sidecarDeviceState0 == null) {
            return false;
        }
        return sidecarDeviceState1 == null ? false : SidecarAdapter.Companion.getSidecarDevicePosture$window_release(sidecarDeviceState0) == SidecarAdapter.Companion.getSidecarDevicePosture$window_release(sidecarDeviceState1);
    }

    public final boolean isEqualSidecarWindowLayoutInfo(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo0, @Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo1) {
        if(Intrinsics.areEqual(sidecarWindowLayoutInfo0, sidecarWindowLayoutInfo1)) {
            return true;
        }
        if(sidecarWindowLayoutInfo0 == null) {
            return false;
        }
        return sidecarWindowLayoutInfo1 == null ? false : SidecarAdapter.b(SidecarAdapter.Companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo0), SidecarAdapter.Companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo1));
    }

    @NotNull
    public final WindowLayoutInfo translate(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo0, @NotNull SidecarDeviceState sidecarDeviceState0) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState0, "state");
        if(sidecarWindowLayoutInfo0 == null) {
            return new WindowLayoutInfo(CollectionsKt__CollectionsKt.emptyList());
        }
        SidecarDeviceState sidecarDeviceState1 = new SidecarDeviceState();
        int v = SidecarAdapter.Companion.getSidecarDevicePosture$window_release(sidecarDeviceState0);
        SidecarAdapter.Companion.setSidecarDevicePosture(sidecarDeviceState1, v);
        return new WindowLayoutInfo(this.translate(SidecarAdapter.Companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo0), sidecarDeviceState1));
    }

    @NotNull
    public final List translate(@NotNull List list0, @NotNull SidecarDeviceState sidecarDeviceState0) {
        Intrinsics.checkNotNullParameter(list0, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(sidecarDeviceState0, "deviceState");
        List list1 = new ArrayList();
        for(Object object0: list0) {
            DisplayFeature displayFeature0 = this.translate$window_release(((SidecarDisplayFeature)object0), sidecarDeviceState0);
            if(displayFeature0 != null) {
                list1.add(displayFeature0);
            }
        }
        return list1;
    }

    @Nullable
    public final DisplayFeature translate$window_release(@NotNull SidecarDisplayFeature sidecarDisplayFeature0, @NotNull SidecarDeviceState sidecarDeviceState0) {
        State foldingFeature$State0;
        Type hardwareFoldingFeature$Type0;
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature0, "feature");
        Intrinsics.checkNotNullParameter(sidecarDeviceState0, "deviceState");
        Intrinsics.checkNotNullExpressionValue("SidecarAdapter", "TAG");
        SidecarDisplayFeature sidecarDisplayFeature1 = (SidecarDisplayFeature)androidx.window.core.SpecificationComputer.Companion.startSpecification$default(SpecificationComputer.Companion, sidecarDisplayFeature0, "SidecarAdapter", this.a, null, 4, null).require("Type must be either TYPE_FOLD or TYPE_HINGE", e.w).require("Feature bounds must not be 0", f.w).require("TYPE_FOLD must have 0 area", g.w).require("Feature be pinned to either left or top", h.w).compute();
        if(sidecarDisplayFeature1 == null) {
            return null;
        }
        switch(sidecarDisplayFeature1.getType()) {
            case 1: {
                hardwareFoldingFeature$Type0 = Type.Companion.getFOLD();
                break;
            }
            case 2: {
                hardwareFoldingFeature$Type0 = Type.Companion.getHINGE();
                break;
            }
            default: {
                return null;
            }
        }
        switch(SidecarAdapter.Companion.getSidecarDevicePosture$window_release(sidecarDeviceState0)) {
            case 2: {
                foldingFeature$State0 = State.HALF_OPENED;
                break;
            }
            case 3: {
                foldingFeature$State0 = State.FLAT;
                break;
            }
            case 0: 
            case 1: 
            case 4: {
                return null;
            }
            default: {
                foldingFeature$State0 = State.FLAT;
                break;
            }
        }
        Rect rect0 = sidecarDisplayFeature0.getRect();
        Intrinsics.checkNotNullExpressionValue(rect0, "feature.rect");
        return new HardwareFoldingFeature(new Bounds(rect0), hardwareFoldingFeature$Type0, foldingFeature$State0);
    }
}

