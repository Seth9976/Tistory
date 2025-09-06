package androidx.core.view;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Predicate;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Objects;

public final class ContentInfoCompat {
    public static final class Builder {
        public final BuilderCompat a;

        public Builder(@NonNull ClipData clipData0, int v) {
            if(Build.VERSION.SDK_INT >= 0x1F) {
                this.a = new c(clipData0, v);
                return;
            }
            d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
            d0.a = clipData0;
            d0.b = v;
            this.a = d0;
        }

        public Builder(@NonNull ContentInfoCompat contentInfoCompat0) {
            if(Build.VERSION.SDK_INT >= 0x1F) {
                this.a = new c(contentInfoCompat0);
                return;
            }
            d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
            d0.a = contentInfoCompat0.getClip();
            d0.b = contentInfoCompat0.getSource();
            d0.c = contentInfoCompat0.getFlags();
            d0.d = contentInfoCompat0.getLinkUri();
            d0.e = contentInfoCompat0.getExtras();
            this.a = d0;
        }

        @NonNull
        public ContentInfoCompat build() {
            return this.a.build();
        }

        @NonNull
        public Builder setClip(@NonNull ClipData clipData0) {
            this.a.setClip(clipData0);
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle0) {
            this.a.setExtras(bundle0);
            return this;
        }

        @NonNull
        public Builder setFlags(int v) {
            this.a.setFlags(v);
            return this;
        }

        @NonNull
        public Builder setLinkUri(@Nullable Uri uri0) {
            this.a.setLinkUri(uri0);
            return this;
        }

        @NonNull
        public Builder setSource(int v) {
            this.a.setSource(v);
            return this;
        }
    }

    interface BuilderCompat {
        @NonNull
        ContentInfoCompat build();

        void setClip(@NonNull ClipData arg1);

        void setExtras(@Nullable Bundle arg1);

        void setFlags(int arg1);

        void setLinkUri(@Nullable Uri arg1);

        void setSource(int arg1);
    }

    interface Compat {
        @NonNull
        ClipData getClip();

        @Nullable
        Bundle getExtras();

        int getFlags();

        @Nullable
        Uri getLinkUri();

        int getSource();

        @Nullable
        ContentInfo getWrapped();
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    public final Compat a;

    public ContentInfoCompat(Compat contentInfoCompat$Compat0) {
        this.a = contentInfoCompat$Compat0;
    }

    public static ClipData a(ClipDescription clipDescription0, ArrayList arrayList0) {
        ClipData clipData0 = new ClipData(new ClipDescription(clipDescription0), ((ClipData.Item)arrayList0.get(0)));
        for(int v = 1; v < arrayList0.size(); ++v) {
            clipData0.addItem(((ClipData.Item)arrayList0.get(v)));
        }
        return clipData0;
    }

    public static Pair b(ClipData clipData0, Predicate predicate0) {
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        for(int v = 0; v < clipData0.getItemCount(); ++v) {
            ClipData.Item clipData$Item0 = clipData0.getItemAt(v);
            if(predicate0.test(clipData$Item0)) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                arrayList0.add(clipData$Item0);
            }
            else {
                if(arrayList1 == null) {
                    arrayList1 = new ArrayList();
                }
                arrayList1.add(clipData$Item0);
            }
        }
        if(arrayList0 == null) {
            return Pair.create(null, clipData0);
        }
        return arrayList1 == null ? Pair.create(clipData0, null) : Pair.create(ContentInfoCompat.a(clipData0.getDescription(), arrayList0), ContentInfoCompat.a(clipData0.getDescription(), arrayList1));
    }

    @NonNull
    public ClipData getClip() {
        return this.a.getClip();
    }

    @Nullable
    public Bundle getExtras() {
        return this.a.getExtras();
    }

    public int getFlags() {
        return this.a.getFlags();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.a.getLinkUri();
    }

    public int getSource() {
        return this.a.getSource();
    }

    @NonNull
    @RequiresApi(0x1F)
    public static Pair partition(@NonNull ContentInfo contentInfo0, @NonNull java.util.function.Predicate predicate0) {
        return b.a(contentInfo0, predicate0);
    }

    @NonNull
    public Pair partition(@NonNull Predicate predicate0) {
        ClipData clipData0 = this.a.getClip();
        ContentInfoCompat contentInfoCompat0 = null;
        if(clipData0.getItemCount() == 1) {
            boolean z = predicate0.test(clipData0.getItemAt(0));
            if(!z) {
                contentInfoCompat0 = this;
            }
            return Pair.create((z ? this : null), contentInfoCompat0);
        }
        Pair pair0 = ContentInfoCompat.b(clipData0, predicate0);
        if(pair0.first == null) {
            return Pair.create(null, this);
        }
        return pair0.second == null ? Pair.create(this, null) : Pair.create(new Builder(this).setClip(((ClipData)pair0.first)).build(), new Builder(this).setClip(((ClipData)pair0.second)).build());
    }

    @NonNull
    @RequiresApi(0x1F)
    public ContentInfo toContentInfo() {
        ContentInfo contentInfo0 = this.a.getWrapped();
        Objects.requireNonNull(contentInfo0);
        return contentInfo0;
    }

    @NonNull
    @RequiresApi(0x1F)
    public static ContentInfoCompat toContentInfoCompat(@NonNull ContentInfo contentInfo0) {
        return new ContentInfoCompat(new e(contentInfo0));
    }

    @Override
    @NonNull
    public String toString() {
        return this.a.toString();
    }
}

