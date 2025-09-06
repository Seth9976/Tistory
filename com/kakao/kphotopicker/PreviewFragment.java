package com.kakao.kphotopicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.kakao.kphotopicker.databinding.KphotopickerFragmentPhotoPreviewBinding;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem;
import com.kakao.kphotopicker.preview.PreviewPagerAdapter;
import com.kakao.kphotopicker.util.DateTimeUtil;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import jb.a0;
import jb.c0;
import jb.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J-\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\f2\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0019\u0010\u0011\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/kakao/kphotopicker/PreviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroyView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onActivityCreated", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewFragment.kt\ncom/kakao/kphotopicker/PreviewFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,301:1\n262#2,2:302\n262#2,2:304\n262#2,2:306\n262#2,2:308\n*S KotlinDebug\n*F\n+ 1 PreviewFragment.kt\ncom/kakao/kphotopicker/PreviewFragment\n*L\n64#1:302,2\n296#1:304,2\n297#1:306,2\n298#1:308,2\n*E\n"})
public final class PreviewFragment extends Fragment {
    public KphotopickerFragmentPhotoPreviewBinding A;
    public final PreviewPagerAdapter B;
    public boolean C;
    public int D;
    public int E;
    public PickerViewModel z;

    public PreviewFragment() {
        c0 c00 = new c0(this);
        this.B = new PreviewPagerAdapter(new PreviewFragment.createPreviewClickListener.1(this), c00);
    }

    public static final void access$clickEvent(PreviewFragment previewFragment0, boolean z, MediaItem mediaItem0) {
        previewFragment0.h(z, mediaItem0);
    }

    public static final void access$renderSelectState(PreviewFragment previewFragment0, MediaItem mediaItem0) {
        previewFragment0.i(mediaItem0);
    }

    public static final void access$showMaxCountOver(PreviewFragment previewFragment0, int v, int v1) {
        String s = previewFragment0.getString(v, new Object[]{v1});
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        Toast.makeText(previewFragment0.getContext(), s, 0).show();
    }

    public static final void access$showToast(PreviewFragment previewFragment0, String s) {
        Toast.makeText(previewFragment0.getContext(), s, 0).show();
    }

    public static final void access$togglePreviewLayout(PreviewFragment previewFragment0) {
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding0 = previewFragment0.A;
        if(kphotopickerFragmentPhotoPreviewBinding0 != null) {
            ViewPager viewPager0 = kphotopickerFragmentPhotoPreviewBinding0.previewViewpager;
            if(viewPager0 != null) {
                viewPager0.setSelected(!viewPager0.isSelected());
                if(viewPager0.isSelected()) {
                    viewPager0.setBackgroundColor(0xFF000000);
                }
                else {
                    viewPager0.setBackgroundColor(-1);
                }
                TextView textView0 = null;
                RelativeLayout relativeLayout0 = previewFragment0.A == null ? null : previewFragment0.A.layoutNavigation;
                int v = 8;
                if(relativeLayout0 != null) {
                    relativeLayout0.setVisibility((viewPager0.isSelected() ? 8 : 0));
                }
                RelativeLayout relativeLayout1 = previewFragment0.A == null ? null : previewFragment0.A.layoutBottomBar;
                if(relativeLayout1 != null) {
                    relativeLayout1.setVisibility((viewPager0.isSelected() || GalleryPicker.INSTANCE.getPhotoEditor$kphotopicker_release() == null ? 8 : 0));
                }
                KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding1 = previewFragment0.A;
                if(kphotopickerFragmentPhotoPreviewBinding1 != null) {
                    textView0 = kphotopickerFragmentPhotoPreviewBinding1.selectedIndex;
                }
                if(textView0 != null) {
                    if(!viewPager0.isSelected()) {
                        v = 0;
                    }
                    textView0.setVisibility(v);
                }
            }
        }
    }

    public static final void access$updateSelectIndex(PreviewFragment previewFragment0, int v) {
        previewFragment0.j(v);
    }

    public final void h(boolean z, MediaItem mediaItem0) {
        String s;
        PickerViewModel pickerViewModel0 = this.z;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        if(!z) {
            s = mediaItem0 instanceof Photo ? "unselect-image" : "unselect-video";
        }
        else if(mediaItem0 instanceof Photo) {
            s = "select-image";
        }
        else {
            s = "select-video";
        }
        pickerViewModel0.clickEvent("preview", s);
    }

    public final void i(MediaItem mediaItem0) {
        String s;
        PickerViewModel pickerViewModel0 = this.z;
        PickerViewModel pickerViewModel1 = null;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        boolean z = pickerViewModel0.isSelectedMedia(mediaItem0);
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding0 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding0 != null) {
            TextView textView0 = kphotopickerFragmentPhotoPreviewBinding0.selectedIndex;
            if(textView0 != null) {
                if(z) {
                    PickerViewModel pickerViewModel2 = this.z;
                    if(pickerViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                        pickerViewModel2 = null;
                    }
                    if(pickerViewModel2.isSinglePick()) {
                        s = "";
                    }
                    else {
                        PickerViewModel pickerViewModel3 = this.z;
                        if(pickerViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                        }
                        else {
                            pickerViewModel1 = pickerViewModel3;
                        }
                        s = String.valueOf(pickerViewModel1.getSelectionNo(mediaItem0));
                    }
                }
                else {
                    s = "";
                }
                textView0.setText(s);
                textView0.setSelected(z);
                textView0.announceForAccessibility(this.getString((z ? string.cd_picker_event_selected : string.cd_picker_event_unselected)));
            }
        }
    }

    public final void j(int v) {
        String s;
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding0 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding0 != null) {
            TextView textView0 = kphotopickerFragmentPhotoPreviewBinding0.photoIndex;
            if(textView0 != null) {
                textView0.setText(v + 1 + " / " + this.E);
                ContentDescriptionKt.setContentDescriptionWith(textView0, string.cd_picker_item_count, new Object[]{((int)(v + 1)), this.E});
            }
        }
        MediaItem mediaItem0 = this.B.getMediaItem(v);
        if(mediaItem0 == null) {
            return;
        }
        PickerViewModel pickerViewModel0 = this.z;
        PickerViewModel pickerViewModel1 = null;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        boolean z = pickerViewModel0.isSelectedMedia(mediaItem0);
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding1 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding1 != null) {
            TextView textView1 = kphotopickerFragmentPhotoPreviewBinding1.selectedIndex;
            if(textView1 != null) {
                textView1.setSelected(z);
                if(z) {
                    PickerViewModel pickerViewModel2 = this.z;
                    if(pickerViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                        pickerViewModel2 = null;
                    }
                    if(pickerViewModel2.isSinglePick()) {
                        s = "";
                    }
                    else {
                        PickerViewModel pickerViewModel3 = this.z;
                        if(pickerViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                            pickerViewModel3 = null;
                        }
                        s = String.valueOf(pickerViewModel3.getSelectionNo(mediaItem0));
                    }
                }
                else {
                    s = "";
                }
                textView1.setText(s);
            }
        }
        ImageView imageView0 = this.A == null ? null : this.A.editButton;
        if(imageView0 != null) {
            imageView0.setVisibility((mediaItem0 instanceof Photo ? 0 : 8));
        }
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding2 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding2 != null) {
            LinearLayout linearLayout0 = kphotopickerFragmentPhotoPreviewBinding2.selectedIndexWrapper;
            if(linearLayout0 != null) {
                if(z) {
                    int v1 = mediaItem0 instanceof Photo ? string.cd_photo_selected : string.cd_video_selected;
                    PickerViewModel pickerViewModel4 = this.z;
                    if(pickerViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    }
                    else {
                        pickerViewModel1 = pickerViewModel4;
                    }
                    Integer integer0 = pickerViewModel1.getSelectionNo(mediaItem0);
                    long v2 = mediaItem0.getDataTaken();
                    ContentDescriptionKt.setContentDescriptionWith(linearLayout0, v1, new Object[]{integer0, DateTimeUtil.INSTANCE.getDateTimeWithTimeStamp(v2)});
                }
                else {
                    int v3 = mediaItem0 instanceof Photo ? string.cd_photo_unselected : string.cd_video_unselected;
                    long v4 = mediaItem0.getDataTaken();
                    ContentDescriptionKt.setContentDescriptionWith(linearLayout0, v3, new Object[]{DateTimeUtil.INSTANCE.getDateTimeWithTimeStamp(v4)});
                }
                ContentDescriptionKt.applyAccessibilityInfo$default(linearLayout0, Reflection.getOrCreateKotlinClass(Button.class), null, ((int)(z ? string.cd_unselect : string.cd_select)), null, 10, null);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle0) {
        super.onActivityCreated(bundle0);
        FragmentActivity fragmentActivity0 = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivity0, "requireActivity(...)");
        this.z = (PickerViewModel)new ViewModelProvider(fragmentActivity0).get(PickerViewModel.class);
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding0 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding0 != null) {
            RelativeLayout relativeLayout0 = kphotopickerFragmentPhotoPreviewBinding0.layoutNavigation;
            if(relativeLayout0 != null) {
                relativeLayout0.bringToFront();
            }
        }
        TextView textView0 = null;
        RelativeLayout relativeLayout1 = this.A == null ? null : this.A.layoutBottomBar;
        int v = 0;
        if(relativeLayout1 != null) {
            if(GalleryPicker.INSTANCE.getPhotoEditor$kphotopicker_release() == null) {
                v = 8;
            }
            relativeLayout1.setVisibility(v);
        }
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding1 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding1 != null) {
            ImageView imageView0 = kphotopickerFragmentPhotoPreviewBinding1.editButton;
            if(imageView0 != null) {
                imageView0.setOnClickListener(new z(this, 0));
            }
        }
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding2 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding2 != null) {
            ImageView imageView1 = kphotopickerFragmentPhotoPreviewBinding2.back;
            if(imageView1 != null) {
                imageView1.setOnClickListener(new z(this, 1));
            }
        }
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding3 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding3 != null) {
            TextView textView1 = kphotopickerFragmentPhotoPreviewBinding3.attachPhotoButton;
            if(textView1 != null) {
                ContentDescriptionKt.applyAccessibilityInfo$default(textView1, Reflection.getOrCreateKotlinClass(Button.class), null, null, null, 14, null);
                textView1.setOnClickListener(new z(this, 2));
            }
        }
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding4 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding4 != null) {
            ViewPager viewPager0 = kphotopickerFragmentPhotoPreviewBinding4.previewViewpager;
            if(viewPager0 != null) {
                viewPager0.setAdapter(this.B);
                viewPager0.addOnPageChangeListener(new PreviewFragment.createPageChangeListener.1(this));
                viewPager0.setOffscreenPageLimit(1);
            }
        }
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding5 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding5 != null) {
            TextView textView2 = kphotopickerFragmentPhotoPreviewBinding5.selectedIndex;
            if(textView2 != null) {
                textView2.setOnClickListener(new z(this, 3));
            }
        }
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding6 = this.A;
        if(kphotopickerFragmentPhotoPreviewBinding6 != null) {
            TextView textView3 = kphotopickerFragmentPhotoPreviewBinding6.photoIndex;
            if(textView3 != null) {
                textView3.setText(this.D + 1 + " / " + this.E);
                ContentDescriptionKt.setContentDescriptionWith(textView3, string.cd_picker_item_count, new Object[]{this.D, this.E});
            }
        }
        PickerViewModel pickerViewModel0 = this.z;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        pickerViewModel0.getSelectedItemCount().observe(this.getViewLifecycleOwner(), new a0(this, 0));
        pickerViewModel0.getMediaItemList().observe(this.getViewLifecycleOwner(), new a0(this, 1));
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        pickerViewModel0.getMediaItemUpdateEvent().observe(lifecycleOwner0, new a0(this, 2));
        PickerViewModel pickerViewModel1 = this.z;
        if(pickerViewModel1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel1 = null;
        }
        if(pickerViewModel1.isSinglePick()) {
            KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding7 = this.A;
            if(kphotopickerFragmentPhotoPreviewBinding7 != null) {
                textView0 = kphotopickerFragmentPhotoPreviewBinding7.attachCount;
            }
            if(textView0 != null) {
                textView0.setVisibility(8);
            }
            KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding8 = this.A;
            if(kphotopickerFragmentPhotoPreviewBinding8 != null) {
                TextView textView4 = kphotopickerFragmentPhotoPreviewBinding8.selectedIndex;
                if(textView4 != null) {
                    textView4.setBackgroundResource(drawable.kphotopicker_bg_preview_check_singlepick);
                }
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        this.D = bundle1 == null ? 0 : bundle1.getInt("PREVIEW_PHOTO_INDEX", 0);
    }

    @Override  // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        KphotopickerFragmentPhotoPreviewBinding kphotopickerFragmentPhotoPreviewBinding0 = KphotopickerFragmentPhotoPreviewBinding.inflate(layoutInflater0, viewGroup0, false);
        this.A = kphotopickerFragmentPhotoPreviewBinding0;
        return kphotopickerFragmentPhotoPreviewBinding0 != null ? kphotopickerFragmentPhotoPreviewBinding0.getRoot() : null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.A = null;
        super.onDestroyView();
    }
}

