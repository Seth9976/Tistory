package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.f;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest.Builder;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.size.Precision;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002TUB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000B\u001A\u00020\n*\u00020\tH\u0014\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\rH\u0014\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001A\u00020\u000F2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0014\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0019\u0010\u0017R.\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u001B0\u001A8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R0\u0010&\u001A\u0010\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\n\u0018\u00010\u001A8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b#\u0010\u001D\u001A\u0004\b$\u0010\u001F\"\u0004\b%\u0010!R\"\u0010.\u001A\u00020\'8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00106\u001A\u00020/8\u0000@\u0000X\u0080\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001A\u00020\u000F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010E\u001A\u00020\u001B2\u0006\u0010>\u001A\u00020\u001B8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b?\u0010@\u001A\u0004\bA\u0010B\"\u0004\bC\u0010DR+\u0010\u0004\u001A\u00020\u00032\u0006\u0010>\u001A\u00020\u00038F@@X\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bF\u0010@\u001A\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010\u0006\u001A\u00020\u00052\u0006\u0010>\u001A\u00020\u00058F@@X\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bK\u0010@\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001A\u0010S\u001A\u00020P8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bQ\u0010R\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006V"}, d2 = {"Lcoil/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Lcoil/request/ImageRequest;", "request", "Lcoil/ImageLoader;", "imageLoader", "<init>", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "onRemembered", "()V", "onForgotten", "onAbandoned", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "m", "Lkotlin/jvm/functions/Function1;", "getTransform$coil_compose_base_release", "()Lkotlin/jvm/functions/Function1;", "setTransform$coil_compose_base_release", "(Lkotlin/jvm/functions/Function1;)V", "transform", "n", "getOnState$coil_compose_base_release", "setOnState$coil_compose_base_release", "onState", "Landroidx/compose/ui/layout/ContentScale;", "o", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale$coil_compose_base_release", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale$coil_compose_base_release", "(Landroidx/compose/ui/layout/ContentScale;)V", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "p", "I", "getFilterQuality-f-v9h1I$coil_compose_base_release", "()I", "setFilterQuality-vDHp3xo$coil_compose_base_release", "(I)V", "filterQuality", "q", "Z", "isPreview$coil_compose_base_release", "()Z", "setPreview$coil_compose_base_release", "(Z)V", "isPreview", "<set-?>", "r", "Landroidx/compose/runtime/MutableState;", "getState", "()Lcoil/compose/AsyncImagePainter$State;", "setState", "(Lcoil/compose/AsyncImagePainter$State;)V", "state", "s", "getRequest", "()Lcoil/request/ImageRequest;", "setRequest$coil_compose_base_release", "(Lcoil/request/ImageRequest;)V", "t", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader$coil_compose_base_release", "(Lcoil/ImageLoader;)V", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "Companion", "State", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,474:1\n81#2:475\n107#2,2:476\n81#2:481\n107#2,2:482\n81#2:484\n107#2,2:485\n81#2:487\n107#2,2:488\n81#2:490\n107#2,2:491\n76#3:478\n109#3,2:479\n1#4:493\n845#5,9:494\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n*L\n228#1:475\n228#1:476,2\n230#1:481\n230#1:482,2\n252#1:484\n252#1:485,2\n256#1:487\n256#1:488,2\n260#1:490\n260#1:491,2\n229#1:478\n229#1:479,2\n329#1:494,9\n*E\n"})
public final class AsyncImagePainter extends Painter implements RememberObserver {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/compose/AsyncImagePainter$Companion;", "", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "DefaultTransform", "Lkotlin/jvm/functions/Function1;", "getDefaultTransform", "()Lkotlin/jvm/functions/Function1;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Function1 getDefaultTransform() {
            return AsyncImagePainter.u;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0016\u0010\u0005\u001A\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000B\f\r¨\u0006\u000E"}, d2 = {"Lcoil/compose/AsyncImagePainter$State;", "", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Empty", "Error", "Loading", "Success", "Lcoil/compose/AsyncImagePainter$State$Empty;", "Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State$Success;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class State {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\fR\u0016\u0010\u0010\u001A\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Empty;", "Lcoil/compose/AsyncImagePainter$State;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Empty extends State {
            public static final int $stable;
            @NotNull
            public static final Empty INSTANCE;

            static {
                Empty.INSTANCE = new Empty(null);  // 初始化器: Lcoil/compose/AsyncImagePainter$State;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
            }

            // 去混淆评级： 低(20)
            @Override
            public boolean equals(@Nullable Object object0) {
                return this == object0 ? true : object0 instanceof Empty;
            }

            @Override  // coil.compose.AsyncImagePainter$State
            @Nullable
            public Painter getPainter() {
                return null;
            }

            @Override
            public int hashCode() {
                return -1515560141;
            }

            @Override
            @NotNull
            public String toString() {
                return "Empty";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\f\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000B¨\u0006\u001F"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Lcoil/request/ErrorResult;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/ErrorResult;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "component2", "()Lcoil/request/ErrorResult;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/ErrorResult;)Lcoil/compose/AsyncImagePainter$State$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "b", "Lcoil/request/ErrorResult;", "getResult", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Error extends State {
            public static final int $stable = 8;
            public final Painter a;
            public final ErrorResult b;

            public Error(@Nullable Painter painter0, @NotNull ErrorResult errorResult0) {
                super(null);
                this.a = painter0;
                this.b = errorResult0;
            }

            @Nullable
            public final Painter component1() {
                return this.a;
            }

            @NotNull
            public final ErrorResult component2() {
                return this.b;
            }

            @NotNull
            public final Error copy(@Nullable Painter painter0, @NotNull ErrorResult errorResult0) {
                return new Error(painter0, errorResult0);
            }

            public static Error copy$default(Error asyncImagePainter$State$Error0, Painter painter0, ErrorResult errorResult0, int v, Object object0) {
                if((v & 1) != 0) {
                    painter0 = asyncImagePainter$State$Error0.a;
                }
                if((v & 2) != 0) {
                    errorResult0 = asyncImagePainter$State$Error0.b;
                }
                return asyncImagePainter$State$Error0.copy(painter0, errorResult0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof Error)) {
                    return false;
                }
                return Intrinsics.areEqual(this.a, ((Error)object0).a) ? Intrinsics.areEqual(this.b, ((Error)object0).b) : false;
            }

            @Override  // coil.compose.AsyncImagePainter$State
            @Nullable
            public Painter getPainter() {
                return this.a;
            }

            @NotNull
            public final ErrorResult getResult() {
                return this.b;
            }

            @Override
            public int hashCode() {
                return this.a == null ? this.b.hashCode() : this.b.hashCode() + this.a.hashCode() * 0x1F;
            }

            @Override
            @NotNull
            public String toString() {
                return "Error(painter=" + this.a + ", result=" + this.b + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;)Lcoil/compose/AsyncImagePainter$State$Loading;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Loading extends State {
            public static final int $stable = 8;
            public final Painter a;

            public Loading(@Nullable Painter painter0) {
                super(null);
                this.a = painter0;
            }

            @Nullable
            public final Painter component1() {
                return this.a;
            }

            @NotNull
            public final Loading copy(@Nullable Painter painter0) {
                return new Loading(painter0);
            }

            public static Loading copy$default(Loading asyncImagePainter$State$Loading0, Painter painter0, int v, Object object0) {
                if((v & 1) != 0) {
                    painter0 = asyncImagePainter$State$Loading0.a;
                }
                return asyncImagePainter$State$Loading0.copy(painter0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof Loading ? Intrinsics.areEqual(this.a, ((Loading)object0).a) : false;
            }

            @Override  // coil.compose.AsyncImagePainter$State
            @Nullable
            public Painter getPainter() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a == null ? 0 : this.a.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return "Loading(painter=" + this.a + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000B¨\u0006\u001F"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Success;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Lcoil/request/SuccessResult;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/SuccessResult;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "component2", "()Lcoil/request/SuccessResult;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/SuccessResult;)Lcoil/compose/AsyncImagePainter$State$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "b", "Lcoil/request/SuccessResult;", "getResult", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Success extends State {
            public static final int $stable = 8;
            public final Painter a;
            public final SuccessResult b;

            public Success(@NotNull Painter painter0, @NotNull SuccessResult successResult0) {
                super(null);
                this.a = painter0;
                this.b = successResult0;
            }

            @NotNull
            public final Painter component1() {
                return this.a;
            }

            @NotNull
            public final SuccessResult component2() {
                return this.b;
            }

            @NotNull
            public final Success copy(@NotNull Painter painter0, @NotNull SuccessResult successResult0) {
                return new Success(painter0, successResult0);
            }

            public static Success copy$default(Success asyncImagePainter$State$Success0, Painter painter0, SuccessResult successResult0, int v, Object object0) {
                if((v & 1) != 0) {
                    painter0 = asyncImagePainter$State$Success0.a;
                }
                if((v & 2) != 0) {
                    successResult0 = asyncImagePainter$State$Success0.b;
                }
                return asyncImagePainter$State$Success0.copy(painter0, successResult0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof Success)) {
                    return false;
                }
                return Intrinsics.areEqual(this.a, ((Success)object0).a) ? Intrinsics.areEqual(this.b, ((Success)object0).b) : false;
            }

            @Override  // coil.compose.AsyncImagePainter$State
            @NotNull
            public Painter getPainter() {
                return this.a;
            }

            @NotNull
            public final SuccessResult getResult() {
                return this.b;
            }

            @Override
            public int hashCode() {
                return this.b.hashCode() + this.a.hashCode() * 0x1F;
            }

            @Override
            @NotNull
            public String toString() {
                return "Success(painter=" + this.a + ", result=" + this.b + ')';
            }
        }

        public static final int $stable;

        public State(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public abstract Painter getPainter();
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public CoroutineScope f;
    public final MutableStateFlow g;
    public final MutableState h;
    public final MutableFloatState i;
    public final MutableState j;
    public State k;
    public Painter l;
    public Function1 m;
    public Function1 n;
    public ContentScale o;
    public int p;
    public boolean q;
    public final MutableState r;
    public final MutableState s;
    public final MutableState t;
    public static final b u;

    static {
        AsyncImagePainter.Companion = new Companion(null);
        AsyncImagePainter.u = b.w;
    }

    public AsyncImagePainter(@NotNull ImageRequest imageRequest0, @NotNull ImageLoader imageLoader0) {
        this.g = StateFlowKt.MutableStateFlow(Size.box-impl(0L));
        this.h = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.i = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
        this.j = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.k = Empty.INSTANCE;
        this.m = AsyncImagePainter.u;
        this.o = ContentScale.Companion.getFit();
        this.p = 1;
        this.r = SnapshotStateKt.mutableStateOf$default(Empty.INSTANCE, null, 2, null);
        this.s = SnapshotStateKt.mutableStateOf$default(imageRequest0, null, 2, null);
        this.t = SnapshotStateKt.mutableStateOf$default(imageLoader0, null, 2, null);
    }

    public final Painter a(Drawable drawable0) {
        return drawable0 instanceof BitmapDrawable ? BitmapPainterKt.BitmapPainter-QZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable)drawable0).getBitmap()), 0L, 0L, this.p, 6, null) : new DrawablePainter(drawable0.mutate());
    }

    public static final Painter access$toPainter(AsyncImagePainter asyncImagePainter0, Drawable drawable0) {
        return asyncImagePainter0.a(drawable0);
    }

    public static final State access$toState(AsyncImagePainter asyncImagePainter0, ImageResult imageResult0) {
        asyncImagePainter0.getClass();
        if(imageResult0 instanceof SuccessResult) {
            return new Success(asyncImagePainter0.a(((SuccessResult)imageResult0).getDrawable()), ((SuccessResult)imageResult0));
        }
        if(!(imageResult0 instanceof ErrorResult)) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable drawable0 = imageResult0.getDrawable();
        return drawable0 == null ? new Error(null, ((ErrorResult)imageResult0)) : new Error(asyncImagePainter0.a(drawable0), ((ErrorResult)imageResult0));
    }

    public static final ImageRequest access$updateRequest(AsyncImagePainter asyncImagePainter0, ImageRequest imageRequest0) {
        asyncImagePainter0.getClass();
        Builder imageRequest$Builder0 = ImageRequest.newBuilder$default(imageRequest0, null, 1, null).target(new AsyncImagePainter.updateRequest..inlined.target.default.1(asyncImagePainter0));
        if(imageRequest0.getDefined().getSizeResolver() == null) {
            imageRequest$Builder0.size(new f(asyncImagePainter0, 27));
        }
        if(imageRequest0.getDefined().getScale() == null) {
            imageRequest$Builder0.scale(UtilsKt.toScale(asyncImagePainter0.o));
        }
        if(imageRequest0.getDefined().getPrecision() != Precision.EXACT) {
            imageRequest$Builder0.precision(Precision.INEXACT);
        }
        return imageRequest$Builder0.build();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.i.setFloatValue(f);
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter0) {
        this.j.setValue(colorFilter0);
        return true;
    }

    public final void b(State asyncImagePainter$State0) {
        Painter painter0;
        SuccessResult successResult0;
        State asyncImagePainter$State1 = this.k;
        State asyncImagePainter$State2 = (State)this.m.invoke(asyncImagePainter$State0);
        this.k = asyncImagePainter$State2;
        this.r.setValue(asyncImagePainter$State2);
        RememberObserver rememberObserver0 = null;
        if(asyncImagePainter$State2 instanceof Success) {
            successResult0 = ((Success)asyncImagePainter$State2).getResult();
            goto label_10;
        }
        else if(asyncImagePainter$State2 instanceof Error) {
            successResult0 = ((Error)asyncImagePainter$State2).getResult();
        label_10:
            Transition transition0 = successResult0.getRequest().getTransitionFactory().create(AsyncImagePainterKt.a, successResult0);
            painter0 = transition0 instanceof CrossfadeTransition ? new CrossfadePainter((asyncImagePainter$State1 instanceof Loading ? asyncImagePainter$State1.getPainter() : null), asyncImagePainter$State2.getPainter(), this.o, ((CrossfadeTransition)transition0).getDurationMillis(), !(successResult0 instanceof SuccessResult) || !successResult0.isPlaceholderCached(), ((CrossfadeTransition)transition0).getPreferExactIntrinsicSize()) : null;
        }
        else {
            painter0 = null;
        }
        if(painter0 == null) {
            painter0 = asyncImagePainter$State2.getPainter();
        }
        this.l = painter0;
        this.h.setValue(painter0);
        if(this.f != null && asyncImagePainter$State1.getPainter() != asyncImagePainter$State2.getPainter()) {
            Painter painter1 = asyncImagePainter$State1.getPainter();
            RememberObserver rememberObserver1 = painter1 instanceof RememberObserver ? ((RememberObserver)painter1) : null;
            if(rememberObserver1 != null) {
                rememberObserver1.onForgotten();
            }
            Painter painter2 = asyncImagePainter$State2.getPainter();
            if(painter2 instanceof RememberObserver) {
                rememberObserver0 = (RememberObserver)painter2;
            }
            if(rememberObserver0 != null) {
                rememberObserver0.onRemembered();
            }
        }
        Function1 function10 = this.n;
        if(function10 != null) {
            function10.invoke(asyncImagePainter$State2);
        }
    }

    @NotNull
    public final ContentScale getContentScale$coil_compose_base_release() {
        return this.o;
    }

    public final int getFilterQuality-f-v9h1I$coil_compose_base_release() {
        return this.p;
    }

    @NotNull
    public final ImageLoader getImageLoader() {
        return (ImageLoader)this.t.getValue();
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        Painter painter0 = (Painter)this.h.getValue();
        return painter0 == null ? 0x7FC000007FC00000L : painter0.getIntrinsicSize-NH-jbRc();
    }

    @Nullable
    public final Function1 getOnState$coil_compose_base_release() {
        return this.n;
    }

    @NotNull
    public final ImageRequest getRequest() {
        return (ImageRequest)this.s.getValue();
    }

    @NotNull
    public final State getState() {
        return (State)this.r.getValue();
    }

    @NotNull
    public final Function1 getTransform$coil_compose_base_release() {
        return this.m;
    }

    public final boolean isPreview$coil_compose_base_release() {
        return this.q;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        CoroutineScope coroutineScope0 = this.f;
        RememberObserver rememberObserver0 = null;
        if(coroutineScope0 != null) {
            CoroutineScopeKt.cancel$default(coroutineScope0, null, 1, null);
        }
        this.f = null;
        Painter painter0 = this.l;
        if(painter0 instanceof RememberObserver) {
            rememberObserver0 = (RememberObserver)painter0;
        }
        if(rememberObserver0 != null) {
            rememberObserver0.onAbandoned();
        }
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope0) {
        Size size0 = Size.box-impl(drawScope0.getSize-NH-jbRc());
        this.g.setValue(size0);
        Object object0 = this.h.getValue();
        if(((Painter)object0) != null) {
            ((Painter)object0).draw-x_KDEd0(drawScope0, drawScope0.getSize-NH-jbRc(), this.i.getFloatValue(), ((ColorFilter)this.j.getValue()));
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        CoroutineScope coroutineScope0 = this.f;
        RememberObserver rememberObserver0 = null;
        if(coroutineScope0 != null) {
            CoroutineScopeKt.cancel$default(coroutineScope0, null, 1, null);
        }
        this.f = null;
        Painter painter0 = this.l;
        if(painter0 instanceof RememberObserver) {
            rememberObserver0 = (RememberObserver)painter0;
        }
        if(rememberObserver0 != null) {
            rememberObserver0.onForgotten();
        }
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        if(this.f != null) {
            return;
        }
        Painter painter0 = null;
        CoroutineScope coroutineScope0 = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
        this.f = coroutineScope0;
        RememberObserver rememberObserver0 = this.l instanceof RememberObserver ? ((RememberObserver)this.l) : null;
        if(rememberObserver0 != null) {
            rememberObserver0.onRemembered();
        }
        if(this.q) {
            Drawable drawable0 = ImageRequest.newBuilder$default(this.getRequest(), null, 1, null).defaults(this.getImageLoader().getDefaults()).build().getPlaceholder();
            if(drawable0 != null) {
                painter0 = this.a(drawable0);
            }
            this.b(new Loading(painter0));
            return;
        }
        BuildersKt.launch$default(coroutineScope0, null, null, new e(this, null), 3, null);
    }

    public final void setContentScale$coil_compose_base_release(@NotNull ContentScale contentScale0) {
        this.o = contentScale0;
    }

    public final void setFilterQuality-vDHp3xo$coil_compose_base_release(int v) {
        this.p = v;
    }

    public final void setImageLoader$coil_compose_base_release(@NotNull ImageLoader imageLoader0) {
        this.t.setValue(imageLoader0);
    }

    public final void setOnState$coil_compose_base_release(@Nullable Function1 function10) {
        this.n = function10;
    }

    public final void setPreview$coil_compose_base_release(boolean z) {
        this.q = z;
    }

    public final void setRequest$coil_compose_base_release(@NotNull ImageRequest imageRequest0) {
        this.s.setValue(imageRequest0);
    }

    public final void setTransform$coil_compose_base_release(@NotNull Function1 function10) {
        this.m = function10;
    }
}

