package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001E\u0010\n\u001A\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001A\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
public abstract class ShaderBrush extends Brush {
    public Shader d;
    public long e;

    public ShaderBrush() {
        super(null);
        this.e = 0x7FC000007FC00000L;
    }

    @Override  // androidx.compose.ui.graphics.Brush
    public final void applyTo-Pq9zytI(long v, @NotNull Paint paint0, float f) {
        Shader shader0 = this.d;
        if(shader0 == null || !Size.equals-impl0(this.e, v)) {
            if(Size.isEmpty-impl(v)) {
                shader0 = null;
                this.d = null;
                this.e = 0x7FC000007FC00000L;
            }
            else {
                shader0 = this.createShader-uvyYCjk(v);
                this.d = shader0;
                this.e = v;
            }
        }
        if(!Color.equals-impl0(paint0.getColor-0d7_KjU(), 0xFF00000000000000L)) {
            paint0.setColor-8_81llA(0xFF00000000000000L);
        }
        if(!Intrinsics.areEqual(paint0.getShader(), shader0)) {
            paint0.setShader(shader0);
        }
        if(paint0.getAlpha() != f) {
            paint0.setAlpha(f);
        }
    }

    @NotNull
    public abstract Shader createShader-uvyYCjk(long arg1);
}

