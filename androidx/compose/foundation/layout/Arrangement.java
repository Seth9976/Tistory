package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b;\b\u00C7\u0002\u0018\u00002\u00020\u0001:\u0005PQRSTJ\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\"\u0010\u0007\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\t\u001A\u00020\rH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0012J/\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\'\u0010 \u001A\u00020\u001A2\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ/\u0010\"\u001A\u00020\u001A2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b!\u0010\u001CJ/\u0010$\u001A\u00020\u001A2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b#\u0010\u001CJ/\u0010&\u001A\u00020\u001A2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b%\u0010\u001CJ/\u0010(\u001A\u00020\u001A2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b\'\u0010\u001CR \u0010/\u001A\u00020\n8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001A\u0004\b+\u0010,R \u00103\u001A\u00020\n8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b0\u0010*\u0012\u0004\b2\u0010.\u001A\u0004\b1\u0010,R \u00109\u001A\u00020\u000E8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010.\u001A\u0004\b6\u00107R \u0010=\u001A\u00020\u000E8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b:\u00105\u0012\u0004\b<\u0010.\u001A\u0004\b;\u00107R \u0010C\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010.\u001A\u0004\b@\u0010AR \u0010G\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bD\u0010?\u0012\u0004\bF\u0010.\u001A\u0004\bE\u0010AR \u0010K\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bH\u0010?\u0012\u0004\bJ\u0010.\u001A\u0004\bI\u0010AR \u0010O\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bL\u0010?\u0012\u0004\bN\u0010.\u001A\u0004\bM\u0010A\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006U"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "aligned", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "", "placeRightOrBottom$foundation_layout_release", "(I[I[IZ)V", "placeRightOrBottom", "placeLeftOrTop$foundation_layout_release", "([I[IZ)V", "placeLeftOrTop", "placeCenter$foundation_layout_release", "placeCenter", "placeSpaceEvenly$foundation_layout_release", "placeSpaceEvenly", "placeSpaceBetween$foundation_layout_release", "placeSpaceBetween", "placeSpaceAround$foundation_layout_release", "placeSpaceAround", "a", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart$annotations", "()V", "Start", "b", "getEnd", "getEnd$annotations", "End", "c", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop$annotations", "Top", "d", "getBottom", "getBottom$annotations", "Bottom", "e", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "Center", "f", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "g", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "h", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,715:1\n706#1,2:721\n709#1,5:726\n706#1,2:731\n709#1,5:736\n706#1,2:744\n709#1,5:750\n706#1,2:758\n709#1,5:764\n706#1,2:772\n709#1,5:778\n706#1,2:786\n709#1,5:792\n148#2:716\n148#2:717\n13032#3,3:718\n13674#3,3:723\n13674#3,3:733\n13032#3,3:741\n13674#3,2:746\n13676#3:749\n13032#3,3:755\n13674#3,2:760\n13676#3:763\n13032#3,3:769\n13674#3,2:774\n13676#3:777\n13032#3,3:783\n13674#3,2:788\n13676#3:791\n13674#3,3:797\n26#4:748\n26#4:762\n26#4:776\n26#4:790\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n619#1:721,2\n619#1:726,5\n627#1:731,2\n627#1:736,5\n641#1:744,2\n641#1:750,5\n656#1:758,2\n656#1:764,5\n680#1:772,2\n680#1:778,5\n699#1:786,2\n699#1:792,5\n355#1:716\n367#1:717\n617#1:718,3\n619#1:723,3\n627#1:733,3\n639#1:741,3\n641#1:746,2\n641#1:749\n653#1:755,3\n656#1:760,2\n656#1:763\n670#1:769,3\n680#1:774,2\n680#1:777\n692#1:783,3\n699#1:788,2\n699#1:791\n707#1:797,3\n642#1:748\n657#1:762\n681#1:776\n700#1:790\n*E\n"})
public final class Arrangement {
    @Immutable
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001F\bÇ\u0002\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ\"\u0010\u0007\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0018\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0014\u0010\u0015R \u0010\u001C\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u0012\u0004\b\u001B\u0010\u0017\u001A\u0004\b\u001A\u0010\u0015R \u0010 \u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001D\u0010\u0013\u0012\u0004\b\u001F\u0010\u0017\u001A\u0004\b\u001E\u0010\u0015R \u0010$\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0013\u0012\u0004\b#\u0010\u0017\u001A\u0004\b\"\u0010\u0015R \u0010(\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0013\u0012\u0004\b\'\u0010\u0017\u001A\u0004\b&\u0010\u0015R \u0010,\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0013\u0012\u0004\b+\u0010\u0017\u001A\u0004\b*\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "aligned", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "a", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getLeft", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getLeft$annotations", "()V", "Left", "b", "getCenter", "getCenter$annotations", "Center", "c", "getRight", "getRight$annotations", "Right", "d", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "e", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "f", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n148#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n556#1:716\n*E\n"})
    public static final class Absolute {
        public static final int $stable;
        @NotNull
        public static final Absolute INSTANCE;
        public static final Arrangement.Absolute.Left.1 a;
        public static final Arrangement.Absolute.Center.1 b;
        public static final Arrangement.Absolute.Right.1 c;
        public static final Arrangement.Absolute.SpaceBetween.1 d;
        public static final Arrangement.Absolute.SpaceEvenly.1 e;
        public static final Arrangement.Absolute.SpaceAround.1 f;

        static {
            Absolute.INSTANCE = new Absolute();  // 初始化器: Ljava/lang/Object;-><init>()V
            Absolute.a = new Arrangement.Absolute.Left.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Absolute.b = new Arrangement.Absolute.Center.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Absolute.c = new Arrangement.Absolute.Right.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Absolute.d = new Arrangement.Absolute.SpaceBetween.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Absolute.e = new Arrangement.Absolute.SpaceEvenly.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            Absolute.f = new Arrangement.Absolute.SpaceAround.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Stable
        @NotNull
        public final Horizontal aligned(@NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0) {
            return new SpacedAligned(0.0f, false, new f(alignment$Horizontal0), null);
        }

        @NotNull
        public final Horizontal getCenter() {
            return Absolute.b;
        }

        @Stable
        public static void getCenter$annotations() {
        }

        @NotNull
        public final Horizontal getLeft() {
            return Absolute.a;
        }

        @Stable
        public static void getLeft$annotations() {
        }

        @NotNull
        public final Horizontal getRight() {
            return Absolute.c;
        }

        @Stable
        public static void getRight$annotations() {
        }

        @NotNull
        public final Horizontal getSpaceAround() {
            return Absolute.f;
        }

        @Stable
        public static void getSpaceAround$annotations() {
        }

        @NotNull
        public final Horizontal getSpaceBetween() {
            return Absolute.d;
        }

        @Stable
        public static void getSpaceBetween$annotations() {
        }

        @NotNull
        public final Horizontal getSpaceEvenly() {
            return Absolute.e;
        }

        @Stable
        public static void getSpaceEvenly$annotations() {
        }

        @Stable
        @NotNull
        public final HorizontalOrVertical spacedBy-0680j_4(float f) {
            return new SpacedAligned(f, false, null, null);
        }

        @Stable
        @NotNull
        public final Horizontal spacedBy-D5KLDUw(float f, @NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0) {
            return new SpacedAligned(f, false, new g(alignment$Horizontal0), null);
        }

        @Stable
        @NotNull
        public final Vertical spacedBy-D5KLDUw(float f, @NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical0) {
            return new SpacedAligned(f, false, new h(alignment$Vertical0), null);
        }
    }

    @Stable
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0006\u001A\u00020\u0007*\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\fH&R\u001A\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n148#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n51#1:716\n*E\n"})
    public interface Horizontal {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public static final class DefaultImpls {
            @Deprecated
            public static float getSpacing-D9Ej5fM(@NotNull Horizontal arrangement$Horizontal0) {
                return arrangement$Horizontal0.super.getSpacing-D9Ej5fM();
            }
        }

        void arrange(@NotNull Density arg1, int arg2, @NotNull int[] arg3, @NotNull LayoutDirection arg4, @NotNull int[] arg5);

        default float getSpacing-D9Ej5fM() {
            return 0.0f;
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001A\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n148#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n108#1:716\n*E\n"})
    public interface HorizontalOrVertical extends Horizontal, Vertical {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical.DefaultImpls {
            @Deprecated
            public static float getSpacing-D9Ej5fM(@NotNull HorizontalOrVertical arrangement$HorizontalOrVertical0) {
                return arrangement$HorizontalOrVertical0.super.getSpacing-D9Ej5fM();
            }
        }

        @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical
        default float getSpacing-D9Ej5fM() {
            return 0.0f;
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u001A\u0010\t\u001A\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00A2\u0006\u0004\b\n\u0010\u000BJ3\u0010\u0013\u001A\u00020\u0012*\u00020\f2\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001A\u00020\u0012*\u00020\f2\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ$\u0010\u001E\u001A\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJE\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u001C\b\u0002\u0010\t\u001A\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b \u0010!J\u0010\u0010#\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010\'\u001A\u00020\u00042\b\u0010&\u001A\u0004\u0018\u00010%H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u001AR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001DR+\u0010\t\u001A\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001FR \u00104\u001A\u00020\u00028\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b2\u0010*\u001A\u0004\b3\u0010\u001A\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00065"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Dp;", "space", "", "rtlMirror", "Lkotlin/Function2;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "alignment", "<init>", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "layoutDirection", "outPositions", "", "arrange", "(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "(Landroidx/compose/ui/unit/Density;I[I[I)V", "", "toString", "()Ljava/lang/String;", "component1-D9Ej5fM", "()F", "component1", "component2", "()Z", "component3", "()Lkotlin/jvm/functions/Function2;", "copy-8Feqmps", "(FZLkotlin/jvm/functions/Function2;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "copy", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getSpace-D9Ej5fM", "b", "Z", "getRtlMirror", "c", "Lkotlin/jvm/functions/Function2;", "getAlignment", "d", "getSpacing-D9Ej5fM", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#2,2:716\n709#2,5:721\n13674#3,3:718\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n586#1:716,2\n586#1:721,5\n586#1:718,3\n*E\n"})
    public static final class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable;
        public final float a;
        public final boolean b;
        public final Function2 c;
        public final float d;

        public SpacedAligned(float f, boolean z, Function2 function20, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = f;
            this.b = z;
            this.c = function20;
            this.d = f;
        }

        @Override  // androidx.compose.foundation.layout.Arrangement$Horizontal
        public void arrange(@NotNull Density density0, int v, @NotNull int[] arr_v, @NotNull LayoutDirection layoutDirection0, @NotNull int[] arr_v1) {
            int v5;
            int v4;
            if(arr_v.length == 0) {
                return;
            }
            int v1 = density0.roundToPx-0680j_4(this.a);
            if(!this.b || layoutDirection0 != LayoutDirection.Rtl) {
                int v3 = 0;
                v4 = 0;
                v5 = 0;
                int v6 = 0;
                while(v3 < arr_v.length) {
                    int v7 = arr_v[v3];
                    int v8 = Math.min(v4, v - v7);
                    arr_v1[v6] = v8;
                    int v9 = Math.min(v1, v - v8 - v7);
                    int v10 = arr_v1[v6] + v7 + v9;
                    ++v3;
                    ++v6;
                    v5 = v9;
                    v4 = v10;
                }
            }
            else {
                int v11 = arr_v.length - 1;
                v4 = 0;
                v5 = 0;
                while(-1 < v11) {
                    int v12 = arr_v[v11];
                    int v13 = Math.min(v4, v - v12);
                    arr_v1[v11] = v13;
                    int v14 = Math.min(v1, v - v13 - v12);
                    int v15 = arr_v1[v11] + v12 + v14;
                    --v11;
                    v5 = v14;
                    v4 = v15;
                }
            }
            int v16 = v4 - v5;
            Function2 function20 = this.c;
            if(function20 != null && v16 < v) {
                int v17 = ((Number)function20.invoke(((int)(v - v16)), layoutDirection0)).intValue();
                for(int v2 = 0; v2 < arr_v1.length; ++v2) {
                    arr_v1[v2] += v17;
                }
            }
        }

        @Override  // androidx.compose.foundation.layout.Arrangement$Vertical
        public void arrange(@NotNull Density density0, int v, @NotNull int[] arr_v, @NotNull int[] arr_v1) {
            this.arrange(density0, v, arr_v, LayoutDirection.Ltr, arr_v1);
        }

        public final float component1-D9Ej5fM() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @Nullable
        public final Function2 component3() {
            return this.c;
        }

        @NotNull
        public final SpacedAligned copy-8Feqmps(float f, boolean z, @Nullable Function2 function20) {
            return new SpacedAligned(f, z, function20, null);
        }

        public static SpacedAligned copy-8Feqmps$default(SpacedAligned arrangement$SpacedAligned0, float f, boolean z, Function2 function20, int v, Object object0) {
            if((v & 1) != 0) {
                f = arrangement$SpacedAligned0.a;
            }
            if((v & 2) != 0) {
                z = arrangement$SpacedAligned0.b;
            }
            if((v & 4) != 0) {
                function20 = arrangement$SpacedAligned0.c;
            }
            return arrangement$SpacedAligned0.copy-8Feqmps(f, z, function20);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SpacedAligned)) {
                return false;
            }
            if(!Dp.equals-impl0(this.a, ((SpacedAligned)object0).a)) {
                return false;
            }
            return this.b == ((SpacedAligned)object0).b ? Intrinsics.areEqual(this.c, ((SpacedAligned)object0).c) : false;
        }

        @Nullable
        public final Function2 getAlignment() {
            return this.c;
        }

        public final boolean getRtlMirror() {
            return this.b;
        }

        public final float getSpace-D9Ej5fM() {
            return this.a;
        }

        @Override  // androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical
        public float getSpacing-D9Ej5fM() {
            return this.d;
        }

        @Override
        public int hashCode() {
            int v = a.e(Dp.hashCode-impl(this.a) * 0x1F, 0x1F, this.b);
            return this.c == null ? v : v + this.c.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append((this.b ? "" : "Absolute"));
            stringBuilder0.append("Arrangement#spacedAligned(");
            a.u(this.a, ", ", stringBuilder0);
            stringBuilder0.append(this.c);
            stringBuilder0.append(')');
            return stringBuilder0.toString();
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\u0006\u001A\u00020\u0007*\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\fH&R\u001A\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "outPositions", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n148#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n80#1:716\n*E\n"})
    public interface Vertical {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.foundation.layout.Arrangement.Vertical.DefaultImpls {
            @Deprecated
            public static float getSpacing-D9Ej5fM(@NotNull Vertical arrangement$Vertical0) {
                return arrangement$Vertical0.super.getSpacing-D9Ej5fM();
            }
        }

        void arrange(@NotNull Density arg1, int arg2, @NotNull int[] arg3, @NotNull int[] arg4);

        default float getSpacing-D9Ej5fM() {
            return 0.0f;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Arrangement INSTANCE;
    public static final Arrangement.Start.1 a;
    public static final Arrangement.End.1 b;
    public static final Arrangement.Top.1 c;
    public static final Arrangement.Bottom.1 d;
    public static final Arrangement.Center.1 e;
    public static final Arrangement.SpaceEvenly.1 f;
    public static final Arrangement.SpaceBetween.1 g;
    public static final Arrangement.SpaceAround.1 h;

    static {
        Arrangement.INSTANCE = new Arrangement();  // 初始化器: Ljava/lang/Object;-><init>()V
        Arrangement.a = new Arrangement.Start.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        Arrangement.b = new Arrangement.End.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        Arrangement.c = (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, int[] arr_v, int[] arr_v1) -> {
            int v = 0;
            if(!false) {
                int v2 = 0;
                for(int v1 = 0; v < arr_v.length; ++v1) {
                    int v3 = arr_v[v];
                    arr_v1[v1] = v2;
                    v2 += v3;
                    ++v;
                }
                return;
            }
            for(int v4 = arr_v.length - 1; -1 < v4; --v4) {
                int v5 = arr_v[v4];
                arr_v1[v4] = v;
                v += v5;
            }
        };
        Arrangement.d = (/* 缺少LAMBDA参数 */, int v, int[] arr_v, int[] arr_v1) -> {
            int v1 = 0;
            int v3 = 0;
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                v3 += arr_v[v2];
            }
            int v4 = v - v3;
            if(!false) {
                for(int v5 = 0; v1 < arr_v.length; ++v5) {
                    int v6 = arr_v[v1];
                    arr_v1[v5] = v4;
                    v4 += v6;
                    ++v1;
                }
                return;
            }
            for(int v7 = arr_v.length - 1; -1 < v7; --v7) {
                int v8 = arr_v[v7];
                arr_v1[v7] = v4;
                v4 += v8;
            }
        };
        Arrangement.e = new Arrangement.Center.1();
        Arrangement.f = new Arrangement.SpaceEvenly.1();
        Arrangement.g = new Arrangement.SpaceBetween.1();
        Arrangement.h = new Arrangement.SpaceAround.1();
    }

    @Stable
    @NotNull
    public final Horizontal aligned(@NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0) {
        return new SpacedAligned(0.0f, true, new i(alignment$Horizontal0), null);
    }

    @Stable
    @NotNull
    public final Vertical aligned(@NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical0) {
        return new SpacedAligned(0.0f, false, new j(alignment$Vertical0), null);
    }

    @NotNull
    public final Vertical getBottom() {
        return Arrangement.d;
    }

    @Stable
    public static void getBottom$annotations() {
    }

    @NotNull
    public final HorizontalOrVertical getCenter() {
        return Arrangement.e;
    }

    @Stable
    public static void getCenter$annotations() {
    }

    @NotNull
    public final Horizontal getEnd() {
        return Arrangement.b;
    }

    @Stable
    public static void getEnd$annotations() {
    }

    @NotNull
    public final HorizontalOrVertical getSpaceAround() {
        return Arrangement.h;
    }

    @Stable
    public static void getSpaceAround$annotations() {
    }

    @NotNull
    public final HorizontalOrVertical getSpaceBetween() {
        return Arrangement.g;
    }

    @Stable
    public static void getSpaceBetween$annotations() {
    }

    @NotNull
    public final HorizontalOrVertical getSpaceEvenly() {
        return Arrangement.f;
    }

    @Stable
    public static void getSpaceEvenly$annotations() {
    }

    @NotNull
    public final Horizontal getStart() {
        return Arrangement.a;
    }

    @Stable
    public static void getStart$annotations() {
    }

    @NotNull
    public final Vertical getTop() {
        return Arrangement.c;
    }

    @Stable
    public static void getTop$annotations() {
    }

    public final void placeCenter$foundation_layout_release(int v, @NotNull int[] arr_v, @NotNull int[] arr_v1, boolean z) {
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = ((float)(v - v3)) / 2.0f;
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = Math.round(f);
                f += (float)v5;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = Math.round(f);
            f += (float)v7;
        }
    }

    // 检测为 Lambda 实现
    public final void placeLeftOrTop$foundation_layout_release(@NotNull int[] arr_v, @NotNull int[] arr_v1, boolean z) [...]

    // 检测为 Lambda 实现
    public final void placeRightOrBottom$foundation_layout_release(int v, @NotNull int[] arr_v, @NotNull int[] arr_v1, boolean z) [...]

    public final void placeSpaceAround$foundation_layout_release(int v, @NotNull int[] arr_v, @NotNull int[] arr_v1, boolean z) {
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = arr_v.length == 0 ? 0.0f : ((float)(v - v3)) / ((float)arr_v.length);
        float f1 = f / 2.0f;
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = Math.round(f1);
                f1 += ((float)v5) + f;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = Math.round(f1);
            f1 += ((float)v7) + f;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int v, @NotNull int[] arr_v, @NotNull int[] arr_v1, boolean z) {
        if(arr_v.length == 0) {
            return;
        }
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = ((float)(v - v3)) / ((float)Math.max(ArraysKt___ArraysKt.getLastIndex(arr_v), 1));
        float f1 = !z || arr_v.length != 1 ? 0.0f : f;
        if(!z) {
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = Math.round(f1);
                f1 += ((float)v5) + f;
                ++v1;
            }
            return;
        }
        for(int v6 = arr_v.length - 1; -1 < v6; --v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = Math.round(f1);
            f1 += ((float)v7) + f;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int v, @NotNull int[] arr_v, @NotNull int[] arr_v1, boolean z) {
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v3 += arr_v[v2];
        }
        float f = ((float)(v - v3)) / ((float)(arr_v.length + 1));
        if(!z) {
            float f1 = f;
            for(int v4 = 0; v1 < arr_v.length; ++v4) {
                int v5 = arr_v[v1];
                arr_v1[v4] = Math.round(f1);
                f1 += ((float)v5) + f;
                ++v1;
            }
            return;
        }
        int v6 = arr_v.length - 1;
        float f2 = f;
        while(-1 < v6) {
            int v7 = arr_v[v6];
            arr_v1[v6] = Math.round(f2);
            f2 += ((float)v7) + f;
            --v6;
        }
    }

    @Stable
    @NotNull
    public final HorizontalOrVertical spacedBy-0680j_4(float f) {
        return new SpacedAligned(f, true, k.w, null);
    }

    @Stable
    @NotNull
    public final Horizontal spacedBy-D5KLDUw(float f, @NotNull androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0) {
        return new SpacedAligned(f, true, new l(alignment$Horizontal0), null);
    }

    @Stable
    @NotNull
    public final Vertical spacedBy-D5KLDUw(float f, @NotNull androidx.compose.ui.Alignment.Vertical alignment$Vertical0) {
        return new SpacedAligned(f, false, new m(alignment$Vertical0), null);
    }
}

