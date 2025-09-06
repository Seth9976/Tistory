package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import j2.j;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R1\u0010\u001E\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00168F@FX\u0086\u008E\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001D\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/ShaderBrush;", "shaderBrush", "", "alpha", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Landroidx/compose/ui/graphics/ShaderBrush;", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "b", "F", "getAlpha", "()F", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,56:1\n81#2:57\n107#2,2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:57\n41#1:58,2\n*E\n"})
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable;
    public final ShaderBrush a;
    public final float b;
    public final MutableState c;
    public final State d;

    public ShaderBrushSpan(@NotNull ShaderBrush shaderBrush0, float f) {
        this.a = shaderBrush0;
        this.b = f;
        this.c = SnapshotStateKt.mutableStateOf$default(Size.box-impl(0x7FC000007FC00000L), null, 2, null);
        this.d = SnapshotStateKt.derivedStateOf(new j(this, 24));
    }

    public final float getAlpha() {
        return this.b;
    }

    @NotNull
    public final ShaderBrush getShaderBrush() {
        return this.a;
    }

    public final long getSize-NH-jbRc() {
        return ((Size)this.c.getValue()).unbox-impl();
    }

    public final void setSize-uvyYCjk(long v) {
        Size size0 = Size.box-impl(v);
        this.c.setValue(size0);
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint0) {
        AndroidTextPaint_androidKt.setAlpha(textPaint0, this.b);
        textPaint0.setShader(((Shader)this.d.getValue()));
    }
}

