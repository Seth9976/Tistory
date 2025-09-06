package androidx.compose.ui.graphics;

import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0005\u001A\u00020\u0002H%¢\u0006\u0004\b\u0005\u0010\u0004J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0003\t\n\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffect;", "", "Landroid/graphics/RenderEffect;", "asAndroidRenderEffect", "()Landroid/graphics/RenderEffect;", "createRenderEffect", "", "isSupported", "()Z", "Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/OffsetEffect;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public abstract class RenderEffect {
    public android.graphics.RenderEffect a;

    public RenderEffect(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @RequiresApi(0x1F)
    @NotNull
    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect0 = this.a;
        if(renderEffect0 == null) {
            renderEffect0 = this.createRenderEffect();
            this.a = renderEffect0;
        }
        return renderEffect0;
    }

    @RequiresApi(0x1F)
    @NotNull
    public abstract android.graphics.RenderEffect createRenderEffect();

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 0x1F;
    }
}

