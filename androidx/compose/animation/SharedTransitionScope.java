package androidx.compose.animation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalSharedTransitionApi
@Stable
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001:\u0004\u0005345J\u0010\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&J\u0015\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\'\u00A2\u0006\u0002\u0010\rJ\u001C\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u0013H\u0017J\u001C\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u0013H\u0017JD\u0010\u0016\u001A\u00020\u0017*\u00020\u00172\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00030\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u001B2\u001C\b\u0002\u0010\u001C\u001A\u0016\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001F\u0012\u0006\u0012\u0004\u0018\u00010 0\u001DH&Jl\u0010!\u001A\u00020\u0017*\u00020\u00172\u0006\u0010\"\u001A\u00020\n2\u0006\u0010#\u001A\u00020$2\b\b\u0002\u0010%\u001A\u00020\u000F2\b\b\u0002\u0010&\u001A\u00020\u00152\b\b\u0002\u0010\'\u001A\u00020(2\b\b\u0002\u0010)\u001A\u00020*2\b\b\u0002\u0010+\u001A\u00020,2\b\b\u0002\u0010-\u001A\u00020\u00032\b\b\u0002\u0010\u001A\u001A\u00020\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u0006H&JN\u0010.\u001A\u00020\u0017*\u00020\u00172\u0006\u0010/\u001A\u00020\n2\u0006\u0010#\u001A\u00020$2\b\b\u0002\u0010\'\u001A\u00020(2\b\b\u0002\u0010+\u001A\u00020,2\b\b\u0002\u0010-\u001A\u00020\u00032\b\b\u0002\u0010\u001A\u001A\u00020\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u0006H&JN\u00100\u001A\u00020\u0017*\u00020\u00172\u0006\u0010\"\u001A\u00020\n2\u0006\u00101\u001A\u00020\u00032\b\b\u0002\u0010\'\u001A\u00020(2\b\b\u0002\u0010+\u001A\u00020,2\b\b\u0002\u0010-\u001A\u00020\u00032\b\b\u0002\u0010\u001A\u001A\u00020\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\u0006H&J\f\u00102\u001A\u00020\u0017*\u00020\u0017H&R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004\u00F8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00A8\u00066\u00C0\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "isTransitionActive", "", "()Z", "OverlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "rememberSharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "key", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "scaleInSharedContentToBounds", "Landroidx/compose/animation/EnterTransition;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "scaleOutSharedContentToBounds", "Landroidx/compose/animation/ExitTransition;", "renderInSharedTransitionScopeOverlay", "Landroidx/compose/ui/Modifier;", "renderInOverlay", "Lkotlin/Function0;", "zIndexInOverlay", "", "clipInOverlayDuringTransition", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "sharedBounds", "sharedContentState", "animatedVisibilityScope", "Landroidx/compose/animation/AnimatedVisibilityScope;", "enter", "exit", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "resizeMode", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderInOverlayDuringTransition", "sharedElement", "state", "sharedElementWithCallerManagedVisibility", "visible", "skipToLookaheadSize", "PlaceHolderSize", "ResizeMode", "SharedContentState", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SharedTransitionScope extends LookaheadScope {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "getClipPath", "Landroidx/compose/ui/graphics/Path;", "state", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface OverlayClip {
        @Nullable
        Path getClipPath(@NotNull SharedContentState arg1, @NotNull Rect arg2, @NotNull LayoutDirection arg3, @NotNull Density arg4);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "", "calculateSize", "Landroidx/compose/ui/unit/IntSize;", "contentSize", "animatedSize", "calculateSize-JyjRU_E", "(JJ)J", "Companion", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface PlaceHolderSize {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;", "", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "animatedSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "getAnimatedSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "contentSize", "getContentSize", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public static final Companion a;

            static {
                Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            }

            @NotNull
            public final PlaceHolderSize getAnimatedSize() {
                return (long v, long v1) -> v1;
            }

            @NotNull
            public final PlaceHolderSize getContentSize() {
                return (long v, long v1) -> v;
            }
        }

        @NotNull
        public static final Companion Companion;

        static {
            PlaceHolderSize.Companion = Companion.a;
        }

        long calculateSize-JyjRU_E(long arg1, long arg2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "", "Companion", "Landroidx/compose/animation/m;", "Landroidx/compose/animation/n;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface ResizeMode {
        @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode$Companion;", "", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "ScaleToBounds", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "RemeasureToBounds", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "getRemeasureToBounds", "()Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.animation.SharedTransitionScope.ResizeMode.Companion {
            public static final androidx.compose.animation.SharedTransitionScope.ResizeMode.Companion a;

            static {
                androidx.compose.animation.SharedTransitionScope.ResizeMode.Companion.a = new androidx.compose.animation.SharedTransitionScope.ResizeMode.Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            }

            @NotNull
            public final ResizeMode ScaleToBounds(@NotNull ContentScale contentScale0, @NotNull Alignment alignment0) {
                return SharedTransitionScopeKt.access$ScaleToBoundsCached(contentScale0, alignment0);
            }

            public static ResizeMode ScaleToBounds$default(androidx.compose.animation.SharedTransitionScope.ResizeMode.Companion sharedTransitionScope$ResizeMode$Companion0, ContentScale contentScale0, Alignment alignment0, int v, Object object0) {
                if((v & 1) != 0) {
                    contentScale0 = ContentScale.Companion.getFillWidth();
                }
                if((v & 2) != 0) {
                    alignment0 = Alignment.Companion.getCenter();
                }
                return sharedTransitionScope$ResizeMode$Companion0.ScaleToBounds(contentScale0, alignment0);
            }

            @NotNull
            public final ResizeMode getRemeasureToBounds() {
                return m.a;
            }
        }

        @NotNull
        public static final androidx.compose.animation.SharedTransitionScope.ResizeMode.Companion Companion;

        static {
            ResizeMode.Companion = androidx.compose.animation.SharedTransitionScope.ResizeMode.Companion.a;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0002\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR/\u0010\u0011\u001A\u0004\u0018\u00010\t2\b\u0010\n\u001A\u0004\u0018\u00010\t8@@@X\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0013\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001A\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001B\u001A\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "", "key", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Landroidx/compose/animation/SharedElementInternalState;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getInternalState$animation_release", "()Landroidx/compose/animation/SharedElementInternalState;", "setInternalState$animation_release", "(Landroidx/compose/animation/SharedElementInternalState;)V", "internalState", "", "isMatchFound", "()Z", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay", "()Landroidx/compose/ui/graphics/Path;", "clipPathInOverlay", "getParentSharedContentState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "parentSharedContentState", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1337:1\n81#2:1338\n107#2,2:1339\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n*L\n690#1:1338\n690#1:1339,2\n*E\n"})
    public static final class SharedContentState {
        public static final int $stable = 8;
        public final Object a;
        public final MutableState b;

        public SharedContentState(@NotNull Object object0) {
            this.a = object0;
            this.b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        }

        @Nullable
        public final Path getClipPathInOverlay() {
            SharedElementInternalState sharedElementInternalState0 = this.getInternalState$animation_release();
            if(sharedElementInternalState0 == null) {
                throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
            }
            return sharedElementInternalState0.getClipPathInOverlay$animation_release();
        }

        @Nullable
        public final SharedElementInternalState getInternalState$animation_release() {
            return (SharedElementInternalState)this.b.getValue();
        }

        @NotNull
        public final Object getKey() {
            return this.a;
        }

        @Nullable
        public final SharedContentState getParentSharedContentState() {
            SharedElementInternalState sharedElementInternalState0 = this.getInternalState$animation_release();
            if(sharedElementInternalState0 == null) {
                throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
            }
            SharedElementInternalState sharedElementInternalState1 = sharedElementInternalState0.getParentState();
            return sharedElementInternalState1 == null ? null : sharedElementInternalState1.getUserState();
        }

        public final boolean isMatchFound() {
            SharedElementInternalState sharedElementInternalState0 = this.getInternalState$animation_release();
            if(sharedElementInternalState0 != null) {
                SharedElement sharedElement0 = sharedElementInternalState0.getSharedElement();
                return sharedElement0 == null ? false : sharedElement0.getFoundMatch();
            }
            return false;
        }

        public final void setInternalState$animation_release(@Nullable SharedElementInternalState sharedElementInternalState0) {
            this.b.setValue(sharedElementInternalState0);
        }
    }

    @NotNull
    OverlayClip OverlayClip(@NotNull Shape arg1);

    boolean isTransitionActive();

    @Composable
    @NotNull
    SharedContentState rememberSharedContentState(@NotNull Object arg1, @Nullable Composer arg2, int arg3);

    @NotNull
    Modifier renderInSharedTransitionScopeOverlay(@NotNull Modifier arg1, @NotNull Function0 arg2, float arg3, @NotNull Function2 arg4);

    static Modifier renderInSharedTransitionScopeOverlay$default(SharedTransitionScope sharedTransitionScope0, Modifier modifier0, Function0 function00, float f, Function2 function20, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
        }
        if((v & 1) != 0) {
            function00 = new e(sharedTransitionScope0, 15);
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        if((v & 4) != 0) {
            function20 = SharedTransitionScopeKt.d;
        }
        return sharedTransitionScope0.renderInSharedTransitionScopeOverlay(modifier0, function00, f, function20);
    }

    @Deprecated(message = "This EnterTransition has been deprecated. Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    @NotNull
    default EnterTransition scaleInSharedContentToBounds(@NotNull ContentScale contentScale0, @NotNull Alignment alignment0) {
        return EnterExitTransitionKt.withEffect(EnterTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale0, alignment0));
    }

    static EnterTransition scaleInSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope0, ContentScale contentScale0, Alignment alignment0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleInSharedContentToBounds");
        }
        if((v & 1) != 0) {
            contentScale0 = ContentScale.Companion.getFit();
        }
        if((v & 2) != 0) {
            alignment0 = Alignment.Companion.getCenter();
        }
        return sharedTransitionScope0.scaleInSharedContentToBounds(contentScale0, alignment0);
    }

    @Deprecated(message = "This ExitTransition has been deprecated.  Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    @NotNull
    default ExitTransition scaleOutSharedContentToBounds(@NotNull ContentScale contentScale0, @NotNull Alignment alignment0) {
        return EnterExitTransitionKt.withEffect(ExitTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale0, alignment0));
    }

    static ExitTransition scaleOutSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope0, ContentScale contentScale0, Alignment alignment0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleOutSharedContentToBounds");
        }
        if((v & 1) != 0) {
            contentScale0 = ContentScale.Companion.getFit();
        }
        if((v & 2) != 0) {
            alignment0 = Alignment.Companion.getCenter();
        }
        return sharedTransitionScope0.scaleOutSharedContentToBounds(contentScale0, alignment0);
    }

    @NotNull
    Modifier sharedBounds(@NotNull Modifier arg1, @NotNull SharedContentState arg2, @NotNull AnimatedVisibilityScope arg3, @NotNull EnterTransition arg4, @NotNull ExitTransition arg5, @NotNull BoundsTransform arg6, @NotNull ResizeMode arg7, @NotNull PlaceHolderSize arg8, boolean arg9, float arg10, @NotNull OverlayClip arg11);

    static Modifier sharedBounds$default(SharedTransitionScope sharedTransitionScope0, Modifier modifier0, SharedContentState sharedTransitionScope$SharedContentState0, AnimatedVisibilityScope animatedVisibilityScope0, EnterTransition enterTransition0, ExitTransition exitTransition0, BoundsTransform boundsTransform0, ResizeMode sharedTransitionScope$ResizeMode0, PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z, float f, OverlayClip sharedTransitionScope$OverlayClip0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedBounds");
        }
        EnterTransition enterTransition1 = (v & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
        ExitTransition exitTransition1 = (v & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
        BoundsTransform boundsTransform1 = (v & 16) == 0 ? boundsTransform0 : SharedTransitionScopeKt.e;
        ResizeMode sharedTransitionScope$ResizeMode1 = (v & 0x20) == 0 ? sharedTransitionScope$ResizeMode0 : ResizeMode.Companion.ScaleToBounds(ContentScale.Companion.getFillWidth(), Alignment.Companion.getCenter());
        PlaceHolderSize sharedTransitionScope$PlaceHolderSize1 = (v & 0x40) == 0 ? sharedTransitionScope$PlaceHolderSize0 : PlaceHolderSize.Companion.getContentSize();
        boolean z1 = (v & 0x80) == 0 ? z : true;
        float f1 = (v & 0x100) == 0 ? f : 0.0f;
        return (v & 0x200) == 0 ? sharedTransitionScope0.sharedBounds(modifier0, sharedTransitionScope$SharedContentState0, animatedVisibilityScope0, enterTransition1, exitTransition1, boundsTransform1, sharedTransitionScope$ResizeMode1, sharedTransitionScope$PlaceHolderSize1, z1, f1, sharedTransitionScope$OverlayClip0) : sharedTransitionScope0.sharedBounds(modifier0, sharedTransitionScope$SharedContentState0, animatedVisibilityScope0, enterTransition1, exitTransition1, boundsTransform1, sharedTransitionScope$ResizeMode1, sharedTransitionScope$PlaceHolderSize1, z1, f1, SharedTransitionScopeKt.c);
    }

    @NotNull
    Modifier sharedElement(@NotNull Modifier arg1, @NotNull SharedContentState arg2, @NotNull AnimatedVisibilityScope arg3, @NotNull BoundsTransform arg4, @NotNull PlaceHolderSize arg5, boolean arg6, float arg7, @NotNull OverlayClip arg8);

    static Modifier sharedElement$default(SharedTransitionScope sharedTransitionScope0, Modifier modifier0, SharedContentState sharedTransitionScope$SharedContentState0, AnimatedVisibilityScope animatedVisibilityScope0, BoundsTransform boundsTransform0, PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z, float f, OverlayClip sharedTransitionScope$OverlayClip0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElement");
        }
        BoundsTransform boundsTransform1 = (v & 4) == 0 ? boundsTransform0 : SharedTransitionScopeKt.e;
        PlaceHolderSize sharedTransitionScope$PlaceHolderSize1 = (v & 8) == 0 ? sharedTransitionScope$PlaceHolderSize0 : PlaceHolderSize.Companion.getContentSize();
        boolean z1 = (v & 16) == 0 ? z : true;
        float f1 = (v & 0x20) == 0 ? f : 0.0f;
        return (v & 0x40) == 0 ? sharedTransitionScope0.sharedElement(modifier0, sharedTransitionScope$SharedContentState0, animatedVisibilityScope0, boundsTransform1, sharedTransitionScope$PlaceHolderSize1, z1, f1, sharedTransitionScope$OverlayClip0) : sharedTransitionScope0.sharedElement(modifier0, sharedTransitionScope$SharedContentState0, animatedVisibilityScope0, boundsTransform1, sharedTransitionScope$PlaceHolderSize1, z1, f1, SharedTransitionScopeKt.c);
    }

    @NotNull
    Modifier sharedElementWithCallerManagedVisibility(@NotNull Modifier arg1, @NotNull SharedContentState arg2, boolean arg3, @NotNull BoundsTransform arg4, @NotNull PlaceHolderSize arg5, boolean arg6, float arg7, @NotNull OverlayClip arg8);

    static Modifier sharedElementWithCallerManagedVisibility$default(SharedTransitionScope sharedTransitionScope0, Modifier modifier0, SharedContentState sharedTransitionScope$SharedContentState0, boolean z, BoundsTransform boundsTransform0, PlaceHolderSize sharedTransitionScope$PlaceHolderSize0, boolean z1, float f, OverlayClip sharedTransitionScope$OverlayClip0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
        }
        BoundsTransform boundsTransform1 = (v & 4) == 0 ? boundsTransform0 : SharedTransitionScopeKt.e;
        PlaceHolderSize sharedTransitionScope$PlaceHolderSize1 = (v & 8) == 0 ? sharedTransitionScope$PlaceHolderSize0 : PlaceHolderSize.Companion.getContentSize();
        boolean z2 = (v & 16) == 0 ? z1 : true;
        float f1 = (v & 0x20) == 0 ? f : 0.0f;
        return (v & 0x40) == 0 ? sharedTransitionScope0.sharedElementWithCallerManagedVisibility(modifier0, sharedTransitionScope$SharedContentState0, z, boundsTransform1, sharedTransitionScope$PlaceHolderSize1, z2, f1, sharedTransitionScope$OverlayClip0) : sharedTransitionScope0.sharedElementWithCallerManagedVisibility(modifier0, sharedTransitionScope$SharedContentState0, z, boundsTransform1, sharedTransitionScope$PlaceHolderSize1, z2, f1, SharedTransitionScopeKt.c);
    }

    @NotNull
    Modifier skipToLookaheadSize(@NotNull Modifier arg1);
}

