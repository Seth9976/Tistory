package com.kakao.kphotopicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.material.motion.e;
import com.kakao.kphotopicker.databinding.KphotopickerFragmentPhotoPickerBinding;
import com.kakao.kphotopicker.fastscroller.MediaScrollerViewProvider;
import com.kakao.kphotopicker.picker.Folder;
import com.kakao.kphotopicker.picker.MediaItem.Photo;
import com.kakao.kphotopicker.picker.MediaItem;
import com.kakao.kphotopicker.picker.folder.FolderAdapter;
import com.kakao.kphotopicker.picker.item.PickerAdapter;
import com.kakao.kphotopicker.picker.permission.MediaPermissionActionAdapter;
import com.kakao.kphotopicker.picker.selected.SelectedItemAdapter;
import com.kakao.kphotopicker.util.UIUtil;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import com.kakao.kphotopicker.widget.SimpleDividerItemDecoration;
import com.kakao.kphotopicker.widget.SpacesItemDecoration;
import com.kakao.kphotopicker.widget.dragselection.DragSelectReceiver;
import com.kakao.kphotopicker.widget.dragselection.DragSelectTouchListener;
import jb.b;
import jb.j;
import jb.k;
import jb.l;
import jb.m;
import jb.o;
import jb.p;
import jb.q;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u00072\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0004J\u0019\u0010\u0010\u001A\u00020\u000E2\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001F\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\r\u0010\u001E\u001A\u00020\u001A¢\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010 \u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/kakao/kphotopicker/PickerFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kakao/kphotopicker/widget/dragselection/DragSelectReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onActivityCreated", "(Landroid/os/Bundle;)V", "", "strRes", "maxCount", "showMaxCountOver", "(II)V", "getItemCount", "()I", "index", "", "selected", "setSelected", "(IZ)V", "checkIsEnableGroupImage", "()Z", "isSelected", "(I)Z", "isIndexSelectable", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerFragment.kt\ncom/kakao/kphotopicker/PickerFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,445:1\n262#2,2:446\n262#2,2:448\n260#2,4:450\n260#2:454\n*S KotlinDebug\n*F\n+ 1 PickerFragment.kt\ncom/kakao/kphotopicker/PickerFragment\n*L\n158#1:446,2\n176#1:448,2\n181#1:450,4\n104#1:454\n*E\n"})
public final class PickerFragment extends Fragment implements DragSelectReceiver {
    public PickerViewModel A;
    public Toast B;
    public final Lazy C;
    public final Lazy D;
    public final Lazy E;
    public final Lazy F;
    public final Lazy G;
    public KphotopickerFragmentPhotoPickerBinding z;

    public PickerFragment() {
        this.C = c.lazy(new o(this, 5));
        this.D = c.lazy(new o(this, 6));
        this.E = c.lazy(new o(this, 2));
        this.F = c.lazy(new o(this, 4));
        this.G = c.lazy(new p(this));
    }

    public static final void access$addMedia(PickerFragment pickerFragment0, MediaItem mediaItem0, Function0 function00) {
        PickerViewModel pickerViewModel0 = pickerFragment0.A;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        pickerViewModel0.addMediaItem(mediaItem0, new f(mediaItem0, pickerFragment0), new o(pickerFragment0, 0), function00);
    }

    public static final void access$clickEvent(PickerFragment pickerFragment0, boolean z, MediaItem mediaItem0) {
        String s;
        PickerViewModel pickerViewModel0 = pickerFragment0.A;
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
        PickerViewModel.clickEvent$default(pickerViewModel0, s, null, 2, null);
    }

    public static final KphotopickerFragmentPhotoPickerBinding access$getBinding(PickerFragment pickerFragment0) {
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = pickerFragment0.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
        return kphotopickerFragmentPhotoPickerBinding0;
    }

    public static final DragSelectTouchListener access$getDragSelectTouchListener(PickerFragment pickerFragment0) {
        return (DragSelectTouchListener)pickerFragment0.G.getValue();
    }

    public static final FolderAdapter access$getFolderAdapter(PickerFragment pickerFragment0) {
        return (FolderAdapter)pickerFragment0.E.getValue();
    }

    public static final MediaPermissionActionAdapter access$getMediaPermissionActionAdapter(PickerFragment pickerFragment0) {
        return (MediaPermissionActionAdapter)pickerFragment0.F.getValue();
    }

    public static final void access$renderSelectState(PickerFragment pickerFragment0, boolean z) {
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = pickerFragment0.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
        kphotopickerFragmentPhotoPickerBinding0.layoutPicker.announceForAccessibility(pickerFragment0.getString((z ? string.cd_picker_event_selected : string.cd_picker_event_unselected)));
    }

    public static final void access$showToast(PickerFragment pickerFragment0, String s) {
        Toast toast0 = pickerFragment0.B;
        if(toast0 != null) {
            toast0.cancel();
        }
        Toast toast1 = Toast.makeText(pickerFragment0.getActivity(), s, 0);
        pickerFragment0.B = toast1;
        if(toast1 != null) {
            toast1.show();
        }
    }

    public static final void access$toggleLayer(PickerFragment pickerFragment0, boolean z) {
        pickerFragment0.k(z);
    }

    public final boolean checkIsEnableGroupImage() {
        PickerViewModel pickerViewModel0 = this.A;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        if(pickerViewModel0.selectedItemCount() >= 14) {
            KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = this.z;
            Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
            if(kphotopickerFragmentPhotoPickerBinding0.group.isChecked()) {
                Toast.makeText(this.requireActivity(), this.getString(string.ke_group_max_count, new Object[]{"14"}), 0).show();
            }
        }
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding1 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding1);
        int v = ((SelectedItemAdapter)this.D.getValue()).getItemCount();
        kphotopickerFragmentPhotoPickerBinding1.group.setEnabled(2 <= v && v < 15);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding2 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding2);
        if(!kphotopickerFragmentPhotoPickerBinding2.group.isEnabled()) {
            KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding3 = this.z;
            Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding3);
            kphotopickerFragmentPhotoPickerBinding3.group.setChecked(false);
        }
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding4 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding4);
        return kphotopickerFragmentPhotoPickerBinding4.group.isChecked();
    }

    @Override  // com.kakao.kphotopicker.widget.dragselection.DragSelectReceiver
    public int getItemCount() {
        return this.h().getItemCount();
    }

    public final PickerAdapter h() {
        return (PickerAdapter)this.C.getValue();
    }

    public final void i(boolean z) {
        Context context0 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        int v = UIUtil.INSTANCE.dp2px(context0, 81.0f);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = kphotopickerFragmentPhotoPickerBinding0.keLayoutSelectAnimation.getLayoutParams();
        if(viewGroup$LayoutParams0 == null || viewGroup$LayoutParams0.height != 0 || z) {
            KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding1 = this.z;
            Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding1);
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = kphotopickerFragmentPhotoPickerBinding1.keLayoutSelectAnimation.getLayoutParams();
            if(viewGroup$LayoutParams1 == null || viewGroup$LayoutParams1.height != v || !z) {
                int v1 = z ? 0 : v;
                if(!z) {
                    v = 0;
                }
                ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{v1, v});
                valueAnimator0.setDuration(300L);
                valueAnimator0.setInterpolator(new LinearInterpolator());
                valueAnimator0.addUpdateListener(new e(this, 4));
                valueAnimator0.start();
            }
        }
    }

    @Override  // com.kakao.kphotopicker.widget.dragselection.DragSelectReceiver
    public boolean isIndexSelectable(int v) {
        return true;
    }

    @Override  // com.kakao.kphotopicker.widget.dragselection.DragSelectReceiver
    public boolean isSelected(int v) {
        MediaItem mediaItem0 = this.h().getItem(v);
        if(mediaItem0 != null) {
            PickerViewModel pickerViewModel0 = this.A;
            if(pickerViewModel0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                pickerViewModel0 = null;
            }
            return pickerViewModel0.isSelectedMedia(mediaItem0);
        }
        return false;
    }

    public final void j(boolean z, boolean z1) {
        if(z) {
            if(!z1) {
                this.i(true);
            }
            KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = this.z;
            Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
            kphotopickerFragmentPhotoPickerBinding0.attachPhoto.setAlpha(1.0f);
            KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding1 = this.z;
            Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding1);
            kphotopickerFragmentPhotoPickerBinding1.attachPhoto.setEnabled(true);
            return;
        }
        if(!z1) {
            this.i(false);
        }
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding2 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding2);
        kphotopickerFragmentPhotoPickerBinding2.attachPhoto.setAlpha(0.3f);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding3 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding3);
        kphotopickerFragmentPhotoPickerBinding3.attachPhoto.setEnabled(false);
    }

    public final void k(boolean z) {
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
        int v = 0;
        kphotopickerFragmentPhotoPickerBinding0.layoutPicker.setVisibility((z ? 0 : 4));
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding1 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding1);
        LinearLayout linearLayout0 = kphotopickerFragmentPhotoPickerBinding1.layoutFolder;
        if(z) {
            v = 8;
        }
        linearLayout0.setVisibility(v);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding2 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding2);
        kphotopickerFragmentPhotoPickerBinding2.iconCategoryArrow.setBackgroundResource((z ? drawable.kphotopicker_ic_category_down : drawable.kphotopicker_ic_category_up));
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding3 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding3);
        LinearLayout linearLayout1 = kphotopickerFragmentPhotoPickerBinding3.layoutCurrentFolder;
        Intrinsics.checkNotNullExpressionValue(linearLayout1, "layoutCurrentFolder");
        int v1 = string.cd_picker_change_bucket;
        PickerViewModel pickerViewModel0 = this.A;
        String s = null;
        if(pickerViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel0 = null;
        }
        Folder folder0 = (Folder)pickerViewModel0.getCurrentFolder().getValue();
        if(folder0 == null || !folder0.isAllItemsFolder()) {
            PickerViewModel pickerViewModel1 = this.A;
            if(pickerViewModel1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                pickerViewModel1 = null;
            }
            Folder folder1 = (Folder)pickerViewModel1.getCurrentFolder().getValue();
            if(folder1 != null) {
                s = folder1.getBucketName();
            }
        }
        else {
            s = this.getResources().getString(string.picker_all_view);
        }
        ContentDescriptionKt.setContentDescriptionWith(linearLayout1, v1, new Object[]{s, this.getResources().getString((z ? string.cd_picker_unfold : string.cd_picker_fold))});
    }

    @Override  // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle0) {
        super.onActivityCreated(bundle0);
        FragmentActivity fragmentActivity0 = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivity0, "requireActivity(...)");
        this.A = (PickerViewModel)new ViewModelProvider(fragmentActivity0).get(PickerViewModel.class);
        View view0 = this.getView();
        if(view0 != null) {
            view0.setFocusableInTouchMode(true);
            view0.requestFocus();
            view0.setOnKeyListener(new PickerFragment.initViews.1.1(this));
        }
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0.layoutCurrentFolder);
        Class class0 = Button.class;
        KClass kClass0 = Reflection.getOrCreateKotlinClass(class0);
        ContentDescriptionKt.applyAccessibilityInfo$default(kphotopickerFragmentPhotoPickerBinding0.layoutCurrentFolder, kClass0, null, null, null, 14, null);
        j j0 = new j(this, 0);
        kphotopickerFragmentPhotoPickerBinding0.layoutCurrentFolder.setOnClickListener(j0);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding1 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding1);
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(kphotopickerFragmentPhotoPickerBinding1.keFolder.getContext());
        kphotopickerFragmentPhotoPickerBinding1.keFolder.setLayoutManager(linearLayoutManager0);
        Context context0 = kphotopickerFragmentPhotoPickerBinding1.keFolder.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        SimpleDividerItemDecoration simpleDividerItemDecoration0 = new SimpleDividerItemDecoration(context0, 0, 0, 6, null);
        kphotopickerFragmentPhotoPickerBinding1.keFolder.addItemDecoration(simpleDividerItemDecoration0);
        FolderAdapter folderAdapter0 = (FolderAdapter)this.E.getValue();
        kphotopickerFragmentPhotoPickerBinding1.keFolder.setAdapter(folderAdapter0);
        ((FolderAdapter)this.E.getValue()).setItemClickListener(new PickerFragment.folderClickListener.1(this));
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding2 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding2);
        int v = 0;
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(kphotopickerFragmentPhotoPickerBinding2.kePickerSelected.getContext(), 0, false);
        kphotopickerFragmentPhotoPickerBinding2.kePickerSelected.setLayoutManager(linearLayoutManager1);
        Lazy lazy0 = this.D;
        SelectedItemAdapter selectedItemAdapter0 = (SelectedItemAdapter)lazy0.getValue();
        kphotopickerFragmentPhotoPickerBinding2.kePickerSelected.setAdapter(selectedItemAdapter0);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding3 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding3);
        RecyclerView recyclerView0 = kphotopickerFragmentPhotoPickerBinding3.kePickerPhotos;
        int v1 = recyclerView0.getContext().getResources().getInteger(integer.picker_photo_span_count);
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(recyclerView0.getContext(), v1);
        gridLayoutManager0.setSpanSizeLookup(new PickerFragment.initViews.5.1.1(recyclerView0, v1));
        recyclerView0.setLayoutManager(gridLayoutManager0);
        ItemAnimator recyclerView$ItemAnimator0 = recyclerView0.getItemAnimator();
        PickerViewModel pickerViewModel0 = null;
        SimpleItemAnimator simpleItemAnimator0 = recyclerView$ItemAnimator0 instanceof SimpleItemAnimator ? ((SimpleItemAnimator)recyclerView$ItemAnimator0) : null;
        if(simpleItemAnimator0 != null) {
            simpleItemAnimator0.setSupportsChangeAnimations(false);
        }
        Context context1 = recyclerView0.getContext();
        Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
        int v2 = UIUtil.INSTANCE.dp2px(context1, 3.0f);
        recyclerView0.addItemDecoration(SpacesItemDecoration.Companion.newInstance(v2, v2, v1));
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding4 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding4);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding5 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding5);
        kphotopickerFragmentPhotoPickerBinding4.fastScroll.setRecyclerView(kphotopickerFragmentPhotoPickerBinding5.kePickerPhotos);
        MediaScrollerViewProvider mediaScrollerViewProvider0 = new MediaScrollerViewProvider();
        kphotopickerFragmentPhotoPickerBinding4.fastScroll.setViewProvider(mediaScrollerViewProvider0);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding6 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding6);
        j j1 = new j(this, 1);
        kphotopickerFragmentPhotoPickerBinding6.close.setOnClickListener(j1);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding7 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding7);
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding7.attachPhoto);
        KClass kClass1 = Reflection.getOrCreateKotlinClass(class0);
        ContentDescriptionKt.applyAccessibilityInfo$default(kphotopickerFragmentPhotoPickerBinding7.attachPhoto, kClass1, null, null, null, 14, null);
        j j2 = new j(this, 2);
        kphotopickerFragmentPhotoPickerBinding7.attachPhoto.setOnClickListener(j2);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding8 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding8);
        Intrinsics.checkNotNullExpressionValue(kphotopickerFragmentPhotoPickerBinding8.edit, "edit");
        kphotopickerFragmentPhotoPickerBinding8.edit.setVisibility((GalleryPicker.INSTANCE.getPhotoEditor$kphotopicker_release() == null ? 8 : 0));
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding9 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding9);
        j j3 = new j(this, 3);
        kphotopickerFragmentPhotoPickerBinding9.edit.setOnClickListener(j3);
        this.h().setItemClickListener(new PickerFragment.pickPhotoListener.1(this));
        this.h().setCameraClickListener(new PickerFragment.pickCameraListener.1(this));
        this.h().setOnLongClickedItem(new fg.c(this, 12));
        ((SelectedItemAdapter)lazy0.getValue()).setItemClickListener(new PickerFragment.selectedItemClickListener.1(this));
        DragSelectTouchListener dragSelectTouchListener0 = (DragSelectTouchListener)this.G.getValue();
        if(dragSelectTouchListener0 != null) {
            KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding10 = this.z;
            Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding10);
            kphotopickerFragmentPhotoPickerBinding10.kePickerPhotos.addOnItemTouchListener(dragSelectTouchListener0);
        }
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding11 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding11);
        AppCompatCheckBox appCompatCheckBox0 = kphotopickerFragmentPhotoPickerBinding11.group;
        Intrinsics.checkNotNullExpressionValue(appCompatCheckBox0, "group");
        PickerViewModel pickerViewModel1 = this.A;
        if(pickerViewModel1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel1 = null;
        }
        appCompatCheckBox0.setVisibility((pickerViewModel1.getConfig().isEnableImageGrid() ? 0 : 8));
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding12 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding12);
        m m0 = new m(this, 0);
        kphotopickerFragmentPhotoPickerBinding12.group.setOnCheckedChangeListener(m0);
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding13 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding13);
        RelativeLayout relativeLayout0 = kphotopickerFragmentPhotoPickerBinding13.kePickerToolbar;
        Intrinsics.checkNotNullExpressionValue(relativeLayout0, "kePickerToolbar");
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding14 = this.z;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding14);
        Intrinsics.checkNotNullExpressionValue(kphotopickerFragmentPhotoPickerBinding14.edit, "edit");
        if(kphotopickerFragmentPhotoPickerBinding14.edit.getVisibility() != 0) {
            KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding15 = this.z;
            Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding15);
            Intrinsics.checkNotNullExpressionValue(kphotopickerFragmentPhotoPickerBinding15.group, "group");
            if(kphotopickerFragmentPhotoPickerBinding15.group.getVisibility() != 0) {
                v = 8;
            }
        }
        relativeLayout0.setVisibility(v);
        PickerViewModel pickerViewModel2 = this.A;
        if(pickerViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
            pickerViewModel2 = null;
        }
        if(pickerViewModel2.isSinglePick()) {
            KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding16 = this.z;
            Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding16);
            kphotopickerFragmentPhotoPickerBinding16.attachCount.setVisibility(8);
        }
        PickerViewModel pickerViewModel3 = this.A;
        if(pickerViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
        }
        else {
            pickerViewModel0 = pickerViewModel3;
        }
        pickerViewModel0.getFolderItemList().observe(this.getViewLifecycleOwner(), new l(this, 3));
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        pickerViewModel0.getFolderChangedEvent().observe(lifecycleOwner0, new l(this, 4));
        pickerViewModel0.getMediaItemList().observe(this.getViewLifecycleOwner(), new l(this, 5));
        pickerViewModel0.getSelectedItemCount().observe(this.getViewLifecycleOwner(), new l(this, 6));
        pickerViewModel0.isShowSelectedView().observe(this.getViewLifecycleOwner(), new k(this, pickerViewModel0, 0));
        pickerViewModel0.getSelectedMediaList().observe(this.getViewLifecycleOwner(), new k(this, pickerViewModel0, 1));
        LifecycleOwner lifecycleOwner1 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner1, "getViewLifecycleOwner(...)");
        pickerViewModel0.getMediaItemUpdateEvent().observe(lifecycleOwner1, new l(this, 0));
        pickerViewModel0.getCurrentFolder().observe(this.getViewLifecycleOwner(), new l(this, 1));
        pickerViewModel0.getEditButtonEnable().observe(this.getViewLifecycleOwner(), new l(this, 2));
        pickerViewModel0.getMediaPermissionState().observe(this.getViewLifecycleOwner(), new androidx.lifecycle.k(new q(this)));
    }

    @Override  // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        KphotopickerFragmentPhotoPickerBinding kphotopickerFragmentPhotoPickerBinding0 = KphotopickerFragmentPhotoPickerBinding.inflate(layoutInflater0, viewGroup0, false);
        this.z = kphotopickerFragmentPhotoPickerBinding0;
        Intrinsics.checkNotNull(kphotopickerFragmentPhotoPickerBinding0);
        View view0 = kphotopickerFragmentPhotoPickerBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.z = null;
    }

    @Override  // com.kakao.kphotopicker.widget.dragselection.DragSelectReceiver
    public void setSelected(int v, boolean z) {
        if(v >= 0 && v < this.h().getItemCount()) {
            PickerViewModel pickerViewModel0 = null;
            MediaItem mediaItem0 = this.h().getItem(v);
            if(mediaItem0 != null) {
                if(z) {
                    PickerViewModel pickerViewModel1 = this.A;
                    if(pickerViewModel1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                    }
                    else {
                        pickerViewModel0 = pickerViewModel1;
                    }
                    pickerViewModel0.addMediaItem(mediaItem0, new f(mediaItem0, this), new o(this, 0), b.y);
                    return;
                }
                PickerViewModel pickerViewModel2 = this.A;
                if(pickerViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pickerViewModel");
                }
                else {
                    pickerViewModel0 = pickerViewModel2;
                }
                pickerViewModel0.deleteSelectedMedia(mediaItem0);
            }
        }
    }

    public final void showMaxCountOver(int v, int v1) {
        String s = this.getString(v, new Object[]{v1});
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        Toast toast0 = this.B;
        if(toast0 != null) {
            toast0.cancel();
        }
        Toast toast1 = Toast.makeText(this.getActivity(), s, 0);
        this.B = toast1;
        if(toast1 != null) {
            toast1.show();
        }
    }
}

