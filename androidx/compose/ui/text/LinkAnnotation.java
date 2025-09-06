package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001:\u0002\n\u000BR\u0016\u0010\u0005\u001A\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001A\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation;", "", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "linkInteractionListener", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "styles", "Clickable", "Url", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class LinkAnnotation {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0013R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "Landroidx/compose/ui/text/LinkAnnotation;", "", "tag", "Landroidx/compose/ui/text/TextLinkStyles;", "styles", "Landroidx/compose/ui/text/LinkInteractionListener;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTag", "b", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "c", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Clickable extends LinkAnnotation {
        public static final int $stable = 8;
        public final String a;
        public final TextLinkStyles b;
        public final LinkInteractionListener c;

        public Clickable(@NotNull String s, @Nullable TextLinkStyles textLinkStyles0, @Nullable LinkInteractionListener linkInteractionListener0) {
            super(null);
            this.a = s;
            this.b = textLinkStyles0;
            this.c = linkInteractionListener0;
        }

        public Clickable(String s, TextLinkStyles textLinkStyles0, LinkInteractionListener linkInteractionListener0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                textLinkStyles0 = null;
            }
            this(s, textLinkStyles0, linkInteractionListener0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Clickable)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Clickable)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.getStyles(), ((Clickable)object0).getStyles()) ? Intrinsics.areEqual(this.getLinkInteractionListener(), ((Clickable)object0).getLinkInteractionListener()) : false;
        }

        @Override  // androidx.compose.ui.text.LinkAnnotation
        @Nullable
        public LinkInteractionListener getLinkInteractionListener() {
            return this.c;
        }

        @Override  // androidx.compose.ui.text.LinkAnnotation
        @Nullable
        public TextLinkStyles getStyles() {
            return this.b;
        }

        @NotNull
        public final String getTag() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            TextLinkStyles textLinkStyles0 = this.getStyles();
            int v1 = 0;
            int v2 = textLinkStyles0 == null ? 0 : textLinkStyles0.hashCode();
            LinkInteractionListener linkInteractionListener0 = this.getLinkInteractionListener();
            if(linkInteractionListener0 != null) {
                v1 = linkInteractionListener0.hashCode();
            }
            return (v * 0x1F + v2) * 0x1F + v1;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("LinkAnnotation.Clickable(tag=");
            return a.b(')', this.a, stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0013R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Url;", "Landroidx/compose/ui/text/LinkAnnotation;", "", "url", "Landroidx/compose/ui/text/TextLinkStyles;", "styles", "Landroidx/compose/ui/text/LinkInteractionListener;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getUrl", "b", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "c", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Url extends LinkAnnotation {
        public static final int $stable = 8;
        public final String a;
        public final TextLinkStyles b;
        public final LinkInteractionListener c;

        public Url(@NotNull String s, @Nullable TextLinkStyles textLinkStyles0, @Nullable LinkInteractionListener linkInteractionListener0) {
            super(null);
            this.a = s;
            this.b = textLinkStyles0;
            this.c = linkInteractionListener0;
        }

        public Url(String s, TextLinkStyles textLinkStyles0, LinkInteractionListener linkInteractionListener0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                textLinkStyles0 = null;
            }
            if((v & 4) != 0) {
                linkInteractionListener0 = null;
            }
            this(s, textLinkStyles0, linkInteractionListener0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Url)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Url)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.getStyles(), ((Url)object0).getStyles()) ? Intrinsics.areEqual(this.getLinkInteractionListener(), ((Url)object0).getLinkInteractionListener()) : false;
        }

        @Override  // androidx.compose.ui.text.LinkAnnotation
        @Nullable
        public LinkInteractionListener getLinkInteractionListener() {
            return this.c;
        }

        @Override  // androidx.compose.ui.text.LinkAnnotation
        @Nullable
        public TextLinkStyles getStyles() {
            return this.b;
        }

        @NotNull
        public final String getUrl() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            TextLinkStyles textLinkStyles0 = this.getStyles();
            int v1 = 0;
            int v2 = textLinkStyles0 == null ? 0 : textLinkStyles0.hashCode();
            LinkInteractionListener linkInteractionListener0 = this.getLinkInteractionListener();
            if(linkInteractionListener0 != null) {
                v1 = linkInteractionListener0.hashCode();
            }
            return (v * 0x1F + v2) * 0x1F + v1;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("LinkAnnotation.Url(url=");
            return a.b(')', this.a, stringBuilder0);
        }
    }

    public static final int $stable;

    public LinkAnnotation(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Nullable
    public abstract LinkInteractionListener getLinkInteractionListener();

    @Nullable
    public abstract TextLinkStyles getStyles();
}

