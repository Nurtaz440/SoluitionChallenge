// Generated by view binder compiler. Do not edit!
package mening.dasturim.myvoiceapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mening.dasturim.myvoiceapp.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ShapeableImageView camera;

  @NonNull
  public final MaterialCardView cvPassword;

  @NonNull
  public final TextInputEditText evNatija;

  @NonNull
  public final ShapeableImageView gallery;

  @NonNull
  public final ImageView imageTv;

  @NonNull
  public final ImageView playBtn;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull ShapeableImageView camera, @NonNull MaterialCardView cvPassword,
      @NonNull TextInputEditText evNatija, @NonNull ShapeableImageView gallery,
      @NonNull ImageView imageTv, @NonNull ImageView playBtn) {
    this.rootView = rootView;
    this.camera = camera;
    this.cvPassword = cvPassword;
    this.evNatija = evNatija;
    this.gallery = gallery;
    this.imageTv = imageTv;
    this.playBtn = playBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.camera;
      ShapeableImageView camera = ViewBindings.findChildViewById(rootView, id);
      if (camera == null) {
        break missingId;
      }

      id = R.id.cv_password;
      MaterialCardView cvPassword = ViewBindings.findChildViewById(rootView, id);
      if (cvPassword == null) {
        break missingId;
      }

      id = R.id.ev_natija;
      TextInputEditText evNatija = ViewBindings.findChildViewById(rootView, id);
      if (evNatija == null) {
        break missingId;
      }

      id = R.id.gallery;
      ShapeableImageView gallery = ViewBindings.findChildViewById(rootView, id);
      if (gallery == null) {
        break missingId;
      }

      id = R.id.imageTv;
      ImageView imageTv = ViewBindings.findChildViewById(rootView, id);
      if (imageTv == null) {
        break missingId;
      }

      id = R.id.play_btn;
      ImageView playBtn = ViewBindings.findChildViewById(rootView, id);
      if (playBtn == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, camera, cvPassword, evNatija,
          gallery, imageTv, playBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
