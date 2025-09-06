package androidx.compose.material3;

import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.preview.ui.PreviewTextureViewKt;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class gc extends Lambda implements Function2 {
    public final Object A;
    public final int w;
    public final long x;
    public final int y;
    public final Object z;

    public gc(long v, Object object0, Function function0, int v1, int v2) {
        this.w = v2;
        this.x = v;
        this.z = object0;
        this.A = function0;
        this.y = v1;
        super(2);
    }

    public gc(PullRefreshState pullRefreshState0, long v, Modifier modifier0, int v1) {
        this.w = 3;
        this.z = pullRefreshState0;
        this.x = v;
        this.A = modifier0;
        this.y = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ListItemKt.access$ProvideTextStyleFromToken-3J-VO9M(this.x, ((TypographyKeyTokens)this.z), ((Function2)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                PreviewTextureViewKt.access$TextureView-03bzQGs(this.x, ((Function3)this.z), ((Function0)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                ReSizeScreenKt.access$FixedSizeSelector-03bzQGs(this.x, ((List)this.z), ((Function1)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                PullRefreshIndicatorKt.access$CircularArrowIndicator-iJQMabo(((PullRefreshState)this.z), this.x, ((Modifier)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

