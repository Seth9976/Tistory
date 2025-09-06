package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001A\u00020\u0006X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001A\u00020\nX¦\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0012\u0010\r\u001A\u00020\u000EX¦\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/FoldingFeature;", "Landroidx/window/layout/DisplayFeature;", "isSeparating", "", "()Z", "occlusionType", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "orientation", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "state", "Landroidx/window/layout/FoldingFeature$State;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "OcclusionType", "Orientation", "State", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public interface FoldingFeature extends DisplayFeature {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType;", "", "", "toString", "()Ljava/lang/String;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class OcclusionType {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;", "", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "FULL", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "NONE", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        @NotNull
        public static final Companion Companion;
        @JvmField
        @NotNull
        public static final OcclusionType FULL;
        @JvmField
        @NotNull
        public static final OcclusionType NONE;
        public final String a;

        static {
            OcclusionType.Companion = new Companion(null);
            OcclusionType.NONE = new OcclusionType("NONE");
            OcclusionType.FULL = new OcclusionType("FULL");
        }

        public OcclusionType(String s) {
            this.a = s;
        }

        @Override
        @NotNull
        public String toString() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$Orientation;", "", "", "toString", "()Ljava/lang/String;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Orientation {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$Orientation$Companion;", "", "Landroidx/window/layout/FoldingFeature$Orientation;", "HORIZONTAL", "Landroidx/window/layout/FoldingFeature$Orientation;", "VERTICAL", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
        public static final class androidx.window.layout.FoldingFeature.Orientation.Companion {
            public androidx.window.layout.FoldingFeature.Orientation.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        @NotNull
        public static final androidx.window.layout.FoldingFeature.Orientation.Companion Companion;
        @JvmField
        @NotNull
        public static final Orientation HORIZONTAL;
        @JvmField
        @NotNull
        public static final Orientation VERTICAL;
        public final String a;

        static {
            Orientation.Companion = new androidx.window.layout.FoldingFeature.Orientation.Companion(null);
            Orientation.VERTICAL = new Orientation("VERTICAL");
            Orientation.HORIZONTAL = new Orientation("HORIZONTAL");
        }

        public Orientation(String s) {
            this.a = s;
        }

        @Override
        @NotNull
        public String toString() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$State;", "", "", "toString", "()Ljava/lang/String;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class State {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/FoldingFeature$State$Companion;", "", "Landroidx/window/layout/FoldingFeature$State;", "FLAT", "Landroidx/window/layout/FoldingFeature$State;", "HALF_OPENED", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
        public static final class androidx.window.layout.FoldingFeature.State.Companion {
            public androidx.window.layout.FoldingFeature.State.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        @NotNull
        public static final androidx.window.layout.FoldingFeature.State.Companion Companion;
        @JvmField
        @NotNull
        public static final State FLAT;
        @JvmField
        @NotNull
        public static final State HALF_OPENED;
        public final String a;

        static {
            State.Companion = new androidx.window.layout.FoldingFeature.State.Companion(null);
            State.FLAT = new State("FLAT");
            State.HALF_OPENED = new State("HALF_OPENED");
        }

        public State(String s) {
            this.a = s;
        }

        @Override
        @NotNull
        public String toString() {
            return this.a;
        }
    }

    @NotNull
    OcclusionType getOcclusionType();

    @NotNull
    Orientation getOrientation();

    @NotNull
    State getState();

    boolean isSeparating();
}

