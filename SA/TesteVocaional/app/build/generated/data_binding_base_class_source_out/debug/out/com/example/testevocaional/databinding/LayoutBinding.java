// Generated by view binder compiler. Do not edit!
package com.example.testevocaional.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.testevocaional.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView batata;

  @NonNull
  public final TextView data;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imagemCard;

  private LayoutBinding(@NonNull CardView rootView, @NonNull TextView batata,
      @NonNull TextView data, @NonNull ImageView imageView6, @NonNull ImageView imagemCard) {
    this.rootView = rootView;
    this.batata = batata;
    this.data = data;
    this.imageView6 = imageView6;
    this.imagemCard = imagemCard;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.batata;
      TextView batata = ViewBindings.findChildViewById(rootView, id);
      if (batata == null) {
        break missingId;
      }

      id = R.id.data;
      TextView data = ViewBindings.findChildViewById(rootView, id);
      if (data == null) {
        break missingId;
      }

      id = R.id.imageView6;
      ImageView imageView6 = ViewBindings.findChildViewById(rootView, id);
      if (imageView6 == null) {
        break missingId;
      }

      id = R.id.imagemCard;
      ImageView imagemCard = ViewBindings.findChildViewById(rootView, id);
      if (imagemCard == null) {
        break missingId;
      }

      return new LayoutBinding((CardView) rootView, batata, data, imageView6, imagemCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
