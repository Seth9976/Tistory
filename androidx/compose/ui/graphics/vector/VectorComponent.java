package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter.Companion;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;
import u1.a;
import u1.b;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001A\u00020\u000B*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\f\u001A\u00020\u000B*\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\"\u0010\u001B\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u001AR(\u0010#\u001A\b\u0012\u0004\u0012\u00020\u000B0\u001C8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R/\u0010+\u001A\u0004\u0018\u00010\t2\b\u0010$\u001A\u0004\u0018\u00010\t8@@@X\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R1\u00102\u001A\u00020,2\u0006\u0010$\u001A\u00020,8@@@X\u0080\u008E\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010&\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\u001A\u00106\u001A\u0002038@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b4\u00105\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/ColorFilter;)V", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "b", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "c", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "name", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateCallback$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "invalidateCallback", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "Landroidx/compose/ui/geometry/Size;", "i", "getViewportSize-NH-jbRc$ui_release", "()J", "setViewportSize-uvyYCjk$ui_release", "(J)V", "viewportSize", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getCacheBitmapConfig-_sVssgQ$ui_release", "()I", "cacheBitmapConfig", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,651:1\n81#2:652\n107#2,2:653\n81#2:655\n107#2,2:656\n696#3:658\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n121#1:652\n121#1:653,2\n127#1:655\n127#1:656,2\n148#1:658\n*E\n"})
public final class VectorComponent extends VNode {
    public static final int $stable = 8;
    public final GroupComponent b;
    public String c;
    public boolean d;
    public final DrawCache e;
    public Function0 f;
    public final MutableState g;
    public ColorFilter h;
    public final MutableState i;
    public long j;
    public float k;
    public float l;
    public final b m;

    public VectorComponent(@NotNull GroupComponent groupComponent0) {
        super(null);
        this.b = groupComponent0;
        groupComponent0.setInvalidateListener$ui_release(new h1(this, 12));
        this.c = "";
        this.d = true;
        this.e = new DrawCache();
        this.f = a.y;
        this.g = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.i = SnapshotStateKt.mutableStateOf$default(Size.box-impl(0L), null, 2, null);
        this.j = 0x7FC000007FC00000L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new b(this);
    }

    public static final void access$doInvalidate(VectorComponent vectorComponent0) {
        vectorComponent0.d = true;
        vectorComponent0.f.invoke();
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope0) {
        this.draw(drawScope0, 1.0f, null);
    }

    public final void draw(@NotNull DrawScope drawScope0, float f, @Nullable ColorFilter colorFilter0) {
        GroupComponent groupComponent0 = this.b;
        int v = !groupComponent0.isTintable() || groupComponent0.getTintColor-0d7_KjU() == 16L || !VectorKt.tintableWithAlphaMask(this.getIntrinsicColorFilter$ui_release()) || !VectorKt.tintableWithAlphaMask(colorFilter0) ? 0 : 1;
        if(this.d || !Size.equals-impl0(this.j, drawScope0.getSize-NH-jbRc()) || !ImageBitmapConfig.equals-impl0(v, this.getCacheBitmapConfig-_sVssgQ$ui_release())) {
            this.h = ImageBitmapConfig.equals-impl0(v, 1) ? Companion.tint-xETnrds$default(ColorFilter.Companion, groupComponent0.getTintColor-0d7_KjU(), 0, 2, null) : null;
            this.k = Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) / Size.getWidth-impl(this.getViewportSize-NH-jbRc$ui_release());
            this.l = Size.getHeight-impl(drawScope0.getSize-NH-jbRc()) / Size.getHeight-impl(this.getViewportSize-NH-jbRc$ui_release());
            long v1 = IntSizeKt.IntSize(((int)(((float)Math.ceil(Size.getWidth-impl(drawScope0.getSize-NH-jbRc()))))), ((int)(((float)Math.ceil(Size.getHeight-impl(drawScope0.getSize-NH-jbRc()))))));
            LayoutDirection layoutDirection0 = drawScope0.getLayoutDirection();
            this.e.drawCachedImage-FqjB98A(v, v1, drawScope0, layoutDirection0, this.m);
            this.d = false;
            this.j = drawScope0.getSize-NH-jbRc();
        }
        if(colorFilter0 == null) {
            colorFilter0 = this.getIntrinsicColorFilter$ui_release() == null ? this.h : this.getIntrinsicColorFilter$ui_release();
        }
        this.e.drawInto(drawScope0, f, colorFilter0);
    }

    public final int getCacheBitmapConfig-_sVssgQ$ui_release() {
        ImageBitmap imageBitmap0 = this.e.getMCachedImage();
        return imageBitmap0 == null ? 0 : imageBitmap0.getConfig-_sVssgQ();
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter)this.g.getValue();
    }

    @NotNull
    public final Function0 getInvalidateCallback$ui_release() {
        return this.f;
    }

    @NotNull
    public final String getName() {
        return this.c;
    }

    @NotNull
    public final GroupComponent getRoot() {
        return this.b;
    }

    public final long getViewportSize-NH-jbRc$ui_release() {
        return ((Size)this.i.getValue()).unbox-impl();
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter0) {
        this.g.setValue(colorFilter0);
    }

    public final void setInvalidateCallback$ui_release(@NotNull Function0 function00) {
        this.f = function00;
    }

    public final void setName(@NotNull String s) {
        this.c = s;
    }

    public final void setViewportSize-uvyYCjk$ui_release(long v) {
        Size size0 = Size.box-impl(v);
        this.i.setValue(size0);
    }

    @Override
    @NotNull
    public String toString() {
        String s = "Params: \tname: " + this.c + "\n\tviewportWidth: " + Size.getWidth-impl(this.getViewportSize-NH-jbRc$ui_release()) + "\n\tviewportHeight: " + Size.getHeight-impl(this.getViewportSize-NH-jbRc$ui_release()) + "\n";
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

