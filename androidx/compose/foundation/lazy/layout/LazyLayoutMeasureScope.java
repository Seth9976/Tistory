package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Stable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000B\u001A\u00020\f*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0019\u0010\u000B\u001A\u00020\f*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u000B\u001A\u00020\f*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001A\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001A\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u0018J\u0016\u0010\u001B\u001A\u00020\r*\u00020\fH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001C\u0010\u001DJ\u0019\u0010\u001B\u001A\u00020\r*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001DJ\u0019\u0010\u001B\u001A\u00020\r*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001F\u0082\u0001\u0001 ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "measure", "", "Landroidx/compose/ui/layout/Placeable;", "index", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/TextUnit;", "toDp-GaN1DYA", "(J)F", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,154:1\n1#2:155\n168#3:156\n168#3:157\n482#3:158\n198#4:159\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n74#1:156\n77#1:157\n89#1:158\n96#1:159\n*E\n"})
public interface LazyLayoutMeasureScope extends MeasureScope {
    @NotNull
    List measure-0kLqBqw(int arg1, long arg2);

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    default float toDp-GaN1DYA(long v) {
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return Dp.constructor-impl(this.getFontScale() * TextUnit.getValue-impl(v));
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    default float toDp-u2uoSUM(float f) {
        return Dp.constructor-impl(f / this.getDensity());
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    default float toDp-u2uoSUM(int v) {
        return Dp.constructor-impl(((float)v) / this.getDensity());
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.unit.Density
    @Stable
    default long toDpSize-k-rfVVM(long v) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : DpKt.DpSize-YgX7TsA(this.toDp-u2uoSUM(Size.getWidth-impl(v)), this.toDp-u2uoSUM(Size.getHeight-impl(v)));
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.unit.Density
    @Stable
    default long toSize-XkaWNTQ(long v) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : SizeKt.Size(this.toPx-0680j_4(DpSize.getWidth-D9Ej5fM(v)), this.toPx-0680j_4(DpSize.getHeight-D9Ej5fM(v)));
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    @Stable
    default long toSp-0xMU5do(float f) {
        return TextUnitKt.getSp(f / this.getFontScale());
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    default long toSp-kPz2Gy4(float f) {
        float f1 = this.getFontScale();
        return TextUnitKt.getSp(f / (this.getDensity() * f1));
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    default long toSp-kPz2Gy4(int v) {
        float f = this.getFontScale();
        return TextUnitKt.getSp(((float)v) / (this.getDensity() * f));
    }
}

