package com.kakao.tistory.presentation.design.ui.thumbnail;

import a5.b;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.graph.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000F\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u000BJ\u001C\u0010\u0010\u001A\u00020\u00022\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J8\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u001A\u001A\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001D\u001A\u00020\t2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u0012R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001A\u0004\b#\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001A\u0004\b%\u0010\u0012R\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001A\u0004\b\'\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "", "", "origin", "large", "medium", "small", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "isNotBlank", "()Z", "Landroidx/compose/ui/unit/Dp;", "width", "getThumbnail-rCkNIVA", "(Landroidx/compose/ui/unit/Dp;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getThumbnail", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOrigin", "b", "getLarge", "c", "getMedium", "d", "getSmall", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nThumbnailUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailUiState.kt\ncom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,62:1\n77#2:63\n*S KotlinDebug\n*F\n+ 1 ThumbnailUiState.kt\ncom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState\n*L\n21#1:63\n*E\n"})
public final class ThumbnailUiState {
    public static final int $stable;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ThumbnailUiState(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "origin");
        Intrinsics.checkNotNullParameter(s1, "large");
        Intrinsics.checkNotNullParameter(s2, "medium");
        Intrinsics.checkNotNullParameter(s3, "small");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    @NotNull
    public final ThumbnailUiState copy(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "origin");
        Intrinsics.checkNotNullParameter(s1, "large");
        Intrinsics.checkNotNullParameter(s2, "medium");
        Intrinsics.checkNotNullParameter(s3, "small");
        return new ThumbnailUiState(s, s1, s2, s3);
    }

    public static ThumbnailUiState copy$default(ThumbnailUiState thumbnailUiState0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = thumbnailUiState0.a;
        }
        if((v & 2) != 0) {
            s1 = thumbnailUiState0.b;
        }
        if((v & 4) != 0) {
            s2 = thumbnailUiState0.c;
        }
        if((v & 8) != 0) {
            s3 = thumbnailUiState0.d;
        }
        return thumbnailUiState0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ThumbnailUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((ThumbnailUiState)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ThumbnailUiState)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((ThumbnailUiState)object0).c) ? Intrinsics.areEqual(this.d, ((ThumbnailUiState)object0).d) : false;
    }

    @NotNull
    public final String getLarge() {
        return this.b;
    }

    @NotNull
    public final String getMedium() {
        return this.c;
    }

    @NotNull
    public final String getOrigin() {
        return this.a;
    }

    @NotNull
    public final String getSmall() {
        return this.d;
    }

    @Composable
    @NotNull
    public final String getThumbnail-rCkNIVA(@Nullable Dp dp0, @Nullable Composer composer0, int v) {
        String s;
        composer0.startReplaceGroup(0xD2EE3F4B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD2EE3F4B, v, -1, "com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState.getThumbnail (ThumbnailUiState.kt:20)");
        }
        float f = dp0 == null ? 10000.0f : ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(dp0.unbox-impl());
        Logger.INSTANCE.log("thumbnail size = " + f);
        if(0.0f > f || f > 144.0f) {
            s = 145.0f > f || f > 490.0f ? this.b : this.c;
        }
        else {
            s = this.d;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return s;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + a.a(this.c, a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    // 去混淆评级： 低(40)
    public final boolean isNotBlank() {
        return !p.isBlank(this.a) && !p.isBlank(this.d) && !p.isBlank(this.c) && !p.isBlank(this.b);
    }

    @Override
    @NotNull
    public String toString() {
        return b.r(b.w("ThumbnailUiState(origin=", this.a, ", large=", this.b, ", medium="), this.c, ", small=", this.d, ")");
    }
}

