package androidx.compose.foundation.layout;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.R.id;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\\J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\u0006J\u001F\u0010\f\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000E\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0010\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u0010\u0010\u000FR\u0017\u0010\u0016\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b\u0017\u0010\u0013\u001A\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001C\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b\u001A\u0010\u0013\u001A\u0004\b\u001B\u0010\u0015R\u0017\u0010\u001F\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b\u001D\u0010\u0013\u001A\u0004\b\u001E\u0010\u0015R\u0017\u0010\"\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b \u0010\u0013\u001A\u0004\b!\u0010\u0015R\u0017\u0010%\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u0013\u001A\u0004\b$\u0010\u0015R\u0017\u0010(\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b&\u0010\u0013\u001A\u0004\b\'\u0010\u0015R\u0017\u0010+\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b)\u0010\u0013\u001A\u0004\b*\u0010\u0015R\u0017\u0010.\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b,\u0010\u0013\u001A\u0004\b-\u0010\u0015R\u0017\u00104\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0017\u0010:\u001A\u0002058\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u0017\u0010=\u001A\u0002058\u0006\u00A2\u0006\f\n\u0004\b;\u00107\u001A\u0004\b<\u00109R\u0017\u0010@\u001A\u0002058\u0006\u00A2\u0006\f\n\u0004\b>\u00107\u001A\u0004\b?\u00109R\u0017\u0010C\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\bA\u00101\u001A\u0004\bB\u00103R\u0017\u0010F\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\bD\u00101\u001A\u0004\bE\u00103R\u0017\u0010I\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\bG\u00101\u001A\u0004\bH\u00103R\u0017\u0010L\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\bJ\u00101\u001A\u0004\bK\u00103R\u0017\u0010O\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\bM\u00101\u001A\u0004\bN\u00103R\u0017\u0010R\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\bP\u00101\u001A\u0004\bQ\u00103R\u0017\u0010U\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\bS\u00101\u001A\u0004\bT\u00103R\u0017\u0010[\u001A\u00020V8\u0006\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u0010Z\u00A8\u0006]"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Landroid/view/View;", "view", "", "incrementAccessors", "(Landroid/view/View;)V", "decrementAccessors", "Landroidx/core/view/WindowInsetsCompat;", "windowInsets", "", "types", "update", "(Landroidx/core/view/WindowInsetsCompat;I)V", "updateImeAnimationSource", "(Landroidx/core/view/WindowInsetsCompat;)V", "updateImeAnimationTarget", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "a", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getCaptionBar", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBar", "b", "getDisplayCutout", "displayCutout", "c", "getIme", "ime", "d", "getMandatorySystemGestures", "mandatorySystemGestures", "e", "getNavigationBars", "navigationBars", "f", "getStatusBars", "statusBars", "g", "getSystemBars", "systemBars", "h", "getSystemGestures", "systemGestures", "i", "getTappableElement", "tappableElement", "Landroidx/compose/foundation/layout/ValueInsets;", "j", "Landroidx/compose/foundation/layout/ValueInsets;", "getWaterfall", "()Landroidx/compose/foundation/layout/ValueInsets;", "waterfall", "Landroidx/compose/foundation/layout/WindowInsets;", "k", "Landroidx/compose/foundation/layout/WindowInsets;", "getSafeDrawing", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", "l", "getSafeGestures", "safeGestures", "m", "getSafeContent", "safeContent", "n", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "o", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "q", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "r", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "s", "getImeAnimationTarget", "imeAnimationTarget", "t", "getImeAnimationSource", "imeAnimationSource", "", "u", "Z", "getConsumes", "()Z", "consumes", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WindowInsetsHolder {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001A\u00020\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0003\u0010\nR \u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "", "testInsets", "", "setUseTestInsets", "(Z)V", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "current", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Z", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,785:1\n77#2:786\n1223#3,6:787\n361#4,7:793\n1#5:800\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n628#1:786\n631#1:787,6\n646#1:793,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final AndroidWindowInsets access$systemInsets(Companion windowInsetsHolder$Companion0, WindowInsetsCompat windowInsetsCompat0, int v, String s) {
            windowInsetsHolder$Companion0.getClass();
            AndroidWindowInsets androidWindowInsets0 = new AndroidWindowInsets(v, s);
            if(windowInsetsCompat0 != null) {
                androidWindowInsets0.update$foundation_layout_release(windowInsetsCompat0, v);
            }
            return androidWindowInsets0;
        }

        public static final ValueInsets access$valueInsetsIgnoringVisibility(Companion windowInsetsHolder$Companion0, WindowInsetsCompat windowInsetsCompat0, int v, String s) {
            windowInsetsHolder$Companion0.getClass();
            if(windowInsetsCompat0 != null) {
                Insets insets0 = windowInsetsCompat0.getInsetsIgnoringVisibility(v);
                return insets0 == null ? WindowInsets_androidKt.ValueInsets(Insets.NONE, s) : WindowInsets_androidKt.ValueInsets(insets0, s);
            }
            return WindowInsets_androidKt.ValueInsets(Insets.NONE, s);
        }

        @Composable
        @NotNull
        public final WindowInsetsHolder current(@Nullable Composer composer0, int v) {
            WindowInsetsHolder windowInsetsHolder0;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAE8C36EA, v, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view0 = (View)composer0.consume(AndroidCompositionLocals_androidKt.getLocalView());
            synchronized(WindowInsetsHolder.x) {
                WeakHashMap weakHashMap1 = WindowInsetsHolder.x;
                windowInsetsHolder0 = weakHashMap1.get(view0);
                if(windowInsetsHolder0 == null) {
                    windowInsetsHolder0 = new WindowInsetsHolder(null, view0, null);
                    weakHashMap1.put(view0, windowInsetsHolder0);
                }
            }
            boolean z = composer0.changedInstance(windowInsetsHolder0);
            boolean z1 = composer0.changedInstance(view0);
            d4 d40 = composer0.rememberedValue();
            if(z || z1 || d40 == Composer.Companion.getEmpty()) {
                d40 = new d4(windowInsetsHolder0, view0);
                composer0.updateRememberedValue(d40);
            }
            EffectsKt.DisposableEffect(windowInsetsHolder0, d40, composer0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return windowInsetsHolder0;
        }

        @TestOnly
        public final void setUseTestInsets(boolean z) {
            WindowInsetsHolder.y = z;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AndroidWindowInsets a;
    public final AndroidWindowInsets b;
    public final AndroidWindowInsets c;
    public final AndroidWindowInsets d;
    public final AndroidWindowInsets e;
    public final AndroidWindowInsets f;
    public final AndroidWindowInsets g;
    public final AndroidWindowInsets h;
    public final AndroidWindowInsets i;
    public final ValueInsets j;
    public final WindowInsets k;
    public final WindowInsets l;
    public final WindowInsets m;
    public final ValueInsets n;
    public final ValueInsets o;
    public final ValueInsets p;
    public final ValueInsets q;
    public final ValueInsets r;
    public final ValueInsets s;
    public final ValueInsets t;
    public final boolean u;
    public int v;
    public final x2 w;
    public static final WeakHashMap x;
    public static boolean y;

    static {
        WindowInsetsHolder.Companion = new Companion(null);
        WindowInsetsHolder.$stable = 8;
        WindowInsetsHolder.x = new WeakHashMap();
    }

    public WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat0, View view0, DefaultConstructorMarker defaultConstructorMarker0) {
        Insets insets0;
        Companion windowInsetsHolder$Companion0 = WindowInsetsHolder.Companion;
        this.a = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 4, "captionBar");
        AndroidWindowInsets androidWindowInsets0 = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 0x80, "displayCutout");
        this.b = androidWindowInsets0;
        AndroidWindowInsets androidWindowInsets1 = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 8, "ime");
        this.c = androidWindowInsets1;
        AndroidWindowInsets androidWindowInsets2 = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 0x20, "mandatorySystemGestures");
        this.d = androidWindowInsets2;
        this.e = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 2, "navigationBars");
        this.f = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 1, "statusBars");
        AndroidWindowInsets androidWindowInsets3 = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 7, "systemBars");
        this.g = androidWindowInsets3;
        AndroidWindowInsets androidWindowInsets4 = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 16, "systemGestures");
        this.h = androidWindowInsets4;
        AndroidWindowInsets androidWindowInsets5 = Companion.access$systemInsets(windowInsetsHolder$Companion0, windowInsetsCompat0, 0x40, "tappableElement");
        this.i = androidWindowInsets5;
        if(windowInsetsCompat0 == null) {
            insets0 = Insets.NONE;
        }
        else {
            DisplayCutoutCompat displayCutoutCompat0 = windowInsetsCompat0.getDisplayCutout();
            if(displayCutoutCompat0 == null) {
                insets0 = Insets.NONE;
            }
            else {
                insets0 = displayCutoutCompat0.getWaterfallInsets();
                if(insets0 == null) {
                    insets0 = Insets.NONE;
                }
            }
        }
        ValueInsets valueInsets0 = WindowInsets_androidKt.ValueInsets(insets0, "waterfall");
        this.j = valueInsets0;
        WindowInsets windowInsets0 = WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsets3, androidWindowInsets1), androidWindowInsets0);
        this.k = windowInsets0;
        WindowInsets windowInsets1 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsets5, androidWindowInsets2), androidWindowInsets4), valueInsets0);
        this.l = windowInsets1;
        this.m = WindowInsetsKt.union(windowInsets0, windowInsets1);
        this.n = Companion.access$valueInsetsIgnoringVisibility(windowInsetsHolder$Companion0, windowInsetsCompat0, 4, "captionBarIgnoringVisibility");
        this.o = Companion.access$valueInsetsIgnoringVisibility(windowInsetsHolder$Companion0, windowInsetsCompat0, 2, "navigationBarsIgnoringVisibility");
        this.p = Companion.access$valueInsetsIgnoringVisibility(windowInsetsHolder$Companion0, windowInsetsCompat0, 1, "statusBarsIgnoringVisibility");
        this.q = Companion.access$valueInsetsIgnoringVisibility(windowInsetsHolder$Companion0, windowInsetsCompat0, 7, "systemBarsIgnoringVisibility");
        this.r = Companion.access$valueInsetsIgnoringVisibility(windowInsetsHolder$Companion0, windowInsetsCompat0, 0x40, "tappableElementIgnoringVisibility");
        this.s = Companion.access$valueInsetsIgnoringVisibility(windowInsetsHolder$Companion0, windowInsetsCompat0, 8, "imeAnimationTarget");
        this.t = Companion.access$valueInsetsIgnoringVisibility(windowInsetsHolder$Companion0, windowInsetsCompat0, 8, "imeAnimationSource");
        ViewParent viewParent0 = view0.getParent();
        Boolean boolean0 = null;
        View view1 = viewParent0 instanceof View ? ((View)viewParent0) : null;
        Object object0 = view1 == null ? null : view1.getTag(id.consume_window_insets_tag);
        if(object0 instanceof Boolean) {
            boolean0 = (Boolean)object0;
        }
        this.u = boolean0 == null ? true : boolean0.booleanValue();
        this.w = new x2(this);
    }

    public final void decrementAccessors(@NotNull View view0) {
        int v = this.v - 1;
        this.v = v;
        if(v == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view0, null);
            ViewCompat.setWindowInsetsAnimationCallback(view0, null);
            view0.removeOnAttachStateChangeListener(this.w);
        }
    }

    @NotNull
    public final AndroidWindowInsets getCaptionBar() {
        return this.a;
    }

    @NotNull
    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.n;
    }

    public final boolean getConsumes() {
        return this.u;
    }

    @NotNull
    public final AndroidWindowInsets getDisplayCutout() {
        return this.b;
    }

    @NotNull
    public final AndroidWindowInsets getIme() {
        return this.c;
    }

    @NotNull
    public final ValueInsets getImeAnimationSource() {
        return this.t;
    }

    @NotNull
    public final ValueInsets getImeAnimationTarget() {
        return this.s;
    }

    @NotNull
    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.d;
    }

    @NotNull
    public final AndroidWindowInsets getNavigationBars() {
        return this.e;
    }

    @NotNull
    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.o;
    }

    @NotNull
    public final WindowInsets getSafeContent() {
        return this.m;
    }

    @NotNull
    public final WindowInsets getSafeDrawing() {
        return this.k;
    }

    @NotNull
    public final WindowInsets getSafeGestures() {
        return this.l;
    }

    @NotNull
    public final AndroidWindowInsets getStatusBars() {
        return this.f;
    }

    @NotNull
    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.p;
    }

    @NotNull
    public final AndroidWindowInsets getSystemBars() {
        return this.g;
    }

    @NotNull
    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.q;
    }

    @NotNull
    public final AndroidWindowInsets getSystemGestures() {
        return this.h;
    }

    @NotNull
    public final AndroidWindowInsets getTappableElement() {
        return this.i;
    }

    @NotNull
    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.r;
    }

    @NotNull
    public final ValueInsets getWaterfall() {
        return this.j;
    }

    public final void incrementAccessors(@NotNull View view0) {
        if(this.v == 0) {
            x2 x20 = this.w;
            ViewCompat.setOnApplyWindowInsetsListener(view0, x20);
            if(view0.isAttachedToWindow()) {
                view0.requestApplyInsets();
            }
            view0.addOnAttachStateChangeListener(x20);
            ViewCompat.setWindowInsetsAnimationCallback(view0, x20);
        }
        ++this.v;
    }

    public final void update(@NotNull WindowInsetsCompat windowInsetsCompat0, int v) {
        if(WindowInsetsHolder.y) {
            android.view.WindowInsets windowInsets0 = windowInsetsCompat0.toWindowInsets();
            Intrinsics.checkNotNull(windowInsets0);
            windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets0);
        }
        this.a.update$foundation_layout_release(windowInsetsCompat0, v);
        this.c.update$foundation_layout_release(windowInsetsCompat0, v);
        this.b.update$foundation_layout_release(windowInsetsCompat0, v);
        this.e.update$foundation_layout_release(windowInsetsCompat0, v);
        this.f.update$foundation_layout_release(windowInsetsCompat0, v);
        this.g.update$foundation_layout_release(windowInsetsCompat0, v);
        this.h.update$foundation_layout_release(windowInsetsCompat0, v);
        this.i.update$foundation_layout_release(windowInsetsCompat0, v);
        this.d.update$foundation_layout_release(windowInsetsCompat0, v);
        if(v == 0) {
            InsetsValues insetsValues0 = WindowInsets_androidKt.toInsetsValues(windowInsetsCompat0.getInsetsIgnoringVisibility(4));
            this.n.setValue$foundation_layout_release(insetsValues0);
            InsetsValues insetsValues1 = WindowInsets_androidKt.toInsetsValues(windowInsetsCompat0.getInsetsIgnoringVisibility(2));
            this.o.setValue$foundation_layout_release(insetsValues1);
            InsetsValues insetsValues2 = WindowInsets_androidKt.toInsetsValues(windowInsetsCompat0.getInsetsIgnoringVisibility(1));
            this.p.setValue$foundation_layout_release(insetsValues2);
            InsetsValues insetsValues3 = WindowInsets_androidKt.toInsetsValues(windowInsetsCompat0.getInsetsIgnoringVisibility(7));
            this.q.setValue$foundation_layout_release(insetsValues3);
            InsetsValues insetsValues4 = WindowInsets_androidKt.toInsetsValues(windowInsetsCompat0.getInsetsIgnoringVisibility(0x40));
            this.r.setValue$foundation_layout_release(insetsValues4);
            DisplayCutoutCompat displayCutoutCompat0 = windowInsetsCompat0.getDisplayCutout();
            if(displayCutoutCompat0 != null) {
                InsetsValues insetsValues5 = WindowInsets_androidKt.toInsetsValues(displayCutoutCompat0.getWaterfallInsets());
                this.j.setValue$foundation_layout_release(insetsValues5);
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public static void update$default(WindowInsetsHolder windowInsetsHolder0, WindowInsetsCompat windowInsetsCompat0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        windowInsetsHolder0.update(windowInsetsCompat0, v);
    }

    public final void updateImeAnimationSource(@NotNull WindowInsetsCompat windowInsetsCompat0) {
        InsetsValues insetsValues0 = WindowInsets_androidKt.toInsetsValues(windowInsetsCompat0.getInsets(8));
        this.t.setValue$foundation_layout_release(insetsValues0);
    }

    public final void updateImeAnimationTarget(@NotNull WindowInsetsCompat windowInsetsCompat0) {
        InsetsValues insetsValues0 = WindowInsets_androidKt.toInsetsValues(windowInsetsCompat0.getInsets(8));
        this.s.setValue$foundation_layout_release(insetsValues0);
    }
}

