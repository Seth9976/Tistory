package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000E\n\u0002\bT\b\u0080\b\u0018\u00002\u00020\u0001B\u00D1\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0004\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\u000B\u0012\u0006\u0010\u000F\u001A\u00020\u000B\u0012\u0006\u0010\u0010\u001A\u00020\u000B\u0012\u0006\u0010\u0011\u001A\u00020\u0004\u0012\u0006\u0010\u0012\u001A\u00020\u0004\u0012\u0006\u0010\u0013\u001A\u00020\u000B\u0012\u0006\u0010\u0014\u001A\u00020\u000B\u0012\u0006\u0010\u0015\u001A\u00020\u000B\u0012\u0006\u0010\u0016\u001A\u00020\u000B\u0012\u0006\u0010\u0017\u001A\u00020\u000B\u0012\u0006\u0010\u0018\u001A\u00020\u000B\u0012\u0006\u0010\u001A\u001A\u00020\u0019\u0012\u0006\u0010\u001B\u001A\u00020\u0019\u0012\u0006\u0010\u001C\u001A\u00020\u000B\u0012\b\u0010\u001E\u001A\u0004\u0018\u00010\u001D\u0012\u0006\u0010 \u001A\u00020\u001F\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010\'\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010&J\u0010\u0010(\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010&J\u0010\u0010)\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010&J\u0010\u0010*\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010&J\u0010\u0010+\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010&J\u0010\u0010,\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010-J\u0010\u0010/\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b/\u0010-J\u0010\u00100\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b0\u0010-J\u0010\u00101\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b1\u0010-J\u0010\u00102\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010&J\u0010\u00103\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b3\u0010&J\u0010\u00104\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b4\u0010-J\u0010\u00105\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b5\u0010-J\u0010\u00106\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b6\u0010-J\u0010\u00107\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b7\u0010-J\u0010\u00108\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b8\u0010-J\u0010\u00109\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b9\u0010-J\u0010\u0010:\u001A\u00020\u0019H\u00C6\u0003\u00A2\u0006\u0004\b:\u0010;J\u0010\u0010<\u001A\u00020\u0019H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010;J\u0010\u0010=\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b=\u0010-J\u0012\u0010>\u001A\u0004\u0018\u00010\u001DH\u00C6\u0003\u00A2\u0006\u0004\b>\u0010?J\u0016\u0010A\u001A\u00020\u001FH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b@\u0010&J\u008F\u0002\u0010D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u000F\u001A\u00020\u000B2\b\b\u0002\u0010\u0010\u001A\u00020\u000B2\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0012\u001A\u00020\u00042\b\b\u0002\u0010\u0013\u001A\u00020\u000B2\b\b\u0002\u0010\u0014\u001A\u00020\u000B2\b\b\u0002\u0010\u0015\u001A\u00020\u000B2\b\b\u0002\u0010\u0016\u001A\u00020\u000B2\b\b\u0002\u0010\u0017\u001A\u00020\u000B2\b\b\u0002\u0010\u0018\u001A\u00020\u000B2\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001B\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u000B2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D2\b\b\u0002\u0010 \u001A\u00020\u001FH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\bB\u0010CJ\u0010\u0010F\u001A\u00020EH\u00D6\u0001\u00A2\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\bH\u0010&J\u001A\u0010J\u001A\u00020\u00192\b\u0010I\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010$R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010&R\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bR\u0010P\u001A\u0004\bS\u0010&R\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bT\u0010P\u001A\u0004\bU\u0010&R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bV\u0010P\u001A\u0004\bW\u0010&R\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bX\u0010P\u001A\u0004\bY\u0010&R\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bZ\u0010P\u001A\u0004\b[\u0010&R\"\u0010\f\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\\\u0010]\u001A\u0004\b^\u0010-\"\u0004\b_\u0010`R\"\u0010\r\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\ba\u0010]\u001A\u0004\bb\u0010-\"\u0004\bc\u0010`R\"\u0010\u000E\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bd\u0010]\u001A\u0004\be\u0010-\"\u0004\bf\u0010`R\"\u0010\u000F\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bg\u0010]\u001A\u0004\bh\u0010-\"\u0004\bi\u0010`R\"\u0010\u0010\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bj\u0010]\u001A\u0004\bk\u0010-\"\u0004\bl\u0010`R\"\u0010\u0011\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010P\u001A\u0004\bn\u0010&\"\u0004\bo\u0010pR\"\u0010\u0012\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bq\u0010P\u001A\u0004\br\u0010&\"\u0004\bs\u0010pR\"\u0010\u0013\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bt\u0010]\u001A\u0004\bu\u0010-\"\u0004\bv\u0010`R\"\u0010\u0014\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bw\u0010]\u001A\u0004\bx\u0010-\"\u0004\by\u0010`R\"\u0010\u0015\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bz\u0010]\u001A\u0004\b{\u0010-\"\u0004\b|\u0010`R\"\u0010\u0016\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b}\u0010]\u001A\u0004\b~\u0010-\"\u0004\b\u007F\u0010`R%\u0010\u0017\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u0080\u0001\u0010]\u001A\u0005\b\u0081\u0001\u0010-\"\u0005\b\u0082\u0001\u0010`R%\u0010\u0018\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u0083\u0001\u0010]\u001A\u0005\b\u0084\u0001\u0010-\"\u0005\b\u0085\u0001\u0010`R\'\u0010\u001A\u001A\u00020\u00198\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001A\u0005\b\u0088\u0001\u0010;\"\u0006\b\u0089\u0001\u0010\u008A\u0001R\'\u0010\u001B\u001A\u00020\u00198\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0017\n\u0006\b\u008B\u0001\u0010\u0087\u0001\u001A\u0005\b\u008C\u0001\u0010;\"\u0006\b\u008D\u0001\u0010\u008A\u0001R%\u0010\u001C\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u008E\u0001\u0010]\u001A\u0005\b\u008F\u0001\u0010-\"\u0005\b\u0090\u0001\u0010`R)\u0010\u001E\u001A\u0004\u0018\u00010\u001D8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001A\u0005\b\u0093\u0001\u0010?\"\u0006\b\u0094\u0001\u0010\u0095\u0001R+\u0010 \u001A\u00020\u001F8\u0006@\u0006X\u0086\u000E\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0015\n\u0005\b\u0096\u0001\u0010P\u001A\u0005\b\u0097\u0001\u0010&\"\u0005\b\u0098\u0001\u0010p\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\u0099\u0001"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "uniqueId", "", "left", "top", "right", "bottom", "width", "height", "", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "", "clipToOutline", "clipToBounds", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()F", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Z", "component22", "component23", "component24", "()Landroidx/compose/ui/graphics/RenderEffect;", "component25--NrFUSI", "component25", "copy-fuCbV5c", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;I)Landroidx/compose/ui/platform/DeviceRenderNodeData;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getUniqueId", "b", "I", "getLeft", "c", "getTop", "d", "getRight", "e", "getBottom", "f", "getWidth", "g", "getHeight", "h", "F", "getScaleX", "setScaleX", "(F)V", "i", "getScaleY", "setScaleY", "j", "getTranslationX", "setTranslationX", "k", "getTranslationY", "setTranslationY", "l", "getElevation", "setElevation", "m", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "n", "getSpotShadowColor", "setSpotShadowColor", "o", "getRotationZ", "setRotationZ", "p", "getRotationX", "setRotationX", "q", "getRotationY", "setRotationY", "r", "getCameraDistance", "setCameraDistance", "s", "getPivotX", "setPivotX", "t", "getPivotY", "setPivotY", "u", "Z", "getClipToOutline", "setClipToOutline", "(Z)V", "v", "getClipToBounds", "setClipToBounds", "w", "getAlpha", "setAlpha", "x", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "y", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;
    public int n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public float w;
    public RenderEffect x;
    public int y;

    public DeviceRenderNodeData(long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, int v7, int v8, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11, RenderEffect renderEffect0, int v9, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = f;
        this.i = f1;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = v7;
        this.n = v8;
        this.o = f5;
        this.p = f6;
        this.q = f7;
        this.r = f8;
        this.s = f9;
        this.t = f10;
        this.u = z;
        this.v = z1;
        this.w = f11;
        this.x = renderEffect0;
        this.y = v9;
    }

    public final long component1() {
        return this.a;
    }

    public final float component10() {
        return this.j;
    }

    public final float component11() {
        return this.k;
    }

    public final float component12() {
        return this.l;
    }

    public final int component13() {
        return this.m;
    }

    public final int component14() {
        return this.n;
    }

    public final float component15() {
        return this.o;
    }

    public final float component16() {
        return this.p;
    }

    public final float component17() {
        return this.q;
    }

    public final float component18() {
        return this.r;
    }

    public final float component19() {
        return this.s;
    }

    public final int component2() {
        return this.b;
    }

    public final float component20() {
        return this.t;
    }

    public final boolean component21() {
        return this.u;
    }

    public final boolean component22() {
        return this.v;
    }

    public final float component23() {
        return this.w;
    }

    @Nullable
    public final RenderEffect component24() {
        return this.x;
    }

    public final int component25--NrFUSI() {
        return this.y;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final int component7() {
        return this.g;
    }

    public final float component8() {
        return this.h;
    }

    public final float component9() {
        return this.i;
    }

    @NotNull
    public final DeviceRenderNodeData copy-fuCbV5c(long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, int v7, int v8, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11, @Nullable RenderEffect renderEffect0, int v9) {
        return new DeviceRenderNodeData(v, v1, v2, v3, v4, v5, v6, f, f1, f2, f3, f4, v7, v8, f5, f6, f7, f8, f9, f10, z, z1, f11, renderEffect0, v9, null);
    }

    public static DeviceRenderNodeData copy-fuCbV5c$default(DeviceRenderNodeData deviceRenderNodeData0, long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, int v7, int v8, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11, RenderEffect renderEffect0, int v9, int v10, Object object0) {
        long v11 = (v10 & 1) == 0 ? v : deviceRenderNodeData0.a;
        int v12 = (v10 & 2) == 0 ? v1 : deviceRenderNodeData0.b;
        int v13 = (v10 & 4) == 0 ? v2 : deviceRenderNodeData0.c;
        int v14 = (v10 & 8) == 0 ? v3 : deviceRenderNodeData0.d;
        int v15 = (v10 & 16) == 0 ? v4 : deviceRenderNodeData0.e;
        int v16 = (v10 & 0x20) == 0 ? v5 : deviceRenderNodeData0.f;
        int v17 = (v10 & 0x40) == 0 ? v6 : deviceRenderNodeData0.g;
        float f12 = (v10 & 0x80) == 0 ? f : deviceRenderNodeData0.h;
        float f13 = (v10 & 0x100) == 0 ? f1 : deviceRenderNodeData0.i;
        float f14 = (v10 & 0x200) == 0 ? f2 : deviceRenderNodeData0.j;
        float f15 = (v10 & 0x400) == 0 ? f3 : deviceRenderNodeData0.k;
        float f16 = (v10 & 0x800) == 0 ? f4 : deviceRenderNodeData0.l;
        int v18 = (v10 & 0x1000) == 0 ? v7 : deviceRenderNodeData0.m;
        int v19 = (v10 & 0x2000) == 0 ? v8 : deviceRenderNodeData0.n;
        float f17 = (v10 & 0x4000) == 0 ? f5 : deviceRenderNodeData0.o;
        float f18 = (v10 & 0x8000) == 0 ? f6 : deviceRenderNodeData0.p;
        float f19 = (v10 & 0x10000) == 0 ? f7 : deviceRenderNodeData0.q;
        float f20 = (v10 & 0x20000) == 0 ? f8 : deviceRenderNodeData0.r;
        float f21 = (v10 & 0x40000) == 0 ? f9 : deviceRenderNodeData0.s;
        float f22 = (v10 & 0x80000) == 0 ? f10 : deviceRenderNodeData0.t;
        boolean z2 = (v10 & 0x100000) == 0 ? z : deviceRenderNodeData0.u;
        boolean z3 = (v10 & 0x200000) == 0 ? z1 : deviceRenderNodeData0.v;
        float f23 = (v10 & 0x400000) == 0 ? f11 : deviceRenderNodeData0.w;
        RenderEffect renderEffect1 = (v10 & 0x800000) == 0 ? renderEffect0 : deviceRenderNodeData0.x;
        return (v10 & 0x1000000) == 0 ? deviceRenderNodeData0.copy-fuCbV5c(v11, v12, v13, v14, v15, v16, v17, f12, f13, f14, f15, f16, v18, v19, f17, f18, f19, f20, f21, f22, z2, z3, f23, renderEffect1, v9) : deviceRenderNodeData0.copy-fuCbV5c(v11, v12, v13, v14, v15, v16, v17, f12, f13, f14, f15, f16, v18, v19, f17, f18, f19, f20, f21, f22, z2, z3, f23, renderEffect1, deviceRenderNodeData0.y);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData0 = (DeviceRenderNodeData)object0;
        if(this.a != deviceRenderNodeData0.a) {
            return false;
        }
        if(this.b != deviceRenderNodeData0.b) {
            return false;
        }
        if(this.c != deviceRenderNodeData0.c) {
            return false;
        }
        if(this.d != deviceRenderNodeData0.d) {
            return false;
        }
        if(this.e != deviceRenderNodeData0.e) {
            return false;
        }
        if(this.f != deviceRenderNodeData0.f) {
            return false;
        }
        if(this.g != deviceRenderNodeData0.g) {
            return false;
        }
        if(Float.compare(this.h, deviceRenderNodeData0.h) != 0) {
            return false;
        }
        if(Float.compare(this.i, deviceRenderNodeData0.i) != 0) {
            return false;
        }
        if(Float.compare(this.j, deviceRenderNodeData0.j) != 0) {
            return false;
        }
        if(Float.compare(this.k, deviceRenderNodeData0.k) != 0) {
            return false;
        }
        if(Float.compare(this.l, deviceRenderNodeData0.l) != 0) {
            return false;
        }
        if(this.m != deviceRenderNodeData0.m) {
            return false;
        }
        if(this.n != deviceRenderNodeData0.n) {
            return false;
        }
        if(Float.compare(this.o, deviceRenderNodeData0.o) != 0) {
            return false;
        }
        if(Float.compare(this.p, deviceRenderNodeData0.p) != 0) {
            return false;
        }
        if(Float.compare(this.q, deviceRenderNodeData0.q) != 0) {
            return false;
        }
        if(Float.compare(this.r, deviceRenderNodeData0.r) != 0) {
            return false;
        }
        if(Float.compare(this.s, deviceRenderNodeData0.s) != 0) {
            return false;
        }
        if(Float.compare(this.t, deviceRenderNodeData0.t) != 0) {
            return false;
        }
        if(this.u != deviceRenderNodeData0.u) {
            return false;
        }
        if(this.v != deviceRenderNodeData0.v) {
            return false;
        }
        if(Float.compare(this.w, deviceRenderNodeData0.w) != 0) {
            return false;
        }
        return Intrinsics.areEqual(this.x, deviceRenderNodeData0.x) ? CompositingStrategy.equals-impl0(this.y, deviceRenderNodeData0.y) : false;
    }

    public final float getAlpha() {
        return this.w;
    }

    public final int getAmbientShadowColor() {
        return this.m;
    }

    public final int getBottom() {
        return this.e;
    }

    public final float getCameraDistance() {
        return this.r;
    }

    public final boolean getClipToBounds() {
        return this.v;
    }

    public final boolean getClipToOutline() {
        return this.u;
    }

    public final int getCompositingStrategy--NrFUSI() {
        return this.y;
    }

    public final float getElevation() {
        return this.l;
    }

    public final int getHeight() {
        return this.g;
    }

    public final int getLeft() {
        return this.b;
    }

    public final float getPivotX() {
        return this.s;
    }

    public final float getPivotY() {
        return this.t;
    }

    @Nullable
    public final RenderEffect getRenderEffect() {
        return this.x;
    }

    public final int getRight() {
        return this.d;
    }

    public final float getRotationX() {
        return this.p;
    }

    public final float getRotationY() {
        return this.q;
    }

    public final float getRotationZ() {
        return this.o;
    }

    public final float getScaleX() {
        return this.h;
    }

    public final float getScaleY() {
        return this.i;
    }

    public final int getSpotShadowColor() {
        return this.n;
    }

    public final int getTop() {
        return this.c;
    }

    public final float getTranslationX() {
        return this.j;
    }

    public final float getTranslationY() {
        return this.k;
    }

    public final long getUniqueId() {
        return this.a;
    }

    public final int getWidth() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = a.b(this.w, a.e(a.e(a.b(this.t, a.b(this.s, a.b(this.r, a.b(this.q, a.b(this.p, a.b(this.o, a.c(this.n, a.c(this.m, a.b(this.l, a.b(this.k, a.b(this.j, a.b(this.i, a.b(this.h, a.c(this.g, a.c(this.f, a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, Long.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F, this.u), 0x1F, this.v), 0x1F);
        return this.x == null ? CompositingStrategy.hashCode-impl(this.y) + v * 0x1F : CompositingStrategy.hashCode-impl(this.y) + (v + this.x.hashCode()) * 0x1F;
    }

    public final void setAlpha(float f) {
        this.w = f;
    }

    public final void setAmbientShadowColor(int v) {
        this.m = v;
    }

    public final void setCameraDistance(float f) {
        this.r = f;
    }

    public final void setClipToBounds(boolean z) {
        this.v = z;
    }

    public final void setClipToOutline(boolean z) {
        this.u = z;
    }

    public final void setCompositingStrategy-aDBOjCE(int v) {
        this.y = v;
    }

    public final void setElevation(float f) {
        this.l = f;
    }

    public final void setPivotX(float f) {
        this.s = f;
    }

    public final void setPivotY(float f) {
        this.t = f;
    }

    public final void setRenderEffect(@Nullable RenderEffect renderEffect0) {
        this.x = renderEffect0;
    }

    public final void setRotationX(float f) {
        this.p = f;
    }

    public final void setRotationY(float f) {
        this.q = f;
    }

    public final void setRotationZ(float f) {
        this.o = f;
    }

    public final void setScaleX(float f) {
        this.h = f;
    }

    public final void setScaleY(float f) {
        this.i = f;
    }

    public final void setSpotShadowColor(int v) {
        this.n = v;
    }

    public final void setTranslationX(float f) {
        this.j = f;
    }

    public final void setTranslationY(float f) {
        this.k = f;
    }

    @Override
    @NotNull
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.a + ", left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + ", width=" + this.f + ", height=" + this.g + ", scaleX=" + this.h + ", scaleY=" + this.i + ", translationX=" + this.j + ", translationY=" + this.k + ", elevation=" + this.l + ", ambientShadowColor=" + this.m + ", spotShadowColor=" + this.n + ", rotationZ=" + this.o + ", rotationX=" + this.p + ", rotationY=" + this.q + ", cameraDistance=" + this.r + ", pivotX=" + this.s + ", pivotY=" + this.t + ", clipToOutline=" + this.u + ", clipToBounds=" + this.v + ", alpha=" + this.w + ", renderEffect=" + this.x + ", compositingStrategy=" + CompositingStrategy.toString-impl(this.y) + ')';
    }
}

