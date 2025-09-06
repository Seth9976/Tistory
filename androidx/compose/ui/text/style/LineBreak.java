package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087@\u0018\u0000 \u001D2\u00020\u0001:\u0004\u001D\u001E\u001F B!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\u0010\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0014\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0019\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0013R\u0017\u0010\u0007\u001A\u00020\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u0013\u0088\u0001!\u0092\u0001\u00020\u0011\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "strategy", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "strictness", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "wordBreak", "constructor-impl", "(III)I", "copy-gijOMQM", "(IIII)I", "copy", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "getStrategy-fcGXIks", "getStrictness-usljTpc", "getWordBreak-jp8hJ3c", "Companion", "Strategy", "Strictness", "WordBreak", "mask", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class LineBreak {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R&\u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006R&\u0010\f\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000E\u0010\b\u001A\u0004\b\r\u0010\u0006R&\u0010\u000F\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000F\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001A\u0004\b\u0010\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "Landroidx/compose/ui/text/style/LineBreak;", "Simple", "I", "getSimple-rAG3T2k", "()I", "getSimple-rAG3T2k$annotations", "()V", "Heading", "getHeading-rAG3T2k", "getHeading-rAG3T2k$annotations", "Paragraph", "getParagraph-rAG3T2k", "getParagraph-rAG3T2k$annotations", "Unspecified", "getUnspecified-rAG3T2k", "getUnspecified-rAG3T2k$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getHeading-rAG3T2k() {
            return 0x20203;
        }

        @Stable
        public static void getHeading-rAG3T2k$annotations() {
        }

        // 去混淆评级： 低(20)
        public final int getParagraph-rAG3T2k() {
            return 0x10402;
        }

        @Stable
        public static void getParagraph-rAG3T2k$annotations() {
        }

        // 去混淆评级： 低(20)
        public final int getSimple-rAG3T2k() [...] // 潜在的解密器

        @Stable
        public static void getSimple-rAG3T2k$annotations() {
        }

        public final int getUnspecified-rAG3T2k() [...] // 潜在的解密器

        @Stable
        public static void getUnspecified-rAG3T2k$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class Strategy {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "Simple", "I", "getSimple-fcGXIks", "()I", "HighQuality", "getHighQuality-fcGXIks", "Balanced", "getBalanced-fcGXIks", "Unspecified", "getUnspecified-fcGXIks", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.text.style.LineBreak.Strategy.Companion {
            public androidx.compose.ui.text.style.LineBreak.Strategy.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final int getBalanced-fcGXIks() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getHighQuality-fcGXIks() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getSimple-fcGXIks() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getUnspecified-fcGXIks() {
                return 0;
            }
        }

        @NotNull
        public static final androidx.compose.ui.text.style.LineBreak.Strategy.Companion Companion;
        public final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;

        static {
            Strategy.Companion = new androidx.compose.ui.text.style.LineBreak.Strategy.Companion(null);
            Strategy.b = 1;
            Strategy.c = 2;
            Strategy.d = 3;
            Strategy.e = 0;
        }

        public Strategy(int v) {
            this.a = v;
        }

        public static final int access$getBalanced$cp() [...] // 潜在的解密器

        public static final int access$getHighQuality$cp() [...] // 潜在的解密器

        public static final int access$getSimple$cp() [...] // 潜在的解密器

        public static final int access$getUnspecified$cp() [...] // 潜在的解密器

        public static final Strategy box-impl(int v) {
            return new Strategy(v);
        }

        public static int constructor-impl(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return Strategy.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof Strategy ? v == ((Strategy)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return Strategy.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        @NotNull
        public String toString() {
            return Strategy.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(int v) {
            if(Strategy.equals-impl0(v, 1)) {
                return "Strategy.Simple";
            }
            if(Strategy.equals-impl0(v, 2)) {
                return "Strategy.HighQuality";
            }
            if(Strategy.equals-impl0(v, 3)) {
                return "Strategy.Balanced";
            }
            return Strategy.equals-impl0(v, Strategy.e) ? "Strategy.Unspecified" : "Invalid";
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class Strictness {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "Default", "I", "getDefault-usljTpc", "()I", "Loose", "getLoose-usljTpc", "Normal", "getNormal-usljTpc", "Strict", "getStrict-usljTpc", "Unspecified", "getUnspecified-usljTpc", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.text.style.LineBreak.Strictness.Companion {
            public androidx.compose.ui.text.style.LineBreak.Strictness.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final int getDefault-usljTpc() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getLoose-usljTpc() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getNormal-usljTpc() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getStrict-usljTpc() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getUnspecified-usljTpc() {
                return 0;
            }
        }

        @NotNull
        public static final androidx.compose.ui.text.style.LineBreak.Strictness.Companion Companion;
        public final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        public static final int f;

        static {
            Strictness.Companion = new androidx.compose.ui.text.style.LineBreak.Strictness.Companion(null);
            Strictness.b = 1;
            Strictness.c = 2;
            Strictness.d = 3;
            Strictness.e = 4;
            Strictness.f = 0;
        }

        public Strictness(int v) {
            this.a = v;
        }

        public static final int access$getDefault$cp() [...] // 潜在的解密器

        public static final int access$getLoose$cp() [...] // 潜在的解密器

        public static final int access$getNormal$cp() [...] // 潜在的解密器

        public static final int access$getStrict$cp() [...] // 潜在的解密器

        public static final int access$getUnspecified$cp() [...] // 潜在的解密器

        public static final Strictness box-impl(int v) {
            return new Strictness(v);
        }

        public static int constructor-impl(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return Strictness.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof Strictness ? v == ((Strictness)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return Strictness.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        @NotNull
        public String toString() {
            return Strictness.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(int v) {
            if(Strictness.equals-impl0(v, Strictness.b)) {
                return "Strictness.None";
            }
            if(Strictness.equals-impl0(v, 2)) {
                return "Strictness.Loose";
            }
            if(Strictness.equals-impl0(v, 3)) {
                return "Strictness.Normal";
            }
            if(Strictness.equals-impl0(v, 4)) {
                return "Strictness.Strict";
            }
            return Strictness.equals-impl0(v, Strictness.f) ? "Strictness.Unspecified" : "Invalid";
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class WordBreak {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "Default", "I", "getDefault-jp8hJ3c", "()I", "Phrase", "getPhrase-jp8hJ3c", "Unspecified", "getUnspecified-jp8hJ3c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.text.style.LineBreak.WordBreak.Companion {
            public androidx.compose.ui.text.style.LineBreak.WordBreak.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final int getDefault-jp8hJ3c() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getPhrase-jp8hJ3c() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getUnspecified-jp8hJ3c() {
                return 0;
            }
        }

        @NotNull
        public static final androidx.compose.ui.text.style.LineBreak.WordBreak.Companion Companion;
        public final int a;
        public static final int b;
        public static final int c;
        public static final int d;

        static {
            WordBreak.Companion = new androidx.compose.ui.text.style.LineBreak.WordBreak.Companion(null);
            WordBreak.b = 1;
            WordBreak.c = 2;
            WordBreak.d = 0;
        }

        public WordBreak(int v) {
            this.a = v;
        }

        public static final int access$getDefault$cp() [...] // 潜在的解密器

        public static final int access$getPhrase$cp() [...] // 潜在的解密器

        public static final int access$getUnspecified$cp() [...] // 潜在的解密器

        public static final WordBreak box-impl(int v) {
            return new WordBreak(v);
        }

        public static int constructor-impl(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return WordBreak.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof WordBreak ? v == ((WordBreak)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return WordBreak.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        @NotNull
        public String toString() {
            return WordBreak.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(int v) {
            if(WordBreak.equals-impl0(v, 1)) {
                return "WordBreak.None";
            }
            if(WordBreak.equals-impl0(v, 2)) {
                return "WordBreak.Phrase";
            }
            return WordBreak.equals-impl0(v, WordBreak.d) ? "WordBreak.Unspecified" : "Invalid";
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final int b;
    public static final int c;
    public static final int d;

    // 去混淆评级： 低(48)
    static {
        LineBreak.Companion = new Companion(null);
        LineBreak.b = 0x10301;
        LineBreak.c = 0x20203;
        LineBreak.d = 0x10402;
    }

    public LineBreak(int v) {
        this.a = v;
    }

    public static final int access$getHeading$cp() [...] // 潜在的解密器

    public static final int access$getParagraph$cp() [...] // 潜在的解密器

    public static final int access$getSimple$cp() [...] // 潜在的解密器

    public static final int access$getUnspecified$cp() [...] // Inlined contents

    public static final LineBreak box-impl(int v) {
        return new LineBreak(v);
    }

    public static int constructor-impl(int v, int v1, int v2) {
        return v | v1 << 8 | v2 << 16;
    }

    public static final int copy-gijOMQM(int v, int v1, int v2, int v3) {
        return LineBreak.constructor-impl(v1, v2, v3);
    }

    public static int copy-gijOMQM$default(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v1 = LineBreak.getStrategy-fcGXIks(v);
        }
        if((v4 & 2) != 0) {
            v2 = LineBreak.getStrictness-usljTpc(v);
        }
        if((v4 & 4) != 0) {
            v3 = LineBreak.getWordBreak-jp8hJ3c(v);
        }
        return LineBreak.copy-gijOMQM(v, v1, v2, v3);
    }

    @Override
    public boolean equals(Object object0) {
        return LineBreak.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof LineBreak ? v == ((LineBreak)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public static final int getStrategy-fcGXIks(int v) {
        return v & 0xFF;
    }

    public static final int getStrictness-usljTpc(int v) {
        return v >> 8 & 0xFF;
    }

    public static final int getWordBreak-jp8hJ3c(int v) {
        return v >> 16 & 0xFF;
    }

    @Override
    public int hashCode() {
        return LineBreak.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return LineBreak.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        return "LineBreak(strategy=" + Strategy.toString-impl(LineBreak.getStrategy-fcGXIks(v)) + ", strictness=" + Strictness.toString-impl(LineBreak.getStrictness-usljTpc(v)) + ", wordBreak=" + WordBreak.toString-impl(LineBreak.getWordBreak-jp8hJ3c(v)) + ')';
    }

    public final int unbox-impl() {
        return this.a;
    }
}

