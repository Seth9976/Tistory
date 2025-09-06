package com.kakao.kphotopicker.preview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.material.snackbar.p;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.databinding.KphotopickerLayoutPreviewPageBinding;
import com.kakao.kphotopicker.loader.BitmapLoader;
import com.kakao.kphotopicker.picker.MediaItem.Video;
import com.kakao.kphotopicker.picker.MediaItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n4.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012!\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\'\u0010\u001C\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0018\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u001D\u0010!\u001A\u00020\t2\u000E\u0010 \u001A\n\u0012\u0004\u0012\u00020\u001F\u0018\u00010\u001E¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001A\u00020\u001F2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001A\u00020\u000F2\u0006\u0010%\u001A\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010\'R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R2\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/kakao/kphotopicker/preview/PreviewPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Lcom/kakao/kphotopicker/ItemClickListener;", "itemClickListener", "Lkotlin/Function1;", "Lcom/kakao/kphotopicker/picker/MediaItem$Video;", "Lkotlin/ParameterName;", "name", "mediaItem", "", "videoPlayButtonClick", "<init>", "(Lcom/kakao/kphotopicker/ItemClickListener;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "container", "", "position", "", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "getCount", "()I", "Landroid/view/View;", "view", "any", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "", "Lcom/kakao/kphotopicker/picker/MediaItem;", "mediaItems", "setData", "(Ljava/util/List;)V", "getMediaItem", "(I)Lcom/kakao/kphotopicker/picker/MediaItem;", "object", "getItemPosition", "(Ljava/lang/Object;)I", "c", "Lcom/kakao/kphotopicker/ItemClickListener;", "getItemClickListener", "()Lcom/kakao/kphotopicker/ItemClickListener;", "d", "Lkotlin/jvm/functions/Function1;", "getVideoPlayButtonClick", "()Lkotlin/jvm/functions/Function1;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PreviewPagerAdapter extends PagerAdapter {
    public final ItemClickListener c;
    public final Function1 d;
    public final ArrayList e;
    public final BitmapLoader f;

    public PreviewPagerAdapter(@NotNull ItemClickListener itemClickListener0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(itemClickListener0, "itemClickListener");
        Intrinsics.checkNotNullParameter(function10, "videoPlayButtonClick");
        super();
        this.c = itemClickListener0;
        this.d = function10;
        this.e = new ArrayList();
        this.f = new BitmapLoader();
    }

    public static final void access$updateImageView(PreviewPagerAdapter previewPagerAdapter0, ImageView imageView0, MediaItem mediaItem0, int v, int v1) {
        previewPagerAdapter0.f.loadPreviewImage(imageView0, mediaItem0, v, v1);
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup viewGroup0, int v, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        Intrinsics.checkNotNullParameter(object0, "any");
        viewGroup0.removeView(((View)object0));
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.e.size();
    }

    @NotNull
    public final ItemClickListener getItemClickListener() {
        return this.c;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "object");
        return -2;
    }

    @NotNull
    public final MediaItem getMediaItem(int v) {
        return (MediaItem)this.e.get(v);
    }

    @NotNull
    public final Function1 getVideoPlayButtonClick() {
        return this.d;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        MediaItem mediaItem0 = (MediaItem)this.e.get(v);
        int v1 = 0;
        KphotopickerLayoutPreviewPageBinding kphotopickerLayoutPreviewPageBinding0 = KphotopickerLayoutPreviewPageBinding.inflate(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(kphotopickerLayoutPreviewPageBinding0, "inflate(...)");
        kphotopickerLayoutPreviewPageBinding0.getRoot().setTag(v);
        n n0 = new n(this, v);
        kphotopickerLayoutPreviewPageBinding0.previewItemPhotoImage.setOnClickListener(n0);
        AppCompatImageButton appCompatImageButton0 = kphotopickerLayoutPreviewPageBinding0.videoPlayButton;
        if(!(mediaItem0 instanceof Video)) {
            v1 = 8;
        }
        appCompatImageButton0.setVisibility(v1);
        p p0 = new p(6, mediaItem0, this);
        kphotopickerLayoutPreviewPageBinding0.videoPlayButton.setOnClickListener(p0);
        viewGroup0.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final ViewGroup a;
            public final PreviewPagerAdapter b;
            public final KphotopickerLayoutPreviewPageBinding c;
            public final MediaItem d;

            {
                ViewGroup viewGroup0 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                PreviewPagerAdapter previewPagerAdapter0 = kphotopickerLayoutPreviewPageBinding0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                KphotopickerLayoutPreviewPageBinding kphotopickerLayoutPreviewPageBinding0 = mediaItem0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = viewGroup0;
                this.b = previewPagerAdapter0;
                this.c = kphotopickerLayoutPreviewPageBinding0;
                this.d = mediaItem0;
            }

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Intrinsics.checkNotNullExpressionValue(this.c.previewItemPhotoImage, "previewItemPhotoImage");
                int v = this.a.getMeasuredWidth();
                int v1 = this.a.getMeasuredHeight();
                PreviewPagerAdapter.access$updateImageView(this.b, this.c.previewItemPhotoImage, this.d, v, v1);
            }
        });
        viewGroup0.addView(kphotopickerLayoutPreviewPageBinding0.getRoot());
        FrameLayout frameLayout0 = kphotopickerLayoutPreviewPageBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayout0, "getRoot(...)");
        return frameLayout0;
    }

    @Override  // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View view0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(object0, "any");
        return Intrinsics.areEqual(view0, ((View)object0));
    }

    public final void setData(@Nullable List list0) {
        if(list0 != null && !list0.isEmpty()) {
            this.e.clear();
            this.e.addAll(list0);
            this.notifyDataSetChanged();
        }
    }
}

