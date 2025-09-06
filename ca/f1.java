package ca;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt.translationAnimation.1.WhenMappings;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function1 {
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public f1(CharSequence charSequence0, int v, Function1 function10) {
        this.w = 1;
        this.x = v;
        this.y = charSequence0;
        this.z = function10;
        super(1);
    }

    public f1(Object object0, int v, Object object1, int v1) {
        this.w = v1;
        this.y = object0;
        this.x = v;
        this.z = object1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Composition composition2;
        Composition composition1;
        float f1;
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
                int v7 = ((PagerState)this.y).getCurrentPage();
                float f = ((PagerState)this.y).getCurrentPageOffsetFraction() + ((float)(v7 - this.x));
                if(Float.compare(Math.abs(f), 1.0f) < 0) {
                    f1 = 5.0f * f;
                }
                else if(Float.compare(f, 0.0f) < 0) {
                    f1 = (f + 1.0f) * 11.0f - 5.0f;
                }
                else {
                    f1 = f > 0.0f ? (f - 1.0f) * 11.0f + 5.0f : 0.0f;
                }
                float f2 = ((GraphicsLayerScope)object0).toPx-0680j_4(f1);
                switch(ItemSliderKt.translationAnimation.1.WhenMappings.$EnumSwitchMapping$0[((Orientation)this.z).ordinal()]) {
                    case 1: {
                        ((GraphicsLayerScope)object0).setTranslationX(f2);
                        return Unit.INSTANCE;
                    }
                    case 2: {
                        ((GraphicsLayerScope)object0).setTranslationY(-f2);
                        return Unit.INSTANCE;
                    }
                    default: {
                        return Unit.INSTANCE;
                    }
                }
            }
            case 1: {
                int v8 = ((Number)object0).intValue();
                int v9 = this.x + v8;
                CharSequence charSequence0 = (CharSequence)this.y;
                if(v9 < 0 || v9 > charSequence0.length()) {
                    v9 = charSequence0.length();
                }
                CharSequence charSequence1 = charSequence0.subSequence(v8, v9);
                return ((Function1)this.z).invoke(charSequence1);
            }
            default: {
                Composition composition0 = (Composition)object0;
                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)this.y;
                int v = this.x;
                if(recomposeScopeImpl0.f == v) {
                    MutableObjectIntMap mutableObjectIntMap0 = (MutableObjectIntMap)this.z;
                    if(Intrinsics.areEqual(mutableObjectIntMap0, recomposeScopeImpl0.g) && composition0 instanceof CompositionImpl) {
                        long[] arr_v = mutableObjectIntMap0.metadata;
                        int v1 = arr_v.length - 2;
                        if(v1 >= 0) {
                            int v2 = 0;
                            while(true) {
                                long v3 = arr_v[v2];
                                if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                                    composition2 = composition0;
                                }
                                else {
                                    int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                                    int v5 = 0;
                                    while(v5 < v4) {
                                        if((0xFFL & v3) < 0x80L) {
                                            int v6 = (v2 << 3) + v5;
                                            Object object1 = mutableObjectIntMap0.keys[v6];
                                            boolean z = mutableObjectIntMap0.values[v6] != v;
                                            if(z) {
                                                ((CompositionImpl)composition0).removeObservation$runtime_release(object1, recomposeScopeImpl0);
                                                composition1 = composition0;
                                                if(object1 instanceof DerivedState) {
                                                    ((CompositionImpl)composition0).removeDerivedStateObservation$runtime_release(((DerivedState)object1));
                                                    MutableScatterMap mutableScatterMap0 = recomposeScopeImpl0.h;
                                                    if(mutableScatterMap0 != null) {
                                                        mutableScatterMap0.remove(object1);
                                                    }
                                                }
                                            }
                                            else {
                                                composition1 = composition0;
                                            }
                                            if(z) {
                                                mutableObjectIntMap0.removeValueAt(v6);
                                            }
                                        }
                                        else {
                                            composition1 = composition0;
                                        }
                                        v3 >>= 8;
                                        ++v5;
                                        composition0 = composition1;
                                    }
                                    composition2 = composition0;
                                    if(v4 != 8) {
                                        break;
                                    }
                                }
                                if(v2 == v1) {
                                    break;
                                }
                                ++v2;
                                composition0 = composition2;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }
}

