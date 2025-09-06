package com.kakao.tistory.presentation.widget.common;

import a5.b;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0006R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults;", "", "", "THROTTLE_TIME_MILLIS", "J", "ButtonColors", "CheckedButtonColors", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RoundButtonDefaults {
    @Immutable
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002\u00A2\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000BH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0004\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000BH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u001F\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\f\u001A\u00020\u000BH\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0015J\u0016\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0019\u0010\u0015J\u0016\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0015J\u0016\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0015J\u0016\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0015JO\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001A\u00020$H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010(\u001A\u00020\'H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010+\u001A\u00020\u000B2\b\u0010*\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0015R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b0\u0010.\u001A\u0004\b1\u0010\u0015R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b2\u0010.\u001A\u0004\b3\u0010\u0015R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b4\u0010.\u001A\u0004\b5\u0010\u0015R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b6\u0010.\u001A\u0004\b7\u0010\u0015R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b8\u0010.\u001A\u0004\b9\u0010\u0015\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006:"}, d2 = {"Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "borderColor", "disabledContainerColor", "disabledContentColor", "disabledBorderColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "containerColor-vNxB06k", "(Z)J", "contentColor-vNxB06k", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Brush;", "borderBrush", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "copy-tNS2XkQ", "(JJJJJJ)Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getContainerColor-0d7_KjU", "b", "getContentColor-0d7_KjU", "c", "getBorderColor-0d7_KjU", "d", "getDisabledContainerColor-0d7_KjU", "e", "getDisabledContentColor-0d7_KjU", "f", "getDisabledBorderColor-0d7_KjU", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRoundButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundButton.kt\ncom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,204:1\n1223#2,6:205\n*S KotlinDebug\n*F\n+ 1 RoundButton.kt\ncom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$ButtonColors\n*L\n170#1:205,6\n*E\n"})
    public static final class ButtonColors {
        public static final int $stable;
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;

        public ButtonColors(long v, long v1, long v2, long v3, long v4, long v5, int v6, DefaultConstructorMarker defaultConstructorMarker0) {
            long v7 = (v6 & 4) == 0 ? v2 : 0L;
            this(v, v1, v7, ((v6 & 8) == 0 ? v3 : v), ((v6 & 16) == 0 ? v4 : v1), ((v6 & 0x20) == 0 ? v5 : v7), null);
        }

        public ButtonColors(long v, long v1, long v2, long v3, long v4, long v5, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = v5;
        }

        @Composable
        @NotNull
        public final State borderBrush(boolean z, @Nullable Composer composer0, int v) {
            composer0.startReplaceGroup(-1810120700);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1810120700, v, -1, "com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors.borderBrush (RoundButton.kt:167)");
            }
            long v1 = z ? this.c : this.f;
            composer0.startReplaceGroup(0xBDD05B23);
            boolean z1 = composer0.changed(v1);
            MutableState mutableState0 = composer0.rememberedValue();
            if(z1 || mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default((Color.equals-impl0(v1, 0L) ? null : new SolidColor(v1, null)), null, 2, null);
                composer0.updateRememberedValue(mutableState0);
            }
            composer0.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return mutableState0;
        }

        public final long component1-0d7_KjU() {
            return this.a;
        }

        public final long component2-0d7_KjU() {
            return this.b;
        }

        public final long component3-0d7_KjU() {
            return this.c;
        }

        public final long component4-0d7_KjU() {
            return this.d;
        }

        public final long component5-0d7_KjU() {
            return this.e;
        }

        public final long component6-0d7_KjU() {
            return this.f;
        }

        // 去混淆评级： 低(20)
        @Stable
        public final long containerColor-vNxB06k(boolean z) {
            return z ? this.a : this.d;
        }

        // 去混淆评级： 低(20)
        @Stable
        public final long contentColor-vNxB06k(boolean z) {
            return z ? this.b : this.e;
        }

        @NotNull
        public final ButtonColors copy-tNS2XkQ(long v, long v1, long v2, long v3, long v4, long v5) {
            return new ButtonColors(v, v1, v2, v3, v4, v5, null);
        }

        public static ButtonColors copy-tNS2XkQ$default(ButtonColors roundButtonDefaults$ButtonColors0, long v, long v1, long v2, long v3, long v4, long v5, int v6, Object object0) {
            long v7 = (v6 & 1) == 0 ? v : roundButtonDefaults$ButtonColors0.a;
            long v8 = (v6 & 2) == 0 ? v1 : roundButtonDefaults$ButtonColors0.b;
            long v9 = (v6 & 4) == 0 ? v2 : roundButtonDefaults$ButtonColors0.c;
            long v10 = (v6 & 8) == 0 ? v3 : roundButtonDefaults$ButtonColors0.d;
            long v11 = (v6 & 16) == 0 ? v4 : roundButtonDefaults$ButtonColors0.e;
            return (v6 & 0x20) == 0 ? roundButtonDefaults$ButtonColors0.copy-tNS2XkQ(v7, v8, v9, v10, v11, v5) : roundButtonDefaults$ButtonColors0.copy-tNS2XkQ(v7, v8, v9, v10, v11, roundButtonDefaults$ButtonColors0.f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ButtonColors)) {
                return false;
            }
            if(!Color.equals-impl0(this.a, ((ButtonColors)object0).a)) {
                return false;
            }
            if(!Color.equals-impl0(this.b, ((ButtonColors)object0).b)) {
                return false;
            }
            if(!Color.equals-impl0(this.c, ((ButtonColors)object0).c)) {
                return false;
            }
            if(!Color.equals-impl0(this.d, ((ButtonColors)object0).d)) {
                return false;
            }
            return Color.equals-impl0(this.e, ((ButtonColors)object0).e) ? Color.equals-impl0(this.f, ((ButtonColors)object0).f) : false;
        }

        public final long getBorderColor-0d7_KjU() {
            return this.c;
        }

        public final long getContainerColor-0d7_KjU() {
            return this.a;
        }

        public final long getContentColor-0d7_KjU() {
            return this.b;
        }

        public final long getDisabledBorderColor-0d7_KjU() {
            return this.f;
        }

        public final long getDisabledContainerColor-0d7_KjU() {
            return this.d;
        }

        public final long getDisabledContentColor-0d7_KjU() {
            return this.e;
        }

        @Override
        public int hashCode() {
            return Color.hashCode-impl(this.f) + a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            String s = Color.toString-impl(this.a);
            String s1 = Color.toString-impl(this.b);
            String s2 = Color.toString-impl(this.c);
            String s3 = Color.toString-impl(this.d);
            String s4 = Color.toString-impl(this.e);
            String s5 = Color.toString-impl(this.f);
            StringBuilder stringBuilder0 = b.w("ButtonColors(containerColor=", s, ", contentColor=", s1, ", borderColor=");
            androidx.room.a.w(stringBuilder0, s2, ", disabledContainerColor=", s3, ", disabledContentColor=");
            return b.r(stringBuilder0, s4, ", disabledBorderColor=", s5, ")");
        }
    }

    @Immutable
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002\u00A2\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000BH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0004\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000BH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u001F\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\f\u001A\u00020\u000BH\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0015J\u0016\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0019\u0010\u0015J\u0016\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0015J\u0016\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0015J\u0016\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0015JO\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0002H\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001A\u00020$H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010(\u001A\u00020\'H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010+\u001A\u00020\u000B2\b\u0010*\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001D\u0010\u0003\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0015R\u001D\u0010\u0004\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b0\u0010.\u001A\u0004\b1\u0010\u0015R\u001D\u0010\u0005\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b2\u0010.\u001A\u0004\b3\u0010\u0015R\u001D\u0010\u0006\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b4\u0010.\u001A\u0004\b5\u0010\u0015R\u001D\u0010\u0007\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b6\u0010.\u001A\u0004\b7\u0010\u0015R\u001D\u0010\b\u001A\u00020\u00028\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b8\u0010.\u001A\u0004\b9\u0010\u0015\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006:"}, d2 = {"Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$CheckedButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "borderColor", "checkedContainerColor", "checkedContentColor", "checkedBorderColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "checked", "containerColor-vNxB06k", "(Z)J", "contentColor-vNxB06k", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Brush;", "borderBrush", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "copy-tNS2XkQ", "(JJJJJJ)Lcom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$CheckedButtonColors;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getContainerColor-0d7_KjU", "b", "getContentColor-0d7_KjU", "c", "getBorderColor-0d7_KjU", "d", "getCheckedContainerColor-0d7_KjU", "e", "getCheckedContentColor-0d7_KjU", "f", "getCheckedBorderColor-0d7_KjU", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRoundButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundButton.kt\ncom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$CheckedButtonColors\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,204:1\n1223#2,6:205\n*S KotlinDebug\n*F\n+ 1 RoundButton.kt\ncom/kakao/tistory/presentation/widget/common/RoundButtonDefaults$CheckedButtonColors\n*L\n197#1:205,6\n*E\n"})
    public static final class CheckedButtonColors {
        public static final int $stable;
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;

        public CheckedButtonColors(long v, long v1, long v2, long v3, long v4, long v5, int v6, DefaultConstructorMarker defaultConstructorMarker0) {
            this(v, v1, v2, ((v6 & 8) == 0 ? v3 : v), ((v6 & 16) == 0 ? v4 : v1), ((v6 & 0x20) == 0 ? v5 : v2), null);
        }

        public CheckedButtonColors(long v, long v1, long v2, long v3, long v4, long v5, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = v5;
        }

        @Composable
        @NotNull
        public final State borderBrush(boolean z, @Nullable Composer composer0, int v) {
            composer0.startReplaceGroup(-490154987);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-490154987, v, -1, "com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.CheckedButtonColors.borderBrush (RoundButton.kt:194)");
            }
            long v1 = z ? this.f : this.c;
            composer0.startReplaceGroup(0xF36856C4);
            boolean z1 = composer0.changed(v1);
            MutableState mutableState0 = composer0.rememberedValue();
            if(z1 || mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default((Color.equals-impl0(v1, 0L) ? null : new SolidColor(v1, null)), null, 2, null);
                composer0.updateRememberedValue(mutableState0);
            }
            composer0.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return mutableState0;
        }

        public final long component1-0d7_KjU() {
            return this.a;
        }

        public final long component2-0d7_KjU() {
            return this.b;
        }

        public final long component3-0d7_KjU() {
            return this.c;
        }

        public final long component4-0d7_KjU() {
            return this.d;
        }

        public final long component5-0d7_KjU() {
            return this.e;
        }

        public final long component6-0d7_KjU() {
            return this.f;
        }

        // 去混淆评级： 低(20)
        @Stable
        public final long containerColor-vNxB06k(boolean z) {
            return z ? this.d : this.a;
        }

        // 去混淆评级： 低(20)
        @Stable
        public final long contentColor-vNxB06k(boolean z) {
            return z ? this.e : this.b;
        }

        @NotNull
        public final CheckedButtonColors copy-tNS2XkQ(long v, long v1, long v2, long v3, long v4, long v5) {
            return new CheckedButtonColors(v, v1, v2, v3, v4, v5, null);
        }

        public static CheckedButtonColors copy-tNS2XkQ$default(CheckedButtonColors roundButtonDefaults$CheckedButtonColors0, long v, long v1, long v2, long v3, long v4, long v5, int v6, Object object0) {
            long v7 = (v6 & 1) == 0 ? v : roundButtonDefaults$CheckedButtonColors0.a;
            long v8 = (v6 & 2) == 0 ? v1 : roundButtonDefaults$CheckedButtonColors0.b;
            long v9 = (v6 & 4) == 0 ? v2 : roundButtonDefaults$CheckedButtonColors0.c;
            long v10 = (v6 & 8) == 0 ? v3 : roundButtonDefaults$CheckedButtonColors0.d;
            long v11 = (v6 & 16) == 0 ? v4 : roundButtonDefaults$CheckedButtonColors0.e;
            return (v6 & 0x20) == 0 ? roundButtonDefaults$CheckedButtonColors0.copy-tNS2XkQ(v7, v8, v9, v10, v11, v5) : roundButtonDefaults$CheckedButtonColors0.copy-tNS2XkQ(v7, v8, v9, v10, v11, roundButtonDefaults$CheckedButtonColors0.f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CheckedButtonColors)) {
                return false;
            }
            if(!Color.equals-impl0(this.a, ((CheckedButtonColors)object0).a)) {
                return false;
            }
            if(!Color.equals-impl0(this.b, ((CheckedButtonColors)object0).b)) {
                return false;
            }
            if(!Color.equals-impl0(this.c, ((CheckedButtonColors)object0).c)) {
                return false;
            }
            if(!Color.equals-impl0(this.d, ((CheckedButtonColors)object0).d)) {
                return false;
            }
            return Color.equals-impl0(this.e, ((CheckedButtonColors)object0).e) ? Color.equals-impl0(this.f, ((CheckedButtonColors)object0).f) : false;
        }

        public final long getBorderColor-0d7_KjU() {
            return this.c;
        }

        public final long getCheckedBorderColor-0d7_KjU() {
            return this.f;
        }

        public final long getCheckedContainerColor-0d7_KjU() {
            return this.d;
        }

        public final long getCheckedContentColor-0d7_KjU() {
            return this.e;
        }

        public final long getContainerColor-0d7_KjU() {
            return this.a;
        }

        public final long getContentColor-0d7_KjU() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Color.hashCode-impl(this.f) + a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Color.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            String s = Color.toString-impl(this.a);
            String s1 = Color.toString-impl(this.b);
            String s2 = Color.toString-impl(this.c);
            String s3 = Color.toString-impl(this.d);
            String s4 = Color.toString-impl(this.e);
            String s5 = Color.toString-impl(this.f);
            StringBuilder stringBuilder0 = b.w("CheckedButtonColors(containerColor=", s, ", contentColor=", s1, ", borderColor=");
            androidx.room.a.w(stringBuilder0, s2, ", checkedContainerColor=", s3, ", checkedContentColor=");
            return b.r(stringBuilder0, s4, ", checkedBorderColor=", s5, ")");
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final RoundButtonDefaults INSTANCE = null;
    public static final long THROTTLE_TIME_MILLIS = 500L;

    static {
        RoundButtonDefaults.INSTANCE = new RoundButtonDefaults();
    }
}

