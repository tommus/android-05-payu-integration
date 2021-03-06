package co.windly.ishelf.presentation.splash;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import co.windly.ishelf.R;
import co.windly.ishelf.presentation.base.activity.BaseActivity;
import co.windly.ishelf.utility.view.ViewUtil;

public class SplashActivity extends BaseActivity<SplashView, SplashPresenter> implements SplashView {

  //region Ui

  @Override
  protected int getLayout() {
    return R.layout.activity_splash;
  }

  //endregion

  //region Presenter

  @NonNull
  @Override
  public SplashPresenter createPresenter() {
    return new SplashPresenter();
  }

  //endregion

  //region Lifecycle

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Animate logo.
    animateLogo();
  }

  //endregion

  //region Logo

  @BindView(R.id.logo)
  ImageView logoView;

  @Override
  public void animateLogo() {
    final Drawable drawable = logoView.getDrawable();
    if (drawable instanceof Animatable) {
      final Animatable animatable = (Animatable) drawable;
      animatable.start();
    }
  }

  //endregion

  //region Loading

  @BindView(R.id.loading)
  View loadingView;

  @Override
  public void showLoading(boolean flag) {
    ViewUtil.changeVisibility(loadingView, flag);
  }

  //endregion
}
