// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.objectdetection.R;

public final class ActivityFaceRecognitionBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final Button buttonCapture;

  @NonNull
  public final ImageView imageView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-land/</li>
   * </ul>
   */
  @Nullable
  public final Button pickImage;

  @NonNull
  public final TextView tv;

  private ActivityFaceRecognitionBinding(@NonNull View rootView, @Nullable Button buttonCapture,
      @NonNull ImageView imageView, @Nullable Button pickImage, @NonNull TextView tv) {
    this.rootView = rootView;
    this.buttonCapture = buttonCapture;
    this.imageView = imageView;
    this.pickImage = pickImage;
    this.tv = tv;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFaceRecognitionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFaceRecognitionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_face_recognition, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFaceRecognitionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_capture;
      Button buttonCapture = ViewBindings.findChildViewById(rootView, id);

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.pickImage;
      Button pickImage = ViewBindings.findChildViewById(rootView, id);

      id = R.id.tv;
      TextView tv = ViewBindings.findChildViewById(rootView, id);
      if (tv == null) {
        break missingId;
      }

      return new ActivityFaceRecognitionBinding(rootView, buttonCapture, imageView, pickImage, tv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
